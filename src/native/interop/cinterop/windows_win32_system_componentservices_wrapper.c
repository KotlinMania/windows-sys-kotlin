#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_componentservices_wrapper.h"
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

int32_t windowssys_windows_win32_system_componentservices_coCreateActivity(void* piunknown, void* riid, void* ppobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateActivity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piunknown, riid, ppobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)piunknown;
    (void)riid;
    (void)ppobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_componentservices_coEnterServiceDomain(void* pconfigobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoEnterServiceDomain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconfigobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pconfigobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_componentservices_coGetDefaultContext(int32_t apttype, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetDefaultContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(apttype, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)apttype;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_componentservices_coLeaveServiceDomain(void* punkstatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoLeaveServiceDomain");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(punkstatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)punkstatus;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_componentservices_getDispenserManager(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mtxdm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDispenserManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_componentservices_getManagedExtensions(void* dwexts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagedExtensions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwexts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwexts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_componentservices_mTSCreateActivity(void* riid, void* ppobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MTSCreateActivity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_componentservices_recycleSurrogate(int32_t lreasoncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecycleSurrogate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lreasoncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lreasoncode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_componentservices_safeRef(void* rid, void* punk) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rid, punk);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)rid;
    (void)punk;
    errno = ENOSYS;
    return NULL;
#endif
}

