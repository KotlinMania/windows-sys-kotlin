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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreateAllocator(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong allocatorframing, jlong allocatorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateAllocator");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)allocatorframing, (void*)(uintptr_t)allocatorhandle) : 0;
#else
    (void)connectionhandle;
    (void)allocatorframing;
    (void)allocatorhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreateAllocator2(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong allocatorframing, jlong allocatorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateAllocator2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)allocatorframing, (void*)(uintptr_t)allocatorhandle) : -1;
#else
    (void)connectionhandle;
    (void)allocatorframing;
    (void)allocatorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreateClock(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong clockcreate, jlong clockhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateClock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)clockcreate, (void*)(uintptr_t)clockhandle) : 0;
#else
    (void)connectionhandle;
    (void)clockcreate;
    (void)clockhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreateClock2(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong clockcreate, jlong clockhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateClock2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)clockcreate, (void*)(uintptr_t)clockhandle) : -1;
#else
    (void)connectionhandle;
    (void)clockcreate;
    (void)clockhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreatePin(JNIEnv* km_env, jclass km_clazz, jlong filterhandle, jlong arg_1_connect, jint desiredaccess, jlong connectionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreatePin");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filterhandle, (void*)(uintptr_t)arg_1_connect, (uint32_t)desiredaccess, (void*)(uintptr_t)connectionhandle) : 0;
#else
    (void)filterhandle;
    (void)arg_1_connect;
    (void)desiredaccess;
    (void)connectionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreatePin2(JNIEnv* km_env, jclass km_clazz, jlong filterhandle, jlong arg_1_connect, jint desiredaccess, jlong connectionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreatePin2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filterhandle, (void*)(uintptr_t)arg_1_connect, (uint32_t)desiredaccess, (void*)(uintptr_t)connectionhandle) : -1;
#else
    (void)filterhandle;
    (void)arg_1_connect;
    (void)desiredaccess;
    (void)connectionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreateTopologyNode(JNIEnv* km_env, jclass km_clazz, jlong parenthandle, jlong nodecreate, jint desiredaccess, jlong nodehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateTopologyNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parenthandle, (void*)(uintptr_t)nodecreate, (uint32_t)desiredaccess, (void*)(uintptr_t)nodehandle) : 0;
#else
    (void)parenthandle;
    (void)nodecreate;
    (void)desiredaccess;
    (void)nodehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksCreateTopologyNode2(JNIEnv* km_env, jclass km_clazz, jlong parenthandle, jlong nodecreate, jint desiredaccess, jlong nodehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateTopologyNode2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parenthandle, (void*)(uintptr_t)nodecreate, (uint32_t)desiredaccess, (void*)(uintptr_t)nodehandle) : -1;
#else
    (void)parenthandle;
    (void)nodecreate;
    (void)desiredaccess;
    (void)nodehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksGetMediaTypeCount(JNIEnv* km_env, jclass km_clazz, jlong filterhandle, jint pinfactoryid, jlong mediatypecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsGetMediaTypeCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filterhandle, (uint32_t)pinfactoryid, (void*)(uintptr_t)mediatypecount) : -1;
#else
    (void)filterhandle;
    (void)pinfactoryid;
    (void)mediatypecount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksGetMultiplePinFactoryItems(JNIEnv* km_env, jclass km_clazz, jlong filterhandle, jint pinfactoryid, jint propertyid, jlong items) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsGetMultiplePinFactoryItems");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filterhandle, (uint32_t)pinfactoryid, (uint32_t)propertyid, (void*)(uintptr_t)items) : -1;
#else
    (void)filterhandle;
    (void)pinfactoryid;
    (void)propertyid;
    (void)items;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksOpenDefaultDevice(JNIEnv* km_env, jclass km_clazz, jlong category, jint access, jlong devicehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsOpenDefaultDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)category, (uint32_t)access, (void*)(uintptr_t)devicehandle) : -1;
#else
    (void)category;
    (void)access;
    (void)devicehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksResolveRequiredAttributes(JNIEnv* km_env, jclass km_clazz, jlong datarange, jlong attributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsResolveRequiredAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)datarange, (void*)(uintptr_t)attributes) : -1;
#else
    (void)datarange;
    (void)attributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_kernelstreaming_WindowsWin32MediaKernelstreamingJniBridge_windowssys_1windows_1win32_1media_1kernelstreaming_1ksSynchronousDeviceControl(JNIEnv* km_env, jclass km_clazz, jlong handle, jint iocontrol, jlong inbuffer, jint inlength, jlong outbuffer, jint outlength, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsSynchronousDeviceControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)iocontrol, (void*)(uintptr_t)inbuffer, (uint32_t)inlength, (void*)(uintptr_t)outbuffer, (uint32_t)outlength, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)handle;
    (void)iocontrol;
    (void)inbuffer;
    (void)inlength;
    (void)outbuffer;
    (void)outlength;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

