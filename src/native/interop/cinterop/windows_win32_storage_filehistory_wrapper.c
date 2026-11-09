#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_filehistory_wrapper.h"
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

int32_t windowssys_windows_win32_storage_filehistory_FhServiceBlockBackup(void* arg_0_pipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceBlockBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_pipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filehistory_FhServiceClosePipe(void* arg_0_pipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceClosePipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_pipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filehistory_FhServiceOpenPipe(int32_t startserviceifstopped, void* arg_1_pipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceOpenPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startserviceifstopped, arg_1_pipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)startserviceifstopped;
    (void)arg_1_pipe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filehistory_FhServiceReloadConfiguration(void* arg_0_pipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceReloadConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_pipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filehistory_FhServiceStartBackup(void* arg_0_pipe, int32_t lowpriorityio) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceStartBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_pipe, lowpriorityio);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)lowpriorityio;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filehistory_FhServiceStopBackup(void* arg_0_pipe, int32_t stoptracking) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceStopBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_pipe, stoptracking);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)stoptracking;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filehistory_FhServiceUnblockBackup(void* arg_0_pipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceUnblockBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_pipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    return -1;
#endif
}

