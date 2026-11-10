#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_licenseprotection_wrapper.h"
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

int32_t windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration(void* licensekey, uint32_t validityindays, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("licenseprotection.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterLicenseKeyWithExpiration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(licensekey, validityindays, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)licensekey;
    (void)validityindays;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection(void* licensekey, void* notvalidbefore, void* notvalidafter, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("licenseprotection.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateLicenseKeyProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(licensekey, notvalidbefore, notvalidafter, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)licensekey;
    (void)notvalidbefore;
    (void)notvalidafter;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

