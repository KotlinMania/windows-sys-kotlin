#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_web_internetexplorer_wrapper.h"
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

int32_t windowssys_windows_win32_web_internetexplorer_ComputeInvCMAP(void* prgbcolors, uint32_t ncolors, void* pinvtable, uint32_t cbtable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComputeInvCMAP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgbcolors, ncolors, pinvtable, cbtable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgbcolors;
    (void)ncolors;
    (void)pinvtable;
    (void)cbtable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_CreateMIMEMap(void* ppmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMIMEMap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_DecodeImage(void* pstream, void* pmap, void* peventsink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstream, pmap, peventsink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstream;
    (void)pmap;
    (void)peventsink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_DecodeImageEx(void* pstream, void* pmap, void* peventsink, void* pszmimetypeparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeImageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstream, pmap, peventsink, pszmimetypeparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstream;
    (void)pmap;
    (void)peventsink;
    (void)pszmimetypeparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_DitherTo8(void* pdestbits, int32_t ndestpitch, void* psrcbits, int32_t nsrcpitch, void* bfidsrc, void* prgbdestcolors, void* prgbsrccolors, void* pbdestinvmap, int32_t x, int32_t y, int32_t cx, int32_t cy, int32_t ldesttrans, int32_t lsrctrans) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*, void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DitherTo8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdestbits, ndestpitch, psrcbits, nsrcpitch, bfidsrc, prgbdestcolors, prgbsrccolors, pbdestinvmap, x, y, cx, cy, ldesttrans, lsrctrans);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdestbits;
    (void)ndestpitch;
    (void)psrcbits;
    (void)nsrcpitch;
    (void)bfidsrc;
    (void)prgbdestcolors;
    (void)prgbsrccolors;
    (void)pbdestinvmap;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)ldesttrans;
    (void)lsrctrans;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_GetMaxMIMEIDBytes(void* pnmaxbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMaxMIMEIDBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnmaxbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pnmaxbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEAssociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEAssociateThreadWithTab");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtabthreadid, dwassociatedthreadid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtabthreadid;
    (void)dwassociatedthreadid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IECancelSaveFile(void* hstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IECancelSaveFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IECreateDirectory(void* lppathname, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IECreateDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_web_internetexplorer_IECreateFile(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IECreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwcreationdisposition, dwflagsandattributes, htemplatefile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEDeleteFile(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEDeleteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEDisassociateThreadWithTab(uint32_t dwtabthreadid, uint32_t dwassociatedthreadid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEDisassociateThreadWithTab");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtabthreadid, dwassociatedthreadid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtabthreadid;
    (void)dwassociatedthreadid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_web_internetexplorer_IEFindFirstFile(void* lpfilename, void* lpfindfiledata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEFindFirstFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfindfiledata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)lpfindfiledata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEGetFileAttributesEx(void* lpfilename, int32_t finfolevelid, void* lpfileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetFileAttributesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEGetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* pcchcookiedata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetProtectedModeCookie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, pcchcookiedata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)pcchcookiedata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEGetWriteableFolderPath(void* clsidfolderid, void* lppwstrpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetWriteableFolderPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsidfolderid, lppwstrpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsidfolderid;
    (void)lppwstrpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEGetWriteableLowHKCU(void* phkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetWriteableLowHKCU");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEInPrivateFilteringEnabled(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEInPrivateFilteringEnabled");
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

int32_t windowssys_windows_win32_web_internetexplorer_IEIsInPrivateBrowsing(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEIsInPrivateBrowsing");
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

int32_t windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeProcess(void* pbresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEIsProtectedModeProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeURL(void* lpwstrurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEIsProtectedModeURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwstrurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwstrurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IELaunchURL(void* lpwstrurl, void* lpprocinfo, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IELaunchURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwstrurl, lpprocinfo, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwstrurl;
    (void)lpprocinfo;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEMoveFileEx(void* lpexistingfilename, void* lpnewfilename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEMoveFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IERefreshElevationPolicy(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERefreshElevationPolicy");
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

int32_t windowssys_windows_win32_web_internetexplorer_IERegCreateKeyEx(void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERegCreateKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IERegSetValueEx(void* lpsubkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERegSetValueEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsubkey, lpvaluename, reserved, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsubkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IERemoveDirectory(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERemoveDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IESaveFile(void* hstate, void* lpwstrsourcefile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IESaveFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstate, lpwstrsourcefile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstate;
    (void)lpwstrsourcefile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IESetProtectedModeCookie(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IESetProtectedModeCookie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEShowOpenFileDialog(void* hwnd, void* lpwstrfilename, uint32_t cchmaxfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* phfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEShowOpenFileDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpwstrfilename, cchmaxfilename, lpwstrinitialdir, lpwstrfilter, lpwstrdefext, dwfilterindex, dwflags, phfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpwstrfilename;
    (void)cchmaxfilename;
    (void)lpwstrinitialdir;
    (void)lpwstrfilter;
    (void)lpwstrdefext;
    (void)dwfilterindex;
    (void)dwflags;
    (void)phfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IEShowSaveFileDialog(void* hwnd, void* lpwstrinitialfilename, void* lpwstrinitialdir, void* lpwstrfilter, void* lpwstrdefext, uint32_t dwfilterindex, uint32_t dwflags, void* lppwstrdestinationfilepath, void* phstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEShowSaveFileDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpwstrinitialfilename, lpwstrinitialdir, lpwstrfilter, lpwstrdefext, dwfilterindex, dwflags, lppwstrdestinationfilepath, phstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpwstrinitialfilename;
    (void)lpwstrinitialdir;
    (void)lpwstrfilter;
    (void)lpwstrdefext;
    (void)dwfilterindex;
    (void)dwflags;
    (void)lppwstrdestinationfilepath;
    (void)phstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_IETrackingProtectionEnabled(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IETrackingProtectionEnabled");
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

int32_t windowssys_windows_win32_web_internetexplorer_IdentifyMIMEType(void* pbbytes, uint32_t nbytes, void* pnformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IdentifyMIMEType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbbytes, nbytes, pnformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbbytes;
    (void)nbytes;
    (void)pnformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, pszusername, pszcontentdescription, pratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pszcontentdescription;
    (void)pratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2(void* hdlg, void* pszusername, void* pratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialog2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, pszusername, pratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2W(void* hdlg, void* pszusername, void* pratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialog2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, pszusername, pratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialogW(void* hdlg, void* pszusername, void* pszcontentdescription, void* pratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, pszusername, pszcontentdescription, pratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pszcontentdescription;
    (void)pratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingAddToApprovedSites(void* hdlg, uint32_t cbpasswordblob, void* pbpasswordblob, void* lpszurl, int32_t falwaysnever, int32_t fsitepage, int32_t fapprovedsitesenforced) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAddToApprovedSites");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, cbpasswordblob, pbpasswordblob, lpszurl, falwaysnever, fsitepage, fapprovedsitesenforced);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)cbpasswordblob;
    (void)pbpasswordblob;
    (void)lpszurl;
    (void)falwaysnever;
    (void)fsitepage;
    (void)fapprovedsitesenforced;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccess(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingCheckUserAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszusername, pszurl, pszratinginfo, pdata, cbdata, ppratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszusername;
    (void)pszurl;
    (void)pszratinginfo;
    (void)pdata;
    (void)cbdata;
    (void)ppratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccessW(void* pszusername, void* pszurl, void* pszratinginfo, void* pdata, uint32_t cbdata, void* ppratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingCheckUserAccessW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszusername, pszurl, pszratinginfo, pdata, cbdata, ppratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszusername;
    (void)pszurl;
    (void)pszratinginfo;
    (void)pdata;
    (void)cbdata;
    (void)ppratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingClickedOnPRFInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingClickedOnPRFInternal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, param1, lpszfilename, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)param1;
    (void)lpszfilename;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingClickedOnRATInternal(void* hwndowner, void* param1, void* lpszfilename, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingClickedOnRATInternal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, param1, lpszfilename, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)param1;
    (void)lpszfilename;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingEnable(void* hwndparent, void* pszusername, int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, pszusername, fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)pszusername;
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingEnableW(void* hwndparent, void* pszusername, int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingEnableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, pszusername, fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)pszusername;
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingEnabledQuery(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingEnabledQuery");
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

int32_t windowssys_windows_win32_web_internetexplorer_RatingFreeDetails(void* pratingdetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingFreeDetails");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pratingdetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pratingdetails;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingInit(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingInit");
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

int32_t windowssys_windows_win32_web_internetexplorer_RatingObtainCancel(void* hratingobtainquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingObtainCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hratingobtainquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hratingobtainquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingObtainQuery(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingObtainQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargeturl, dwuserdata, fcallback, phratingobtainquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psztargeturl;
    (void)dwuserdata;
    (void)fcallback;
    (void)phratingobtainquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingObtainQueryW(void* psztargeturl, uint32_t dwuserdata, int64_t fcallback, void* phratingobtainquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingObtainQueryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargeturl, dwuserdata, fcallback, phratingobtainquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psztargeturl;
    (void)dwuserdata;
    (void)fcallback;
    (void)phratingobtainquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingSetupUI(void* hdlg, void* pszusername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingSetupUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, pszusername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)pszusername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_RatingSetupUIW(void* hdlg, void* pszusername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingSetupUIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, pszusername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)pszusername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_web_internetexplorer_SniffStream(void* pinstream, void* pnformat, void* ppoutstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SniffStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstream, pnformat, ppoutstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstream;
    (void)pnformat;
    (void)ppoutstream;
    errno = ENOSYS;
    return -1;
#endif
}

