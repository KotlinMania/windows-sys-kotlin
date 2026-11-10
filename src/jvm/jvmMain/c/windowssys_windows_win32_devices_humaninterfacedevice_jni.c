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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1directInput8Create(JNIEnv* km_env, jclass km_clazz, jlong hinst, jint dwversion, jlong riidltf, jlong ppvout, jlong punkouter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dinput8.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DirectInput8Create");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinst, (uint32_t)dwversion, (void*)(uintptr_t)riidltf, (void*)(uintptr_t)ppvout, (void*)(uintptr_t)punkouter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)dwversion;
    (void)riidltf;
    (void)ppvout;
    (void)punkouter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDFlushQueue(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_FlushQueue");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDFreePreparsedData(JNIEnv* km_env, jclass km_clazz, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_FreePreparsedData");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)preparseddata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetAttributes(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong attributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetAttributes");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)attributes);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)attributes;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetConfiguration(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong configuration, jint configurationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetConfiguration");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)configuration, (uint32_t)configurationlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetFeature(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong reportbuffer, jint reportbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetFeature");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)reportbuffer, (uint32_t)reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetHidGuid(JNIEnv* km_env, jclass km_clazz, jlong hidguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetHidGuid");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hidguid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hidguid;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetIndexedString(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jint stringindex, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetIndexedString");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (uint32_t)stringindex, (void*)(uintptr_t)buffer, (uint32_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)stringindex;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetInputReport(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong reportbuffer, jint reportbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetInputReport");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)reportbuffer, (uint32_t)reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetManufacturerString(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetManufacturerString");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)buffer, (uint32_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetMsGenreDescriptor(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetMsGenreDescriptor");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)buffer, (uint32_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetNumInputBuffers(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong numberbuffers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetNumInputBuffers");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)numberbuffers);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetPhysicalDescriptor(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetPhysicalDescriptor");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)buffer, (uint32_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetPreparsedData(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetPreparsedData");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)preparseddata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetProductString(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetProductString");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)buffer, (uint32_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDGetSerialNumberString(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetSerialNumberString");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)buffer, (uint32_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDSetConfiguration(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong configuration, jint configurationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetConfiguration");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)configuration, (uint32_t)configurationlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDSetFeature(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong reportbuffer, jint reportbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetFeature");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)reportbuffer, (uint32_t)reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDSetNumInputBuffers(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jint numberbuffers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetNumInputBuffers");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (uint32_t)numberbuffers);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidDSetOutputReport(JNIEnv* km_env, jclass km_clazz, jlong hiddeviceobject, jlong reportbuffer, jint reportbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetOutputReport");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hiddeviceobject, (void*)(uintptr_t)reportbuffer, (uint32_t)reportbufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetButtonArray(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong buttondata, jlong buttondatalength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetButtonArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)buttondata, (void*)(uintptr_t)buttondatalength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttondata;
    (void)buttondatalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetButtonCaps(JNIEnv* km_env, jclass km_clazz, jint reporttype, jlong buttoncaps, jlong buttoncapslength, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetButtonCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (void*)(uintptr_t)buttoncaps, (void*)(uintptr_t)buttoncapslength, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetCaps(JNIEnv* km_env, jclass km_clazz, jlong preparseddata, jlong capabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)preparseddata, (void*)(uintptr_t)capabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)preparseddata;
    (void)capabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetData(JNIEnv* km_env, jclass km_clazz, jint reporttype, jlong datalist, jlong datalength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (void*)(uintptr_t)datalist, (void*)(uintptr_t)datalength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetExtendedAttributes(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort dataindex, jlong preparseddata, jlong attributes, jlong lengthattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetExtendedAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)dataindex, (int64_t)preparseddata, (void*)(uintptr_t)attributes, (void*)(uintptr_t)lengthattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)dataindex;
    (void)preparseddata;
    (void)attributes;
    (void)lengthattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetLinkCollectionNodes(JNIEnv* km_env, jclass km_clazz, jlong linkcollectionnodes, jlong linkcollectionnodeslength, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetLinkCollectionNodes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)linkcollectionnodes, (void*)(uintptr_t)linkcollectionnodeslength, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)linkcollectionnodes;
    (void)linkcollectionnodeslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetScaledUsageValue(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong usagevalue, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetScaledUsageValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)usagevalue, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetSpecificButtonCaps(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong buttoncaps, jlong buttoncapslength, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetSpecificButtonCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)buttoncaps, (void*)(uintptr_t)buttoncapslength, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetSpecificValueCaps(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong valuecaps, jlong valuecapslength, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetSpecificValueCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)valuecaps, (void*)(uintptr_t)valuecapslength, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetUsageValue(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong usagevalue, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsageValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)usagevalue, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetUsageValueArray(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong usagevalue, jshort usagevaluebytelength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsageValueArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)usagevalue, (uint16_t)usagevaluebytelength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)usagevaluebytelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetUsages(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jlong usagelist, jlong usagelength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (void*)(uintptr_t)usagelist, (void*)(uintptr_t)usagelength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetUsagesEx(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort linkcollection, jlong buttonlist, jlong usagelength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsagesEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)linkcollection, (void*)(uintptr_t)buttonlist, (void*)(uintptr_t)usagelength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)linkcollection;
    (void)buttonlist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPGetValueCaps(JNIEnv* km_env, jclass km_clazz, jint reporttype, jlong valuecaps, jlong valuecapslength, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetValueCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (void*)(uintptr_t)valuecaps, (void*)(uintptr_t)valuecapslength, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPInitializeReportForId(JNIEnv* km_env, jclass km_clazz, jint reporttype, jbyte reportid, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint8_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_InitializeReportForID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint8_t)reportid, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)reportid;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPMaxDataListLength(JNIEnv* km_env, jclass km_clazz, jint reporttype, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_MaxDataListLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reporttype;
    (void)preparseddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPMaxUsageListLength(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jlong preparseddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_MaxUsageListLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (int64_t)preparseddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)preparseddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPSetButtonArray(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong buttondata, jshort buttondatalength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetButtonArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)buttondata, (uint16_t)buttondatalength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttondata;
    (void)buttondatalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPSetData(JNIEnv* km_env, jclass km_clazz, jint reporttype, jlong datalist, jlong datalength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (void*)(uintptr_t)datalist, (void*)(uintptr_t)datalength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPSetScaledUsageValue(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jint usagevalue, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, int32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetScaledUsageValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (int32_t)usagevalue, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPSetUsageValue(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jint usagevalue, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetUsageValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (uint32_t)usagevalue, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPSetUsageValueArray(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jshort usage, jlong usagevalue, jshort usagevaluebytelength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetUsageValueArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (uint16_t)usage, (void*)(uintptr_t)usagevalue, (uint16_t)usagevaluebytelength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)usagevaluebytelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPSetUsages(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jlong usagelist, jlong usagelength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetUsages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (void*)(uintptr_t)usagelist, (void*)(uintptr_t)usagelength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPTranslateUsagesToI8042ScanCodes(JNIEnv* km_env, jclass km_clazz, jlong changedusagelist, jint usagelistlength, jint keyaction, jlong modifierstate, jlong insertcodesprocedure, jlong insertcodescontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_TranslateUsagesToI8042ScanCodes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)changedusagelist, (uint32_t)usagelistlength, (int32_t)keyaction, (void*)(uintptr_t)modifierstate, (void*)(uintptr_t)insertcodesprocedure, (void*)(uintptr_t)insertcodescontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)changedusagelist;
    (void)usagelistlength;
    (void)keyaction;
    (void)modifierstate;
    (void)insertcodesprocedure;
    (void)insertcodescontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPUnsetUsages(JNIEnv* km_env, jclass km_clazz, jint reporttype, jshort usagepage, jshort linkcollection, jlong usagelist, jlong usagelength, jlong preparseddata, jlong report, jint reportlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_UnsetUsages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reporttype, (uint16_t)usagepage, (uint16_t)linkcollection, (void*)(uintptr_t)usagelist, (void*)(uintptr_t)usagelength, (int64_t)preparseddata, (void*)(uintptr_t)report, (uint32_t)reportlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1hidPUsageListDifference(JNIEnv* km_env, jclass km_clazz, jlong previoususagelist, jlong currentusagelist, jlong breakusagelist, jlong makeusagelist, jint usagelistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_UsageListDifference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)previoususagelist, (void*)(uintptr_t)currentusagelist, (void*)(uintptr_t)breakusagelist, (void*)(uintptr_t)makeusagelist, (uint32_t)usagelistlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)previoususagelist;
    (void)currentusagelist;
    (void)breakusagelist;
    (void)makeusagelist;
    (void)usagelistlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_humaninterfacedevice_WindowsWin32DevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1win32_1devices_1humaninterfacedevice_1joyConfigChanged(JNIEnv* km_env, jclass km_clazz, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyConfigChanged");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

