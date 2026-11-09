#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_netshell_wrapper.h"
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

uint32_t windowssys_windows_win32_networkmanagement_netshell_MatchEnumTag(void* hmodule, void* pwcarg, uint32_t dwnumarg, void* penumtable, void* pdwvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MatchEnumTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, pwcarg, dwnumarg, penumtable, pdwvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)pwcarg;
    (void)dwnumarg;
    (void)penumtable;
    (void)pdwvalue;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_netshell_MatchToken(void* pwszusertoken, void* pwszcmdtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MatchToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszusertoken, pwszcmdtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszusertoken;
    (void)pwszcmdtoken;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_netshell_PreprocessCommand(void* hmodule, void* ppwcarguments, uint32_t dwcurrentindex, uint32_t dwargcount, void* ptttags, uint32_t dwtagcount, uint32_t dwminargs, uint32_t dwmaxargs, void* pdwtagtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PreprocessCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, ppwcarguments, dwcurrentindex, dwargcount, ptttags, dwtagcount, dwminargs, dwmaxargs, pdwtagtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)ppwcarguments;
    (void)dwcurrentindex;
    (void)dwargcount;
    (void)ptttags;
    (void)dwtagcount;
    (void)dwminargs;
    (void)dwmaxargs;
    (void)pdwtagtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_netshell_RegisterContext(void* pchildcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchildcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pchildcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_netshell_RegisterHelper(void* pguidparentcontext, void* pfnregistersubcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterHelper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguidparentcontext, pfnregistersubcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pguidparentcontext;
    (void)pfnregistersubcontext;
    errno = ENOSYS;
    return 0;
#endif
}

