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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlDrainNonVolatileFlush(JNIEnv* km_env, jclass km_clazz, jlong nvtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDrainNonVolatileFlush");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvtoken);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvtoken;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlFillNonVolatileMemory(JNIEnv* km_env, jclass km_clazz, jlong nvtoken, jlong nvdestination, jlong size, jbyte value, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFillNonVolatileMemory");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvtoken, (void*)(uintptr_t)nvdestination, (uint64_t)size, (uint8_t)value, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvtoken;
    (void)nvdestination;
    (void)size;
    (void)value;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlFlushNonVolatileMemory(JNIEnv* km_env, jclass km_clazz, jlong nvtoken, jlong nvbuffer, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFlushNonVolatileMemory");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvtoken, (void*)(uintptr_t)nvbuffer, (uint64_t)size, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvtoken;
    (void)nvbuffer;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlFlushNonVolatileMemoryRanges(JNIEnv* km_env, jclass km_clazz, jlong nvtoken, jlong nvranges, jlong numranges, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFlushNonVolatileMemoryRanges");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvtoken, (void*)(uintptr_t)nvranges, (uint64_t)numranges, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvtoken;
    (void)nvranges;
    (void)numranges;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlFreeNonVolatileToken(JNIEnv* km_env, jclass km_clazz, jlong nvtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeNonVolatileToken");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvtoken);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvtoken;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlGetNonVolatileToken(JNIEnv* km_env, jclass km_clazz, jlong nvbuffer, jlong size, jlong nvtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetNonVolatileToken");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvbuffer, (uint64_t)size, (void*)(uintptr_t)nvtoken);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvbuffer;
    (void)size;
    (void)nvtoken;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_nonvolatile_WindowsWin32SystemMemoryNonvolatileJniBridge_windowssys_1windows_1win32_1system_1memory_1nonvolatile_1rtlWriteNonVolatileMemory(JNIEnv* km_env, jclass km_clazz, jlong nvtoken, jlong nvdestination, jlong source, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlWriteNonVolatileMemory");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nvtoken, (void*)(uintptr_t)nvdestination, (void*)(uintptr_t)source, (uint64_t)size, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nvtoken;
    (void)nvdestination;
    (void)source;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

