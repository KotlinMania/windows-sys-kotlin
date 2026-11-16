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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(JNIEnv* km_env, jclass km_clazz, jint first, jlong handler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVectoredContinueHandler");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)first, (void*)(uintptr_t)handler);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)first;
    (void)handler;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(JNIEnv* km_env, jclass km_clazz, jint first, jlong handler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVectoredExceptionHandler");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)first, (void*)(uintptr_t)handler);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)first;
    (void)handler;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugBeep(JNIEnv* km_env, jclass km_clazz, jint dwfreq, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Beep");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwfreq, (uint32_t)dwduration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwfreq;
    (void)dwduration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugBindImage(JNIEnv* km_env, jclass km_clazz, jlong imagename, jlong dllpath, jlong symbolpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imagename, (void*)(uintptr_t)dllpath, (void*)(uintptr_t)symbolpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(JNIEnv* km_env, jclass km_clazz, jint flags, jlong imagename, jlong dllpath, jlong symbolpath, jlong statusroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindImageEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)imagename, (void*)(uintptr_t)dllpath, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)statusroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    (void)statusroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pbdebuggerpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckRemoteDebuggerPresent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pbdebuggerpresent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pbdebuggerpresent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(JNIEnv* km_env, jclass km_clazz, jlong baseaddress, jint filelength, jlong headersum, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckSumMappedFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)baseaddress, (uint32_t)filelength, (void*)(uintptr_t)headersum, (void*)(uintptr_t)checksum);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)baseaddress;
    (void)filelength;
    (void)headersum;
    (void)checksum;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(JNIEnv* km_env, jclass km_clazz, jlong wcthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadWaitChainSession");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)wcthandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)wcthandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(JNIEnv* km_env, jclass km_clazz, jint dwprocessid, jint dwthreadid, jint dwcontinuestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ContinueDebugEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprocessid, (uint32_t)dwthreadid, (int32_t)dwcontinuestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprocessid;
    (void)dwthreadid;
    (void)dwcontinuestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugCopyContext(JNIEnv* km_env, jclass km_clazz, jlong destination, jint contextflags, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destination, (uint32_t)contextflags, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destination;
    (void)contextflags;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong callback, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgHelpCreateUserDump");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)callback, (void*)(uintptr_t)userdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong callback, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgHelpCreateUserDumpW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)callback, (void*)(uintptr_t)userdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugActiveProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprocessid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprocessid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugActiveProcessStop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprocessid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprocessid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugBreak");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugBreakProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(JNIEnv* km_env, jclass km_clazz, jint killonexit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugSetProcessKillOnExit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)killonexit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)killonexit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodePointer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong ptr, jlong decodedptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeRemotePointer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)ptr, (void*)(uintptr_t)decodedptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)ptr;
    (void)decodedptr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeSystemPointer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodePointer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong ptr, jlong encodedptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodeRemotePointer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)ptr, (void*)(uintptr_t)encodedptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)ptr;
    (void)encodedptr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodeSystemPointer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong rootpath, jlong inputpathname, jlong outputpathbuffer, jlong cb, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDirTree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer, (void*)(uintptr_t)cb, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong rootpath, jlong inputpathname, jlong outputpathbuffer, jlong cb, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDirTreeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer, (void*)(uintptr_t)cb, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModules64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(JNIEnv* km_env, jclass km_clazz, jint uaction, jlong lpmessagetext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalAppExitA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)uaction, (void*)(uintptr_t)lpmessagetext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)uaction;
    (void)lpmessagetext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(JNIEnv* km_env, jclass km_clazz, jint uaction, jlong lpmessagetext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalAppExitW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)uaction, (void*)(uintptr_t)lpmessagetext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)uaction;
    (void)lpmessagetext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFatalExit(JNIEnv* km_env, jclass km_clazz, jint exitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalExit");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)exitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)exitcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong debugfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFileEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFileExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong imagefilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImage");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)imagefilepath);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImageEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImageExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jlong id, jint two, jint three, jint flags, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFileInPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (void*)(uintptr_t)id, (uint32_t)two, (uint32_t)three, (uint32_t)flags, (void*)(uintptr_t)filepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)filepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jint one, jint two, jint three, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFileInSearchPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (uint32_t)one, (uint32_t)two, (uint32_t)three, (void*)(uintptr_t)filepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)one;
    (void)two;
    (void)three;
    (void)filepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpbaseaddress, jlong dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushInstructionCache");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpbaseaddress, (uint64_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpsource, jint dwmessageid, jint dwlanguageid, jlong lpbuffer, jint nsize, jlong arguments) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatMessageA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpsource, (uint32_t)dwmessageid, (uint32_t)dwlanguageid, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize, (void*)(uintptr_t)arguments);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpsource, jint dwmessageid, jint dwlanguageid, jlong lpbuffer, jint nsize, jlong arguments) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatMessageW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpsource, (uint32_t)dwmessageid, (uint32_t)dwlanguageid, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize, (void*)(uintptr_t)arguments);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnabledXStateFeatures");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetErrorMode");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(JNIEnv* km_env, jclass km_clazz, jlong loadedimage, jlong imageconfiginformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetImageConfigInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadedimage, (void*)(uintptr_t)imageconfiginformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(JNIEnv* km_env, jclass km_clazz, jlong loadedimage, jlong sizeunusedheaderbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetImageUnusedHeaderBytes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadedimage, (void*)(uintptr_t)sizeunusedheaderbytes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)loadedimage;
    (void)sizeunusedheaderbytes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSymLoadError");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadErrorMode");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint dwselector, jlong lpselectorentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectorEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (uint32_t)dwselector, (void*)(uintptr_t)lpselectorentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(JNIEnv* km_env, jclass km_clazz, jlong wcthandle, jlong context, jint flags, jint threadid, jlong nodecount, jlong nodeinfoarray, jlong iscycle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadWaitChain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wcthandle, (uint64_t)context, (uint32_t)flags, (uint32_t)threadid, (void*)(uintptr_t)nodecount, (void*)(uintptr_t)nodeinfoarray, (void*)(uintptr_t)iscycle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wcthandle;
    (void)context;
    (void)flags;
    (void)threadid;
    (void)nodecount;
    (void)nodeinfoarray;
    (void)iscycle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(JNIEnv* km_env, jclass km_clazz, jlong module) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimestampForLoadedLibrary");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)module);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)module;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(JNIEnv* km_env, jclass km_clazz, jlong context, jlong featuremask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetXStateFeaturesMask");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)featuremask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)featuremask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong certificate, jlong arg2Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageAddCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)certificate, (void*)(uintptr_t)arg2Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)certificate;
    (void)arg2Index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(JNIEnv* km_env, jclass km_clazz, jlong base, jboolean mappedasimage, jshort directoryentry, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageDirectoryEntryToData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)base, (bool)mappedasimage, (uint16_t)directoryentry, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(JNIEnv* km_env, jclass km_clazz, jlong base, jboolean mappedasimage, jshort directoryentry, jlong size, jlong foundheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageDirectoryEntryToDataEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)base, (bool)mappedasimage, (uint16_t)directoryentry, (void*)(uintptr_t)size, (void*)(uintptr_t)foundheader);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    (void)foundheader;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jshort typefilter, jlong certificatecount, jlong indices, jint indexcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageEnumerateCertificates");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint16_t)typefilter, (void*)(uintptr_t)certificatecount, (void*)(uintptr_t)indices, (uint32_t)indexcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)typefilter;
    (void)certificatecount;
    (void)indices;
    (void)indexcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint certificateindex, jlong certificate, jlong requiredlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetCertificateData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)certificateindex, (void*)(uintptr_t)certificate, (void*)(uintptr_t)requiredlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificate;
    (void)requiredlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint certificateindex, jlong certificateheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetCertificateHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)certificateindex, (void*)(uintptr_t)certificateheader);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificateheader;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint digestlevel, jlong digestfunction, jlong digesthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetDigestStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)digestlevel, (void*)(uintptr_t)digestfunction, (void*)(uintptr_t)digesthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)digestlevel;
    (void)digestfunction;
    (void)digesthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageLoad(JNIEnv* km_env, jclass km_clazz, jlong dllname, jlong dllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageLoad");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dllname, (void*)(uintptr_t)dllpath);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dllname;
    (void)dllpath;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(JNIEnv* km_env, jclass km_clazz, jlong base) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageNtHeader");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)base);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)base;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRemoveCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)arg1Index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(JNIEnv* km_env, jclass km_clazz, jlong ntheaders, jlong base, jint rva) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRvaToSection");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ntheaders, (void*)(uintptr_t)base, (uint32_t)rva);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(JNIEnv* km_env, jclass km_clazz, jlong ntheaders, jlong base, jint rva, jlong lastrvasection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRvaToVa");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ntheaders, (void*)(uintptr_t)base, (uint32_t)rva, (void*)(uintptr_t)lastrvasection);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    (void)lastrvasection;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImageUnload(JNIEnv* km_env, jclass km_clazz, jlong loadedimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageUnload");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadedimage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadedimage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImagehlpApiVersion");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(JNIEnv* km_env, jclass km_clazz, jlong appversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImagehlpApiVersionEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)appversion);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)appversion;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint contextflags, jlong context, jlong contextlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)contextflags, (void*)(uintptr_t)context, (void*)(uintptr_t)contextlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint contextflags, jlong context, jlong contextlength, jlong xstatecompactionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeContext2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)contextflags, (void*)(uintptr_t)context, (void*)(uintptr_t)contextlength, (uint64_t)xstatecompactionmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    (void)xstatecompactionmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDebuggerPresent");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(JNIEnv* km_env, jclass km_clazz, jlong context, jint featureid, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocateXStateFeature");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)featureid, (void*)(uintptr_t)length);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)context;
    (void)featureid;
    (void)length;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(JNIEnv* km_env, jclass km_clazz, jlong dirpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSureDirectoryPathExists");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dirpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dirpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(JNIEnv* km_env, jclass km_clazz, jlong imagename, jlong dllpath, jlong loadedimage, jint dotdll, jint readonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapAndLoad");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imagename, (void*)(uintptr_t)dllpath, (void*)(uintptr_t)loadedimage, (int32_t)dotdll, (int32_t)readonly);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imagename;
    (void)dllpath;
    (void)loadedimage;
    (void)dotdll;
    (void)readonly;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong headersum, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapFileAndCheckSumA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)headersum, (void*)(uintptr_t)checksum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong headersum, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapFileAndCheckSumW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)headersum, (void*)(uintptr_t)checksum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(JNIEnv* km_env, jclass km_clazz, jint utype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBeep");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)utype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)utype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(JNIEnv* km_env, jclass km_clazz, jlong baseofdump, jint streamnumber, jlong dir, jlong streampointer, jlong streamsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MiniDumpReadDumpStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)baseofdump, (uint32_t)streamnumber, (void*)(uintptr_t)dir, (void*)(uintptr_t)streampointer, (void*)(uintptr_t)streamsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)baseofdump;
    (void)streamnumber;
    (void)dir;
    (void)streampointer;
    (void)streamsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint processid, jlong hfile, jint dumptype, jlong exceptionparam, jlong userstreamparam, jlong callbackparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MiniDumpWriteDump");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)processid, (void*)(uintptr_t)hfile, (int32_t)dumptype, (void*)(uintptr_t)exceptionparam, (void*)(uintptr_t)userstreamparam, (void*)(uintptr_t)callbackparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)processid;
    (void)hfile;
    (void)dumptype;
    (void)exceptionparam;
    (void)userstreamparam;
    (void)callbackparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(JNIEnv* km_env, jclass km_clazz, jint flags, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThreadWaitChainSession");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)flags;
    (void)callback;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(JNIEnv* km_env, jclass km_clazz, jlong lpoutputstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OutputDebugStringA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpoutputstring);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpoutputstring;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(JNIEnv* km_env, jclass km_clazz, jlong lpoutputstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OutputDebugStringW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpoutputstring);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpoutputstring;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRaiseException(JNIEnv* km_env, jclass km_clazz, jint dwexceptioncode, jint dwexceptionflags, jint nnumberofarguments, jlong lparguments) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseException");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwexceptioncode, (uint32_t)dwexceptionflags, (uint32_t)nnumberofarguments, (void*)(uintptr_t)lparguments);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwexceptioncode;
    (void)dwexceptionflags;
    (void)nnumberofarguments;
    (void)lparguments;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(JNIEnv* km_env, jclass km_clazz, jlong pexceptionrecord, jlong pcontextrecord, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseFailFastException");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pexceptionrecord, (void*)(uintptr_t)pcontextrecord, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pexceptionrecord;
    (void)pcontextrecord;
    (void)dwflags;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong imagename, jlong mappedimage, jint mappingbytes, jlong imagebase, jlong usertag, jint mappingflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapAddPeImageSections");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rmaphandle, (void*)(uintptr_t)imagename, (void*)(uintptr_t)mappedimage, (uint32_t)mappingbytes, (uint64_t)imagebase, (uint64_t)usertag, (uint32_t)mappingflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rmaphandle;
    (void)imagename;
    (void)mappedimage;
    (void)mappingbytes;
    (void)imagebase;
    (void)usertag;
    (void)mappingflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapCreate");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)rmaphandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)rmaphandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong offset, jlong buffer, jint requestbytes, jint flags, jlong donebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapRead");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rmaphandle, (uint64_t)offset, (void*)(uintptr_t)buffer, (uint32_t)requestbytes, (uint32_t)flags, (void*)(uintptr_t)donebytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong usertag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapRemove");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rmaphandle, (uint64_t)usertag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rmaphandle;
    (void)usertag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong offset, jlong buffer, jint requestbytes, jint flags, jlong donebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapWrite");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rmaphandle, (uint64_t)offset, (void*)(uintptr_t)buffer, (uint32_t)requestbytes, (uint32_t)flags, (void*)(uintptr_t)donebytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(JNIEnv* km_env, jclass km_clazz, jlong currentimagename, jlong symbolpath, jint frebase, jint frebasesysfileok, jint fgoingdown, jint checkimagesize, jlong oldimagesize, jlong oldimagebase, jlong newimagesize, jlong newimagebase, jint timestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReBaseImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)currentimagename, (void*)(uintptr_t)symbolpath, (int32_t)frebase, (int32_t)frebasesysfileok, (int32_t)fgoingdown, (uint32_t)checkimagesize, (void*)(uintptr_t)oldimagesize, (void*)(uintptr_t)oldimagebase, (void*)(uintptr_t)newimagesize, (void*)(uintptr_t)newimagebase, (uint32_t)timestamp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentimagename;
    (void)symbolpath;
    (void)frebase;
    (void)frebasesysfileok;
    (void)fgoingdown;
    (void)checkimagesize;
    (void)oldimagesize;
    (void)oldimagebase;
    (void)newimagesize;
    (void)newimagebase;
    (void)timestamp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(JNIEnv* km_env, jclass km_clazz, jlong currentimagename, jlong symbolpath, jint frebase, jint frebasesysfileok, jint fgoingdown, jint checkimagesize, jlong oldimagesize, jlong oldimagebase, jlong newimagesize, jlong newimagebase, jint timestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReBaseImage64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)currentimagename, (void*)(uintptr_t)symbolpath, (int32_t)frebase, (int32_t)frebasesysfileok, (int32_t)fgoingdown, (uint32_t)checkimagesize, (void*)(uintptr_t)oldimagesize, (void*)(uintptr_t)oldimagebase, (void*)(uintptr_t)newimagesize, (void*)(uintptr_t)newimagebase, (uint32_t)timestamp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentimagename;
    (void)symbolpath;
    (void)frebase;
    (void)frebasesysfileok;
    (void)fgoingdown;
    (void)checkimagesize;
    (void)oldimagesize;
    (void)oldimagebase;
    (void)newimagesize;
    (void)newimagebase;
    (void)timestamp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpbaseaddress, jlong lpbuffer, jlong nsize, jlong lpnumberofbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadProcessMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpbaseaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)nsize, (void*)(uintptr_t)lpnumberofbytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(JNIEnv* km_env, jclass km_clazz, jlong callstatecallback, jlong activationstatecallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitChainCOMCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callstatecallback, (void*)(uintptr_t)activationstatecallback);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callstatecallback;
    (void)activationstatecallback;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveInvalidModuleList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hprocess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveVectoredContinueHandler");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveVectoredExceptionHandler");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong ploadmodule, jlong psymboldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportSymbolLoadSummary");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)ploadmodule, (void*)(uintptr_t)psymboldata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)ploadmodule;
    (void)psymboldata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong functiontable, jint entrycount, jlong baseaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddFunctionTable");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)functiontable, (uint32_t)entrycount, (uint64_t)baseaddress);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)functiontable;
    (void)entrycount;
    (void)baseaddress;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong dynamictable, jlong functiontable, jint entrycount, jint maximumentrycount, jlong rangebase, jlong rangeend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddGrowableFunctionTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dynamictable, (void*)(uintptr_t)functiontable, (uint32_t)entrycount, (uint32_t)maximumentrycount, (uint64_t)rangebase, (uint64_t)rangeend);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dynamictable;
    (void)functiontable;
    (void)entrycount;
    (void)maximumentrycount;
    (void)rangebase;
    (void)rangeend;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(JNIEnv* km_env, jclass km_clazz, jlong contextrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)contextrecord);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contextrecord;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(JNIEnv* km_env, jclass km_clazz, jlong contextrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureContext2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)contextrecord);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contextrecord;
    errno = ENOSYS;
#endif
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(JNIEnv* km_env, jclass km_clazz, jint framestoskip, jint framestocapture, jlong backtrace, jlong backtracehash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureStackBackTrace");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)framestoskip, (uint32_t)framestocapture, (void*)(uintptr_t)backtrace, (void*)(uintptr_t)backtracehash);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)framestoskip;
    (void)framestocapture;
    (void)backtrace;
    (void)backtracehash;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong functiontable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteFunctionTable");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)functiontable);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)functiontable;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong dynamictable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteGrowableFunctionTable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)dynamictable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dynamictable;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong dynamictable, jint newentrycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGrowFunctionTable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)dynamictable, (uint32_t)newentrycount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dynamictable;
    (void)newentrycount;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(JNIEnv* km_env, jclass km_clazz, jlong tableidentifier, jlong baseaddress, jint length, jlong callback, jlong context, jlong outofprocesscallbackdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInstallFunctionTableCallback");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)tableidentifier, (uint64_t)baseaddress, (uint32_t)length, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)outofprocesscallbackdll);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)tableidentifier;
    (void)baseaddress;
    (void)length;
    (void)callback;
    (void)context;
    (void)outofprocesscallbackdll;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(JNIEnv* km_env, jclass km_clazz, jlong controlpc, jlong imagebase, jlong historytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupFunctionEntry");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)controlpc, (void*)(uintptr_t)imagebase, (void*)(uintptr_t)historytable);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)controlpc;
    (void)imagebase;
    (void)historytable;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(JNIEnv* km_env, jclass km_clazz, jlong pcvalue, jlong baseofimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPcToFileHeader");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcvalue, (void*)(uintptr_t)baseofimage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcvalue;
    (void)baseofimage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(JNIEnv* km_env, jclass km_clazz, jlong exceptionrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRaiseException");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)exceptionrecord);
    } else {
        errno = ENOSYS;
    }
#else
    (void)exceptionrecord;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(JNIEnv* km_env, jclass km_clazz, jlong contextrecord, jlong exceptionrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRestoreContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)contextrecord, (void*)(uintptr_t)exceptionrecord);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contextrecord;
    (void)exceptionrecord;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(JNIEnv* km_env, jclass km_clazz, jlong targetframe, jlong targetip, jlong exceptionrecord, jlong returnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnwind");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)targetframe, (void*)(uintptr_t)targetip, (void*)(uintptr_t)exceptionrecord, (void*)(uintptr_t)returnvalue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(JNIEnv* km_env, jclass km_clazz, jlong targetframe, jlong targetip, jlong exceptionrecord, jlong returnvalue, jlong contextrecord, jlong historytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnwindEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)targetframe, (void*)(uintptr_t)targetip, (void*)(uintptr_t)exceptionrecord, (void*)(uintptr_t)returnvalue, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)historytable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
    (void)contextrecord;
    (void)historytable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugRtlVirtualUnwind(JNIEnv* km_env, jclass km_clazz, jint handlertype, jlong imagebase, jlong controlpc, jlong functionentry, jlong contextrecord, jlong handlerdata, jlong establisherframe, jlong contextpointers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlVirtualUnwind");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)handlertype, (uint64_t)imagebase, (uint64_t)controlpc, (void*)(uintptr_t)functionentry, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)handlerdata, (void*)(uintptr_t)establisherframe, (void*)(uintptr_t)contextpointers);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)handlertype;
    (void)imagebase;
    (void)controlpc;
    (void)functionentry;
    (void)contextrecord;
    (void)handlerdata;
    (void)establisherframe;
    (void)contextpointers;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(JNIEnv* km_env, jclass km_clazz, jlong rootpath, jlong inputpathname, jlong outputpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchTreeForFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(JNIEnv* km_env, jclass km_clazz, jlong rootpath, jlong inputpathname, jlong outputpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchTreeForFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(JNIEnv* km_env, jclass km_clazz, jlong lpstartaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCheckUserInterruptShared");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpstartaddress);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpstartaddress;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(JNIEnv* km_env, jclass km_clazz, jint umode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetErrorMode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)umode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)umode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(JNIEnv* km_env, jclass km_clazz, jlong loadedimage, jlong imageconfiginformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetImageConfigInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadedimage, (void*)(uintptr_t)imageconfiginformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(JNIEnv* km_env, jclass km_clazz, jint error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSymLoadError");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)error);
    } else {
        errno = ENOSYS;
    }
#else
    (void)error;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(JNIEnv* km_env, jclass km_clazz, jint dwnewmode, jlong lpoldmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadErrorMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnewmode, (void*)(uintptr_t)lpoldmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwnewmode;
    (void)lpoldmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetUnhandledExceptionFilter(JNIEnv* km_env, jclass km_clazz, jlong lptoplevelexceptionfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUnhandledExceptionFilter");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptoplevelexceptionfilter);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lptoplevelexceptionfilter;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(JNIEnv* km_env, jclass km_clazz, jlong context, jlong featuremask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetXStateFeaturesMask");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint64_t)featuremask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)featuremask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(JNIEnv* km_env, jclass km_clazz, jint machinetype, jlong hprocess, jlong hthread, jlong stackframe, jlong contextrecord, jlong readmemoryroutine, jlong functiontableaccessroutine, jlong getmodulebaseroutine, jlong translateaddress, jlong gettargetattributevalue, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalk2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)machinetype, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)functiontableaccessroutine, (void*)(uintptr_t)getmodulebaseroutine, (void*)(uintptr_t)translateaddress, (void*)(uintptr_t)gettargetattributevalue, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    (void)gettargetattributevalue;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(JNIEnv* km_env, jclass km_clazz, jint machinetype, jlong hprocess, jlong hthread, jlong stackframe, jlong contextrecord, jlong readmemoryroutine, jlong functiontableaccessroutine, jlong getmodulebaseroutine, jlong translateaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalk64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)machinetype, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)functiontableaccessroutine, (void*)(uintptr_t)getmodulebaseroutine, (void*)(uintptr_t)translateaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(JNIEnv* km_env, jclass km_clazz, jint machinetype, jlong hprocess, jlong hthread, jlong stackframe, jlong contextrecord, jlong readmemoryroutine, jlong functiontableaccessroutine, jlong getmodulebaseroutine, jlong translateaddress, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalkEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)machinetype, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)functiontableaccessroutine, (void*)(uintptr_t)getmodulebaseroutine, (void*)(uintptr_t)translateaddress, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong streamfile, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)streamfile, (void*)(uintptr_t)buffer, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong streamfile, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStreamA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)streamfile, (void*)(uintptr_t)buffer, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStreamW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)buffer, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSymbol");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)size, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSymbolW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)size, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddrIncludeInlineTrace");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymCleanup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address1, jint inlinecontext1, jlong retaddress1, jlong address2, jlong retaddress2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymCompareInlineTrace");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address1, (uint32_t)inlinecontext1, (uint64_t)retaddress1, (uint64_t)address2, (uint64_t)retaddress2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)address1;
    (void)inlinecontext1;
    (void)retaddress1;
    (void)address2;
    (void)retaddress2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymDeleteSymbol");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymDeleteSymbolW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumLines");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumLinesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(JNIEnv* km_env, jclass km_clazz, jlong enumprocessescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumProcesses");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumprocessescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumprocessescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFileTokens");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jlong mask, jlong cbsrcfiles, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (void*)(uintptr_t)mask, (void*)(uintptr_t)cbsrcfiles, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jlong mask, jlong cbsrcfiles, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFilesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (void*)(uintptr_t)mask, (void*)(uintptr_t)cbsrcfiles, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jint line, jint flags, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceLines");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (uint32_t)line, (uint32_t)flags, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jint line, jint flags, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceLinesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (uint32_t)line, (uint32_t)flags, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSym");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbols");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsForAddr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsForAddrW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesByNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enummodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateModules64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enummodulescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enummodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateModulesW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enummodulescallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateSymbols64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateSymbolsW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindDebugInfoFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindDebugInfoFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindExecutableImage");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindExecutableImageW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jlong id, jint two, jint three, jint flags, jlong foundfile, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindFileInPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (void*)(uintptr_t)id, (uint32_t)two, (uint32_t)three, (uint32_t)flags, (void*)(uintptr_t)foundfile, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)foundfile;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jlong id, jint two, jint three, jint flags, jlong foundfile, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindFileInPathW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (void*)(uintptr_t)id, (uint32_t)two, (uint32_t)three, (uint32_t)flags, (void*)(uintptr_t)foundfile, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)foundfile;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromAddr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromAddrW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jint inlinecontext, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromInlineContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (uint32_t)inlinecontext, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jint inlinecontext, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromInlineContextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (uint32_t)inlinecontext, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jint token, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (uint32_t)token, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jint token, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromTokenW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (uint32_t)token, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong addrbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFunctionTableAccess64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)addrbase);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)addrbase;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong addrbase, jlong readmemoryroutine, jlong getmodulebaseroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFunctionTableAccess64AccessRoutines");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)addrbase, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)getmodulebaseroutine);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)addrbase;
    (void)readmemoryroutine;
    (void)getmodulebaseroutine;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(JNIEnv* km_env, jclass km_clazz, jint option) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetExtendedOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)option);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)option;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modulename, jlong filename, jlong buffer, jint bufferlines) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetFileLineOffsets64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)modulename, (void*)(uintptr_t)filename, (void*)(uintptr_t)buffer, (uint32_t)bufferlines);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)buffer;
    (void)bufferlines;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(JNIEnv* km_env, jclass km_clazz, jint type, jlong dir, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetHomeDirectory");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)type, (void*)(uintptr_t)dir, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)type;
    (void)dir;
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(JNIEnv* km_env, jclass km_clazz, jint type, jlong dir, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetHomeDirectoryW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)type, (void*)(uintptr_t)dir, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)type;
    (void)dir;
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong pdwdisplacement, jlong line64) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromAddr64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line64);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)line64;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwaddr, jlong pdwdisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromAddrW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwaddr, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwaddr;
    (void)pdwdisplacement;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jint inlinecontext, jlong qwmodulebaseaddress, jlong pdwdisplacement, jlong line64) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromInlineContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (uint32_t)inlinecontext, (uint64_t)qwmodulebaseaddress, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line64);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)qwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line64;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwaddr, jint inlinecontext, jlong qwmodulebaseaddress, jlong pdwdisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromInlineContextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwaddr, (uint32_t)inlinecontext, (uint64_t)qwmodulebaseaddress, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modulename, jlong filename, jint dwlinenumber, jlong pldisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromName64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)modulename, (void*)(uintptr_t)filename, (uint32_t)dwlinenumber, (void*)(uintptr_t)pldisplacement, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modulename, jlong filename, jint dwlinenumber, jlong pldisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromNameW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)modulename, (void*)(uintptr_t)filename, (uint32_t)dwlinenumber, (void*)(uintptr_t)pldisplacement, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineNext64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineNextW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLinePrev64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLinePrevW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleBase64");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)qwaddr;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong moduleinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleInfo64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)moduleinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong moduleinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleInfoW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)moduleinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong omapto, jlong comapto, jlong omapfrom, jlong comapfrom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetOmaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)omapto, (void*)(uintptr_t)comapto, (void*)(uintptr_t)omapfrom, (void*)(uintptr_t)comapfrom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)omapto;
    (void)comapto;
    (void)omapfrom;
    (void)comapfrom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetOptions");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetScope");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetScopeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jint searchpathlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSearchPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (uint32_t)searchpathlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jint searchpathlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSearchPathW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (uint32_t)searchpathlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong params, jlong filespec, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)params, (void*)(uintptr_t)filespec, (void*)(uintptr_t)filepath, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong pchecksumtype, jlong pchecksum, jint checksumsize, jlong pactualbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileChecksum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)pchecksumtype, (void*)(uintptr_t)pchecksum, (uint32_t)checksumsize, (void*)(uintptr_t)pactualbyteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong pchecksumtype, jlong pchecksum, jint checksumsize, jlong pactualbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileChecksumW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)pchecksumtype, (void*)(uintptr_t)pchecksum, (uint32_t)checksumsize, (void*)(uintptr_t)pactualbyteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong tokenname, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong tokenname, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)token, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong tokenname, jlong tokenparameters, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)tokenparameters, (void*)(uintptr_t)token, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong tokenname, jlong tokenparameters, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)tokenparameters, (void*)(uintptr_t)token, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)token, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong params, jlong filespec, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)params, (void*)(uintptr_t)filespec, (void*)(uintptr_t)filepath, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong varname, jlong value, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceVarFromToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)varname, (void*)(uintptr_t)value, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong varname, jlong value, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceVarFromTokenW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)varname, (void*)(uintptr_t)value, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong pdwdisplacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymFromAddr64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymFromName64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymNext64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymPrev64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong imagefile, jint type, jlong symbolfile, jlong csymbolfile, jlong dbgfile, jlong cdbgfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymbolFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)imagefile, (uint32_t)type, (void*)(uintptr_t)symbolfile, (uint64_t)csymbolfile, (void*)(uintptr_t)dbgfile, (uint64_t)cdbgfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong imagefile, jint type, jlong symbolfile, jlong csymbolfile, jlong dbgfile, jlong cdbgfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymbolFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)imagefile, (uint32_t)type, (void*)(uintptr_t)symbolfile, (uint64_t)csymbolfile, (void*)(uintptr_t)dbgfile, (uint64_t)cdbgfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeFromNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jint arg2Typeid, jint gettype, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (uint32_t)arg2Typeid, (int32_t)gettype, (void*)(uintptr_t)pinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)modbase;
    (void)arg2Typeid;
    (void)gettype;
    (void)pinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeInfoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)modbase;
    (void)params;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetUnwindInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)buffer, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong usersearchpath, jint finvadeprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)usersearchpath, (int32_t)finvadeprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong usersearchpath, jint finvadeprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymInitializeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)usersearchpath, (int32_t)finvadeprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hfile, jlong imagename, jlong modulename, jlong baseofdll, jint sizeofdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModule64");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hfile, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseofdll, (uint32_t)sizeofdll);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)sizeofdll;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hfile, jlong imagename, jlong modulename, jlong baseofdll, jint dllsize, jlong data, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModuleEx");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hfile, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseofdll, (uint32_t)dllsize, (void*)(uintptr_t)data, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hfile, jlong imagename, jlong modulename, jlong baseofdll, jint dllsize, jlong data, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModuleExW");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hfile, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseofdll, (uint32_t)dllsize, (void*)(uintptr_t)data, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong match, jlong filenamestop, jlong matchstop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchFileName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)match, (void*)(uintptr_t)filenamestop, (void*)(uintptr_t)matchstop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong match, jlong filenamestop, jlong matchstop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchFileNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)match, (void*)(uintptr_t)filenamestop, (void*)(uintptr_t)matchstop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(JNIEnv* km_env, jclass km_clazz, jlong string, jlong expression, jint fcase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)expression, (int32_t)fcase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string;
    (void)expression;
    (void)fcase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(JNIEnv* km_env, jclass km_clazz, jlong string, jlong expression, jint fcase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)expression, (int32_t)fcase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string;
    (void)expression;
    (void)fcase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(JNIEnv* km_env, jclass km_clazz, jlong string, jlong expression, jint fcase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)expression, (int32_t)fcase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string;
    (void)expression;
    (void)fcase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymNext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong si) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymNext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)si);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)si;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymNextW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong siw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymNextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)siw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)siw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymPrev(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong si) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymPrev");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)si);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)si;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong siw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymPrevW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)siw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)siw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong startaddress, jint startcontext, jlong startretaddress, jlong curaddress, jlong curcontext, jlong curframeindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymQueryInlineTrace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)startaddress, (uint32_t)startcontext, (uint64_t)startretaddress, (uint64_t)curaddress, (void*)(uintptr_t)curcontext, (void*)(uintptr_t)curframeindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)startaddress;
    (void)startcontext;
    (void)startretaddress;
    (void)curaddress;
    (void)curcontext;
    (void)curframeindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRefreshModuleList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong callbackfunction, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterCallback64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)callbackfunction, (uint64_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong callbackfunction, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterCallbackW64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)callbackfunction, (uint64_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong callbackfunction, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterFunctionEntryCallback64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)callbackfunction, (uint64_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSearch(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index, jint symtag, jlong mask, jlong address, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSearch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index, (uint32_t)symtag, (void*)(uintptr_t)mask, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index, jint symtag, jlong mask, jlong address, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSearchW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index, (uint32_t)symtag, (void*)(uintptr_t)mask, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong stackframe, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)stackframe;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(JNIEnv* km_env, jclass km_clazz, jint option, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetExtendedOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)option, (int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)option;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetHomeDirectory");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)dir);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)dir;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetHomeDirectoryW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)dir);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)dir;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(JNIEnv* km_env, jclass km_clazz, jint symoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetOptions");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)symoptions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)symoptions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetParentWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromAddr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg2Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg2Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jint inlinecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromInlineContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (uint32_t)inlinecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetSearchPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetSearchPathW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)searchpatha;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong type, jlong file1, jlong file2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvDeltaName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)type, (void*)(uintptr_t)file1, (void*)(uintptr_t)file2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong type, jlong file1, jlong file2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvDeltaNameW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)type, (void*)(uintptr_t)file1, (void*)(uintptr_t)file2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(JNIEnv* km_env, jclass km_clazz, jlong file, jlong info, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)info, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)info;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(JNIEnv* km_env, jclass km_clazz, jlong file, jlong info, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)info, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)info;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jlong arg3Index, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (void*)(uintptr_t)arg3Index, (uint64_t)size, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg3Index;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jlong arg3Index, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (void*)(uintptr_t)arg3Index, (uint64_t)size, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg3Index;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(JNIEnv* km_env, jclass km_clazz, jlong file, jlong id, jlong val1, jlong val2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)id, (void*)(uintptr_t)val1, (void*)(uintptr_t)val2, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(JNIEnv* km_env, jclass km_clazz, jlong file, jlong id, jlong val1, jlong val2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)id, (void*)(uintptr_t)val1, (void*)(uintptr_t)val2, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong node, jlong file) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetSupplement");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)node, (void*)(uintptr_t)file);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong node, jlong file) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetSupplementW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)node, (void*)(uintptr_t)file);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvIsStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvIsStoreW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong node, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreSupplement");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)node, (void*)(uintptr_t)file, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)srvpath;
    (void)node;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong node, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreSupplementW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)node, (void*)(uintptr_t)file, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(JNIEnv* km_env, jclass km_clazz, jlong sym, jlong undecname, jint undecnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymUnDName64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sym, (void*)(uintptr_t)undecname, (uint32_t)undecnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sym;
    (void)undecname;
    (void)undecnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymUnloadModule64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)baseofdll;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(JNIEnv* km_env, jclass km_clazz, jlong failedallocationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-errorhandling-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateProcessOnMemoryExhaustion");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)failedallocationsize);
    } else {
        errno = ENOSYS;
    }
#else
    (void)failedallocationsize;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong psystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TouchFileTimes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)psystemtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)psystemtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong outputstring, jint maxstringlength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnDecorateSymbolName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)outputstring, (uint32_t)maxstringlength, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(JNIEnv* km_env, jclass km_clazz, jlong name, jlong outputstring, jint maxstringlength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnDecorateSymbolNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)outputstring, (uint32_t)maxstringlength, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(JNIEnv* km_env, jclass km_clazz, jlong loadedimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnMapAndLoad");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadedimage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadedimage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(JNIEnv* km_env, jclass km_clazz, jlong exceptioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhandledExceptionFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exceptioninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)exceptioninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(JNIEnv* km_env, jclass km_clazz, jlong imagefilename, jlong symbolpath, jlong debugfilepath, jlong ntheaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDebugInfoFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imagefilename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)ntheaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(JNIEnv* km_env, jclass km_clazz, jlong imagefilename, jlong symbolpath, jlong debugfilepath, jlong ntheaders, jint oldchecksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDebugInfoFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imagefilename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)ntheaders, (uint32_t)oldchecksum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    (void)oldchecksum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(JNIEnv* km_env, jclass km_clazz, jlong lpdebugevent, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForDebugEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdebugevent, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(JNIEnv* km_env, jclass km_clazz, jlong lpdebugevent, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForDebugEventEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdebugevent, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64GetThreadContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint dwselector, jlong lpselectorentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64GetThreadSelectorEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (uint32_t)dwselector, (void*)(uintptr_t)lpselectorentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SetThreadContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpbaseaddress, jlong lpbuffer, jlong nsize, jlong lpnumberofbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProcessMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpbaseaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)nsize, (void*)(uintptr_t)lpnumberofbyteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbyteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

