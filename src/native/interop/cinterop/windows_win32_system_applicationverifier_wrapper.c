#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_applicationverifier_wrapper.h"
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

uint32_t windowssys_windows_win32_system_applicationverifier_VerifierEnumerateResource(void* process, uint32_t flags, uint32_t resourcetype, void* resourcecallback, void* enumerationcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("verifier.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifierEnumerateResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, flags, resourcetype, resourcecallback, enumerationcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)process;
    (void)flags;
    (void)resourcetype;
    (void)resourcecallback;
    (void)enumerationcontext;
    errno = ENOSYS;
    return 0;
#endif
}

