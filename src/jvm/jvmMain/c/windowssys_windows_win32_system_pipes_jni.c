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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1callNamedPipeA(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesread, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNamedPipeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesread, (uint32_t)ntimeout) : -1;
#else
    (void)lpnamedpipename;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)ntimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1callNamedPipeW(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesread, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNamedPipeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesread, (uint32_t)ntimeout) : -1;
#else
    (void)lpnamedpipename;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)ntimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1connectNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectNamedPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hnamedpipe;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1createNamedPipeA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint dwopenmode, jint dwpipemode, jint nmaxinstances, jint noutbuffersize, jint ninbuffersize, jint ndefaulttimeout, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateNamedPipeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)dwopenmode, (uint32_t)dwpipemode, (uint32_t)nmaxinstances, (uint32_t)noutbuffersize, (uint32_t)ninbuffersize, (uint32_t)ndefaulttimeout, (void*)(uintptr_t)lpsecurityattributes) : NULL;
#else
    (void)lpname;
    (void)dwopenmode;
    (void)dwpipemode;
    (void)nmaxinstances;
    (void)noutbuffersize;
    (void)ninbuffersize;
    (void)ndefaulttimeout;
    (void)lpsecurityattributes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1createNamedPipeW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint dwopenmode, jint dwpipemode, jint nmaxinstances, jint noutbuffersize, jint ninbuffersize, jint ndefaulttimeout, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateNamedPipeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)dwopenmode, (uint32_t)dwpipemode, (uint32_t)nmaxinstances, (uint32_t)noutbuffersize, (uint32_t)ninbuffersize, (uint32_t)ndefaulttimeout, (void*)(uintptr_t)lpsecurityattributes) : NULL;
#else
    (void)lpname;
    (void)dwopenmode;
    (void)dwpipemode;
    (void)nmaxinstances;
    (void)noutbuffersize;
    (void)ninbuffersize;
    (void)ndefaulttimeout;
    (void)lpsecurityattributes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1createPipe(JNIEnv* km_env, jclass km_clazz, jlong hreadpipe, jlong hwritepipe, jlong lppipeattributes, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreadpipe, (void*)(uintptr_t)hwritepipe, (void*)(uintptr_t)lppipeattributes, (uint32_t)nsize) : -1;
#else
    (void)hreadpipe;
    (void)hwritepipe;
    (void)lppipeattributes;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1disconnectNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisconnectNamedPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe) : -1;
#else
    (void)hnamedpipe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeClientComputerNameA(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jlong clientcomputername, jint clientcomputernamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientComputerNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (void*)(uintptr_t)clientcomputername, (uint32_t)clientcomputernamelength) : -1;
#else
    (void)arg_0_pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeClientComputerNameW(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jlong clientcomputername, jint clientcomputernamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientComputerNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (void*)(uintptr_t)clientcomputername, (uint32_t)clientcomputernamelength) : -1;
#else
    (void)arg_0_pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeClientProcessId(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jlong clientprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientProcessId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (void*)(uintptr_t)clientprocessid) : -1;
#else
    (void)arg_0_pipe;
    (void)clientprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeClientSessionId(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jlong clientsessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientSessionId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (void*)(uintptr_t)clientsessionid) : -1;
#else
    (void)arg_0_pipe;
    (void)clientsessionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeHandleStateA(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpstate, jlong lpcurinstances, jlong lpmaxcollectioncount, jlong lpcollectdatatimeout, jlong lpusername, jint nmaxusernamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeHandleStateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpstate, (void*)(uintptr_t)lpcurinstances, (void*)(uintptr_t)lpmaxcollectioncount, (void*)(uintptr_t)lpcollectdatatimeout, (void*)(uintptr_t)lpusername, (uint32_t)nmaxusernamesize) : -1;
#else
    (void)hnamedpipe;
    (void)lpstate;
    (void)lpcurinstances;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    (void)lpusername;
    (void)nmaxusernamesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeHandleStateW(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpstate, jlong lpcurinstances, jlong lpmaxcollectioncount, jlong lpcollectdatatimeout, jlong lpusername, jint nmaxusernamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeHandleStateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpstate, (void*)(uintptr_t)lpcurinstances, (void*)(uintptr_t)lpmaxcollectioncount, (void*)(uintptr_t)lpcollectdatatimeout, (void*)(uintptr_t)lpusername, (uint32_t)nmaxusernamesize) : -1;
#else
    (void)hnamedpipe;
    (void)lpstate;
    (void)lpcurinstances;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    (void)lpusername;
    (void)nmaxusernamesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeInfo(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpflags, jlong lpoutbuffersize, jlong lpinbuffersize, jlong lpmaxinstances) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lpoutbuffersize, (void*)(uintptr_t)lpinbuffersize, (void*)(uintptr_t)lpmaxinstances) : -1;
#else
    (void)hnamedpipe;
    (void)lpflags;
    (void)lpoutbuffersize;
    (void)lpinbuffersize;
    (void)lpmaxinstances;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeServerProcessId(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jlong serverprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeServerProcessId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (void*)(uintptr_t)serverprocessid) : -1;
#else
    (void)arg_0_pipe;
    (void)serverprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1getNamedPipeServerSessionId(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jlong serversessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeServerSessionId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (void*)(uintptr_t)serversessionid) : -1;
#else
    (void)arg_0_pipe;
    (void)serversessionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1impersonateNamedPipeClient(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateNamedPipeClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe) : -1;
#else
    (void)hnamedpipe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1peekNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpbuffer, jint nbuffersize, jlong lpbytesread, jlong lptotalbytesavail, jlong lpbytesleftthismessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekNamedPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpbuffer, (uint32_t)nbuffersize, (void*)(uintptr_t)lpbytesread, (void*)(uintptr_t)lptotalbytesavail, (void*)(uintptr_t)lpbytesleftthismessage) : -1;
#else
    (void)hnamedpipe;
    (void)lpbuffer;
    (void)nbuffersize;
    (void)lpbytesread;
    (void)lptotalbytesavail;
    (void)lpbytesleftthismessage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1setNamedPipeHandleState(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpmode, jlong lpmaxcollectioncount, jlong lpcollectdatatimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedPipeHandleState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpmode, (void*)(uintptr_t)lpmaxcollectioncount, (void*)(uintptr_t)lpcollectdatatimeout) : -1;
#else
    (void)hnamedpipe;
    (void)lpmode;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1transactNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesread, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransactNamedPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesread, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hnamedpipe;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1waitNamedPipeA(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitNamedPipeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (uint32_t)ntimeout) : -1;
#else
    (void)lpnamedpipename;
    (void)ntimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssys_1windows_1win32_1system_1pipes_1waitNamedPipeW(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitNamedPipeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (uint32_t)ntimeout) : -1;
#else
    (void)lpnamedpipename;
    (void)ntimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

