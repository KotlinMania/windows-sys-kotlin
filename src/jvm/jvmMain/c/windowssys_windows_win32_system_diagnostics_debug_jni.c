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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1AddVectoredContinueHandler(JNIEnv* km_env, jclass km_clazz, jint first, jlong handler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVectoredContinueHandler");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)first, (void*)(uintptr_t)handler) : NULL;
#else
    (void)first;
    (void)handler;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1AddVectoredExceptionHandler(JNIEnv* km_env, jclass km_clazz, jint first, jlong handler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVectoredExceptionHandler");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)first, (void*)(uintptr_t)handler) : NULL;
#else
    (void)first;
    (void)handler;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1Beep(JNIEnv* km_env, jclass km_clazz, jint dwfreq, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Beep");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwfreq, (uint32_t)dwduration) : -1;
#else
    (void)dwfreq;
    (void)dwduration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1BindImage(JNIEnv* km_env, jclass km_clazz, jlong imagename, jlong dllpath, jlong symbolpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagename, (void*)(uintptr_t)dllpath, (void*)(uintptr_t)symbolpath) : -1;
#else
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1BindImageEx(JNIEnv* km_env, jclass km_clazz, jint flags, jlong imagename, jlong dllpath, jlong symbolpath, jlong statusroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindImageEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)imagename, (void*)(uintptr_t)dllpath, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)statusroutine) : -1;
#else
    (void)flags;
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    (void)statusroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1CheckRemoteDebuggerPresent(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pbdebuggerpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckRemoteDebuggerPresent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pbdebuggerpresent) : -1;
#else
    (void)hprocess;
    (void)pbdebuggerpresent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1CheckSumMappedFile(JNIEnv* km_env, jclass km_clazz, jlong baseaddress, jint filelength, jlong headersum, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckSumMappedFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)baseaddress, (uint32_t)filelength, (void*)(uintptr_t)headersum, (void*)(uintptr_t)checksum) : NULL;
#else
    (void)baseaddress;
    (void)filelength;
    (void)headersum;
    (void)checksum;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1CloseThreadWaitChainSession(JNIEnv* km_env, jclass km_clazz, jlong wcthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadWaitChainSession");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)wcthandle);
#else
    (void)wcthandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ContinueDebugEvent(JNIEnv* km_env, jclass km_clazz, jint dwprocessid, jint dwthreadid, jint dwcontinuestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ContinueDebugEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprocessid, (uint32_t)dwthreadid, (int32_t)dwcontinuestatus) : -1;
#else
    (void)dwprocessid;
    (void)dwthreadid;
    (void)dwcontinuestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1CopyContext(JNIEnv* km_env, jclass km_clazz, jlong destination, jint contextflags, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destination, (uint32_t)contextflags, (void*)(uintptr_t)source) : -1;
#else
    (void)destination;
    (void)contextflags;
    (void)source;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DbgHelpCreateUserDump(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong callback, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgHelpCreateUserDump");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)callback, (void*)(uintptr_t)userdata) : -1;
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DbgHelpCreateUserDumpW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong callback, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgHelpCreateUserDumpW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)callback, (void*)(uintptr_t)userdata) : -1;
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DebugActiveProcess(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugActiveProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprocessid) : -1;
#else
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DebugActiveProcessStop(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugActiveProcessStop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprocessid) : -1;
#else
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DebugBreak(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugBreak");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DebugBreakProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugBreakProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process) : -1;
#else
    (void)process;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DebugSetProcessKillOnExit(JNIEnv* km_env, jclass km_clazz, jint killonexit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugSetProcessKillOnExit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)killonexit) : -1;
#else
    (void)killonexit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DecodePointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodePointer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DecodeRemotePointer(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong ptr, jlong decodedptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeRemotePointer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)ptr, (void*)(uintptr_t)decodedptr) : -1;
#else
    (void)processhandle;
    (void)ptr;
    (void)decodedptr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1DecodeSystemPointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeSystemPointer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EncodePointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodePointer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EncodeRemotePointer(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong ptr, jlong encodedptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodeRemotePointer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)ptr, (void*)(uintptr_t)encodedptr) : -1;
#else
    (void)processhandle;
    (void)ptr;
    (void)encodedptr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EncodeSystemPointer(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodeSystemPointer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptr) : NULL;
#else
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EnumDirTree(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong rootpath, jlong inputpathname, jlong outputpathbuffer, jlong cb, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDirTree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer, (void*)(uintptr_t)cb, (void*)(uintptr_t)data) : -1;
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EnumDirTreeW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong rootpath, jlong inputpathname, jlong outputpathbuffer, jlong cb, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDirTreeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer, (void*)(uintptr_t)cb, (void*)(uintptr_t)data) : -1;
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EnumerateLoadedModules64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModules64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EnumerateLoadedModulesEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EnumerateLoadedModulesExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1EnumerateLoadedModulesW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enumloadedmodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enumloadedmodulescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FatalAppExitA(JNIEnv* km_env, jclass km_clazz, jint uaction, jlong lpmessagetext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalAppExitA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)uaction, (void*)(uintptr_t)lpmessagetext);
#else
    (void)uaction;
    (void)lpmessagetext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FatalAppExitW(JNIEnv* km_env, jclass km_clazz, jint uaction, jlong lpmessagetext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalAppExitW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)uaction, (void*)(uintptr_t)lpmessagetext);
#else
    (void)uaction;
    (void)lpmessagetext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FatalExit(JNIEnv* km_env, jclass km_clazz, jint exitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalExit");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)exitcode);
#else
    (void)exitcode;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindDebugInfoFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong debugfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindDebugInfoFileEx(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFileEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindDebugInfoFileExW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFileExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindExecutableImage(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong imagefilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImage");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)imagefilepath) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindExecutableImageEx(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImageEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindExecutableImageExW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong symbolpath, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImageExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindFileInPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jlong id, jint two, jint three, jint flags, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFileInPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (void*)(uintptr_t)id, (uint32_t)two, (uint32_t)three, (uint32_t)flags, (void*)(uintptr_t)filepath) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FindFileInSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jint one, jint two, jint three, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFileInSearchPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (uint32_t)one, (uint32_t)two, (uint32_t)three, (void*)(uintptr_t)filepath) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)one;
    (void)two;
    (void)three;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FlushInstructionCache(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpbaseaddress, jlong dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushInstructionCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpbaseaddress, (uint64_t)dwsize) : -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FormatMessageA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpsource, jint dwmessageid, jint dwlanguageid, jlong lpbuffer, jint nsize, jlong arguments) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatMessageA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpsource, (uint32_t)dwmessageid, (uint32_t)dwlanguageid, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize, (void*)(uintptr_t)arguments) : 0;
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1FormatMessageW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpsource, jint dwmessageid, jint dwlanguageid, jlong lpbuffer, jint nsize, jlong arguments) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatMessageW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpsource, (uint32_t)dwmessageid, (uint32_t)dwlanguageid, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize, (void*)(uintptr_t)arguments) : 0;
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetEnabledXStateFeatures(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnabledXStateFeatures");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetErrorMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetErrorMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetImageConfigInformation(JNIEnv* km_env, jclass km_clazz, jlong loadedimage, jlong imageconfiginformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetImageConfigInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadedimage, (void*)(uintptr_t)imageconfiginformation) : -1;
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetImageUnusedHeaderBytes(JNIEnv* km_env, jclass km_clazz, jlong loadedimage, jlong sizeunusedheaderbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetImageUnusedHeaderBytes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadedimage, (void*)(uintptr_t)sizeunusedheaderbytes) : 0;
#else
    (void)loadedimage;
    (void)sizeunusedheaderbytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetSymLoadError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSymLoadError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetThreadErrorMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadErrorMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetThreadSelectorEntry(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint dwselector, jlong lpselectorentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectorEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hthread, (uint32_t)dwselector, (void*)(uintptr_t)lpselectorentry) : -1;
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetThreadWaitChain(JNIEnv* km_env, jclass km_clazz, jlong wcthandle, jlong context, jint flags, jint threadid, jlong nodecount, jlong nodeinfoarray, jlong iscycle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadWaitChain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)wcthandle, (uint64_t)context, (uint32_t)flags, (uint32_t)threadid, (void*)(uintptr_t)nodecount, (void*)(uintptr_t)nodeinfoarray, (void*)(uintptr_t)iscycle) : -1;
#else
    (void)wcthandle;
    (void)context;
    (void)flags;
    (void)threadid;
    (void)nodecount;
    (void)nodeinfoarray;
    (void)iscycle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetTimestampForLoadedLibrary(JNIEnv* km_env, jclass km_clazz, jlong module) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimestampForLoadedLibrary");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)module) : 0;
#else
    (void)module;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1GetXStateFeaturesMask(JNIEnv* km_env, jclass km_clazz, jlong context, jlong featuremask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetXStateFeaturesMask");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)featuremask) : -1;
#else
    (void)context;
    (void)featuremask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageAddCertificate(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong certificate, jlong arg_2_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageAddCertificate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)certificate, (void*)(uintptr_t)arg_2_index) : -1;
#else
    (void)filehandle;
    (void)certificate;
    (void)arg_2_index;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageDirectoryEntryToData(JNIEnv* km_env, jclass km_clazz, jlong base, jboolean mappedasimage, jshort directoryentry, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageDirectoryEntryToData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)base, (bool)mappedasimage, (uint16_t)directoryentry, (void*)(uintptr_t)size) : NULL;
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageDirectoryEntryToDataEx(JNIEnv* km_env, jclass km_clazz, jlong base, jboolean mappedasimage, jshort directoryentry, jlong size, jlong foundheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageDirectoryEntryToDataEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)base, (bool)mappedasimage, (uint16_t)directoryentry, (void*)(uintptr_t)size, (void*)(uintptr_t)foundheader) : NULL;
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    (void)foundheader;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageEnumerateCertificates(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jshort typefilter, jlong certificatecount, jlong indices, jint indexcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageEnumerateCertificates");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint16_t)typefilter, (void*)(uintptr_t)certificatecount, (void*)(uintptr_t)indices, (uint32_t)indexcount) : -1;
#else
    (void)filehandle;
    (void)typefilter;
    (void)certificatecount;
    (void)indices;
    (void)indexcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageGetCertificateData(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint certificateindex, jlong certificate, jlong requiredlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetCertificateData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)certificateindex, (void*)(uintptr_t)certificate, (void*)(uintptr_t)requiredlength) : -1;
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificate;
    (void)requiredlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageGetCertificateHeader(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint certificateindex, jlong certificateheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetCertificateHeader");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)certificateindex, (void*)(uintptr_t)certificateheader) : -1;
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificateheader;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageGetDigestStream(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint digestlevel, jlong digestfunction, jlong digesthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetDigestStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)digestlevel, (void*)(uintptr_t)digestfunction, (void*)(uintptr_t)digesthandle) : -1;
#else
    (void)filehandle;
    (void)digestlevel;
    (void)digestfunction;
    (void)digesthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageLoad(JNIEnv* km_env, jclass km_clazz, jlong dllname, jlong dllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageLoad");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dllname, (void*)(uintptr_t)dllpath) : NULL;
#else
    (void)dllname;
    (void)dllpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageNtHeader(JNIEnv* km_env, jclass km_clazz, jlong base) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageNtHeader");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)base) : NULL;
#else
    (void)base;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageRemoveCertificate(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint arg_1_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRemoveCertificate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)arg_1_index) : -1;
#else
    (void)filehandle;
    (void)arg_1_index;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageRvaToSection(JNIEnv* km_env, jclass km_clazz, jlong ntheaders, jlong base, jint rva) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRvaToSection");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ntheaders, (void*)(uintptr_t)base, (uint32_t)rva) : NULL;
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageRvaToVa(JNIEnv* km_env, jclass km_clazz, jlong ntheaders, jlong base, jint rva, jlong lastrvasection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRvaToVa");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ntheaders, (void*)(uintptr_t)base, (uint32_t)rva, (void*)(uintptr_t)lastrvasection) : NULL;
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    (void)lastrvasection;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImageUnload(JNIEnv* km_env, jclass km_clazz, jlong loadedimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageUnload");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadedimage) : -1;
#else
    (void)loadedimage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImagehlpApiVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImagehlpApiVersion");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ImagehlpApiVersionEx(JNIEnv* km_env, jclass km_clazz, jlong appversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImagehlpApiVersionEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)appversion) : NULL;
#else
    (void)appversion;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1InitializeContext(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint contextflags, jlong context, jlong contextlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)contextflags, (void*)(uintptr_t)context, (void*)(uintptr_t)contextlength) : -1;
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1InitializeContext2(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint contextflags, jlong context, jlong contextlength, jlong xstatecompactionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeContext2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)contextflags, (void*)(uintptr_t)context, (void*)(uintptr_t)contextlength, (uint64_t)xstatecompactionmask) : -1;
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    (void)xstatecompactionmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1IsDebuggerPresent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDebuggerPresent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1LocateXStateFeature(JNIEnv* km_env, jclass km_clazz, jlong context, jint featureid, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocateXStateFeature");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (uint32_t)featureid, (void*)(uintptr_t)length) : NULL;
#else
    (void)context;
    (void)featureid;
    (void)length;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MakeSureDirectoryPathExists(JNIEnv* km_env, jclass km_clazz, jlong dirpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSureDirectoryPathExists");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dirpath) : -1;
#else
    (void)dirpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MapAndLoad(JNIEnv* km_env, jclass km_clazz, jlong imagename, jlong dllpath, jlong loadedimage, jint dotdll, jint readonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapAndLoad");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagename, (void*)(uintptr_t)dllpath, (void*)(uintptr_t)loadedimage, (int32_t)dotdll, (int32_t)readonly) : -1;
#else
    (void)imagename;
    (void)dllpath;
    (void)loadedimage;
    (void)dotdll;
    (void)readonly;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MapFileAndCheckSumA(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong headersum, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapFileAndCheckSumA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)headersum, (void*)(uintptr_t)checksum) : 0;
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MapFileAndCheckSumW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong headersum, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapFileAndCheckSumW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)headersum, (void*)(uintptr_t)checksum) : 0;
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MessageBeep(JNIEnv* km_env, jclass km_clazz, jint utype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBeep");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)utype) : -1;
#else
    (void)utype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MiniDumpReadDumpStream(JNIEnv* km_env, jclass km_clazz, jlong baseofdump, jint streamnumber, jlong dir, jlong streampointer, jlong streamsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MiniDumpReadDumpStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)baseofdump, (uint32_t)streamnumber, (void*)(uintptr_t)dir, (void*)(uintptr_t)streampointer, (void*)(uintptr_t)streamsize) : -1;
#else
    (void)baseofdump;
    (void)streamnumber;
    (void)dir;
    (void)streampointer;
    (void)streamsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1MiniDumpWriteDump(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint processid, jlong hfile, jint dumptype, jlong exceptionparam, jlong userstreamparam, jlong callbackparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MiniDumpWriteDump");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)processid, (void*)(uintptr_t)hfile, (int32_t)dumptype, (void*)(uintptr_t)exceptionparam, (void*)(uintptr_t)userstreamparam, (void*)(uintptr_t)callbackparam) : -1;
#else
    (void)hprocess;
    (void)processid;
    (void)hfile;
    (void)dumptype;
    (void)exceptionparam;
    (void)userstreamparam;
    (void)callbackparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1OpenThreadWaitChainSession(JNIEnv* km_env, jclass km_clazz, jint flags, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThreadWaitChainSession");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)callback) : NULL;
#else
    (void)flags;
    (void)callback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1OutputDebugStringA(JNIEnv* km_env, jclass km_clazz, jlong lpoutputstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OutputDebugStringA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpoutputstring);
#else
    (void)lpoutputstring;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1OutputDebugStringW(JNIEnv* km_env, jclass km_clazz, jlong lpoutputstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OutputDebugStringW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpoutputstring);
#else
    (void)lpoutputstring;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RaiseException(JNIEnv* km_env, jclass km_clazz, jint dwexceptioncode, jint dwexceptionflags, jint nnumberofarguments, jlong lparguments) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseException");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwexceptioncode, (uint32_t)dwexceptionflags, (uint32_t)nnumberofarguments, (void*)(uintptr_t)lparguments);
#else
    (void)dwexceptioncode;
    (void)dwexceptionflags;
    (void)nnumberofarguments;
    (void)lparguments;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RaiseFailFastException(JNIEnv* km_env, jclass km_clazz, jlong pexceptionrecord, jlong pcontextrecord, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseFailFastException");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pexceptionrecord, (void*)(uintptr_t)pcontextrecord, (uint32_t)dwflags);
#else
    (void)pexceptionrecord;
    (void)pcontextrecord;
    (void)dwflags;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RangeMapAddPeImageSections(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong imagename, jlong mappedimage, jint mappingbytes, jlong imagebase, jlong usertag, jint mappingflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapAddPeImageSections");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rmaphandle, (void*)(uintptr_t)imagename, (void*)(uintptr_t)mappedimage, (uint32_t)mappingbytes, (uint64_t)imagebase, (uint64_t)usertag, (uint32_t)mappingflags) : -1;
#else
    (void)rmaphandle;
    (void)imagename;
    (void)mappedimage;
    (void)mappingbytes;
    (void)imagebase;
    (void)usertag;
    (void)mappingflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RangeMapCreate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapCreate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RangeMapFree(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)rmaphandle);
#else
    (void)rmaphandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RangeMapRead(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong offset, jlong buffer, jint requestbytes, jint flags, jlong donebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rmaphandle, (uint64_t)offset, (void*)(uintptr_t)buffer, (uint32_t)requestbytes, (uint32_t)flags, (void*)(uintptr_t)donebytes) : -1;
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RangeMapRemove(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong usertag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapRemove");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rmaphandle, (uint64_t)usertag) : -1;
#else
    (void)rmaphandle;
    (void)usertag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RangeMapWrite(JNIEnv* km_env, jclass km_clazz, jlong rmaphandle, jlong offset, jlong buffer, jint requestbytes, jint flags, jlong donebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rmaphandle, (uint64_t)offset, (void*)(uintptr_t)buffer, (uint32_t)requestbytes, (uint32_t)flags, (void*)(uintptr_t)donebytes) : -1;
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ReBaseImage(JNIEnv* km_env, jclass km_clazz, jlong currentimagename, jlong symbolpath, jint frebase, jint frebasesysfileok, jint fgoingdown, jint checkimagesize, jlong oldimagesize, jlong oldimagebase, jlong newimagesize, jlong newimagebase, jint timestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReBaseImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)currentimagename, (void*)(uintptr_t)symbolpath, (int32_t)frebase, (int32_t)frebasesysfileok, (int32_t)fgoingdown, (uint32_t)checkimagesize, (void*)(uintptr_t)oldimagesize, (void*)(uintptr_t)oldimagebase, (void*)(uintptr_t)newimagesize, (void*)(uintptr_t)newimagebase, (uint32_t)timestamp) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ReBaseImage64(JNIEnv* km_env, jclass km_clazz, jlong currentimagename, jlong symbolpath, jint frebase, jint frebasesysfileok, jint fgoingdown, jint checkimagesize, jlong oldimagesize, jlong oldimagebase, jlong newimagesize, jlong newimagebase, jint timestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReBaseImage64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)currentimagename, (void*)(uintptr_t)symbolpath, (int32_t)frebase, (int32_t)frebasesysfileok, (int32_t)fgoingdown, (uint32_t)checkimagesize, (void*)(uintptr_t)oldimagesize, (void*)(uintptr_t)oldimagebase, (void*)(uintptr_t)newimagesize, (void*)(uintptr_t)newimagebase, (uint32_t)timestamp) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ReadProcessMemory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpbaseaddress, jlong lpbuffer, jlong nsize, jlong lpnumberofbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadProcessMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpbaseaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)nsize, (void*)(uintptr_t)lpnumberofbytesread) : -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RegisterWaitChainCOMCallback(JNIEnv* km_env, jclass km_clazz, jlong callstatecallback, jlong activationstatecallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitChainCOMCallback");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callstatecallback, (void*)(uintptr_t)activationstatecallback);
#else
    (void)callstatecallback;
    (void)activationstatecallback;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RemoveInvalidModuleList(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveInvalidModuleList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hprocess);
#else
    (void)hprocess;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RemoveVectoredContinueHandler(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveVectoredContinueHandler");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RemoveVectoredExceptionHandler(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveVectoredExceptionHandler");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1ReportSymbolLoadSummary(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong ploadmodule, jlong psymboldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportSymbolLoadSummary");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)ploadmodule, (void*)(uintptr_t)psymboldata) : -1;
#else
    (void)hprocess;
    (void)ploadmodule;
    (void)psymboldata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlAddFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong functiontable, jint entrycount, jlong baseaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddFunctionTable");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)functiontable, (uint32_t)entrycount, (uint64_t)baseaddress) : false;
#else
    (void)functiontable;
    (void)entrycount;
    (void)baseaddress;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlAddGrowableFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong dynamictable, jlong functiontable, jint entrycount, jint maximumentrycount, jlong rangebase, jlong rangeend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddGrowableFunctionTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dynamictable, (void*)(uintptr_t)functiontable, (uint32_t)entrycount, (uint32_t)maximumentrycount, (uint64_t)rangebase, (uint64_t)rangeend) : 0;
#else
    (void)dynamictable;
    (void)functiontable;
    (void)entrycount;
    (void)maximumentrycount;
    (void)rangebase;
    (void)rangeend;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlCaptureContext(JNIEnv* km_env, jclass km_clazz, jlong contextrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)contextrecord);
#else
    (void)contextrecord;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlCaptureContext2(JNIEnv* km_env, jclass km_clazz, jlong contextrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureContext2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)contextrecord);
#else
    (void)contextrecord;
#endif
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlCaptureStackBackTrace(JNIEnv* km_env, jclass km_clazz, jint framestoskip, jint framestocapture, jlong backtrace, jlong backtracehash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureStackBackTrace");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)framestoskip, (uint32_t)framestocapture, (void*)(uintptr_t)backtrace, (void*)(uintptr_t)backtracehash) : 0;
#else
    (void)framestoskip;
    (void)framestocapture;
    (void)backtrace;
    (void)backtracehash;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlDeleteFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong functiontable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteFunctionTable");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)functiontable) : false;
#else
    (void)functiontable;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlDeleteGrowableFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong dynamictable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteGrowableFunctionTable");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)dynamictable);
#else
    (void)dynamictable;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlGrowFunctionTable(JNIEnv* km_env, jclass km_clazz, jlong dynamictable, jint newentrycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGrowFunctionTable");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)dynamictable, (uint32_t)newentrycount);
#else
    (void)dynamictable;
    (void)newentrycount;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlInstallFunctionTableCallback(JNIEnv* km_env, jclass km_clazz, jlong tableidentifier, jlong baseaddress, jint length, jlong callback, jlong context, jlong outofprocesscallbackdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInstallFunctionTableCallback");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tableidentifier, (uint64_t)baseaddress, (uint32_t)length, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)outofprocesscallbackdll) : false;
#else
    (void)tableidentifier;
    (void)baseaddress;
    (void)length;
    (void)callback;
    (void)context;
    (void)outofprocesscallbackdll;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlLookupFunctionEntry(JNIEnv* km_env, jclass km_clazz, jlong controlpc, jlong imagebase, jlong historytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupFunctionEntry");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)controlpc, (void*)(uintptr_t)imagebase, (void*)(uintptr_t)historytable) : NULL;
#else
    (void)controlpc;
    (void)imagebase;
    (void)historytable;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlPcToFileHeader(JNIEnv* km_env, jclass km_clazz, jlong pcvalue, jlong baseofimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPcToFileHeader");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcvalue, (void*)(uintptr_t)baseofimage) : NULL;
#else
    (void)pcvalue;
    (void)baseofimage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlRaiseException(JNIEnv* km_env, jclass km_clazz, jlong exceptionrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRaiseException");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)exceptionrecord);
#else
    (void)exceptionrecord;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlRestoreContext(JNIEnv* km_env, jclass km_clazz, jlong contextrecord, jlong exceptionrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRestoreContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)contextrecord, (void*)(uintptr_t)exceptionrecord);
#else
    (void)contextrecord;
    (void)exceptionrecord;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlUnwind(JNIEnv* km_env, jclass km_clazz, jlong targetframe, jlong targetip, jlong exceptionrecord, jlong returnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnwind");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)targetframe, (void*)(uintptr_t)targetip, (void*)(uintptr_t)exceptionrecord, (void*)(uintptr_t)returnvalue);
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1RtlUnwindEx(JNIEnv* km_env, jclass km_clazz, jlong targetframe, jlong targetip, jlong exceptionrecord, jlong returnvalue, jlong contextrecord, jlong historytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnwindEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)targetframe, (void*)(uintptr_t)targetip, (void*)(uintptr_t)exceptionrecord, (void*)(uintptr_t)returnvalue, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)historytable);
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
    (void)contextrecord;
    (void)historytable;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SearchTreeForFile(JNIEnv* km_env, jclass km_clazz, jlong rootpath, jlong inputpathname, jlong outputpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchTreeForFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer) : -1;
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SearchTreeForFileW(JNIEnv* km_env, jclass km_clazz, jlong rootpath, jlong inputpathname, jlong outputpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchTreeForFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpath, (void*)(uintptr_t)inputpathname, (void*)(uintptr_t)outputpathbuffer) : -1;
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetCheckUserInterruptShared(JNIEnv* km_env, jclass km_clazz, jlong lpstartaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCheckUserInterruptShared");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpstartaddress);
#else
    (void)lpstartaddress;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetErrorMode(JNIEnv* km_env, jclass km_clazz, jint umode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetErrorMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)umode) : 0;
#else
    (void)umode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetImageConfigInformation(JNIEnv* km_env, jclass km_clazz, jlong loadedimage, jlong imageconfiginformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetImageConfigInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadedimage, (void*)(uintptr_t)imageconfiginformation) : -1;
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetSymLoadError(JNIEnv* km_env, jclass km_clazz, jint error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSymLoadError");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)error);
#else
    (void)error;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetThreadErrorMode(JNIEnv* km_env, jclass km_clazz, jint dwnewmode, jlong lpoldmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadErrorMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnewmode, (void*)(uintptr_t)lpoldmode) : -1;
#else
    (void)dwnewmode;
    (void)lpoldmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetUnhandledExceptionFilter(JNIEnv* km_env, jclass km_clazz, jlong lptoplevelexceptionfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUnhandledExceptionFilter");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptoplevelexceptionfilter) : NULL;
#else
    (void)lptoplevelexceptionfilter;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SetXStateFeaturesMask(JNIEnv* km_env, jclass km_clazz, jlong context, jlong featuremask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetXStateFeaturesMask");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (uint64_t)featuremask) : -1;
#else
    (void)context;
    (void)featuremask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1StackWalk2(JNIEnv* km_env, jclass km_clazz, jint machinetype, jlong hprocess, jlong hthread, jlong stackframe, jlong contextrecord, jlong readmemoryroutine, jlong functiontableaccessroutine, jlong getmodulebaseroutine, jlong translateaddress, jlong gettargetattributevalue, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalk2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)machinetype, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)functiontableaccessroutine, (void*)(uintptr_t)getmodulebaseroutine, (void*)(uintptr_t)translateaddress, (void*)(uintptr_t)gettargetattributevalue, (uint32_t)flags) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1StackWalk64(JNIEnv* km_env, jclass km_clazz, jint machinetype, jlong hprocess, jlong hthread, jlong stackframe, jlong contextrecord, jlong readmemoryroutine, jlong functiontableaccessroutine, jlong getmodulebaseroutine, jlong translateaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalk64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)machinetype, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)functiontableaccessroutine, (void*)(uintptr_t)getmodulebaseroutine, (void*)(uintptr_t)translateaddress) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1StackWalkEx(JNIEnv* km_env, jclass km_clazz, jint machinetype, jlong hprocess, jlong hthread, jlong stackframe, jlong contextrecord, jlong readmemoryroutine, jlong functiontableaccessroutine, jlong getmodulebaseroutine, jlong translateaddress, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalkEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)machinetype, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)contextrecord, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)functiontableaccessroutine, (void*)(uintptr_t)getmodulebaseroutine, (void*)(uintptr_t)translateaddress, (uint32_t)flags) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymAddSourceStream(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong streamfile, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)streamfile, (void*)(uintptr_t)buffer, (uint64_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymAddSourceStreamA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong streamfile, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStreamA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)streamfile, (void*)(uintptr_t)buffer, (uint64_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymAddSourceStreamW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStreamW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)buffer, (uint64_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymAddSymbol(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSymbol");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)size, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymAddSymbolW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSymbolW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)size, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymAddrIncludeInlineTrace(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddrIncludeInlineTrace");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address) : 0;
#else
    (void)hprocess;
    (void)address;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymCleanup(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymCleanup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymCompareInlineTrace(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address1, jint inlinecontext1, jlong retaddress1, jlong address2, jlong retaddress2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymCompareInlineTrace");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address1, (uint32_t)inlinecontext1, (uint64_t)retaddress1, (uint64_t)address2, (uint64_t)retaddress2) : 0;
#else
    (void)hprocess;
    (void)address1;
    (void)inlinecontext1;
    (void)retaddress1;
    (void)address2;
    (void)retaddress2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymDeleteSymbol(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymDeleteSymbol");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymDeleteSymbolW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong address, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymDeleteSymbolW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (uint64_t)address, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumLines(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumLines");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumLinesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumLinesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumProcesses(JNIEnv* km_env, jclass km_clazz, jlong enumprocessescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumProcesses");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumprocessescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)enumprocessescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSourceFileTokens(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFileTokens");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)callback) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)callback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSourceFiles(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jlong mask, jlong cbsrcfiles, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (void*)(uintptr_t)mask, (void*)(uintptr_t)cbsrcfiles, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSourceFilesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jlong mask, jlong cbsrcfiles, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFilesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (void*)(uintptr_t)mask, (void*)(uintptr_t)cbsrcfiles, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSourceLines(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jint line, jint flags, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceLines");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (uint32_t)line, (uint32_t)flags, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSourceLinesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong obj, jlong file, jint line, jint flags, jlong enumlinescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceLinesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)obj, (void*)(uintptr_t)file, (uint32_t)line, (uint32_t)flags, (void*)(uintptr_t)enumlinescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSym(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSym");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSymbols(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbols");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSymbolsEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSymbolsExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSymbolsForAddr(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsForAddr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSymbolsForAddrW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsForAddrW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumSymbolsW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumTypes(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumTypesByName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumTypesByNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong mask, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesByNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)mask, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumTypesW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumerateModules64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enummodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateModules64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enummodulescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumerateModulesW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong enummodulescallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateModulesW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)enummodulescallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumerateSymbols64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateSymbols64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymEnumerateSymbolsW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong enumsymbolscallback, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateSymbolsW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFindDebugInfoFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindDebugInfoFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFindDebugInfoFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong debugfilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindDebugInfoFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFindExecutableImage(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindExecutableImage");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFindExecutableImageW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong filename, jlong imagefilepath, jlong callback, jlong callerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindExecutableImageW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)filename, (void*)(uintptr_t)imagefilepath, (void*)(uintptr_t)callback, (void*)(uintptr_t)callerdata) : NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFindFileInPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jlong id, jint two, jint three, jint flags, jlong foundfile, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindFileInPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (void*)(uintptr_t)id, (uint32_t)two, (uint32_t)three, (uint32_t)flags, (void*)(uintptr_t)foundfile, (void*)(uintptr_t)callback, (void*)(uintptr_t)context) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFindFileInPathW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jlong filename, jlong id, jint two, jint three, jint flags, jlong foundfile, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindFileInPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (void*)(uintptr_t)filename, (void*)(uintptr_t)id, (uint32_t)two, (uint32_t)three, (uint32_t)flags, (void*)(uintptr_t)foundfile, (void*)(uintptr_t)callback, (void*)(uintptr_t)context) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromAddr(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromAddr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromAddrW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromAddrW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromIndex(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromIndexW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromInlineContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jint inlinecontext, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromInlineContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (uint32_t)inlinecontext, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromInlineContextW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jint inlinecontext, jlong displacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromInlineContextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (uint32_t)inlinecontext, (void*)(uintptr_t)displacement, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jint token, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (uint32_t)token, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFromTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jint token, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromTokenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (uint32_t)token, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFunctionTableAccess64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong addrbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFunctionTableAccess64");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)addrbase) : NULL;
#else
    (void)hprocess;
    (void)addrbase;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymFunctionTableAccess64AccessRoutines(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong addrbase, jlong readmemoryroutine, jlong getmodulebaseroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFunctionTableAccess64AccessRoutines");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)addrbase, (void*)(uintptr_t)readmemoryroutine, (void*)(uintptr_t)getmodulebaseroutine) : NULL;
#else
    (void)hprocess;
    (void)addrbase;
    (void)readmemoryroutine;
    (void)getmodulebaseroutine;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetExtendedOption(JNIEnv* km_env, jclass km_clazz, jint option) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetExtendedOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)option) : -1;
#else
    (void)option;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetFileLineOffsets64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modulename, jlong filename, jlong buffer, jint bufferlines) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetFileLineOffsets64");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)modulename, (void*)(uintptr_t)filename, (void*)(uintptr_t)buffer, (uint32_t)bufferlines) : 0;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)buffer;
    (void)bufferlines;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetHomeDirectory(JNIEnv* km_env, jclass km_clazz, jint type, jlong dir, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetHomeDirectory");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)type, (void*)(uintptr_t)dir, (uint64_t)size) : NULL;
#else
    (void)type;
    (void)dir;
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetHomeDirectoryW(JNIEnv* km_env, jclass km_clazz, jint type, jlong dir, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetHomeDirectoryW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)type, (void*)(uintptr_t)dir, (uint64_t)size) : NULL;
#else
    (void)type;
    (void)dir;
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineFromAddr64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong pdwdisplacement, jlong line64) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromAddr64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line64) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)line64;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineFromAddrW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwaddr, jlong pdwdisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromAddrW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwaddr, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)dwaddr;
    (void)pdwdisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineFromInlineContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jint inlinecontext, jlong qwmodulebaseaddress, jlong pdwdisplacement, jlong line64) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromInlineContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (uint32_t)inlinecontext, (uint64_t)qwmodulebaseaddress, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line64) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line64;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineFromInlineContextW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwaddr, jint inlinecontext, jlong qwmodulebaseaddress, jlong pdwdisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromInlineContextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwaddr, (uint32_t)inlinecontext, (uint64_t)qwmodulebaseaddress, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)dwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineFromName64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modulename, jlong filename, jint dwlinenumber, jlong pldisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromName64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)modulename, (void*)(uintptr_t)filename, (uint32_t)dwlinenumber, (void*)(uintptr_t)pldisplacement, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineFromNameW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modulename, jlong filename, jint dwlinenumber, jlong pldisplacement, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromNameW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)modulename, (void*)(uintptr_t)filename, (uint32_t)dwlinenumber, (void*)(uintptr_t)pldisplacement, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineNext64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineNext64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLineNextW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineNextW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLinePrev64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLinePrev64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetLinePrevW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong line) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLinePrevW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)line) : -1;
#else
    (void)hprocess;
    (void)line;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetModuleBase64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleBase64");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr) : 0;
#else
    (void)hprocess;
    (void)qwaddr;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetModuleInfo64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong moduleinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleInfo64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)moduleinfo) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetModuleInfoW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong moduleinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleInfoW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)moduleinfo) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetOmaps(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong omapto, jlong comapto, jlong omapfrom, jlong comapfrom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetOmaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)omapto, (void*)(uintptr_t)comapto, (void*)(uintptr_t)omapfrom, (void*)(uintptr_t)comapfrom) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)omapto;
    (void)comapto;
    (void)omapfrom;
    (void)comapfrom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetOptions(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetScope(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetScope");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetScopeW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetScopeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jint searchpathlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSearchPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (uint32_t)searchpathlength) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSearchPathW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha, jint searchpathlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSearchPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha, (uint32_t)searchpathlength) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong params, jlong filespec, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)params, (void*)(uintptr_t)filespec, (void*)(uintptr_t)filepath, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileChecksum(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong pchecksumtype, jlong pchecksum, jint checksumsize, jlong pactualbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileChecksum");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)pchecksumtype, (void*)(uintptr_t)pchecksum, (uint32_t)checksumsize, (void*)(uintptr_t)pactualbyteswritten) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileChecksumW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong pchecksumtype, jlong pchecksum, jint checksumsize, jlong pactualbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileChecksumW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)pchecksumtype, (void*)(uintptr_t)pchecksum, (uint32_t)checksumsize, (void*)(uintptr_t)pactualbyteswritten) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileFromToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileFromTokenByTokenName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong tokenname, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileFromTokenByTokenNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong tokenname, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileFromTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)filepath, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)token, (void*)(uintptr_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileTokenByTokenName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong tokenname, jlong tokenparameters, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)tokenparameters, (void*)(uintptr_t)token, (void*)(uintptr_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileTokenByTokenNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong tokenname, jlong tokenparameters, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)tokenname, (void*)(uintptr_t)tokenparameters, (void*)(uintptr_t)token, (void*)(uintptr_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong filespec, jlong token, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)filespec, (void*)(uintptr_t)token, (void*)(uintptr_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong base, jlong params, jlong filespec, jlong filepath, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)base, (void*)(uintptr_t)params, (void*)(uintptr_t)filespec, (void*)(uintptr_t)filepath, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceVarFromToken(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong varname, jlong value, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceVarFromToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)varname, (void*)(uintptr_t)value, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSourceVarFromTokenW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong token, jlong params, jlong varname, jlong value, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceVarFromTokenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)token, (void*)(uintptr_t)params, (void*)(uintptr_t)varname, (void*)(uintptr_t)value, (uint32_t)size) : -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSymFromAddr64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong qwaddr, jlong pdwdisplacement, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymFromAddr64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)qwaddr, (void*)(uintptr_t)pdwdisplacement, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSymFromName64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymFromName64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSymNext64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymNext64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSymPrev64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymPrev64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSymbolFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong imagefile, jint type, jlong symbolfile, jlong csymbolfile, jlong dbgfile, jlong cdbgfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymbolFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)imagefile, (uint32_t)type, (void*)(uintptr_t)symbolfile, (uint64_t)csymbolfile, (void*)(uintptr_t)dbgfile, (uint64_t)cdbgfile) : -1;
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetSymbolFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong imagefile, jint type, jlong symbolfile, jlong csymbolfile, jlong dbgfile, jlong cdbgfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymbolFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)imagefile, (uint32_t)type, (void*)(uintptr_t)symbolfile, (uint64_t)csymbolfile, (void*)(uintptr_t)dbgfile, (uint64_t)cdbgfile) : -1;
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetTypeFromName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetTypeFromNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jlong name, jlong symbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeFromNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (void*)(uintptr_t)name, (void*)(uintptr_t)symbol) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetTypeInfo(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jint typeid, jint gettype, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (uint32_t)typeid, (int32_t)gettype, (void*)(uintptr_t)pinfo) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)typeid;
    (void)gettype;
    (void)pinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetTypeInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong modbase, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeInfoEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)modbase, (void*)(uintptr_t)params) : -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)params;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymGetUnwindInfo(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetUnwindInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (void*)(uintptr_t)buffer, (void*)(uintptr_t)size) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymInitialize(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong usersearchpath, jint finvadeprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymInitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)usersearchpath, (int32_t)finvadeprocess) : -1;
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymInitializeW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong usersearchpath, jint finvadeprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymInitializeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)usersearchpath, (int32_t)finvadeprocess) : -1;
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymLoadModule64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hfile, jlong imagename, jlong modulename, jlong baseofdll, jint sizeofdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModule64");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hfile, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseofdll, (uint32_t)sizeofdll) : 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)sizeofdll;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymLoadModuleEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hfile, jlong imagename, jlong modulename, jlong baseofdll, jint dllsize, jlong data, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModuleEx");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hfile, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseofdll, (uint32_t)dllsize, (void*)(uintptr_t)data, (uint32_t)flags) : 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymLoadModuleExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hfile, jlong imagename, jlong modulename, jlong baseofdll, jint dllsize, jlong data, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModuleExW");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hfile, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseofdll, (uint32_t)dllsize, (void*)(uintptr_t)data, (uint32_t)flags) : 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymMatchFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong match, jlong filenamestop, jlong matchstop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchFileName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)match, (void*)(uintptr_t)filenamestop, (void*)(uintptr_t)matchstop) : -1;
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymMatchFileNameW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong match, jlong filenamestop, jlong matchstop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchFileNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)match, (void*)(uintptr_t)filenamestop, (void*)(uintptr_t)matchstop) : -1;
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymMatchString(JNIEnv* km_env, jclass km_clazz, jlong string, jlong expression, jint fcase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)expression, (int32_t)fcase) : -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymMatchStringA(JNIEnv* km_env, jclass km_clazz, jlong string, jlong expression, jint fcase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)expression, (int32_t)fcase) : -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymMatchStringW(JNIEnv* km_env, jclass km_clazz, jlong string, jlong expression, jint fcase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)expression, (int32_t)fcase) : -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymNext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong si) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)si) : -1;
#else
    (void)hprocess;
    (void)si;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymNextW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong siw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymNextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)siw) : -1;
#else
    (void)hprocess;
    (void)siw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymPrev(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong si) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymPrev");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)si) : -1;
#else
    (void)hprocess;
    (void)si;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymPrevW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong siw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymPrevW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)siw) : -1;
#else
    (void)hprocess;
    (void)siw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymQueryInlineTrace(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong startaddress, jint startcontext, jlong startretaddress, jlong curaddress, jlong curcontext, jlong curframeindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymQueryInlineTrace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)startaddress, (uint32_t)startcontext, (uint64_t)startretaddress, (uint64_t)curaddress, (void*)(uintptr_t)curcontext, (void*)(uintptr_t)curframeindex) : -1;
#else
    (void)hprocess;
    (void)startaddress;
    (void)startcontext;
    (void)startretaddress;
    (void)curaddress;
    (void)curcontext;
    (void)curframeindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymRefreshModuleList(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRefreshModuleList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymRegisterCallback64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong callbackfunction, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterCallback64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)callbackfunction, (uint64_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymRegisterCallbackW64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong callbackfunction, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterCallbackW64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)callbackfunction, (uint64_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymRegisterFunctionEntryCallback64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong callbackfunction, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterFunctionEntryCallback64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)callbackfunction, (uint64_t)usercontext) : -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSearch(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index, jint symtag, jlong mask, jlong address, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSearch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index, (uint32_t)symtag, (void*)(uintptr_t)mask, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSearchW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index, jint symtag, jlong mask, jlong address, jlong enumsymbolscallback, jlong usercontext, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSearchW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index, (uint32_t)symtag, (void*)(uintptr_t)mask, (uint64_t)address, (void*)(uintptr_t)enumsymbolscallback, (void*)(uintptr_t)usercontext, (uint32_t)options) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong stackframe, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)stackframe, (void*)(uintptr_t)context) : -1;
#else
    (void)hprocess;
    (void)stackframe;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetExtendedOption(JNIEnv* km_env, jclass km_clazz, jint option, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetExtendedOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)option, (int32_t)value) : -1;
#else
    (void)option;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetHomeDirectory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetHomeDirectory");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)dir) : NULL;
#else
    (void)hprocess;
    (void)dir;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetHomeDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetHomeDirectoryW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)dir) : NULL;
#else
    (void)hprocess;
    (void)dir;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetOptions(JNIEnv* km_env, jclass km_clazz, jint symoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)symoptions) : 0;
#else
    (void)symoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetParentWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetParentWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetScopeFromAddr(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromAddr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address) : -1;
#else
    (void)hprocess;
    (void)address;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetScopeFromIndex(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll, jint arg_2_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll, (uint32_t)arg_2_index) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg_2_index;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetScopeFromInlineContext(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong address, jint inlinecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromInlineContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)address, (uint32_t)inlinecontext) : -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetSearchPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSetSearchPathW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong searchpatha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetSearchPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)searchpatha) : -1;
#else
    (void)hprocess;
    (void)searchpatha;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvDeltaName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong type, jlong file1, jlong file2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvDeltaName");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)type, (void*)(uintptr_t)file1, (void*)(uintptr_t)file2) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvDeltaNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong type, jlong file1, jlong file2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvDeltaNameW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)type, (void*)(uintptr_t)file1, (void*)(uintptr_t)file2) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetFileIndexInfo(JNIEnv* km_env, jclass km_clazz, jlong file, jlong info, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)info, (uint32_t)flags) : -1;
#else
    (void)file;
    (void)info;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetFileIndexInfoW(JNIEnv* km_env, jclass km_clazz, jlong file, jlong info, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)info, (uint32_t)flags) : -1;
#else
    (void)file;
    (void)info;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetFileIndexString(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jlong arg_3_index, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (void*)(uintptr_t)arg_3_index, (uint64_t)size, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg_3_index;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetFileIndexStringW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jlong arg_3_index, jlong size, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (void*)(uintptr_t)arg_3_index, (uint64_t)size, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg_3_index;
    (void)size;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetFileIndexes(JNIEnv* km_env, jclass km_clazz, jlong file, jlong id, jlong val1, jlong val2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)id, (void*)(uintptr_t)val1, (void*)(uintptr_t)val2, (uint32_t)flags) : -1;
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetFileIndexesW(JNIEnv* km_env, jclass km_clazz, jlong file, jlong id, jlong val1, jlong val2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)id, (void*)(uintptr_t)val1, (void*)(uintptr_t)val2, (uint32_t)flags) : -1;
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetSupplement(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong node, jlong file) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetSupplement");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)node, (void*)(uintptr_t)file) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvGetSupplementW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong node, jlong file) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetSupplementW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)node, (void*)(uintptr_t)file) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvIsStore(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvIsStore");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)path) : -1;
#else
    (void)hprocess;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvIsStoreW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvIsStoreW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)path) : -1;
#else
    (void)hprocess;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvStoreFile(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (uint32_t)flags) : NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvStoreFileW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)file, (uint32_t)flags) : NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvStoreSupplement(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong srvpath, jlong node, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreSupplement");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)srvpath, (void*)(uintptr_t)node, (void*)(uintptr_t)file, (uint32_t)flags) : NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)node;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymSrvStoreSupplementW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong sympath, jlong node, jlong file, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreSupplementW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)sympath, (void*)(uintptr_t)node, (void*)(uintptr_t)file, (uint32_t)flags) : NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymUnDName64(JNIEnv* km_env, jclass km_clazz, jlong sym, jlong undecname, jint undecnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymUnDName64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sym, (void*)(uintptr_t)undecname, (uint32_t)undecnamelength) : -1;
#else
    (void)sym;
    (void)undecname;
    (void)undecnamelength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1SymUnloadModule64(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong baseofdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymUnloadModule64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)baseofdll) : -1;
#else
    (void)hprocess;
    (void)baseofdll;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1TerminateProcessOnMemoryExhaustion(JNIEnv* km_env, jclass km_clazz, jlong failedallocationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-errorhandling-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateProcessOnMemoryExhaustion");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint64_t)failedallocationsize);
#else
    (void)failedallocationsize;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1TouchFileTimes(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong psystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TouchFileTimes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)psystemtime) : -1;
#else
    (void)filehandle;
    (void)psystemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1UnDecorateSymbolName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong outputstring, jint maxstringlength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnDecorateSymbolName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)outputstring, (uint32_t)maxstringlength, (uint32_t)flags) : 0;
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1UnDecorateSymbolNameW(JNIEnv* km_env, jclass km_clazz, jlong name, jlong outputstring, jint maxstringlength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnDecorateSymbolNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)outputstring, (uint32_t)maxstringlength, (uint32_t)flags) : 0;
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1UnMapAndLoad(JNIEnv* km_env, jclass km_clazz, jlong loadedimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnMapAndLoad");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadedimage) : -1;
#else
    (void)loadedimage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1UnhandledExceptionFilter(JNIEnv* km_env, jclass km_clazz, jlong exceptioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhandledExceptionFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exceptioninfo) : -1;
#else
    (void)exceptioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1UpdateDebugInfoFile(JNIEnv* km_env, jclass km_clazz, jlong imagefilename, jlong symbolpath, jlong debugfilepath, jlong ntheaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDebugInfoFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagefilename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)ntheaders) : -1;
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1UpdateDebugInfoFileEx(JNIEnv* km_env, jclass km_clazz, jlong imagefilename, jlong symbolpath, jlong debugfilepath, jlong ntheaders, jint oldchecksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDebugInfoFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagefilename, (void*)(uintptr_t)symbolpath, (void*)(uintptr_t)debugfilepath, (void*)(uintptr_t)ntheaders, (uint32_t)oldchecksum) : -1;
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    (void)oldchecksum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1WaitForDebugEvent(JNIEnv* km_env, jclass km_clazz, jlong lpdebugevent, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForDebugEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdebugevent, (uint32_t)dwmilliseconds) : -1;
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1WaitForDebugEventEx(JNIEnv* km_env, jclass km_clazz, jlong lpdebugevent, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForDebugEventEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdebugevent, (uint32_t)dwmilliseconds) : -1;
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1Wow64GetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64GetThreadContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1Wow64GetThreadSelectorEntry(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint dwselector, jlong lpselectorentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64GetThreadSelectorEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hthread, (uint32_t)dwselector, (void*)(uintptr_t)lpselectorentry) : -1;
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1Wow64SetThreadContext(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SetThreadContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hthread;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_WindowsWin32SystemDiagnosticsDebugJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1debug_1WriteProcessMemory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpbaseaddress, jlong lpbuffer, jlong nsize, jlong lpnumberofbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProcessMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpbaseaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)nsize, (void*)(uintptr_t)lpnumberofbyteswritten) : -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbyteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

