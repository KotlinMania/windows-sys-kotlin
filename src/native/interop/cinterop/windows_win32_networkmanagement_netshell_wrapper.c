#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_netshell_wrapper.h"
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

uint32_t windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(void* hmodule, void* pwcarg, uint32_t dwnumarg, void* penumtable, void* pdwvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MatchEnumTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, pwcarg, dwnumarg, penumtable, pdwvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)pwcarg;
    (void)dwnumarg;
    (void)penumtable;
    (void)pdwvalue;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetshellMatchToken(void* pwszusertoken, void* pwszcmdtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MatchToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszusertoken, pwszcmdtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszusertoken;
    (void)pwszcmdtoken;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(void* hmodule, void* ppwcarguments, uint32_t dwcurrentindex, uint32_t dwargcount, void* ptttags, uint32_t dwtagcount, uint32_t dwminargs, uint32_t dwmaxargs, void* pdwtagtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PreprocessCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, ppwcarguments, dwcurrentindex, dwargcount, ptttags, dwtagcount, dwminargs, dwmaxargs, pdwtagtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)ppwcarguments;
    (void)dwcurrentindex;
    (void)dwargcount;
    (void)ptttags;
    (void)dwtagcount;
    (void)dwminargs;
    (void)dwmaxargs;
    (void)pdwtagtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetshellPrintError(void* hmodule, uint32_t dwerrid, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintError");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(hmodule, dwerrid);
            case 1: return km_fn_ptr(hmodule, dwerrid, (intptr_t)km_va0);
            case 2: return km_fn_ptr(hmodule, dwerrid, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(hmodule, dwerrid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(hmodule, dwerrid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)dwerrid;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(void* pwszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(pwszformat);
            case 1: return km_fn_ptr(pwszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(pwszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(void* hmodule, uint32_t dwmsgid, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintMessageFromModule");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(hmodule, dwmsgid);
            case 1: return km_fn_ptr(hmodule, dwmsgid, (intptr_t)km_va0);
            case 2: return km_fn_ptr(hmodule, dwmsgid, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(hmodule, dwmsgid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(hmodule, dwmsgid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)dwmsgid;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(void* pchildcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchildcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pchildcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(void* pguidparentcontext, void* pfnregistersubcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterHelper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguidparentcontext, pfnregistersubcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pguidparentcontext;
    (void)pfnregistersubcontext;
    errno = ENOSYS;
    return 0;
#endif
}

