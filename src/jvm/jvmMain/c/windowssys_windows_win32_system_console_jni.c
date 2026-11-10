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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1addConsoleAliasA(JNIEnv* km_env, jclass km_clazz, jlong source, jlong target, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConsoleAliasA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)target, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    (void)target;
    (void)exename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1addConsoleAliasW(JNIEnv* km_env, jclass km_clazz, jlong source, jlong target, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConsoleAliasW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)target, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    (void)target;
    (void)exename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1allocConsole(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocConsole");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1attachConsole(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachConsole");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1closePseudoConsole(JNIEnv* km_env, jclass km_clazz, jlong hpc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePseudoConsole");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)hpc);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hpc;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1consoleControl(JNIEnv* km_env, jclass km_clazz, jint command, jlong consoleinformation, jint consoleinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConsoleControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)command, (void*)(uintptr_t)consoleinformation, (uint32_t)consoleinformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)command;
    (void)consoleinformation;
    (void)consoleinformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1createConsoleScreenBuffer(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwflags, jlong lpscreenbufferdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateConsoleScreenBuffer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwflags, (void*)(uintptr_t)lpscreenbufferdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwflags;
    (void)lpscreenbufferdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1expungeConsoleCommandHistoryA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpungeConsoleCommandHistoryA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
    }
#else
    (void)exename;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1expungeConsoleCommandHistoryW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpungeConsoleCommandHistoryW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
    }
#else
    (void)exename;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1flushConsoleInputBuffer(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushConsoleInputBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1freeConsole(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeConsole");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1generateConsoleCtrlEvent(JNIEnv* km_env, jclass km_clazz, jint dwctrlevent, jint dwprocessgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateConsoleCtrlEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwctrlevent, (uint32_t)dwprocessgroupid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwctrlevent;
    (void)dwprocessgroupid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasA(JNIEnv* km_env, jclass km_clazz, jlong source, jlong targetbuffer, jint targetbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)targetbuffer, (uint32_t)targetbufferlength, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)source;
    (void)targetbuffer;
    (void)targetbufferlength;
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasExesA(JNIEnv* km_env, jclass km_clazz, jlong exenamebuffer, jint exenamebufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exenamebuffer, (uint32_t)exenamebufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exenamebuffer;
    (void)exenamebufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasExesLengthA(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesLengthA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasExesLengthW(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesLengthW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasExesW(JNIEnv* km_env, jclass km_clazz, jlong exenamebuffer, jint exenamebufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exenamebuffer, (uint32_t)exenamebufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exenamebuffer;
    (void)exenamebufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasW(JNIEnv* km_env, jclass km_clazz, jlong source, jlong targetbuffer, jint targetbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)targetbuffer, (uint32_t)targetbufferlength, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)source;
    (void)targetbuffer;
    (void)targetbufferlength;
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasesA(JNIEnv* km_env, jclass km_clazz, jlong aliasbuffer, jint aliasbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aliasbuffer, (uint32_t)aliasbufferlength, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)aliasbuffer;
    (void)aliasbufferlength;
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasesLengthA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesLengthA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasesLengthW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesLengthW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleAliasesW(JNIEnv* km_env, jclass km_clazz, jlong aliasbuffer, jint aliasbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)aliasbuffer, (uint32_t)aliasbufferlength, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)aliasbuffer;
    (void)aliasbufferlength;
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleCP(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCP");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleCommandHistoryA(JNIEnv* km_env, jclass km_clazz, jlong commands, jint commandbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)commands, (uint32_t)commandbufferlength, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)commands;
    (void)commandbufferlength;
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleCommandHistoryLengthA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryLengthA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleCommandHistoryLengthW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryLengthW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleCommandHistoryW(JNIEnv* km_env, jclass km_clazz, jlong commands, jint commandbufferlength, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)commands, (uint32_t)commandbufferlength, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)commands;
    (void)commandbufferlength;
    (void)exename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolecursorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCursorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolecursorinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpconsolecursorinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleDisplayMode(JNIEnv* km_env, jclass km_clazz, jlong lpmodeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleDisplayMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmodeflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmodeflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleHistoryInfo(JNIEnv* km_env, jclass km_clazz, jlong lpconsolehistoryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleHistoryInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsolehistoryinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpconsolehistoryinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleMode(JNIEnv* km_env, jclass km_clazz, jlong hconsolehandle, jlong lpmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsolehandle, (void*)(uintptr_t)lpmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsolehandle;
    (void)lpmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleOriginalTitleA(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOriginalTitleA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleOriginalTitleW(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOriginalTitleW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleOutputCP(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOutputCP");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleProcessList(JNIEnv* km_env, jclass km_clazz, jlong lpdwprocesslist, jint dwprocesscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleProcessList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwprocesslist, (uint32_t)dwprocesscount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpdwprocesslist;
    (void)dwprocesscount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleScreenBufferInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolescreenbufferinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleScreenBufferInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolescreenbufferinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleScreenBufferInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolescreenbufferinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleScreenBufferInfoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolescreenbufferinfoex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfoex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleSelectionInfo(JNIEnv* km_env, jclass km_clazz, jlong lpconsoleselectioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleSelectionInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoleselectioninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpconsoleselectioninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleTitleA(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleTitleA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleTitleW(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleTitleW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoletitle, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getConsoleWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleWindow");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getCurrentConsoleFont(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint bmaximumwindow, jlong lpconsolecurrentfont) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentConsoleFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)bmaximumwindow, (void*)(uintptr_t)lpconsolecurrentfont);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfont;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getCurrentConsoleFontEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint bmaximumwindow, jlong lpconsolecurrentfontex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentConsoleFontEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)bmaximumwindow, (void*)(uintptr_t)lpconsolecurrentfontex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfontex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getNumberOfConsoleInputEvents(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpnumberofevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfConsoleInputEvents");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpnumberofevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpnumberofevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getNumberOfConsoleMouseButtons(JNIEnv* km_env, jclass km_clazz, jlong lpnumberofmousebuttons) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfConsoleMouseButtons");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpnumberofmousebuttons);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpnumberofmousebuttons;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1getStdHandle(JNIEnv* km_env, jclass km_clazz, jint nstdhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStdHandle");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nstdhandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)nstdhandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1peekConsoleInputA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekConsoleInputA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1peekConsoleInputW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekConsoleInputW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1readConsoleA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nnumberofcharstoread, jlong lpnumberofcharsread, jlong pinputcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstoread, (void*)(uintptr_t)lpnumberofcharsread, (void*)(uintptr_t)pinputcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nnumberofcharstoread;
    (void)lpnumberofcharsread;
    (void)pinputcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1readConsoleInputA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleInputA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1readConsoleInputW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventsread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleInputW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventsread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1readConsoleW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nnumberofcharstoread, jlong lpnumberofcharsread, jlong pinputcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstoread, (void*)(uintptr_t)lpnumberofcharsread, (void*)(uintptr_t)pinputcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nnumberofcharstoread;
    (void)lpnumberofcharsread;
    (void)pinputcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleActiveScreenBuffer(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleActiveScreenBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleCP(JNIEnv* km_env, jclass km_clazz, jint wcodepageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)wcodepageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wcodepageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleCtrlHandler(JNIEnv* km_env, jclass km_clazz, jlong handlerroutine, jint add) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCtrlHandler");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handlerroutine, (int32_t)add);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handlerroutine;
    (void)add;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolecursorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCursorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolecursorinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpconsolecursorinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleDisplayMode(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint dwflags, jlong lpnewscreenbufferdimensions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleDisplayMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (uint32_t)dwflags, (void*)(uintptr_t)lpnewscreenbufferdimensions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)dwflags;
    (void)lpnewscreenbufferdimensions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleHistoryInfo(JNIEnv* km_env, jclass km_clazz, jlong lpconsolehistoryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleHistoryInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsolehistoryinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpconsolehistoryinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleMode(JNIEnv* km_env, jclass km_clazz, jlong hconsolehandle, jint dwmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsolehandle, (uint32_t)dwmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsolehandle;
    (void)dwmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleNumberOfCommandsA(JNIEnv* km_env, jclass km_clazz, jint number, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleNumberOfCommandsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)number, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)number;
    (void)exename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleNumberOfCommandsW(JNIEnv* km_env, jclass km_clazz, jint number, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleNumberOfCommandsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)number, (void*)(uintptr_t)exename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)number;
    (void)exename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleOutputCP(JNIEnv* km_env, jclass km_clazz, jint wcodepageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleOutputCP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)wcodepageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wcodepageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleScreenBufferInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpconsolescreenbufferinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleScreenBufferInfoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpconsolescreenbufferinfoex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfoex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleTextAttribute(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jshort wattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTextAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (uint16_t)wattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)wattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleTitleA(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTitleA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoletitle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpconsoletitle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleTitleW(JNIEnv* km_env, jclass km_clazz, jlong lpconsoletitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTitleW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpconsoletitle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpconsoletitle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setConsoleWindowInfo(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint babsolute, jlong lpconsolewindow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleWindowInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)babsolute, (void*)(uintptr_t)lpconsolewindow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)babsolute;
    (void)lpconsolewindow;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setCurrentConsoleFontEx(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jint bmaximumwindow, jlong lpconsolecurrentfontex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentConsoleFontEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (int32_t)bmaximumwindow, (void*)(uintptr_t)lpconsolecurrentfontex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfontex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setStdHandle(JNIEnv* km_env, jclass km_clazz, jint nstdhandle, jlong hhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStdHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nstdhandle, (void*)(uintptr_t)hhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nstdhandle;
    (void)hhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1setStdHandleEx(JNIEnv* km_env, jclass km_clazz, jint nstdhandle, jlong hhandle, jlong phprevvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStdHandleEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nstdhandle, (void*)(uintptr_t)hhandle, (void*)(uintptr_t)phprevvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nstdhandle;
    (void)hhandle;
    (void)phprevvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1writeConsoleA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpbuffer, jint nnumberofcharstowrite, jlong lpnumberofcharswritten, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstowrite, (void*)(uintptr_t)lpnumberofcharswritten, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpbuffer;
    (void)nnumberofcharstowrite;
    (void)lpnumberofcharswritten;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1writeConsoleInputA(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleInputA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1writeConsoleInputW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleinput, jlong lpbuffer, jint nlength, jlong lpnumberofeventswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleInputW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleinput, (void*)(uintptr_t)lpbuffer, (uint32_t)nlength, (void*)(uintptr_t)lpnumberofeventswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_console_WindowsWin32SystemConsoleJniBridge_windowssys_1windows_1win32_1system_1console_1writeConsoleW(JNIEnv* km_env, jclass km_clazz, jlong hconsoleoutput, jlong lpbuffer, jint nnumberofcharstowrite, jlong lpnumberofcharswritten, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconsoleoutput, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofcharstowrite, (void*)(uintptr_t)lpnumberofcharswritten, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconsoleoutput;
    (void)lpbuffer;
    (void)nnumberofcharstowrite;
    (void)lpnumberofcharswritten;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

