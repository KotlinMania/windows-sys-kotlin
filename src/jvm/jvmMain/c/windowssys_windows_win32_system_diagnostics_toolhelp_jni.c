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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1CreateToolhelp32Snapshot(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint th32processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateToolhelp32Snapshot");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (uint32_t)th32processid) : NULL;
#else
    (void)dwflags;
    (void)th32processid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Heap32First(JNIEnv* km_env, jclass km_clazz, jlong lphe, jint th32processid, jlong th32heapid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32First");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphe, (uint32_t)th32processid, (uint64_t)th32heapid) : -1;
#else
    (void)lphe;
    (void)th32processid;
    (void)th32heapid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Heap32ListFirst(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lphl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32ListFirst");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lphl) : -1;
#else
    (void)hsnapshot;
    (void)lphl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Heap32ListNext(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lphl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32ListNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lphl) : -1;
#else
    (void)hsnapshot;
    (void)lphl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Heap32Next(JNIEnv* km_env, jclass km_clazz, jlong lphe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32Next");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphe) : -1;
#else
    (void)lphe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Module32First(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lpme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32First");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lpme) : -1;
#else
    (void)hsnapshot;
    (void)lpme;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Module32FirstW(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lpme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32FirstW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lpme) : -1;
#else
    (void)hsnapshot;
    (void)lpme;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Module32Next(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lpme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32Next");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lpme) : -1;
#else
    (void)hsnapshot;
    (void)lpme;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Module32NextW(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lpme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32NextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lpme) : -1;
#else
    (void)hsnapshot;
    (void)lpme;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Process32First(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32First");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lppe) : -1;
#else
    (void)hsnapshot;
    (void)lppe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Process32FirstW(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32FirstW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lppe) : -1;
#else
    (void)hsnapshot;
    (void)lppe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Process32Next(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32Next");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lppe) : -1;
#else
    (void)hsnapshot;
    (void)lppe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Process32NextW(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32NextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lppe) : -1;
#else
    (void)hsnapshot;
    (void)lppe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Thread32First(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lpte) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Thread32First");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lpte) : -1;
#else
    (void)hsnapshot;
    (void)lpte;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Thread32Next(JNIEnv* km_env, jclass km_clazz, jlong hsnapshot, jlong lpte) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Thread32Next");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsnapshot, (void*)(uintptr_t)lpte) : -1;
#else
    (void)hsnapshot;
    (void)lpte;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_toolhelp_WindowsWin32SystemDiagnosticsToolhelpJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1toolhelp_1Toolhelp32ReadProcessMemory(JNIEnv* km_env, jclass km_clazz, jint th32processid, jlong lpbaseaddress, jlong lpbuffer, jlong cbread, jlong lpnumberofbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Toolhelp32ReadProcessMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)th32processid, (void*)(uintptr_t)lpbaseaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)cbread, (void*)(uintptr_t)lpnumberofbytesread) : -1;
#else
    (void)th32processid;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)cbread;
    (void)lpnumberofbytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

