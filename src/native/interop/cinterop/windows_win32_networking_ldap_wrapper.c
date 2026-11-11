#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_ldap_wrapper.h"
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

uint32_t windowssys_windows_win32_networking_ldap_ldapGetLastError(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapGetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapMapErrorToWin32(uint32_t ldaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapMapErrorToWin32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ldaperror;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapUTF8ToUnicode(void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapUTF8ToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsrcstr, cchsrc, lpdeststr, cchdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapUnicodeToUTF8(void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapUnicodeToUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsrcstr, cchsrc, lpdeststr, cchdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_ldap_berAllocT(int32_t options) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_alloc_t");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(options);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)options;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_berBvdup(void* pberval) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvdup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberval);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pberval;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_networking_ldap_berBvecfree(void* pberval) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvecfree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pberval);
        return;
    }
    errno = ENOSYS;
#else
    (void)pberval;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_ldap_berBvfree(void* bv) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvfree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bv);
        return;
    }
    errno = ENOSYS;
#else
    (void)bv;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_berFirstElement(void* pberelement, void* plen, void* ppopaque) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_first_element");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberelement, plen, ppopaque);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pberelement;
    (void)plen;
    (void)ppopaque;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_berFlatten(void* pberelement, void* pberval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_flatten");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberelement, pberval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pberelement;
    (void)pberval;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_ldap_berFree(void* pberelement, int32_t fbuf) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_free");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pberelement, fbuf);
        return;
    }
    errno = ENOSYS;
#else
    (void)pberelement;
    (void)fbuf;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_networking_ldap_berInit(void* pberval) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_init");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberval);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pberval;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_berNextElement(void* pberelement, void* plen, void* opaque) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_next_element");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberelement, plen, opaque);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pberelement;
    (void)plen;
    (void)opaque;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_berPeekTag(void* pberelement, void* plen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_peek_tag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberelement, plen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pberelement;
    (void)plen;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_berPrintf(void* pberelement, void* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_printf");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(pberelement, fmt);
            case 1: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0);
            case 2: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pberelement;
    (void)fmt;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_berScanf(void* pberelement, void* fmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_scanf");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(pberelement, fmt);
            case 1: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0);
            case 2: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(pberelement, fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pberelement;
    (void)fmt;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_berSkipTag(void* pberelement, void* plen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_skip_tag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pberelement, plen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pberelement;
    (void)plen;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_cldapOpen(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_cldapOpenA(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_openA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_cldapOpenW(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_openW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAbandon(void* ld, uint32_t msgid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_abandon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, msgid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)msgid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAdd(void* ld, void* dn, void* attrs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddA(void* ld, void* dn, void* attrs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_addA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddW(void* ld, void* dn, void* attrs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_addW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddExt(void* ld, void* dn, void* attrs, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddExtA(void* ld, void* dn, void* attrs, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_extA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddExtW(void* ld, void* dn, void* attrs, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_extW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddExtS(void* ld, void* dn, void* attrs, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddExtSA(void* ld, void* dn, void* attrs, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddExtSW(void* ld, void* dn, void* attrs, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddS(void* ld, void* dn, void* attrs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddSA(void* ld, void* dn, void* attrs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapAddSW(void* ld, void* dn, void* attrs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attrs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapBind(void* ld, void* dn, void* cred, uint32_t method) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, cred, method);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapBindA(void* ld, void* dn, void* cred, uint32_t method) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bindA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, cred, method);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapBindW(void* ld, void* dn, void* cred, uint32_t method) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bindW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, cred, method);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapBindS(void* ld, void* dn, void* cred, uint32_t method) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, cred, method);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapBindSA(void* ld, void* dn, void* cred, uint32_t method) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, cred, method);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapBindSW(void* ld, void* dn, void* cred, uint32_t method) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, cred, method);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCheckFilterA(void* ld, void* searchfilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_check_filterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, searchfilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)searchfilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCheckFilterW(void* ld, void* searchfilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_check_filterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, searchfilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)searchfilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCleanup(void* hinstance) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_cleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstance;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCloseExtendedOp(void* ld, uint32_t messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_close_extended_op");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompare(void* ld, void* dn, void* attr, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareA(void* ld, void* dn, void* attr, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compareA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareW(void* ld, void* dn, void* attr, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compareW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareExt(void* ld, void* dn, void* attr, void* value, void* data, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareExtA(void* ld, void* dn, void* attr, void* value, void* data, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_extA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareExtW(void* ld, void* dn, void* attr, void* value, void* data, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_extW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareExtS(void* ld, void* dn, void* attr, void* value, void* data, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value, data, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareExtSA(void* ld, void* dn, void* attr, void* value, void* data, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value, data, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareExtSW(void* ld, void* dn, void* attr, void* value, void* data, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value, data, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareS(void* ld, void* dn, void* attr, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareSA(void* ld, void* dn, void* attr, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCompareSW(void* ld, void* dn, void* attr, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, attr, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapConnFromMsg(void* primaryconn, void* res) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_conn_from_msg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(primaryconn, res);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)primaryconn;
    (void)res;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapConnect(void* ld, void* timeout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_connect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, timeout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)timeout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapControlFree(void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_free");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapControlFreeA(void* controls) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_freeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controls);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controls;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapControlFreeW(void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_freeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapControlsFree(void* controls) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_free");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controls);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controls;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapControlsFreeA(void* controls) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_freeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controls);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controls;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapControlsFreeW(void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_freeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCountEntries(void* ld, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_entries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCountReferences(void* ld, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_references");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCountValues(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_values");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCountValuesA(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_valuesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCountValuesW(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_valuesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCountValuesLen(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_values_len");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCreatePageControl(void* externalhandle, uint32_t pagesize, void* cookie, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_control");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, pagesize, cookie, iscritical, control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCreatePageControlA(void* externalhandle, uint32_t pagesize, void* cookie, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, pagesize, cookie, iscritical, control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCreatePageControlW(void* externalhandle, uint32_t pagesize, void* cookie, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, pagesize, cookie, iscritical, control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCreateSortControl(void* externalhandle, void* sortkeys, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_control");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, sortkeys, iscritical, control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCreateSortControlA(void* externalhandle, void* sortkeys, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, sortkeys, iscritical, control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapCreateSortControlW(void* externalhandle, void* sortkeys, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, sortkeys, iscritical, control);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapCreateVlvControlA(void* externalhandle, void* vlvinfo, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_vlv_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, vlvinfo, iscritical, control);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)vlvinfo;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapCreateVlvControlW(void* externalhandle, void* vlvinfo, uint8_t iscritical, void* control) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_vlv_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, vlvinfo, iscritical, control);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)vlvinfo;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDelete(void* ld, void* dn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteA(void* ld, void* dn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_deleteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteW(void* ld, void* dn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_deleteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteExt(void* ld, void* dn, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteExtA(void* ld, void* dn, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_extA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteExtW(void* ld, void* dn, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_extW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteExtS(void* ld, void* dn, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteExtSA(void* ld, void* dn, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteExtSW(void* ld, void* dn, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteS(void* ld, void* dn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteSA(void* ld, void* dn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapDeleteSW(void* ld, void* dn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapDn2ufn(void* dn) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dn);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dn;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapDn2ufnA(void* dn) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dn);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dn;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapDn2ufnW(void* dn) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dn);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dn;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapEncodeSortControlA(void* externalhandle, void* sortkeys, void* control, bool criticality) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_encode_sort_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, sortkeys, control, criticality);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)control;
    (void)criticality;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapEncodeSortControlW(void* externalhandle, void* sortkeys, void* control, bool criticality) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_encode_sort_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, sortkeys, control, criticality);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)control;
    (void)criticality;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapErr2string(uint32_t err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2string");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapErr2stringA(uint32_t err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2stringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapErr2stringW(uint32_t err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2stringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapEscapeFilterElement(void* sourcefilterelement, uint32_t sourcelength, void* destfilterelement, uint32_t destlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_element");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilterelement, sourcelength, destfilterelement, destlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementA(void* sourcefilterelement, uint32_t sourcelength, void* destfilterelement, uint32_t destlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_elementA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilterelement, sourcelength, destfilterelement, destlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementW(void* sourcefilterelement, uint32_t sourcelength, void* destfilterelement, uint32_t destlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_elementW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilterelement, sourcelength, destfilterelement, destlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapExplodeDn(void* dn, uint32_t notypes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dn, notypes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dn;
    (void)notypes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapExplodeDnA(void* dn, uint32_t notypes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dn, notypes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dn;
    (void)notypes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapExplodeDnW(void* dn, uint32_t notypes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dn, notypes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dn;
    (void)notypes;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapExtendedOperation(void* ld, void* oid, void* data, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, oid, data, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapExtendedOperationA(void* ld, void* oid, void* data, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, oid, data, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapExtendedOperationW(void* ld, void* oid, void* data, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, oid, data, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapExtendedOperationSA(void* externalhandle, void* oid, void* data, void* servercontrols, void* clientcontrols, void* returnedoid, void* returneddata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, oid, data, servercontrols, clientcontrols, returnedoid, returneddata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)returnedoid;
    (void)returneddata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapExtendedOperationSW(void* externalhandle, void* oid, void* data, void* servercontrols, void* clientcontrols, void* returnedoid, void* returneddata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, oid, data, servercontrols, clientcontrols, returnedoid, returneddata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)returnedoid;
    (void)returneddata;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapFirstAttribute(void* ld, void* entry, void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapFirstAttributeA(void* ld, void* entry, void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attributeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapFirstAttributeW(void* ld, void* entry, void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attributeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapFirstEntry(void* ld, void* res) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_entry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, res);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapFirstReference(void* ld, void* res) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_reference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, res);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapFreeControls(void* controls) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controls");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controls);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controls;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapFreeControlsA(void* controls) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controlsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controls);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controls;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapFreeControlsW(void* controls) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controlsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controls);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controls;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetDn(void* ld, void* entry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetDnA(void* ld, void* entry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetDnW(void* ld, void* entry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapGetNextPage(void* externalhandle, int64_t searchhandle, uint32_t pagesize, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_next_page");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, searchhandle, pagesize, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)searchhandle;
    (void)pagesize;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapGetNextPageS(void* externalhandle, int64_t searchhandle, void* timeout, uint32_t pagesize, void* totalcount, void* results) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_next_page_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, searchhandle, timeout, pagesize, totalcount, results);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)searchhandle;
    (void)timeout;
    (void)pagesize;
    (void)totalcount;
    (void)results;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapGetOption(void* ld, int32_t option, void* outvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_option");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, option, outvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)option;
    (void)outvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapGetOptionW(void* ld, int32_t option, void* outvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_optionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, option, outvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)option;
    (void)outvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapGetPagedCount(void* externalhandle, int64_t searchblock, void* totalcount, void* results) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_paged_count");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, searchblock, totalcount, results);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)searchblock;
    (void)totalcount;
    (void)results;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetValues(void* ld, void* entry, void* attr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, attr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)attr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetValuesA(void* ld, void* entry, void* attr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_valuesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, attr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)attr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetValuesW(void* ld, void* entry, void* attr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_valuesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, attr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)attr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetValuesLen(void* externalhandle, void* message, void* attr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_len");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, message, attr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetValuesLenA(void* externalhandle, void* message, void* attr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_lenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, message, attr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapGetValuesLenW(void* externalhandle, void* message, void* attr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_lenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, message, attr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapInit(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_init");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapInitA(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_initA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapInitW(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_initW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_networking_ldap_ldapMemfree(void* block) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(block);
        return;
    }
    errno = ENOSYS;
#else
    (void)block;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_ldap_ldapMemfreeA(void* block) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(block);
        return;
    }
    errno = ENOSYS;
#else
    (void)block;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_ldap_ldapMemfreeW(void* block) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(block);
        return;
    }
    errno = ENOSYS;
#else
    (void)block;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModify(void* ld, void* dn, void* mods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyA(void* ld, void* dn, void* mods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modifyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyW(void* ld, void* dn, void* mods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modifyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyExt(void* ld, void* dn, void* mods, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyExtA(void* ld, void* dn, void* mods, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_extA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyExtW(void* ld, void* dn, void* mods, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_extW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyExtS(void* ld, void* dn, void* mods, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyExtSA(void* ld, void* dn, void* mods, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyExtSW(void* ld, void* dn, void* mods, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifyS(void* ld, void* dn, void* mods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifySA(void* ld, void* dn, void* mods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModifySW(void* ld, void* dn, void* mods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, mods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn(void* externalhandle, void* distinguishedname, void* newdistinguishedname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn2(void* externalhandle, void* distinguishedname, void* newdistinguishedname, int32_t deleteoldrdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn2A(void* externalhandle, void* distinguishedname, void* newdistinguishedname, int32_t deleteoldrdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn2W(void* externalhandle, void* distinguishedname, void* newdistinguishedname, int32_t deleteoldrdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn2S(void* externalhandle, void* distinguishedname, void* newdistinguishedname, int32_t deleteoldrdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn2SA(void* externalhandle, void* distinguishedname, void* newdistinguishedname, int32_t deleteoldrdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdn2SW(void* externalhandle, void* distinguishedname, void* newdistinguishedname, int32_t deleteoldrdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdnA(void* externalhandle, void* distinguishedname, void* newdistinguishedname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdnW(void* externalhandle, void* distinguishedname, void* newdistinguishedname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdnS(void* externalhandle, void* distinguishedname, void* newdistinguishedname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdnSA(void* externalhandle, void* distinguishedname, void* newdistinguishedname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapModrdnSW(void* externalhandle, void* distinguishedname, void* newdistinguishedname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, newdistinguishedname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapMsgfree(void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_msgfree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapNextAttribute(void* ld, void* entry, void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapNextAttributeA(void* ld, void* entry, void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attributeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapNextAttributeW(void* ld, void* entry, void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attributeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry, ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapNextEntry(void* ld, void* entry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_entry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapNextReference(void* ld, void* entry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_reference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, entry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapOpen(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapOpenA(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_openA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapOpenW(void* hostname, uint32_t portnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_openW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseExtendedResultA(void* connection, void* resultmessage, void* resultoid, void* resultdata, bool freeit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_extended_resultA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, resultoid, resultdata, freeit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)resultoid;
    (void)resultdata;
    (void)freeit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseExtendedResultW(void* connection, void* resultmessage, void* resultoid, void* resultdata, bool freeit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_extended_resultW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, resultoid, resultdata, freeit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)resultoid;
    (void)resultdata;
    (void)freeit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParsePageControl(void* externalhandle, void* servercontrols, void* totalcount, void* cookie) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_control");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, servercontrols, totalcount, cookie);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParsePageControlA(void* externalhandle, void* servercontrols, void* totalcount, void* cookie) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, servercontrols, totalcount, cookie);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParsePageControlW(void* externalhandle, void* servercontrols, void* totalcount, void* cookie) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, servercontrols, totalcount, cookie);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseReference(void* connection, void* resultmessage, void* referrals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_reference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, referrals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseReferenceA(void* connection, void* resultmessage, void* referrals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_referenceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, referrals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseReferenceW(void* connection, void* resultmessage, void* referrals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_referenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, referrals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseResult(void* connection, void* resultmessage, void* returncode, void* matcheddns, void* errormessage, void* referrals, void* servercontrols, bool freeit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_result");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, freeit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseResultA(void* connection, void* resultmessage, void* returncode, void* matcheddns, void* errormessage, void* referrals, void* servercontrols, bool freeit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_resultA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, freeit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseResultW(void* connection, void* resultmessage, void* returncode, void* matcheddns, void* errormessage, void* referrals, void* servercontrols, bool freeit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_resultW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, freeit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseSortControl(void* externalhandle, void* control, void* result, void* attribute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_control");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, control, result, attribute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseSortControlA(void* externalhandle, void* control, void* result, void* attribute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, control, result, attribute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapParseSortControlW(void* externalhandle, void* control, void* result, void* attribute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, control, result, attribute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapParseVlvControlA(void* externalhandle, void* control, void* targetpos, void* listcount, void* context, void* errcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_vlv_controlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, control, targetpos, listcount, context, errcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)control;
    (void)targetpos;
    (void)listcount;
    (void)context;
    (void)errcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapParseVlvControlW(void* externalhandle, void* control, void* targetpos, void* listcount, void* context, void* errcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_vlv_controlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, control, targetpos, listcount, context, errcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)control;
    (void)targetpos;
    (void)listcount;
    (void)context;
    (void)errcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_ldap_ldapPerror(void* ld, void* msg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_perror");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ld, msg);
        return;
    }
    errno = ENOSYS;
#else
    (void)ld;
    (void)msg;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapRenameExt(void* ld, void* dn, void* newrdn, void* newparent, int32_t deleteoldrdn, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapRenameExtA(void* ld, void* dn, void* newrdn, void* newparent, int32_t deleteoldrdn, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_extA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapRenameExtW(void* ld, void* dn, void* newrdn, void* newparent, int32_t deleteoldrdn, void* servercontrols, void* clientcontrols, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_extW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapRenameExtS(void* ld, void* dn, void* newrdn, void* newparent, int32_t deleteoldrdn, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapRenameExtSA(void* ld, void* dn, void* newrdn, void* newparent, int32_t deleteoldrdn, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapRenameExtSW(void* ld, void* dn, void* newrdn, void* newparent, int32_t deleteoldrdn, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapResult(void* ld, uint32_t msgid, uint32_t all, void* timeout, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_result");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, msgid, all, timeout, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)msgid;
    (void)all;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapResult2error(void* ld, void* res, uint32_t freeit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_result2error");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, res, freeit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)res;
    (void)freeit;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapSaslBindA(void* externalhandle, void* distname, void* authmechanism, void* cred, void* serverctrls, void* clientctrls, void* messagenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bindA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, messagenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)messagenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapSaslBindW(void* externalhandle, void* distname, void* authmechanism, void* cred, void* serverctrls, void* clientctrls, void* messagenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bindW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, messagenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)messagenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapSaslBindSA(void* externalhandle, void* distname, void* authmechanism, void* cred, void* serverctrls, void* clientctrls, void* serverdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bind_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, serverdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)serverdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_ldap_ldapSaslBindSW(void* externalhandle, void* distname, void* authmechanism, void* cred, void* serverctrls, void* clientctrls, void* serverdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bind_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, serverdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)serverdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearch(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchA(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_searchA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchW(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_searchW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchAbandonPage(void* externalhandle, int64_t searchblock) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_abandon_page");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, searchblock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)searchblock;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchExt(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* servercontrols, void* clientcontrols, uint32_t timelimit, uint32_t sizelimit, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, servercontrols, clientcontrols, timelimit, sizelimit, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timelimit;
    (void)sizelimit;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchExtA(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* servercontrols, void* clientcontrols, uint32_t timelimit, uint32_t sizelimit, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_extA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, servercontrols, clientcontrols, timelimit, sizelimit, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timelimit;
    (void)sizelimit;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchExtW(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* servercontrols, void* clientcontrols, uint32_t timelimit, uint32_t sizelimit, void* messagenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_extW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, servercontrols, clientcontrols, timelimit, sizelimit, messagenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timelimit;
    (void)sizelimit;
    (void)messagenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchExtS(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* servercontrols, void* clientcontrols, void* timeout, uint32_t sizelimit, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, servercontrols, clientcontrols, timeout, sizelimit, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timeout;
    (void)sizelimit;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchExtSA(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* servercontrols, void* clientcontrols, void* timeout, uint32_t sizelimit, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, servercontrols, clientcontrols, timeout, sizelimit, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timeout;
    (void)sizelimit;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchExtSW(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* servercontrols, void* clientcontrols, void* timeout, uint32_t sizelimit, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, servercontrols, clientcontrols, timeout, sizelimit, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timeout;
    (void)sizelimit;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_ldap_ldapSearchInitPage(void* externalhandle, void* distinguishedname, uint32_t scopeofsearch, void* searchfilter, void* attributelist, uint32_t attributesonly, void* servercontrols, void* clientcontrols, uint32_t pagetimelimit, uint32_t totalsizelimit, void* sortkeys) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_page");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, scopeofsearch, searchfilter, attributelist, attributesonly, servercontrols, clientcontrols, pagetimelimit, totalsizelimit, sortkeys);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)scopeofsearch;
    (void)searchfilter;
    (void)attributelist;
    (void)attributesonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)pagetimelimit;
    (void)totalsizelimit;
    (void)sortkeys;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_ldap_ldapSearchInitPageA(void* externalhandle, void* distinguishedname, uint32_t scopeofsearch, void* searchfilter, void* attributelist, uint32_t attributesonly, void* servercontrols, void* clientcontrols, uint32_t pagetimelimit, uint32_t totalsizelimit, void* sortkeys) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_pageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, scopeofsearch, searchfilter, attributelist, attributesonly, servercontrols, clientcontrols, pagetimelimit, totalsizelimit, sortkeys);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)scopeofsearch;
    (void)searchfilter;
    (void)attributelist;
    (void)attributesonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)pagetimelimit;
    (void)totalsizelimit;
    (void)sortkeys;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_ldap_ldapSearchInitPageW(void* externalhandle, void* distinguishedname, uint32_t scopeofsearch, void* searchfilter, void* attributelist, uint32_t attributesonly, void* servercontrols, void* clientcontrols, uint32_t pagetimelimit, uint32_t totalsizelimit, void* sortkeys) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_pageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, distinguishedname, scopeofsearch, searchfilter, attributelist, attributesonly, servercontrols, clientcontrols, pagetimelimit, totalsizelimit, sortkeys);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)scopeofsearch;
    (void)searchfilter;
    (void)attributelist;
    (void)attributesonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)pagetimelimit;
    (void)totalsizelimit;
    (void)sortkeys;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchS(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchSA(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchSW(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchSt(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* timeout, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_st");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, timeout, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchStA(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* timeout, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_stA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, timeout, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSearchStW(void* ld, void* base, uint32_t scope, void* filter, void* attrs, uint32_t attrsonly, void* timeout, void* res) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_stW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, base, scope, filter, attrs, attrsonly, timeout, res);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSetDbgFlags(uint32_t newflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_dbg_flags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)newflags;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_ldap_ldapSetDbgRoutine(void* debugprintroutine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_dbg_routine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(debugprintroutine);
        return;
    }
    errno = ENOSYS;
#else
    (void)debugprintroutine;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSetOption(void* ld, int32_t option, void* invalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_option");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, option, invalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)option;
    (void)invalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSetOptionW(void* ld, int32_t option, void* invalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_optionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, option, invalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)option;
    (void)invalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSimpleBind(void* ld, void* dn, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSimpleBindA(void* ld, void* dn, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bindA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSimpleBindW(void* ld, void* dn, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bindW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSimpleBindS(void* ld, void* dn, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSimpleBindSA(void* ld, void* dn, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapSimpleBindSW(void* ld, void* dn, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld, dn, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapSslinit(void* hostname, uint32_t portnumber, int32_t secure) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber, secure);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapSslinitA(void* hostname, uint32_t portnumber, int32_t secure) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinitA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber, secure);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_ldap_ldapSslinitW(void* hostname, uint32_t portnumber, int32_t secure) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinitW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, portnumber, secure);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapStartTlsSA(void* externalhandle, void* serverreturnvalue, void* result, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_start_tls_sA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, serverreturnvalue, result, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)serverreturnvalue;
    (void)result;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapStartTlsSW(void* externalhandle, void* serverreturnvalue, void* result, void* servercontrols, void* clientcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_start_tls_sW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle, serverreturnvalue, result, servercontrols, clientcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)externalhandle;
    (void)serverreturnvalue;
    (void)result;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapStartup(void* version, void* instance) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_startup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version, instance);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)version;
    (void)instance;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_networking_ldap_ldapStopTlsS(void* externalhandle) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_stop_tls_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(externalhandle);
    }
    errno = ENOSYS;
    return false;
#else
    (void)externalhandle;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapUfn2dn(void* ufn, void* pdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ufn, pdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ufn;
    (void)pdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapUfn2dnA(void* ufn, void* pdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ufn, pdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ufn;
    (void)pdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapUfn2dnW(void* ufn, void* pdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ufn, pdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ufn;
    (void)pdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapUnbind(void* ld) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_unbind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapUnbindS(void* ld) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_unbind_s");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ld);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ld;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapValueFree(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_free");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapValueFreeA(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_freeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapValueFreeW(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_freeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_ldap_ldapValueFreeLen(void* vals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_free_len");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vals;
    errno = ENOSYS;
    return 0;
#endif
}

