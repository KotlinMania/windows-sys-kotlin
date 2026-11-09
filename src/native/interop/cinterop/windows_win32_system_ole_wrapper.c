#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_ole_wrapper.h"
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

int32_t windowssys_windows_win32_system_ole_BstrFromVector(void* psa, void* pbstr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BstrFromVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, pbstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)pbstr;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_ole_ClearCustData(void* pcustdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearCustData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcustdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcustdata;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_ole_CreateDispTypeInfo(void* pidata, uint32_t lcid, void* pptinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDispTypeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidata, lcid, pptinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidata;
    (void)lcid;
    (void)pptinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_CreateErrorInfo(void* pperrinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateErrorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pperrinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pperrinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_CreateOleAdviseHolder(void* ppoaholder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateOleAdviseHolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppoaholder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppoaholder;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_CreateStdDispatch(void* punkouter, void* pvthis, void* ptinfo, void* ppunkstddisp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdDispatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkouter, pvthis, ptinfo, ppunkstddisp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkouter;
    (void)pvthis;
    (void)ptinfo;
    (void)ppunkstddisp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_CreateTypeLib(int32_t syskind, void* szfile, void* ppctlib) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTypeLib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syskind, szfile, ppctlib);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syskind;
    (void)szfile;
    (void)ppctlib;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_CreateTypeLib2(int32_t syskind, void* szfile, void* ppctlib) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTypeLib2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syskind, szfile, ppctlib);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syskind;
    (void)szfile;
    (void)ppctlib;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_DispCallFunc(void* pvinstance, uint64_t ovft, int32_t cc, uint16_t vtreturn, uint32_t cactuals, void* prgvt, void* prgpvarg, void* pvargresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispCallFunc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvinstance, ovft, cc, vtreturn, cactuals, prgvt, prgpvarg, pvargresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvinstance;
    (void)ovft;
    (void)cc;
    (void)vtreturn;
    (void)cactuals;
    (void)prgvt;
    (void)prgpvarg;
    (void)pvargresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_DispGetIDsOfNames(void* ptinfo, void* rgsznames, uint32_t cnames, void* rgdispid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispGetIDsOfNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptinfo, rgsznames, cnames, rgdispid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptinfo;
    (void)rgsznames;
    (void)cnames;
    (void)rgdispid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_DispGetParam(void* pdispparams, uint32_t position, uint16_t vttarg, void* pvarresult, void* puargerr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispGetParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispparams, position, vttarg, pvarresult, puargerr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispparams;
    (void)position;
    (void)vttarg;
    (void)pvarresult;
    (void)puargerr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_DispInvoke(void* _this, void* ptinfo, int32_t dispidmember, uint16_t wflags, void* pparams, void* pvarresult, void* pexcepinfo, void* puargerr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispInvoke");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(_this, ptinfo, dispidmember, wflags, pparams, pvarresult, pexcepinfo, puargerr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)_this;
    (void)ptinfo;
    (void)dispidmember;
    (void)wflags;
    (void)pparams;
    (void)pvarresult;
    (void)pexcepinfo;
    (void)puargerr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_DoDragDrop(void* pdataobj, void* pdropsource, uint32_t dwokeffects, void* pdweffect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoDragDrop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdataobj, pdropsource, dwokeffects, pdweffect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdataobj;
    (void)pdropsource;
    (void)dwokeffects;
    (void)pdweffect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_GetActiveObject(void* rclsid, void* pvreserved, void* ppunk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, pvreserved, ppunk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)pvreserved;
    (void)ppunk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_GetAltMonthNames(uint32_t lcid, void* prgp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAltMonthNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lcid, prgp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lcid;
    (void)prgp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_GetRecordInfoFromGuids(void* rguidtypelib, uint32_t uvermajor, uint32_t uverminor, uint32_t lcid, void* rguidtypeinfo, void* pprecinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRecordInfoFromGuids");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rguidtypelib, uvermajor, uverminor, lcid, rguidtypeinfo, pprecinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rguidtypelib;
    (void)uvermajor;
    (void)uverminor;
    (void)lcid;
    (void)rguidtypeinfo;
    (void)pprecinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_GetRecordInfoFromTypeInfo(void* ptypeinfo, void* pprecinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRecordInfoFromTypeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptypeinfo, pprecinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptypeinfo;
    (void)pprecinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_ole_HRGN_UserFree(void* param0, void* param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserFree");
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

void windowssys_windows_win32_system_ole_HRGN_UserFree64(void* param0, void* param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserFree64");
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

void* windowssys_windows_win32_system_ole_HRGN_UserMarshal(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserMarshal");
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

void* windowssys_windows_win32_system_ole_HRGN_UserMarshal64(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserMarshal64");
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

uint32_t windowssys_windows_win32_system_ole_HRGN_UserSize(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserSize");
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

uint32_t windowssys_windows_win32_system_ole_HRGN_UserSize64(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserSize64");
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

void* windowssys_windows_win32_system_ole_HRGN_UserUnmarshal(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserUnmarshal");
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

void* windowssys_windows_win32_system_ole_HRGN_UserUnmarshal64(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserUnmarshal64");
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

int32_t windowssys_windows_win32_system_ole_IsAccelerator(void* haccel, int32_t caccelentries, void* lpmsg, void* lpwcmd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAccelerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(haccel, caccelentries, lpmsg, lpwcmd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)haccel;
    (void)caccelentries;
    (void)lpmsg;
    (void)lpwcmd;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_LHashValOfNameSys(int32_t syskind, uint32_t lcid, void* szname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LHashValOfNameSys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syskind, lcid, szname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)syskind;
    (void)lcid;
    (void)szname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_ole_LHashValOfNameSysA(int32_t syskind, uint32_t lcid, void* szname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LHashValOfNameSysA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syskind, lcid, szname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)syskind;
    (void)lcid;
    (void)szname;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_ole_LoadRegTypeLib(void* rguid, uint16_t wvermajor, uint16_t wverminor, uint32_t lcid, void* pptlib) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadRegTypeLib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rguid, wvermajor, wverminor, lcid, pptlib);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rguid;
    (void)wvermajor;
    (void)wverminor;
    (void)lcid;
    (void)pptlib;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_LoadTypeLib(void* szfile, void* pptlib) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadTypeLib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfile, pptlib);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfile;
    (void)pptlib;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_LoadTypeLibEx(void* szfile, int32_t regkind, void* pptlib) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadTypeLibEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfile, regkind, pptlib);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfile;
    (void)regkind;
    (void)pptlib;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_OaBuildVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OaBuildVersion");
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

void windowssys_windows_win32_system_ole_OaEnablePerUserTLibRegistration(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OaEnablePerUserTLibRegistration");
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

uint32_t windowssys_windows_win32_system_ole_OleBuildVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleBuildVersion");
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

int32_t windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorage2(void* lpolestream, void* pstg, void* ptd, uint32_t opt, void* pvcallbackcontext, void* pqueryconvertolelinkcallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorage2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpolestream, pstg, ptd, opt, pvcallbackcontext, pqueryconvertolelinkcallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpolestream;
    (void)pstg;
    (void)ptd;
    (void)opt;
    (void)pvcallbackcontext;
    (void)pqueryconvertolelinkcallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorageEx2(void* polestm, void* pstg, void* pcfformat, void* plwwidth, void* plheight, void* pdwsize, void* pmedium, uint32_t opt, void* pvcallbackcontext, void* pqueryconvertolelinkcallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorageEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium, opt, pvcallbackcontext, pqueryconvertolelinkcallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)polestm;
    (void)pstg;
    (void)pcfformat;
    (void)plwwidth;
    (void)plheight;
    (void)pdwsize;
    (void)pmedium;
    (void)opt;
    (void)pvcallbackcontext;
    (void)pqueryconvertolelinkcallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreate(void* rclsid, void* riid, uint32_t renderopt, void* pformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, riid, renderopt, pformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)riid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateDefaultHandler(void* clsid, void* punkouter, void* riid, void* lplpobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateDefaultHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, punkouter, riid, lplpobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)punkouter;
    (void)riid;
    (void)lplpobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateEmbeddingHelper(void* clsid, void* punkouter, uint32_t flags, void* pcf, void* riid, void* lplpobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateEmbeddingHelper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, punkouter, flags, pcf, riid, lplpobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)punkouter;
    (void)flags;
    (void)pcf;
    (void)riid;
    (void)lplpobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateEx(void* rclsid, void* riid, uint32_t dwflags, uint32_t renderopt, uint32_t cformats, void* rgadvf, void* rgformatetc, void* lpadvisesink, void* rgdwconnection, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, riid, dwflags, renderopt, cformats, rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateFontIndirect(void* lpfontdesc, void* riid, void* lplpvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFontIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfontdesc, riid, lplpvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfontdesc;
    (void)riid;
    (void)lplpvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateFromData(void* psrcdataobj, void* riid, uint32_t renderopt, void* pformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobj, riid, renderopt, pformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobj;
    (void)riid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateFromDataEx(void* psrcdataobj, void* riid, uint32_t dwflags, uint32_t renderopt, uint32_t cformats, void* rgadvf, void* rgformatetc, void* lpadvisesink, void* rgdwconnection, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobj, riid, dwflags, renderopt, cformats, rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobj;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateFromFile(void* rclsid, void* lpszfilename, void* riid, uint32_t renderopt, void* lpformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, lpszfilename, riid, renderopt, lpformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)lpszfilename;
    (void)riid;
    (void)renderopt;
    (void)lpformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateFromFileEx(void* rclsid, void* lpszfilename, void* riid, uint32_t dwflags, uint32_t renderopt, uint32_t cformats, void* rgadvf, void* rgformatetc, void* lpadvisesink, void* rgdwconnection, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, lpszfilename, riid, dwflags, renderopt, cformats, rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)lpszfilename;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateLink(void* pmklinksrc, void* riid, uint32_t renderopt, void* lpformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmklinksrc, riid, renderopt, lpformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmklinksrc;
    (void)riid;
    (void)renderopt;
    (void)lpformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateLinkEx(void* pmklinksrc, void* riid, uint32_t dwflags, uint32_t renderopt, uint32_t cformats, void* rgadvf, void* rgformatetc, void* lpadvisesink, void* rgdwconnection, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmklinksrc, riid, dwflags, renderopt, cformats, rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmklinksrc;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateLinkFromData(void* psrcdataobj, void* riid, uint32_t renderopt, void* pformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobj, riid, renderopt, pformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobj;
    (void)riid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateLinkFromDataEx(void* psrcdataobj, void* riid, uint32_t dwflags, uint32_t renderopt, uint32_t cformats, void* rgadvf, void* rgformatetc, void* lpadvisesink, void* rgdwconnection, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkFromDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobj, riid, dwflags, renderopt, cformats, rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobj;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateLinkToFile(void* lpszfilename, void* riid, uint32_t renderopt, void* lpformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkToFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, riid, renderopt, lpformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)riid;
    (void)renderopt;
    (void)lpformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateLinkToFileEx(void* lpszfilename, void* riid, uint32_t dwflags, uint32_t renderopt, uint32_t cformats, void* rgadvf, void* rgformatetc, void* lpadvisesink, void* rgdwconnection, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkToFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, riid, dwflags, renderopt, cformats, rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_ole_OleCreateMenuDescriptor(void* hmenucombined, void* lpmenuwidths) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateMenuDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenucombined, lpmenuwidths);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenucombined;
    (void)lpmenuwidths;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreatePictureIndirect(void* lppictdesc, void* riid, int32_t fown, void* lplpvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreatePictureIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppictdesc, riid, fown, lplpvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppictdesc;
    (void)riid;
    (void)fown;
    (void)lplpvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreatePropertyFrame(void* hwndowner, uint32_t x, uint32_t y, void* lpszcaption, uint32_t cobjects, void* ppunk, uint32_t cpages, void* ppageclsid, uint32_t lcid, uint32_t dwreserved, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreatePropertyFrame");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, x, y, lpszcaption, cobjects, ppunk, cpages, ppageclsid, lcid, dwreserved, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)x;
    (void)y;
    (void)lpszcaption;
    (void)cobjects;
    (void)ppunk;
    (void)cpages;
    (void)ppageclsid;
    (void)lcid;
    (void)dwreserved;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreatePropertyFrameIndirect(void* lpparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreatePropertyFrameIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleCreateStaticFromData(void* psrcdataobj, void* iid, uint32_t renderopt, void* pformatetc, void* pclientsite, void* pstg, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateStaticFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobj, iid, renderopt, pformatetc, pclientsite, pstg, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobj;
    (void)iid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleDestroyMenuDescriptor(int64_t holemenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDestroyMenuDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(holemenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)holemenu;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleDoAutoConvert(void* pstg, void* pclsidnew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDoAutoConvert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, pclsidnew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)pclsidnew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleDraw(void* punknown, uint32_t dwaspect, void* hdcdraw, void* lprcbounds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDraw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punknown, dwaspect, hdcdraw, lprcbounds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punknown;
    (void)dwaspect;
    (void)hdcdraw;
    (void)lprcbounds;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_ole_OleDuplicateData(void* hsrc, uint16_t cfformat, uint32_t uiflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDuplicateData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsrc, cfformat, uiflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hsrc;
    (void)cfformat;
    (void)uiflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleFlushClipboard(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleFlushClipboard");
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

int32_t windowssys_windows_win32_system_ole_OleGetAutoConvert(void* clsidold, void* pclsidnew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetAutoConvert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsidold, pclsidnew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsidold;
    (void)pclsidnew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleGetClipboard(void* ppdataobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppdataobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppdataobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleGetClipboardWithEnterpriseInfo(void* dataobject, void* dataenterpriseid, void* sourcedescription, void* targetdescription, void* datadescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetClipboardWithEnterpriseInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dataobject, dataenterpriseid, sourcedescription, targetdescription, datadescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dataobject;
    (void)dataenterpriseid;
    (void)sourcedescription;
    (void)targetdescription;
    (void)datadescription;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_ole_OleGetIconOfClass(void* rclsid, void* lpszlabel, int32_t fusetypeaslabel) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetIconOfClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, lpszlabel, fusetypeaslabel);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)rclsid;
    (void)lpszlabel;
    (void)fusetypeaslabel;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_ole_OleGetIconOfFile(void* lpszpath, int32_t fusefileaslabel) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetIconOfFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpath, fusefileaslabel);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszpath;
    (void)fusefileaslabel;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_ole_OleIconToCursor(void* hinstexe, void* hicon) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleIconToCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstexe, hicon);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstexe;
    (void)hicon;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleInitialize(void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleIsCurrentClipboard(void* pdataobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleIsCurrentClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdataobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdataobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleIsRunning(void* pobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleIsRunning");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleLoad(void* pstg, void* riid, void* pclientsite, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoad");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, riid, pclientsite, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)riid;
    (void)pclientsite;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleLoadFromStream(void* pstm, void* iidinterface, void* ppvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, iidinterface, ppvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)iidinterface;
    (void)ppvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleLoadPicture(void* lpstream, int32_t lsize, int32_t frunmode, void* riid, void* lplpvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadPicture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstream, lsize, frunmode, riid, lplpvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstream;
    (void)lsize;
    (void)frunmode;
    (void)riid;
    (void)lplpvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleLoadPictureEx(void* lpstream, int32_t lsize, int32_t frunmode, void* riid, uint32_t xsizedesired, uint32_t ysizedesired, uint32_t dwflags, void* lplpvobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadPictureEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstream, lsize, frunmode, riid, xsizedesired, ysizedesired, dwflags, lplpvobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstream;
    (void)lsize;
    (void)frunmode;
    (void)riid;
    (void)xsizedesired;
    (void)ysizedesired;
    (void)dwflags;
    (void)lplpvobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleLoadPicturePath(void* szurlorpath, void* punkcaller, uint32_t dwreserved, uint32_t clrreserved, void* riid, void* ppvret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadPicturePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szurlorpath, punkcaller, dwreserved, clrreserved, riid, ppvret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szurlorpath;
    (void)punkcaller;
    (void)dwreserved;
    (void)clrreserved;
    (void)riid;
    (void)ppvret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleLockRunning(void* punknown, int32_t flock, int32_t flastunlockcloses) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLockRunning");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punknown, flock, flastunlockcloses);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punknown;
    (void)flock;
    (void)flastunlockcloses;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_ole_OleMetafilePictFromIconAndLabel(void* hicon, void* lpszlabel, void* lpszsourcefile, uint32_t iiconindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleMetafilePictFromIconAndLabel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon, lpszlabel, lpszsourcefile, iiconindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hicon;
    (void)lpszlabel;
    (void)lpszsourcefile;
    (void)iiconindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleNoteObjectVisible(void* punknown, int32_t fvisible) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleNoteObjectVisible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punknown, fvisible);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punknown;
    (void)fvisible;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleQueryCreateFromData(void* psrcdataobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleQueryCreateFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleQueryLinkFromData(void* psrcdataobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleQueryLinkFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrcdataobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrcdataobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleRegEnumFormatEtc(void* clsid, uint32_t dwdirection, void* ppenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegEnumFormatEtc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, dwdirection, ppenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)dwdirection;
    (void)ppenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleRegEnumVerbs(void* clsid, void* ppenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegEnumVerbs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, ppenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)ppenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleRegGetMiscStatus(void* clsid, uint32_t dwaspect, void* pdwstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegGetMiscStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, dwaspect, pdwstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)dwaspect;
    (void)pdwstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleRegGetUserType(void* clsid, uint32_t dwformoftype, void* pszusertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegGetUserType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, dwformoftype, pszusertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)dwformoftype;
    (void)pszusertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleRun(void* punknown) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRun");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punknown);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punknown;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSave(void* pps, void* pstg, int32_t fsameasload) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, pstg, fsameasload);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)pstg;
    (void)fsameasload;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSavePictureFile(void* lpdisppicture, void* bstrfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSavePictureFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdisppicture, bstrfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdisppicture;
    (void)bstrfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSaveToStream(void* ppstm, void* pstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSaveToStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppstm, pstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppstm;
    (void)pstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSetAutoConvert(void* clsidold, void* clsidnew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetAutoConvert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsidold, clsidnew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsidold;
    (void)clsidnew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSetClipboard(void* pdataobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdataobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdataobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSetContainedObject(void* punknown, int32_t fcontained) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetContainedObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punknown, fcontained);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punknown;
    (void)fcontained;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleSetMenuDescriptor(int64_t holemenu, void* hwndframe, void* hwndactiveobject, void* lpframe, void* lpactiveobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetMenuDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(holemenu, hwndframe, hwndactiveobject, lpframe, lpactiveobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)holemenu;
    (void)hwndframe;
    (void)hwndactiveobject;
    (void)lpframe;
    (void)lpactiveobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleTranslateAccelerator(void* lpframe, void* lpframeinfo, void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleTranslateAccelerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpframe, lpframeinfo, lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpframe;
    (void)lpframeinfo;
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleTranslateColor(uint32_t clr, void* hpal, void* lpcolorref) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleTranslateColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clr, hpal, lpcolorref);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clr;
    (void)hpal;
    (void)lpcolorref;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleUIAddVerbMenuA(void* lpoleobj, void* lpszshorttype, void* hmenu, uint32_t upos, uint32_t uidverbmin, uint32_t uidverbmax, int32_t baddconvert, uint32_t idconvert, void* lphmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIAddVerbMenuA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoleobj, lpszshorttype, hmenu, upos, uidverbmin, uidverbmax, baddconvert, idconvert, lphmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoleobj;
    (void)lpszshorttype;
    (void)hmenu;
    (void)upos;
    (void)uidverbmin;
    (void)uidverbmax;
    (void)baddconvert;
    (void)idconvert;
    (void)lphmenu;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleUIAddVerbMenuW(void* lpoleobj, void* lpszshorttype, void* hmenu, uint32_t upos, uint32_t uidverbmin, uint32_t uidverbmax, int32_t baddconvert, uint32_t idconvert, void* lphmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIAddVerbMenuW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoleobj, lpszshorttype, hmenu, upos, uidverbmin, uidverbmax, baddconvert, idconvert, lphmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoleobj;
    (void)lpszshorttype;
    (void)hmenu;
    (void)upos;
    (void)uidverbmin;
    (void)uidverbmax;
    (void)baddconvert;
    (void)idconvert;
    (void)lphmenu;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_OleUIBusyA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIBusyA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIBusyW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIBusyW");
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

int32_t windowssys_windows_win32_system_ole_OleUICanConvertOrActivateAs(void* rclsid, int32_t fislinkedobject, uint16_t wformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUICanConvertOrActivateAs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, fislinkedobject, wformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)fislinkedobject;
    (void)wformat;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_OleUIChangeIconA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeIconA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIChangeIconW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeIconW");
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

uint32_t windowssys_windows_win32_system_ole_OleUIChangeSourceA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeSourceA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIChangeSourceW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeSourceW");
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

uint32_t windowssys_windows_win32_system_ole_OleUIConvertA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIConvertA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIConvertW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIConvertW");
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

uint32_t windowssys_windows_win32_system_ole_OleUIEditLinksA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIEditLinksA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIEditLinksW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIEditLinksW");
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

uint32_t windowssys_windows_win32_system_ole_OleUIInsertObjectA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIInsertObjectA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIInsertObjectW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIInsertObjectW");
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

uint32_t windowssys_windows_win32_system_ole_OleUIObjectPropertiesA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIObjectPropertiesA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIObjectPropertiesW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIObjectPropertiesW");
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

uint32_t windowssys_windows_win32_system_ole_OleUIPasteSpecialA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIPasteSpecialA");
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

uint32_t windowssys_windows_win32_system_ole_OleUIPasteSpecialW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIPasteSpecialW");
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

int32_t windowssys_windows_win32_system_ole_OleUIUpdateLinksA(void* lpoleuilinkcntr, void* hwndparent, void* lpsztitle, int32_t clinks) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIUpdateLinksA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoleuilinkcntr, hwndparent, lpsztitle, clinks);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoleuilinkcntr;
    (void)hwndparent;
    (void)lpsztitle;
    (void)clinks;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_OleUIUpdateLinksW(void* lpoleuilinkcntr, void* hwndparent, void* lpsztitle, int32_t clinks) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIUpdateLinksW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoleuilinkcntr, hwndparent, lpsztitle, clinks);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoleuilinkcntr;
    (void)hwndparent;
    (void)lpsztitle;
    (void)clinks;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_ole_OleUninitialize(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUninitialize");
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

int32_t windowssys_windows_win32_system_ole_QueryPathOfRegTypeLib(void* guid, uint16_t wmaj, uint16_t wmin, uint32_t lcid, void* lpbstrpathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPathOfRegTypeLib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, wmaj, wmin, lcid, lpbstrpathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guid;
    (void)wmaj;
    (void)wmin;
    (void)lcid;
    (void)lpbstrpathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_RegisterActiveObject(void* punk, void* rclsid, uint32_t dwflags, void* pdwregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterActiveObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, rclsid, dwflags, pdwregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)rclsid;
    (void)dwflags;
    (void)pdwregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_RegisterDragDrop(void* hwnd, void* pdroptarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDragDrop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pdroptarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pdroptarget;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_RegisterTypeLib(void* ptlib, void* szfullpath, void* szhelpdir) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTypeLib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptlib, szfullpath, szhelpdir);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptlib;
    (void)szfullpath;
    (void)szhelpdir;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_RegisterTypeLibForUser(void* ptlib, void* szfullpath, void* szhelpdir) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTypeLibForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptlib, szfullpath, szhelpdir);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptlib;
    (void)szfullpath;
    (void)szhelpdir;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_ole_ReleaseStgMedium(void* param0) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseStgMedium");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(param0);
        return;
    }
    errno = ENOSYS;
#else
    (void)param0;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_ole_RevokeActiveObject(uint32_t dwregister, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeActiveObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwregister, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwregister;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_RevokeDragDrop(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeDragDrop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayAccessData(void* psa, void* ppvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAccessData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, ppvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)ppvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayAddRef(void* psa, void* ppdatatorelease) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAddRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, ppdatatorelease);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)ppdatatorelease;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayAllocData(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAllocData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayAllocDescriptor(uint32_t cdims, void* ppsaout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAllocDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cdims, ppsaout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cdims;
    (void)ppsaout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayAllocDescriptorEx(uint16_t vt, uint32_t cdims, void* ppsaout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAllocDescriptorEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vt, cdims, ppsaout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vt;
    (void)cdims;
    (void)ppsaout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayCopy(void* psa, void* ppsaout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, ppsaout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)ppsaout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayCopyData(void* psasource, void* psatarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCopyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psasource, psatarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psasource;
    (void)psatarget;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_ole_SafeArrayCreate(uint16_t vt, uint32_t cdims, void* rgsabound) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vt, cdims, rgsabound);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)vt;
    (void)cdims;
    (void)rgsabound;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_ole_SafeArrayCreateEx(uint16_t vt, uint32_t cdims, void* rgsabound, void* pvextra) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vt, cdims, rgsabound, pvextra);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)vt;
    (void)cdims;
    (void)rgsabound;
    (void)pvextra;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_ole_SafeArrayCreateVector(uint16_t vt, int32_t llbound, uint32_t celements) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreateVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vt, llbound, celements);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)vt;
    (void)llbound;
    (void)celements;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_ole_SafeArrayCreateVectorEx(uint16_t vt, int32_t llbound, uint32_t celements, void* pvextra) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreateVectorEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vt, llbound, celements, pvextra);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)vt;
    (void)llbound;
    (void)celements;
    (void)pvextra;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayDestroy(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayDestroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayDestroyData(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayDestroyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayDestroyDescriptor(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayDestroyDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_SafeArrayGetDim(void* psa) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetDim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psa;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayGetElement(void* psa, void* rgindices, void* pv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, rgindices, pv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)rgindices;
    (void)pv;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_SafeArrayGetElemsize(void* psa) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetElemsize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psa;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayGetIID(void* psa, void* pguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetIID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, pguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)pguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayGetLBound(void* psa, uint32_t ndim, void* pllbound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetLBound");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, ndim, pllbound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)ndim;
    (void)pllbound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayGetRecordInfo(void* psa, void* prinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetRecordInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, prinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)prinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayGetUBound(void* psa, uint32_t ndim, void* plubound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetUBound");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, ndim, plubound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)ndim;
    (void)plubound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayGetVartype(void* psa, void* pvt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetVartype");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, pvt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)pvt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayLock(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayPtrOfIndex(void* psa, void* rgindices, void* ppvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayPtrOfIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, rgindices, ppvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)rgindices;
    (void)ppvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayPutElement(void* psa, void* rgindices, void* pv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayPutElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, rgindices, pv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)rgindices;
    (void)pv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayRedim(void* psa, void* psaboundnew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayRedim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, psaboundnew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)psaboundnew;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_ole_SafeArrayReleaseData(void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayReleaseData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_ole_SafeArrayReleaseDescriptor(void* psa) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayReleaseDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(psa);
        return;
    }
    errno = ENOSYS;
#else
    (void)psa;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArraySetIID(void* psa, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArraySetIID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArraySetRecordInfo(void* psa, void* prinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArraySetRecordInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, prinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)prinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayUnaccessData(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayUnaccessData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_SafeArrayUnlock(void* psa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayUnlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_UnRegisterTypeLib(void* libid, uint16_t wvermajor, uint16_t wverminor, uint32_t lcid, int32_t syskind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnRegisterTypeLib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(libid, wvermajor, wverminor, lcid, syskind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)libid;
    (void)wvermajor;
    (void)wverminor;
    (void)lcid;
    (void)syskind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_UnRegisterTypeLibForUser(void* libid, uint16_t wmajorvernum, uint16_t wminorvernum, uint32_t lcid, int32_t syskind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnRegisterTypeLibForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(libid, wmajorvernum, wminorvernum, lcid, syskind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)libid;
    (void)wmajorvernum;
    (void)wminorvernum;
    (void)lcid;
    (void)syskind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarAbs(void* pvarin, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarAbs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarAdd(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarAnd(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarAnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromDate(double datein, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromDec(void* pdecin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromDisp(void* pdispin, uint32_t lcid, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromI1(int8_t cin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromI2(int16_t arg_0_sin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromI4(int32_t lin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromI8(int64_t i64in, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromR4(float fltin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromR8(double dblin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromUI1(uint8_t bin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromUI2(uint16_t uiin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromUI4(uint32_t ulin, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBoolFromUI8(uint64_t i64in, void* pboolout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pboolout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pboolout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrCat(void* bstrleft, void* bstrright, void* pbstrresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrCat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bstrleft, bstrright, pbstrresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bstrleft;
    (void)bstrright;
    (void)pbstrresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrCmp(void* bstrleft, void* bstrright, uint32_t lcid, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bstrleft, bstrright, lcid, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bstrleft;
    (void)bstrright;
    (void)lcid;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromBool(int16_t boolin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromDate(double datein, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromDec(void* pdecin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromDisp(void* pdispin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromI1(int8_t cin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromI2(int16_t ival, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ival, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ival;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromI4(int32_t lin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromI8(int64_t i64in, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromR4(float fltin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromR8(double dblin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromUI1(uint8_t bval, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bval, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bval;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromUI2(uint16_t uiin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromUI4(uint32_t ulin, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarBstrFromUI8(uint64_t ui64in, uint32_t lcid, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, lcid, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCat(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_VarCmp(void* pvarleft, void* pvarright, uint32_t lcid, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, lcid, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)lcid;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromBool(int16_t boolin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromDate(double datein, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromDec(void* pdecin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromDisp(void* pdispin, uint32_t lcid, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromI1(int8_t cin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromI2(int16_t arg_0_sin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromI4(int32_t lin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromI8(int64_t i64in, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromR4(float fltin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromR8(double dblin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromUI1(uint8_t bin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromUI2(uint16_t uiin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromUI4(uint32_t ulin, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarCyFromUI8(uint64_t ui64in, void* pcyout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pcyout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pcyout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromBool(int16_t boolin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromDec(void* pdecin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromDisp(void* pdispin, uint32_t lcid, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromI1(int8_t cin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromI2(int16_t arg_0_sin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromI4(int32_t lin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromI8(int64_t i64in, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromR4(float fltin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromR8(double dblin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromUI1(uint8_t bin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromUI2(uint16_t uiin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromUI4(uint32_t ulin, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromUI8(uint64_t ui64in, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromUdate(void* pudatein, uint32_t dwflags, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pudatein, dwflags, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pudatein;
    (void)dwflags;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDateFromUdateEx(void* pudatein, uint32_t lcid, uint32_t dwflags, void* pdateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUdateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pudatein, lcid, dwflags, pdateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pudatein;
    (void)lcid;
    (void)dwflags;
    (void)pdateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecAbs(void* pdecin, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecAbs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecAdd(void* pdecleft, void* pdecright, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecleft, pdecright, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_VarDecCmp(void* pdecleft, void* pdecright) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecleft, pdecright);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdecleft;
    (void)pdecright;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_ole_VarDecCmpR8(void* pdecleft, double dblright) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecCmpR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecleft, dblright);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdecleft;
    (void)dblright;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecDiv(void* pdecleft, void* pdecright, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecDiv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecleft, pdecright, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFix(void* pdecin, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromBool(int16_t boolin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromDate(double datein, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromDisp(void* pdispin, uint32_t lcid, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromI1(int8_t cin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromI2(int16_t uiin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromI4(int32_t lin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromI8(int64_t i64in, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromR4(float fltin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromR8(double dblin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromUI1(uint8_t bin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromUI2(uint16_t uiin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromUI4(uint32_t ulin, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecFromUI8(uint64_t ui64in, void* pdecout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pdecout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pdecout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecInt(void* pdecin, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecMul(void* pdecleft, void* pdecright, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecMul");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecleft, pdecright, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecNeg(void* pdecin, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecNeg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecRound(void* pdecin, int32_t cdecimals, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecRound");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, cdecimals, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)cdecimals;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDecSub(void* pdecleft, void* pdecright, void* pdecresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecleft, pdecright, pdecresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarDiv(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDiv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarEqv(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarEqv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFix(void* pvarin, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFormat(void* pvarin, void* pstrformat, int32_t ifirstday, int32_t ifirstweek, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pstrformat, ifirstday, ifirstweek, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pstrformat;
    (void)ifirstday;
    (void)ifirstweek;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFormatCurrency(void* pvarin, int32_t inumdig, int32_t iinclead, int32_t iuseparens, int32_t igroup, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatCurrency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)inumdig;
    (void)iinclead;
    (void)iuseparens;
    (void)igroup;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFormatDateTime(void* pvarin, int32_t inamedformat, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, inamedformat, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)inamedformat;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFormatFromTokens(void* pvarin, void* pstrformat, void* pbtokcur, uint32_t dwflags, void* pbstrout, uint32_t lcid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatFromTokens");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pstrformat, pbtokcur, dwflags, pbstrout, lcid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pstrformat;
    (void)pbtokcur;
    (void)dwflags;
    (void)pbstrout;
    (void)lcid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFormatNumber(void* pvarin, int32_t inumdig, int32_t iinclead, int32_t iuseparens, int32_t igroup, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)inumdig;
    (void)iinclead;
    (void)iuseparens;
    (void)igroup;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarFormatPercent(void* pvarin, int32_t inumdig, int32_t iinclead, int32_t iuseparens, int32_t igroup, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatPercent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)inumdig;
    (void)iinclead;
    (void)iuseparens;
    (void)igroup;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromBool(int16_t boolin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromDate(double datein, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromDec(void* pdecin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromDisp(void* pdispin, uint32_t lcid, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromI2(int16_t uiin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromI4(int32_t lin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromI8(int64_t i64in, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromR4(float fltin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromR8(double dblin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromUI1(uint8_t bin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromUI2(uint16_t uiin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromUI4(uint32_t ulin, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI1FromUI8(uint64_t i64in, void* pcout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pcout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pcout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromBool(int16_t boolin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromDate(double datein, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromDec(void* pdecin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromDisp(void* pdispin, uint32_t lcid, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromI1(int8_t cin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromI4(int32_t lin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromI8(int64_t i64in, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromR4(float fltin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromR8(double dblin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromUI1(uint8_t bin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromUI2(uint16_t uiin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromUI4(uint32_t ulin, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI2FromUI8(uint64_t ui64in, void* psout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, psout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)psout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromBool(int16_t boolin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromDate(double datein, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromDec(void* pdecin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromDisp(void* pdispin, uint32_t lcid, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromI1(int8_t cin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromI2(int16_t arg_0_sin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromI8(int64_t i64in, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromR4(float fltin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromR8(double dblin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromUI1(uint8_t bin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromUI2(uint16_t uiin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromUI4(uint32_t ulin, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI4FromUI8(uint64_t ui64in, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromBool(int16_t boolin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromDate(double datein, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromDec(void* pdecin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromDisp(void* pdispin, uint32_t lcid, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromI1(int8_t cin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromI2(int16_t arg_0_sin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromR4(float fltin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromR8(double dblin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromUI1(uint8_t bin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromUI2(uint16_t uiin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromUI4(uint32_t ulin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarI8FromUI8(uint64_t ui64in, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarIdiv(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarIdiv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarImp(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarImp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarInt(void* pvarin, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarMod(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarMod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarMonthName(int32_t imonth, int32_t fabbrev, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarMonthName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imonth, fabbrev, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imonth;
    (void)fabbrev;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarMul(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarMul");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarNeg(void* pvarin, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarNeg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarNot(void* pvarin, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarNot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarNumFromParseNum(void* pnumprs, void* rgbdig, uint32_t dwvtbits, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarNumFromParseNum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnumprs, rgbdig, dwvtbits, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pnumprs;
    (void)rgbdig;
    (void)dwvtbits;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarOr(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarOr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarParseNumFromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pnumprs, void* rgbdig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarParseNumFromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pnumprs, rgbdig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pnumprs;
    (void)rgbdig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarPow(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarPow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_ole_VarR4CmpR8(float fltleft, double dblright) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(float, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4CmpR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltleft, dblright);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fltleft;
    (void)dblright;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromBool(int16_t boolin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromDate(double datein, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromDec(void* pdecin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromDisp(void* pdispin, uint32_t lcid, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromI1(int8_t cin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromI2(int16_t arg_0_sin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromI4(int32_t lin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromI8(int64_t i64in, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromR8(double dblin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromUI1(uint8_t bin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromUI2(uint16_t uiin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromUI4(uint32_t ulin, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR4FromUI8(uint64_t ui64in, void* pfltout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pfltout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pfltout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromBool(int16_t boolin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromDate(double datein, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromDec(void* pdecin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromDisp(void* pdispin, uint32_t lcid, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromI1(int8_t cin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromI2(int16_t arg_0_sin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromI4(int32_t lin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromI8(int64_t i64in, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromR4(float fltin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromUI1(uint8_t bin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromUI2(uint16_t uiin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromUI4(uint32_t ulin, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8FromUI8(uint64_t ui64in, void* pdblout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pdblout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pdblout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8Pow(double dblleft, double dblright, void* pdblresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8Pow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblleft, dblright, pdblresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblleft;
    (void)dblright;
    (void)pdblresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarR8Round(double dblin, int32_t cdecimals, void* pdblresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8Round");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, cdecimals, pdblresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)cdecimals;
    (void)pdblresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarRound(void* pvarin, int32_t cdecimals, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarRound");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarin, cdecimals, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarin;
    (void)cdecimals;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarSub(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarTokenizeFormatString(void* pstrformat, void* rgbtok, int32_t cbtok, int32_t ifirstday, int32_t ifirstweek, uint32_t lcid, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarTokenizeFormatString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstrformat, rgbtok, cbtok, ifirstday, ifirstweek, lcid, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstrformat;
    (void)rgbtok;
    (void)cbtok;
    (void)ifirstday;
    (void)ifirstweek;
    (void)lcid;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromBool(int16_t boolin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromDate(double datein, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromDec(void* pdecin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromDisp(void* pdispin, uint32_t lcid, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromI1(int8_t cin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromI2(int16_t arg_0_sin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromI4(int32_t lin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromI8(int64_t i64in, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromR4(float fltin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromR8(double dblin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromUI2(uint16_t uiin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromUI4(uint32_t ulin, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI1FromUI8(uint64_t ui64in, void* pbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromBool(int16_t boolin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromDate(double datein, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromDec(void* pdecin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromDisp(void* pdispin, uint32_t lcid, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromI1(int8_t cin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromI2(int16_t uiin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromI4(int32_t lin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromI8(int64_t i64in, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromR4(float fltin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromR8(double dblin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromUI1(uint8_t bin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromUI4(uint32_t ulin, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI2FromUI8(uint64_t i64in, void* puiout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, puiout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)puiout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromBool(int16_t boolin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromDate(double datein, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromDec(void* pdecin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromDisp(void* pdispin, uint32_t lcid, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromI1(int8_t cin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromI2(int16_t uiin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromI4(int32_t lin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromI8(int64_t i64in, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i64in, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)i64in;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromR4(float fltin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromR8(double dblin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromUI1(uint8_t bin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromUI2(uint16_t uiin, void* pulout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pulout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pulout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI4FromUI8(uint64_t ui64in, void* plout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromUI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, plout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)plout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromBool(int16_t boolin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boolin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boolin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromDate(double datein, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromDec(void* pdecin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromDec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdecin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdecin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromDisp(void* pdispin, uint32_t lcid, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromDisp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdispin, lcid, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdispin;
    (void)lcid;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromI1(int8_t cin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromI2(int16_t arg_0_sin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_sin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_sin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromI8(int64_t ui64in, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromI8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ui64in, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ui64in;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromR4(float fltin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromR4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromR8(double dblin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromR8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dblin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dblin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromStr(void* strin, uint32_t lcid, uint32_t dwflags, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, lcid, dwflags, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromUI1(uint8_t bin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromUI1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromUI2(uint16_t uiin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromUI2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUI8FromUI4(uint32_t ulin, void* pi64out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromUI4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulin, pi64out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulin;
    (void)pi64out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarUdateFromDate(double datein, uint32_t dwflags, void* pudateout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUdateFromDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datein, dwflags, pudateout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datein;
    (void)dwflags;
    (void)pudateout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarWeekdayName(int32_t iweekday, int32_t fabbrev, int32_t ifirstday, uint32_t dwflags, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarWeekdayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iweekday, fabbrev, ifirstday, dwflags, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iweekday;
    (void)fabbrev;
    (void)ifirstday;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VarXor(void* pvarleft, void* pvarright, void* pvarresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarXor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarleft, pvarright, pvarresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_ole_VectorFromBstr(void* bstr, void* ppsa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VectorFromBstr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bstr, ppsa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bstr;
    (void)ppsa;
    errno = ENOSYS;
    return -1;
#endif
}

