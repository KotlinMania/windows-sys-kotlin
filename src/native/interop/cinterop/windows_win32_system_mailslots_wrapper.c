#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_mailslots_wrapper.h"
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

void* windowssysWindowsWin32SystemMailslotsCreateMailslotA(void* lpname, uint32_t nmaxmessagesize, uint32_t lreadtimeout, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMailslotA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, nmaxmessagesize, lreadtimeout, lpsecurityattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    (void)nmaxmessagesize;
    (void)lreadtimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemMailslotsCreateMailslotW(void* lpname, uint32_t nmaxmessagesize, uint32_t lreadtimeout, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMailslotW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, nmaxmessagesize, lreadtimeout, lpsecurityattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    (void)nmaxmessagesize;
    (void)lreadtimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemMailslotsGetMailslotInfo(void* hmailslot, void* lpmaxmessagesize, void* lpnextsize, void* lpmessagecount, void* lpreadtimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMailslotInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmailslot, lpmaxmessagesize, lpnextsize, lpmessagecount, lpreadtimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmailslot;
    (void)lpmaxmessagesize;
    (void)lpnextsize;
    (void)lpmessagecount;
    (void)lpreadtimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemMailslotsSetMailslotInfo(void* hmailslot, uint32_t lreadtimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMailslotInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmailslot, lreadtimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmailslot;
    (void)lreadtimeout;
    errno = ENOSYS;
    return -1;
#endif
}

