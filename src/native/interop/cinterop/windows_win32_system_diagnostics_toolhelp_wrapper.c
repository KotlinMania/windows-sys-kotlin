#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_diagnostics_toolhelp_wrapper.h"
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

void* windowssys_windows_win32_system_diagnostics_toolhelp_CreateToolhelp32Snapshot(uint32_t dwflags, uint32_t th32processid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateToolhelp32Snapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, th32processid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwflags;
    (void)th32processid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32First(void* lphe, uint32_t th32processid, uint64_t th32heapid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32First");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphe, th32processid, th32heapid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphe;
    (void)th32processid;
    (void)th32heapid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListFirst(void* hsnapshot, void* lphl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32ListFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lphl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lphl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListNext(void* hsnapshot, void* lphl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32ListNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lphl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lphl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32Next(void* lphe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Heap32Next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32First(void* hsnapshot, void* lpme) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32First");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lpme);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lpme;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32FirstW(void* hsnapshot, void* lpme) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32FirstW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lpme);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lpme;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32Next(void* hsnapshot, void* lpme) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32Next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lpme);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lpme;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32NextW(void* hsnapshot, void* lpme) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Module32NextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lpme);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lpme;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32First(void* hsnapshot, void* lppe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32First");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lppe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lppe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32FirstW(void* hsnapshot, void* lppe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32FirstW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lppe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lppe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32Next(void* hsnapshot, void* lppe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32Next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lppe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lppe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32NextW(void* hsnapshot, void* lppe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process32NextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lppe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lppe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Thread32First(void* hsnapshot, void* lpte) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Thread32First");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lpte);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lpte;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Thread32Next(void* hsnapshot, void* lpte) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Thread32Next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsnapshot, lpte);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsnapshot;
    (void)lpte;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Toolhelp32ReadProcessMemory(uint32_t th32processid, void* lpbaseaddress, void* lpbuffer, uint64_t cbread, void* lpnumberofbytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Toolhelp32ReadProcessMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(th32processid, lpbaseaddress, lpbuffer, cbread, lpnumberofbytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)th32processid;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)cbread;
    (void)lpnumberofbytesread;
    errno = ENOSYS;
    return -1;
#endif
}

