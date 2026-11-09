#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_tabletpc_wrapper.h"
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

int32_t windowssys_windows_win32_ui_tabletpc_AddStroke(void* hrc, void* ppacketdesc, uint32_t cbpacket, void* ppacket, void* pxform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddStroke");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, ppacketdesc, cbpacket, ppacket, pxform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)ppacketdesc;
    (void)cbpacket;
    (void)ppacket;
    (void)pxform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_AddWordsToWordList(void* hwl, void* pwcwords) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddWordsToWordList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwl, pwcwords);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwl;
    (void)pwcwords;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_AdviseInkChange(void* hrc, int32_t bnewstroke) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdviseInkChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, bnewstroke);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)bnewstroke;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_CreateContext(void* hrec, void* phrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrec, phrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrec;
    (void)phrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_CreateRecognizer(void* pclsid, void* phrec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRecognizer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pclsid, phrec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pclsid;
    (void)phrec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_DestroyContext(void* hrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_DestroyRecognizer(void* hrec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyRecognizer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_DestroyWordList(void* hwl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyWordList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_EndInkInput(void* hrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndInkInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetAllRecognizers(void* recognizerclsids, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllRecognizers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(recognizerclsids, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)recognizerclsids;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetBestResultString(void* hrc, void* pcsize, void* pwcbestresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestResultString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, pcsize, pwcbestresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)pcsize;
    (void)pwcbestresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetLatticePtr(void* hrc, void* pplattice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLatticePtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, pplattice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)pplattice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetLeftSeparator(void* hrc, void* pcsize, void* pwcleftseparator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLeftSeparator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, pcsize, pwcleftseparator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)pcsize;
    (void)pwcleftseparator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetRecoAttributes(void* hrec, void* precoattrs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRecoAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrec, precoattrs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrec;
    (void)precoattrs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetResultPropertyList(void* hrec, void* ppropertycount, void* ppropertyguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetResultPropertyList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrec, ppropertycount, ppropertyguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrec;
    (void)ppropertycount;
    (void)ppropertyguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetRightSeparator(void* hrc, void* pcsize, void* pwcrightseparator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRightSeparator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, pcsize, pwcrightseparator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)pcsize;
    (void)pwcrightseparator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_GetUnicodeRanges(void* hrec, void* pcranges, void* pcr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnicodeRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrec, pcranges, pcr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrec;
    (void)pcranges;
    (void)pcr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_IsStringSupported(void* hrc, uint32_t wcstring, void* pwcstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsStringSupported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, wcstring, pwcstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)wcstring;
    (void)pwcstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_MakeWordList(void* hrec, void* pbuffer, void* phwl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeWordList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrec, pbuffer, phwl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrec;
    (void)pbuffer;
    (void)phwl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_Process(void* hrc, void* pbpartialprocessing) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, pbpartialprocessing);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)pbpartialprocessing;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_SetEnabledUnicodeRanges(void* hrc, uint32_t cranges, void* pcr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnabledUnicodeRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, cranges, pcr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)cranges;
    (void)pcr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_SetFactoid(void* hrc, uint32_t cwcfactoid, void* pwcfactoid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFactoid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, cwcfactoid, pwcfactoid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)cwcfactoid;
    (void)pwcfactoid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_SetFlags(void* hrc, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_SetGuide(void* hrc, void* pguide, uint32_t iindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGuide");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, pguide, iindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)pguide;
    (void)iindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_SetTextContext(void* hrc, uint32_t cwcbefore, void* pwcbefore, uint32_t cwcafter, void* pwcafter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, cwcbefore, pwcbefore, cwcafter, pwcafter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)cwcbefore;
    (void)pwcbefore;
    (void)cwcafter;
    (void)pwcafter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_tabletpc_SetWordList(void* hrc, void* hwl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWordList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrc, hwl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrc;
    (void)hwl;
    errno = ENOSYS;
    return -1;
#endif
}

