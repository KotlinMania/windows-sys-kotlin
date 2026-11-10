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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1addSecureMemoryCacheCallback(JNIEnv* km_env, jclass km_clazz, jlong pfncallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecureMemoryCacheCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfncallback) : -1;
#else
    (void)pfncallback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1allocateUserPhysicalPages(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong numberofpages, jlong pagearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateUserPhysicalPages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)numberofpages, (void*)(uintptr_t)pagearray) : -1;
#else
    (void)hprocess;
    (void)numberofpages;
    (void)pagearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1allocateUserPhysicalPages2(JNIEnv* km_env, jclass km_clazz, jlong objecthandle, jlong numberofpages, jlong pagearray, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-8.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateUserPhysicalPages2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objecthandle, (void*)(uintptr_t)numberofpages, (void*)(uintptr_t)pagearray, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount) : -1;
#else
    (void)objecthandle;
    (void)numberofpages;
    (void)pagearray;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1allocateUserPhysicalPagesNuma(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong numberofpages, jlong pagearray, jint nndpreferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateUserPhysicalPagesNuma");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)numberofpages, (void*)(uintptr_t)pagearray, (uint32_t)nndpreferred) : -1;
#else
    (void)hprocess;
    (void)numberofpages;
    (void)pagearray;
    (void)nndpreferred;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createFileMapping2(JNIEnv* km_env, jclass km_clazz, jlong file, jlong securityattributes, jint desiredaccess, jint pageprotection, jint allocationattributes, jlong maximumsize, jlong name, jlong extendedparameters, jint parametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-7.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMapping2");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)securityattributes, (uint32_t)desiredaccess, (uint32_t)pageprotection, (uint32_t)allocationattributes, (uint64_t)maximumsize, (void*)(uintptr_t)name, (void*)(uintptr_t)extendedparameters, (uint32_t)parametercount) : NULL;
#else
    (void)file;
    (void)securityattributes;
    (void)desiredaccess;
    (void)pageprotection;
    (void)allocationattributes;
    (void)maximumsize;
    (void)name;
    (void)extendedparameters;
    (void)parametercount;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createFileMappingA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfilemappingattributes, jint flprotect, jint dwmaximumsizehigh, jint dwmaximumsizelow, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfilemappingattributes, (uint32_t)flprotect, (uint32_t)dwmaximumsizehigh, (uint32_t)dwmaximumsizelow, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createFileMappingFromApp(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong securityattributes, jint pageprotection, jlong maximumsize, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingFromApp");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)securityattributes, (uint32_t)pageprotection, (uint64_t)maximumsize, (void*)(uintptr_t)name) : NULL;
#else
    (void)hfile;
    (void)securityattributes;
    (void)pageprotection;
    (void)maximumsize;
    (void)name;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createFileMappingNumaA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfilemappingattributes, jint flprotect, jint dwmaximumsizehigh, jint dwmaximumsizelow, jlong lpname, jint nndpreferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingNumaA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfilemappingattributes, (uint32_t)flprotect, (uint32_t)dwmaximumsizehigh, (uint32_t)dwmaximumsizelow, (void*)(uintptr_t)lpname, (uint32_t)nndpreferred) : NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    (void)nndpreferred;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createFileMappingNumaW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfilemappingattributes, jint flprotect, jint dwmaximumsizehigh, jint dwmaximumsizelow, jlong lpname, jint nndpreferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingNumaW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfilemappingattributes, (uint32_t)flprotect, (uint32_t)dwmaximumsizehigh, (uint32_t)dwmaximumsizelow, (void*)(uintptr_t)lpname, (uint32_t)nndpreferred) : NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    (void)nndpreferred;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createFileMappingW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfilemappingattributes, jint flprotect, jint dwmaximumsizehigh, jint dwmaximumsizelow, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfilemappingattributes, (uint32_t)flprotect, (uint32_t)dwmaximumsizehigh, (uint32_t)dwmaximumsizelow, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1createMemoryResourceNotification(JNIEnv* km_env, jclass km_clazz, jint notificationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMemoryResourceNotification");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)notificationtype) : NULL;
#else
    (void)notificationtype;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1discardVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiscardVirtualMemory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint64_t)size) : 0;
#else
    (void)virtualaddress;
    (void)size;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1flushViewOfFile(JNIEnv* km_env, jclass km_clazz, jlong lpbaseaddress, jlong dwnumberofbytestoflush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushViewOfFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbaseaddress, (uint64_t)dwnumberofbytestoflush) : -1;
#else
    (void)lpbaseaddress;
    (void)dwnumberofbytestoflush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1freeUserPhysicalPages(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong numberofpages, jlong pagearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUserPhysicalPages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)numberofpages, (void*)(uintptr_t)pagearray) : -1;
#else
    (void)hprocess;
    (void)numberofpages;
    (void)pagearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getLargePageMinimum(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLargePageMinimum");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getMemoryErrorHandlingCapabilities(JNIEnv* km_env, jclass km_clazz, jlong capabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMemoryErrorHandlingCapabilities");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)capabilities) : -1;
#else
    (void)capabilities;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getProcessHeap(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHeap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getProcessHeaps(JNIEnv* km_env, jclass km_clazz, jint numberofheaps, jlong processheaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHeaps");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numberofheaps, (void*)(uintptr_t)processheaps) : 0;
#else
    (void)numberofheaps;
    (void)processheaps;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getProcessWorkingSetSizeEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpminimumworkingsetsize, jlong lpmaximumworkingsetsize, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWorkingSetSizeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpminimumworkingsetsize, (void*)(uintptr_t)lpmaximumworkingsetsize, (void*)(uintptr_t)flags) : -1;
#else
    (void)hprocess;
    (void)lpminimumworkingsetsize;
    (void)lpmaximumworkingsetsize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getSystemFileCacheSize(JNIEnv* km_env, jclass km_clazz, jlong lpminimumfilecachesize, jlong lpmaximumfilecachesize, jlong lpflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemFileCacheSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpminimumfilecachesize, (void*)(uintptr_t)lpmaximumfilecachesize, (void*)(uintptr_t)lpflags) : -1;
#else
    (void)lpminimumfilecachesize;
    (void)lpmaximumfilecachesize;
    (void)lpflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1getWriteWatch(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpbaseaddress, jlong dwregionsize, jlong lpaddresses, jlong lpdwcount, jlong lpdwgranularity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWriteWatch");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpbaseaddress, (uint64_t)dwregionsize, (void*)(uintptr_t)lpaddresses, (void*)(uintptr_t)lpdwcount, (void*)(uintptr_t)lpdwgranularity) : 0;
#else
    (void)dwflags;
    (void)lpbaseaddress;
    (void)dwregionsize;
    (void)lpaddresses;
    (void)lpdwcount;
    (void)lpdwgranularity;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalAlloc(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong dwbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (uint64_t)dwbytes) : NULL;
#else
    (void)uflags;
    (void)dwbytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalFlags(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : 0;
#else
    (void)hmem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalHandle(JNIEnv* km_env, jclass km_clazz, jlong pmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmem) : NULL;
#else
    (void)pmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalLock(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalLock");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : NULL;
#else
    (void)hmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalReAlloc(JNIEnv* km_env, jclass km_clazz, jlong hmem, jlong dwbytes, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalReAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem, (uint64_t)dwbytes, (uint32_t)uflags) : NULL;
#else
    (void)hmem;
    (void)dwbytes;
    (void)uflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalSize(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : 0;
#else
    (void)hmem;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1globalUnlock(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalUnlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : -1;
#else
    (void)hmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapAlloc(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags, jlong dwbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags, (uint64_t)dwbytes) : NULL;
#else
    (void)hheap;
    (void)dwflags;
    (void)dwbytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapCompact(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapCompact");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags) : 0;
#else
    (void)hheap;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapCreate(JNIEnv* km_env, jclass km_clazz, jint floptions, jlong dwinitialsize, jlong dwmaximumsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapCreate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)floptions, (uint64_t)dwinitialsize, (uint64_t)dwmaximumsize) : NULL;
#else
    (void)floptions;
    (void)dwinitialsize;
    (void)dwmaximumsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapDestroy(JNIEnv* km_env, jclass km_clazz, jlong hheap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapDestroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap) : -1;
#else
    (void)hheap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapFree(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags, jlong lpmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags, (void*)(uintptr_t)lpmem) : -1;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapLock(JNIEnv* km_env, jclass km_clazz, jlong hheap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapLock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap) : -1;
#else
    (void)hheap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapQueryInformation(JNIEnv* km_env, jclass km_clazz, jlong heaphandle, jint heapinformationclass, jlong heapinformation, jlong heapinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapQueryInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heaphandle, (int32_t)heapinformationclass, (void*)(uintptr_t)heapinformation, (uint64_t)heapinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)heaphandle;
    (void)heapinformationclass;
    (void)heapinformation;
    (void)heapinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapReAlloc(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags, jlong lpmem, jlong dwbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapReAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags, (void*)(uintptr_t)lpmem, (uint64_t)dwbytes) : NULL;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    (void)dwbytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapSetInformation(JNIEnv* km_env, jclass km_clazz, jlong heaphandle, jint heapinformationclass, jlong heapinformation, jlong heapinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapSetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heaphandle, (int32_t)heapinformationclass, (void*)(uintptr_t)heapinformation, (uint64_t)heapinformationlength) : -1;
#else
    (void)heaphandle;
    (void)heapinformationclass;
    (void)heapinformation;
    (void)heapinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapSize(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags, jlong lpmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags, (void*)(uintptr_t)lpmem) : 0;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapSummary(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags, jlong lpsummary) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapSummary");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags, (void*)(uintptr_t)lpsummary) : -1;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpsummary;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapUnlock(JNIEnv* km_env, jclass km_clazz, jlong hheap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapUnlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap) : -1;
#else
    (void)hheap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapValidate(JNIEnv* km_env, jclass km_clazz, jlong hheap, jint dwflags, jlong lpmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapValidate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (uint32_t)dwflags, (void*)(uintptr_t)lpmem) : -1;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1heapWalk(JNIEnv* km_env, jclass km_clazz, jlong hheap, jlong lpentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapWalk");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hheap, (void*)(uintptr_t)lpentry) : -1;
#else
    (void)hheap;
    (void)lpentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1isBadReadPtr(JNIEnv* km_env, jclass km_clazz, jlong lp, jlong ucb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadReadPtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lp, (uint64_t)ucb) : -1;
#else
    (void)lp;
    (void)ucb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1isBadStringPtrA(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jlong ucchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadStringPtrA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint64_t)ucchmax) : -1;
#else
    (void)lpsz;
    (void)ucchmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1isBadStringPtrW(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jlong ucchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadStringPtrW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint64_t)ucchmax) : -1;
#else
    (void)lpsz;
    (void)ucchmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1isBadWritePtr(JNIEnv* km_env, jclass km_clazz, jlong lp, jlong ucb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadWritePtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lp, (uint64_t)ucb) : -1;
#else
    (void)lp;
    (void)ucb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localAlloc(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong ubytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (uint64_t)ubytes) : NULL;
#else
    (void)uflags;
    (void)ubytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localFlags(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : 0;
#else
    (void)hmem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localHandle(JNIEnv* km_env, jclass km_clazz, jlong pmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmem) : NULL;
#else
    (void)pmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localLock(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalLock");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : NULL;
#else
    (void)hmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localReAlloc(JNIEnv* km_env, jclass km_clazz, jlong hmem, jlong ubytes, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalReAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem, (uint64_t)ubytes, (uint32_t)uflags) : NULL;
#else
    (void)hmem;
    (void)ubytes;
    (void)uflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localSize(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : 0;
#else
    (void)hmem;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1localUnlock(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalUnlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : -1;
#else
    (void)hmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1mapUserPhysicalPages(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jlong numberofpages, jlong pagearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapUserPhysicalPages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint64_t)numberofpages, (void*)(uintptr_t)pagearray) : -1;
#else
    (void)virtualaddress;
    (void)numberofpages;
    (void)pagearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1mapUserPhysicalPagesScatter(JNIEnv* km_env, jclass km_clazz, jlong virtualaddresses, jlong numberofpages, jlong pagearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapUserPhysicalPagesScatter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddresses, (uint64_t)numberofpages, (void*)(uintptr_t)pagearray) : -1;
#else
    (void)virtualaddresses;
    (void)numberofpages;
    (void)pagearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1offerVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jlong size, jint priority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfferVirtualMemory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint64_t)size, (int32_t)priority) : 0;
#else
    (void)virtualaddress;
    (void)size;
    (void)priority;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1openDedicatedMemoryPartition(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong dedicatedmemorytypeid, jint desiredaccess, jint inherithandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-8.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDedicatedMemoryPartition");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)partition, (uint64_t)dedicatedmemorytypeid, (uint32_t)desiredaccess, (int32_t)inherithandle) : NULL;
#else
    (void)partition;
    (void)dedicatedmemorytypeid;
    (void)desiredaccess;
    (void)inherithandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1openFileMappingA(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileMappingA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1openFileMappingFromApp(JNIEnv* km_env, jclass km_clazz, jint desiredaccess, jint inherithandle, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileMappingFromApp");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)desiredaccess, (int32_t)inherithandle, (void*)(uintptr_t)name) : NULL;
#else
    (void)desiredaccess;
    (void)inherithandle;
    (void)name;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1openFileMappingW(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileMappingW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1prefetchVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong numberofentries, jlong virtualaddresses, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrefetchVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)numberofentries, (void*)(uintptr_t)virtualaddresses, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1queryMemoryResourceNotification(JNIEnv* km_env, jclass km_clazz, jlong resourcenotificationhandle, jlong resourcestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryMemoryResourceNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)resourcenotificationhandle, (void*)(uintptr_t)resourcestate) : -1;
#else
    (void)resourcenotificationhandle;
    (void)resourcestate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1queryPartitionInformation(JNIEnv* km_env, jclass km_clazz, jlong partition, jint partitioninformationclass, jlong partitioninformation, jint partitioninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-8.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPartitionInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)partition, (int32_t)partitioninformationclass, (void*)(uintptr_t)partitioninformation, (uint32_t)partitioninformationlength) : -1;
#else
    (void)partition;
    (void)partitioninformationclass;
    (void)partitioninformation;
    (void)partitioninformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1queryVirtualMemoryInformation(JNIEnv* km_env, jclass km_clazz, jlong process, jlong virtualaddress, jint memoryinformationclass, jlong memoryinformation, jlong memoryinformationsize, jlong returnsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryVirtualMemoryInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)virtualaddress, (int32_t)memoryinformationclass, (void*)(uintptr_t)memoryinformation, (uint64_t)memoryinformationsize, (void*)(uintptr_t)returnsize) : -1;
#else
    (void)process;
    (void)virtualaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationsize;
    (void)returnsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1reclaimVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReclaimVirtualMemory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint64_t)size) : 0;
#else
    (void)virtualaddress;
    (void)size;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1registerBadMemoryNotification(JNIEnv* km_env, jclass km_clazz, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterBadMemoryNotification");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callback) : NULL;
#else
    (void)callback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1removeSecureMemoryCacheCallback(JNIEnv* km_env, jclass km_clazz, jlong pfncallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveSecureMemoryCacheCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfncallback) : -1;
#else
    (void)pfncallback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1resetWriteWatch(JNIEnv* km_env, jclass km_clazz, jlong lpbaseaddress, jlong dwregionsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetWriteWatch");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbaseaddress, (uint64_t)dwregionsize) : 0;
#else
    (void)lpbaseaddress;
    (void)dwregionsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1rtlCompareMemory(JNIEnv* km_env, jclass km_clazz, jlong source1, jlong source2, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareMemory");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source1, (void*)(uintptr_t)source2, (uint64_t)length) : 0;
#else
    (void)source1;
    (void)source2;
    (void)length;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1rtlCrc32(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong size, jint initialcrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCrc32");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint64_t)size, (uint32_t)initialcrc) : 0;
#else
    (void)buffer;
    (void)size;
    (void)initialcrc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1rtlCrc64(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong size, jlong initialcrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCrc64");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint64_t)size, (uint64_t)initialcrc) : 0;
#else
    (void)buffer;
    (void)size;
    (void)initialcrc;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1rtlIsZeroMemory(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsZeroMemory");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint64_t)length) : false;
#else
    (void)buffer;
    (void)length;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1setProcessValidCallTargets(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong virtualaddress, jlong regionsize, jint numberofoffsets, jlong offsetinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessValidCallTargets");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)virtualaddress, (uint64_t)regionsize, (uint32_t)numberofoffsets, (void*)(uintptr_t)offsetinformation) : -1;
#else
    (void)hprocess;
    (void)virtualaddress;
    (void)regionsize;
    (void)numberofoffsets;
    (void)offsetinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1setProcessValidCallTargetsForMappedView(JNIEnv* km_env, jclass km_clazz, jlong process, jlong virtualaddress, jlong regionsize, jint numberofoffsets, jlong offsetinformation, jlong section, jlong expectedfileoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-7.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessValidCallTargetsForMappedView");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)virtualaddress, (uint64_t)regionsize, (uint32_t)numberofoffsets, (void*)(uintptr_t)offsetinformation, (void*)(uintptr_t)section, (uint64_t)expectedfileoffset) : -1;
#else
    (void)process;
    (void)virtualaddress;
    (void)regionsize;
    (void)numberofoffsets;
    (void)offsetinformation;
    (void)section;
    (void)expectedfileoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1setProcessWorkingSetSizeEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwminimumworkingsetsize, jlong dwmaximumworkingsetsize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWorkingSetSizeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwminimumworkingsetsize, (uint64_t)dwmaximumworkingsetsize, (uint32_t)flags) : -1;
#else
    (void)hprocess;
    (void)dwminimumworkingsetsize;
    (void)dwmaximumworkingsetsize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1setSystemFileCacheSize(JNIEnv* km_env, jclass km_clazz, jlong minimumfilecachesize, jlong maximumfilecachesize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemFileCacheSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)minimumfilecachesize, (uint64_t)maximumfilecachesize, (uint32_t)flags) : -1;
#else
    (void)minimumfilecachesize;
    (void)maximumfilecachesize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1unregisterBadMemoryNotification(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterBadMemoryNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)registrationhandle) : -1;
#else
    (void)registrationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualAlloc(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jlong dwsize, jint flallocationtype, jint flprotect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)flallocationtype, (uint32_t)flprotect) : NULL;
#else
    (void)lpaddress;
    (void)dwsize;
    (void)flallocationtype;
    (void)flprotect;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualAlloc2(JNIEnv* km_env, jclass km_clazz, jlong process, jlong baseaddress, jlong size, jint allocationtype, jint pageprotection, jlong extendedparameters, jint parametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAlloc2");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)baseaddress, (uint64_t)size, (uint32_t)allocationtype, (uint32_t)pageprotection, (void*)(uintptr_t)extendedparameters, (uint32_t)parametercount) : NULL;
#else
    (void)process;
    (void)baseaddress;
    (void)size;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)parametercount;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualAlloc2FromApp(JNIEnv* km_env, jclass km_clazz, jlong process, jlong baseaddress, jlong size, jint allocationtype, jint pageprotection, jlong extendedparameters, jint parametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAlloc2FromApp");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)baseaddress, (uint64_t)size, (uint32_t)allocationtype, (uint32_t)pageprotection, (void*)(uintptr_t)extendedparameters, (uint32_t)parametercount) : NULL;
#else
    (void)process;
    (void)baseaddress;
    (void)size;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)parametercount;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualAllocEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong dwsize, jint flallocationtype, jint flprotect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAllocEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)flallocationtype, (uint32_t)flprotect) : NULL;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)flallocationtype;
    (void)flprotect;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualAllocExNuma(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong dwsize, jint flallocationtype, jint flprotect, jint nndpreferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAllocExNuma");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)flallocationtype, (uint32_t)flprotect, (uint32_t)nndpreferred) : NULL;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)flallocationtype;
    (void)flprotect;
    (void)nndpreferred;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualAllocFromApp(JNIEnv* km_env, jclass km_clazz, jlong baseaddress, jlong size, jint allocationtype, jint protection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAllocFromApp");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)baseaddress, (uint64_t)size, (uint32_t)allocationtype, (uint32_t)protection) : NULL;
#else
    (void)baseaddress;
    (void)size;
    (void)allocationtype;
    (void)protection;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualFree(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jlong dwsize, jint dwfreetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)dwfreetype) : -1;
#else
    (void)lpaddress;
    (void)dwsize;
    (void)dwfreetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualFreeEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong dwsize, jint dwfreetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualFreeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)dwfreetype) : -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)dwfreetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualLock(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jlong dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualLock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (uint64_t)dwsize) : -1;
#else
    (void)lpaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualProtect(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jlong dwsize, jint flnewprotect, jlong lpfloldprotect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualProtect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)flnewprotect, (void*)(uintptr_t)lpfloldprotect) : -1;
#else
    (void)lpaddress;
    (void)dwsize;
    (void)flnewprotect;
    (void)lpfloldprotect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualProtectEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong dwsize, jint flnewprotect, jlong lpfloldprotect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualProtectEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint32_t)flnewprotect, (void*)(uintptr_t)lpfloldprotect) : -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)flnewprotect;
    (void)lpfloldprotect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualProtectFromApp(JNIEnv* km_env, jclass km_clazz, jlong address, jlong size, jint newprotection, jlong oldprotection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualProtectFromApp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint64_t)size, (uint32_t)newprotection, (void*)(uintptr_t)oldprotection) : -1;
#else
    (void)address;
    (void)size;
    (void)newprotection;
    (void)oldprotection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualQuery(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jlong lpbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualQuery");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)dwlength) : 0;
#else
    (void)lpaddress;
    (void)lpbuffer;
    (void)dwlength;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualQueryEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong lpbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualQueryEx");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)dwlength) : 0;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)lpbuffer;
    (void)dwlength;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualUnlock(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jlong dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualUnlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (uint64_t)dwsize) : -1;
#else
    (void)lpaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_memory_WindowsWin32SystemMemoryJniBridge_windowssys_1windows_1win32_1system_1memory_1virtualUnlockEx(JNIEnv* km_env, jclass km_clazz, jlong process, jlong address, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-5.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualUnlockEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)address, (uint64_t)size) : -1;
#else
    (void)process;
    (void)address;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

