#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_cryptography_sip_wrapper.h"
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

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPAddProvider(void* psnewprov) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPAddProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psnewprov);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psnewprov;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPCreateIndirectData(void* psubjectinfo, void* pcbindirectdata, void* pindirectdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPCreateIndirectData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, pcbindirectdata, pindirectdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)pcbindirectdata;
    (void)pindirectdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPGetCaps(void* psubjinfo, void* pcaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPGetCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjinfo, pcaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjinfo;
    (void)pcaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSealedDigest(void* psubjectinfo, void* psig, uint32_t dwsig, void* pbdigest, void* pcbdigest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPGetSealedDigest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, psig, dwsig, pbdigest, pcbdigest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)psig;
    (void)dwsig;
    (void)pbdigest;
    (void)pcbdigest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSignedDataMsg(void* psubjectinfo, void* pdwencodingtype, uint32_t dwindex, void* pcbsigneddatamsg, void* pbsigneddatamsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPGetSignedDataMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, pdwencodingtype, dwindex, pcbsigneddatamsg, pbsigneddatamsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)pdwencodingtype;
    (void)dwindex;
    (void)pcbsigneddatamsg;
    (void)pbsigneddatamsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPLoad(void* pgsubject, uint32_t dwflags, void* psipdispatch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPLoad");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgsubject, dwflags, psipdispatch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgsubject;
    (void)dwflags;
    (void)psipdispatch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPPutSignedDataMsg(void* psubjectinfo, uint32_t dwencodingtype, void* pdwindex, uint32_t cbsigneddatamsg, void* pbsigneddatamsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPPutSignedDataMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, dwencodingtype, pdwindex, cbsigneddatamsg, pbsigneddatamsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)dwencodingtype;
    (void)pdwindex;
    (void)cbsigneddatamsg;
    (void)pbsigneddatamsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveProvider(void* pgprov) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRemoveProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgprov);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgprov;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveSignedDataMsg(void* psubjectinfo, uint32_t dwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRemoveSignedDataMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, dwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)dwindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuid(void* filename, void* hfilein, void* pgsubject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRetrieveSubjectGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, hfilein, pgsubject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)hfilein;
    (void)pgsubject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuidForCatalogFile(void* filename, void* hfilein, void* pgsubject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRetrieveSubjectGuidForCatalogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, hfilein, pgsubject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)hfilein;
    (void)pgsubject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPVerifyIndirectData(void* psubjectinfo, void* pindirectdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPVerifyIndirectData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, pindirectdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)pindirectdata;
    errno = ENOSYS;
    return -1;
#endif
}

