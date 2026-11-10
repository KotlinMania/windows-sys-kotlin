#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_cryptography_catalog_wrapper.h"
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

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext(void* phcatadmin, void* pgsubsystem, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminAcquireContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcatadmin, pgsubsystem, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcatadmin;
    (void)pgsubsystem;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAcquireContext2(void* phcatadmin, void* pgsubsystem, void* pwszhashalgorithm, void* pstronghashpolicy, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminAcquireContext2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcatadmin, pgsubsystem, pwszhashalgorithm, pstronghashpolicy, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcatadmin;
    (void)pgsubsystem;
    (void)pwszhashalgorithm;
    (void)pstronghashpolicy;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminAddCatalog(int64_t hcatadmin, void* pwszcatalogfile, void* pwszselectbasename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminAddCatalog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, pwszcatalogfile, pwszselectbasename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)pwszselectbasename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle(void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminCalcHashFromFileHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, pcbhash, pbhash, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)pcbhash;
    (void)pbhash;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminCalcHashFromFileHandle2(int64_t hcatadmin, void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminCalcHashFromFileHandle2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, hfile, pcbhash, pbhash, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)hfile;
    (void)pcbhash;
    (void)pbhash;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminEnumCatalogFromHash(int64_t hcatadmin, void* pbhash, uint32_t cbhash, uint32_t dwflags, void* phprevcatinfo) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminEnumCatalogFromHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, pbhash, cbhash, dwflags, phprevcatinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)pbhash;
    (void)cbhash;
    (void)dwflags;
    (void)phprevcatinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminPauseServiceForBackup(uint32_t dwflags, int32_t fresume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminPauseServiceForBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, fresume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)fresume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseCatalogContext(int64_t hcatadmin, int64_t hcatinfo, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminReleaseCatalogContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, hcatinfo, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)hcatinfo;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminReleaseContext(int64_t hcatadmin, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminReleaseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminRemoveCatalog(int64_t hcatadmin, void* pwszcatalogfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminRemoveCatalog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, pwszcatalogfile, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATAdminResolveCatalogPath(int64_t hcatadmin, void* pwszcatalogfile, void* pscatinfo, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminResolveCatalogPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatadmin, pwszcatalogfile, pscatinfo, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)pscatinfo;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATAllocSortedMemberInfo(void* hcatalog, void* pwszreferencetag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAllocSortedMemberInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pwszreferencetag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFClose(void* pcdf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcdf;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributes(void* pcdf, void* pmember, void* pprevattr, void* pfnparseerror) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdf, pmember, pprevattr, pfnparseerror);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcdf;
    (void)pmember;
    (void)pprevattr;
    (void)pfnparseerror;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumAttributesWithCDFTag(void* pcdf, void* pwszmembertag, void* pmember, void* pprevattr, void* pfnparseerror) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumAttributesWithCDFTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdf, pwszmembertag, pmember, pprevattr, pfnparseerror);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcdf;
    (void)pwszmembertag;
    (void)pmember;
    (void)pprevattr;
    (void)pfnparseerror;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumCatAttributes(void* pcdf, void* pprevattr, void* pfnparseerror) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumCatAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdf, pprevattr, pfnparseerror);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcdf;
    (void)pprevattr;
    (void)pfnparseerror;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembers(void* pcdf, void* pprevmember, void* pfnparseerror) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdf, pprevmember, pfnparseerror);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcdf;
    (void)pprevmember;
    (void)pfnparseerror;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFEnumMembersByCDFTagEx(void* pcdf, void* pwszprevcdftag, void* pfnparseerror, void* ppmember, int32_t fcontinueonerror, void* pvreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumMembersByCDFTagEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdf, pwszprevcdftag, pfnparseerror, ppmember, fcontinueonerror, pvreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcdf;
    (void)pwszprevcdftag;
    (void)pfnparseerror;
    (void)ppmember;
    (void)fcontinueonerror;
    (void)pvreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATCDFOpen(void* pwszfilepath, void* pfnparseerror) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszfilepath, pfnparseerror);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszfilepath;
    (void)pfnparseerror;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATCatalogInfoFromContext(int64_t hcatinfo, void* pscatinfo, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCatalogInfoFromContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatinfo, pscatinfo, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatinfo;
    (void)pscatinfo;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATClose(void* hcatalog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatalog;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateAttr(void* hcatalog, void* pcatmember, void* pprevattr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATEnumerateAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pcatmember, pprevattr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pprevattr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateCatAttr(void* hcatalog, void* pprevattr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATEnumerateCatAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pprevattr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pprevattr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATEnumerateMember(void* hcatalog, void* pprevmember) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATEnumerateMember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pprevmember);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pprevmember;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_security_cryptography_catalog_cryptCATFreeSortedMemberInfo(void* hcatalog, void* pcatmember) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATFreeSortedMemberInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hcatalog, pcatmember);
        return;
    }
    errno = ENOSYS;
#else
    (void)hcatalog;
    (void)pcatmember;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATGetAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATGetAttrInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pcatmember, pwszreferencetag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pwszreferencetag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATGetCatAttrInfo(void* hcatalog, void* pwszreferencetag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATGetCatAttrInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pwszreferencetag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATGetMemberInfo(void* hcatalog, void* pwszreferencetag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATGetMemberInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pwszreferencetag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATHandleFromStore(void* pcatstore) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATHandleFromStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcatstore);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcatstore;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATOpen(void* pwszfilename, uint32_t fdwopenflags, uint64_t hprov, uint32_t dwpublicversion, uint32_t dwencodingtype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszfilename, fdwopenflags, hprov, dwpublicversion, dwencodingtype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszfilename;
    (void)fdwopenflags;
    (void)hprov;
    (void)dwpublicversion;
    (void)dwencodingtype;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_cryptCATPersistStore(void* hcatalog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPersistStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcatalog;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATPutAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPutAttrInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pcatmember, pwszreferencetag, dwattrtypeandaction, cbdata, pbdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pwszreferencetag;
    (void)dwattrtypeandaction;
    (void)cbdata;
    (void)pbdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATPutCatAttrInfo(void* hcatalog, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPutCatAttrInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pwszreferencetag, dwattrtypeandaction, cbdata, pbdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    (void)dwattrtypeandaction;
    (void)cbdata;
    (void)pbdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATPutMemberInfo(void* hcatalog, void* pwszfilename, void* pwszreferencetag, void* pgsubjecttype, uint32_t dwcertversion, uint32_t cbsipindirectdata, void* pbsipindirectdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPutMemberInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog, pwszfilename, pwszreferencetag, pgsubjecttype, dwcertversion, cbsipindirectdata, pbsipindirectdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    (void)pwszfilename;
    (void)pwszreferencetag;
    (void)pgsubjecttype;
    (void)dwcertversion;
    (void)cbsipindirectdata;
    (void)pbsipindirectdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_cryptography_catalog_cryptCATStoreFromHandle(void* hcatalog) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATStoreFromHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcatalog);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcatalog;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_catalog_isCatalogFile(void* hfile, void* pwszfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCatalogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, pwszfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)pwszfilename;
    errno = ENOSYS;
    return -1;
#endif
}

