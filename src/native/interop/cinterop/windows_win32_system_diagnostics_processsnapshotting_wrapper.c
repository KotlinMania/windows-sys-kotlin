#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_diagnostics_processsnapshotting_wrapper.h"
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

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(void* processhandle, uint32_t captureflags, uint32_t threadcontextflags, void* snapshothandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssCaptureSnapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, captureflags, threadcontextflags, snapshothandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processhandle;
    (void)captureflags;
    (void)threadcontextflags;
    (void)snapshothandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(void* sourceprocesshandle, void* snapshothandle, void* targetprocesshandle, void* targetsnapshothandle, int32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssDuplicateSnapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceprocesshandle, snapshothandle, targetprocesshandle, targetsnapshothandle, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourceprocesshandle;
    (void)snapshothandle;
    (void)targetprocesshandle;
    (void)targetsnapshothandle;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(void* processhandle, void* snapshothandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssFreeSnapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, snapshothandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processhandle;
    (void)snapshothandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(void* snapshothandle, int32_t informationclass, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssQuerySnapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapshothandle, informationclass, buffer, bufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)snapshothandle;
    (void)informationclass;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(void* allocator, void* walkmarkerhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(allocator, walkmarkerhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)allocator;
    (void)walkmarkerhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(void* walkmarkerhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(walkmarkerhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)walkmarkerhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(void* walkmarkerhandle, void* position) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerGetPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(walkmarkerhandle, position);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)walkmarkerhandle;
    (void)position;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(void* walkmarkerhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerSeekToBeginning");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(walkmarkerhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)walkmarkerhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(void* walkmarkerhandle, uint64_t position) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkMarkerSetPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(walkmarkerhandle, position);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)walkmarkerhandle;
    (void)position;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(void* snapshothandle, int32_t informationclass, void* walkmarkerhandle, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PssWalkSnapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapshothandle, informationclass, walkmarkerhandle, buffer, bufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)snapshothandle;
    (void)informationclass;
    (void)walkmarkerhandle;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

