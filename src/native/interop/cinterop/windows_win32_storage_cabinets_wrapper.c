#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_cabinets_wrapper.h"
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

int32_t windowssys_windows_win32_storage_cabinets_FCIAddFile(void* hfci, void* pszsourcefile, void* pszfilename, int32_t fexecute, void* pfnfcignc, void* pfnfcis, void* pfnfcigoi, uint16_t typecompress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIAddFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfci, pszsourcefile, pszfilename, fexecute, pfnfcignc, pfnfcis, pfnfcigoi, typecompress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfci;
    (void)pszsourcefile;
    (void)pszfilename;
    (void)fexecute;
    (void)pfnfcignc;
    (void)pfnfcis;
    (void)pfnfcigoi;
    (void)typecompress;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_cabinets_FCICreate(void* perf, void* pfnfcifp, void* pfna, void* pfnf, void* pfnopen, void* pfnread, void* pfnwrite, void* pfnclose, void* pfnseek, void* pfndelete, void* pfnfcigtf, void* pccab, void* pv) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCICreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perf, pfnfcifp, pfna, pfnf, pfnopen, pfnread, pfnwrite, pfnclose, pfnseek, pfndelete, pfnfcigtf, pccab, pv);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perf;
    (void)pfnfcifp;
    (void)pfna;
    (void)pfnf;
    (void)pfnopen;
    (void)pfnread;
    (void)pfnwrite;
    (void)pfnclose;
    (void)pfnseek;
    (void)pfndelete;
    (void)pfnfcigtf;
    (void)pccab;
    (void)pv;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FCIDestroy(void* hfci) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIDestroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfci);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfci;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FCIFlushCabinet(void* hfci, int32_t fgetnextcab, void* pfnfcignc, void* pfnfcis) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIFlushCabinet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfci, fgetnextcab, pfnfcignc, pfnfcis);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfci;
    (void)fgetnextcab;
    (void)pfnfcignc;
    (void)pfnfcis;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FCIFlushFolder(void* hfci, void* pfnfcignc, void* pfnfcis) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIFlushFolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfci, pfnfcignc, pfnfcis);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfci;
    (void)pfnfcignc;
    (void)pfnfcis;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FDICopy(void* hfdi, void* pszcabinet, void* pszcabpath, int32_t flags, void* pfnfdin, void* pfnfdid, void* pvuser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDICopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfdi, pszcabinet, pszcabpath, flags, pfnfdin, pfnfdid, pvuser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfdi;
    (void)pszcabinet;
    (void)pszcabpath;
    (void)flags;
    (void)pfnfdin;
    (void)pfnfdid;
    (void)pvuser;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_cabinets_FDICreate(void* pfnalloc, void* pfnfree, void* pfnopen, void* pfnread, void* pfnwrite, void* pfnclose, void* pfnseek, int32_t cputype, void* perf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDICreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfnalloc, pfnfree, pfnopen, pfnread, pfnwrite, pfnclose, pfnseek, cputype, perf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfnalloc;
    (void)pfnfree;
    (void)pfnopen;
    (void)pfnread;
    (void)pfnwrite;
    (void)pfnclose;
    (void)pfnseek;
    (void)cputype;
    (void)perf;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FDIDestroy(void* hfdi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDIDestroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfdi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfdi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FDIIsCabinet(void* hfdi, int64_t hf, void* pfdici) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDIIsCabinet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfdi, hf, pfdici);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfdi;
    (void)hf;
    (void)pfdici;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cabinets_FDITruncateCabinet(void* hfdi, void* pszcabinetname, uint16_t ifoldertodelete) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDITruncateCabinet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfdi, pszcabinetname, ifoldertodelete);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfdi;
    (void)pszcabinetname;
    (void)ifoldertodelete;
    errno = ENOSYS;
    return -1;
#endif
}

