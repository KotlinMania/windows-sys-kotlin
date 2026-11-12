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

int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(void* iPszhost, void* iPsztmname, void* iRiid, uint32_t iDwreserved1, uint16_t iWcbreserved2, void* iPvreserved2, void* oPpvobject) {
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
        return km_fn_ptr(iPszhost, iPsztmname, iRiid, iDwreserved1, iWcbreserved2, iPvreserved2, oPpvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iPszhost;
    (void)iPsztmname;
    (void)iRiid;
    (void)iDwreserved1;
    (void)iWcbreserved2;
    (void)iPvreserved2;
    (void)oPpvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(void* iPszhost, void* iPsztmname, void* iRiid, uint32_t iDwreserved1, uint16_t iWcbreserved2, void* iPvreserved2, void* oPpvobject) {
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
        return km_fn_ptr(iPszhost, iPsztmname, iRiid, iDwreserved1, iWcbreserved2, iPvreserved2, oPpvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iPszhost;
    (void)iPsztmname;
    (void)iRiid;
    (void)iDwreserved1;
    (void)iWcbreserved2;
    (void)iPvreserved2;
    (void)oPpvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(void* iPszhost, void* iPsztmname, void* iRiid, uint32_t iGrfoptions, void* iPvconfigparams, void* oPpvobject) {
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
        return km_fn_ptr(iPszhost, iPsztmname, iRiid, iGrfoptions, iPvconfigparams, oPpvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iPszhost;
    (void)iPsztmname;
    (void)iRiid;
    (void)iGrfoptions;
    (void)iPvconfigparams;
    (void)oPpvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(void* iPwszhost, void* iPwsztmname, void* iRiid, uint32_t iGrfoptions, void* iPvconfigparams, void* oPpvobject) {
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
        return km_fn_ptr(iPwszhost, iPwsztmname, iRiid, iGrfoptions, iPvconfigparams, oPpvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iPwszhost;
    (void)iPwsztmname;
    (void)iRiid;
    (void)iGrfoptions;
    (void)iPvconfigparams;
    (void)oPpvobject;
    errno = ENOSYS;
    return -1;
#endif
}

