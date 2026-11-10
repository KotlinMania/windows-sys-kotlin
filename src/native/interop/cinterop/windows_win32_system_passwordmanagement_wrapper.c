#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_passwordmanagement_wrapper.h"
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

uint32_t windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword(void* servername, void* username, bool lmoldpresent, void* lmoldowfpassword, void* lmnewowfpassword, void* ntoldowfpassword, void* ntnewowfpassword) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MSChapSrvChangePassword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, lmoldpresent, lmoldowfpassword, lmnewowfpassword, ntoldowfpassword, ntnewowfpassword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)lmoldpresent;
    (void)lmoldowfpassword;
    (void)lmnewowfpassword;
    (void)ntoldowfpassword;
    (void)ntnewowfpassword;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2(void* servername, void* username, void* newpasswordencryptedwitholdnt, void* oldntowfpasswordencryptedwithnewnt, bool lmpresent, void* newpasswordencryptedwitholdlm, void* oldlmowfpasswordencryptedwithnewlmornt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MSChapSrvChangePassword2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, newpasswordencryptedwitholdnt, oldntowfpasswordencryptedwithnewnt, lmpresent, newpasswordencryptedwitholdlm, oldlmowfpasswordencryptedwithnewlmornt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)newpasswordencryptedwitholdnt;
    (void)oldntowfpasswordencryptedwithnewnt;
    (void)lmpresent;
    (void)newpasswordencryptedwitholdlm;
    (void)oldlmowfpasswordencryptedwithnewlmornt;
    errno = ENOSYS;
    return 0;
#endif
}

