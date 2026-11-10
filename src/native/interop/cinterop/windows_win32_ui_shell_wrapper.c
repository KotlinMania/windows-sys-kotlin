#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_shell_wrapper.h"
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

int32_t windowssys_windows_win32_ui_shell_assocCreateForClasses(void* rgclasses, uint32_t cclasses, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocCreateForClasses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rgclasses, cclasses, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rgclasses;
    (void)cclasses;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocGetDetailsOfPropKey(void* psf, void* pidl, void* pkey, void* pv, void* pffoundpropkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocGetDetailsOfPropKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psf, pidl, pkey, pv, pffoundpropkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psf;
    (void)pidl;
    (void)pkey;
    (void)pv;
    (void)pffoundpropkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocGetPerceivedType(void* pszext, void* ptype, void* pflag, void* ppsztype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocGetPerceivedType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszext, ptype, pflag, ppsztype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszext;
    (void)ptype;
    (void)pflag;
    (void)ppsztype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocIsDangerous(void* pszassoc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocIsDangerous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszassoc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszassoc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocQueryKeyA(uint32_t flags, int32_t key, void* pszassoc, void* pszextra, void* phkeyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, key, pszassoc, pszextra, phkeyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)key;
    (void)pszassoc;
    (void)pszextra;
    (void)phkeyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocQueryKeyW(uint32_t flags, int32_t key, void* pszassoc, void* pszextra, void* phkeyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, key, pszassoc, pszextra, phkeyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)key;
    (void)pszassoc;
    (void)pszextra;
    (void)phkeyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocQueryStringA(uint32_t flags, int32_t str, void* pszassoc, void* pszextra, void* pszout, void* pcchout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, str, pszassoc, pszextra, pszout, pcchout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)str;
    (void)pszassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocQueryStringByKeyA(uint32_t flags, int32_t str, void* hkassoc, void* pszextra, void* pszout, void* pcchout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringByKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, str, hkassoc, pszextra, pszout, pcchout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)str;
    (void)hkassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocQueryStringByKeyW(uint32_t flags, int32_t str, void* hkassoc, void* pszextra, void* pszout, void* pcchout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringByKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, str, hkassoc, pszextra, pszout, pcchout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)str;
    (void)hkassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_assocQueryStringW(uint32_t flags, int32_t str, void* pszassoc, void* pszextra, void* pszout, void* pcchout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, str, pszassoc, pszextra, pszout, pcchout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)str;
    (void)pszassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_cdefFolderMenuCreate2(void* pidlfolder, void* hwnd, uint32_t cidl, void* apidl, void* psf, void* pfn, uint32_t nkeys, void* ahkeys, void* ppcm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CDefFolderMenu_Create2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlfolder, hwnd, cidl, apidl, psf, pfn, nkeys, ahkeys, ppcm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlfolder;
    (void)hwnd;
    (void)cidl;
    (void)apidl;
    (void)psf;
    (void)pfn;
    (void)nkeys;
    (void)ahkeys;
    (void)ppcm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_cidldataCreateFromIdarray(void* pidlfolder, uint32_t cidl, void* apidl, void* ppdtobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CIDLData_CreateFromIDArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlfolder, cidl, apidl, ppdtobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlfolder;
    (void)cidl;
    (void)apidl;
    (void)ppdtobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_chrCmpIA(uint16_t w1, uint16_t w2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChrCmpIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(w1, w2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)w1;
    (void)w2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_chrCmpIW(uint16_t w1, uint16_t w2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChrCmpIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(w1, w2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)w1;
    (void)w2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_colorAdjustLuma(uint32_t clrrgb, int32_t n, int32_t fscale) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorAdjustLuma");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clrrgb, n, fscale);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clrrgb;
    (void)n;
    (void)fscale;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_colorHLSToRGB(uint16_t whue, uint16_t wluminance, uint16_t wsaturation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorHLSToRGB");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(whue, wluminance, wsaturation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)whue;
    (void)wluminance;
    (void)wsaturation;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_ui_shell_colorRGBToHLS(uint32_t clrrgb, void* pwhue, void* pwluminance, void* pwsaturation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorRGBToHLS");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(clrrgb, pwhue, pwluminance, pwsaturation);
        return;
    }
    errno = ENOSYS;
#else
    (void)clrrgb;
    (void)pwhue;
    (void)pwluminance;
    (void)pwsaturation;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_commandLineToArgvW(void* lpcmdline, void* pnumargs) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommandLineToArgvW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcmdline, pnumargs);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpcmdline;
    (void)pnumargs;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_connectToConnectionPoint(void* punk, void* riidevent, int32_t fconnect, void* punktarget, void* pdwcookie, void* ppcpout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectToConnectionPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, riidevent, fconnect, punktarget, pdwcookie, ppcpout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)riidevent;
    (void)fconnect;
    (void)punktarget;
    (void)pdwcookie;
    (void)ppcpout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_createProfile(void* pszusersid, void* pszusername, void* pszprofilepath, uint32_t cchprofilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszusersid, pszusername, pszprofilepath, cchprofilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszusersid;
    (void)pszusername;
    (void)pszprofilepath;
    (void)cchprofilepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_dadAutoScroll(void* hwnd, void* pad, void* pptnow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_AutoScroll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pad, pptnow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pad;
    (void)pptnow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_dadDragLeave(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_DragLeave");
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

int32_t windowssys_windows_win32_ui_shell_dadSetDragImage(int64_t him, void* pptoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_SetDragImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(him, pptoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)him;
    (void)pptoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_dadShowDragImage(int32_t fshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_ShowDragImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fshow;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_shell_defSubclassProc(void* hwnd, uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefSubclassProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_deleteProfileA(void* lpsidstring, void* lpprofilepath, void* lpcomputername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsidstring, lpprofilepath, lpcomputername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsidstring;
    (void)lpprofilepath;
    (void)lpcomputername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_deleteProfileW(void* lpsidstring, void* lpprofilepath, void* lpcomputername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsidstring, lpprofilepath, lpcomputername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsidstring;
    (void)lpprofilepath;
    (void)lpcomputername;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_doEnvironmentSubstA(void* pszsrc, uint32_t cchsrc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoEnvironmentSubstA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc, cchsrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszsrc;
    (void)cchsrc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_doEnvironmentSubstW(void* pszsrc, uint32_t cchsrc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoEnvironmentSubstW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc, cchsrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszsrc;
    (void)cchsrc;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_ui_shell_dragAcceptFiles(void* hwnd, int32_t faccept) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragAcceptFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwnd, faccept);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwnd;
    (void)faccept;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_dragFinish(void* hdrop) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragFinish");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdrop);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdrop;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_dragQueryFileA(void* hdrop, uint32_t ifile, void* lpszfile, uint32_t cch) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragQueryFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrop, ifile, lpszfile, cch);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdrop;
    (void)ifile;
    (void)lpszfile;
    (void)cch;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_dragQueryFileW(void* hdrop, uint32_t ifile, void* lpszfile, uint32_t cch) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragQueryFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrop, ifile, lpszfile, cch);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdrop;
    (void)ifile;
    (void)lpszfile;
    (void)cch;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_dragQueryPoint(void* hdrop, void* ppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragQueryPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrop, ppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrop;
    (void)ppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_driveType(int32_t idrive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DriveType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idrive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idrive;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_duplicateIcon(void* hinst, void* hicon) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, hicon);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)hicon;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_extractAssociatedIconA(void* hinst, void* psziconpath, void* piicon) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, psziconpath, piicon);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piicon;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_extractAssociatedIconExA(void* hinst, void* psziconpath, void* piiconindex, void* piiconid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, psziconpath, piiconindex, piiconid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piiconindex;
    (void)piiconid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_extractAssociatedIconExW(void* hinst, void* psziconpath, void* piiconindex, void* piiconid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, psziconpath, piiconindex, piiconid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piiconindex;
    (void)piiconid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_extractAssociatedIconW(void* hinst, void* psziconpath, void* piicon) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, psziconpath, piicon);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piicon;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_extractIconA(void* hinst, void* pszexefilename, uint32_t niconindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, pszexefilename, niconindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)pszexefilename;
    (void)niconindex;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_extractIconExA(void* lpszfile, int32_t niconindex, void* phiconlarge, void* phiconsmall, uint32_t nicons) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfile, niconindex, phiconlarge, phiconsmall, nicons);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszfile;
    (void)niconindex;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)nicons;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_extractIconExW(void* lpszfile, int32_t niconindex, void* phiconlarge, void* phiconsmall, uint32_t nicons) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfile, niconindex, phiconlarge, phiconsmall, nicons);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszfile;
    (void)niconindex;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)nicons;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_shell_extractIconW(void* hinst, void* pszexefilename, uint32_t niconindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, pszexefilename, niconindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)pszexefilename;
    (void)niconindex;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_findExecutableA(void* lpfile, void* lpdirectory, void* lpresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfile, lpdirectory, lpresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfile;
    (void)lpdirectory;
    (void)lpresult;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_findExecutableW(void* lpfile, void* lpdirectory, void* lpresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfile, lpdirectory, lpresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfile;
    (void)lpdirectory;
    (void)lpresult;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getAcceptLanguagesA(void* pszlanguages, void* pcchlanguages) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptLanguagesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlanguages, pcchlanguages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlanguages;
    (void)pcchlanguages;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getAcceptLanguagesW(void* pszlanguages, void* pcchlanguages) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptLanguagesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlanguages, pcchlanguages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlanguages;
    (void)pcchlanguages;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryA(void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllUsersProfileDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryW(void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllUsersProfileDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getCurrentProcessExplicitAppUserModelID(void* appid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessExplicitAppUserModelID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)appid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryA(void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultUserProfileDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryW(void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultUserProfileDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_getDpiForShellUIComponent(int32_t param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiForShellUIComponent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getFileNameFromBrowse(void* hwnd, void* pszfilepath, uint32_t cchfilepath, void* pszworkingdir, void* pszdefext, void* pszfilters, void* psztitle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileNameFromBrowse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszfilepath, cchfilepath, pszworkingdir, pszdefext, pszfilters, psztitle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszfilepath;
    (void)cchfilepath;
    (void)pszworkingdir;
    (void)pszdefext;
    (void)pszfilters;
    (void)psztitle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_getMenuContextHelpId(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuContextHelpId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getMenuPosFromID(void* hmenu, uint32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuPosFromID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getProfileType(void* dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getProfilesDirectoryA(void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfilesDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getProfilesDirectoryW(void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfilesDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getScaleFactorForDevice(int32_t devicetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScaleFactorForDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)devicetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getScaleFactorForMonitor(void* hmon, void* pscale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScaleFactorForMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmon, pscale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmon;
    (void)pscale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getUserProfileDirectoryA(void* htoken, void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserProfileDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getUserProfileDirectoryW(void* htoken, void* lpprofiledir, void* lpcchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserProfileDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpprofiledir, lpcchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpprofiledir;
    (void)lpcchsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_getWindowContextHelpId(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowContextHelpId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_getWindowSubclass(void* hwnd, void* pfnsubclass, uint64_t uidsubclass, void* pdwrefdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowSubclass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pfnsubclass, uidsubclass, pdwrefdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pfnsubclass;
    (void)uidsubclass;
    (void)pdwrefdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_hmonitorUserFree(void* param0, void* param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(param0, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_hmonitorUserFree64(void* param0, void* param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserFree64");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(param0, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_hmonitorUserMarshal(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserMarshal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_hmonitorUserMarshal64(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserMarshal64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_hmonitorUserSize(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_hmonitorUserSize64(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserSize64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserUnmarshal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal64(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserUnmarshal64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hashData(void* pbdata, uint32_t cbdata, void* pbhash, uint32_t cbhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HashData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbdata, cbdata, pbhash, cbhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbdata;
    (void)cbdata;
    (void)pbhash;
    (void)cbhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkClone(void* pihl, void* riid, void* pihlsiteforclone, uint32_t dwsitedata, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkClone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pihl, riid, pihlsiteforclone, dwsitedata, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pihl;
    (void)riid;
    (void)pihlsiteforclone;
    (void)dwsitedata;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateBrowseContext(void* piunkouter, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateBrowseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piunkouter, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateExtensionServices(void* pwzadditionalheaders, void* phwnd, void* pszusername, void* pszpassword, void* piunkouter, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateExtensionServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzadditionalheaders, phwnd, pszusername, pszpassword, piunkouter, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzadditionalheaders;
    (void)phwnd;
    (void)pszusername;
    (void)pszpassword;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateFromData(void* pidataobj, void* pihlsite, uint32_t dwsitedata, void* piunkouter, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidataobj, pihlsite, dwsitedata, piunkouter, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidataobj;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateFromMoniker(void* pimktrgt, void* pwzlocation, void* pwzfriendlyname, void* pihlsite, uint32_t dwsitedata, void* piunkouter, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateFromMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimktrgt, pwzlocation, pwzfriendlyname, pihlsite, dwsitedata, piunkouter, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pimktrgt;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateFromString(void* pwztarget, void* pwzlocation, void* pwzfriendlyname, void* pihlsite, uint32_t dwsitedata, void* piunkouter, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwztarget, pwzlocation, pwzfriendlyname, pihlsite, dwsitedata, piunkouter, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwztarget;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateShortcut(uint32_t grfhlshortcutf, void* pihl, void* pwzdir, void* pwzfilename, void* ppwzshortcutfile, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateShortcut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grfhlshortcutf, pihl, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grfhlshortcutf;
    (void)pihl;
    (void)pwzdir;
    (void)pwzfilename;
    (void)ppwzshortcutfile;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromMoniker(uint32_t grfhlshortcutf, void* pimktarget, void* pwzlocation, void* pwzdir, void* pwzfilename, void* ppwzshortcutfile, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateShortcutFromMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grfhlshortcutf, pimktarget, pwzlocation, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grfhlshortcutf;
    (void)pimktarget;
    (void)pwzlocation;
    (void)pwzdir;
    (void)pwzfilename;
    (void)ppwzshortcutfile;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromString(uint32_t grfhlshortcutf, void* pwztarget, void* pwzlocation, void* pwzdir, void* pwzfilename, void* ppwzshortcutfile, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateShortcutFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grfhlshortcutf, pwztarget, pwzlocation, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grfhlshortcutf;
    (void)pwztarget;
    (void)pwzlocation;
    (void)pwzdir;
    (void)pwzfilename;
    (void)ppwzshortcutfile;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkGetSpecialReference(uint32_t ureference, void* ppwzreference) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGetSpecialReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ureference, ppwzreference);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ureference;
    (void)ppwzreference;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkGetValueFromParams(void* pwzparams, void* pwzname, void* ppwzvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGetValueFromParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzparams, pwzname, ppwzvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzparams;
    (void)pwzname;
    (void)ppwzvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkIsShortcut(void* pwzfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkIsShortcut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkNavigate(void* pihl, void* pihlframe, uint32_t grfhlnf, void* pbc, void* pibsc, void* pihlbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pihl, pihlframe, grfhlnf, pbc, pibsc, pihlbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pihl;
    (void)pihlframe;
    (void)grfhlnf;
    (void)pbc;
    (void)pibsc;
    (void)pihlbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkNavigateToStringReference(void* pwztarget, void* pwzlocation, void* pihlsite, uint32_t dwsitedata, void* pihlframe, uint32_t grfhlnf, void* pibc, void* pibsc, void* pihlbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigateToStringReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwztarget, pwzlocation, pihlsite, dwsitedata, pihlframe, grfhlnf, pibc, pibsc, pihlbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwztarget;
    (void)pwzlocation;
    (void)pihlsite;
    (void)dwsitedata;
    (void)pihlframe;
    (void)grfhlnf;
    (void)pibc;
    (void)pibsc;
    (void)pihlbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkOnNavigate(void* pihlframe, void* pihlbc, uint32_t grfhlnf, void* pimktarget, void* pwzlocation, void* pwzfriendlyname, void* puhlid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkOnNavigate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pihlframe, pihlbc, grfhlnf, pimktarget, pwzlocation, pwzfriendlyname, puhlid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pihlframe;
    (void)pihlbc;
    (void)grfhlnf;
    (void)pimktarget;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    (void)puhlid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkOnRenameDocument(uint32_t dwreserved, void* pihlbc, void* pimkold, void* pimknew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkOnRenameDocument");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved, pihlbc, pimkold, pimknew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwreserved;
    (void)pihlbc;
    (void)pimkold;
    (void)pimknew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkParseDisplayName(void* pibc, void* pwzdisplayname, int32_t fnoforceabs, void* pccheaten, void* ppimk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkParseDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pibc, pwzdisplayname, fnoforceabs, pccheaten, ppimk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pibc;
    (void)pwzdisplayname;
    (void)fnoforceabs;
    (void)pccheaten;
    (void)ppimk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkPreprocessMoniker(void* pibc, void* pimkin, void* ppimkout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkPreprocessMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pibc, pimkin, ppimkout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pibc;
    (void)pimkin;
    (void)ppimkout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkQueryCreateFromData(void* pidataobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkQueryCreateFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidataobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidataobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkResolveMonikerForData(void* pimkreference, uint32_t reserved, void* pibc, uint32_t cfmtetc, void* rgfmtetc, void* pibsc, void* pimkbase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveMonikerForData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimkreference, reserved, pibc, cfmtetc, rgfmtetc, pibsc, pimkbase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pimkreference;
    (void)reserved;
    (void)pibc;
    (void)cfmtetc;
    (void)rgfmtetc;
    (void)pibsc;
    (void)pimkbase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkResolveShortcut(void* pwzshortcutfilename, void* pihlsite, uint32_t dwsitedata, void* piunkouter, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveShortcut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzshortcutfilename, pihlsite, dwsitedata, piunkouter, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzshortcutfilename;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkResolveShortcutToMoniker(void* pwzshortcutfilename, void* ppimktarget, void* ppwzlocation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveShortcutToMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzshortcutfilename, ppimktarget, ppwzlocation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzshortcutfilename;
    (void)ppimktarget;
    (void)ppwzlocation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkResolveShortcutToString(void* pwzshortcutfilename, void* ppwztarget, void* ppwzlocation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveShortcutToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzshortcutfilename, ppwztarget, ppwzlocation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzshortcutfilename;
    (void)ppwztarget;
    (void)ppwzlocation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkResolveStringForData(void* pwzreference, uint32_t reserved, void* pibc, uint32_t cfmtetc, void* rgfmtetc, void* pibsc, void* pimkbase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveStringForData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzreference, reserved, pibc, cfmtetc, rgfmtetc, pibsc, pimkbase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzreference;
    (void)reserved;
    (void)pibc;
    (void)cfmtetc;
    (void)rgfmtetc;
    (void)pibsc;
    (void)pimkbase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkSetSpecialReference(uint32_t ureference, void* pwzreference) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkSetSpecialReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ureference, pwzreference);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ureference;
    (void)pwzreference;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkTranslateURL(void* pwzurl, uint32_t grfflags, void* ppwztranslatedurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkTranslateURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzurl, grfflags, ppwztranslatedurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzurl;
    (void)grfflags;
    (void)ppwztranslatedurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_hlinkUpdateStackItem(void* pihlframe, void* pihlbc, uint32_t uhlid, void* pimktrgt, void* pwzlocation, void* pwzfriendlyname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkUpdateStackItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pihlframe, pihlbc, uhlid, pimktrgt, pwzlocation, pwzfriendlyname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pihlframe;
    (void)pihlbc;
    (void)uhlid;
    (void)pimktrgt;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_iLAppendID(void* pidl, void* pmkid, int32_t fappend) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILAppendID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, pmkid, fappend);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidl;
    (void)pmkid;
    (void)fappend;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLClone(void* pidl) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILClone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidl;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLCloneFirst(void* pidl) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCloneFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidl;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLCombine(void* pidl1, void* pidl2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCombine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl1, pidl2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidl1;
    (void)pidl2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLCreateFromPathA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCreateFromPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLCreateFromPathW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCreateFromPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLFindChild(void* pidlparent, void* pidlchild) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILFindChild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlparent, pidlchild);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidlparent;
    (void)pidlchild;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_iLFindLastID(void* pidl) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILFindLastID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidl;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_ui_shell_iLFree(void* pidl) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pidl);
        return;
    }
    errno = ENOSYS;
#else
    (void)pidl;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_iLGetNext(void* pidl) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILGetNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pidl;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_iLGetSize(void* pidl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILGetSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pidl;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iLIsEqual(void* pidl1, void* pidl2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILIsEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl1, pidl2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl1;
    (void)pidl2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iLIsParent(void* pidl1, void* pidl2, int32_t fimmediate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILIsParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl1, pidl2, fimmediate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl1;
    (void)pidl2;
    (void)fimmediate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iLLoadFromStreamEx(void* pstm, void* pidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILLoadFromStreamEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iLRemoveLastID(void* pidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILRemoveLastID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iLSaveToStream(void* pstm, void* pidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILSaveToStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamCopy(void* pstmfrom, void* pstmto, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Copy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstmfrom, pstmto, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstmfrom;
    (void)pstmto;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamRead(void* pstm, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Read");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamReadPidl(void* pstm, void* ppidlout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_ReadPidl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, ppidlout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)ppidlout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamReadStr(void* pstm, void* ppsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_ReadStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, ppsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)ppsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamReset(void* pstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Reset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamSize(void* pstm, void* pui) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Size");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pui);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pui;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamWrite(void* pstm, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Write");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamWritePidl(void* pstm, void* pidlwrite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_WritePidl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pidlwrite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pidlwrite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_istreamWriteStr(void* pstm, void* psz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_WriteStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, psz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)psz;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_iunknownAtomicRelease(void* ppunk) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_AtomicRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ppunk);
        return;
    }
    errno = ENOSYS;
#else
    (void)ppunk;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iunknownGetSite(void* punk, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_GetSite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iunknownGetWindow(void* punk, void* phwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_GetWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, phwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)phwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iunknownQueryService(void* punk, void* guidservice, void* riid, void* ppvout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_QueryService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, guidservice, riid, ppvout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)guidservice;
    (void)riid;
    (void)ppvout;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_iunknownSet(void* ppunk, void* punk) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_Set");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ppunk, punk);
        return;
    }
    errno = ENOSYS;
#else
    (void)ppunk;
    (void)punk;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_iunknownSetSite(void* punk, void* punksite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_SetSite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, punksite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)punksite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_importPrivacySettings(void* pszfilename, void* pfparseprivacypreferences, void* pfparsepersiterules) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shdocvw.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportPrivacySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, pfparseprivacypreferences, pfparsepersiterules);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfilename;
    (void)pfparseprivacypreferences;
    (void)pfparsepersiterules;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_initNetworkAddressControl(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitNetworkAddressControl");
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

int32_t windowssys_windows_win32_ui_shell_initPropVariantFromStrRet(void* pstrret, void* pidl, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromStrRet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstrret, pidl, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstrret;
    (void)pidl;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_initVariantFromStrRet(void* pstrret, void* pidl, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromStrRet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstrret, pidl, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstrret;
    (void)pidl;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_intlStrEqWorkerA(int32_t fcasesens, void* lpstring1, void* lpstring2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntlStrEqWorkerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcasesens, lpstring1, lpstring2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcasesens;
    (void)lpstring1;
    (void)lpstring2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_intlStrEqWorkerW(int32_t fcasesens, void* lpstring1, void* lpstring2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntlStrEqWorkerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcasesens, lpstring1, lpstring2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcasesens;
    (void)lpstring1;
    (void)lpstring2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isCharSpaceA(int8_t wch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharSpaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isCharSpaceW(uint16_t wch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharSpaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isInternetESCEnabled(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsInternetESCEnabled");
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

int32_t windowssys_windows_win32_ui_shell_isLFNDriveA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLFNDriveA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isLFNDriveW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLFNDriveW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isNetDrive(int32_t idrive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNetDrive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idrive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idrive;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isOS(uint32_t dwos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsOS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_isUserAnAdmin(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUserAnAdmin");
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

int32_t windowssys_windows_win32_ui_shell_loadUserProfileA(void* htoken, void* lpprofileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUserProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpprofileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpprofileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_loadUserProfileW(void* htoken, void* lpprofileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUserProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpprofileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpprofileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_oleSaveToStreamEx(void* piunk, void* pistm, int32_t fcleardirty) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSaveToStreamEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piunk, pistm, fcleardirty);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)piunk;
    (void)pistm;
    (void)fcleardirty;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_openRegStream(void* hkey, void* pszsubkey, void* pszvalue, uint32_t grfmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenRegStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, grfmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_parseURLA(void* pcszurl, void* ppu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseURLA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcszurl, ppu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcszurl;
    (void)ppu;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_parseURLW(void* pcszurl, void* ppu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseURLW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcszurl, ppu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcszurl;
    (void)ppu;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_pathAddBackslashA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddBackslashA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathAddBackslashW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddBackslashW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathAddExtensionA(void* pszpath, void* pszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddExtensionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathAddExtensionW(void* pszpath, void* pszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddExtensionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathAllocCanonicalize(void* pszpathin, uint32_t dwflags, void* ppszpathout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAllocCanonicalize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpathin, dwflags, ppszpathout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpathin;
    (void)dwflags;
    (void)ppszpathout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathAllocCombine(void* pszpathin, void* pszmore, uint32_t dwflags, void* ppszpathout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAllocCombine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpathin, pszmore, dwflags, ppszpathout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpathin;
    (void)pszmore;
    (void)dwflags;
    (void)ppszpathout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathAppendA(void* pszpath, void* pszmore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAppendA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszmore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszmore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathAppendW(void* pszpath, void* pszmore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAppendW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszmore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszmore;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_pathBuildRootA(void* pszroot, int32_t idrive) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathBuildRootA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszroot, idrive);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszroot;
    (void)idrive;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathBuildRootW(void* pszroot, int32_t idrive) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathBuildRootW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszroot, idrive);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszroot;
    (void)idrive;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCanonicalizeA(void* pszbuf, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCanonicalizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszbuf, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszbuf;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCanonicalizeW(void* pszbuf, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCanonicalizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszbuf, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszbuf;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchAddBackslash(void* pszpath, uint64_t cchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAddBackslash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchAddBackslashEx(void* pszpath, uint64_t cchpath, void* ppszend, void* pcchremaining) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAddBackslashEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, ppszend, pcchremaining);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)ppszend;
    (void)pcchremaining;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchAddExtension(void* pszpath, uint64_t cchpath, void* pszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAddExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, pszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchAppend(void* pszpath, uint64_t cchpath, void* pszmore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAppend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, pszmore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszmore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchAppendEx(void* pszpath, uint64_t cchpath, void* pszmore, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAppendEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, pszmore, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszmore;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchCanonicalize(void* pszpathout, uint64_t cchpathout, void* pszpathin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCanonicalize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpathout, cchpathout, pszpathin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchCanonicalizeEx(void* pszpathout, uint64_t cchpathout, void* pszpathin, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCanonicalizeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpathout, cchpathout, pszpathin, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchCombine(void* pszpathout, uint64_t cchpathout, void* pszpathin, void* pszmore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCombine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpathout, cchpathout, pszpathin, pszmore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    (void)pszmore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchCombineEx(void* pszpathout, uint64_t cchpathout, void* pszpathin, void* pszmore, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCombineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpathout, cchpathout, pszpathin, pszmore, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    (void)pszmore;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchFindExtension(void* pszpath, uint64_t cchpath, void* ppszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchFindExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, ppszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)ppszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchIsRoot(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchIsRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchRemoveBackslash(void* pszpath, uint64_t cchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveBackslash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchRemoveBackslashEx(void* pszpath, uint64_t cchpath, void* ppszend, void* pcchremaining) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveBackslashEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, ppszend, pcchremaining);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)ppszend;
    (void)pcchremaining;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchRemoveExtension(void* pszpath, uint64_t cchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchRemoveFileSpec(void* pszpath, uint64_t cchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveFileSpec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchRenameExtension(void* pszpath, uint64_t cchpath, void* pszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRenameExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath, pszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchSkipRoot(void* pszpath, void* ppszrootend) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchSkipRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, ppszrootend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)ppszrootend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchStripPrefix(void* pszpath, uint64_t cchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchStripPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCchStripToRoot(void* pszpath, uint64_t cchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchStripToRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, cchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)cchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCleanupSpec(void* pszdir, void* pszspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCleanupSpec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdir, pszspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdir;
    (void)pszspec;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_pathCombineA(void* pszdest, void* pszdir, void* pszfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCombineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdest, pszdir, pszfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdest;
    (void)pszdir;
    (void)pszfile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathCombineW(void* pszdest, void* pszdir, void* pszfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCombineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdest, pszdir, pszfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdest;
    (void)pszdir;
    (void)pszfile;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCommonPrefixA(void* pszfile1, void* pszfile2, void* achpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCommonPrefixA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile1, pszfile2, achpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile1;
    (void)pszfile2;
    (void)achpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCommonPrefixW(void* pszfile1, void* pszfile2, void* achpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCommonPrefixW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile1, pszfile2, achpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile1;
    (void)pszfile2;
    (void)achpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCompactPathA(void* hdc, void* pszpath, uint32_t dx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pszpath, dx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pszpath;
    (void)dx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCompactPathExA(void* pszout, void* pszsrc, uint32_t cchmax, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszout, pszsrc, cchmax, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszout;
    (void)pszsrc;
    (void)cchmax;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCompactPathExW(void* pszout, void* pszsrc, uint32_t cchmax, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszout, pszsrc, cchmax, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszout;
    (void)pszsrc;
    (void)cchmax;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCompactPathW(void* hdc, void* pszpath, uint32_t dx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pszpath, dx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pszpath;
    (void)dx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCreateFromUrlA(void* pszurl, void* pszpath, void* pcchpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCreateFromUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszpath, pcchpath, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszpath;
    (void)pcchpath;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCreateFromUrlAlloc(void* pszin, void* ppszout, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCreateFromUrlAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszin, ppszout, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszin;
    (void)ppszout;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathCreateFromUrlW(void* pszurl, void* pszpath, void* pcchpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCreateFromUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszpath, pcchpath, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszpath;
    (void)pcchpath;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathFileExistsA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFileExistsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathFileExistsW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFileExistsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindExtensionA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindExtensionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindExtensionW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindExtensionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindFileNameA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindFileNameW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindNextComponentA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindNextComponentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindNextComponentW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindNextComponentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathFindOnPathA(void* pszpath, void* ppszotherdirs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindOnPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, ppszotherdirs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)ppszotherdirs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathFindOnPathW(void* pszpath, void* ppszotherdirs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindOnPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, ppszotherdirs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)ppszotherdirs;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindSuffixArrayA(void* pszpath, void* apszsuffix, int32_t iarraysize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindSuffixArrayA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, apszsuffix, iarraysize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    (void)apszsuffix;
    (void)iarraysize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathFindSuffixArrayW(void* pszpath, void* apszsuffix, int32_t iarraysize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindSuffixArrayW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, apszsuffix, iarraysize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    (void)apszsuffix;
    (void)iarraysize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathGetArgsA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetArgsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathGetArgsW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetArgsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_pathGetCharTypeA(uint8_t ch) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetCharTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ch;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_pathGetCharTypeW(uint16_t ch) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetCharTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ch;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathGetDriveNumberA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetDriveNumberA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathGetDriveNumberW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetDriveNumberW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_pathGetShortPath(void* pszlongpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetShortPath");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszlongpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszlongpath;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsContentTypeA(void* pszpath, void* pszcontenttype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsContentTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszcontenttype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszcontenttype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsContentTypeW(void* pszpath, void* pszcontenttype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsContentTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszcontenttype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszcontenttype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsDirectoryA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryEmptyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryEmptyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsDirectoryW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsExe(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsExe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsFileSpecA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsFileSpecA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsFileSpecW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsFileSpecW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsLFNFileSpecA(void* pszname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsLFNFileSpecA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsLFNFileSpecW(void* pszname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsLFNFileSpecW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsNetworkPathA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsNetworkPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsNetworkPathW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsNetworkPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsPrefixA(void* pszprefix, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsPrefixA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprefix, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprefix;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsPrefixW(void* pszprefix, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsPrefixW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprefix, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprefix;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsRelativeA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRelativeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsRelativeW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRelativeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsRootA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRootA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsRootW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRootW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsSameRootA(void* pszpath1, void* pszpath2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSameRootA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath1, pszpath2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath1;
    (void)pszpath2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsSameRootW(void* pszpath1, void* pszpath2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSameRootW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath1, pszpath2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath1;
    (void)pszpath2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsSlowA(void* pszfile, uint32_t dwattr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSlowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, dwattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)dwattr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsSlowW(void* pszfile, uint32_t dwattr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSlowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, dwattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)dwattr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsSystemFolderA(void* pszpath, uint32_t dwattrb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSystemFolderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, dwattrb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)dwattrb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsSystemFolderW(void* pszpath, uint32_t dwattrb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSystemFolderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, dwattrb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)dwattrb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCEx(void* pszpath, void* ppszserver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, ppszserver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)ppszserver;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCServerA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCServerShareA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerShareA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCServerShareW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerShareW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCServerW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsUNCW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsURLA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsURLA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathIsURLW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsURLW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMakePrettyA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakePrettyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMakePrettyW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakePrettyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMakeSystemFolderA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakeSystemFolderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMakeSystemFolderW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakeSystemFolderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMakeUniqueName(void* pszuniquename, uint32_t cchmax, void* psztemplate, void* pszlongplate, void* pszdir) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakeUniqueName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszuniquename, cchmax, psztemplate, pszlongplate, pszdir);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszuniquename;
    (void)cchmax;
    (void)psztemplate;
    (void)pszlongplate;
    (void)pszdir;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMatchSpecA(void* pszfile, void* pszspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, pszspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)pszspec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMatchSpecExA(void* pszfile, void* pszspec, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, pszspec, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)pszspec;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMatchSpecExW(void* pszfile, void* pszspec, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, pszspec, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)pszspec;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathMatchSpecW(void* pszfile, void* pszspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, pszspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)pszspec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathParseIconLocationA(void* psziconfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathParseIconLocationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathParseIconLocationW(void* psziconfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathParseIconLocationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconfile;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_pathQualify(void* psz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathQualify");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(psz);
        return;
    }
    errno = ENOSYS;
#else
    (void)psz;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathQuoteSpacesA(void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathQuoteSpacesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathQuoteSpacesW(void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathQuoteSpacesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathRelativePathToA(void* pszpath, void* pszfrom, uint32_t dwattrfrom, void* pszto, uint32_t dwattrto) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRelativePathToA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszfrom, dwattrfrom, pszto, dwattrto);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszfrom;
    (void)dwattrfrom;
    (void)pszto;
    (void)dwattrto;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathRelativePathToW(void* pszpath, void* pszfrom, uint32_t dwattrfrom, void* pszto, uint32_t dwattrto) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRelativePathToW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszfrom, dwattrfrom, pszto, dwattrto);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszfrom;
    (void)dwattrfrom;
    (void)pszto;
    (void)dwattrto;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_pathRemoveArgsA(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveArgsA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathRemoveArgsW(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveArgsW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_pathRemoveBackslashA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBackslashA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathRemoveBackslashW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBackslashW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_ui_shell_pathRemoveBlanksA(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBlanksA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathRemoveBlanksW(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBlanksW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathRemoveExtensionA(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveExtensionA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathRemoveExtensionW(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveExtensionW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathRemoveFileSpecA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveFileSpecA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathRemoveFileSpecW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveFileSpecW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathRenameExtensionA(void* pszpath, void* pszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRenameExtensionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathRenameExtensionW(void* pszpath, void* pszext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRenameExtensionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathResolve(void* pszpath, void* dirs, uint32_t fflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathResolve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, dirs, fflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)dirs;
    (void)fflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathSearchAndQualifyA(void* pszpath, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSearchAndQualifyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathSearchAndQualifyW(void* pszpath, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSearchAndQualifyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_pathSetDlgItemPathA(void* hdlg, int32_t id, void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSetDlgItemPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdlg, id, pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdlg;
    (void)id;
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathSetDlgItemPathW(void* hdlg, int32_t id, void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSetDlgItemPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdlg, id, pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdlg;
    (void)id;
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_pathSkipRootA(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSkipRootA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_pathSkipRootW(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSkipRootW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_ui_shell_pathStripPathA(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathStripPathW(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathStripToRootA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripToRootA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathStripToRootW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripToRootW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsA(void* pszpath, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnExpandEnvStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsW(void* pszpath, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnExpandEnvStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_pathUndecorateA(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUndecorateA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_pathUndecorateW(void* pszpath) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUndecorateW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszpath);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszpath;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderA(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnmakeSystemFolderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderW(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnmakeSystemFolderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathUnquoteSpacesA(void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnquoteSpacesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathUnquoteSpacesW(void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnquoteSpacesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pathYetAnotherMakeUniqueName(void* pszuniquename, void* pszpath, void* pszshort, void* pszfilespec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathYetAnotherMakeUniqueName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszuniquename, pszpath, pszshort, pszfilespec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszuniquename;
    (void)pszpath;
    (void)pszshort;
    (void)pszfilespec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_pickIconDlg(void* hwnd, void* psziconpath, uint32_t cchiconpath, void* piiconindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PickIconDlg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psziconpath, cchiconpath, piiconindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psziconpath;
    (void)cchiconpath;
    (void)piiconindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propVariantToStrRet(void* propvar, void* pstrret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStrRet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pstrret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pstrret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_qISearch(void* that, void* pqit, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QISearch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(that, pqit, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)that;
    (void)pqit;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_readCabinetState(void* pcs, int32_t clength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadCabinetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcs, clength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcs;
    (void)clength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_realDriveType(int32_t idrive, int32_t foktohitnet) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealDriveType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idrive, foktohitnet);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idrive;
    (void)foktohitnet;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_registerAppConstrainedChangeNotification(void* routine, void* context, void* registration) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppConstrainedChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(routine, context, registration);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)routine;
    (void)context;
    (void)registration;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_registerAppStateChangeNotification(void* routine, void* context, void* registration) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppStateChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(routine, context, registration);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)routine;
    (void)context;
    (void)registration;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_registerScaleChangeEvent(void* hevent, void* pdwcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterScaleChangeEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, pdwcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)pdwcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_registerScaleChangeNotifications(int32_t displaydevice, void* hwndnotify, uint32_t umsgnotify, void* pdwcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterScaleChangeNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(displaydevice, hwndnotify, umsgnotify, pdwcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)displaydevice;
    (void)hwndnotify;
    (void)umsgnotify;
    (void)pdwcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_removeWindowSubclass(void* hwnd, void* pfnsubclass, uint64_t uidsubclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveWindowSubclass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pfnsubclass, uidsubclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pfnsubclass;
    (void)uidsubclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_restartDialog(void* hwnd, void* pszprompt, uint32_t dwreturn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszprompt, dwreturn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszprompt;
    (void)dwreturn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_restartDialogEx(void* hwnd, void* pszprompt, uint32_t dwreturn, uint32_t dwreasoncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartDialogEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszprompt, dwreturn, dwreasoncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszprompt;
    (void)dwreturn;
    (void)dwreasoncode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_revokeScaleChangeNotifications(int32_t displaydevice, uint32_t dwcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeScaleChangeNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(displaydevice, dwcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)displaydevice;
    (void)dwcookie;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_sHAddToRecentDocs(uint32_t uflags, void* pv) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAddToRecentDocs");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uflags, pv);
        return;
    }
    errno = ENOSYS;
#else
    (void)uflags;
    (void)pv;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_sHAlloc(uint64_t cb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cb;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_sHAllocShared(void* pvdata, uint32_t dwsize, uint32_t dwprocessid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAllocShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvdata, dwsize, dwprocessid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pvdata;
    (void)dwsize;
    (void)dwprocessid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHAnsiToAnsi(void* pszsrc, void* pszdst, int32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAnsiToAnsi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc, pszdst, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsrc;
    (void)pszdst;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHAnsiToUnicode(void* pszsrc, void* pwszdst, int32_t cwchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAnsiToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc, pwszdst, cwchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsrc;
    (void)pwszdst;
    (void)cwchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_ui_shell_sHAppBarMessage(uint32_t dwmessage, void* pdata) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAppBarMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmessage, pdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwmessage;
    (void)pdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHAssocEnumHandlers(void* pszextra, int32_t affilter, void* ppenumhandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAssocEnumHandlers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszextra, affilter, ppenumhandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszextra;
    (void)affilter;
    (void)ppenumhandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHAssocEnumHandlersForProtocolByApplication(void* protocol, void* riid, void* enumhandlers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAssocEnumHandlersForProtocolByApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protocol, riid, enumhandlers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protocol;
    (void)riid;
    (void)enumhandlers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHAutoComplete(void* hwndedit, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAutoComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndedit, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndedit;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHBindToFolderIDListParent(void* psfroot, void* pidl, void* riid, void* ppv, void* ppidllast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToFolderIDListParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psfroot, pidl, riid, ppv, ppidllast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psfroot;
    (void)pidl;
    (void)riid;
    (void)ppv;
    (void)ppidllast;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHBindToFolderIDListParentEx(void* psfroot, void* pidl, void* ppbc, void* riid, void* ppv, void* ppidllast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToFolderIDListParentEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psfroot, pidl, ppbc, riid, ppv, ppidllast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psfroot;
    (void)pidl;
    (void)ppbc;
    (void)riid;
    (void)ppv;
    (void)ppidllast;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHBindToObject(void* psf, void* pidl, void* pbc, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psf, pidl, pbc, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psf;
    (void)pidl;
    (void)pbc;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHBindToParent(void* pidl, void* riid, void* ppv, void* ppidllast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, riid, ppv, ppidllast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)riid;
    (void)ppv;
    (void)ppidllast;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_sHBrowseForFolderA(void* lpbi) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBrowseForFolderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbi);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpbi;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_sHBrowseForFolderW(void* lpbi) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBrowseForFolderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbi);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpbi;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCLSIDFromString(void* psz, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCLSIDFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_shchangeNotificationLock(void* hchange, uint32_t dwprocid, void* pppidl, void* plevent) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotification_Lock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, dwprocid, pppidl, plevent);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hchange;
    (void)dwprocid;
    (void)pppidl;
    (void)plevent;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shchangeNotificationUnlock(void* hlock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotification_Unlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlock;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_sHChangeNotify(int32_t weventid, uint32_t uflags, void* dwitem1, void* dwitem2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(weventid, uflags, dwitem1, dwitem2);
        return;
    }
    errno = ENOSYS;
#else
    (void)weventid;
    (void)uflags;
    (void)dwitem1;
    (void)dwitem2;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHChangeNotifyDeregister(uint32_t ulid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotifyDeregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHChangeNotifyRegister(void* hwnd, int32_t fsources, int32_t fevents, uint32_t wmsg, int32_t centries, void* pshcne) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotifyRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, fsources, fevents, wmsg, centries, pshcne);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)fsources;
    (void)fevents;
    (void)wmsg;
    (void)centries;
    (void)pshcne;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_ui_shell_sHChangeNotifyRegisterThread(int32_t status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotifyRegisterThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_shell_sHCloneSpecialIDList(void* hwnd, int32_t csidl, int32_t fcreate) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCloneSpecialIDList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, fcreate);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)csidl;
    (void)fcreate;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCoCreateInstance(void* pszclsid, void* pclsid, void* punkouter, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCoCreateInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszclsid, pclsid, punkouter, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszclsid;
    (void)pclsid;
    (void)punkouter;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHCopyKeyA(void* hkeysrc, void* pszsrcsubkey, void* hkeydest, uint32_t freserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCopyKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeysrc, pszsrcsubkey, hkeydest, freserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeysrc;
    (void)pszsrcsubkey;
    (void)hkeydest;
    (void)freserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHCopyKeyW(void* hkeysrc, void* pszsrcsubkey, void* hkeydest, uint32_t freserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCopyKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeysrc, pszsrcsubkey, hkeydest, freserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeysrc;
    (void)pszsrcsubkey;
    (void)hkeydest;
    (void)freserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateAssociationRegistration(void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateAssociationRegistration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDataObject(void* pidlfolder, uint32_t cidl, void* apidl, void* pdtinner, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDataObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlfolder, cidl, apidl, pdtinner, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlfolder;
    (void)cidl;
    (void)apidl;
    (void)pdtinner;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDefaultContextMenu(void* pdcm, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDefaultContextMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdcm, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdcm;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDefaultExtractIcon(void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDefaultExtractIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDefaultPropertiesOp(void* psi, void* ppfileop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDefaultPropertiesOp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psi, ppfileop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psi;
    (void)ppfileop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDirectory(void* hwnd, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDirectoryExA(void* hwnd, void* pszpath, void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDirectoryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszpath, psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateDirectoryExW(void* hwnd, void* pszpath, void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDirectoryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszpath, psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateFileExtractIconW(void* pszfile, uint32_t dwfileattributes, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateFileExtractIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, dwfileattributes, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)dwfileattributes;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateItemFromIDList(void* pidl, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemFromIDList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateItemFromParsingName(void* pszpath, void* pbc, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemFromParsingName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pbc, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pbc;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateItemFromRelativeName(void* psiparent, void* pszname, void* pbc, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemFromRelativeName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psiparent, pszname, pbc, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psiparent;
    (void)pszname;
    (void)pbc;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateItemInKnownFolder(void* kfid, uint32_t dwkfflags, void* pszitem, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemInKnownFolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(kfid, dwkfflags, pszitem, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)kfid;
    (void)dwkfflags;
    (void)pszitem;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateItemWithParent(void* pidlparent, void* psfparent, void* pidl, void* riid, void* ppvitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemWithParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlparent, psfparent, pidl, riid, ppvitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlparent;
    (void)psfparent;
    (void)pidl;
    (void)riid;
    (void)ppvitem;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_sHCreateMemStream(void* pinit, uint32_t cbinit) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateMemStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinit, cbinit);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pinit;
    (void)cbinit;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateProcessAsUserW(void* pscpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateProcessAsUserW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pscpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pscpi;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_sHCreatePropSheetExtArray(void* hkey, void* pszsubkey, uint32_t max_iface) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreatePropSheetExtArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, max_iface);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)max_iface;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateQueryCancelAutoPlayMoniker(void* ppmoniker) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateQueryCancelAutoPlayMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppmoniker);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppmoniker;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellFolderView(void* pcsfv, void* ppsv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellFolderView");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcsfv, ppsv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcsfv;
    (void)ppsv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellFolderViewEx(void* pcsfv, void* ppsv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellFolderViewEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcsfv, ppsv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcsfv;
    (void)ppsv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellItem(void* pidlparent, void* psfparent, void* pidl, void* ppsi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlparent, psfparent, pidl, ppsi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlparent;
    (void)psfparent;
    (void)pidl;
    (void)ppsi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellItemArray(void* pidlparent, void* psf, uint32_t cidl, void* ppidl, void* ppsiitemarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlparent, psf, cidl, ppidl, ppsiitemarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlparent;
    (void)psf;
    (void)cidl;
    (void)ppidl;
    (void)ppsiitemarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromDataObject(void* pdo, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArrayFromDataObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdo;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromIDLists(uint32_t cidl, void* rgpidl, void* ppsiitemarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArrayFromIDLists");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cidl, rgpidl, ppsiitemarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cidl;
    (void)rgpidl;
    (void)ppsiitemarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromShellItem(void* psi, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArrayFromShellItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psi, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psi;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_sHCreateShellPalette(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateStdEnumFmtEtc(uint32_t cfmt, void* afmt, void* ppenumformatetc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStdEnumFmtEtc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cfmt, afmt, ppenumformatetc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cfmt;
    (void)afmt;
    (void)ppenumformatetc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateStreamOnFileA(void* pszfile, uint32_t grfmode, void* ppstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStreamOnFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, grfmode, ppstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)grfmode;
    (void)ppstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateStreamOnFileEx(void* pszfile, uint32_t grfmode, uint32_t dwattributes, int32_t fcreate, void* pstmtemplate, void* ppstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStreamOnFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, grfmode, dwattributes, fcreate, pstmtemplate, ppstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)grfmode;
    (void)dwattributes;
    (void)fcreate;
    (void)pstmtemplate;
    (void)ppstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateStreamOnFileW(void* pszfile, uint32_t grfmode, void* ppstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStreamOnFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile, grfmode, ppstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfile;
    (void)grfmode;
    (void)ppstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateThread(void* pfnthreadproc, void* pdata, uint32_t flags, void* pfncallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfnthreadproc, pdata, flags, pfncallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfnthreadproc;
    (void)pdata;
    (void)flags;
    (void)pfncallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateThreadRef(void* pcref, void* ppunk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateThreadRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcref, ppunk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcref;
    (void)ppunk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHCreateThreadWithHandle(void* pfnthreadproc, void* pdata, uint32_t flags, void* pfncallback, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateThreadWithHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfnthreadproc, pdata, flags, pfncallback, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfnthreadproc;
    (void)pdata;
    (void)flags;
    (void)pfncallback;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHDefExtractIconA(void* psziconfile, int32_t iindex, uint32_t uflags, void* phiconlarge, void* phiconsmall, uint32_t niconsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDefExtractIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconfile, iindex, uflags, phiconlarge, phiconsmall, niconsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconfile;
    (void)iindex;
    (void)uflags;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)niconsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHDefExtractIconW(void* psziconfile, int32_t iindex, uint32_t uflags, void* phiconlarge, void* phiconsmall, uint32_t niconsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDefExtractIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconfile, iindex, uflags, phiconlarge, phiconsmall, niconsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconfile;
    (void)iindex;
    (void)uflags;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)niconsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyA(void* hkey, void* pszsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteEmptyKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyW(void* hkey, void* pszsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteEmptyKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHDeleteKeyA(void* hkey, void* pszsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHDeleteKeyW(void* hkey, void* pszsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHDeleteValueA(void* hkey, void* pszsubkey, void* pszvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHDeleteValueW(void* hkey, void* pszsubkey, void* pszvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_ui_shell_sHDestroyPropSheetExtArray(void* hpsxa) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDestroyPropSheetExtArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hpsxa);
        return;
    }
    errno = ENOSYS;
#else
    (void)hpsxa;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHDoDragDrop(void* hwnd, void* pdata, void* pdsrc, uint32_t dweffect, void* pdweffect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDoDragDrop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pdata, pdsrc, dweffect, pdweffect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pdata;
    (void)pdsrc;
    (void)dweffect;
    (void)pdweffect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHEmptyRecycleBinA(void* hwnd, void* pszrootpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEmptyRecycleBinA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszrootpath, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszrootpath;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHEmptyRecycleBinW(void* hwnd, void* pszrootpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEmptyRecycleBinW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszrootpath, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszrootpath;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHEnumKeyExA(void* hkey, uint32_t dwindex, void* pszname, void* pcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, pszname, pcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszname;
    (void)pcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHEnumKeyExW(void* hkey, uint32_t dwindex, void* pszname, void* pcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, pszname, pcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszname;
    (void)pcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHEnumValueA(void* hkey, uint32_t dwindex, void* pszvaluename, void* pcchvaluename, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHEnumValueW(void* hkey, uint32_t dwindex, void* pszvaluename, void* pcchvaluename, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHEnumerateUnreadMailAccountsW(void* hkeyuser, uint32_t dwindex, void* pszmailaddress, int32_t cchmailaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumerateUnreadMailAccountsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyuser, dwindex, pszmailaddress, cchmailaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkeyuser;
    (void)dwindex;
    (void)pszmailaddress;
    (void)cchmailaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHEvaluateSystemCommandTemplate(void* pszcmdtemplate, void* ppszapplication, void* ppszcommandline, void* ppszparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEvaluateSystemCommandTemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcmdtemplate, ppszapplication, ppszcommandline, ppszparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcmdtemplate;
    (void)ppszapplication;
    (void)ppszcommandline;
    (void)ppszparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHFileOperationA(void* lpfileop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFileOperationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfileop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfileop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHFileOperationW(void* lpfileop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFileOperationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfileop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfileop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHFindFiles(void* pidlfolder, void* pidlsavefile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFindFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlfolder, pidlsavefile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlfolder;
    (void)pidlsavefile;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_shfindInitMenuPopup(void* hmenu, void* hwndowner, uint32_t idcmdfirst, uint32_t idcmdlast) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFind_InitMenuPopup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, hwndowner, idcmdfirst, idcmdlast);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmenu;
    (void)hwndowner;
    (void)idcmdfirst;
    (void)idcmdlast;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_ui_shell_sHFlushSFCache(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFlushSFCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHFormatDateTimeA(void* pft, void* pdwflags, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFormatDateTimeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pft, pdwflags, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pft;
    (void)pdwflags;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHFormatDateTimeW(void* pft, void* pdwflags, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFormatDateTimeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pft, pdwflags, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pft;
    (void)pdwflags;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHFormatDrive(void* hwnd, uint32_t drive, uint32_t fmtid, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFormatDrive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, drive, fmtid, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)drive;
    (void)fmtid;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_ui_shell_sHFree(void* pv) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFree");
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

void windowssys_windows_win32_ui_shell_sHFreeNameMappings(void* hnamemappings) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFreeNameMappings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hnamemappings);
        return;
    }
    errno = ENOSYS;
#else
    (void)hnamemappings;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHFreeShared(void* hdata, uint32_t dwprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFreeShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata, dwprocessid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdata;
    (void)dwprocessid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetAttributesFromDataObject(void* pdo, uint32_t dwattributemask, void* pdwattributes, void* pcitems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetAttributesFromDataObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, dwattributemask, pdwattributes, pcitems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdo;
    (void)dwattributemask;
    (void)pdwattributes;
    (void)pcitems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetDataFromIDListA(void* psf, void* pidl, int32_t nformat, void* pv, int32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDataFromIDListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psf, pidl, nformat, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psf;
    (void)pidl;
    (void)nformat;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetDataFromIDListW(void* psf, void* pidl, int32_t nformat, void* pv, int32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDataFromIDListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psf, pidl, nformat, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psf;
    (void)pidl;
    (void)nformat;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetDesktopFolder(void* ppshf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDesktopFolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppshf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppshf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExA(void* pszdirectoryname, void* pulfreebytesavailabletocaller, void* pultotalnumberofbytes, void* pultotalnumberoffreebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDiskFreeSpaceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdirectoryname, pulfreebytesavailabletocaller, pultotalnumberofbytes, pultotalnumberoffreebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdirectoryname;
    (void)pulfreebytesavailabletocaller;
    (void)pultotalnumberofbytes;
    (void)pultotalnumberoffreebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExW(void* pszdirectoryname, void* pulfreebytesavailabletocaller, void* pultotalnumberofbytes, void* pultotalnumberoffreebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDiskFreeSpaceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdirectoryname, pulfreebytesavailabletocaller, pultotalnumberofbytes, pultotalnumberoffreebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdirectoryname;
    (void)pulfreebytesavailabletocaller;
    (void)pultotalnumberofbytes;
    (void)pultotalnumberoffreebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetDriveMedia(void* pszdrive, void* pdwmediacontent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDriveMedia");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdrive, pdwmediacontent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdrive;
    (void)pdwmediacontent;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_ui_shell_sHGetFileInfoA(void* pszpath, uint32_t dwfileattributes, void* psfi, uint32_t cbfileinfo, uint32_t uflags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFileInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, dwfileattributes, psfi, cbfileinfo, uflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszpath;
    (void)dwfileattributes;
    (void)psfi;
    (void)cbfileinfo;
    (void)uflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_ui_shell_sHGetFileInfoW(void* pszpath, uint32_t dwfileattributes, void* psfi, uint32_t cbfileinfo, uint32_t uflags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFileInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, dwfileattributes, psfi, cbfileinfo, uflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszpath;
    (void)dwfileattributes;
    (void)psfi;
    (void)cbfileinfo;
    (void)uflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetFolderLocation(void* hwnd, int32_t csidl, void* htoken, uint32_t dwflags, void* ppidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, htoken, dwflags, ppidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)ppidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetFolderPathA(void* hwnd, int32_t csidl, void* htoken, uint32_t dwflags, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, htoken, dwflags, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirA(void* hwnd, int32_t csidl, void* htoken, uint32_t dwflags, void* pszsubdir, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathAndSubDirA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, htoken, dwflags, pszsubdir, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszsubdir;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirW(void* hwnd, int32_t csidl, void* htoken, uint32_t dwflags, void* pszsubdir, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathAndSubDirW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, htoken, dwflags, pszsubdir, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszsubdir;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetFolderPathW(void* hwnd, int32_t csidl, void* htoken, uint32_t dwflags, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, htoken, dwflags, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetIDListFromObject(void* punk, void* ppidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetIDListFromObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, ppidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)ppidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexA(void* psziconpath, int32_t iiconindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetIconOverlayIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconpath, iiconindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexW(void* psziconpath, int32_t iiconindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetIconOverlayIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconpath, iiconindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetImageList(int32_t iimagelist, void* riid, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetImageList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iimagelist, riid, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iimagelist;
    (void)riid;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetInstanceExplorer(void* ppunk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetInstanceExplorer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppunk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppunk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetInverseCMAP(void* pbmap, uint32_t cbmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetInverseCMAP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbmap, cbmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbmap;
    (void)cbmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetItemFromDataObject(void* pdtobj, int32_t dwflags, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetItemFromDataObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdtobj, dwflags, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdtobj;
    (void)dwflags;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetItemFromObject(void* punk, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetItemFromObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetKnownFolderIDList(void* rfid, uint32_t dwflags, void* htoken, void* ppidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetKnownFolderIDList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rfid, dwflags, htoken, ppidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rfid;
    (void)dwflags;
    (void)htoken;
    (void)ppidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetKnownFolderItem(void* rfid, int32_t flags, void* htoken, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetKnownFolderItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rfid, flags, htoken, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rfid;
    (void)flags;
    (void)htoken;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetKnownFolderPath(void* rfid, uint32_t dwflags, void* htoken, void* ppszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetKnownFolderPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rfid, dwflags, htoken, ppszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rfid;
    (void)dwflags;
    (void)htoken;
    (void)ppszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetLocalizedName(void* pszpath, void* pszresmodule, uint32_t cch, void* pidsres) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetLocalizedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszresmodule, cch, pidsres);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszresmodule;
    (void)cch;
    (void)pidsres;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetMalloc(void* ppmalloc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetMalloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppmalloc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppmalloc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetNameFromIDList(void* pidl, int32_t sigdnname, void* ppszname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetNameFromIDList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, sigdnname, ppszname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)sigdnname;
    (void)ppszname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetNewLinkInfoA(void* pszlinkto, void* pszdir, void* pszname, void* pfmustcopy, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetNewLinkInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlinkto, pszdir, pszname, pfmustcopy, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlinkto;
    (void)pszdir;
    (void)pszname;
    (void)pfmustcopy;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetNewLinkInfoW(void* pszlinkto, void* pszdir, void* pszname, void* pfmustcopy, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetNewLinkInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlinkto, pszdir, pszname, pfmustcopy, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlinkto;
    (void)pszdir;
    (void)pszname;
    (void)pfmustcopy;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetPathFromIDListA(void* pidl, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPathFromIDListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetPathFromIDListEx(void* pidl, void* pszpath, uint32_t cchpath, uint32_t uopts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPathFromIDListEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, pszpath, cchpath, uopts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)pszpath;
    (void)cchpath;
    (void)uopts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetPathFromIDListW(void* pidl, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPathFromIDListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetRealIDL(void* psf, void* pidlsimple, void* ppidlreal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetRealIDL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psf, pidlsimple, ppidlreal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psf;
    (void)pidlsimple;
    (void)ppidlreal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetSetFolderCustomSettings(void* pfcs, void* pszpath, uint32_t dwreadwrite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSetFolderCustomSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfcs, pszpath, dwreadwrite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfcs;
    (void)pszpath;
    (void)dwreadwrite;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_sHGetSetSettings(void* lpss, uint32_t dwmask, int32_t bset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSetSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpss, dwmask, bset);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpss;
    (void)dwmask;
    (void)bset;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_sHGetSettings(void* psfs, uint32_t dwmask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(psfs, dwmask);
        return;
    }
    errno = ENOSYS;
#else
    (void)psfs;
    (void)dwmask;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetSpecialFolderLocation(void* hwnd, int32_t csidl, void* ppidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSpecialFolderLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, csidl, ppidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)ppidl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathA(void* hwnd, void* pszpath, int32_t csidl, int32_t fcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSpecialFolderPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszpath, csidl, fcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)csidl;
    (void)fcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathW(void* hwnd, void* pszpath, int32_t csidl, int32_t fcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSpecialFolderPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszpath, csidl, fcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)csidl;
    (void)fcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetStockIconInfo(int32_t siid, uint32_t uflags, void* psii) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetStockIconInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(siid, uflags, psii);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)siid;
    (void)uflags;
    (void)psii;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetTemporaryPropertyForItem(void* psi, void* propkey, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetTemporaryPropertyForItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psi, propkey, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psi;
    (void)propkey;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetThreadRef(void* ppunk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetThreadRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppunk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppunk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetUnreadMailCountW(void* hkeyuser, void* pszmailaddress, void* pdwcount, void* pfiletime, void* pszshellexecutecommand, int32_t cchshellexecutecommand) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetUnreadMailCountW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyuser, pszmailaddress, pdwcount, pfiletime, pszshellexecutecommand, cchshellexecutecommand);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkeyuser;
    (void)pszmailaddress;
    (void)pdwcount;
    (void)pfiletime;
    (void)pszshellexecutecommand;
    (void)cchshellexecutecommand;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHGetValueA(void* hkey, void* pszsubkey, void* pszvalue, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHGetValueW(void* hkey, void* pszsubkey, void* pszvalue, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGetViewStatePropertyBag(void* pidl, void* pszbagname, uint32_t dwflags, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetViewStatePropertyBag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, pszbagname, dwflags, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)pszbagname;
    (void)dwflags;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGlobalCounterDecrement(int32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGlobalCounterDecrement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGlobalCounterGetValue(int32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGlobalCounterGetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHGlobalCounterIncrement(int32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGlobalCounterIncrement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHHandleUpdateImage(void* pidlextra) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHHandleUpdateImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlextra);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlextra;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHILCreateFromPath(void* pszpath, void* ppidl, void* rgfinout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHILCreateFromPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, ppidl, rgfinout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)ppidl;
    (void)rgfinout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHInvokePrinterCommandA(void* hwnd, uint32_t uaction, void* lpbuf1, void* lpbuf2, int32_t fmodal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHInvokePrinterCommandA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, uaction, lpbuf1, lpbuf2, fmodal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)uaction;
    (void)lpbuf1;
    (void)lpbuf2;
    (void)fmodal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHInvokePrinterCommandW(void* hwnd, uint32_t uaction, void* lpbuf1, void* lpbuf2, int32_t fmodal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHInvokePrinterCommandW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, uaction, lpbuf1, lpbuf2, fmodal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)uaction;
    (void)lpbuf1;
    (void)lpbuf2;
    (void)fmodal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHIsFileAvailableOffline(void* pwszpath, void* pdwstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHIsFileAvailableOffline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszpath, pdwstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszpath;
    (void)pdwstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHIsLowMemoryMachine(uint32_t dwtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHIsLowMemoryMachine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHLimitInputEdit(void* hwndedit, void* psf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLimitInputEdit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndedit, psf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndedit;
    (void)psf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHLoadInProc(void* rclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLoadInProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHLoadIndirectString(void* pszsource, void* pszoutbuf, uint32_t cchoutbuf, void* ppvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLoadIndirectString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsource, pszoutbuf, cchoutbuf, ppvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsource;
    (void)pszoutbuf;
    (void)cchoutbuf;
    (void)ppvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHLoadNonloadedIconOverlayIdentifiers(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLoadNonloadedIconOverlayIdentifiers");
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

void* windowssys_windows_win32_ui_shell_sHLockShared(void* hdata, uint32_t dwprocessid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata, dwprocessid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdata;
    (void)dwprocessid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHMapPIDLToSystemImageListIndex(void* pshf, void* pidl, void* piindexsel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMapPIDLToSystemImageListIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pshf, pidl, piindexsel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pshf;
    (void)pidl;
    (void)piindexsel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHMessageBoxCheckA(void* hwnd, void* psztext, void* pszcaption, uint32_t utype, int32_t idefault, void* pszregval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMessageBoxCheckA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztext, pszcaption, utype, idefault, pszregval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztext;
    (void)pszcaption;
    (void)utype;
    (void)idefault;
    (void)pszregval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHMessageBoxCheckW(void* hwnd, void* psztext, void* pszcaption, uint32_t utype, int32_t idefault, void* pszregval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMessageBoxCheckW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztext, pszcaption, utype, idefault, pszregval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztext;
    (void)pszcaption;
    (void)utype;
    (void)idefault;
    (void)pszregval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHMultiFileProperties(void* pdtobj, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMultiFileProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdtobj, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdtobj;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHObjectProperties(void* hwnd, uint32_t shopobjecttype, void* pszobjectname, void* pszpropertypage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHObjectProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, shopobjecttype, pszobjectname, pszpropertypage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)shopobjecttype;
    (void)pszobjectname;
    (void)pszpropertypage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHOpenFolderAndSelectItems(void* pidlfolder, uint32_t cidl, void* apidl, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenFolderAndSelectItems");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidlfolder, cidl, apidl, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidlfolder;
    (void)cidl;
    (void)apidl;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHOpenPropSheetW(void* pszcaption, void* ahkeys, uint32_t ckeys, void* pclsiddefault, void* pdtobj, void* psb, void* pstartpage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenPropSheetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcaption, ahkeys, ckeys, pclsiddefault, pdtobj, psb, pstartpage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcaption;
    (void)ahkeys;
    (void)ckeys;
    (void)pclsiddefault;
    (void)pdtobj;
    (void)psb;
    (void)pstartpage;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_sHOpenRegStream2A(void* hkey, void* pszsubkey, void* pszvalue, uint32_t grfmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStream2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, grfmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_sHOpenRegStream2W(void* hkey, void* pszsubkey, void* pszvalue, uint32_t grfmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStream2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, grfmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_sHOpenRegStreamA(void* hkey, void* pszsubkey, void* pszvalue, uint32_t grfmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, grfmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_sHOpenRegStreamW(void* hkey, void* pszsubkey, void* pszvalue, uint32_t grfmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, grfmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHOpenWithDialog(void* hwndparent, void* poainfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenWithDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, poainfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)poainfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHParseDisplayName(void* pszname, void* pbc, void* ppidl, uint32_t sfgaoin, void* psfgaoout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHParseDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, pbc, ppidl, sfgaoin, psfgaoout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)pbc;
    (void)ppidl;
    (void)sfgaoin;
    (void)psfgaoout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHPathPrepareForWriteA(void* hwnd, void* punkenablemodless, void* pszpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPathPrepareForWriteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, punkenablemodless, pszpath, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)punkenablemodless;
    (void)pszpath;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHPathPrepareForWriteW(void* hwnd, void* punkenablemodless, void* pszpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPathPrepareForWriteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, punkenablemodless, pszpath, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)punkenablemodless;
    (void)pszpath;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHQueryInfoKeyA(void* hkey, void* pcsubkeys, void* pcchmaxsubkeylen, void* pcvalues, void* pcchmaxvaluenamelen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryInfoKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHQueryInfoKeyW(void* hkey, void* pcsubkeys, void* pcchmaxsubkeylen, void* pcvalues, void* pcchmaxvaluenamelen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryInfoKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHQueryRecycleBinA(void* pszrootpath, void* pshqueryrbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryRecycleBinA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrootpath, pshqueryrbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszrootpath;
    (void)pshqueryrbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHQueryRecycleBinW(void* pszrootpath, void* pshqueryrbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryRecycleBinW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrootpath, pshqueryrbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszrootpath;
    (void)pshqueryrbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHQueryUserNotificationState(void* pquns) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryUserNotificationState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pquns);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pquns;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHQueryValueExA(void* hkey, void* pszvalue, void* pdwreserved, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryValueExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszvalue, pdwreserved, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pdwreserved;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHQueryValueExW(void* hkey, void* pszvalue, void* pdwreserved, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryValueExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszvalue, pdwreserved, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pdwreserved;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegCloseUSKey(int64_t huskey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegCloseUSKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegCreateUSKeyA(void* pszpath, uint32_t samdesired, int64_t hrelativeuskey, void* phnewuskey, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegCreateUSKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, samdesired, hrelativeuskey, phnewuskey, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegCreateUSKeyW(void* pwzpath, uint32_t samdesired, int64_t hrelativeuskey, void* phnewuskey, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegCreateUSKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzpath, samdesired, hrelativeuskey, phnewuskey, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwzpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyA(int64_t huskey, void* pszsubkey, int32_t delregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteEmptyUSKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pszsubkey, delregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pszsubkey;
    (void)delregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyW(int64_t huskey, void* pwzsubkey, int32_t delregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteEmptyUSKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pwzsubkey, delregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pwzsubkey;
    (void)delregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegDeleteUSValueA(int64_t huskey, void* pszvalue, int32_t delregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pszvalue, delregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)delregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegDeleteUSValueW(int64_t huskey, void* pwzvalue, int32_t delregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pwzvalue, delregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pwzvalue;
    (void)delregflags;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_shell_sHRegDuplicateHKey(void* hkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDuplicateHKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkey;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegEnumUSKeyA(int64_t huskey, uint32_t dwindex, void* pszname, void* pcchname, int32_t enumregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, dwindex, pszname, pcchname, enumregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pszname;
    (void)pcchname;
    (void)enumregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegEnumUSKeyW(int64_t huskey, uint32_t dwindex, void* pwzname, void* pcchname, int32_t enumregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, dwindex, pwzname, pcchname, enumregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pwzname;
    (void)pcchname;
    (void)enumregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegEnumUSValueA(int64_t huskey, uint32_t dwindex, void* pszvaluename, void* pcchvaluename, void* pdwtype, void* pvdata, void* pcbdata, int32_t enumregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, dwindex, pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata, enumregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)enumregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegEnumUSValueW(int64_t huskey, uint32_t dwindex, void* pszvaluename, void* pcchvaluename, void* pdwtype, void* pvdata, void* pcbdata, int32_t enumregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, dwindex, pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata, enumregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)enumregflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueA(void* pszsubkey, void* pszvalue, int32_t fignorehkcu, int32_t fdefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetBoolUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsubkey, pszvalue, fignorehkcu, fdefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)fignorehkcu;
    (void)fdefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueW(void* pszsubkey, void* pszvalue, int32_t fignorehkcu, int32_t fdefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetBoolUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsubkey, pszvalue, fignorehkcu, fdefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)fignorehkcu;
    (void)fdefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHRegGetIntW(void* hk, void* pwzkey, int32_t idefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetIntW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hk, pwzkey, idefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hk;
    (void)pwzkey;
    (void)idefault;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetPathA(void* hkey, void* pcszsubkey, void* pcszvalue, void* pszpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pcszsubkey, pcszvalue, pszpath, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pszpath;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetPathW(void* hkey, void* pcszsubkey, void* pcszvalue, void* pszpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pcszsubkey, pcszvalue, pszpath, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pszpath;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetUSValueA(void* pszsubkey, void* pszvalue, void* pdwtype, void* pvdata, void* pcbdata, int32_t fignorehkcu, void* pvdefaultdata, uint32_t dwdefaultdatasize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsubkey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetUSValueW(void* pszsubkey, void* pszvalue, void* pdwtype, void* pvdata, void* pcbdata, int32_t fignorehkcu, void* pvdefaultdata, uint32_t dwdefaultdatasize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsubkey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetValueA(void* hkey, void* pszsubkey, void* pszvalue, int32_t srrfflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, srrfflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)srrfflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetValueFromHKCUHKLM(void* pwszkey, void* pwszvalue, int32_t srrfflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetValueFromHKCUHKLM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszkey, pwszvalue, srrfflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszkey;
    (void)pwszvalue;
    (void)srrfflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegGetValueW(void* hkey, void* pszsubkey, void* pszvalue, int32_t srrfflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, srrfflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)srrfflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegOpenUSKeyA(void* pszpath, uint32_t samdesired, int64_t hrelativeuskey, void* phnewuskey, int32_t fignorehkcu) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegOpenUSKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, samdesired, hrelativeuskey, phnewuskey, fignorehkcu);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)fignorehkcu;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegOpenUSKeyW(void* pwzpath, uint32_t samdesired, int64_t hrelativeuskey, void* phnewuskey, int32_t fignorehkcu) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegOpenUSKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzpath, samdesired, hrelativeuskey, phnewuskey, fignorehkcu);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwzpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)fignorehkcu;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyA(int64_t huskey, void* pcsubkeys, void* pcchmaxsubkeylen, void* pcvalues, void* pcchmaxvaluenamelen, int32_t enumregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryInfoUSKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen, enumregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    (void)enumregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyW(int64_t huskey, void* pcsubkeys, void* pcchmaxsubkeylen, void* pcvalues, void* pcchmaxvaluenamelen, int32_t enumregflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryInfoUSKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen, enumregflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    (void)enumregflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegQueryUSValueA(int64_t huskey, void* pszvalue, void* pdwtype, void* pvdata, void* pcbdata, int32_t fignorehkcu, void* pvdefaultdata, uint32_t dwdefaultdatasize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegQueryUSValueW(int64_t huskey, void* pszvalue, void* pdwtype, void* pvdata, void* pcbdata, int32_t fignorehkcu, void* pvdefaultdata, uint32_t dwdefaultdatasize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegSetPathA(void* hkey, void* pcszsubkey, void* pcszvalue, void* pcszpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pcszsubkey, pcszvalue, pcszpath, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pcszpath;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegSetPathW(void* hkey, void* pcszsubkey, void* pcszvalue, void* pcszpath, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pcszsubkey, pcszvalue, pcszpath, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pcszpath;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegSetUSValueA(void* pszsubkey, void* pszvalue, uint32_t dwtype, void* pvdata, uint32_t cbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsubkey, pszvalue, dwtype, pvdata, cbdata, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegSetUSValueW(void* pwzsubkey, void* pwzvalue, uint32_t dwtype, void* pvdata, uint32_t cbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzsubkey, pwzvalue, dwtype, pvdata, cbdata, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwzsubkey;
    (void)pwzvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegWriteUSValueA(int64_t huskey, void* pszvalue, uint32_t dwtype, void* pvdata, uint32_t cbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegWriteUSValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pszvalue, dwtype, pvdata, cbdata, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRegWriteUSValueW(int64_t huskey, void* pwzvalue, uint32_t dwtype, void* pvdata, uint32_t cbdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegWriteUSValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huskey, pwzvalue, dwtype, pvdata, cbdata, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)huskey;
    (void)pwzvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHReleaseThreadRef(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHReleaseThreadRef");
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

int32_t windowssys_windows_win32_ui_shell_sHRemoveLocalizedName(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRemoveLocalizedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHResolveLibrary(void* psilibrary) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHResolveLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psilibrary);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psilibrary;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_sHRestricted(int32_t rest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRestricted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rest;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_ui_shell_sHSendMessageBroadcastA(uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSendMessageBroadcastA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_shell_sHSendMessageBroadcastW(uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSendMessageBroadcastW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetDefaultProperties(void* hwnd, void* psi, uint32_t dwfileopflags, void* pfops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetDefaultProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psi, dwfileopflags, pfops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psi;
    (void)dwfileopflags;
    (void)pfops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetFolderPathA(int32_t csidl, void* htoken, uint32_t dwflags, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetFolderPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csidl, htoken, dwflags, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetFolderPathW(int32_t csidl, void* htoken, uint32_t dwflags, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetFolderPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csidl, htoken, dwflags, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_sHSetInstanceExplorer(void* punk) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetInstanceExplorer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(punk);
        return;
    }
    errno = ENOSYS;
#else
    (void)punk;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetKnownFolderPath(void* rfid, uint32_t dwflags, void* htoken, void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetKnownFolderPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rfid, dwflags, htoken, pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rfid;
    (void)dwflags;
    (void)htoken;
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetLocalizedName(void* pszpath, void* pszresmodule, int32_t idsres) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetLocalizedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszresmodule, idsres);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszresmodule;
    (void)idsres;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetTemporaryPropertyForItem(void* psi, void* propkey, void* propvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetTemporaryPropertyForItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psi, propkey, propvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psi;
    (void)propkey;
    (void)propvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetThreadRef(void* punk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetThreadRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetUnreadMailCountW(void* pszmailaddress, uint32_t dwcount, void* pszshellexecutecommand) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetUnreadMailCountW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszmailaddress, dwcount, pszshellexecutecommand);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszmailaddress;
    (void)dwcount;
    (void)pszshellexecutecommand;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetValueA(void* hkey, void* pszsubkey, void* pszvalue, uint32_t dwtype, void* pvdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, dwtype, pvdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSetValueW(void* hkey, void* pszsubkey, void* pszvalue, uint32_t dwtype, void* pvdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszsubkey, pszvalue, dwtype, pvdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_shell_shshellFolderViewMessage(void* hwndmain, uint32_t umsg, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHShellFolderView_Message");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndmain, umsg, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndmain;
    (void)umsg;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHShowManageLibraryUI(void* psilibrary, void* hwndowner, void* psztitle, void* pszinstruction, int32_t lmdoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHShowManageLibraryUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psilibrary, hwndowner, psztitle, pszinstruction, lmdoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psilibrary;
    (void)hwndowner;
    (void)psztitle;
    (void)pszinstruction;
    (void)lmdoptions;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_sHSimpleIDListFromPath(void* pszpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSimpleIDListFromPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszpath;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHSkipJunction(void* pbc, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSkipJunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHStartNetConnectionDialogW(void* hwnd, void* pszremotename, uint32_t dwtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStartNetConnectionDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszremotename, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszremotename;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHStrDupA(void* psz, void* ppwsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStrDupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, ppwsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)ppwsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHStrDupW(void* psz, void* ppwsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStrDupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, ppwsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)ppwsz;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_ui_shell_sHStripMneumonicA(void* pszmenu) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStripMneumonicA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszmenu;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_ui_shell_sHStripMneumonicW(void* pszmenu) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStripMneumonicW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszmenu);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszmenu;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHTestTokenMembership(void* htoken, uint32_t ulrid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHTestTokenMembership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, ulrid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)ulrid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHUnicodeToAnsi(void* pwszsrc, void* pszdst, int32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUnicodeToAnsi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszsrc, pszdst, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszsrc;
    (void)pszdst;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHUnicodeToUnicode(void* pwzsrc, void* pwzdst, int32_t cwchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUnicodeToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzsrc, pwzdst, cwchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzsrc;
    (void)pwzdst;
    (void)cwchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHUnlockShared(void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUnlockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_sHUpdateImageA(void* pszhashitem, int32_t iindex, uint32_t uflags, int32_t iimageindex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUpdateImageA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszhashitem, iindex, uflags, iimageindex);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszhashitem;
    (void)iindex;
    (void)uflags;
    (void)iimageindex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_sHUpdateImageW(void* pszhashitem, int32_t iindex, uint32_t uflags, int32_t iimageindex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUpdateImageW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszhashitem, iindex, uflags, iimageindex);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszhashitem;
    (void)iindex;
    (void)uflags;
    (void)iimageindex;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_sHValidateUNC(void* hwndowner, void* pszfile, uint32_t fconnect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHValidateUNC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, pszfile, fconnect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)pszfile;
    (void)fconnect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_setCurrentProcessExplicitAppUserModelID(void* appid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentProcessExplicitAppUserModelID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)appid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_setMenuContextHelpId(void* param0, uint32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuContextHelpId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_setWindowContextHelpId(void* param0, uint32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowContextHelpId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_setWindowSubclass(void* hwnd, void* pfnsubclass, uint64_t uidsubclass, uint64_t dwrefdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowSubclass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pfnsubclass, uidsubclass, dwrefdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pfnsubclass;
    (void)uidsubclass;
    (void)dwrefdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellAboutA(void* hwnd, void* szapp, void* szotherstuff, void* hicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellAboutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szapp, szotherstuff, hicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)szapp;
    (void)szotherstuff;
    (void)hicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellAboutW(void* hwnd, void* szapp, void* szotherstuff, void* hicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellAboutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szapp, szotherstuff, hicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)szapp;
    (void)szotherstuff;
    (void)hicon;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_shellExecuteA(void* hwnd, void* lpoperation, void* lpfile, void* lpparameters, void* lpdirectory, int32_t nshowcmd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpoperation, lpfile, lpparameters, lpdirectory, nshowcmd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lpoperation;
    (void)lpfile;
    (void)lpparameters;
    (void)lpdirectory;
    (void)nshowcmd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellExecuteExA(void* pexecinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pexecinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pexecinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellExecuteExW(void* pexecinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pexecinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pexecinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_shellExecuteW(void* hwnd, void* lpoperation, void* lpfile, void* lpparameters, void* lpdirectory, int32_t nshowcmd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpoperation, lpfile, lpparameters, lpdirectory, nshowcmd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lpoperation;
    (void)lpfile;
    (void)lpparameters;
    (void)lpdirectory;
    (void)nshowcmd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellMessageBoxA(void* happinst, void* hwnd, void* lpctext, void* lpctitle, uint32_t fustyle, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellMessageBoxA");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle);
            case 1: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0);
            case 2: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)happinst;
    (void)hwnd;
    (void)lpctext;
    (void)lpctitle;
    (void)fustyle;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellMessageBoxW(void* happinst, void* hwnd, void* lpctext, void* lpctitle, uint32_t fustyle, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellMessageBoxW");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle);
            case 1: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0);
            case 2: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(happinst, hwnd, lpctext, lpctitle, fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)happinst;
    (void)hwnd;
    (void)lpctext;
    (void)lpctitle;
    (void)fustyle;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellGetCachedImageIndex(void* pwsziconpath, int32_t iiconindex, uint32_t uiconflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetCachedImageIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwsziconpath, iiconindex, uiconflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwsziconpath;
    (void)iiconindex;
    (void)uiconflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellGetCachedImageIndexA(void* psziconpath, int32_t iiconindex, uint32_t uiconflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetCachedImageIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconpath, iiconindex, uiconflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    (void)uiconflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellGetCachedImageIndexW(void* psziconpath, int32_t iiconindex, uint32_t uiconflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetCachedImageIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psziconpath, iiconindex, uiconflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    (void)uiconflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellGetImageLists(void* phiml, void* phimlsmall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetImageLists");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phiml, phimlsmall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phiml;
    (void)phimlsmall;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_shellMergeMenus(void* hmdst, void* hmsrc, uint32_t uinsert, uint32_t uidadjust, uint32_t uidadjustmax, uint32_t uflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_MergeMenus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmdst, hmsrc, uinsert, uidadjust, uidadjustmax, uflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmdst;
    (void)hmsrc;
    (void)uinsert;
    (void)uidadjust;
    (void)uidadjustmax;
    (void)uflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellNotifyIconA(uint32_t dwmessage, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_NotifyIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmessage, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmessage;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellNotifyIconGetRect(void* identifier, void* iconlocation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_NotifyIconGetRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(identifier, iconlocation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)identifier;
    (void)iconlocation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_shellNotifyIconW(uint32_t dwmessage, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_NotifyIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmessage, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmessage;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_signalFileOpen(void* pidl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignalFileOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_softwareUpdateMessageBox(void* hwnd, void* pszdistunit, uint32_t dwflags, void* psdi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shdocvw.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SoftwareUpdateMessageBox");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszdistunit, dwflags, psdi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)pszdistunit;
    (void)dwflags;
    (void)psdi;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_shell_stgMakeUniqueName(void* pstgparent, void* pszfilespec, uint32_t grfmode, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgMakeUniqueName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstgparent, pszfilespec, grfmode, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstgparent;
    (void)pszfilespec;
    (void)grfmode;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCSpnA(void* pszstr, void* pszset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr, pszset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr;
    (void)pszset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCSpnIA(void* pszstr, void* pszset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr, pszset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr;
    (void)pszset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCSpnIW(void* pszstr, void* pszset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr, pszset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr;
    (void)pszset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCSpnW(void* pszstr, void* pszset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr, pszset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr;
    (void)pszset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_strCatBuffA(void* pszdest, void* pszsrc, int32_t cchdestbuffsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatBuffA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdest, pszsrc, cchdestbuffsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdest;
    (void)pszsrc;
    (void)cchdestbuffsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strCatBuffW(void* pszdest, void* pszsrc, int32_t cchdestbuffsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatBuffW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdest, pszsrc, cchdestbuffsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdest;
    (void)pszsrc;
    (void)cchdestbuffsize;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_strCatChainW(void* pszdst, uint32_t cchdst, uint32_t ichat, void* pszsrc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatChainW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdst, cchdst, ichat, pszsrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdst;
    (void)cchdst;
    (void)ichat;
    (void)pszsrc;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_shell_strCatW(void* psz1, void* psz2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz1;
    (void)psz2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strChrA(void* pszstart, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strChrIA(void* pszstart, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strChrIW(void* pszstart, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strChrNIW(void* pszstart, uint16_t wmatch, uint32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrNIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, wmatch, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)wmatch;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strChrNW(void* pszstart, uint16_t wmatch, uint32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrNW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, wmatch, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)wmatch;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strChrW(void* pszstart, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpCA(void* pszstr1, void* pszstr2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpCA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpCW(void* pszstr1, void* pszstr2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpCW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpICA(void* pszstr1, void* pszstr2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpICA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpICW(void* pszstr1, void* pszstr2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpICW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpIW(void* psz1, void* psz2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpLogicalW(void* psz1, void* psz2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpLogicalW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNA(void* psz1, void* psz2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNCA(void* pszstr1, void* pszstr2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNCA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNCW(void* pszstr1, void* pszstr2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNCW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNIA(void* psz1, void* psz2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNICA(void* pszstr1, void* pszstr2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNICA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNICW(void* pszstr1, void* pszstr2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNICW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstr1, pszstr2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNIW(void* psz1, void* psz2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpNW(void* psz1, void* psz2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strCmpW(void* psz1, void* psz2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_strCpyNW(void* pszdst, void* pszsrc, int32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCpyNW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdst, pszsrc, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdst;
    (void)pszsrc;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strCpyW(void* psz1, void* psz2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCpyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz1;
    (void)psz2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strDupA(void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrDupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strDupW(void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrDupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strFormatByteSize64A(int64_t qdw, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSize64A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qdw, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strFormatByteSizeA(uint32_t dw, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dw, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dw;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strFormatByteSizeEx(uint64_t ull, int32_t flags, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSizeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ull, flags, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ull;
    (void)flags;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_strFormatByteSizeW(int64_t qdw, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qdw, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strFormatKBSizeA(int64_t qdw, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatKBSizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qdw, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strFormatKBSizeW(int64_t qdw, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatKBSizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qdw, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strFromTimeIntervalA(void* pszout, uint32_t cchmax, uint32_t dwtimems, int32_t digits) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFromTimeIntervalA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszout, cchmax, dwtimems, digits);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszout;
    (void)cchmax;
    (void)dwtimems;
    (void)digits;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strFromTimeIntervalW(void* pszout, uint32_t cchmax, uint32_t dwtimems, int32_t digits) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFromTimeIntervalW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszout, cchmax, dwtimems, digits);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszout;
    (void)cchmax;
    (void)dwtimems;
    (void)digits;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strIsIntlEqualA(int32_t fcasesens, void* pszstring1, void* pszstring2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrIsIntlEqualA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcasesens, pszstring1, pszstring2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcasesens;
    (void)pszstring1;
    (void)pszstring2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strIsIntlEqualW(int32_t fcasesens, void* pszstring1, void* pszstring2, int32_t nchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrIsIntlEqualW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcasesens, pszstring1, pszstring2, nchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcasesens;
    (void)pszstring1;
    (void)pszstring2;
    (void)nchar;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_strNCatA(void* psz1, void* psz2, int32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrNCatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz1;
    (void)psz2;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strNCatW(void* psz1, void* psz2, int32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrNCatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz1;
    (void)psz2;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strPBrkA(void* psz, void* pszset) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrPBrkA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, pszset);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz;
    (void)pszset;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strPBrkW(void* psz, void* pszset) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrPBrkW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, pszset);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz;
    (void)pszset;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strRChrA(void* pszstart, void* pszend, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, pszend, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strRChrIA(void* pszstart, void* pszend, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, pszend, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strRChrIW(void* pszstart, void* pszend, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, pszend, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strRChrW(void* pszstart, void* pszend, uint16_t wmatch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstart, pszend, wmatch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strRStrIA(void* pszsource, void* pszlast, void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRStrIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsource, pszlast, pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszsource;
    (void)pszlast;
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strRStrIW(void* pszsource, void* pszlast, void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRStrIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsource, pszlast, pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszsource;
    (void)pszlast;
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strRetToBSTR(void* pstr, void* pidl, void* pbstr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToBSTR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr, pidl, pbstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstr;
    (void)pidl;
    (void)pbstr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strRetToBufA(void* pstr, void* pidl, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToBufA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr, pidl, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstr;
    (void)pidl;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strRetToBufW(void* pstr, void* pidl, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToBufW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr, pidl, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstr;
    (void)pidl;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strRetToStrA(void* pstr, void* pidl, void* ppsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToStrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr, pidl, ppsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstr;
    (void)pidl;
    (void)ppsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strRetToStrW(void* pstr, void* pidl, void* ppsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToStrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr, pidl, ppsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstr;
    (void)pidl;
    (void)ppsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strSpnA(void* psz, void* pszset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, pszset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)pszset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strSpnW(void* psz, void* pszset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, pszset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)pszset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_strStrA(void* pszfirst, void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfirst, pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strStrIA(void* pszfirst, void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfirst, pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strStrIW(void* pszfirst, void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfirst, pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strStrNIW(void* pszfirst, void* pszsrch, uint32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrNIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfirst, pszsrch, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strStrNW(void* pszfirst, void* pszsrch, uint32_t cchmax) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrNW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfirst, pszsrch, cchmax);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    (void)cchmax;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_strStrW(void* pszfirst, void* pszsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfirst, pszsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strToInt64ExA(void* pszstring, int32_t dwflags, void* pllret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToInt64ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, dwflags, pllret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)pllret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strToInt64ExW(void* pszstring, int32_t dwflags, void* pllret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToInt64ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, dwflags, pllret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)pllret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strToIntA(void* pszsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strToIntExA(void* pszstring, int32_t dwflags, void* piret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, dwflags, piret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)piret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strToIntExW(void* pszstring, int32_t dwflags, void* piret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, dwflags, piret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)piret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strToIntW(void* pszsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strTrimA(void* psz, void* psztrimchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrTrimA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, psztrimchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)psztrimchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_strTrimW(void* psz, void* psztrimchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrTrimW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, psztrimchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)psztrimchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_unloadUserProfile(void* htoken, void* hprofile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadUserProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, hprofile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)hprofile;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_shell_unregisterAppConstrainedChangeNotification(int64_t registration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterAppConstrainedChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(registration);
        return;
    }
    errno = ENOSYS;
#else
    (void)registration;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_shell_unregisterAppStateChangeNotification(int64_t registration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterAppStateChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(registration);
        return;
    }
    errno = ENOSYS;
#else
    (void)registration;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_shell_unregisterScaleChangeEvent(uint64_t dwcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterScaleChangeEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlApplySchemeA(void* pszin, void* pszout, void* pcchout, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlApplySchemeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszin, pszout, pcchout, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlApplySchemeW(void* pszin, void* pszout, void* pcchout, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlApplySchemeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszin, pszout, pcchout, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCanonicalizeA(void* pszurl, void* pszcanonicalized, void* pcchcanonicalized, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCanonicalizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszcanonicalized, pcchcanonicalized, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszcanonicalized;
    (void)pcchcanonicalized;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCanonicalizeW(void* pszurl, void* pszcanonicalized, void* pcchcanonicalized, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCanonicalizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszcanonicalized, pcchcanonicalized, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszcanonicalized;
    (void)pcchcanonicalized;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCombineA(void* pszbase, void* pszrelative, void* pszcombined, void* pcchcombined, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCombineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszbase, pszrelative, pszcombined, pcchcombined, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszbase;
    (void)pszrelative;
    (void)pszcombined;
    (void)pcchcombined;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCombineW(void* pszbase, void* pszrelative, void* pszcombined, void* pcchcombined, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCombineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszbase, pszrelative, pszcombined, pcchcombined, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszbase;
    (void)pszrelative;
    (void)pszcombined;
    (void)pcchcombined;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCompareA(void* psz1, void* psz2, int32_t fignoreslash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCompareA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, fignoreslash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    (void)fignoreslash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCompareW(void* psz1, void* psz2, int32_t fignoreslash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCompareW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz1, psz2, fignoreslash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz1;
    (void)psz2;
    (void)fignoreslash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCreateFromPathA(void* pszpath, void* pszurl, void* pcchurl, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCreateFromPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszurl, pcchurl, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszurl;
    (void)pcchurl;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlCreateFromPathW(void* pszpath, void* pszurl, void* pcchurl, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCreateFromPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pszurl, pcchurl, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pszurl;
    (void)pcchurl;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlEscapeA(void* pszurl, void* pszescaped, void* pcchescaped, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlEscapeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszescaped, pcchescaped, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszescaped;
    (void)pcchescaped;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlEscapeW(void* pszurl, void* pszescaped, void* pcchescaped, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlEscapeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszescaped, pcchescaped, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszescaped;
    (void)pcchescaped;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlFixupW(void* pcszurl, void* psztranslatedurl, uint32_t cchmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlFixupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcszurl, psztranslatedurl, cchmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcszurl;
    (void)psztranslatedurl;
    (void)cchmax;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_urlGetLocationA(void* pszurl) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetLocationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszurl;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_shell_urlGetLocationW(void* pszurl) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetLocationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszurl;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlGetPartA(void* pszin, void* pszout, void* pcchout, uint32_t dwpart, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetPartA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszin, pszout, pcchout, dwpart, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwpart;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlGetPartW(void* pszin, void* pszout, void* pcchout, uint32_t dwpart, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetPartW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszin, pszout, pcchout, dwpart, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwpart;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlHashA(void* pszurl, void* pbhash, uint32_t cbhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlHashA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pbhash, cbhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pbhash;
    (void)cbhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlHashW(void* pszurl, void* pbhash, uint32_t cbhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlHashW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pbhash, cbhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pbhash;
    (void)cbhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlIsA(void* pszurl, int32_t urlis) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, urlis);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)urlis;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlIsNoHistoryA(void* pszurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsNoHistoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlIsNoHistoryW(void* pszurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsNoHistoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlIsOpaqueA(void* pszurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsOpaqueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlIsOpaqueW(void* pszurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsOpaqueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlIsW(void* pszurl, int32_t urlis) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, urlis);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)urlis;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlUnescapeA(void* pszurl, void* pszunescaped, void* pcchunescaped, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlUnescapeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszunescaped, pcchunescaped, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszunescaped;
    (void)pcchunescaped;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_urlUnescapeW(void* pszurl, void* pszunescaped, void* pcchunescaped, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlUnescapeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl, pszunescaped, pcchunescaped, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    (void)pszunescaped;
    (void)pcchunescaped;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_variantToStrRet(void* varin, void* pstrret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStrRet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pstrret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pstrret;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_shell_whichPlatform(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WhichPlatform");
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

int32_t windowssys_windows_win32_ui_shell_win32DeleteFile(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Win32DeleteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_winHelpA(void* hwndmain, void* lpszhelp, uint32_t ucommand, uint64_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHelpA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndmain, lpszhelp, ucommand, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndmain;
    (void)lpszhelp;
    (void)ucommand;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_winHelpW(void* hwndmain, void* lpszhelp, uint32_t ucommand, uint64_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHelpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndmain, lpszhelp, ucommand, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndmain;
    (void)lpszhelp;
    (void)ucommand;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_writeCabinetState(void* pcs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteCabinetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_wnsprintfA(void* pszdest, int32_t cchdest, void* pszfmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wnsprintfA");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(pszdest, cchdest, pszfmt);
            case 1: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0);
            case 2: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_wnsprintfW(void* pszdest, int32_t cchdest, void* pszfmt, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wnsprintfW");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(pszdest, cchdest, pszfmt);
            case 1: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0);
            case 2: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(pszdest, cchdest, pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_wvnsprintfA(void* pszdest, int32_t cchdest, void* pszfmt, void* arglist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvnsprintfA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdest, cchdest, pszfmt, arglist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)arglist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_wvnsprintfW(void* pszdest, int32_t cchdest, void* pszfmt, void* arglist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvnsprintfW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdest, cchdest, pszfmt, arglist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)arglist;
    errno = ENOSYS;
    return -1;
#endif
}

