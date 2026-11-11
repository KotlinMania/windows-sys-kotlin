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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynAcceptBusConnection(JNIEnv* km_env, jclass km_clazz, jlong serverbushandle, jlong abortevent) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynCloseBusHandle(JNIEnv* km_env, jclass km_clazz, jlong bushandle) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynConnectToBus(JNIEnv* km_env, jclass km_clazz, jlong connectionspec) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynCreateBus(JNIEnv* km_env, jclass km_clazz, jint outbuffersize, jint inbuffersize, jlong lpsecurityattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynEnumEvents(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong eventtoreset, jlong eventtypes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynEventSelect(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong eventhandle, jint eventtypes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynReceiveFromBus(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong buffer, jint bytestoread, jlong bytestransferred, jlong reserved) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1allJoynSendToBus(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong buffer, jint bytestowrite, jlong bytestransferred, jlong reserved) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1qccStatusText(JNIEnv* km_env, jclass km_clazz, jint status) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataCreate(JNIEnv* km_env, jclass km_clazz, jlong defaultlanguage) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataCreateEmpty(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataCreateFull(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataCreatefrommsgarg(JNIEnv* km_env, jclass km_clazz, jlong data, jlong arg, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataCreatefromxml(JNIEnv* km_env, jclass km_clazz, jlong data, jlong aboutdataxml) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataDestroy(JNIEnv* km_env, jclass km_clazz, jlong data) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetaboutdata(JNIEnv* km_env, jclass km_clazz, jlong data, jlong msgarg, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetajsoftwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong ajsoftwareversion) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetannouncedaboutdata(JNIEnv* km_env, jclass km_clazz, jlong data, jlong msgarg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetappid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appid, jlong num) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetappname(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appname, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetdateofmanufacture(JNIEnv* km_env, jclass km_clazz, jlong data, jlong dateofmanufacture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetdefaultlanguage(JNIEnv* km_env, jclass km_clazz, jlong data, jlong defaultlanguage) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetdescription(JNIEnv* km_env, jclass km_clazz, jlong data, jlong description, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetdeviceid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong deviceid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetdevicename(JNIEnv* km_env, jclass km_clazz, jlong data, jlong devicename, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetfield(JNIEnv* km_env, jclass km_clazz, jlong data, jlong name, jlong value, jlong language) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetfields(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fields, jlong num_fields) {
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
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)fields, (uint64_t)num_fields);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fields;
    (void)num_fields;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetfieldsignature(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGethardwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong hardwareversion) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetmanufacturer(JNIEnv* km_env, jclass km_clazz, jlong data, jlong manufacturer, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetmodelnumber(JNIEnv* km_env, jclass km_clazz, jlong data, jlong modelnumber) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetsoftwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong softwareversion) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetsupportedlanguages(JNIEnv* km_env, jclass km_clazz, jlong data, jlong languagetags, jlong num) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataGetsupporturl(JNIEnv* km_env, jclass km_clazz, jlong data, jlong supporturl) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataIsfieldannounced(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataIsfieldlocalized(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataIsfieldrequired(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataIsvalid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetappid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appid, jlong num) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetappidFromstring(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetappname(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appname, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetdateofmanufacture(JNIEnv* km_env, jclass km_clazz, jlong data, jlong dateofmanufacture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetdefaultlanguage(JNIEnv* km_env, jclass km_clazz, jlong data, jlong defaultlanguage) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetdescription(JNIEnv* km_env, jclass km_clazz, jlong data, jlong description, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetdeviceid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong deviceid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetdevicename(JNIEnv* km_env, jclass km_clazz, jlong data, jlong devicename, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetfield(JNIEnv* km_env, jclass km_clazz, jlong data, jlong name, jlong value, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSethardwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong hardwareversion) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetmanufacturer(JNIEnv* km_env, jclass km_clazz, jlong data, jlong manufacturer, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetmodelnumber(JNIEnv* km_env, jclass km_clazz, jlong data, jlong modelnumber) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetsoftwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong softwareversion) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetsupportedlanguage(JNIEnv* km_env, jclass km_clazz, jlong data, jlong language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdataSetsupporturl(JNIEnv* km_env, jclass km_clazz, jlong data, jlong supporturl) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdatalistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutdatalistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonClear(JNIEnv* km_env, jclass km_clazz, jlong icon) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonCreate(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonDestroy(JNIEnv* km_env, jclass km_clazz, jlong icon) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonGetcontent(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong data, jlong size) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonGeturl(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong type, jlong url) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonSetcontent(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong type, jlong data, jlong csize, jbyte ownsdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonSetcontentFrommsgarg(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong arg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonSeturl(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong type, jlong url) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonobjCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong icon) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonobjDestroy(JNIEnv* km_env, jclass km_clazz, jlong icon) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonproxyCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong busname, jint sessionid) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonproxyDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonproxyGeticon(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong icon) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAbouticonproxyGetversion(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong version) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjAnnounce(JNIEnv* km_env, jclass km_clazz, jlong obj, jshort sessionport, jlong aboutdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjAnnounceUsingDatalistener(JNIEnv* km_env, jclass km_clazz, jlong obj, jshort sessionport, jlong aboutlistener) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jint isannounced) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjDestroy(JNIEnv* km_env, jclass km_clazz, jlong obj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjUnannounce(JNIEnv* km_env, jclass km_clazz, jlong obj) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionClear(JNIEnv* km_env, jclass km_clazz, jlong description) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionCreate(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionCreateFull(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionCreatefrommsgarg(JNIEnv* km_env, jclass km_clazz, jlong description, jlong arg) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionDestroy(JNIEnv* km_env, jclass km_clazz, jlong description) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionGetinterfacepaths(JNIEnv* km_env, jclass km_clazz, jlong description, jlong interfacename, jlong paths, jlong numpaths) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionGetinterfaces(JNIEnv* km_env, jclass km_clazz, jlong description, jlong path, jlong interfaces, jlong numinterfaces) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionGetmsgarg(JNIEnv* km_env, jclass km_clazz, jlong description, jlong msgarg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionGetpaths(JNIEnv* km_env, jclass km_clazz, jlong description, jlong paths, jlong numpaths) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionHasinterface(JNIEnv* km_env, jclass km_clazz, jlong description, jlong interfacename) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionHasinterfaceatpath(JNIEnv* km_env, jclass km_clazz, jlong description, jlong path, jlong interfacename) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutobjectdescriptionHaspath(JNIEnv* km_env, jclass km_clazz, jlong description, jlong path) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutproxyCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong busname, jint sessionid) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutproxyDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutproxyGetaboutdata(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong language, jlong data) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutproxyGetobjectdescription(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong objectdesc) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAboutproxyGetversion(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong version) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynApplicationstatelistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynApplicationstatelistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerRequestcredentialsresponse(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong authcontext, jint arg_2_accept, jlong credentials) {
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
        km_res = km_fn_ptr((int64_t)listener, (void*)(uintptr_t)authcontext, (int32_t)arg_2_accept, (int64_t)credentials);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)authcontext;
    (void)arg_2_accept;
    (void)credentials;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerSetsharedsecret(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong sharedsecret, jlong sharedsecretsize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerVerifycredentialsresponse(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong authcontext, jint arg_2_accept) {
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
        km_res = km_fn_ptr((int64_t)listener, (void*)(uintptr_t)authcontext, (int32_t)arg_2_accept);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)authcontext;
    (void)arg_2_accept;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerasyncCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAuthlistenerasyncDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerAdddestination(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jlong destination) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerAddpinggroup(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jlong listener, jint pinginterval) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerCreate(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerDestroy(JNIEnv* km_env, jclass km_clazz, jlong autopinger) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerPause(JNIEnv* km_env, jclass km_clazz, jlong autopinger) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerRemovedestination(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jlong destination, jint removeall) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerRemovepinggroup(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerResume(JNIEnv* km_env, jclass km_clazz, jlong autopinger) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynAutopingerSetpinginterval(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jint pinginterval) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentAddlogonentry(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong authmechanism, jlong username, jlong password) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentAddmatch(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong rule) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentAdvertisename(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jshort transports) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentBindsessionport(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong sessionport, jlong opts, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCanceladvertisename(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jshort transports) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCancelfindadvertisedname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCancelfindadvertisednamebytransport(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix, jshort transports) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCancelwhoimplementsInterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCancelwhoimplementsInterfaces(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterfaces, jlong numberinterfaces) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentClearkeys(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong guid) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentClearkeystore(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentConnect(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong connectspec) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCreate(JNIEnv* km_env, jclass km_clazz, jlong applicationname, jint allowremotemessages) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCreateConcurrency(JNIEnv* km_env, jclass km_clazz, jlong applicationname, jint allowremotemessages, jint concurrency) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCreateinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCreateinterfaceSecure(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong iface, jint secpolicy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentCreateinterfacesfromxml(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong xml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentDeletedefaultkeystore(JNIEnv* km_env, jclass km_clazz, jlong applicationname) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentDeleteinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentDestroy(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentDisconnect(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong unused) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentEnableconcurrentcallbacks(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentEnablepeersecurity(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong authmechanisms, jlong listener, jlong keystorefilename, jint isshared) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong authmechanisms, jlong authlistener, jlong keystorefilename, jint isshared, jlong permissionconfigurationlistener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentFindadvertisedname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentFindadvertisednamebytransport(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix, jshort transports) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetalljoyndebugobj(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetalljoynproxyobj(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetconcurrency(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetconnectspec(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetdbusproxyobj(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetglobalguidstring(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetinterfaces(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong ifaces, jlong numifaces) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetkeyexpiration(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong guid, jlong timeout) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetpeerguid(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong guid, jlong guidsz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetpermissionconfigurator(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGettimestamp(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentGetuniquename(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentIsconnected(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentIspeersecurityenabled(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentIsstarted(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentIsstopping(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentJoin(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentJoinsession(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong sessionhost, jshort sessionport, jlong listener, jlong sessionid, jlong opts) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentJoinsessionasync(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong sessionhost, jshort sessionport, jlong listener, jlong opts, jlong callback, jlong context) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentLeavesession(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentNamehasowner(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong hasowner) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentPing(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jint timeout) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRegisteraboutlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong aboutlistener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRegisterapplicationstatelistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRegisterbuslistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRegisterbusobject(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong obj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRegisterbusobjectSecure(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong obj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRegisterkeystorelistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentReleasename(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentReloadkeystore(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRemovematch(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong rule) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRemovesessionmember(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jlong membername) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentRequestname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong requestedname, jint flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSecureconnection(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jint forceauth) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSecureconnectionasync(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jint forceauth) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSetdaemondebug(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong module, jint level) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSetkeyexpiration(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong guid, jint timeout) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSetlinktimeout(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jlong linktimeout) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSetlinktimeoutasync(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jint linktimeout, jlong callback, jlong context) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentSetsessionlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentStart(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentStop(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnbindsessionport(JNIEnv* km_env, jclass km_clazz, jlong bus, jshort sessionport) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnregisteraboutlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong aboutlistener) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnregisterallaboutlisteners(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnregisterallhandlers(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnregisterapplicationstatelistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnregisterbuslistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentUnregisterbusobject(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong object) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentWhoimplementsInterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusattachmentWhoimplementsInterfaces(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterfaces, jlong numberinterfaces) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBuslistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBuslistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectAddinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectAddinterfaceAnnounced(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectAddmethodhandlers(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong entries, jlong numentries) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectCancelsessionlessmessage(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectCancelsessionlessmessageSerial(JNIEnv* km_env, jclass km_clazz, jlong bus, jint serialnumber) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectCreate(JNIEnv* km_env, jclass km_clazz, jlong path, jint isplaceholder, jlong callbacks_in, jlong context_in) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)isplaceholder, (void*)(uintptr_t)callbacks_in, (void*)(uintptr_t)context_in);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)isplaceholder;
    (void)callbacks_in;
    (void)context_in;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectDestroy(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectEmitpropertieschanged(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong ifcname, jlong propnames, jlong numprops, jint id) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectEmitpropertychanged(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong ifcname, jlong propname, jlong val, jint id) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectGetannouncedinterfacenames(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong interfaces, jlong numinterfaces) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectGetbusattachment(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectGetname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong buffer, jlong buffersz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectGetpath(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectIssecure(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectMethodreplyArgs(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg, jlong args, jlong numargs) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectMethodreplyErr(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg, jlong error, jlong errormessage) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectMethodreplyStatus(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg, jint status) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynBusobjectSetannounceflag(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface, jint isannounced) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsClear(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsCreate(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsDestroy(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsGetcertchain(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsGetexpiration(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsGetlogonentry(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsGetpassword(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsGetprivateKey(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsGetusername(JNIEnv* km_env, jclass km_clazz, jlong cred) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsIsset(JNIEnv* km_env, jclass km_clazz, jlong cred, jshort creds) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsSetcertchain(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong certchain) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsSetexpiration(JNIEnv* km_env, jclass km_clazz, jlong cred, jint expiration) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsSetlogonentry(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong logonentry) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsSetpassword(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong pwd) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsSetprivatekey(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong pk) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynCredentialsSetusername(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong username) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynGetbuildinfo(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynGetnumericversion(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynGetversion(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInit(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionActivate(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddargannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong argname, jlong name, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddmember(JNIEnv* km_env, jclass km_clazz, jlong iface, jint type, jlong name, jlong inputsig, jlong outsig, jlong argnames, jbyte annotation) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddmemberannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong name, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddmethod(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong inputsig, jlong outsig, jlong argnames, jbyte annotation, jlong accessperms) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddproperty(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong signature, jbyte access) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddpropertyannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong property, jlong name, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionAddsignal(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong sig, jlong argnames, jbyte annotation, jlong accessperms) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionEql(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong value, jlong value_size) {
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
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)value_size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetannotationatindex(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong arg_1_index, jlong name, jlong name_size, jlong value, jlong value_size) {
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
        km_fn_ptr((int64_t)iface, (uint64_t)arg_1_index, (void*)(uintptr_t)name, (void*)(uintptr_t)name_size, (void*)(uintptr_t)value, (void*)(uintptr_t)value_size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)arg_1_index;
    (void)name;
    (void)name_size;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetannotationscount(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetargdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong arg, jlong description, jlong maxlanguagelength, jlong languagetag) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong description, jlong maxlanguagelength, jlong languagetag) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetdescriptionlanguages(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong languages, jlong size) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetdescriptionlanguages2(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong languages, jlong languagessize) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetdescriptiontranslationcallback(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetmember(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong member) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetmemberannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong name, jlong value, jlong value_size) {
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
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)value_size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetmemberargannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong argname, jlong name, jlong value, jlong value_size) {
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
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)argname, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)value_size);
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
    (void)value_size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetmemberdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong description, jlong maxlanguagelength, jlong languagetag) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetmembers(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong members, jlong nummembers) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetmethod(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong member) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetname(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetproperties(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong props, jlong numprops) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetproperty(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong property) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetpropertyannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong property, jlong name, jlong value, jlong str_size) {
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
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)property, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)str_size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    (void)str_size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetpropertydescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong property, jlong description, jlong maxlanguagelength, jlong languagetag) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetsecuritypolicy(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionGetsignal(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong member) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionHasdescription(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionHasmember(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong insig, jlong outsig) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionHasproperties(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionHasproperty(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionIntrospect(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong str, jlong buf, jlong indent) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionIssecure(JNIEnv* km_env, jclass km_clazz, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetargdescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong argname, jlong description) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetargdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong arg, jlong description, jlong languagetag) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetdescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong description) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong description, jlong languagetag) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetdescriptionlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong language) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetdescriptiontranslationcallback(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong translationcallback) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetmemberdescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong description) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetmemberdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong description, jlong languagetag) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetpropertydescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong description) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynInterfacedescriptionSetpropertydescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong description, jlong languagetag) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynKeystorelistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynKeystorelistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynKeystorelistenerGetkeys(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong keystore, jlong sink, jlong sink_sz) {
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
        km_res = km_fn_ptr((int64_t)listener, (int64_t)keystore, (void*)(uintptr_t)sink, (void*)(uintptr_t)sink_sz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)keystore;
    (void)sink;
    (void)sink_sz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynKeystorelistenerPutkeys(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong keystore, jlong source, jlong password) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynKeystorelistenerWithSynchronizationCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageCreate(JNIEnv* km_env, jclass km_clazz, jlong bus) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageDescription(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong str, jlong buf) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageDestroy(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageEql(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetarg(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong argn) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetargs(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong numargs, jlong args) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetauthmechanism(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetcallserial(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetcompressiontoken(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetdestination(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGeterrorname(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong errormessage, jlong errormessage_size) {
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
        km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)errormessage_size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    (void)errormessage;
    (void)errormessage_size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetflags(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetinterface(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetmembername(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetobjectpath(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetreceiveendpointname(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetreplyserial(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetsender(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetsessionid(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGetsignature(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGettimestamp(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageGettype(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageIsbroadcastsignal(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageIsencrypted(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageIsexpired(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong tillexpirems) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageIsglobalbroadcast(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageIssessionless(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageIsunreliable(JNIEnv* km_env, jclass km_clazz, jlong msg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageParseargs(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageSetendianess(JNIEnv* km_env, jclass km_clazz, jbyte endian) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMessageTostring(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong str, jlong buf) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArrayCreate(JNIEnv* km_env, jclass km_clazz, jlong size) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArrayElement(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg_1_index) {
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
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)arg_1_index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)arg_1_index;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArrayGet(JNIEnv* km_env, jclass km_clazz, jlong args, jlong numargs, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArraySet(JNIEnv* km_env, jclass km_clazz, jlong args, jlong numargs, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArraySetOffset(JNIEnv* km_env, jclass km_clazz, jlong args, jlong argoffset, jlong numargs, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArraySignature(JNIEnv* km_env, jclass km_clazz, jlong values, jlong numvalues, jlong str, jlong buf) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargArrayTostring(JNIEnv* km_env, jclass km_clazz, jlong args, jlong numargs, jlong str, jlong buf, jlong indent) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargClear(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargClone(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargCopy(JNIEnv* km_env, jclass km_clazz, jlong source) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargCreate(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargCreateAndSet(JNIEnv* km_env, jclass km_clazz, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargDestroy(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargEqual(JNIEnv* km_env, jclass km_clazz, jlong lhv, jlong rhv) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGet(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetArrayElement(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg_1_index, jlong element) {
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
        km_fn_ptr((int64_t)arg, (uint64_t)arg_1_index, (void*)(uintptr_t)element);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)arg_1_index;
    (void)element;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetArrayElementsignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg_1_index) {
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
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)arg_1_index);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)arg;
    (void)arg_1_index;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetArrayNumberofelements(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetBool(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong b) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetBoolArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ab) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetDouble(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong d) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetDoubleArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ad) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetInt16(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong n) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetInt16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong an) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetInt32(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong i) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetInt32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ai) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetInt64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong x) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetInt64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ax) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetObjectpath(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong o) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetSignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong g) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetString(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong s) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint16(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong q) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong aq) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint32(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong u) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong au) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong t) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong at) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint8(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetUint8Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ay) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetVariant(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong v) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetVariantArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jlong length, jlong av) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetdictelement(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong elemsig, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetkey(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetmember(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg_1_index) {
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
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)arg_1_index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)arg_1_index;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetnummembers(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGettype(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargGetvalue(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargHassignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSet(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetAndStabilize(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetBool(JNIEnv* km_env, jclass km_clazz, jlong arg, jint b) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetBoolArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ab) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetDouble(JNIEnv* km_env, jclass km_clazz, jlong arg, jdouble d) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetDoubleArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ad) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetInt16(JNIEnv* km_env, jclass km_clazz, jlong arg, jshort n) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetInt16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong an) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetInt32(JNIEnv* km_env, jclass km_clazz, jlong arg, jint i) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetInt32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ai) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetInt64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong x) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetInt64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ax) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetObjectpath(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong o) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetObjectpathArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ao) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetSignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong g) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetSignatureArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ag) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetString(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong s) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetStringArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong as) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint16(JNIEnv* km_env, jclass km_clazz, jlong arg, jshort q) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong aq) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint32(JNIEnv* km_env, jclass km_clazz, jlong arg, jint u) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong au) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong t) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong at) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint8(JNIEnv* km_env, jclass km_clazz, jlong arg, jbyte y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetUint8Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ay) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetdictentry(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong key, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSetstruct(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong struct_members, jlong num_members) {
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
        km_res = km_fn_ptr((int64_t)arg, (int64_t)struct_members, (uint64_t)num_members);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)struct_members;
    (void)num_members;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargSignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong str, jlong buf) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargStabilize(JNIEnv* km_env, jclass km_clazz, jlong arg) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynMsgargTostring(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong str, jlong buf, jlong indent) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong mandatoryinterfaces, jlong nummandatoryinterfaces) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverDestroy(JNIEnv* km_env, jclass km_clazz, jlong observer) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverGet(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong uniquebusname, jlong objectpath) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverGetfirst(JNIEnv* km_env, jclass km_clazz, jlong observer) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverGetnext(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong proxyref) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverRegisterlistener(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong listener, jint triggeronexisting) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverUnregisteralllisteners(JNIEnv* km_env, jclass km_clazz, jlong observer) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverUnregisterlistener(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong listener) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynObserverlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPasswordmanagerSetcredentials(JNIEnv* km_env, jclass km_clazz, jlong authmechanism, jlong password) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfigurationlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfigurationlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorCertificatechainDestroy(JNIEnv* km_env, jclass km_clazz, jlong certificatechain) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorCertificateidCleanup(JNIEnv* km_env, jclass km_clazz, jlong certificateid) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorCertificateidarrayCleanup(JNIEnv* km_env, jclass km_clazz, jlong certificateidarray) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorClaim(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong cakey, jlong identitycertificatechain, jlong groupid, jlong groupsize, jlong groupauthority, jlong manifestsxmls, jlong manifestscount) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorEndmanagement(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetapplicationstate(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetclaimcapabilities(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong claimcapabilities) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong additionalinfo) {
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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetdefaultclaimcapabilities(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetdefaultpolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong policyxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetidentity(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong identitycertificatechain) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetidentitycertificateid(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong certificateid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetmanifests(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifestarray) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetmanifesttemplate(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifesttemplatexml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetmembershipsummaries(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong certificateids) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetpolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong policyxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorGetpublickey(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong publickey) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorInstallmanifests(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifestsxmls, jlong manifestscount, jint append) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorInstallmembership(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong membershipcertificatechain) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorManifestarrayCleanup(JNIEnv* km_env, jclass km_clazz, jlong manifestarray) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorManifesttemplateDestroy(JNIEnv* km_env, jclass km_clazz, jlong manifesttemplatexml) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorPolicyDestroy(JNIEnv* km_env, jclass km_clazz, jlong policyxml) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorPublickeyDestroy(JNIEnv* km_env, jclass km_clazz, jlong publickey) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorRemovemembership(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong serial, jlong seriallen, jlong issuerpublickey, jlong issueraki, jlong issuerakilen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorReset(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorResetpolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorSetapplicationstate(JNIEnv* km_env, jclass km_clazz, jlong configurator, jint state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorSetclaimcapabilities(JNIEnv* km_env, jclass km_clazz, jlong configurator, jshort claimcapabilities) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(JNIEnv* km_env, jclass km_clazz, jlong configurator, jshort additionalinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorSetmanifesttemplatefromxml(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifesttemplatexml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorStartmanagement(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorUpdateidentity(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong identitycertificatechain, jlong manifestsxmls, jlong manifestscount) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPermissionconfiguratorUpdatepolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong policyxml) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPinglistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynPinglistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectAddchild(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong child) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectAddinterface(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectAddinterfaceByName(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong name) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectCopy(JNIEnv* km_env, jclass km_clazz, jlong source) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong service, jlong path, jint sessionid) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectCreateSecure(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong service, jlong path, jint sessionid) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectEnablepropertycaching(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetallproperties(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong values) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetallpropertiesasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong callback, jint timeout, jlong context) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetchild(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong path) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetchildren(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong children, jlong numchildren) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetinterface(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetinterfaces(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifaces, jlong numifaces) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetpath(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetproperty(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetpropertyasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong callback, jint timeout, jlong context) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetservicename(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetsessionid(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectGetuniquename(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectImplementsinterface(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectIntrospectremoteobject(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectIntrospectremoteobjectasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong callback, jlong context) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectIssecure(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectIsvalid(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectMethodcall(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifacename, jlong methodname, jlong args, jlong numargs, jlong replymsg, jint timeout, jbyte flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectMethodcallNoreply(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifacename, jlong methodname, jlong args, jlong numargs, jbyte flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectMethodcallasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifacename, jlong methodname, jlong replyfunc, jlong args, jlong numargs, jlong context, jint timeout, jbyte flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectParsexml(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong xml, jlong identifier) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectRefCreate(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectRefDecref(JNIEnv* km_env, jclass km_clazz, jlong ref) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectRefGet(JNIEnv* km_env, jclass km_clazz, jlong ref) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectRefIncref(JNIEnv* km_env, jclass km_clazz, jlong ref) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectRegisterpropertieschangedlistener(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong properties, jlong numproperties, jlong callback, jlong context) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectRemovechild(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectSecureconnection(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jint forceauth) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectSecureconnectionasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jint forceauth) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectSetproperty(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong value) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectSetpropertyasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong value, jlong callback, jint timeout, jlong context) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynProxybusobjectUnregisterpropertieschangedlistener(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong callback) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynRouterinit(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynRouterinitwithconfig(JNIEnv* km_env, jclass km_clazz, jlong configxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynRoutershutdown(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyClaim(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong cakey, jlong identitycertificatechain, jlong groupid, jlong groupsize, jlong groupauthority, jlong manifestsxmls, jlong manifestscount) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyComputemanifestdigest(JNIEnv* km_env, jclass km_clazz, jlong unsignedmanifestxml, jlong identitycertificatepem, jlong digest, jlong digestsize) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong appbusname, jint sessionid) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyDigestDestroy(JNIEnv* km_env, jclass km_clazz, jlong digest) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyEccpublickeyDestroy(JNIEnv* km_env, jclass km_clazz, jlong eccpublickey) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyEndmanagement(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetapplicationstate(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong applicationstate) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetclaimcapabilities(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong capabilities) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong additionalinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetdefaultpolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong policyxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGeteccpublickey(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong eccpublickey) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetmanifesttemplate(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong manifesttemplatexml) {
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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyGetpolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong policyxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyInstallmembership(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong membershipcertificatechain) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyManifestDestroy(JNIEnv* km_env, jclass km_clazz, jlong signedmanifestxml) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyManifesttemplateDestroy(JNIEnv* km_env, jclass km_clazz, jlong manifesttemplatexml) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyPolicyDestroy(JNIEnv* km_env, jclass km_clazz, jlong policyxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyReset(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyResetpolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxySetmanifestsignature(JNIEnv* km_env, jclass km_clazz, jlong unsignedmanifestxml, jlong identitycertificatepem, jlong signature, jlong signaturesize, jlong signedmanifestxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxySignmanifest(JNIEnv* km_env, jclass km_clazz, jlong unsignedmanifestxml, jlong identitycertificatepem, jlong signingprivatekeypem, jlong signedmanifestxml) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyStartmanagement(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyUpdateidentity(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong identitycertificatechain, jlong manifestsxmls, jlong manifestscount) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSecurityapplicationproxyUpdatepolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong policyxml) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsCmp(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsCreate(JNIEnv* km_env, jclass km_clazz, jbyte traffic, jint ismultipoint, jbyte proximity, jshort transports) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsDestroy(JNIEnv* km_env, jclass km_clazz, jlong opts) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsGetMultipoint(JNIEnv* km_env, jclass km_clazz, jlong opts) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsGetProximity(JNIEnv* km_env, jclass km_clazz, jlong opts) {
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

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsGetTraffic(JNIEnv* km_env, jclass km_clazz, jlong opts) {
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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsGetTransports(JNIEnv* km_env, jclass km_clazz, jlong opts) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsIscompatible(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsSetMultipoint(JNIEnv* km_env, jclass km_clazz, jlong opts, jint ismultipoint) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsSetProximity(JNIEnv* km_env, jclass km_clazz, jlong opts, jbyte proximity) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsSetTraffic(JNIEnv* km_env, jclass km_clazz, jlong opts, jbyte traffic) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionoptsSetTransports(JNIEnv* km_env, jclass km_clazz, jlong opts, jshort transports) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionportlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynSessionportlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynShutdown(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynUnityDeferredCallbacksProcess(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssys_1windows_1win32_1devices_1alljoyn_1alljoynUnitySetDeferredCallbackMainthreadOnly(JNIEnv* km_env, jclass km_clazz, jint mainthread_only) {
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
        km_fn_ptr((int32_t)mainthread_only);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mainthread_only;
    errno = ENOSYS;
#endif
}

