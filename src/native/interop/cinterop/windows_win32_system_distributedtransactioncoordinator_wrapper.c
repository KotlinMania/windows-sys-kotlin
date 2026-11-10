#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_distributedtransactioncoordinator_wrapper.h"
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

int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManager(void* i_pszhost, void* i_psztmname, void* i_riid, uint32_t i_dwreserved1, uint16_t i_wcbreserved2, void* i_pvreserved2, void* o_ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i_pszhost, i_psztmname, i_riid, i_dwreserved1, i_wcbreserved2, i_pvreserved2, o_ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i_pszhost;
    (void)i_psztmname;
    (void)i_riid;
    (void)i_dwreserved1;
    (void)i_wcbreserved2;
    (void)i_pvreserved2;
    (void)o_ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerC(void* i_pszhost, void* i_psztmname, void* i_riid, uint32_t i_dwreserved1, uint16_t i_wcbreserved2, void* i_pvreserved2, void* o_ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManagerC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i_pszhost, i_psztmname, i_riid, i_dwreserved1, i_wcbreserved2, i_pvreserved2, o_ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i_pszhost;
    (void)i_psztmname;
    (void)i_riid;
    (void)i_dwreserved1;
    (void)i_wcbreserved2;
    (void)i_pvreserved2;
    (void)o_ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExA(void* i_pszhost, void* i_psztmname, void* i_riid, uint32_t i_grfoptions, void* i_pvconfigparams, void* o_ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManagerExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i_pszhost, i_psztmname, i_riid, i_grfoptions, i_pvconfigparams, o_ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i_pszhost;
    (void)i_psztmname;
    (void)i_riid;
    (void)i_grfoptions;
    (void)i_pvconfigparams;
    (void)o_ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExW(void* i_pwszhost, void* i_pwsztmname, void* i_riid, uint32_t i_grfoptions, void* i_pvconfigparams, void* o_ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManagerExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i_pwszhost, i_pwsztmname, i_riid, i_grfoptions, i_pvconfigparams, o_ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i_pwszhost;
    (void)i_pwsztmname;
    (void)i_riid;
    (void)i_grfoptions;
    (void)i_pvconfigparams;
    (void)o_ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

