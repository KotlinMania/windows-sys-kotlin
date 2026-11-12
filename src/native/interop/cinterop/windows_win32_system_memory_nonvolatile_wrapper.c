#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_memory_nonvolatile_wrapper.h"
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

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(void* nvtoken) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDrainNonVolatileFlush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvtoken);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvtoken;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(void* nvtoken, void* nvdestination, uint64_t size, uint8_t value, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFillNonVolatileMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvtoken, nvdestination, size, value, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvtoken;
    (void)nvdestination;
    (void)size;
    (void)value;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(void* nvtoken, void* nvbuffer, uint64_t size, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFlushNonVolatileMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvtoken, nvbuffer, size, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvtoken;
    (void)nvbuffer;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(void* nvtoken, void* nvranges, uint64_t numranges, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFlushNonVolatileMemoryRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvtoken, nvranges, numranges, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvtoken;
    (void)nvranges;
    (void)numranges;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(void* nvtoken) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeNonVolatileToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvtoken);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvtoken;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(void* nvbuffer, uint64_t size, void* nvtoken) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetNonVolatileToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvbuffer, size, nvtoken);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvbuffer;
    (void)size;
    (void)nvtoken;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(void* nvtoken, void* nvdestination, void* source, uint64_t size, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlWriteNonVolatileMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvtoken, nvdestination, source, size, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nvtoken;
    (void)nvdestination;
    (void)source;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

