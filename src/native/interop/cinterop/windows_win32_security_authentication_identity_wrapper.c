#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_authentication_identity_wrapper.h"
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

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(void* phcredential, void* phcontext, void* pinput, uint32_t fcontextreq, uint32_t targetdatarep, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcceptSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, phcontext, pinput, fcontextreq, targetdatarep, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(void* pszprincipal, void* pszpackage, uint32_t fcredentialuse, void* pvlogonid, void* pauthdata, void* pgetkeyfn, void* pvgetkeyargument, void* phcredential, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireCredentialsHandleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprincipal, pszpackage, fcredentialuse, pvlogonid, pauthdata, pgetkeyfn, pvgetkeyargument, phcredential, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pvlogonid;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)phcredential;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(void* pszprincipal, void* pszpackage, uint32_t fcredentialuse, void* pvlogonid, void* pauthdata, void* pgetkeyfn, void* pvgetkeyargument, void* phcredential, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireCredentialsHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprincipal, pszpackage, fcredentialuse, pvlogonid, pauthdata, pgetkeyfn, pvgetkeyargument, phcredential, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pvlogonid;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)phcredential;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(void* hcredentials, void* pszprincipal, void* pszpackage, uint32_t fcredentialuse, void* pauthdata, void* pgetkeyfn, void* pvgetkeyargument, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcredentials, pszprincipal, pszpackage, fcredentialuse, pauthdata, pgetkeyfn, pvgetkeyargument, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(void* hcredentials, void* pszprincipal, void* pszpackage, uint32_t fcredentialuse, void* pauthdata, void* pgetkeyfn, void* pvgetkeyargument, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcredentials, pszprincipal, pszpackage, fcredentialuse, pauthdata, pgetkeyfn, pvgetkeyargument, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(void* pszpackagename, void* poptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecurityPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(void* pszpackagename, void* poptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecurityPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(void* phcontext, void* pinput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyControlToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, pinput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)pinput;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(void* psid, void* psubcategoryguids, uint32_t dwpolicycount, void* ppauditpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyBySid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid, psubcategoryguids, dwpolicycount, ppauditpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(void* htokenhandle, void* psubcategoryguids, uint32_t dwpolicycount, void* ppauditpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyByToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htokenhandle, psubcategoryguids, dwpolicycount, ppauditpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)htokenhandle;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(void* ppauditcategoriesarray, void* pdwcountreturned) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumerateCategories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppauditcategoriesarray, pdwcountreturned);
    }
    errno = ENOSYS;
    return false;
#else
    (void)ppauditcategoriesarray;
    (void)pdwcountreturned;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(void* ppauditsidarray) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumeratePerUserPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppauditsidarray);
    }
    errno = ENOSYS;
    return false;
#else
    (void)ppauditsidarray;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(void* pauditcategoryguid, bool bretrieveallsubcategories, void* ppauditsubcategoriesarray, void* pdwcountreturned) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumerateSubCategories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditcategoryguid, bretrieveallsubcategories, ppauditsubcategoriesarray, pdwcountreturned);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditcategoryguid;
    (void)bretrieveallsubcategories;
    (void)ppauditsubcategoriesarray;
    (void)pdwcountreturned;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(int32_t auditcategoryid, void* pauditcategoryguid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryGuidFromCategoryId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(auditcategoryid, pauditcategoryguid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)auditcategoryid;
    (void)pauditcategoryguid;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(void* pauditcategoryguid, void* pauditcategoryid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryIdFromCategoryGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditcategoryguid, pauditcategoryid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditcategoryguid;
    (void)pauditcategoryid;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(void* pauditcategoryguid, void* ppszcategoryname) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditcategoryguid, ppszcategoryname);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(void* pauditcategoryguid, void* ppszcategoryname) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditcategoryguid, ppszcategoryname);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(void* pauditsubcategoryguid, void* ppszsubcategoryname) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditsubcategoryguid, ppszsubcategoryname);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(void* pauditsubcategoryguid, void* ppszsubcategoryname) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditsubcategoryguid, ppszsubcategoryname);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(void* objecttypename, void* acl) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryGlobalSaclA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttypename, acl);
    }
    errno = ENOSYS;
    return false;
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(void* objecttypename, void* acl) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryGlobalSaclW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttypename, acl);
    }
    errno = ENOSYS;
    return false;
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(void* psid, void* psubcategoryguids, uint32_t dwpolicycount, void* ppauditpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryPerUserPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid, psubcategoryguids, dwpolicycount, ppauditpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(uint32_t securityinformation, void* ppsecuritydescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQuerySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securityinformation, ppsecuritydescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(void* psubcategoryguids, uint32_t dwpolicycount, void* ppauditpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQuerySystemPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psubcategoryguids, dwpolicycount, ppauditpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(void* objecttypename, void* acl) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetGlobalSaclA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttypename, acl);
    }
    errno = ENOSYS;
    return false;
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(void* objecttypename, void* acl) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetGlobalSaclW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttypename, acl);
    }
    errno = ENOSYS;
    return false;
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(void* psid, void* pauditpolicy, uint32_t dwpolicycount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetPerUserPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid, pauditpolicy, dwpolicycount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)psid;
    (void)pauditpolicy;
    (void)dwpolicycount;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(void* pauditpolicy, uint32_t dwpolicycount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetSystemPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauditpolicy, dwpolicycount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pauditpolicy;
    (void)dwpolicycount;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(void* pszpackagename, void* pszdomainname, void* pszaccountname, void* pszoldpassword, void* psznewpassword, bool bimpersonating, uint32_t dwreserved, void* poutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeAccountPasswordA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, bimpersonating, dwreserved, poutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(void* pszpackagename, void* pszdomainname, void* pszaccountname, void* pszoldpassword, void* psznewpassword, bool bimpersonating, uint32_t dwreserved, void* poutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeAccountPasswordW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, bimpersonating, dwreserved, poutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(void* phcontext, void* ptoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteAuthToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ptoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ptoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(void* intargetinfo, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalTargetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(intargetinfo, buffer, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)intargetinfo;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(void* buffer, uint32_t buffersize, void* rettargetinfo, void* retactualsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalTargetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, buffersize, rettargetinfo, retactualsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    (void)buffersize;
    (void)rettargetinfo;
    (void)retactualsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(void* phcontext, void* pmessage, uint32_t messageseqno, void* pfqop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, pmessage, messageseqno, pfqop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(void* pszpackagename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(void* pszpackagename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(void* phcontext, uint32_t fqop, void* pmessage, uint32_t messageseqno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, fqop, pmessage, messageseqno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(void* pcpackages, void* pppackageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateSecurityPackagesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcpackages, pppackageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcpackages;
    (void)pppackageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(void* pcpackages, void* pppackageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateSecurityPackagesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcpackages, pppackageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcpackages;
    (void)pppackageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(void* phcontext, uint32_t fflags, void* ppackedcontext, void* ptoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, fflags, ppackedcontext, ptoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(void* pvcontextbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeContextBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvcontextbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvcontextbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(void* phcredential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeCredentialsHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(int32_t nameformat, void* lpnamebuffer, void* nsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerObjectNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nameformat, lpnamebuffer, nsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(int32_t nameformat, void* lpnamebuffer, void* nsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerObjectNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nameformat, lpnamebuffer, nsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(int32_t nameformat, void* lpnamebuffer, void* nsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nameformat, lpnamebuffer, nsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(int32_t nameformat, void* lpnamebuffer, void* nsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nameformat, lpnamebuffer, nsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(void* pszpackage, void* ppackedcontext, void* token, void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportSecurityContextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackage, ppackedcontext, token, phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(void* pszpackage, void* ppackedcontext, void* token, void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportSecurityContextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackage, ppackedcontext, token, phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitSecurityInterfaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitSecurityInterfaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(void* phcredential, void* phcontext, void* psztargetname, uint32_t fcontextreq, uint32_t reserved1, uint32_t targetdatarep, void* pinput, uint32_t reserved2, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityContextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(void* phcredential, void* phcontext, void* psztargetname, uint32_t fcontextreq, uint32_t reserved1, uint32_t targetdatarep, void* pinput, uint32_t reserved2, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityContextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(int64_t policyhandle, void* accountsid, void* userrights, uint32_t countofrights) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaAddAccountRights");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, accountsid, userrights, countofrights);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(void* lsahandle, uint32_t authenticationpackage, void* protocolsubmitbuffer, uint32_t submitbufferlength, void* protocolreturnbuffer, void* returnbufferlength, void* protocolstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaCallAuthenticationPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lsahandle, authenticationpackage, protocolsubmitbuffer, submitbufferlength, protocolreturnbuffer, returnbufferlength, protocolstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lsahandle;
    (void)authenticationpackage;
    (void)protocolsubmitbuffer;
    (void)submitbufferlength;
    (void)protocolreturnbuffer;
    (void)returnbufferlength;
    (void)protocolstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(int64_t objecthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(void* lsahandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaConnectUntrusted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lsahandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lsahandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(int64_t policyhandle, void* trusteddomaininformation, void* authenticationinformation, uint32_t desiredaccess, void* trusteddomainhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaCreateTrustedDomainEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomaininformation, authenticationinformation, desiredaccess, trusteddomainhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomaininformation;
    (void)authenticationinformation;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(int64_t policyhandle, void* trusteddomainsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaDeleteTrustedDomain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(void* lsahandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaDeregisterLogonProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lsahandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lsahandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(int64_t policyhandle, void* accountsid, void* userrights, void* countofrights) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateAccountRights");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, accountsid, userrights, countofrights);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(int64_t policyhandle, void* userright, void* buffer, void* countreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateAccountsWithUserRight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, userright, buffer, countreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)userright;
    (void)buffer;
    (void)countreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(void* logonsessioncount, void* logonsessionlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateLogonSessions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonsessioncount, logonsessionlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonsessioncount;
    (void)logonsessionlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(int64_t policyhandle, void* enumerationcontext, void* buffer, uint32_t preferedmaximumlength, void* countreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomains");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, enumerationcontext, buffer, preferedmaximumlength, countreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(int64_t policyhandle, void* enumerationcontext, void* buffer, uint32_t preferedmaximumlength, void* countreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomainsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, enumerationcontext, buffer, preferedmaximumlength, countreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaFreeReturnBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(void* systemname, void* capids, void* capidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaGetAppliedCAPIDs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systemname, capids, capidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)systemname;
    (void)capids;
    (void)capidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(void* logonid, void* pplogonsessiondata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaGetLogonSessionData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid, pplogonsessiondata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    (void)pplogonsessiondata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(void* lsahandle, void* packagename, void* authenticationpackage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupAuthenticationPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lsahandle, packagename, authenticationpackage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lsahandle;
    (void)packagename;
    (void)authenticationpackage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(int64_t policyhandle, uint32_t count, void* names, void* referenceddomains, void* sids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, count, names, referenceddomains, sids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(int64_t policyhandle, uint32_t flags, uint32_t count, void* names, void* referenceddomains, void* sids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupNames2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, flags, count, names, referenceddomains, sids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)flags;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(int64_t policyhandle, uint32_t count, void* sids, void* referenceddomains, void* names) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupSids");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, count, sids, referenceddomains, names);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(int64_t policyhandle, uint32_t lookupoptions, uint32_t count, void* sids, void* referenceddomains, void* names) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupSids2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, lookupoptions, count, sids, referenceddomains, names);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)lookupoptions;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(int32_t status) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaNtStatusToWinError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(void* systemname, void* objectattributes, uint32_t desiredaccess, void* policyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaOpenPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systemname, objectattributes, desiredaccess, policyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)systemname;
    (void)objectattributes;
    (void)desiredaccess;
    (void)policyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(int64_t policyhandle, void* trusteddomainname, uint32_t desiredaccess, void* trusteddomainhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaOpenTrustedDomainByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, desiredaccess, trusteddomainhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(void* capids, uint32_t capidcount, void* caps, void* capcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryCAPs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(capids, capidcount, caps, capcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)capids;
    (void)capidcount;
    (void)caps;
    (void)capcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(int64_t policyhandle, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryDomainInformationPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(int64_t policyhandle, void* trusteddomainname, void* foresttrustinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, foresttrustinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(int64_t policyhandle, void* trusteddomainname, int32_t highestrecordtype, void* foresttrustinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, highestrecordtype, foresttrustinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(int64_t policyhandle, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryInformationPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(int64_t policyhandle, void* trusteddomainsid, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainsid, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(int64_t policyhandle, void* trusteddomainname, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfoByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(void* logonprocessname, void* lsahandle, void* securitymode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRegisterLogonProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonprocessname, lsahandle, securitymode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonprocessname;
    (void)lsahandle;
    (void)securitymode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(int32_t informationclass, void* notificationeventhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRegisterPolicyChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationclass, notificationeventhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationclass;
    (void)notificationeventhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(int64_t policyhandle, void* accountsid, bool allrights, void* userrights, uint32_t countofrights) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRemoveAccountRights");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, accountsid, allrights, userrights, countofrights);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)allrights;
    (void)userrights;
    (void)countofrights;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(int64_t policyhandle, void* keyname, void* privatedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRetrievePrivateData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, keyname, privatedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(void* capdns, uint32_t capdncount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetCAPs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(capdns, capdncount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)capdns;
    (void)capdncount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(int64_t policyhandle, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetDomainInformationPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(int64_t policyhandle, void* trusteddomainname, void* foresttrustinfo, bool checkonly, void* collisioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetForestTrustInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, foresttrustinfo, checkonly, collisioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(int64_t policyhandle, void* trusteddomainname, int32_t highestrecordtype, void* foresttrustinfo, bool checkonly, void* collisioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetForestTrustInformation2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, highestrecordtype, foresttrustinfo, checkonly, collisioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(int64_t policyhandle, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetInformationPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(int64_t policyhandle, void* trusteddomainname, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetTrustedDomainInfoByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainname, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(int64_t policyhandle, void* trusteddomainsid, int32_t informationclass, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetTrustedDomainInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, trusteddomainsid, informationclass, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(int64_t policyhandle, void* keyname, void* privatedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaStorePrivateData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyhandle, keyname, privatedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(int32_t informationclass, void* notificationeventhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaUnregisterPolicyChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationclass, notificationeventhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationclass;
    (void)notificationeventhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(void* phcontext, uint32_t fqop, void* pmessage, uint32_t messageseqno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, fqop, pmessage, messageseqno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(void* phcontext, uint32_t ulattribute, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(void* phcontext, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(void* phcontext, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(void* phcontext, uint32_t ulattribute, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(void* phcredential, uint32_t ulattribute, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, ulattribute, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(void* phcredential, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(void* phcredential, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(void* phcredential, uint32_t ulattribute, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, ulattribute, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(void* phcontext, void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityContextToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(void* pszpackagename, void* pppackageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityPackageInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename, pppackageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(void* pszpackagename, void* pppackageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityPackageInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpackagename, pppackageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(void* memory, uint32_t memorysize, uint32_t optionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction041");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memory, memorysize, optionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(void* memory, uint32_t memorysize, uint32_t optionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction040");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memory, memorysize, optionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(void* randombuffer, uint32_t randombufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction036");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(randombuffer, randombufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)randombuffer;
    (void)randombufferlength;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(void* ppticketblob, void* pcbticketblob, void* pwsztemplateid, void* pwszserverurl, void* pwszclienttoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLAcquireGenuineTicket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppticketblob, pcbticketblob, pwsztemplateid, pwszserverurl, pwszclienttoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppticketblob;
    (void)pcbticketblob;
    (void)pwsztemplateid;
    (void)pwszserverurl;
    (void)pwszclienttoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(void* hslc, void* pproductskuid, uint32_t cbappspecificdata, void* pvappspecificdata, void* pactivationinfo, void* pwszproxyserver, uint16_t wproxyport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLActivateProduct");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, cbappspecificdata, pvappspecificdata, pactivationinfo, pwszproxyserver, wproxyport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)cbappspecificdata;
    (void)pvappspecificdata;
    (void)pactivationinfo;
    (void)pwszproxyserver;
    (void)wproxyport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(void* hslc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(void* hslc, void* pappid, void* pproductskuid, void* pwszrightname, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLConsumeRight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pappid, pproductskuid, pwszrightname, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(void* hslc, void* pproductskuid, void* pwszinstallationid, void* pwszconfirmationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, pwszinstallationid, pwszconfirmationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(void* hslc, void* pproductskuid, void* pactivationinfo, void* pwszinstallationid, void* pwszconfirmationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationIdEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, pactivationinfo, pwszinstallationid, pwszconfirmationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(void* hslc, void* pwszeventid, void* papplicationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLFireEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszeventid, papplicationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(void* hslc, void* pproductskuid, void* ppwszinstallationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, ppwszinstallationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)ppwszinstallationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(void* hslc, void* pproductskuid, void* pactivationinfo, void* ppwszinstallationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationIdEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, pactivationinfo, ppwszinstallationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)ppwszinstallationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(void* hslc, void* papplicationid, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetApplicationInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, papplicationid, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)papplicationid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(void* pqueryid, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetGenuineInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pqueryid, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(void* hslc, void* pproductskuid, void* pnproductkeyids, void* ppproductkeyids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetInstalledProductKeyIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, pnproductkeyids, ppproductkeyids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pnproductkeyids;
    (void)ppproductkeyids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(void* hslc, void* plicensefileid, void* pcblicensefile, void* ppblicensefile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, plicensefileid, pcblicensefile, ppblicensefile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)plicensefileid;
    (void)pcblicensefile;
    (void)ppblicensefile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(void* hslc, uint32_t cblicenseblob, void* pblicenseblob, void* plicensefileid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicenseFileId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, cblicenseblob, pblicenseblob, plicensefileid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(void* hslc, void* psllicenseid, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicenseInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, psllicenseid, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)psllicenseid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(void* hslc, void* pappid, void* pproductskuid, void* pwszrightname, void* pnstatuscount, void* pplicensingstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicensingStatusInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pappid, pproductskuid, pwszrightname, pnstatuscount, pplicensingstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pnstatuscount;
    (void)pplicensingstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(void* hslc, void* pwszpkeyalgorithm, void* pwszpkeystring, uint32_t cbpkeyspecificdata, void* pbpkeyspecificdata, void* ppkeyid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPKeyId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata, pbpkeyspecificdata, ppkeyid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(void* hslc, void* ppkeyid, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPKeyInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, ppkeyid, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)ppkeyid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(void* hslc, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPolicyInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(void* hslc, void* pwszvaluename, void* pdwvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPolicyInformationDWORD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszvaluename, pdwvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pdwvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(void* hslc, void* pproductskuid, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetProductSkuInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(void* hslc, int32_t ereferraltype, void* pskuorappid, void* pwszvaluename, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetReferralInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, ereferraltype, pskuorappid, pwszvaluename, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)ereferraltype;
    (void)pskuorappid;
    (void)pwszvaluename;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(void* hslc, int32_t equeryidtype, void* pqueryid, int32_t ereturnidtype, void* pnreturnids, void* ppreturnids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetSLIDList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, equeryidtype, pqueryid, ereturnidtype, pnreturnids, ppreturnids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)equeryidtype;
    (void)pqueryid;
    (void)ereturnidtype;
    (void)pnreturnids;
    (void)ppreturnids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(void* pwszserverurl, void* pwszacquisitiontype, void* pwszproxyserver, uint16_t wproxyport, void* phrstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetServerStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszserverurl, pwszacquisitiontype, pwszproxyserver, wproxyport, phrstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszserverurl;
    (void)pwszacquisitiontype;
    (void)pwszproxyserver;
    (void)wproxyport;
    (void)phrstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(void* hslc, void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetServiceInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(void* pwszvaluename, void* pedatatype, void* pcbvalue, void* ppbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetWindowsInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszvaluename, pedatatype, pcbvalue, ppbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(void* pwszvaluename, void* pdwvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetWindowsInformationDWORD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszvaluename, pdwvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszvaluename;
    (void)pdwvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(void* hslc, uint32_t cblicenseblob, void* pblicenseblob, void* plicensefileid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLInstallLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, cblicenseblob, pblicenseblob, plicensefileid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(void* hslc, void* pwszpkeyalgorithm, void* pwszpkeystring, uint32_t cbpkeyspecificdata, void* pbpkeyspecificdata, void* ppkeyid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLInstallProofOfPurchase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata, pbpkeyspecificdata, ppkeyid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(void* pappid, void* pgenuinestate, void* puioptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slwga.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLIsGenuineLocal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pappid, pgenuinestate, puioptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pappid;
    (void)pgenuinestate;
    (void)puioptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(void* phslc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phslc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phslc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(void* valuename, void* valuetype, void* databuffer, uint32_t datasize, void* resultdatasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-slapi-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLQueryLicenseValueFromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(valuename, valuetype, databuffer, datasize, resultdatasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)valuename;
    (void)valuetype;
    (void)databuffer;
    (void)datasize;
    (void)resultdatasize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(void* hslc, void* pwszeventid, void* papplicationid, void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLRegisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszeventid, papplicationid, hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(void* hslc, void* pproductskuid, void* pproductkeyid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLSetCurrentProductKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pproductskuid, pproductkeyid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pproductkeyid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(void* pqueryid, void* pwszvaluename, uint32_t edatatype, uint32_t cbvalue, void* pbvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLSetGenuineInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pqueryid, pwszvaluename, edatatype, cbvalue, pbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)edatatype;
    (void)cbvalue;
    (void)pbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(void* hslc, void* plicensefileid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUninstallLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, plicensefileid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)plicensefileid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(void* hslc, void* ppkeyid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUninstallProofOfPurchase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, ppkeyid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)ppkeyid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(void* hslc, void* pwszeventid, void* papplicationid, void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUnregisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hslc, pwszeventid, papplicationid, hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(void* phcredential, void* phcontext, void* pinput, uint32_t fcontextreq, uint32_t targetdatarep, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslAcceptSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, phcontext, pinput, fcontextreq, targetdatarep, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(void* profilelist, void* profilecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslEnumerateProfilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilelist, profilecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilelist;
    (void)profilecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(void* profilelist, void* profilecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslEnumerateProfilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilelist, profilecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilelist;
    (void)profilecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(void* contexthandle, uint32_t option, void* value, uint32_t size, void* needed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetContextOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contexthandle, option, value, size, needed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    (void)needed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(void* profilename, void* packageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetProfilePackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilename, packageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilename;
    (void)packageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(void* profilename, void* packageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetProfilePackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilename, packageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilename;
    (void)packageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(void* pinput, void* packageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslIdentifyPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinput, packageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinput;
    (void)packageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(void* pinput, void* packageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslIdentifyPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinput, packageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinput;
    (void)packageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(void* phcredential, void* phcontext, void* psztargetname, uint32_t fcontextreq, uint32_t reserved1, uint32_t targetdatarep, void* pinput, uint32_t reserved2, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslInitializeSecurityContextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(void* phcredential, void* phcontext, void* psztargetname, uint32_t fcontextreq, uint32_t reserved1, uint32_t targetdatarep, void* pinput, uint32_t reserved2, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslInitializeSecurityContextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(void* contexthandle, uint32_t option, void* value, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslSetContextOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contexthandle, option, value, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(int32_t asuser) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sas.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendSAS");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(asuser);
        return;
    }
    errno = ENOSYS;
#else
    (void)asuser;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(void* phcontext, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(void* phcontext, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(void* phcredential, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCredentialsAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(void* phcredential, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCredentialsAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcredential, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(void* pbcertificate, uint32_t cbcertificate, uint32_t dwflags, void* ppcertificate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCrackCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbcertificate, cbcertificate, dwflags, ppcertificate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbcertificate;
    (void)cbcertificate;
    (void)dwflags;
    (void)ppcertificate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(void* psztargetname, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEmptyCacheA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psztargetname;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(void* psztargetname, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEmptyCacheW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psztargetname;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(void* pcertificate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcertificate);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcertificate;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(void* prandomdata, int32_t crandomdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateRandomBits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prandomdata, crandomdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)prandomdata;
    (void)crandomdata;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(void* clienthello, uint32_t clienthellobytesize, void* genericextensions, uint8_t genericextensionscount, void* bytestoread, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetExtensions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienthello, clienthellobytesize, genericextensions, genericextensionscount, bytestoread, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clienthello;
    (void)clienthellobytesize;
    (void)genericextensions;
    (void)genericextensionscount;
    (void)bytestoread;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetMaximumKeySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(void* clienthello, uint32_t clienthellosize, void* serveridentity, void* serveridentitysize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetServerIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienthello, clienthellosize, serveridentity, serveridentitysize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clienthello;
    (void)clienthellosize;
    (void)serveridentity;
    (void)serveridentitysize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(void* authidentity1, void* authidentity2, void* samesupplieduser, void* samesuppliedidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCompareAuthIdentities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authidentity1, authidentity2, samesupplieduser, samesuppliedidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authidentity1;
    (void)authidentity2;
    (void)samesupplieduser;
    (void)samesuppliedidentity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(void* authdata, void* authdatacopy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCopyAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authdata, authdatacopy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authdata;
    (void)authdatacopy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(void* encryptedauthdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDecryptAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(encryptedauthdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)encryptedauthdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(uint32_t options, void* encryptedauthdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDecryptAuthIdentityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(options, encryptedauthdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)options;
    (void)encryptedauthdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(void* pauthidentity, void* ppszusername, void* ppszdomainname, void* ppszpackedcredentialsstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncodeAuthIdentityAsStrings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauthidentity, ppszusername, ppszdomainname, ppszpackedcredentialsstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pauthidentity;
    (void)ppszusername;
    (void)ppszdomainname;
    (void)ppszpackedcredentialsstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(void* pszusername, void* pszdomainname, void* pszpackedcredentialsstring, void* ppauthidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncodeStringsAsAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszusername, pszdomainname, pszpackedcredentialsstring, ppauthidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszusername;
    (void)pszdomainname;
    (void)pszpackedcredentialsstring;
    (void)ppauthidentity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(void* authdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncryptAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(uint32_t options, void* authdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncryptAuthIdentityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(options, authdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)options;
    (void)authdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(void* authidentity, void* pszpackagename, void* ppnewauthidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiExcludePackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authidentity, pszpackagename, ppnewauthidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authidentity;
    (void)pszpackagename;
    (void)ppnewauthidentity;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(void* authdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(authdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)authdata;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(void* psztargetname, void* pszhostname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiGetTargetHostName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, pszhostname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psztargetname;
    (void)pszhostname;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(void* encryptedauthdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiIsAuthIdentityEncrypted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(encryptedauthdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)encryptedauthdata;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(uint32_t errororntstatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiIsPromptingNeeded");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errororntstatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)errororntstatus;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(void* databuffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiLocalFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(databuffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)databuffer;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(void* authidentity, void* authidentitylength, void* authidentitybytearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiMarshalAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authidentity, authidentitylength, authidentitybytearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authidentity;
    (void)authidentitylength;
    (void)authidentitybytearray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(void* authidentity, void* psztargetname, void* pcredmancredentialtype, void* ppszcredmantargetname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPrepareForCredRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(void* authidentity, void* psztargetname, void* pcredmancredentialtype, void* ppszcredmantargetname, void* ppszcredmanusername, void* ppcredentialblob, void* pcredentialblobsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPrepareForCredWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname, ppszcredmanusername, ppcredentialblob, pcredentialblobsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    (void)ppszcredmanusername;
    (void)ppcredentialblob;
    (void)pcredentialblobsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(void* psztargetname, void* puiinfo, uint32_t dwautherror, void* pszpackage, void* pinputauthidentity, void* ppauthidentity, void* pfsave, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPromptForCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, puiinfo, dwautherror, pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(void* psztargetname, void* puiinfo, uint32_t dwautherror, void* pszpackage, void* pinputauthidentity, void* ppauthidentity, void* pfsave, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPromptForCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, puiinfo, dwautherror, pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(void* pbindings, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiSetChannelBindingFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbindings, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbindings;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(uint32_t authidentitylength, void* authidentitybytearray, void* ppauthidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiUnmarshalAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authidentitylength, authidentitybytearray, ppauthidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authidentitylength;
    (void)authidentitybytearray;
    (void)ppauthidentity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(void* authdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiValidateAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(void* authdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiZeroAuthIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(authdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)authdata;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingDeleteAllBindings");
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

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(void* targeturl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingDeleteBinding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targeturl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targeturl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(int32_t keytype, void* targeturl, int32_t bindingtype, void* tlsekm, uint32_t tlsekmsize, int32_t extensionformat, void* extensiondata, void* tokenbinding, void* tokenbindingsize, void* resultdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateBinding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keytype, targeturl, bindingtype, tlsekm, tlsekmsize, extensionformat, extensiondata, tokenbinding, tokenbindingsize, resultdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keytype;
    (void)targeturl;
    (void)bindingtype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)extensionformat;
    (void)extensiondata;
    (void)tokenbinding;
    (void)tokenbindingsize;
    (void)resultdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(int32_t keytype, void* publickey, uint32_t publickeysize, void* resultdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keytype, publickey, publickeysize, resultdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keytype;
    (void)publickey;
    (void)publickeysize;
    (void)resultdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(int32_t keytype, void* targeturi, void* resultdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateIDForUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keytype, targeturi, resultdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keytype;
    (void)targeturi;
    (void)resultdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(void* tokenbindings, void* tokenbindingssize, uint32_t tokenbindingscount, void* tokenbindingmessage, void* tokenbindingmessagesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenbindings, tokenbindingssize, tokenbindingscount, tokenbindingmessage, tokenbindingmessagesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenbindings;
    (void)tokenbindingssize;
    (void)tokenbindingscount;
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(void* majorversion, void* minorversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetHighestSupportedVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(majorversion, minorversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)majorversion;
    (void)minorversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(void* keytypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keytypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keytypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(void* keytypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keytypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keytypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(void* tokenbindingmessage, uint32_t tokenbindingmessagesize, int32_t keytype, void* tlsekm, uint32_t tlsekmsize, void* resultlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingVerifyMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenbindingmessage, tokenbindingmessagesize, keytype, tlsekm, tlsekmsize, resultlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    (void)keytype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)resultlist;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(void* lpaccountname, int32_t accountnameformat, int32_t desirednameformat, void* lptranslatedname, void* nsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaccountname, accountnameformat, desirednameformat, lptranslatedname, nsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(void* lpaccountname, int32_t accountnameformat, int32_t desirednameformat, void* lptranslatedname, void* nsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaccountname, accountnameformat, desirednameformat, lptranslatedname, nsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(void* phcontext, void* pmessage, uint32_t messageseqno, void* pfqop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifySignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, pmessage, messageseqno, pfqop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    errno = ENOSYS;
    return -1;
#endif
}

