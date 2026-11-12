#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_authorization_wrapper.h"
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

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply, void* phaccesscheckresults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzAccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount, preply, phaccesscheckresults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    (void)phaccesscheckresults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(void* hauthzclientcontext, void* sids, uint32_t sidcount, void* restrictedsids, uint32_t restrictedsidcount, void* phnewauthzclientcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzAddSidsToContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext, sids, sidcount, restrictedsids, restrictedsidcount, phnewauthzclientcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    (void)sids;
    (void)sidcount;
    (void)restrictedsids;
    (void)restrictedsidcount;
    (void)phnewauthzclientcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(uint32_t flags, void* haccesscheckresults, void* prequest, void* hauditevent, void* preply) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzCachedAccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, haccesscheckresults, prequest, hauditevent, preply);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)haccesscheckresults;
    (void)prequest;
    (void)hauditevent;
    (void)preply;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(uint32_t dwflags, void* buffer, void* pdwcount, void* pdwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzEnumerateSecurityEventSources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, buffer, pdwcount, pdwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)buffer;
    (void)pdwcount;
    (void)pdwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(void* authzclientcontext, void* prequest, void* sacl, uint32_t grantedaccess, int32_t accessgranted, void* pbgenerateaudit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzEvaluateSacl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authzclientcontext, prequest, sacl, grantedaccess, accessgranted, pbgenerateaudit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authzclientcontext;
    (void)prequest;
    (void)sacl;
    (void)grantedaccess;
    (void)accessgranted;
    (void)pbgenerateaudit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(void* hauditevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeAuditEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauditevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauditevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeCentralAccessPolicyCache");
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

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(void* hauthzclientcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(void* haccesscheckresults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(haccesscheckresults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)haccesscheckresults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(void* hauthzresourcemanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzresourcemanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzresourcemanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(void* hauthzclientcontext, int32_t infoclass, uint32_t buffersize, void* psizerequired, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzGetInformationFromContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext, infoclass, buffersize, psizerequired, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    (void)infoclass;
    (void)buffersize;
    (void)psizerequired;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(void* usercontext, void* devicecontext, void* phcompoundcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeCompoundContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(usercontext, devicecontext, phcompoundcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)usercontext;
    (void)devicecontext;
    (void)phcompoundcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(uint32_t flags, void* hauditeventtype, void* szoperationtype, void* szobjecttype, void* szobjectname, void* szadditionalinfo, void* phauditevent, uint32_t dwadditionalparametercount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeObjectAccessAuditEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, phauditevent, dwadditionalparametercount);
            case 1: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, phauditevent, dwadditionalparametercount, (intptr_t)km_va0);
            case 2: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, phauditevent, dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, phauditevent, dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, phauditevent, dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)hauditeventtype;
    (void)szoperationtype;
    (void)szobjecttype;
    (void)szobjectname;
    (void)szadditionalinfo;
    (void)phauditevent;
    (void)dwadditionalparametercount;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(uint32_t flags, void* hauditeventtype, void* szoperationtype, void* szobjecttype, void* szobjectname, void* szadditionalinfo, void* szadditionalinfo2, void* phauditevent, uint32_t dwadditionalparametercount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeObjectAccessAuditEvent2");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, szadditionalinfo2, phauditevent, dwadditionalparametercount);
            case 1: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, szadditionalinfo2, phauditevent, dwadditionalparametercount, (intptr_t)km_va0);
            case 2: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, szadditionalinfo2, phauditevent, dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, szadditionalinfo2, phauditevent, dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(flags, hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, szadditionalinfo2, phauditevent, dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)hauditeventtype;
    (void)szoperationtype;
    (void)szobjecttype;
    (void)szobjectname;
    (void)szadditionalinfo;
    (void)szadditionalinfo2;
    (void)phauditevent;
    (void)dwadditionalparametercount;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(void* prpcinitinfo, void* phauthzresourcemanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeRemoteResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prpcinitinfo, phauthzresourcemanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prpcinitinfo;
    (void)phauthzresourcemanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(uint32_t flags, void* pfndynamicaccesscheck, void* pfncomputedynamicgroups, void* pfnfreedynamicgroups, void* szresourcemanagername, void* phauthzresourcemanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, pfndynamicaccesscheck, pfncomputedynamicgroups, pfnfreedynamicgroups, szresourcemanagername, phauthzresourcemanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)pfndynamicaccesscheck;
    (void)pfncomputedynamicgroups;
    (void)pfnfreedynamicgroups;
    (void)szresourcemanagername;
    (void)phauthzresourcemanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(uint32_t flags, void* pauthzinitinfo, void* phauthzresourcemanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeResourceManagerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, pauthzinitinfo, phauthzresourcemanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)pauthzinitinfo;
    (void)phauthzresourcemanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(uint32_t dwflags, void* pregistration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInstallSecurityEventSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pregistration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pregistration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(void* hauthzclientcontext, int32_t claimclass, void* pclaimoperations, void* pclaims) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifyClaims");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext, claimclass, pclaimoperations, pclaims);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    (void)claimclass;
    (void)pclaimoperations;
    (void)pclaims;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(void* hauthzclientcontext, void* poperations, void* pattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifySecurityAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext, poperations, pattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    (void)poperations;
    (void)pattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(void* hauthzclientcontext, int32_t sidclass, void* psidoperations, void* psids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifySids");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext, sidclass, psidoperations, psids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    (void)sidclass;
    (void)psidoperations;
    (void)psids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzOpenObjectAudit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount, preply);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(void* phcapchangesubscription, void* pfncapchangecallback, void* pcallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzRegisterCapChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcapchangesubscription, pfncapchangecallback, pcallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcapchangesubscription;
    (void)pfncapchangecallback;
    (void)pcallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(uint32_t dwflags, void* szeventsourcename, void* pheventprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzRegisterSecurityEventSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, szeventsourcename, pheventprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)szeventsourcename;
    (void)pheventprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, uint32_t dwcount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzReportSecurityEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, dwcount);
            case 1: return km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, dwcount, (intptr_t)km_va0);
            case 2: return km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, dwcount, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, dwcount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, dwcount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)dwcount;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, void* pparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzReportSecurityEventFromParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, heventprovider, dwauditid, pusersid, pparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)pparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(void* hauthzclientcontext, void* pappcontainersid, uint32_t capabilitycount, void* pcapabilitysids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzSetAppContainerInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hauthzclientcontext, pappcontainersid, capabilitycount, pcapabilitysids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hauthzclientcontext;
    (void)pappcontainersid;
    (void)capabilitycount;
    (void)pcapabilitysids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(uint32_t dwflags, void* szeventsourcename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUninstallSecurityEventSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, szeventsourcename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)szeventsourcename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(void* hcapchangesubscription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUnregisterCapChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcapchangesubscription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcapchangesubscription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(uint32_t dwflags, void* pheventprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUnregisterSecurityEventSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pheventprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pheventprovider;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pexplicitaccess, ptrusteename, accesspermissions, accessmode, inheritance);
        return;
    }
    errno = ENOSYS;
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pexplicitaccess, ptrusteename, accesspermissions, accessmode, inheritance);
        return;
    }
    errno = ENOSYS;
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pexplicitaccess, ptrusteename, ptrustee, accesspermissions, accessmode, inheritance);
        return;
    }
    errno = ENOSYS;
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pexplicitaccess, ptrusteename, ptrustee, accesspermissions, accessmode, inheritance);
        return;
    }
    errno = ENOSYS;
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(void* ptrustee, void* pimpersonatetrustee) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateTrusteeA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pimpersonatetrustee);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(void* ptrustee, void* pimpersonatetrustee) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateTrusteeW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pimpersonatetrustee);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildSecurityDescriptorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powner, pgroup, ccountofaccessentries, plistofaccessentries, ccountofauditentries, plistofauditentries, poldsd, psizenewsd, pnewsd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)powner;
    (void)pgroup;
    (void)ccountofaccessentries;
    (void)plistofaccessentries;
    (void)ccountofauditentries;
    (void)plistofauditentries;
    (void)poldsd;
    (void)psizenewsd;
    (void)pnewsd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildSecurityDescriptorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powner, pgroup, ccountofaccessentries, plistofaccessentries, ccountofauditentries, plistofauditentries, poldsd, psizenewsd, pnewsd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)powner;
    (void)pgroup;
    (void)ccountofaccessentries;
    (void)plistofaccessentries;
    (void)ccountofauditentries;
    (void)plistofauditentries;
    (void)poldsd;
    (void)psizenewsd;
    (void)pnewsd;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(void* ptrustee, void* pname) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pname);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pname;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(void* ptrustee, void* pname) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pname);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pname;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pobjname, objecttype, objecttypename, inheritedobjecttypename, name);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pobjname, objecttype, objecttypename, inheritedobjecttypename, name);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(void* ptrustee, void* psid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithSidA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, psid);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)psid;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(void* ptrustee, void* psid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithSidW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptrustee, psid);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptrustee;
    (void)psid;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, requestedstringsdrevision, securityinformation, stringsecuritydescriptor, stringsecuritydescriptorlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, requestedstringsdrevision, securityinformation, stringsecuritydescriptor, stringsecuritydescriptorlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(void* sid, void* stringsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSidToStringSidA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid, stringsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sid;
    (void)stringsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(void* sid, void* stringsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSidToStringSidW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid, stringsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sid;
    (void)stringsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringsecuritydescriptor, stringsdrevision, securitydescriptor, securitydescriptorsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringsecuritydescriptor, stringsdrevision, securitydescriptor, securitydescriptorsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(void* stringsid, void* sid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSidToSidA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringsid, sid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringsid;
    (void)sid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(void* stringsid, void* sid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSidToSidW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringsid, sid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringsid;
    (void)sid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(void* pinheritarray, uint16_t acecnt, void* pfnarray) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInheritedFromArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinheritarray, acecnt, pfnarray);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinheritarray;
    (void)acecnt;
    (void)pfnarray;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(void* pacl, void* ptrustee, void* paccessrights) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, ptrustee, paccessrights);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(void* pacl, void* ptrustee, void* paccessrights) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, ptrustee, paccessrights);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, pccountofexplicitentries, plistofexplicitentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, pccountofexplicitentries, plistofexplicitentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInheritanceSourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, container, pobjectclassguids, guidcount, pacl, pfnarray, pgenericmapping, pinheritarray);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)container;
    (void)pobjectclassguids;
    (void)guidcount;
    (void)pacl;
    (void)pfnarray;
    (void)pgenericmapping;
    (void)pinheritarray;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInheritanceSourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, container, pobjectclassguids, guidcount, pacl, pfnarray, pgenericmapping, pinheritarray);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)container;
    (void)pobjectclassguids;
    (void)guidcount;
    (void)pacl;
    (void)pfnarray;
    (void)pgenericmapping;
    (void)pinheritarray;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(void* ptrustee) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(void* ptrustee) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(void* ptrustee) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(void* ptrustee) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedSecurityInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedSecurityInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, objecttype, securityinfo, ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(void* ptrustee) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeFormA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(void* ptrustee) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeFormW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(void* ptrustee) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(void* ptrustee) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(void* ptrustee) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(void* ptrustee) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptrustee);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptrustee;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEntriesInAclA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ccountofexplicitentries, plistofexplicitentries, oldacl, newacl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEntriesInAclW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ccountofexplicitentries, plistofexplicitentries, oldacl, newacl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedSecurityInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, psidowner, psidgroup, pdacl, psacl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedSecurityInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, psidowner, psidgroup, pdacl, psacl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, objecttype, securityinfo, psidowner, psidgroup, pdacl, psacl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, keepexplicit, fnprogress, progressinvokesetting, args);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)keepexplicit;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, keepexplicit, fnprogress, progressinvokesetting, args);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)keepexplicit;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, dwaction, fnprogress, progressinvokesetting, args);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)dwaction;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectname, objecttype, securityinfo, powner, pgroup, pdacl, psacl, dwaction, fnprogress, progressinvokesetting, args);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)dwaction;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    return 0;
#endif
}

