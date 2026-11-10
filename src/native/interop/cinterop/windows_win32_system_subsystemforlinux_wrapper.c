#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_subsystemforlinux_wrapper.h"
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

int32_t windowssys_windows_win32_system_subsystemforlinux_wslConfigureDistribution(void* distributionname, uint32_t defaultuid, int32_t wsldistributionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslConfigureDistribution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname, defaultuid, wsldistributionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    (void)defaultuid;
    (void)wsldistributionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_subsystemforlinux_wslGetDistributionConfiguration(void* distributionname, void* distributionversion, void* defaultuid, void* wsldistributionflags, void* defaultenvironmentvariables, void* defaultenvironmentvariablecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslGetDistributionConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname, distributionversion, defaultuid, wsldistributionflags, defaultenvironmentvariables, defaultenvironmentvariablecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    (void)distributionversion;
    (void)defaultuid;
    (void)wsldistributionflags;
    (void)defaultenvironmentvariables;
    (void)defaultenvironmentvariablecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_subsystemforlinux_wslIsDistributionRegistered(void* distributionname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslIsDistributionRegistered");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_subsystemforlinux_wslLaunch(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* arg_3_stdin, void* arg_4_stdout, void* arg_5_stderr, void* process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslLaunch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname, command, usecurrentworkingdirectory, arg_3_stdin, arg_4_stdout, arg_5_stderr, process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    (void)command;
    (void)usecurrentworkingdirectory;
    (void)arg_3_stdin;
    (void)arg_4_stdout;
    (void)arg_5_stderr;
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_subsystemforlinux_wslLaunchInteractive(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* exitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslLaunchInteractive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname, command, usecurrentworkingdirectory, exitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    (void)command;
    (void)usecurrentworkingdirectory;
    (void)exitcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_subsystemforlinux_wslRegisterDistribution(void* distributionname, void* targzfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslRegisterDistribution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname, targzfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    (void)targzfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_subsystemforlinux_wslUnregisterDistribution(void* distributionname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-wsl-api-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WslUnregisterDistribution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(distributionname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)distributionname;
    errno = ENOSYS;
    return -1;
#endif
}

