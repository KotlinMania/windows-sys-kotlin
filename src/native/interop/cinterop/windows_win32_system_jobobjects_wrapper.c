#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_jobobjects_wrapper.h"
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

int32_t windowssys_windows_win32_system_jobobjects_AssignProcessToJobObject(void* hjob, void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssignProcessToJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hjob, hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hjob;
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_jobobjects_CreateJobObjectA(void* lpjobattributes, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateJobObjectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpjobattributes, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpjobattributes;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_jobobjects_CreateJobObjectW(void* lpjobattributes, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateJobObjectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpjobattributes, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpjobattributes;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_jobobjects_CreateJobSet(uint32_t numjob, void* userjobset, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateJobSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numjob, userjobset, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numjob;
    (void)userjobset;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_jobobjects_FreeMemoryJobObject(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeMemoryJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_jobobjects_IsProcessInJob(void* processhandle, void* jobhandle, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInJob");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, jobhandle, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)jobhandle;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_jobobjects_OpenJobObjectA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenJobObjectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_jobobjects_OpenJobObjectW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenJobObjectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_jobobjects_QueryInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength, void* lpreturnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryInformationJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hjob, jobobjectinformationclass, lpjobobjectinformation, cbjobobjectinformationlength, lpreturnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hjob;
    (void)jobobjectinformationclass;
    (void)lpjobobjectinformation;
    (void)cbjobobjectinformationlength;
    (void)lpreturnlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_jobobjects_QueryIoRateControlInformationJobObject(void* hjob, void* volumename, void* infoblocks, void* infoblockcount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIoRateControlInformationJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hjob, volumename, infoblocks, infoblockcount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hjob;
    (void)volumename;
    (void)infoblocks;
    (void)infoblockcount;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_jobobjects_SetInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInformationJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hjob, jobobjectinformationclass, lpjobobjectinformation, cbjobobjectinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hjob;
    (void)jobobjectinformationclass;
    (void)lpjobobjectinformation;
    (void)cbjobobjectinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_jobobjects_SetIoRateControlInformationJobObject(void* hjob, void* ioratecontrolinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIoRateControlInformationJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hjob, ioratecontrolinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hjob;
    (void)ioratecontrolinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_jobobjects_TerminateJobObject(void* hjob, uint32_t uexitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateJobObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hjob, uexitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hjob;
    (void)uexitcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_jobobjects_UserHandleGrantAccess(void* huserhandle, void* hjob, int32_t bgrant) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserHandleGrantAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huserhandle, hjob, bgrant);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)huserhandle;
    (void)hjob;
    (void)bgrant;
    errno = ENOSYS;
    return -1;
#endif
}

