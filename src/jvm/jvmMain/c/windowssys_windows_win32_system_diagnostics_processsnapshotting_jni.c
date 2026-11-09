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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssCaptureSnapshot(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint captureflags, jint threadcontextflags, jlong snapshothandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssCaptureSnapshot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)captureflags, (uint32_t)threadcontextflags, (void*)(uintptr_t)snapshothandle) : 0;
#else
    (void)processhandle;
    (void)captureflags;
    (void)threadcontextflags;
    (void)snapshothandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssDuplicateSnapshot(JNIEnv* km_env, jclass km_clazz, jlong sourceprocesshandle, jlong snapshothandle, jlong targetprocesshandle, jlong targetsnapshothandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssDuplicateSnapshot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourceprocesshandle, (void*)(uintptr_t)snapshothandle, (void*)(uintptr_t)targetprocesshandle, (void*)(uintptr_t)targetsnapshothandle, (int32_t)flags) : 0;
#else
    (void)sourceprocesshandle;
    (void)snapshothandle;
    (void)targetprocesshandle;
    (void)targetsnapshothandle;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssFreeSnapshot(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong snapshothandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssFreeSnapshot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)snapshothandle) : 0;
#else
    (void)processhandle;
    (void)snapshothandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssQuerySnapshot(JNIEnv* km_env, jclass km_clazz, jlong snapshothandle, jint informationclass, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssQuerySnapshot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)snapshothandle, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)bufferlength) : 0;
#else
    (void)snapshothandle;
    (void)informationclass;
    (void)buffer;
    (void)bufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssWalkMarkerCreate(JNIEnv* km_env, jclass km_clazz, jlong allocator, jlong walkmarkerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)allocator, (void*)(uintptr_t)walkmarkerhandle) : 0;
#else
    (void)allocator;
    (void)walkmarkerhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssWalkMarkerFree(JNIEnv* km_env, jclass km_clazz, jlong walkmarkerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)walkmarkerhandle) : 0;
#else
    (void)walkmarkerhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssWalkMarkerGetPosition(JNIEnv* km_env, jclass km_clazz, jlong walkmarkerhandle, jlong position) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerGetPosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)walkmarkerhandle, (void*)(uintptr_t)position) : 0;
#else
    (void)walkmarkerhandle;
    (void)position;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssWalkMarkerSeekToBeginning(JNIEnv* km_env, jclass km_clazz, jlong walkmarkerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerSeekToBeginning");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)walkmarkerhandle) : 0;
#else
    (void)walkmarkerhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssWalkMarkerSetPosition(JNIEnv* km_env, jclass km_clazz, jlong walkmarkerhandle, jlong position) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerSetPosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)walkmarkerhandle, (uint64_t)position) : 0;
#else
    (void)walkmarkerhandle;
    (void)position;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_processsnapshotting_WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1processsnapshotting_1PssWalkSnapshot(JNIEnv* km_env, jclass km_clazz, jlong snapshothandle, jint informationclass, jlong walkmarkerhandle, jlong buffer, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkSnapshot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)snapshothandle, (int32_t)informationclass, (void*)(uintptr_t)walkmarkerhandle, (void*)(uintptr_t)buffer, (uint32_t)bufferlength) : 0;
#else
    (void)snapshothandle;
    (void)informationclass;
    (void)walkmarkerhandle;
    (void)buffer;
    (void)bufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

