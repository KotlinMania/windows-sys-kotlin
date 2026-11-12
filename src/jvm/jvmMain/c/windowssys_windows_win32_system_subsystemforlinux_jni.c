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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(JNIEnv* km_env, jclass km_clazz, jlong distributionname, jint defaultuid, jint wsldistributionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslConfigureDistribution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname, (uint32_t)defaultuid, (int32_t)wsldistributionflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    (void)defaultuid;
    (void)wsldistributionflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(JNIEnv* km_env, jclass km_clazz, jlong distributionname, jlong distributionversion, jlong defaultuid, jlong wsldistributionflags, jlong defaultenvironmentvariables, jlong defaultenvironmentvariablecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslGetDistributionConfiguration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname, (void*)(uintptr_t)distributionversion, (void*)(uintptr_t)defaultuid, (void*)(uintptr_t)wsldistributionflags, (void*)(uintptr_t)defaultenvironmentvariables, (void*)(uintptr_t)defaultenvironmentvariablecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    (void)distributionversion;
    (void)defaultuid;
    (void)wsldistributionflags;
    (void)defaultenvironmentvariables;
    (void)defaultenvironmentvariablecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(JNIEnv* km_env, jclass km_clazz, jlong distributionname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslIsDistributionRegistered");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(JNIEnv* km_env, jclass km_clazz, jlong distributionname, jlong command, jint usecurrentworkingdirectory, jlong arg3Stdin, jlong arg4Stdout, jlong arg5Stderr, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslLaunch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname, (void*)(uintptr_t)command, (int32_t)usecurrentworkingdirectory, (void*)(uintptr_t)arg3Stdin, (void*)(uintptr_t)arg4Stdout, (void*)(uintptr_t)arg5Stderr, (void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    (void)command;
    (void)usecurrentworkingdirectory;
    (void)arg3Stdin;
    (void)arg4Stdout;
    (void)arg5Stderr;
    (void)process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(JNIEnv* km_env, jclass km_clazz, jlong distributionname, jlong command, jint usecurrentworkingdirectory, jlong exitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslLaunchInteractive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname, (void*)(uintptr_t)command, (int32_t)usecurrentworkingdirectory, (void*)(uintptr_t)exitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    (void)command;
    (void)usecurrentworkingdirectory;
    (void)exitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(JNIEnv* km_env, jclass km_clazz, jlong distributionname, jlong targzfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslRegisterDistribution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname, (void*)(uintptr_t)targzfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    (void)targzfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_subsystemforlinux_WindowsWin32SystemSubsystemforlinuxJniBridge_windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(JNIEnv* km_env, jclass km_clazz, jlong distributionname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslUnregisterDistribution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)distributionname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)distributionname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

