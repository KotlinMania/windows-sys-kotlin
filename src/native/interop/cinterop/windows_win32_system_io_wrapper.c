#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_io_wrapper.h"
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

int32_t windowssys_windows_win32_system_io_bindIoCompletionCallback(void* filehandle, void* function, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindIoCompletionCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, function, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)function;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_cancelIo(void* hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_cancelIoEx(void* hfile, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_cancelSynchronousIo(void* hthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelSynchronousIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_io_createIoCompletionPort(void* filehandle, void* existingcompletionport, uint64_t completionkey, uint32_t numberofconcurrentthreads) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIoCompletionPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, existingcompletionport, completionkey, numberofconcurrentthreads);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filehandle;
    (void)existingcompletionport;
    (void)completionkey;
    (void)numberofconcurrentthreads;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_io_deviceIoControl(void* hdevice, uint32_t dwiocontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeviceIoControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwiocontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)dwiocontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_getOverlappedResult(void* hfile, void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOverlappedResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpoverlapped, lpnumberofbytestransferred, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_getOverlappedResultEx(void* hfile, void* lpoverlapped, void* lpnumberofbytestransferred, uint32_t dwmilliseconds, int32_t balertable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOverlappedResultEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpoverlapped, lpnumberofbytestransferred, dwmilliseconds, balertable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_getQueuedCompletionStatus(void* completionport, void* lpnumberofbytestransferred, void* lpcompletionkey, void* lpoverlapped, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetQueuedCompletionStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionport, lpnumberofbytestransferred, lpcompletionkey, lpoverlapped, dwmilliseconds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)completionport;
    (void)lpnumberofbytestransferred;
    (void)lpcompletionkey;
    (void)lpoverlapped;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_getQueuedCompletionStatusEx(void* completionport, void* lpcompletionportentries, uint32_t ulcount, void* ulnumentriesremoved, uint32_t dwmilliseconds, int32_t falertable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetQueuedCompletionStatusEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionport, lpcompletionportentries, ulcount, ulnumentriesremoved, dwmilliseconds, falertable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)completionport;
    (void)lpcompletionportentries;
    (void)ulcount;
    (void)ulnumentriesremoved;
    (void)dwmilliseconds;
    (void)falertable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_io_postQueuedCompletionStatus(void* completionport, uint32_t dwnumberofbytestransferred, uint64_t dwcompletionkey, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostQueuedCompletionStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionport, dwnumberofbytestransferred, dwcompletionkey, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)completionport;
    (void)dwnumberofbytestransferred;
    (void)dwcompletionkey;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

