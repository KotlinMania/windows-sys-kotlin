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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1AddConsoleAliasA(JNIEnv* km_env, jclass km_clazz, jlong source, jlong target, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConsoleAliasA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)target, (void*)(uintptr_t)exename) : -1;
#else
    (void)source;
    (void)target;
    (void)exename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1AddConsoleAliasW(JNIEnv* km_env, jclass km_clazz, jlong source, jlong target, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConsoleAliasW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)target, (void*)(uintptr_t)exename) : -1;
#else
    (void)source;
    (void)target;
    (void)exename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1AllocConsole(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocConsole");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1AttachConsole(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachConsole");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprocessid) : -1;
#else
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ClosePseudoConsole(JNIEnv* km_env, jclass km_clazz, jlong hpc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePseudoConsole");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hpc);
#else
    (void)hpc;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ConsoleControl(JNIEnv* km_env, jclass km_clazz, jint command, jlong consoleinformation, jint consoleinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConsoleControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)command, (void*)(uintptr_t)consoleinformation, (uint32_t)consoleinformationlength) : -1;
#else
    (void)command;
    (void)consoleinformation;
    (void)consoleinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1CreateConsoleScreenBuffer(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwflags, jlong lpscreenbufferdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateConsoleScreenBuffer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwflags, (void*)(uintptr_t)lpscreenbufferdata) : NULL;
#else
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwflags;
    (void)lpscreenbufferdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ExpungeConsoleCommandHistoryA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpungeConsoleCommandHistoryA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)exename);
#else
    (void)exename;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ExpungeConsoleCommandHistoryW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpungeConsoleCommandHistoryW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)exename);
#else
    (void)exename;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1FlushConsoleInputBuffer(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushConsoleInputBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput) : -1;
#else
    (void)hconsoleinput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1FreeConsole(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeConsole");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GenerateConsoleCtrlEvent(JNIEnv* km_env, jclass km_clazz, jint dwctrlevent, jint dwprocessgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateConsoleCtrlEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwctrlevent, (uint32_t)dwprocessgroupid) : -1;
#else
    (void)dwctrlevent;
    (void)dwprocessgroupid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasA(JNIEnv* km_env, jclass km_clazz, jlong source, jlong targetbuffer, jint targetbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)targetbuffer, (uint32_t)targetbufferlength, (void*)(uintptr_t)exename) : 0;
#else
    (void)source;
    (void)targetbuffer;
    (void)targetbufferlength;
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasExesA(JNIEnv* km_env, jclass km_clazz, jlong exenamebuffer, jint exenamebufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exenamebuffer, (uint32_t)exenamebufferlength) : 0;
#else
    (void)exenamebuffer;
    (void)exenamebufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasExesLengthA(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesLengthA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasExesLengthW(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesLengthW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasExesW(JNIEnv* km_env, jclass km_clazz, jlong exenamebuffer, jint exenamebufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exenamebuffer, (uint32_t)exenamebufferlength) : 0;
#else
    (void)exenamebuffer;
    (void)exenamebufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasW(JNIEnv* km_env, jclass km_clazz, jlong source, jlong targetbuffer, jint targetbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)targetbuffer, (uint32_t)targetbufferlength, (void*)(uintptr_t)exename) : 0;
#else
    (void)source;
    (void)targetbuffer;
    (void)targetbufferlength;
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasesA(JNIEnv* km_env, jclass km_clazz, jlong aliasbuffer, jint aliasbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)aliasbuffer, (uint32_t)aliasbufferlength, (void*)(uintptr_t)exename) : 0;
#else
    (void)aliasbuffer;
    (void)aliasbufferlength;
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasesLengthA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesLengthA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exename) : 0;
#else
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasesLengthW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesLengthW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exename) : 0;
#else
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleAliasesW(JNIEnv* km_env, jclass km_clazz, jlong aliasbuffer, jint aliasbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)aliasbuffer, (uint32_t)aliasbufferlength, (void*)(uintptr_t)exename) : 0;
#else
    (void)aliasbuffer;
    (void)aliasbufferlength;
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleCP(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCP");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleCommandHistoryA(JNIEnv* km_env, jclass km_clazz, jlong commands, jint commandbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)commands, (uint32_t)commandbufferlength, (void*)(uintptr_t)exename) : 0;
#else
    (void)commands;
    (void)commandbufferlength;
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleCommandHistoryLengthA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryLengthA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exename) : 0;
#else
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleCommandHistoryLengthW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryLengthW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exename) : 0;
#else
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleCommandHistoryW(JNIEnv* km_env, jclass km_clazz, jlong commands, jint commandbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)commands, (uint32_t)commandbufferlength, (void*)(uintptr_t)exename) : 0;
#else
    (void)commands;
    (void)commandbufferlength;
    (void)exename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolecursorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCursorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolecursorinfo) : -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolecursorinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleDisplayMode(JNIEnv* km_env, jclass km_clazz, jlong lpmodeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleDisplayMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmodeflags) : -1;
#else
    (void)lpmodeflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleHistoryInfo(JNIEnv* km_env, jclass km_clazz, jlong lpconsolehistoryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleHistoryInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsolehistoryinfo) : -1;
#else
    (void)lpconsolehistoryinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleMode(JNIEnv* km_env, jclass km_clazz, jlong hconsolehandle, jlong lpmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsolehandle, (void*)(uintptr_t)lpmode) : -1;
#else
    (void)hconsolehandle;
    (void)lpmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleOriginalTitleA(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOriginalTitleA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize) : 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleOriginalTitleW(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOriginalTitleW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize) : 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleOutputCP(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOutputCP");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleProcessList(JNIEnv* km_env, jclass km_clazz, jlong lpdwprocesslist, jint dwprocesscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleProcessList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwprocesslist, (uint32_t)dwprocesscount) : 0;
#else
    (void)lpdwprocesslist;
    (void)dwprocesscount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleScreenBufferInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolescreenbufferinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleScreenBufferInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolescreenbufferinfo) : -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleScreenBufferInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolescreenbufferinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleScreenBufferInfoEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolescreenbufferinfoex) : -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfoex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleSelectionInfo(JNIEnv* km_env, jclass km_clazz, jlong lpconsoleselectioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleSelectionInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoleselectioninfo) : -1;
#else
    (void)lpconsoleselectioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleTitleA(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleTitleA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize) : 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleTitleW(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleTitleW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize) : 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetConsoleWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetCurrentConsoleFont(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint bmaximumwindow, jlong lpconsolecurrentfont) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentConsoleFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)bmaximumwindow, (void*)(uintptr_t)lpconsolecurrentfont) : -1;
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfont;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetCurrentConsoleFontEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint bmaximumwindow, jlong lpconsolecurrentfontex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentConsoleFontEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)bmaximumwindow, (void*)(uintptr_t)lpconsolecurrentfontex) : -1;
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfontex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetNumberOfConsoleInputEvents(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpnumberofevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfConsoleInputEvents");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpnumberofevents) : -1;
#else
    (void)hconsoleinput;
    (void)lpnumberofevents;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetNumberOfConsoleMouseButtons(JNIEnv* km_env, jclass km_clazz, jlong lpnumberofmousebuttons) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfConsoleMouseButtons");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnumberofmousebuttons) : -1;
#else
    (void)lpnumberofmousebuttons;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1GetStdHandle(JNIEnv* km_env, jclass km_clazz, jint nstdhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStdHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nstdhandle) : NULL;
#else
    (void)nstdhandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1PeekConsoleInputA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekConsoleInputA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1PeekConsoleInputW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekConsoleInputW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ReadConsoleA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nnumberofcharstoread, jlong lpnumberofcharsread, jlong pinputcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstoread, (void*)(uintptr_t)lpnumberofcharsread, (void*)(uintptr_t)pinputcontrol) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nnumberofcharstoread;
    (void)lpnumberofcharsread;
    (void)pinputcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ReadConsoleInputA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleInputA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ReadConsoleInputW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleInputW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1ReadConsoleW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nnumberofcharstoread, jlong lpnumberofcharsread, jlong pinputcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstoread, (void*)(uintptr_t)lpnumberofcharsread, (void*)(uintptr_t)pinputcontrol) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nnumberofcharstoread;
    (void)lpnumberofcharsread;
    (void)pinputcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleActiveScreenBuffer(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleActiveScreenBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput) : -1;
#else
    (void)hconsoleoutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleCP(JNIEnv* km_env, jclass km_clazz, jint wcodepageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wcodepageid) : -1;
#else
    (void)wcodepageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleCtrlHandler(JNIEnv* km_env, jclass km_clazz, jlong handlerroutine, jint add) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCtrlHandler");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handlerroutine, (int32_t)add) : -1;
#else
    (void)handlerroutine;
    (void)add;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolecursorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCursorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolecursorinfo) : -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolecursorinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleDisplayMode(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint dwflags, jlong lpnewscreenbufferdimensions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleDisplayMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (uint32_t)dwflags, (void*)(uintptr_t)lpnewscreenbufferdimensions) : -1;
#else
    (void)hconsoleoutput;
    (void)dwflags;
    (void)lpnewscreenbufferdimensions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleHistoryInfo(JNIEnv* km_env, jclass km_clazz, jlong lpconsolehistoryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleHistoryInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsolehistoryinfo) : -1;
#else
    (void)lpconsolehistoryinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleMode(JNIEnv* km_env, jclass km_clazz, jlong hconsolehandle, jint dwmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsolehandle, (uint32_t)dwmode) : -1;
#else
    (void)hconsolehandle;
    (void)dwmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleNumberOfCommandsA(JNIEnv* km_env, jclass km_clazz, jint number, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleNumberOfCommandsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)number, (void*)(uintptr_t)exename) : -1;
#else
    (void)number;
    (void)exename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleNumberOfCommandsW(JNIEnv* km_env, jclass km_clazz, jint number, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleNumberOfCommandsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)number, (void*)(uintptr_t)exename) : -1;
#else
    (void)number;
    (void)exename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleOutputCP(JNIEnv* km_env, jclass km_clazz, jint wcodepageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleOutputCP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wcodepageid) : -1;
#else
    (void)wcodepageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleScreenBufferInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolescreenbufferinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleScreenBufferInfoEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolescreenbufferinfoex) : -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfoex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleTextAttribute(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jshort wattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTextAttribute");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (uint16_t)wattributes) : -1;
#else
    (void)hconsoleoutput;
    (void)wattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleTitleA(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTitleA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoletitle) : -1;
#else
    (void)lpconsoletitle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleTitleW(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTitleW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconsoletitle) : -1;
#else
    (void)lpconsoletitle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetConsoleWindowInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint babsolute, jlong lpconsolewindow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleWindowInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)babsolute, (void*)(uintptr_t)lpconsolewindow) : -1;
#else
    (void)hconsoleoutput;
    (void)babsolute;
    (void)lpconsolewindow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetCurrentConsoleFontEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint bmaximumwindow, jlong lpconsolecurrentfontex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentConsoleFontEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)bmaximumwindow, (void*)(uintptr_t)lpconsolecurrentfontex) : -1;
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfontex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetStdHandle(JNIEnv* km_env, jclass km_clazz, jint nstdhandle, jlong hhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStdHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nstdhandle, (void*)(uintptr_t)hhandle) : -1;
#else
    (void)nstdhandle;
    (void)hhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1SetStdHandleEx(JNIEnv* km_env, jclass km_clazz, jint nstdhandle, jlong hhandle, jlong phprevvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStdHandleEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nstdhandle, (void*)(uintptr_t)hhandle, (void*)(uintptr_t)phprevvalue) : -1;
#else
    (void)nstdhandle;
    (void)hhandle;
    (void)phprevvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1WriteConsoleA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpbuffer, jint nnumberofcharstowrite, jlong lpnumberofcharswritten, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstowrite, (void*)(uintptr_t)lpnumberofcharswritten, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)hconsoleoutput;
    (void)lpbuffer;
    (void)nnumberofcharstowrite;
    (void)lpnumberofcharswritten;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1WriteConsoleInputA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleInputA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventswritten) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1WriteConsoleInputW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleInputW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventswritten) : -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1WriteConsoleW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpbuffer, jint nnumberofcharstowrite, jlong lpnumberofcharswritten, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstowrite, (void*)(uintptr_t)lpnumberofcharswritten, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)hconsoleoutput;
    (void)lpbuffer;
    (void)nnumberofcharstowrite;
    (void)lpnumberofcharswritten;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

