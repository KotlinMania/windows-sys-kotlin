#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_cryptography_wrapper.h"
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

int32_t windowssys_windows_win32_security_cryptography_bCryptAddContextFunction(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, uint32_t dwposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptAddContextFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, dwposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)dwposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptAddContextFunctionProvider(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pszprovider, uint32_t dwposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptAddContextFunctionProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszprovider, dwposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    (void)dwposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptCloseAlgorithmProvider(void* halgorithm, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCloseAlgorithmProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptConfigureContext(uint32_t dwtable, void* pszcontext, void* pconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptConfigureContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, pconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptConfigureContextFunction(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptConfigureContextFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptCreateContext(uint32_t dwtable, void* pszcontext, void* pconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCreateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, pconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptCreateHash(void* halgorithm, void* phhash, void* pbhashobject, uint32_t cbhashobject, void* pbsecret, uint32_t cbsecret, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCreateHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, phhash, pbhashobject, cbhashobject, pbsecret, cbsecret, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)phhash;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptCreateMultiHash(void* halgorithm, void* phhash, uint32_t nhashes, void* pbhashobject, uint32_t cbhashobject, void* pbsecret, uint32_t cbsecret, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCreateMultiHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, phhash, nhashes, pbhashobject, cbhashobject, pbsecret, cbsecret, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)phhash;
    (void)nhashes;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDecrypt(void* hkey, void* pbinput, uint32_t cbinput, void* ppaddinginfo, void* pbiv, uint32_t cbiv, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDecrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pbiv, cbiv, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pbiv;
    (void)cbiv;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDeleteContext(uint32_t dwtable, void* pszcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeleteContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDeriveKey(void* hsharedsecret, void* pwszkdf, void* pparameterlist, void* pbderivedkey, uint32_t cbderivedkey, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeriveKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsharedsecret, pwszkdf, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsharedsecret;
    (void)pwszkdf;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDeriveKeyCapi(void* hhash, void* htargetalg, void* pbderivedkey, uint32_t cbderivedkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeriveKeyCapi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, htargetalg, pbderivedkey, cbderivedkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)htargetalg;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDeriveKeyPBKDF2(void* hprf, void* pbpassword, uint32_t cbpassword, void* pbsalt, uint32_t cbsalt, uint64_t citerations, void* pbderivedkey, uint32_t cbderivedkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeriveKeyPBKDF2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprf, pbpassword, cbpassword, pbsalt, cbsalt, citerations, pbderivedkey, cbderivedkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprf;
    (void)pbpassword;
    (void)cbpassword;
    (void)pbsalt;
    (void)cbsalt;
    (void)citerations;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDestroyHash(void* hhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDestroyHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDestroyKey(void* hkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDestroyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDestroySecret(void* hsecret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDestroySecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsecret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsecret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDuplicateHash(void* hhash, void* phnewhash, void* pbhashobject, uint32_t cbhashobject, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDuplicateHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, phnewhash, pbhashobject, cbhashobject, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)phnewhash;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptDuplicateKey(void* hkey, void* phnewkey, void* pbkeyobject, uint32_t cbkeyobject, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDuplicateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, phnewkey, pbkeyobject, cbkeyobject, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)phnewkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEncrypt(void* hkey, void* pbinput, uint32_t cbinput, void* ppaddinginfo, void* pbiv, uint32_t cbiv, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEncrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pbiv, cbiv, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pbiv;
    (void)cbiv;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEnumAlgorithms(uint32_t dwalgoperations, void* palgcount, void* ppalglist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumAlgorithms");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwalgoperations, palgcount, ppalglist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwalgoperations;
    (void)palgcount;
    (void)ppalglist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctionProviders(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumContextFunctionProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctions(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumContextFunctions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEnumContexts(uint32_t dwtable, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumContexts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEnumProviders(void* pszalgid, void* pimplcount, void* ppimpllist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszalgid, pimplcount, ppimpllist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszalgid;
    (void)pimplcount;
    (void)ppimpllist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptEnumRegisteredProviders(void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumRegisteredProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptExportKey(void* hkey, void* hexportkey, void* pszblobtype, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptExportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hexportkey, pszblobtype, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)hexportkey;
    (void)pszblobtype;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptFinalizeKeyPair(void* hkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptFinalizeKeyPair");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptFinishHash(void* hhash, void* pboutput, uint32_t cboutput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptFinishHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, pboutput, cboutput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_cryptography_bCryptFreeBuffer(void* pvbuffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvbuffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvbuffer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptGenRandom(void* halgorithm, void* pbbuffer, uint32_t cbbuffer, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGenRandom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, pbbuffer, cbbuffer, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)pbbuffer;
    (void)cbbuffer;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptGenerateKeyPair(void* halgorithm, void* phkey, uint32_t dwlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGenerateKeyPair");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, phkey, dwlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)phkey;
    (void)dwlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptGenerateSymmetricKey(void* halgorithm, void* phkey, void* pbkeyobject, uint32_t cbkeyobject, void* pbsecret, uint32_t cbsecret, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGenerateSymmetricKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, phkey, pbkeyobject, cbkeyobject, pbsecret, cbsecret, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)phkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptGetFipsAlgorithmMode(void* pfenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGetFipsAlgorithmMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptGetProperty(void* hobject, void* pszproperty, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, pszproperty, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptHash(void* halgorithm, void* pbsecret, uint32_t cbsecret, void* pbinput, uint32_t cbinput, void* pboutput, uint32_t cboutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, pbsecret, cbsecret, pbinput, cbinput, pboutput, cboutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)pbsecret;
    (void)cbsecret;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptHashData(void* hhash, void* pbinput, uint32_t cbinput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptHashData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, pbinput, cbinput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptImportKey(void* halgorithm, void* himportkey, void* pszblobtype, void* phkey, void* pbkeyobject, uint32_t cbkeyobject, void* pbinput, uint32_t cbinput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptImportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, himportkey, pszblobtype, phkey, pbkeyobject, cbkeyobject, pbinput, cbinput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)himportkey;
    (void)pszblobtype;
    (void)phkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptImportKeyPair(void* halgorithm, void* himportkey, void* pszblobtype, void* phkey, void* pbinput, uint32_t cbinput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptImportKeyPair");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(halgorithm, himportkey, pszblobtype, phkey, pbinput, cbinput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)halgorithm;
    (void)himportkey;
    (void)pszblobtype;
    (void)phkey;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptKeyDerivation(void* hkey, void* pparameterlist, void* pbderivedkey, uint32_t cbderivedkey, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptKeyDerivation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptOpenAlgorithmProvider(void* phalgorithm, void* pszalgid, void* pszimplementation, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptOpenAlgorithmProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phalgorithm, pszalgid, pszimplementation, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phalgorithm;
    (void)pszalgid;
    (void)pszimplementation;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptProcessMultiOperations(void* hobject, int32_t operationtype, void* poperations, uint32_t cboperations, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptProcessMultiOperations");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, operationtype, poperations, cboperations, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)operationtype;
    (void)poperations;
    (void)cboperations;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptQueryContextConfiguration(uint32_t dwtable, void* pszcontext, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryContextConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionConfiguration(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryContextFunctionConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionProperty(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pszproperty, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryContextFunctionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszproperty, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszproperty;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptQueryProviderRegistration(void* pszprovider, uint32_t dwmode, uint32_t dwinterface, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryProviderRegistration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovider, dwmode, dwinterface, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovider;
    (void)dwmode;
    (void)dwinterface;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptRegisterConfigChangeNotify(void* phevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRegisterConfigChangeNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptRegisterProvider(void* pszprovider, uint32_t dwflags, void* preg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRegisterProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovider, dwflags, preg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovider;
    (void)dwflags;
    (void)preg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunction(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRemoveContextFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunctionProvider(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pszprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRemoveContextFunctionProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptResolveProviders(void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pszprovider, uint32_t dwmode, uint32_t dwflags, void* pcbbuffer, void* ppbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptResolveProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcontext, dwinterface, pszfunction, pszprovider, dwmode, dwflags, pcbbuffer, ppbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    (void)dwmode;
    (void)dwflags;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptSecretAgreement(void* hprivkey, void* hpubkey, void* phagreedsecret, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSecretAgreement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprivkey, hpubkey, phagreedsecret, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprivkey;
    (void)hpubkey;
    (void)phagreedsecret;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptSetContextFunctionProperty(uint32_t dwtable, void* pszcontext, uint32_t dwinterface, void* pszfunction, void* pszproperty, uint32_t cbvalue, void* pbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSetContextFunctionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszproperty, cbvalue, pbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszproperty;
    (void)cbvalue;
    (void)pbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptSetProperty(void* hobject, void* pszproperty, void* pbinput, uint32_t cbinput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, pszproperty, pbinput, cbinput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptSignHash(void* hkey, void* ppaddinginfo, void* pbinput, uint32_t cbinput, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSignHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, ppaddinginfo, pbinput, cbinput, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptUnregisterConfigChangeNotify(void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptUnregisterConfigChangeNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptUnregisterProvider(void* pszprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptUnregisterProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_bCryptVerifySignature(void* hkey, void* ppaddinginfo, void* pbhash, uint32_t cbhash, void* pbsignature, uint32_t cbsignature, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptVerifySignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, ppaddinginfo, pbhash, cbhash, pbsignature, cbsignature, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhash;
    (void)cbhash;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddCRLContextToStore(void* hcertstore, void* pcrlcontext, uint32_t dwadddisposition, void* ppstorecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCRLContextToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pcrlcontext, dwadddisposition, ppstorecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pcrlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddCRLLinkToStore(void* hcertstore, void* pcrlcontext, uint32_t dwadddisposition, void* ppstorecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCRLLinkToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pcrlcontext, dwadddisposition, ppstorecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pcrlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddCTLContextToStore(void* hcertstore, void* pctlcontext, uint32_t dwadddisposition, void* ppstorecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCTLContextToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pctlcontext, dwadddisposition, ppstorecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pctlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddCTLLinkToStore(void* hcertstore, void* pctlcontext, uint32_t dwadddisposition, void* ppstorecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCTLLinkToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pctlcontext, dwadddisposition, ppstorecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pctlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddCertificateContextToStore(void* hcertstore, void* pcertcontext, uint32_t dwadddisposition, void* ppstorecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCertificateContextToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pcertcontext, dwadddisposition, ppstorecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pcertcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddCertificateLinkToStore(void* hcertstore, void* pcertcontext, uint32_t dwadddisposition, void* ppstorecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCertificateLinkToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pcertcontext, dwadddisposition, ppstorecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pcertcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddEncodedCRLToStore(void* hcertstore, uint32_t dwcertencodingtype, void* pbcrlencoded, uint32_t cbcrlencoded, uint32_t dwadddisposition, void* ppcrlcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCRLToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwcertencodingtype, pbcrlencoded, cbcrlencoded, dwadddisposition, ppcrlcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pbcrlencoded;
    (void)cbcrlencoded;
    (void)dwadddisposition;
    (void)ppcrlcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddEncodedCTLToStore(void* hcertstore, uint32_t dwmsgandcertencodingtype, void* pbctlencoded, uint32_t cbctlencoded, uint32_t dwadddisposition, void* ppctlcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCTLToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwmsgandcertencodingtype, pbctlencoded, cbctlencoded, dwadddisposition, ppctlcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwmsgandcertencodingtype;
    (void)pbctlencoded;
    (void)cbctlencoded;
    (void)dwadddisposition;
    (void)ppctlcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToStore(void* hcertstore, uint32_t dwcertencodingtype, void* pbcertencoded, uint32_t cbcertencoded, uint32_t dwadddisposition, void* ppcertcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCertificateToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwcertencodingtype, pbcertencoded, cbcertencoded, dwadddisposition, ppcertcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pbcertencoded;
    (void)cbcertencoded;
    (void)dwadddisposition;
    (void)ppcertcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreA(void* szcertstorename, void* pbcertencoded, uint32_t cbcertencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCertificateToSystemStoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcertstorename, pbcertencoded, cbcertencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szcertstorename;
    (void)pbcertencoded;
    (void)cbcertencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreW(void* szcertstorename, void* pbcertencoded, uint32_t cbcertencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCertificateToSystemStoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcertstorename, pbcertencoded, cbcertencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szcertstorename;
    (void)pbcertencoded;
    (void)cbcertencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddEnhancedKeyUsageIdentifier(void* pcertcontext, void* pszusageidentifier) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEnhancedKeyUsageIdentifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, pszusageidentifier);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)pszusageidentifier;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponse(void* hserverocspresponse) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddRefServerOcspResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hserverocspresponse);
        return;
    }
    errno = ENOSYS;
#else
    (void)hserverocspresponse;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponseContext(void* pserverocspresponsecontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddRefServerOcspResponseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pserverocspresponsecontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)pserverocspresponsecontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddSerializedElementToStore(void* hcertstore, void* pbelement, uint32_t cbelement, uint32_t dwadddisposition, uint32_t dwflags, uint32_t dwcontexttypeflags, void* pdwcontexttype, void* ppvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddSerializedElementToStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pbelement, cbelement, dwadddisposition, dwflags, dwcontexttypeflags, pdwcontexttype, ppvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)pbelement;
    (void)cbelement;
    (void)dwadddisposition;
    (void)dwflags;
    (void)dwcontexttypeflags;
    (void)pdwcontexttype;
    (void)ppvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certAddStoreToCollection(void* hcollectionstore, void* hsiblingstore, uint32_t dwupdateflags, uint32_t dwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddStoreToCollection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcollectionstore, hsiblingstore, dwupdateflags, dwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcollectionstore;
    (void)hsiblingstore;
    (void)dwupdateflags;
    (void)dwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certAlgIdToOID(uint32_t dwalgid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAlgIdToOID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwalgid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwalgid;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_security_cryptography_certCloseServerOcspResponse(void* hserverocspresponse, uint32_t dwflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCloseServerOcspResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hserverocspresponse, dwflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)hserverocspresponse;
    (void)dwflags;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certCloseStore(void* hcertstore, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCloseStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certCompareCertificate(uint32_t dwcertencodingtype, void* pcertid1, void* pcertid2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCompareCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pcertid1, pcertid2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pcertid1;
    (void)pcertid2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certCompareCertificateName(uint32_t dwcertencodingtype, void* pcertname1, void* pcertname2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCompareCertificateName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pcertname1, pcertname2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pcertname1;
    (void)pcertname2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certCompareIntegerBlob(void* pint1, void* pint2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCompareIntegerBlob");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pint1, pint2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pint1;
    (void)pint2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certComparePublicKeyInfo(uint32_t dwcertencodingtype, void* ppublickey1, void* ppublickey2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertComparePublicKeyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, ppublickey1, ppublickey2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)ppublickey1;
    (void)ppublickey2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certControlStore(void* hcertstore, uint32_t dwflags, uint32_t dwctrltype, void* pvctrlpara) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertControlStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwflags, dwctrltype, pvctrlpara);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwflags;
    (void)dwctrltype;
    (void)pvctrlpara;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certCreateCRLContext(uint32_t dwcertencodingtype, void* pbcrlencoded, uint32_t cbcrlencoded) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCRLContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pbcrlencoded, cbcrlencoded);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwcertencodingtype;
    (void)pbcrlencoded;
    (void)cbcrlencoded;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certCreateCTLContext(uint32_t dwmsgandcertencodingtype, void* pbctlencoded, uint32_t cbctlencoded) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCTLContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgandcertencodingtype, pbctlencoded, cbctlencoded);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwmsgandcertencodingtype;
    (void)pbctlencoded;
    (void)cbctlencoded;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certCreateCTLEntryFromCertificateContextProperties(void* pcertcontext, uint32_t coptattr, void* rgoptattr, uint32_t dwflags, void* pvreserved, void* pctlentry, void* pcbctlentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCTLEntryFromCertificateContextProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, coptattr, rgoptattr, dwflags, pvreserved, pctlentry, pcbctlentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)coptattr;
    (void)rgoptattr;
    (void)dwflags;
    (void)pvreserved;
    (void)pctlentry;
    (void)pcbctlentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certCreateCertificateChainEngine(void* pconfig, void* phchainengine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCertificateChainEngine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconfig, phchainengine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pconfig;
    (void)phchainengine;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certCreateCertificateContext(uint32_t dwcertencodingtype, void* pbcertencoded, uint32_t cbcertencoded) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCertificateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pbcertencoded, cbcertencoded);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwcertencodingtype;
    (void)pbcertencoded;
    (void)cbcertencoded;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certCreateContext(uint32_t dwcontexttype, uint32_t dwencodingtype, void* pbencoded, uint32_t cbencoded, uint32_t dwflags, void* pcreatepara) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcontexttype, dwencodingtype, pbencoded, cbencoded, dwflags, pcreatepara);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwcontexttype;
    (void)dwencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pcreatepara;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certCreateSelfSignCertificate(uint64_t hcryptprovorncryptkey, void* psubjectissuerblob, uint32_t dwflags, void* pkeyprovinfo, void* psignaturealgorithm, void* pstarttime, void* pendtime, void* pextensions) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateSelfSignCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprovorncryptkey, psubjectissuerblob, dwflags, pkeyprovinfo, psignaturealgorithm, pstarttime, pendtime, pextensions);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcryptprovorncryptkey;
    (void)psubjectissuerblob;
    (void)dwflags;
    (void)pkeyprovinfo;
    (void)psignaturealgorithm;
    (void)pstarttime;
    (void)pendtime;
    (void)pextensions;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certDeleteCRLFromStore(void* pcrlcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDeleteCRLFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcrlcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certDeleteCTLFromStore(void* pctlcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDeleteCTLFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pctlcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certDeleteCertificateFromStore(void* pcertcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDeleteCertificateFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certDuplicateCRLContext(void* pcrlcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCRLContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcrlcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certDuplicateCTLContext(void* pctlcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCTLContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pctlcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certDuplicateCertificateChain(void* pchaincontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCertificateChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchaincontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pchaincontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certDuplicateCertificateContext(void* pcertcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCertificateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcertcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certDuplicateStore(void* hcertstore) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certEnumCRLContextProperties(void* pcrlcontext, uint32_t dwpropid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCRLContextProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext, dwpropid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcrlcontext;
    (void)dwpropid;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_security_cryptography_certEnumCRLsInStore(void* hcertstore, void* pprevcrlcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCRLsInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pprevcrlcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)pprevcrlcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certEnumCTLContextProperties(void* pctlcontext, uint32_t dwpropid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCTLContextProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext, dwpropid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pctlcontext;
    (void)dwpropid;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_security_cryptography_certEnumCTLsInStore(void* hcertstore, void* pprevctlcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCTLsInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pprevctlcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)pprevctlcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certEnumCertificateContextProperties(void* pcertcontext, uint32_t dwpropid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCertificateContextProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwpropid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcertcontext;
    (void)dwpropid;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_security_cryptography_certEnumCertificatesInStore(void* hcertstore, void* pprevcertcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCertificatesInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pprevcertcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)pprevcertcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certEnumPhysicalStore(void* pvsystemstore, uint32_t dwflags, void* pvarg, void* pfnenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumPhysicalStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvsystemstore, dwflags, pvarg, pfnenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certEnumSubjectInSortedCTL(void* pctlcontext, void* ppvnextsubject, void* psubjectidentifier, void* pencodedattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumSubjectInSortedCTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext, ppvnextsubject, psubjectidentifier, pencodedattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pctlcontext;
    (void)ppvnextsubject;
    (void)psubjectidentifier;
    (void)pencodedattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certEnumSystemStore(uint32_t dwflags, void* pvsystemstorelocationpara, void* pvarg, void* pfnenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumSystemStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pvsystemstorelocationpara, pvarg, pfnenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pvsystemstorelocationpara;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certEnumSystemStoreLocation(uint32_t dwflags, void* pvarg, void* pfnenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumSystemStoreLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pvarg, pfnenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindAttribute(void* pszobjid, uint32_t cattr, void* rgattr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszobjid, cattr, rgattr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszobjid;
    (void)cattr;
    (void)rgattr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindCRLInStore(void* hcertstore, uint32_t dwcertencodingtype, uint32_t dwfindflags, uint32_t dwfindtype, void* pvfindpara, void* pprevcrlcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCRLInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevcrlcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevcrlcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindCTLInStore(void* hcertstore, uint32_t dwmsgandcertencodingtype, uint32_t dwfindflags, uint32_t dwfindtype, void* pvfindpara, void* pprevctlcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCTLInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwmsgandcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevctlcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)dwmsgandcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevctlcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certFindCertificateInCRL(void* pcert, void* pcrlcontext, uint32_t dwflags, void* pvreserved, void* ppcrlentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCertificateInCRL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert, pcrlcontext, dwflags, pvreserved, ppcrlentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    (void)pcrlcontext;
    (void)dwflags;
    (void)pvreserved;
    (void)ppcrlentry;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindCertificateInStore(void* hcertstore, uint32_t dwcertencodingtype, uint32_t dwfindflags, uint32_t dwfindtype, void* pvfindpara, void* pprevcertcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCertificateInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevcertcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevcertcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindChainInStore(void* hcertstore, uint32_t dwcertencodingtype, uint32_t dwfindflags, uint32_t dwfindtype, void* pvfindpara, void* pprevchaincontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindChainInStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevchaincontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevchaincontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindExtension(void* pszobjid, uint32_t cextensions, void* rgextensions) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszobjid, cextensions, rgextensions);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszobjid;
    (void)cextensions;
    (void)rgextensions;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindRDNAttr(void* pszobjid, void* pname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindRDNAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszobjid, pname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszobjid;
    (void)pname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certFindSubjectInCTL(uint32_t dwencodingtype, uint32_t dwsubjecttype, void* pvsubject, void* pctlcontext, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindSubjectInCTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, dwsubjecttype, pvsubject, pctlcontext, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)pctlcontext;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certFindSubjectInSortedCTL(void* psubjectidentifier, void* pctlcontext, uint32_t dwflags, void* pvreserved, void* pencodedattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindSubjectInSortedCTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectidentifier, pctlcontext, dwflags, pvreserved, pencodedattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectidentifier;
    (void)pctlcontext;
    (void)dwflags;
    (void)pvreserved;
    (void)pencodedattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certFreeCRLContext(void* pcrlcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCRLContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcrlcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certFreeCTLContext(void* pctlcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCTLContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pctlcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_cryptography_certFreeCertificateChain(void* pchaincontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateChain");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pchaincontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)pchaincontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_security_cryptography_certFreeCertificateChainEngine(void* hchainengine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateChainEngine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hchainengine);
        return;
    }
    errno = ENOSYS;
#else
    (void)hchainengine;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_security_cryptography_certFreeCertificateChainList(void* prgpselection) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateChainList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prgpselection);
        return;
    }
    errno = ENOSYS;
#else
    (void)prgpselection;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certFreeCertificateContext(void* pcertcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_cryptography_certFreeServerOcspResponseContext(void* pserverocspresponsecontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeServerOcspResponseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pserverocspresponsecontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)pserverocspresponsecontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetCRLContextProperty(void* pcrlcontext, uint32_t dwpropid, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCRLContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext, dwpropid, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcrlcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certGetCRLFromStore(void* hcertstore, void* pissuercontext, void* pprevcrlcontext, void* pdwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCRLFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, pissuercontext, pprevcrlcontext, pdwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)pissuercontext;
    (void)pprevcrlcontext;
    (void)pdwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetCTLContextProperty(void* pctlcontext, uint32_t dwpropid, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCTLContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext, dwpropid, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pctlcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetCertificateChain(void* hchainengine, void* pcertcontext, void* ptime, void* hadditionalstore, void* pchainpara, uint32_t dwflags, void* pvreserved, void* ppchaincontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCertificateChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchainengine, pcertcontext, ptime, hadditionalstore, pchainpara, dwflags, pvreserved, ppchaincontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchainengine;
    (void)pcertcontext;
    (void)ptime;
    (void)hadditionalstore;
    (void)pchainpara;
    (void)dwflags;
    (void)pvreserved;
    (void)ppchaincontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetCertificateContextProperty(void* pcertcontext, uint32_t dwpropid, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCertificateContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwpropid, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetEnhancedKeyUsage(void* pcertcontext, uint32_t dwflags, void* pusage, void* pcbusage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetEnhancedKeyUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwflags, pusage, pcbusage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)dwflags;
    (void)pusage;
    (void)pcbusage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetIntendedKeyUsage(uint32_t dwcertencodingtype, void* pcertinfo, void* pbkeyusage, uint32_t cbkeyusage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetIntendedKeyUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pcertinfo, pbkeyusage, cbkeyusage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pcertinfo;
    (void)pbkeyusage;
    (void)cbkeyusage;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certGetIssuerCertificateFromStore(void* hcertstore, void* psubjectcontext, void* pprevissuercontext, void* pdwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetIssuerCertificateFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, psubjectcontext, pprevissuercontext, pdwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)psubjectcontext;
    (void)pprevissuercontext;
    (void)pdwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certGetNameStringA(void* pcertcontext, uint32_t dwtype, uint32_t dwflags, void* pvtypepara, void* psznamestring, uint32_t cchnamestring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetNameStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwtype, dwflags, pvtypepara, psznamestring, cchnamestring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcertcontext;
    (void)dwtype;
    (void)dwflags;
    (void)pvtypepara;
    (void)psznamestring;
    (void)cchnamestring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certGetNameStringW(void* pcertcontext, uint32_t dwtype, uint32_t dwflags, void* pvtypepara, void* psznamestring, uint32_t cchnamestring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetNameStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwtype, dwflags, pvtypepara, psznamestring, cchnamestring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcertcontext;
    (void)dwtype;
    (void)dwflags;
    (void)pvtypepara;
    (void)psznamestring;
    (void)cchnamestring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certGetPublicKeyLength(uint32_t dwcertencodingtype, void* ppublickey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetPublicKeyLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, ppublickey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwcertencodingtype;
    (void)ppublickey;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_security_cryptography_certGetServerOcspResponseContext(void* hserverocspresponse, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetServerOcspResponseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserverocspresponse, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hserverocspresponse;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetStoreProperty(void* hcertstore, uint32_t dwpropid, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetStoreProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwpropid, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_certGetSubjectCertificateFromStore(void* hcertstore, uint32_t dwcertencodingtype, void* pcertid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetSubjectCertificateFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwcertencodingtype, pcertid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pcertid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certGetValidUsages(uint32_t ccerts, void* rghcerts, void* cnumoids, void* rghoids, void* pcboids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetValidUsages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ccerts, rghcerts, cnumoids, rghoids, pcboids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ccerts;
    (void)rghcerts;
    (void)cnumoids;
    (void)rghoids;
    (void)pcboids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certIsRDNAttrsInCertificateName(uint32_t dwcertencodingtype, uint32_t dwflags, void* pcertname, void* prdn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsRDNAttrsInCertificateName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, dwflags, pcertname, prdn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)dwflags;
    (void)pcertname;
    (void)prdn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certIsStrongHashToSign(void* pstrongsignpara, void* pwszcnghashalgid, void* psigningcert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsStrongHashToSign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstrongsignpara, pwszcnghashalgid, psigningcert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstrongsignpara;
    (void)pwszcnghashalgid;
    (void)psigningcert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certIsValidCRLForCertificate(void* pcert, void* pcrl, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsValidCRLForCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert, pcrl, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    (void)pcrl;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certIsWeakHash(uint32_t dwhashusetype, void* pwszcnghashalgid, uint32_t dwchainflags, void* psignerchaincontext, void* ptimestamp, void* pwszfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsWeakHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwhashusetype, pwszcnghashalgid, dwchainflags, psignerchaincontext, ptimestamp, pwszfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwhashusetype;
    (void)pwszcnghashalgid;
    (void)dwchainflags;
    (void)psignerchaincontext;
    (void)ptimestamp;
    (void)pwszfilename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certNameToStrA(uint32_t dwcertencodingtype, void* pname, uint32_t dwstrtype, void* psz, uint32_t csz) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertNameToStrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pname, dwstrtype, psz, csz);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwcertencodingtype;
    (void)pname;
    (void)dwstrtype;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certNameToStrW(uint32_t dwcertencodingtype, void* pname, uint32_t dwstrtype, void* psz, uint32_t csz) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertNameToStrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pname, dwstrtype, psz, csz);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwcertencodingtype;
    (void)pname;
    (void)dwstrtype;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certOIDToAlgId(void* pszobjid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOIDToAlgId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszobjid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszobjid;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_security_cryptography_certOpenServerOcspResponse(void* pchaincontext, uint32_t dwflags, void* popenpara) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenServerOcspResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchaincontext, dwflags, popenpara);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pchaincontext;
    (void)dwflags;
    (void)popenpara;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certOpenStore(void* lpszstoreprovider, uint32_t dwencodingtype, uint64_t hcryptprov, uint32_t dwflags, void* pvpara) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszstoreprovider, dwencodingtype, hcryptprov, dwflags, pvpara);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszstoreprovider;
    (void)dwencodingtype;
    (void)hcryptprov;
    (void)dwflags;
    (void)pvpara;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certOpenSystemStoreA(uint64_t hprov, void* szsubsystemprotocol) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenSystemStoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, szsubsystemprotocol);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprov;
    (void)szsubsystemprotocol;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_certOpenSystemStoreW(uint64_t hprov, void* szsubsystemprotocol) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenSystemStoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, szsubsystemprotocol);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprov;
    (void)szsubsystemprotocol;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certRDNValueToStrA(uint32_t dwvaluetype, void* pvalue, void* psz, uint32_t csz) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRDNValueToStrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwvaluetype, pvalue, psz, csz);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwvaluetype;
    (void)pvalue;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_certRDNValueToStrW(uint32_t dwvaluetype, void* pvalue, void* psz, uint32_t csz) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRDNValueToStrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwvaluetype, pvalue, psz, csz);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwvaluetype;
    (void)pvalue;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certRegisterPhysicalStore(void* pvsystemstore, uint32_t dwflags, void* pwszstorename, void* pstoreinfo, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRegisterPhysicalStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvsystemstore, dwflags, pwszstorename, pstoreinfo, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pwszstorename;
    (void)pstoreinfo;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certRegisterSystemStore(void* pvsystemstore, uint32_t dwflags, void* pstoreinfo, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRegisterSystemStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvsystemstore, dwflags, pstoreinfo, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pstoreinfo;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certRemoveEnhancedKeyUsageIdentifier(void* pcertcontext, void* pszusageidentifier) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRemoveEnhancedKeyUsageIdentifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, pszusageidentifier);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)pszusageidentifier;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_cryptography_certRemoveStoreFromCollection(void* hcollectionstore, void* hsiblingstore) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRemoveStoreFromCollection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hcollectionstore, hsiblingstore);
        return;
    }
    errno = ENOSYS;
#else
    (void)hcollectionstore;
    (void)hsiblingstore;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certResyncCertificateChainEngine(void* hchainengine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertResyncCertificateChainEngine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchainengine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchainengine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certRetrieveLogoOrBiometricInfo(void* pcertcontext, void* lpszlogoorbiometrictype, uint32_t dwretrievalflags, uint32_t dwtimeout, uint32_t dwflags, void* pvreserved, void* ppbdata, void* pcbdata, void* ppwszmimetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRetrieveLogoOrBiometricInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, lpszlogoorbiometrictype, dwretrievalflags, dwtimeout, dwflags, pvreserved, ppbdata, pcbdata, ppwszmimetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)lpszlogoorbiometrictype;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)dwflags;
    (void)pvreserved;
    (void)ppbdata;
    (void)pcbdata;
    (void)ppwszmimetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSaveStore(void* hcertstore, uint32_t dwencodingtype, uint32_t dwsaveas, uint32_t dwsaveto, void* pvsavetopara, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSaveStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwencodingtype, dwsaveas, dwsaveto, pvsavetopara, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwencodingtype;
    (void)dwsaveas;
    (void)dwsaveto;
    (void)pvsavetopara;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSelectCertificateChains(void* pselectioncontext, uint32_t dwflags, void* pchainparameters, uint32_t ccriteria, void* rgpcriteria, void* hstore, void* pcselection, void* pprgpselection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSelectCertificateChains");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pselectioncontext, dwflags, pchainparameters, ccriteria, rgpcriteria, hstore, pcselection, pprgpselection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pselectioncontext;
    (void)dwflags;
    (void)pchainparameters;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)hstore;
    (void)pcselection;
    (void)pprgpselection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSerializeCRLStoreElement(void* pcrlcontext, uint32_t dwflags, void* pbelement, void* pcbelement) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSerializeCRLStoreElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext, dwflags, pbelement, pcbelement);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcrlcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSerializeCTLStoreElement(void* pctlcontext, uint32_t dwflags, void* pbelement, void* pcbelement) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSerializeCTLStoreElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext, dwflags, pbelement, pcbelement);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pctlcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSerializeCertificateStoreElement(void* pcertcontext, uint32_t dwflags, void* pbelement, void* pcbelement) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSerializeCertificateStoreElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwflags, pbelement, pcbelement);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSetCRLContextProperty(void* pcrlcontext, uint32_t dwpropid, uint32_t dwflags, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCRLContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrlcontext, dwpropid, dwflags, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcrlcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSetCTLContextProperty(void* pctlcontext, uint32_t dwpropid, uint32_t dwflags, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCTLContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pctlcontext, dwpropid, dwflags, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pctlcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSetCertificateContextPropertiesFromCTLEntry(void* pcertcontext, void* pctlentry, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCertificateContextPropertiesFromCTLEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, pctlentry, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)pctlentry;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSetCertificateContextProperty(void* pcertcontext, uint32_t dwpropid, uint32_t dwflags, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCertificateContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, dwpropid, dwflags, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSetEnhancedKeyUsage(void* pcertcontext, void* pusage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetEnhancedKeyUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, pusage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)pusage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certSetStoreProperty(void* hcertstore, uint32_t dwpropid, uint32_t dwflags, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetStoreProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcertstore, dwpropid, dwflags, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcertstore;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certStrToNameA(uint32_t dwcertencodingtype, void* pszx500, uint32_t dwstrtype, void* pvreserved, void* pbencoded, void* pcbencoded, void* ppszerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertStrToNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pszx500, dwstrtype, pvreserved, pbencoded, pcbencoded, ppszerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pszx500;
    (void)dwstrtype;
    (void)pvreserved;
    (void)pbencoded;
    (void)pcbencoded;
    (void)ppszerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certStrToNameW(uint32_t dwcertencodingtype, void* pszx500, uint32_t dwstrtype, void* pvreserved, void* pbencoded, void* pcbencoded, void* ppszerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertStrToNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pszx500, dwstrtype, pvreserved, pbencoded, pcbencoded, ppszerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pszx500;
    (void)dwstrtype;
    (void)pvreserved;
    (void)pbencoded;
    (void)pcbencoded;
    (void)ppszerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certUnregisterPhysicalStore(void* pvsystemstore, uint32_t dwflags, void* pwszstorename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertUnregisterPhysicalStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvsystemstore, dwflags, pwszstorename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pwszstorename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certUnregisterSystemStore(void* pvsystemstore, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertUnregisterSystemStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvsystemstore, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyCRLRevocation(uint32_t dwcertencodingtype, void* pcertid, uint32_t ccrlinfo, void* rgpcrlinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCRLRevocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pcertid, ccrlinfo, rgpcrlinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pcertid;
    (void)ccrlinfo;
    (void)rgpcrlinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyCRLTimeValidity(void* ptimetoverify, void* pcrlinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCRLTimeValidity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptimetoverify, pcrlinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptimetoverify;
    (void)pcrlinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyCTLUsage(uint32_t dwencodingtype, uint32_t dwsubjecttype, void* pvsubject, void* psubjectusage, uint32_t dwflags, void* pverifyusagepara, void* pverifyusagestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCTLUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, dwsubjecttype, pvsubject, psubjectusage, dwflags, pverifyusagepara, pverifyusagestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)psubjectusage;
    (void)dwflags;
    (void)pverifyusagepara;
    (void)pverifyusagestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyCertificateChainPolicy(void* pszpolicyoid, void* pchaincontext, void* ppolicypara, void* ppolicystatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCertificateChainPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpolicyoid, pchaincontext, ppolicypara, ppolicystatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpolicyoid;
    (void)pchaincontext;
    (void)ppolicypara;
    (void)ppolicystatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyRevocation(uint32_t dwencodingtype, uint32_t dwrevtype, uint32_t ccontext, void* rgpvcontext, uint32_t dwflags, void* prevpara, void* prevstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyRevocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, dwrevtype, ccontext, rgpvcontext, dwflags, prevpara, prevstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)dwrevtype;
    (void)ccontext;
    (void)rgpvcontext;
    (void)dwflags;
    (void)prevpara;
    (void)prevstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifySubjectCertificateContext(void* psubject, void* pissuer, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifySubjectCertificateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubject, pissuer, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubject;
    (void)pissuer;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyTimeValidity(void* ptimetoverify, void* pcertinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyTimeValidity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptimetoverify, pcertinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptimetoverify;
    (void)pcertinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certVerifyValidityNesting(void* psubjectinfo, void* pissuerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyValidityNesting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, pissuerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)pissuerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_closeCryptoHandle(void* hcrypto) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseCryptoHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptAcquireCertificatePrivateKey(void* pcert, uint32_t dwflags, void* pvparameters, void* phcryptprovorncryptkey, void* pdwkeyspec, void* pfcallerfreeprovorncryptkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptAcquireCertificatePrivateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert, dwflags, pvparameters, phcryptprovorncryptkey, pdwkeyspec, pfcallerfreeprovorncryptkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    (void)dwflags;
    (void)pvparameters;
    (void)phcryptprovorncryptkey;
    (void)pdwkeyspec;
    (void)pfcallerfreeprovorncryptkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptAcquireContextA(void* phprov, void* szcontainer, void* szprovider, uint32_t dwprovtype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptAcquireContextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phprov, szcontainer, szprovider, dwprovtype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phprov;
    (void)szcontainer;
    (void)szprovider;
    (void)dwprovtype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptAcquireContextW(void* phprov, void* szcontainer, void* szprovider, uint32_t dwprovtype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptAcquireContextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phprov, szcontainer, szprovider, dwprovtype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phprov;
    (void)szcontainer;
    (void)szprovider;
    (void)dwprovtype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptBinaryToStringA(void* pbbinary, uint32_t cbbinary, uint32_t dwflags, void* pszstring, void* pcchstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptBinaryToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbbinary, cbbinary, dwflags, pszstring, pcchstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbbinary;
    (void)cbbinary;
    (void)dwflags;
    (void)pszstring;
    (void)pcchstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptBinaryToStringW(void* pbbinary, uint32_t cbbinary, uint32_t dwflags, void* pszstring, void* pcchstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptBinaryToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbbinary, cbbinary, dwflags, pszstring, pcchstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbbinary;
    (void)cbbinary;
    (void)dwflags;
    (void)pszstring;
    (void)pcchstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptCloseAsyncHandle(int64_t hasync) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCloseAsyncHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasync);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hasync;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptContextAddRef(uint64_t hprov, void* pdwreserved, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptContextAddRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, pdwreserved, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)pdwreserved;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptCreateAsyncHandle(uint32_t dwflags, void* phasync) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCreateAsyncHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, phasync);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)phasync;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptCreateHash(uint64_t hprov, uint32_t algid, uint64_t hkey, uint32_t dwflags, void* phhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCreateHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, algid, hkey, dwflags, phhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)algid;
    (void)hkey;
    (void)dwflags;
    (void)phhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptCreateKeyIdentifierFromCSP(uint32_t dwcertencodingtype, void* pszpubkeyoid, void* ppubkeystruc, uint32_t cbpubkeystruc, uint32_t dwflags, void* pvreserved, void* pbhash, void* pcbhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCreateKeyIdentifierFromCSP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pszpubkeyoid, ppubkeystruc, cbpubkeystruc, dwflags, pvreserved, pbhash, pcbhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pszpubkeyoid;
    (void)ppubkeystruc;
    (void)cbpubkeystruc;
    (void)dwflags;
    (void)pvreserved;
    (void)pbhash;
    (void)pcbhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDecodeMessage(uint32_t dwmsgtypeflags, void* pdecryptpara, void* pverifypara, uint32_t dwsignerindex, void* pbencodedblob, uint32_t cbencodedblob, uint32_t dwprevinnercontenttype, void* pdwmsgtype, void* pdwinnercontenttype, void* pbdecoded, void* pcbdecoded, void* ppxchgcert, void* ppsignercert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecodeMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgtypeflags, pdecryptpara, pverifypara, dwsignerindex, pbencodedblob, cbencodedblob, dwprevinnercontenttype, pdwmsgtype, pdwinnercontenttype, pbdecoded, pcbdecoded, ppxchgcert, ppsignercert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmsgtypeflags;
    (void)pdecryptpara;
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbencodedblob;
    (void)cbencodedblob;
    (void)dwprevinnercontenttype;
    (void)pdwmsgtype;
    (void)pdwinnercontenttype;
    (void)pbdecoded;
    (void)pcbdecoded;
    (void)ppxchgcert;
    (void)ppsignercert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDecodeObject(uint32_t dwcertencodingtype, void* lpszstructtype, void* pbencoded, uint32_t cbencoded, uint32_t dwflags, void* pvstructinfo, void* pcbstructinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecodeObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, lpszstructtype, pbencoded, cbencoded, dwflags, pvstructinfo, pcbstructinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pvstructinfo;
    (void)pcbstructinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDecodeObjectEx(uint32_t dwcertencodingtype, void* lpszstructtype, void* pbencoded, uint32_t cbencoded, uint32_t dwflags, void* pdecodepara, void* pvstructinfo, void* pcbstructinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecodeObjectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, lpszstructtype, pbencoded, cbencoded, dwflags, pdecodepara, pvstructinfo, pcbstructinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pdecodepara;
    (void)pvstructinfo;
    (void)pcbstructinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDecrypt(uint64_t hkey, uint64_t hhash, int32_t final, uint32_t dwflags, void* pbdata, void* pdwdatalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hhash, final, dwflags, pbdata, pdwdatalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)hhash;
    (void)final;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDecryptAndVerifyMessageSignature(void* pdecryptpara, void* pverifypara, uint32_t dwsignerindex, void* pbencryptedblob, uint32_t cbencryptedblob, void* pbdecrypted, void* pcbdecrypted, void* ppxchgcert, void* ppsignercert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecryptAndVerifyMessageSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecryptpara, pverifypara, dwsignerindex, pbencryptedblob, cbencryptedblob, pbdecrypted, pcbdecrypted, ppxchgcert, ppsignercert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecryptpara;
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbencryptedblob;
    (void)cbencryptedblob;
    (void)pbdecrypted;
    (void)pcbdecrypted;
    (void)ppxchgcert;
    (void)ppsignercert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDecryptMessage(void* pdecryptpara, void* pbencryptedblob, uint32_t cbencryptedblob, void* pbdecrypted, void* pcbdecrypted, void* ppxchgcert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecryptMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecryptpara, pbencryptedblob, cbencryptedblob, pbdecrypted, pcbdecrypted, ppxchgcert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecryptpara;
    (void)pbencryptedblob;
    (void)cbencryptedblob;
    (void)pbdecrypted;
    (void)pcbdecrypted;
    (void)ppxchgcert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDeriveKey(uint64_t hprov, uint32_t algid, uint64_t hbasedata, uint32_t dwflags, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDeriveKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, algid, hbasedata, dwflags, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)algid;
    (void)hbasedata;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDestroyHash(uint64_t hhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDestroyHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDestroyKey(uint64_t hkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDestroyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDuplicateHash(uint64_t hhash, void* pdwreserved, uint32_t dwflags, void* phhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDuplicateHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, pdwreserved, dwflags, phhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)pdwreserved;
    (void)dwflags;
    (void)phhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptDuplicateKey(uint64_t hkey, void* pdwreserved, uint32_t dwflags, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDuplicateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pdwreserved, dwflags, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pdwreserved;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEncodeObject(uint32_t dwcertencodingtype, void* lpszstructtype, void* pvstructinfo, void* pbencoded, void* pcbencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncodeObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, lpszstructtype, pvstructinfo, pbencoded, pcbencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEncodeObjectEx(uint32_t dwcertencodingtype, void* lpszstructtype, void* pvstructinfo, uint32_t dwflags, void* pencodepara, void* pvencoded, void* pcbencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncodeObjectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, lpszstructtype, pvstructinfo, dwflags, pencodepara, pvencoded, pcbencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)dwflags;
    (void)pencodepara;
    (void)pvencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEncrypt(uint64_t hkey, uint64_t hhash, int32_t final, uint32_t dwflags, void* pbdata, void* pdwdatalen, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hhash, final, dwflags, pbdata, pdwdatalen, dwbuflen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)hhash;
    (void)final;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwbuflen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEncryptMessage(void* pencryptpara, uint32_t crecipientcert, void* rgprecipientcert, void* pbtobeencrypted, uint32_t cbtobeencrypted, void* pbencryptedblob, void* pcbencryptedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncryptMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pencryptpara, crecipientcert, rgprecipientcert, pbtobeencrypted, cbtobeencrypted, pbencryptedblob, pcbencryptedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pencryptpara;
    (void)crecipientcert;
    (void)rgprecipientcert;
    (void)pbtobeencrypted;
    (void)cbtobeencrypted;
    (void)pbencryptedblob;
    (void)pcbencryptedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumKeyIdentifierProperties(void* pkeyidentifier, uint32_t dwpropid, uint32_t dwflags, void* pwszcomputername, void* pvreserved, void* pvarg, void* pfnenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumKeyIdentifierProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pkeyidentifier, dwpropid, dwflags, pwszcomputername, pvreserved, pvarg, pfnenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumOIDFunction(uint32_t dwencodingtype, void* pszfuncname, void* pszoid, uint32_t dwflags, void* pvarg, void* pfnenumoidfunc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumOIDFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, pszoid, dwflags, pvarg, pfnenumoidfunc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumoidfunc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumOIDInfo(uint32_t dwgroupid, uint32_t dwflags, void* pvarg, void* pfnenumoidinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumOIDInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwgroupid, dwflags, pvarg, pfnenumoidinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwgroupid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumoidinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesA(uint32_t dwindex, void* pdwreserved, uint32_t dwflags, void* pdwprovtype, void* sztypename, void* pcbtypename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProviderTypesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, sztypename, pcbtypename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)sztypename;
    (void)pcbtypename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesW(uint32_t dwindex, void* pdwreserved, uint32_t dwflags, void* pdwprovtype, void* sztypename, void* pcbtypename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProviderTypesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, sztypename, pcbtypename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)sztypename;
    (void)pcbtypename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumProvidersA(uint32_t dwindex, void* pdwreserved, uint32_t dwflags, void* pdwprovtype, void* szprovname, void* pcbprovname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProvidersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, szprovname, pcbprovname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)szprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptEnumProvidersW(uint32_t dwindex, void* pdwreserved, uint32_t dwflags, void* pdwprovtype, void* szprovname, void* pcbprovname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProvidersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, szprovname, pcbprovname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)szprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptExportKey(uint64_t hkey, uint64_t hexpkey, uint32_t dwblobtype, uint32_t dwflags, void* pbdata, void* pdwdatalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hexpkey, dwblobtype, dwflags, pbdata, pdwdatalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)hexpkey;
    (void)dwblobtype;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptExportPKCS8(uint64_t hcryptprov, uint32_t dwkeyspec, void* pszprivatekeyobjid, uint32_t dwflags, void* pvauxinfo, void* pbprivatekeyblob, void* pcbprivatekeyblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPKCS8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwkeyspec, pszprivatekeyobjid, dwflags, pvauxinfo, pbprivatekeyblob, pcbprivatekeyblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwkeyspec;
    (void)pszprivatekeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pbprivatekeyblob;
    (void)pcbprivatekeyblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfo(uint64_t hcryptprovorncryptkey, uint32_t dwkeyspec, uint32_t dwcertencodingtype, void* pinfo, void* pcbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPublicKeyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pinfo, pcbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)pcbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoEx(uint64_t hcryptprovorncryptkey, uint32_t dwkeyspec, uint32_t dwcertencodingtype, void* pszpublickeyobjid, uint32_t dwflags, void* pvauxinfo, void* pinfo, void* pcbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPublicKeyInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pszpublickeyobjid, dwflags, pvauxinfo, pinfo, pcbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pszpublickeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pinfo;
    (void)pcbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoFromBCryptKeyHandle(void* hbcryptkey, uint32_t dwcertencodingtype, void* pszpublickeyobjid, uint32_t dwflags, void* pvauxinfo, void* pinfo, void* pcbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPublicKeyInfoFromBCryptKeyHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbcryptkey, dwcertencodingtype, pszpublickeyobjid, dwflags, pvauxinfo, pinfo, pcbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbcryptkey;
    (void)dwcertencodingtype;
    (void)pszpublickeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pinfo;
    (void)pcbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptFindCertificateKeyProvInfo(void* pcert, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFindCertificateKeyProvInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptFindLocalizedName(void* pwszcryptname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFindLocalizedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszcryptname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszcryptname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptFindOIDInfo(uint32_t dwkeytype, void* pvkey, uint32_t dwgroupid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFindOIDInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwkeytype, pvkey, dwgroupid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwkeytype;
    (void)pvkey;
    (void)dwgroupid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptFormatObject(uint32_t dwcertencodingtype, uint32_t dwformattype, uint32_t dwformatstrtype, void* pformatstruct, void* lpszstructtype, void* pbencoded, uint32_t cbencoded, void* pbformat, void* pcbformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFormatObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, dwformattype, dwformatstrtype, pformatstruct, lpszstructtype, pbencoded, cbencoded, pbformat, pcbformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)dwformattype;
    (void)dwformatstrtype;
    (void)pformatstruct;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbformat;
    (void)pcbformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptFreeOIDFunctionAddress(void* hfuncaddr, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFreeOIDFunctionAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfuncaddr, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfuncaddr;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGenKey(uint64_t hprov, uint32_t algid, uint32_t dwflags, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGenKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, algid, dwflags, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)algid;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGenRandom(uint64_t hprov, uint32_t dwlen, void* pbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGenRandom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, dwlen, pbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)dwlen;
    (void)pbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetAsyncParam(int64_t hasync, void* pszparamoid, void* ppvparam, void* ppfnfree) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetAsyncParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasync, pszparamoid, ppvparam, ppfnfree);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hasync;
    (void)pszparamoid;
    (void)ppvparam;
    (void)ppfnfree;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDDllList(void* hfuncset, uint32_t dwencodingtype, void* pwszdlllist, void* pcchdlllist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultOIDDllList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfuncset, dwencodingtype, pwszdlllist, pcchdlllist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pwszdlllist;
    (void)pcchdlllist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDFunctionAddress(void* hfuncset, uint32_t dwencodingtype, void* pwszdll, uint32_t dwflags, void* ppvfuncaddr, void* phfuncaddr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultOIDFunctionAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfuncset, dwencodingtype, pwszdll, dwflags, ppvfuncaddr, phfuncaddr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pwszdll;
    (void)dwflags;
    (void)ppvfuncaddr;
    (void)phfuncaddr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderA(uint32_t dwprovtype, void* pdwreserved, uint32_t dwflags, void* pszprovname, void* pcbprovname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultProviderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprovtype, pdwreserved, dwflags, pszprovname, pcbprovname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    (void)pszprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderW(uint32_t dwprovtype, void* pdwreserved, uint32_t dwflags, void* pszprovname, void* pcbprovname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultProviderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprovtype, pdwreserved, dwflags, pszprovname, pcbprovname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    (void)pszprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetHashParam(uint64_t hhash, uint32_t dwparam, void* pbdata, void* pdwdatalen, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetHashParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, dwparam, pbdata, pdwdatalen, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetKeyIdentifierProperty(void* pkeyidentifier, uint32_t dwpropid, uint32_t dwflags, void* pwszcomputername, void* pvreserved, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetKeyIdentifierProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pkeyidentifier, dwpropid, dwflags, pwszcomputername, pvreserved, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetKeyParam(uint64_t hkey, uint32_t dwparam, void* pbdata, void* pdwdatalen, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetKeyParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwparam, pbdata, pdwdatalen, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptGetMessageCertificates(uint32_t dwmsgandcertencodingtype, uint64_t hcryptprov, uint32_t dwflags, void* pbsignedblob, uint32_t cbsignedblob) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetMessageCertificates");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgandcertencodingtype, hcryptprov, dwflags, pbsignedblob, cbsignedblob);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwmsgandcertencodingtype;
    (void)hcryptprov;
    (void)dwflags;
    (void)pbsignedblob;
    (void)cbsignedblob;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetMessageSignerCount(uint32_t dwmsgencodingtype, void* pbsignedblob, uint32_t cbsignedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetMessageSignerCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgencodingtype, pbsignedblob, cbsignedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmsgencodingtype;
    (void)pbsignedblob;
    (void)cbsignedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionAddress(void* hfuncset, uint32_t dwencodingtype, void* pszoid, uint32_t dwflags, void* ppvfuncaddr, void* phfuncaddr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetOIDFunctionAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfuncset, dwencodingtype, pszoid, dwflags, ppvfuncaddr, phfuncaddr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pszoid;
    (void)dwflags;
    (void)ppvfuncaddr;
    (void)phfuncaddr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionValue(uint32_t dwencodingtype, void* pszfuncname, void* pszoid, void* pwszvaluename, void* pdwvaluetype, void* pbvaluedata, void* pcbvaluedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetOIDFunctionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, pszoid, pwszvaluename, pdwvaluetype, pbvaluedata, pcbvaluedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszvaluename;
    (void)pdwvaluetype;
    (void)pbvaluedata;
    (void)pcbvaluedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetObjectUrl(void* pszurloid, void* pvpara, uint32_t dwflags, void* purlarray, void* pcburlarray, void* purlinfo, void* pcburlinfo, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetObjectUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurloid, pvpara, dwflags, purlarray, pcburlarray, purlinfo, pcburlinfo, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurloid;
    (void)pvpara;
    (void)dwflags;
    (void)purlarray;
    (void)pcburlarray;
    (void)purlinfo;
    (void)pcburlinfo;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetProvParam(uint64_t hprov, uint32_t dwparam, void* pbdata, void* pdwdatalen, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetProvParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, dwparam, pbdata, pdwdatalen, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptGetUserKey(uint64_t hprov, uint32_t dwkeyspec, void* phuserkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetUserKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, dwkeyspec, phuserkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)dwkeyspec;
    (void)phuserkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashCertificate(uint64_t hcryptprov, uint32_t algid, uint32_t dwflags, void* pbencoded, uint32_t cbencoded, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, algid, dwflags, pbencoded, cbencoded, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)algid;
    (void)dwflags;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashCertificate2(void* pwszcnghashalgid, uint32_t dwflags, void* pvreserved, void* pbencoded, uint32_t cbencoded, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashCertificate2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszcnghashalgid, dwflags, pvreserved, pbencoded, cbencoded, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszcnghashalgid;
    (void)dwflags;
    (void)pvreserved;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashData(uint64_t hhash, void* pbdata, uint32_t dwdatalen, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, pbdata, dwdatalen, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)pbdata;
    (void)dwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashMessage(void* phashpara, int32_t fdetachedhash, uint32_t ctobehashed, void* rgpbtobehashed, void* rgcbtobehashed, void* pbhashedblob, void* pcbhashedblob, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phashpara, fdetachedhash, ctobehashed, rgpbtobehashed, rgcbtobehashed, pbhashedblob, pcbhashedblob, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phashpara;
    (void)fdetachedhash;
    (void)ctobehashed;
    (void)rgpbtobehashed;
    (void)rgcbtobehashed;
    (void)pbhashedblob;
    (void)pcbhashedblob;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashPublicKeyInfo(uint64_t hcryptprov, uint32_t algid, uint32_t dwflags, uint32_t dwcertencodingtype, void* pinfo, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashPublicKeyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, algid, dwflags, dwcertencodingtype, pinfo, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)algid;
    (void)dwflags;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashSessionKey(uint64_t hhash, uint64_t hkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashSessionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, hkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptHashToBeSigned(uint64_t hcryptprov, uint32_t dwcertencodingtype, void* pbencoded, uint32_t cbencoded, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashToBeSigned");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwcertencodingtype, pbencoded, cbencoded, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptImportKey(uint64_t hprov, void* pbdata, uint32_t dwdatalen, uint64_t hpubkey, uint32_t dwflags, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, pbdata, dwdatalen, hpubkey, dwflags, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)pbdata;
    (void)dwdatalen;
    (void)hpubkey;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfo(uint64_t hcryptprov, uint32_t dwcertencodingtype, void* pinfo, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportPublicKeyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwcertencodingtype, pinfo, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx(uint64_t hcryptprov, uint32_t dwcertencodingtype, void* pinfo, uint32_t aikeyalg, uint32_t dwflags, void* pvauxinfo, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportPublicKeyInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwcertencodingtype, pinfo, aikeyalg, dwflags, pvauxinfo, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)aikeyalg;
    (void)dwflags;
    (void)pvauxinfo;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx2(uint32_t dwcertencodingtype, void* pinfo, uint32_t dwflags, void* pvauxinfo, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportPublicKeyInfoEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcertencodingtype, pinfo, dwflags, pvauxinfo, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)dwflags;
    (void)pvauxinfo;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptInitOIDFunctionSet(void* pszfuncname, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInitOIDFunctionSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfuncname, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfuncname;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptInstallCancelRetrieval(void* pfncancel, void* pvarg, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInstallCancelRetrieval");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfncancel, pvarg, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfncancel;
    (void)pvarg;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptInstallDefaultContext(uint64_t hcryptprov, uint32_t dwdefaulttype, void* pvdefaultpara, uint32_t dwflags, void* pvreserved, void* phdefaultcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInstallDefaultContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwdefaulttype, pvdefaultpara, dwflags, pvreserved, phdefaultcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwdefaulttype;
    (void)pvdefaultpara;
    (void)dwflags;
    (void)pvreserved;
    (void)phdefaultcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptInstallOIDFunctionAddress(void* hmodule, uint32_t dwencodingtype, void* pszfuncname, uint32_t cfuncentry, void* rgfuncentry, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInstallOIDFunctionAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, dwencodingtype, pszfuncname, cfuncentry, rgfuncentry, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)cfuncentry;
    (void)rgfuncentry;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptMemAlloc(uint32_t cbsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMemAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cbsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_security_cryptography_cryptMemFree(void* pv) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMemFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pv);
        return;
    }
    errno = ENOSYS;
#else
    (void)pv;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptMemRealloc(void* pv, uint32_t cbsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMemRealloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pv, cbsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pv;
    (void)cbsize;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_cryptography_cryptMsgCalculateEncodedLength(uint32_t dwmsgencodingtype, uint32_t dwflags, uint32_t dwmsgtype, void* pvmsgencodeinfo, void* pszinnercontentobjid, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgCalculateEncodedLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgencodingtype, dwflags, dwmsgtype, pvmsgencodeinfo, pszinnercontentobjid, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)pvmsgencodeinfo;
    (void)pszinnercontentobjid;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgClose(void* hcryptmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgControl(void* hcryptmsg, uint32_t dwflags, uint32_t dwctrltype, void* pvctrlpara) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg, dwflags, dwctrltype, pvctrlpara);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptmsg;
    (void)dwflags;
    (void)dwctrltype;
    (void)pvctrlpara;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgCountersign(void* hcryptmsg, uint32_t dwindex, uint32_t ccountersigners, void* rgcountersigners) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgCountersign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg, dwindex, ccountersigners, rgcountersigners);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptmsg;
    (void)dwindex;
    (void)ccountersigners;
    (void)rgcountersigners;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgCountersignEncoded(uint32_t dwencodingtype, void* pbsignerinfo, uint32_t cbsignerinfo, uint32_t ccountersigners, void* rgcountersigners, void* pbcountersignature, void* pcbcountersignature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgCountersignEncoded");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pbsignerinfo, cbsignerinfo, ccountersigners, rgcountersigners, pbcountersignature, pcbcountersignature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)ccountersigners;
    (void)rgcountersigners;
    (void)pbcountersignature;
    (void)pcbcountersignature;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptMsgDuplicate(void* hcryptmsg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgDuplicate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcryptmsg;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgEncodeAndSignCTL(uint32_t dwmsgencodingtype, void* pctlinfo, void* psigninfo, uint32_t dwflags, void* pbencoded, void* pcbencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgEncodeAndSignCTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgencodingtype, pctlinfo, psigninfo, dwflags, pbencoded, pcbencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmsgencodingtype;
    (void)pctlinfo;
    (void)psigninfo;
    (void)dwflags;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgGetAndVerifySigner(void* hcryptmsg, uint32_t csignerstore, void* rghsignerstore, uint32_t dwflags, void* ppsigner, void* pdwsignerindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgGetAndVerifySigner");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg, csignerstore, rghsignerstore, dwflags, ppsigner, pdwsignerindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptmsg;
    (void)csignerstore;
    (void)rghsignerstore;
    (void)dwflags;
    (void)ppsigner;
    (void)pdwsignerindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgGetParam(void* hcryptmsg, uint32_t dwparamtype, uint32_t dwindex, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgGetParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg, dwparamtype, dwindex, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptmsg;
    (void)dwparamtype;
    (void)dwindex;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptMsgOpenToDecode(uint32_t dwmsgencodingtype, uint32_t dwflags, uint32_t dwmsgtype, uint64_t hcryptprov, void* precipientinfo, void* pstreaminfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgOpenToDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgencodingtype, dwflags, dwmsgtype, hcryptprov, precipientinfo, pstreaminfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)hcryptprov;
    (void)precipientinfo;
    (void)pstreaminfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptMsgOpenToEncode(uint32_t dwmsgencodingtype, uint32_t dwflags, uint32_t dwmsgtype, void* pvmsgencodeinfo, void* pszinnercontentobjid, void* pstreaminfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgOpenToEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgencodingtype, dwflags, dwmsgtype, pvmsgencodeinfo, pszinnercontentobjid, pstreaminfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)pvmsgencodeinfo;
    (void)pszinnercontentobjid;
    (void)pstreaminfo;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgSignCTL(uint32_t dwmsgencodingtype, void* pbctlcontent, uint32_t cbctlcontent, void* psigninfo, uint32_t dwflags, void* pbencoded, void* pcbencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgSignCTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmsgencodingtype, pbctlcontent, cbctlcontent, psigninfo, dwflags, pbencoded, pcbencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmsgencodingtype;
    (void)pbctlcontent;
    (void)cbctlcontent;
    (void)psigninfo;
    (void)dwflags;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgUpdate(void* hcryptmsg, void* pbdata, uint32_t cbdata, int32_t ffinal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgUpdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptmsg, pbdata, cbdata, ffinal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptmsg;
    (void)pbdata;
    (void)cbdata;
    (void)ffinal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncoded(uint64_t hcryptprov, uint32_t dwencodingtype, void* pbsignerinfo, uint32_t cbsignerinfo, void* pbsignerinfocountersignature, uint32_t cbsignerinfocountersignature, void* pcicountersigner) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgVerifyCountersignatureEncoded");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwencodingtype, pbsignerinfo, cbsignerinfo, pbsignerinfocountersignature, cbsignerinfocountersignature, pcicountersigner);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)pbsignerinfocountersignature;
    (void)cbsignerinfocountersignature;
    (void)pcicountersigner;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncodedEx(uint64_t hcryptprov, uint32_t dwencodingtype, void* pbsignerinfo, uint32_t cbsignerinfo, void* pbsignerinfocountersignature, uint32_t cbsignerinfocountersignature, uint32_t dwsignertype, void* pvsigner, uint32_t dwflags, void* pvextra) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgVerifyCountersignatureEncodedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwencodingtype, pbsignerinfo, cbsignerinfo, pbsignerinfocountersignature, cbsignerinfocountersignature, dwsignertype, pvsigner, dwflags, pvextra);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)pbsignerinfocountersignature;
    (void)cbsignerinfocountersignature;
    (void)dwsignertype;
    (void)pvsigner;
    (void)dwflags;
    (void)pvextra;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptProtectData(void* pdatain, void* szdatadescr, void* poptionalentropy, void* pvreserved, void* ppromptstruct, uint32_t dwflags, void* pdataout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptProtectData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdatain, szdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags, pdataout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdatain;
    (void)szdatadescr;
    (void)poptionalentropy;
    (void)pvreserved;
    (void)ppromptstruct;
    (void)dwflags;
    (void)pdataout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptProtectMemory(void* pdatain, uint32_t cbdatain, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptProtectMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdatain, cbdatain, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdatain;
    (void)cbdatain;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptQueryObject(uint32_t dwobjecttype, void* pvobject, uint32_t dwexpectedcontenttypeflags, uint32_t dwexpectedformattypeflags, uint32_t dwflags, void* pdwmsgandcertencodingtype, void* pdwcontenttype, void* pdwformattype, void* phcertstore, void* phmsg, void* ppvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptQueryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwobjecttype, pvobject, dwexpectedcontenttypeflags, dwexpectedformattypeflags, dwflags, pdwmsgandcertencodingtype, pdwcontenttype, pdwformattype, phcertstore, phmsg, ppvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwobjecttype;
    (void)pvobject;
    (void)dwexpectedcontenttypeflags;
    (void)dwexpectedformattypeflags;
    (void)dwflags;
    (void)pdwmsgandcertencodingtype;
    (void)pdwcontenttype;
    (void)pdwformattype;
    (void)phcertstore;
    (void)phmsg;
    (void)ppvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptRegisterDefaultOIDFunction(uint32_t dwencodingtype, void* pszfuncname, uint32_t dwindex, void* pwszdll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRegisterDefaultOIDFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, dwindex, pwszdll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)dwindex;
    (void)pwszdll;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptRegisterOIDFunction(uint32_t dwencodingtype, void* pszfuncname, void* pszoid, void* pwszdll, void* pszoverridefuncname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRegisterOIDFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, pszoid, pwszdll, pszoverridefuncname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszdll;
    (void)pszoverridefuncname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptRegisterOIDInfo(void* pinfo, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRegisterOIDInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinfo, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinfo;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptReleaseContext(uint64_t hprov, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptReleaseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlA(void* pszurl, void* pszobjectoid, uint32_t dwretrievalflags, uint32_t dwtimeout, void* ppvobject, int64_t hasyncretrieve, void* pcredentials, void* pvverify, void* pauxinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRetrieveObjectByUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszobjectoid, dwretrievalflags, dwtimeout, ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszobjectoid;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)ppvobject;
    (void)hasyncretrieve;
    (void)pcredentials;
    (void)pvverify;
    (void)pauxinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlW(void* pszurl, void* pszobjectoid, uint32_t dwretrievalflags, uint32_t dwtimeout, void* ppvobject, int64_t hasyncretrieve, void* pcredentials, void* pvverify, void* pauxinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRetrieveObjectByUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszobjectoid, dwretrievalflags, dwtimeout, ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszobjectoid;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)ppvobject;
    (void)hasyncretrieve;
    (void)pcredentials;
    (void)pvverify;
    (void)pauxinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptRetrieveTimeStamp(void* wszurl, uint32_t dwretrievalflags, uint32_t dwtimeout, void* pszhashid, void* ppara, void* pbdata, uint32_t cbdata, void* pptscontext, void* pptssigner, void* phstore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRetrieveTimeStamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszurl, dwretrievalflags, dwtimeout, pszhashid, ppara, pbdata, cbdata, pptscontext, pptssigner, phstore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszurl;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)pszhashid;
    (void)ppara;
    (void)pbdata;
    (void)cbdata;
    (void)pptscontext;
    (void)pptssigner;
    (void)phstore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetAsyncParam(int64_t hasync, void* pszparamoid, void* pvparam, void* pfnfree) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetAsyncParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasync, pszparamoid, pvparam, pfnfree);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hasync;
    (void)pszparamoid;
    (void)pvparam;
    (void)pfnfree;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetHashParam(uint64_t hhash, uint32_t dwparam, void* pbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetHashParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, dwparam, pbdata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetKeyIdentifierProperty(void* pkeyidentifier, uint32_t dwpropid, uint32_t dwflags, void* pwszcomputername, void* pvreserved, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetKeyIdentifierProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pkeyidentifier, dwpropid, dwflags, pwszcomputername, pvreserved, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetKeyParam(uint64_t hkey, uint32_t dwparam, void* pbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetKeyParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwparam, pbdata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetOIDFunctionValue(uint32_t dwencodingtype, void* pszfuncname, void* pszoid, void* pwszvaluename, uint32_t dwvaluetype, void* pbvaluedata, uint32_t cbvaluedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetOIDFunctionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, pszoid, pwszvaluename, dwvaluetype, pbvaluedata, cbvaluedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszvaluename;
    (void)dwvaluetype;
    (void)pbvaluedata;
    (void)cbvaluedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetProvParam(uint64_t hprov, uint32_t dwparam, void* pbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProvParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprov, dwparam, pbdata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprov;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetProviderA(void* pszprovname, uint32_t dwprovtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovname, dwprovtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetProviderExA(void* pszprovname, uint32_t dwprovtype, void* pdwreserved, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovname, dwprovtype, pdwreserved, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetProviderExW(void* pszprovname, uint32_t dwprovtype, void* pdwreserved, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovname, dwprovtype, pdwreserved, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSetProviderW(void* pszprovname, uint32_t dwprovtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovname, dwprovtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignAndEncodeCertificate(uint64_t hcryptprovorncryptkey, uint32_t dwkeyspec, uint32_t dwcertencodingtype, void* lpszstructtype, void* pvstructinfo, void* psignaturealgorithm, void* pvhashauxinfo, void* pbencoded, void* pcbencoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignAndEncodeCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, lpszstructtype, pvstructinfo, psignaturealgorithm, pvhashauxinfo, pbencoded, pcbencoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)psignaturealgorithm;
    (void)pvhashauxinfo;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignAndEncryptMessage(void* psignpara, void* pencryptpara, uint32_t crecipientcert, void* rgprecipientcert, void* pbtobesignedandencrypted, uint32_t cbtobesignedandencrypted, void* pbsignedandencryptedblob, void* pcbsignedandencryptedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignAndEncryptMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psignpara, pencryptpara, crecipientcert, rgprecipientcert, pbtobesignedandencrypted, cbtobesignedandencrypted, pbsignedandencryptedblob, pcbsignedandencryptedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psignpara;
    (void)pencryptpara;
    (void)crecipientcert;
    (void)rgprecipientcert;
    (void)pbtobesignedandencrypted;
    (void)cbtobesignedandencrypted;
    (void)pbsignedandencryptedblob;
    (void)pcbsignedandencryptedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignCertificate(uint64_t hcryptprovorncryptkey, uint32_t dwkeyspec, uint32_t dwcertencodingtype, void* pbencodedtobesigned, uint32_t cbencodedtobesigned, void* psignaturealgorithm, void* pvhashauxinfo, void* pbsignature, void* pcbsignature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pbencodedtobesigned, cbencodedtobesigned, psignaturealgorithm, pvhashauxinfo, pbsignature, pcbsignature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pbencodedtobesigned;
    (void)cbencodedtobesigned;
    (void)psignaturealgorithm;
    (void)pvhashauxinfo;
    (void)pbsignature;
    (void)pcbsignature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignHashA(uint64_t hhash, uint32_t dwkeyspec, void* szdescription, uint32_t dwflags, void* pbsignature, void* pdwsiglen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignHashA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, dwkeyspec, szdescription, dwflags, pbsignature, pdwsiglen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)dwkeyspec;
    (void)szdescription;
    (void)dwflags;
    (void)pbsignature;
    (void)pdwsiglen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignHashW(uint64_t hhash, uint32_t dwkeyspec, void* szdescription, uint32_t dwflags, void* pbsignature, void* pdwsiglen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignHashW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, dwkeyspec, szdescription, dwflags, pbsignature, pdwsiglen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)dwkeyspec;
    (void)szdescription;
    (void)dwflags;
    (void)pbsignature;
    (void)pdwsiglen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignMessage(void* psignpara, int32_t fdetachedsignature, uint32_t ctobesigned, void* rgpbtobesigned, void* rgcbtobesigned, void* pbsignedblob, void* pcbsignedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psignpara, fdetachedsignature, ctobesigned, rgpbtobesigned, rgcbtobesigned, pbsignedblob, pcbsignedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psignpara;
    (void)fdetachedsignature;
    (void)ctobesigned;
    (void)rgpbtobesigned;
    (void)rgcbtobesigned;
    (void)pbsignedblob;
    (void)pcbsignedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptSignMessageWithKey(void* psignpara, void* pbtobesigned, uint32_t cbtobesigned, void* pbsignedblob, void* pcbsignedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignMessageWithKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psignpara, pbtobesigned, cbtobesigned, pbsignedblob, pcbsignedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psignpara;
    (void)pbtobesigned;
    (void)cbtobesigned;
    (void)pbsignedblob;
    (void)pcbsignedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptStringToBinaryA(void* pszstring, uint32_t cchstring, uint32_t dwflags, void* pbbinary, void* pcbbinary, void* pdwskip, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptStringToBinaryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, cchstring, dwflags, pbbinary, pcbbinary, pdwskip, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)cchstring;
    (void)dwflags;
    (void)pbbinary;
    (void)pcbbinary;
    (void)pdwskip;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptStringToBinaryW(void* pszstring, uint32_t cchstring, uint32_t dwflags, void* pbbinary, void* pcbbinary, void* pdwskip, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptStringToBinaryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, cchstring, dwflags, pbbinary, pcbbinary, pdwskip, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)cchstring;
    (void)dwflags;
    (void)pbbinary;
    (void)pcbbinary;
    (void)pdwskip;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUninstallCancelRetrieval(uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUninstallCancelRetrieval");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUninstallDefaultContext(void* hdefaultcontext, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUninstallDefaultContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdefaultcontext, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdefaultcontext;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUnprotectData(void* pdatain, void* ppszdatadescr, void* poptionalentropy, void* pvreserved, void* ppromptstruct, uint32_t dwflags, void* pdataout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnprotectData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdatain, ppszdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags, pdataout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdatain;
    (void)ppszdatadescr;
    (void)poptionalentropy;
    (void)pvreserved;
    (void)ppromptstruct;
    (void)dwflags;
    (void)pdataout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUnprotectMemory(void* pdatain, uint32_t cbdatain, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnprotectMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdatain, cbdatain, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdatain;
    (void)cbdatain;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUnregisterDefaultOIDFunction(uint32_t dwencodingtype, void* pszfuncname, void* pwszdll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnregisterDefaultOIDFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, pwszdll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pwszdll;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUnregisterOIDFunction(uint32_t dwencodingtype, void* pszfuncname, void* pszoid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnregisterOIDFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencodingtype, pszfuncname, pszoid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUnregisterOIDInfo(void* pinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnregisterOIDInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptUpdateProtectedState(void* poldsid, void* pwszoldpassword, uint32_t dwflags, void* pdwsuccesscount, void* pdwfailurecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUpdateProtectedState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poldsid, pwszoldpassword, dwflags, pdwsuccesscount, pdwfailurecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poldsid;
    (void)pwszoldpassword;
    (void)dwflags;
    (void)pdwsuccesscount;
    (void)pdwfailurecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignature(uint64_t hcryptprov, uint32_t dwcertencodingtype, void* pbencoded, uint32_t cbencoded, void* ppublickey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyCertificateSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwcertencodingtype, pbencoded, cbencoded, ppublickey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)ppublickey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignatureEx(uint64_t hcryptprov, uint32_t dwcertencodingtype, uint32_t dwsubjecttype, void* pvsubject, uint32_t dwissuertype, void* pvissuer, uint32_t dwflags, void* pvextra) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyCertificateSignatureEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptprov, dwcertencodingtype, dwsubjecttype, pvsubject, dwissuertype, pvissuer, dwflags, pvextra);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)dwissuertype;
    (void)pvissuer;
    (void)dwflags;
    (void)pvextra;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageHash(void* phashpara, void* pbdetachedhashblob, uint32_t cbdetachedhashblob, uint32_t ctobehashed, void* rgpbtobehashed, void* rgcbtobehashed, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyDetachedMessageHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phashpara, pbdetachedhashblob, cbdetachedhashblob, ctobehashed, rgpbtobehashed, rgcbtobehashed, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phashpara;
    (void)pbdetachedhashblob;
    (void)cbdetachedhashblob;
    (void)ctobehashed;
    (void)rgpbtobehashed;
    (void)rgcbtobehashed;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageSignature(void* pverifypara, uint32_t dwsignerindex, void* pbdetachedsignblob, uint32_t cbdetachedsignblob, uint32_t ctobesigned, void* rgpbtobesigned, void* rgcbtobesigned, void* ppsignercert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyDetachedMessageSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pverifypara, dwsignerindex, pbdetachedsignblob, cbdetachedsignblob, ctobesigned, rgpbtobesigned, rgcbtobesigned, ppsignercert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbdetachedsignblob;
    (void)cbdetachedsignblob;
    (void)ctobesigned;
    (void)rgpbtobesigned;
    (void)rgcbtobesigned;
    (void)ppsignercert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyMessageHash(void* phashpara, void* pbhashedblob, uint32_t cbhashedblob, void* pbtobehashed, void* pcbtobehashed, void* pbcomputedhash, void* pcbcomputedhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyMessageHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phashpara, pbhashedblob, cbhashedblob, pbtobehashed, pcbtobehashed, pbcomputedhash, pcbcomputedhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phashpara;
    (void)pbhashedblob;
    (void)cbhashedblob;
    (void)pbtobehashed;
    (void)pcbtobehashed;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignature(void* pverifypara, uint32_t dwsignerindex, void* pbsignedblob, uint32_t cbsignedblob, void* pbdecoded, void* pcbdecoded, void* ppsignercert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyMessageSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pverifypara, dwsignerindex, pbsignedblob, cbsignedblob, pbdecoded, pcbdecoded, ppsignercert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbsignedblob;
    (void)cbsignedblob;
    (void)pbdecoded;
    (void)pcbdecoded;
    (void)ppsignercert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignatureWithKey(void* pverifypara, void* ppublickeyinfo, void* pbsignedblob, uint32_t cbsignedblob, void* pbdecoded, void* pcbdecoded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyMessageSignatureWithKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pverifypara, ppublickeyinfo, pbsignedblob, cbsignedblob, pbdecoded, pcbdecoded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pverifypara;
    (void)ppublickeyinfo;
    (void)pbsignedblob;
    (void)cbsignedblob;
    (void)pbdecoded;
    (void)pcbdecoded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifySignatureA(uint64_t hhash, void* pbsignature, uint32_t dwsiglen, uint64_t hpubkey, void* szdescription, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifySignatureA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, pbsignature, dwsiglen, hpubkey, szdescription, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)pbsignature;
    (void)dwsiglen;
    (void)hpubkey;
    (void)szdescription;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifySignatureW(uint64_t hhash, void* pbsignature, uint32_t dwsiglen, uint64_t hpubkey, void* szdescription, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifySignatureW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhash, pbsignature, dwsiglen, hpubkey, szdescription, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhash;
    (void)pbsignature;
    (void)dwsiglen;
    (void)hpubkey;
    (void)szdescription;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptVerifyTimeStampSignature(void* pbtscontentinfo, uint32_t cbtscontentinfo, void* pbdata, uint32_t cbdata, void* hadditionalstore, void* pptscontext, void* pptssigner, void* phstore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyTimeStampSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtscontentinfo, cbtscontentinfo, pbdata, cbdata, hadditionalstore, pptscontext, pptssigner, phstore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbtscontentinfo;
    (void)cbtscontentinfo;
    (void)pbdata;
    (void)cbdata;
    (void)hadditionalstore;
    (void)pptscontext;
    (void)pptssigner;
    (void)phstore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlAddObject(void* hsignatureorobject, uint32_t dwflags, void* rgproperty, uint32_t cproperty, void* pencoded, void* ppobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlAddObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsignatureorobject, dwflags, rgproperty, cproperty, pencoded, ppobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsignatureorobject;
    (void)dwflags;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)ppobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlClose(void* hcryptxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlCreateReference(void* hcryptxml, uint32_t dwflags, void* wszid, void* wszuri, void* wsztype, void* pdigestmethod, uint32_t ctransform, void* rgtransform, void* phreference) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlCreateReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml, dwflags, wszid, wszuri, wsztype, pdigestmethod, ctransform, rgtransform, phreference);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    (void)dwflags;
    (void)wszid;
    (void)wszuri;
    (void)wsztype;
    (void)pdigestmethod;
    (void)ctransform;
    (void)rgtransform;
    (void)phreference;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlDigestReference(void* hreference, uint32_t dwflags, void* pdataproviderin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlDigestReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreference, dwflags, pdataproviderin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreference;
    (void)dwflags;
    (void)pdataproviderin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlEncode(void* hcryptxml, int32_t dwcharset, void* rgproperty, uint32_t cproperty, void* pvcallbackstate, void* pfnwrite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml, dwcharset, rgproperty, cproperty, pvcallbackstate, pfnwrite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    (void)dwcharset;
    (void)rgproperty;
    (void)cproperty;
    (void)pvcallbackstate;
    (void)pfnwrite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlEnumAlgorithmInfo(uint32_t dwgroupid, uint32_t dwflags, void* pvarg, void* pfnenumalginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlEnumAlgorithmInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwgroupid, dwflags, pvarg, pfnenumalginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwgroupid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumalginfo;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_cryptXmlFindAlgorithmInfo(uint32_t dwfindbytype, void* pvfindby, uint32_t dwgroupid, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlFindAlgorithmInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwfindbytype, pvfindby, dwgroupid, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwfindbytype;
    (void)pvfindby;
    (void)dwgroupid;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlGetAlgorithmInfo(void* pxmlalgorithm, uint32_t dwflags, void* ppalginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetAlgorithmInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxmlalgorithm, dwflags, ppalginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pxmlalgorithm;
    (void)dwflags;
    (void)ppalginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlGetDocContext(void* hcryptxml, void* ppstruct) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetDocContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml, ppstruct);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    (void)ppstruct;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlGetReference(void* hcryptxml, void* ppstruct) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml, ppstruct);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    (void)ppstruct;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlGetSignature(void* hcryptxml, void* ppstruct) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml, ppstruct);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    (void)ppstruct;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlGetStatus(void* hcryptxml, void* pstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptxml, pstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptxml;
    (void)pstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlGetTransforms(void* ppconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetTransforms");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlImportPublicKey(uint32_t dwflags, void* pkeyvalue, void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlImportPublicKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pkeyvalue, phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pkeyvalue;
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlOpenToDecode(void* pconfig, uint32_t dwflags, void* rgproperty, uint32_t cproperty, void* pencoded, void* phcryptxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlOpenToDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconfig, dwflags, rgproperty, cproperty, pencoded, phcryptxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pconfig;
    (void)dwflags;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)phcryptxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlOpenToEncode(void* pconfig, uint32_t dwflags, void* wszid, void* rgproperty, uint32_t cproperty, void* pencoded, void* phsignature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlOpenToEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconfig, dwflags, wszid, rgproperty, cproperty, pencoded, phsignature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pconfig;
    (void)dwflags;
    (void)wszid;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)phsignature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlSetHMACSecret(void* hsignature, void* pbsecret, uint32_t cbsecret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlSetHMACSecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsignature, pbsecret, cbsecret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsignature;
    (void)pbsecret;
    (void)cbsecret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlSign(void* hsignature, uint64_t hkey, uint32_t dwkeyspec, uint32_t dwflags, int32_t dwkeyinfospec, void* pvkeyinfospec, void* psignaturemethod, void* pcanonicalization) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlSign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsignature, hkey, dwkeyspec, dwflags, dwkeyinfospec, pvkeyinfospec, psignaturemethod, pcanonicalization);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsignature;
    (void)hkey;
    (void)dwkeyspec;
    (void)dwflags;
    (void)dwkeyinfospec;
    (void)pvkeyinfospec;
    (void)psignaturemethod;
    (void)pcanonicalization;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_cryptXmlVerifySignature(void* hsignature, void* hkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlVerifySignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsignature, hkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsignature;
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_decrypt(void* hcrypto, int32_t foaep, uint32_t cbindata, void* pindata, void* pcboutdata, void* ppoutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Decrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, foaep, cbindata, pindata, pcboutdata, ppoutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)foaep;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_encrypt(void* hcrypto, int32_t foaep, uint32_t cbindata, void* pindata, void* pcboutdata, void* ppoutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Encrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, foaep, cbindata, pindata, pcboutdata, ppoutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)foaep;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_findCertsByIssuer(void* pcertchains, void* pcbcertchains, void* pccertchains, void* pbencodedissuername, uint32_t cbencodedissuername, void* pwszpurpose, uint32_t dwkeyspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCertsByIssuer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertchains, pcbcertchains, pccertchains, pbencodedissuername, cbencodedissuername, pwszpurpose, dwkeyspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertchains;
    (void)pcbcertchains;
    (void)pccertchains;
    (void)pbencodedissuername;
    (void)cbencodedissuername;
    (void)pwszpurpose;
    (void)dwkeyspec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_freeToken(void* pallocmemory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pallocmemory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pallocmemory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_generateDerivedKey(void* hcrypto, uint32_t cblabel, void* plabel, uint32_t cbnonce, void* pnonce, uint32_t derivedkeylength, uint32_t offset, void* algid, void* pcbkey, void* ppkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateDerivedKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cblabel, plabel, cbnonce, pnonce, derivedkeylength, offset, algid, pcbkey, ppkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cblabel;
    (void)plabel;
    (void)cbnonce;
    (void)pnonce;
    (void)derivedkeylength;
    (void)offset;
    (void)algid;
    (void)pcbkey;
    (void)ppkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getAsymmetricEncryptionInterface(void* pszprovidername, void* pszalgid, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAsymmetricEncryptionInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getBrowserToken(uint32_t dwparamtype, void* pparam, void* pcbtoken, void* pptoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBrowserToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwparamtype, pparam, pcbtoken, pptoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwparamtype;
    (void)pparam;
    (void)pcbtoken;
    (void)pptoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getCipherInterface(void* pszprovidername, void* pszalgid, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCipherInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getHashInterface(void* pszprovidername, void* pszalgid, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHashInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getKeyDerivationInterface(void* pszprovidername, void* pszalgid, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyDerivationInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getKeyStorageInterface(void* pszprovidername, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyStorageInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getKeyedHash(void* hsymmetriccrypto, void* pphhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyedHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsymmetriccrypto, pphhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsymmetriccrypto;
    (void)pphhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getRngInterface(void* pszprovidername, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRngInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getSChannelInterface(void* pszprovidername, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSChannelInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getSecretAgreementInterface(void* pszprovidername, void* pszalgid, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecretAgreementInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getSignatureInterface(void* pszprovidername, void* pszalgid, void* ppfunctiontable, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSignatureInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_getToken(uint32_t cpolicychain, void* ppolicychain, void* securitytoken, void* phprooftokencrypto) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cpolicychain, ppolicychain, securitytoken, phprooftokencrypto);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cpolicychain;
    (void)ppolicychain;
    (void)securitytoken;
    (void)phprooftokencrypto;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_hashCore(void* hcrypto, uint32_t cbindata, void* pindata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HashCore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cbindata, pindata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_hashFinal(void* hcrypto, uint32_t cbindata, void* pindata, void* pcboutdata, void* ppoutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HashFinal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cbindata, pindata, pcboutdata, ppoutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_importInformationCard(void* filename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportInformationCard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_manageCardSpace(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ManageCardSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptCloseProtectionDescriptor(void* hdescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCloseProtectionDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptCreateClaim(uint64_t hsubjectkey, uint64_t hauthoritykey, uint32_t dwclaimtype, void* pparameterlist, void* pbclaimblob, uint32_t cbclaimblob, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCreateClaim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsubjectkey, hauthoritykey, dwclaimtype, pparameterlist, pbclaimblob, cbclaimblob, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsubjectkey;
    (void)hauthoritykey;
    (void)dwclaimtype;
    (void)pparameterlist;
    (void)pbclaimblob;
    (void)cbclaimblob;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptCreatePersistedKey(uint64_t hprovider, void* phkey, void* pszalgid, void* pszkeyname, uint32_t dwlegacykeyspec, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCreatePersistedKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, phkey, pszalgid, pszkeyname, dwlegacykeyspec, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)phkey;
    (void)pszalgid;
    (void)pszkeyname;
    (void)dwlegacykeyspec;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptCreateProtectionDescriptor(void* pwszdescriptorstring, uint32_t dwflags, void* phdescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCreateProtectionDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszdescriptorstring, dwflags, phdescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszdescriptorstring;
    (void)dwflags;
    (void)phdescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptDecrypt(uint64_t hkey, void* pbinput, uint32_t cbinput, void* ppaddinginfo, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptDecrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptDeleteKey(uint64_t hkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptDeleteKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptDeriveKey(uint64_t hsharedsecret, void* pwszkdf, void* pparameterlist, void* pbderivedkey, uint32_t cbderivedkey, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptDeriveKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsharedsecret, pwszkdf, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsharedsecret;
    (void)pwszkdf;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptEncrypt(uint64_t hkey, void* pbinput, uint32_t cbinput, void* ppaddinginfo, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEncrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptEnumAlgorithms(uint64_t hprovider, uint32_t dwalgoperations, void* pdwalgcount, void* ppalglist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEnumAlgorithms");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, dwalgoperations, pdwalgcount, ppalglist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)dwalgoperations;
    (void)pdwalgcount;
    (void)ppalglist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptEnumKeys(uint64_t hprovider, void* pszscope, void* ppkeyname, void* ppenumstate, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEnumKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pszscope, ppkeyname, ppenumstate, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pszscope;
    (void)ppkeyname;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptEnumStorageProviders(void* pdwprovidercount, void* ppproviderlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEnumStorageProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwprovidercount, ppproviderlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwprovidercount;
    (void)ppproviderlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptExportKey(uint64_t hkey, uint64_t hexportkey, void* pszblobtype, void* pparameterlist, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptExportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hexportkey, pszblobtype, pparameterlist, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)hexportkey;
    (void)pszblobtype;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptFinalizeKey(uint64_t hkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptFinalizeKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptFreeBuffer(void* pvinput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvinput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvinput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptFreeObject(uint64_t hobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptFreeObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptGetProperty(uint64_t hobject, void* pszproperty, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, pszproperty, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptGetProtectionDescriptorInfo(void* hdescriptor, void* pmempara, uint32_t dwinfotype, void* ppvinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptGetProtectionDescriptorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdescriptor, pmempara, dwinfotype, ppvinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdescriptor;
    (void)pmempara;
    (void)dwinfotype;
    (void)ppvinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptImportKey(uint64_t hprovider, uint64_t himportkey, void* pszblobtype, void* pparameterlist, void* phkey, void* pbdata, uint32_t cbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptImportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, himportkey, pszblobtype, pparameterlist, phkey, pbdata, cbdata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)himportkey;
    (void)pszblobtype;
    (void)pparameterlist;
    (void)phkey;
    (void)pbdata;
    (void)cbdata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptIsAlgSupported(uint64_t hprovider, void* pszalgid, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptIsAlgSupported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pszalgid, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pszalgid;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptIsKeyHandle(uint64_t hkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptIsKeyHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptKeyDerivation(uint64_t hkey, void* pparameterlist, void* pbderivedkey, uint32_t cbderivedkey, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptKeyDerivation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptNotifyChangeKey(uint64_t hprovider, void* phevent, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptNotifyChangeKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, phevent, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)phevent;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptOpenKey(uint64_t hprovider, void* phkey, void* pszkeyname, uint32_t dwlegacykeyspec, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptOpenKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, phkey, pszkeyname, dwlegacykeyspec, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)phkey;
    (void)pszkeyname;
    (void)dwlegacykeyspec;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptOpenStorageProvider(void* phprovider, void* pszprovidername, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptOpenStorageProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phprovider, pszprovidername, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phprovider;
    (void)pszprovidername;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptProtectSecret(void* hdescriptor, uint32_t dwflags, void* pbdata, uint32_t cbdata, void* pmempara, void* hwnd, void* ppbprotectedblob, void* pcbprotectedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptProtectSecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdescriptor, dwflags, pbdata, cbdata, pmempara, hwnd, ppbprotectedblob, pcbprotectedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdescriptor;
    (void)dwflags;
    (void)pbdata;
    (void)cbdata;
    (void)pmempara;
    (void)hwnd;
    (void)ppbprotectedblob;
    (void)pcbprotectedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptQueryProtectionDescriptorName(void* pwszname, void* pwszdescriptorstring, void* pcdescriptorstring, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptQueryProtectionDescriptorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszname, pwszdescriptorstring, pcdescriptorstring, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszname;
    (void)pwszdescriptorstring;
    (void)pcdescriptorstring;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptRegisterProtectionDescriptorName(void* pwszname, void* pwszdescriptorstring, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptRegisterProtectionDescriptorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszname, pwszdescriptorstring, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszname;
    (void)pwszdescriptorstring;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptSecretAgreement(uint64_t hprivkey, uint64_t hpubkey, void* phagreedsecret, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptSecretAgreement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprivkey, hpubkey, phagreedsecret, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprivkey;
    (void)hpubkey;
    (void)phagreedsecret;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptSetProperty(uint64_t hobject, void* pszproperty, void* pbinput, uint32_t cbinput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptSetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, pszproperty, pbinput, cbinput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptSignHash(uint64_t hkey, void* ppaddinginfo, void* pbhashvalue, uint32_t cbhashvalue, void* pbsignature, uint32_t cbsignature, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptSignHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, ppaddinginfo, pbhashvalue, cbhashvalue, pbsignature, cbsignature, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptStreamClose(void* hstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptStreamOpenToProtect(void* hdescriptor, uint32_t dwflags, void* hwnd, void* pstreaminfo, void* phstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamOpenToProtect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdescriptor, dwflags, hwnd, pstreaminfo, phstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdescriptor;
    (void)dwflags;
    (void)hwnd;
    (void)pstreaminfo;
    (void)phstream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotect(void* pstreaminfo, uint32_t dwflags, void* hwnd, void* phstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamOpenToUnprotect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstreaminfo, dwflags, hwnd, phstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstreaminfo;
    (void)dwflags;
    (void)hwnd;
    (void)phstream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotectEx(void* pstreaminfo, uint32_t dwflags, void* hwnd, void* phstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamOpenToUnprotectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstreaminfo, dwflags, hwnd, phstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstreaminfo;
    (void)dwflags;
    (void)hwnd;
    (void)phstream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptStreamUpdate(void* hstream, void* pbdata, uint64_t cbdata, int32_t ffinal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamUpdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstream, pbdata, cbdata, ffinal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstream;
    (void)pbdata;
    (void)cbdata;
    (void)ffinal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptTranslateHandle(void* phprovider, void* phkey, uint64_t hlegacyprov, uint64_t hlegacykey, uint32_t dwlegacykeyspec, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptTranslateHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phprovider, phkey, hlegacyprov, hlegacykey, dwlegacykeyspec, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phprovider;
    (void)phkey;
    (void)hlegacyprov;
    (void)hlegacykey;
    (void)dwlegacykeyspec;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptUnprotectSecret(void* phdescriptor, uint32_t dwflags, void* pbprotectedblob, uint32_t cbprotectedblob, void* pmempara, void* hwnd, void* ppbdata, void* pcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptUnprotectSecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phdescriptor, dwflags, pbprotectedblob, cbprotectedblob, pmempara, hwnd, ppbdata, pcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phdescriptor;
    (void)dwflags;
    (void)pbprotectedblob;
    (void)cbprotectedblob;
    (void)pmempara;
    (void)hwnd;
    (void)ppbdata;
    (void)pcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptVerifyClaim(uint64_t hsubjectkey, uint64_t hauthoritykey, uint32_t dwclaimtype, void* pparameterlist, void* pbclaimblob, uint32_t cbclaimblob, void* poutput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptVerifyClaim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsubjectkey, hauthoritykey, dwclaimtype, pparameterlist, pbclaimblob, cbclaimblob, poutput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsubjectkey;
    (void)hauthoritykey;
    (void)dwclaimtype;
    (void)pparameterlist;
    (void)pbclaimblob;
    (void)cbclaimblob;
    (void)poutput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_nCryptVerifySignature(uint64_t hkey, void* ppaddinginfo, void* pbhashvalue, uint32_t cbhashvalue, void* pbsignature, uint32_t cbsignature, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptVerifySignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, ppaddinginfo, pbhashvalue, cbhashvalue, pbsignature, cbsignature, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_pFXExportCertStore(void* hstore, void* ppfx, void* szpassword, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXExportCertStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstore, ppfx, szpassword, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstore;
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_pFXExportCertStoreEx(void* hstore, void* ppfx, void* szpassword, void* pvpara, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXExportCertStoreEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstore, ppfx, szpassword, pvpara, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstore;
    (void)ppfx;
    (void)szpassword;
    (void)pvpara;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_pFXImportCertStore(void* ppfx, void* szpassword, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXImportCertStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppfx, szpassword, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_pFXIsPFXBlob(void* ppfx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXIsPFXBlob");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppfx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppfx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_pFXVerifyPassword(void* ppfx, void* szpassword, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXVerifyPassword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppfx, szpassword, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_processPrng(void* pbdata, uint64_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPrng");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signError(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signHash(void* hcrypto, uint32_t cbhash, void* phash, void* hashalgoid, void* pcbsig, void* ppsig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cbhash, phash, hashalgoid, pcbsig, ppsig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cbhash;
    (void)phash;
    (void)hashalgoid;
    (void)pcbsig;
    (void)ppsig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerFreeSignerContext(void* psignercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerFreeSignerContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psignercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psignercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerSign(void* psubjectinfo, void* psignercert, void* psignatureinfo, void* pproviderinfo, void* pwszhttptimestamp, void* psrequest, void* psipdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerSignEx(uint32_t dwflags, void* psubjectinfo, void* psignercert, void* psignatureinfo, void* pproviderinfo, void* pwszhttptimestamp, void* psrequest, void* psipdata, void* ppsignercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSignEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerSignEx2(uint32_t dwflags, void* psubjectinfo, void* psignercert, void* psignatureinfo, void* pproviderinfo, uint32_t dwtimestampflags, void* psztimestampalgorithmoid, void* pwszhttptimestamp, void* psrequest, void* psipdata, void* ppsignercontext, void* pcryptopolicy, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSignEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags, psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)dwtimestampflags;
    (void)psztimestampalgorithmoid;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerSignEx3(uint32_t dwflags, void* psubjectinfo, void* psignercert, void* psignatureinfo, void* pproviderinfo, uint32_t dwtimestampflags, void* psztimestampalgorithmoid, void* pwszhttptimestamp, void* psrequest, void* psipdata, void* ppsignercontext, void* pcryptopolicy, void* pdigestsigninfo, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSignEx3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags, psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, pdigestsigninfo, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)dwtimestampflags;
    (void)psztimestampalgorithmoid;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)pdigestsigninfo;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerTimeStamp(void* psubjectinfo, void* pwszhttptimestamp, void* psrequest, void* psipdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubjectinfo, pwszhttptimestamp, psrequest, psipdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerTimeStampEx(uint32_t dwflags, void* psubjectinfo, void* pwszhttptimestamp, void* psrequest, void* psipdata, void* ppsignercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStampEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, psubjectinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerTimeStampEx2(uint32_t dwflags, void* psubjectinfo, void* pwszhttptimestamp, uint32_t dwalgid, void* psrequest, void* psipdata, void* ppsignercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStampEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, psubjectinfo, pwszhttptimestamp, dwalgid, psrequest, psipdata, ppsignercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)dwalgid;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_signerTimeStampEx3(uint32_t dwflags, uint32_t dwindex, void* psubjectinfo, void* pwszhttptimestamp, void* pszalgorithmoid, void* psrequest, void* psipdata, void* ppsignercontext, void* pcryptopolicy, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStampEx3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, dwindex, psubjectinfo, pwszhttptimestamp, pszalgorithmoid, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)dwindex;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)pszalgorithmoid;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslChangeNotify(void* hevent, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslChangeNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslComputeClientAuthHash(uint64_t hsslprovider, uint64_t hmasterkey, uint64_t hhandshakehash, void* pszalgid, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeClientAuthHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hmasterkey, hhandshakehash, pszalgid, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhandshakehash;
    (void)pszalgid;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslComputeEapKeyBlock(uint64_t hsslprovider, uint64_t hmasterkey, void* pbrandoms, uint32_t cbrandoms, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeEapKeyBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hmasterkey, pbrandoms, cbrandoms, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)pbrandoms;
    (void)cbrandoms;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslComputeFinishedHash(uint64_t hsslprovider, uint64_t hmasterkey, uint64_t hhandshakehash, void* pboutput, uint32_t cboutput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeFinishedHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hmasterkey, hhandshakehash, pboutput, cboutput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhandshakehash;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslComputeSessionHash(uint64_t hsslprovider, uint64_t hhandshakehash, uint32_t dwprotocol, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeSessionHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hhandshakehash, dwprotocol, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hhandshakehash;
    (void)dwprotocol;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslCreateClientAuthHash(uint64_t hsslprovider, void* phhandshakehash, uint32_t dwprotocol, uint32_t dwciphersuite, void* pszhashalgid, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCreateClientAuthHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, phhandshakehash, dwprotocol, dwciphersuite, pszhashalgid, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)phhandshakehash;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pszhashalgid;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslCreateEphemeralKey(uint64_t hsslprovider, void* phephemeralkey, uint32_t dwprotocol, uint32_t dwciphersuite, uint32_t dwkeytype, uint32_t dwkeybitlen, void* pbparams, uint32_t cbparams, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCreateEphemeralKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, phephemeralkey, dwprotocol, dwciphersuite, dwkeytype, dwkeybitlen, pbparams, cbparams, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)phephemeralkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)dwkeybitlen;
    (void)pbparams;
    (void)cbparams;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslCreateHandshakeHash(uint64_t hsslprovider, void* phhandshakehash, uint32_t dwprotocol, uint32_t dwciphersuite, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCreateHandshakeHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, phhandshakehash, dwprotocol, dwciphersuite, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)phhandshakehash;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslDecrementProviderReferenceCount(uint64_t hsslprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslDecrementProviderReferenceCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslDecryptPacket(uint64_t hsslprovider, uint64_t hkey, void* pbinput, uint32_t cbinput, void* pboutput, uint32_t cboutput, void* pcbresult, uint64_t sequencenumber, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslDecryptPacket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hkey, pbinput, cbinput, pboutput, cboutput, pcbresult, sequencenumber, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)sequencenumber;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslDuplicateTranscriptHash(uint64_t hsslprovider, uint64_t htranscripthash, void* phtranscripthash, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslDuplicateTranscriptHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, htranscripthash, phtranscripthash, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)htranscripthash;
    (void)phtranscripthash;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslEncryptPacket(uint64_t hsslprovider, uint64_t hkey, void* pbinput, uint32_t cbinput, void* pboutput, uint32_t cboutput, void* pcbresult, uint64_t sequencenumber, uint32_t dwcontenttype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEncryptPacket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hkey, pbinput, cbinput, pboutput, cboutput, pcbresult, sequencenumber, dwcontenttype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)sequencenumber;
    (void)dwcontenttype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslEnumCipherSuites(uint64_t hsslprovider, uint64_t hprivatekey, void* ppciphersuite, void* ppenumstate, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumCipherSuites");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hprivatekey, ppciphersuite, ppenumstate, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)ppciphersuite;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslEnumCipherSuitesEx(uint64_t hsslprovider, uint64_t hprivatekey, void* ppciphersuite, void* ppenumstate, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumCipherSuitesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hprivatekey, ppciphersuite, ppenumstate, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)ppciphersuite;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslEnumEccCurves(uint64_t hsslprovider, void* pecccurvecount, void* ppecccurve, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumEccCurves");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, pecccurvecount, ppecccurve, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)pecccurvecount;
    (void)ppecccurve;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslEnumProtocolProviders(void* pdwprovidercount, void* ppproviderlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumProtocolProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwprovidercount, ppproviderlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwprovidercount;
    (void)ppproviderlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExpandBinderKey(uint64_t hsslprovider, uint64_t hearlykey, void* phbinderkey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandBinderKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hearlykey, phbinderkey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hearlykey;
    (void)phbinderkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExpandExporterMasterKey(uint64_t hsslprovider, uint64_t hbasekey, uint64_t hhashvalue, void* phexportermasterkey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandExporterMasterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hbasekey, hhashvalue, phexportermasterkey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hbasekey;
    (void)hhashvalue;
    (void)phexportermasterkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExpandPreSharedKey(uint64_t hsslprovider, uint64_t hresumptionmasterkey, void* pbticketnonce, uint32_t cbticketnonce, void* phpresharedkey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandPreSharedKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hresumptionmasterkey, pbticketnonce, cbticketnonce, phpresharedkey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hresumptionmasterkey;
    (void)pbticketnonce;
    (void)cbticketnonce;
    (void)phpresharedkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExpandResumptionMasterKey(uint64_t hsslprovider, uint64_t hmasterkey, uint64_t hhashvalue, void* phresumptionmasterkey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandResumptionMasterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hmasterkey, hhashvalue, phresumptionmasterkey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhashvalue;
    (void)phresumptionmasterkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExpandTrafficKeys(uint64_t hsslprovider, uint64_t hbasekey, uint64_t hhashvalue, void* phclienttraffickey, void* phservertraffickey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandTrafficKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hbasekey, hhashvalue, phclienttraffickey, phservertraffickey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hbasekey;
    (void)hhashvalue;
    (void)phclienttraffickey;
    (void)phservertraffickey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExpandWriteKey(uint64_t hsslprovider, uint64_t hbasetraffickey, void* phwritekey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandWriteKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hbasetraffickey, phwritekey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hbasetraffickey;
    (void)phwritekey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExportKey(uint64_t hsslprovider, uint64_t hkey, void* pszblobtype, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hkey, pszblobtype, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pszblobtype;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExportKeyingMaterial(uint64_t hsslprovider, uint64_t hmasterkey, void* slabel, void* pbrandoms, uint32_t cbrandoms, void* pbcontextvalue, uint16_t cbcontextvalue, void* pboutput, uint32_t cboutput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, void*, uint16_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExportKeyingMaterial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hmasterkey, slabel, pbrandoms, cbrandoms, pbcontextvalue, cbcontextvalue, pboutput, cboutput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)slabel;
    (void)pbrandoms;
    (void)cbrandoms;
    (void)pbcontextvalue;
    (void)cbcontextvalue;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExtractEarlyKey(uint64_t hsslprovider, uint64_t hpresharedkey, void* phearlykey, uint32_t dwprotocol, uint32_t dwciphersuite, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExtractEarlyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hpresharedkey, phearlykey, dwprotocol, dwciphersuite, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hpresharedkey;
    (void)phearlykey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExtractHandshakeKey(uint64_t hsslprovider, uint64_t hprivatekey, uint64_t hpublickey, uint64_t hearlykey, void* phhandshakekey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExtractHandshakeKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hprivatekey, hpublickey, hearlykey, phhandshakekey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)hpublickey;
    (void)hearlykey;
    (void)phhandshakekey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslExtractMasterKey(uint64_t hsslprovider, uint64_t hhandshakekey, void* phmasterkey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExtractMasterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hhandshakekey, phmasterkey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hhandshakekey;
    (void)phmasterkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslFreeBuffer(void* pvinput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvinput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvinput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslFreeObject(uint64_t hobject, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslGenerateMasterKey(uint64_t hsslprovider, uint64_t hprivatekey, uint64_t hpublickey, void* phmasterkey, uint32_t dwprotocol, uint32_t dwciphersuite, void* pparameterlist, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateMasterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hprivatekey, hpublickey, phmasterkey, dwprotocol, dwciphersuite, pparameterlist, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)hpublickey;
    (void)phmasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslGeneratePreMasterKey(uint64_t hsslprovider, uint64_t hpublickey, void* phpremasterkey, uint32_t dwprotocol, uint32_t dwciphersuite, void* pparameterlist, void* pboutput, uint32_t cboutput, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGeneratePreMasterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hpublickey, phpremasterkey, dwprotocol, dwciphersuite, pparameterlist, pboutput, cboutput, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hpublickey;
    (void)phpremasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslGenerateSessionKeys(uint64_t hsslprovider, uint64_t hmasterkey, void* phreadkey, void* phwritekey, void* pparameterlist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateSessionKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hmasterkey, phreadkey, phwritekey, pparameterlist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)phreadkey;
    (void)phwritekey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslGetCipherSuitePRFHashAlgorithm(uint64_t hsslprovider, uint32_t dwprotocol, uint32_t dwciphersuite, uint32_t dwkeytype, void* szprfhash, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetCipherSuitePRFHashAlgorithm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, szprfhash, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)szprfhash;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslGetKeyProperty(uint64_t hkey, void* pszproperty, void* ppboutput, void* pcboutput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetKeyProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszproperty, ppboutput, pcboutput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pszproperty;
    (void)ppboutput;
    (void)pcboutput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslGetProviderProperty(uint64_t hsslprovider, void* pszproperty, void* ppboutput, void* pcboutput, void* ppenumstate, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetProviderProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, pszproperty, ppboutput, pcboutput, ppenumstate, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)pszproperty;
    (void)ppboutput;
    (void)pcboutput;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslHashHandshake(uint64_t hsslprovider, uint64_t hhandshakehash, void* pbinput, uint32_t cbinput, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslHashHandshake");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hhandshakehash, pbinput, cbinput, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hhandshakehash;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslImportKey(uint64_t hsslprovider, void* phkey, void* pszblobtype, void* pbkeyblob, uint32_t cbkeyblob, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslImportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, phkey, pszblobtype, pbkeyblob, cbkeyblob, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)phkey;
    (void)pszblobtype;
    (void)pbkeyblob;
    (void)cbkeyblob;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslImportMasterKey(uint64_t hsslprovider, uint64_t hprivatekey, void* phmasterkey, uint32_t dwprotocol, uint32_t dwciphersuite, void* pparameterlist, void* pbencryptedkey, uint32_t cbencryptedkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslImportMasterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hprivatekey, phmasterkey, dwprotocol, dwciphersuite, pparameterlist, pbencryptedkey, cbencryptedkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)phmasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pbencryptedkey;
    (void)cbencryptedkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslIncrementProviderReferenceCount(uint64_t hsslprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslIncrementProviderReferenceCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslLookupCipherLengths(uint64_t hsslprovider, uint32_t dwprotocol, uint32_t dwciphersuite, uint32_t dwkeytype, void* pcipherlengths, uint32_t cbcipherlengths, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslLookupCipherLengths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, pcipherlengths, cbcipherlengths, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)pcipherlengths;
    (void)cbcipherlengths;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslLookupCipherSuiteInfo(uint64_t hsslprovider, uint32_t dwprotocol, uint32_t dwciphersuite, uint32_t dwkeytype, void* pciphersuite, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslLookupCipherSuiteInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, pciphersuite, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)pciphersuite;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslOpenPrivateKey(uint64_t hsslprovider, void* phprivatekey, void* pcertcontext, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslOpenPrivateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, phprivatekey, pcertcontext, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)phprivatekey;
    (void)pcertcontext;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslOpenProvider(void* phsslprovider, void* pszprovidername, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslOpenProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phsslprovider, pszprovidername, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phsslprovider;
    (void)pszprovidername;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslSignHash(uint64_t hsslprovider, uint64_t hprivatekey, void* pbhashvalue, uint32_t cbhashvalue, void* pbsignature, uint32_t cbsignature, void* pcbresult, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslSignHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hprivatekey, pbhashvalue, cbhashvalue, pbsignature, cbsignature, pcbresult, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_sslVerifySignature(uint64_t hsslprovider, uint64_t hpublickey, void* pbhashvalue, uint32_t cbhashvalue, void* pbsignature, uint32_t cbsignature, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslVerifySignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsslprovider, hpublickey, pbhashvalue, cbhashvalue, pbsignature, cbsignature, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsslprovider;
    (void)hpublickey;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_systemPrng(void* pbrandomdata, uint64_t cbrandomdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemPrng");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbrandomdata, cbrandomdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbrandomdata;
    (void)cbrandomdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_transformBlock(void* hcrypto, uint32_t cbindata, void* pindata, void* pcboutdata, void* ppoutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cbindata, pindata, pcboutdata, ppoutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_transformFinalBlock(void* hcrypto, uint32_t cbindata, void* pindata, void* pcboutdata, void* ppoutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformFinalBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cbindata, pindata, pcboutdata, ppoutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_verifyHash(void* hcrypto, uint32_t cbhash, void* phash, void* hashalgoid, uint32_t cbsig, void* psig, void* pfverified) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcrypto, cbhash, phash, hashalgoid, cbsig, psig, pfverified);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcrypto;
    (void)cbhash;
    (void)phash;
    (void)hashalgoid;
    (void)cbsig;
    (void)psig;
    (void)pfverified;
    errno = ENOSYS;
    return -1;
#endif
}

