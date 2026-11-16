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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(void* phcatadmin, void* pgsubsystem, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(void* phcatadmin, void* pgsubsystem, void* pwszhashalgorithm, void* pstronghashpolicy, uint32_t dwflags) {
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

int64_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(int64_t hcatadmin, void* pwszcatalogfile, void* pwszselectbasename, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(int64_t hcatadmin, void* hfile, void* pcbhash, void* pbhash, uint32_t dwflags) {
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

int64_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(int64_t hcatadmin, void* pbhash, uint32_t cbhash, uint32_t dwflags, void* phprevcatinfo) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(uint32_t dwflags, int32_t fresume) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(int64_t hcatadmin, int64_t hcatinfo, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(int64_t hcatadmin, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(int64_t hcatadmin, void* pwszcatalogfile, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(int64_t hcatadmin, void* pwszcatalogfile, void* pscatinfo, uint32_t dwflags) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(void* hcatalog, void* pwszreferencetag) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(void* pcdf) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(void* pcdf, void* pmember, void* pprevattr, void* pfnparseerror) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(void* pcdf, void* pwszmembertag, void* pmember, void* pprevattr, void* pfnparseerror) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(void* pcdf, void* pprevattr, void* pfnparseerror) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(void* pcdf, void* pprevmember, void* pfnparseerror) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(void* pcdf, void* pwszprevcdftag, void* pfnparseerror, void* ppmember, int32_t fcontinueonerror, void* pvreserved) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(void* pwszfilepath, void* pfnparseerror) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(int64_t hcatinfo, void* pscatinfo, uint32_t dwflags) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(void* hcatalog) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(void* hcatalog, void* pcatmember, void* pprevattr) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(void* hcatalog, void* pprevattr) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(void* hcatalog, void* pprevmember) {
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

void windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(void* hcatalog, void* pcatmember) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(void* hcatalog, void* pwszreferencetag) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(void* hcatalog, void* pwszreferencetag) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(void* pcatstore) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(void* pwszfilename, uint32_t fdwopenflags, uint64_t hprov, uint32_t dwpublicversion, uint32_t dwencodingtype) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(void* hcatalog) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(void* hcatalog, void* pcatmember, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(void* hcatalog, void* pwszreferencetag, uint32_t dwattrtypeandaction, uint32_t cbdata, void* pbdata) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(void* hcatalog, void* pwszfilename, void* pwszreferencetag, void* pgsubjecttype, uint32_t dwcertversion, uint32_t cbsipindirectdata, void* pbsipindirectdata) {
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

void* windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(void* hcatalog) {
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

int32_t windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(void* hfile, void* pwszfilename) {
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

