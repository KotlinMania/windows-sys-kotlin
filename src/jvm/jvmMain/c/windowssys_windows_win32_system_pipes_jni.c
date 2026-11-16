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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesCallNamedPipeA(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesread, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNamedPipeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesread, (uint32_t)ntimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpnamedpipename;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)ntimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesCallNamedPipeW(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesread, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNamedPipeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesread, (uint32_t)ntimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpnamedpipename;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)ntimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesConnectNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectNamedPipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesCreateNamedPipeA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint dwopenmode, jint dwpipemode, jint nmaxinstances, jint noutbuffersize, jint ninbuffersize, jint ndefaulttimeout, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateNamedPipeA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)dwopenmode, (uint32_t)dwpipemode, (uint32_t)nmaxinstances, (uint32_t)noutbuffersize, (uint32_t)ninbuffersize, (uint32_t)ndefaulttimeout, (void*)(uintptr_t)lpsecurityattributes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    (void)dwopenmode;
    (void)dwpipemode;
    (void)nmaxinstances;
    (void)noutbuffersize;
    (void)ninbuffersize;
    (void)ndefaulttimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesCreateNamedPipeW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint dwopenmode, jint dwpipemode, jint nmaxinstances, jint noutbuffersize, jint ninbuffersize, jint ndefaulttimeout, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateNamedPipeW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)dwopenmode, (uint32_t)dwpipemode, (uint32_t)nmaxinstances, (uint32_t)noutbuffersize, (uint32_t)ninbuffersize, (uint32_t)ndefaulttimeout, (void*)(uintptr_t)lpsecurityattributes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    (void)dwopenmode;
    (void)dwpipemode;
    (void)nmaxinstances;
    (void)noutbuffersize;
    (void)ninbuffersize;
    (void)ndefaulttimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesCreatePipe(JNIEnv* km_env, jclass km_clazz, jlong hreadpipe, jlong hwritepipe, jlong lppipeattributes, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hreadpipe, (void*)(uintptr_t)hwritepipe, (void*)(uintptr_t)lppipeattributes, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreadpipe;
    (void)hwritepipe;
    (void)lppipeattributes;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesDisconnectNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisconnectNamedPipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jlong clientcomputername, jint clientcomputernamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientComputerNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (void*)(uintptr_t)clientcomputername, (uint32_t)clientcomputernamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jlong clientcomputername, jint clientcomputernamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientComputerNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (void*)(uintptr_t)clientcomputername, (uint32_t)clientcomputernamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jlong clientprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientProcessId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (void*)(uintptr_t)clientprocessid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)clientprocessid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jlong clientsessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientSessionId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (void*)(uintptr_t)clientsessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)clientsessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpstate, jlong lpcurinstances, jlong lpmaxcollectioncount, jlong lpcollectdatatimeout, jlong lpusername, jint nmaxusernamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeHandleStateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpstate, (void*)(uintptr_t)lpcurinstances, (void*)(uintptr_t)lpmaxcollectioncount, (void*)(uintptr_t)lpcollectdatatimeout, (void*)(uintptr_t)lpusername, (uint32_t)nmaxusernamesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpstate;
    (void)lpcurinstances;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    (void)lpusername;
    (void)nmaxusernamesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpstate, jlong lpcurinstances, jlong lpmaxcollectioncount, jlong lpcollectdatatimeout, jlong lpusername, jint nmaxusernamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeHandleStateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpstate, (void*)(uintptr_t)lpcurinstances, (void*)(uintptr_t)lpmaxcollectioncount, (void*)(uintptr_t)lpcollectdatatimeout, (void*)(uintptr_t)lpusername, (uint32_t)nmaxusernamesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpstate;
    (void)lpcurinstances;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    (void)lpusername;
    (void)nmaxusernamesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeInfo(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpflags, jlong lpoutbuffersize, jlong lpinbuffersize, jlong lpmaxinstances) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lpoutbuffersize, (void*)(uintptr_t)lpinbuffersize, (void*)(uintptr_t)lpmaxinstances);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpflags;
    (void)lpoutbuffersize;
    (void)lpinbuffersize;
    (void)lpmaxinstances;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jlong serverprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeServerProcessId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (void*)(uintptr_t)serverprocessid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)serverprocessid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jlong serversessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeServerSessionId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (void*)(uintptr_t)serversessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)serversessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateNamedPipeClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesPeekNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpbuffer, jint nbuffersize, jlong lpbytesread, jlong lptotalbytesavail, jlong lpbytesleftthismessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekNamedPipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpbuffer, (uint32_t)nbuffersize, (void*)(uintptr_t)lpbytesread, (void*)(uintptr_t)lptotalbytesavail, (void*)(uintptr_t)lpbytesleftthismessage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpbuffer;
    (void)nbuffersize;
    (void)lpbytesread;
    (void)lptotalbytesavail;
    (void)lpbytesleftthismessage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpmode, jlong lpmaxcollectioncount, jlong lpcollectdatatimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedPipeHandleState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpmode, (void*)(uintptr_t)lpmaxcollectioncount, (void*)(uintptr_t)lpcollectdatatimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpmode;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesTransactNamedPipe(JNIEnv* km_env, jclass km_clazz, jlong hnamedpipe, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesread, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransactNamedPipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hnamedpipe, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesread, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hnamedpipe;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesWaitNamedPipeA(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitNamedPipeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (uint32_t)ntimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpnamedpipename;
    (void)ntimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_pipes_WindowsWin32SystemPipesJniBridge_windowssysWindowsWin32SystemPipesWaitNamedPipeW(JNIEnv* km_env, jclass km_clazz, jlong lpnamedpipename, jint ntimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitNamedPipeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpnamedpipename, (uint32_t)ntimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpnamedpipename;
    (void)ntimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

