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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1bindIoCompletionCallback(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong function, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindIoCompletionCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)function, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)function;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1cancelIo(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1cancelIoEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1cancelSynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong hthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelSynchronousIo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1createIoCompletionPort(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong existingcompletionport, jlong completionkey, jint numberofconcurrentthreads) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIoCompletionPort");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)existingcompletionport, (uint64_t)completionkey, (uint32_t)numberofconcurrentthreads);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filehandle;
    (void)existingcompletionport;
    (void)completionkey;
    (void)numberofconcurrentthreads;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1deviceIoControl(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwiocontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeviceIoControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwiocontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdevice;
    (void)dwiocontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1getOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpoverlapped, jlong lpnumberofbytestransferred, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOverlappedResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpnumberofbytestransferred, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1getOverlappedResultEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpoverlapped, jlong lpnumberofbytestransferred, jint dwmilliseconds, jint balertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOverlappedResultEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpnumberofbytestransferred, (uint32_t)dwmilliseconds, (int32_t)balertable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1getQueuedCompletionStatus(JNIEnv* km_env, jclass km_clazz, jlong completionport, jlong lpnumberofbytestransferred, jlong lpcompletionkey, jlong lpoverlapped, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetQueuedCompletionStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)completionport, (void*)(uintptr_t)lpnumberofbytestransferred, (void*)(uintptr_t)lpcompletionkey, (void*)(uintptr_t)lpoverlapped, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)completionport;
    (void)lpnumberofbytestransferred;
    (void)lpcompletionkey;
    (void)lpoverlapped;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1getQueuedCompletionStatusEx(JNIEnv* km_env, jclass km_clazz, jlong completionport, jlong lpcompletionportentries, jint ulcount, jlong ulnumentriesremoved, jint dwmilliseconds, jint falertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetQueuedCompletionStatusEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)completionport, (void*)(uintptr_t)lpcompletionportentries, (uint32_t)ulcount, (void*)(uintptr_t)ulnumentriesremoved, (uint32_t)dwmilliseconds, (int32_t)falertable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)completionport;
    (void)lpcompletionportentries;
    (void)ulcount;
    (void)ulnumentriesremoved;
    (void)dwmilliseconds;
    (void)falertable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_io_WindowsWin32SystemIoJniBridge_windowssys_1windows_1win32_1system_1io_1postQueuedCompletionStatus(JNIEnv* km_env, jclass km_clazz, jlong completionport, jint dwnumberofbytestransferred, jlong dwcompletionkey, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostQueuedCompletionStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)completionport, (uint32_t)dwnumberofbytestransferred, (uint64_t)dwcompletionkey, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)completionport;
    (void)dwnumberofbytestransferred;
    (void)dwcompletionkey;
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

