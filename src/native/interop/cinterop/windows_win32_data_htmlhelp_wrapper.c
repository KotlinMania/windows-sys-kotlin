#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_data_htmlhelp_wrapper.h"
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

void* windowssys_windows_win32_data_htmlhelp_htmlHelpA(void* hwndcaller, void* pszfile, uint32_t ucommand, uint64_t dwdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hhctrl.ocx");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HtmlHelpA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndcaller, pszfile, ucommand, dwdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndcaller;
    (void)pszfile;
    (void)ucommand;
    (void)dwdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_data_htmlhelp_htmlHelpW(void* hwndcaller, void* pszfile, uint32_t ucommand, uint64_t dwdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hhctrl.ocx");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HtmlHelpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndcaller, pszfile, ucommand, dwdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndcaller;
    (void)pszfile;
    (void)ucommand;
    (void)dwdata;
    errno = ENOSYS;
    return NULL;
#endif
}

