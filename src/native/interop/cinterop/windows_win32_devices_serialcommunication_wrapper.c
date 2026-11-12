#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_serialcommunication_wrapper.h"
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

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(void* hcomdb, void* comnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBClaimNextFreePort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcomdb, comnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcomdb;
    (void)comnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(void* hcomdb, uint32_t comnumber, int32_t forceclaim, void* forced) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBClaimPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcomdb, comnumber, forceclaim, forced);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcomdb;
    (void)comnumber;
    (void)forceclaim;
    (void)forced;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBClose(void* hcomdb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcomdb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcomdb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(void* hcomdb, void* buffer, uint32_t buffersize, uint32_t reporttype, void* maxportsreported) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBGetCurrentPortUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcomdb, buffer, buffersize, reporttype, maxportsreported);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcomdb;
    (void)buffer;
    (void)buffersize;
    (void)reporttype;
    (void)maxportsreported;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(void* phcomdb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcomdb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcomdb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(void* hcomdb, uint32_t comnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBReleasePort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcomdb, comnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcomdb;
    (void)comnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(void* hcomdb, uint32_t newsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBResizeDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcomdb, newsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcomdb;
    (void)newsize;
    errno = ENOSYS;
    return -1;
#endif
}

