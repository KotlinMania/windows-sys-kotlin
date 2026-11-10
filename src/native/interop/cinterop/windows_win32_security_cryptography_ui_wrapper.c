#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_cryptography_ui_wrapper.h"
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

int32_t windowssys_windows_win32_security_cryptography_ui_certSelectionGetSerializedBlob(void* pcsi, void* ppoutbuffer, void* puloutbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSelectionGetSerializedBlob");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcsi, ppoutbuffer, puloutbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcsi;
    (void)ppoutbuffer;
    (void)puloutbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIDlgCertMgr(void* pcryptuicertmgr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgCertMgr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcryptuicertmgr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcryptuicertmgr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_ui_cryptUIDlgSelectCertificateFromStore(void* hcertstore, void* hwnd, void* pwsztitle, void* pwszdisplaystring, uint32_t dwdontusecolumn, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgSelectCertificateFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, hwnd, pwsztitle, pwszdisplaystring, dwdontusecolumn, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)hwnd;
    (void)pwsztitle;
    (void)pwszdisplaystring;
    (void)dwdontusecolumn;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateA(void* pcertviewinfo, void* pfpropertieschanged) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgViewCertificateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertviewinfo, pfpropertieschanged);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertviewinfo;
    (void)pfpropertieschanged;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateW(void* pcertviewinfo, void* pfpropertieschanged) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgViewCertificateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertviewinfo, pfpropertieschanged);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertviewinfo;
    (void)pfpropertieschanged;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewContext(uint32_t dwcontexttype, void* pvcontext, void* hwnd, void* pwsztitle, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgViewContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcontexttype, pvcontext, hwnd, pwsztitle, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcontexttype;
    (void)pvcontext;
    (void)hwnd;
    (void)pwsztitle;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIWizDigitalSign(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pdigitalsigninfo, void* ppsigncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizDigitalSign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, hwndparent, pwszwizardtitle, pdigitalsigninfo, ppsigncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)hwndparent;
    (void)pwszwizardtitle;
    (void)pdigitalsigninfo;
    (void)ppsigncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIWizExport(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pexportinfo, void* pvoid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizExport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, hwndparent, pwszwizardtitle, pexportinfo, pvoid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)hwndparent;
    (void)pwszwizardtitle;
    (void)pexportinfo;
    (void)pvoid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIWizFreeDigitalSignContext(void* psigncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizFreeDigitalSignContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psigncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psigncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_ui_cryptUIWizImport(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pimportsrc, void* hdestcertstore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizImport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, hwndparent, pwszwizardtitle, pimportsrc, hdestcertstore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)hwndparent;
    (void)pwszwizardtitle;
    (void)pimportsrc;
    (void)hdestcertstore;
    errno = ENOSYS;
    return -1;
#endif
}

