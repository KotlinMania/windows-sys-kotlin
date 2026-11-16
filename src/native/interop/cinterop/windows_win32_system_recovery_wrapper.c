#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_recovery_wrapper.h"
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

void windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(int32_t bsuccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplicationRecoveryFinished");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bsuccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)bsuccess;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(void* pbcancelled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplicationRecoveryInProgress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbcancelled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbcancelled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(void* hprocess, void* precoverycallback, void* ppvparameter, void* pdwpinginterval, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationRecoveryCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, precoverycallback, ppvparameter, pdwpinginterval, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)precoverycallback;
    (void)ppvparameter;
    (void)pdwpinginterval;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(void* hprocess, void* pwzcommandline, void* pcchsize, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationRestartSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pwzcommandline, pcchsize, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pwzcommandline;
    (void)pcchsize;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(void* precoveycallback, void* pvparameter, uint32_t dwpinginterval, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterApplicationRecoveryCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precoveycallback, pvparameter, dwpinginterval, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)precoveycallback;
    (void)pvparameter;
    (void)dwpinginterval;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(void* pwzcommandline, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterApplicationRestart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzcommandline, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzcommandline;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterApplicationRecoveryCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterApplicationRestart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

