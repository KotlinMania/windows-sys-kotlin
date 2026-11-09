#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_addressbook_wrapper.h"
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

int32_t windowssys_windows_win32_system_addressbook_BuildDisplayTable(void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpmalloc, void* hinstance, uint32_t cpages, void* lppage, uint32_t ulflags, void* lpptable, void* lpptbldata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildDisplayTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpallocatebuffer, lpallocatemore, lpfreebuffer, lpmalloc, hinstance, cpages, lppage, ulflags, lpptable, lpptbldata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpmalloc;
    (void)hinstance;
    (void)cpages;
    (void)lppage;
    (void)ulflags;
    (void)lpptable;
    (void)lpptbldata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_addressbook_ChangeIdleRoutine(void* ftg, void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle, uint16_t ircidle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t, uint32_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeIdleRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ftg, lpfnidle, lpvidleparam, priidle, csecidle, iroidle, ircidle);
        return;
    }
    errno = ENOSYS;
#else
    (void)ftg;
    (void)lpfnidle;
    (void)lpvidleparam;
    (void)priidle;
    (void)csecidle;
    (void)iroidle;
    (void)ircidle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_CreateIProp(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, void* lpppropdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpinterface, lpallocatebuffer, lpallocatemore, lpfreebuffer, lpvreserved, lpppropdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpinterface;
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpvreserved;
    (void)lpppropdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_CreateTable(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, uint32_t ultabletype, uint32_t ulproptagindexcolumn, void* lpsproptagarraycolumns, void* lpptabledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpinterface, lpallocatebuffer, lpallocatemore, lpfreebuffer, lpvreserved, ultabletype, ulproptagindexcolumn, lpsproptagarraycolumns, lpptabledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpinterface;
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpvreserved;
    (void)ultabletype;
    (void)ulproptagindexcolumn;
    (void)lpsproptagarraycolumns;
    (void)lpptabledata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_addressbook_DeinitMapiUtil(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeinitMapiUtil");
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

void windowssys_windows_win32_system_addressbook_DeregisterIdleRoutine(void* ftg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterIdleRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ftg);
        return;
    }
    errno = ENOSYS;
#else
    (void)ftg;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_addressbook_EnableIdleRoutine(void* ftg, int32_t fenable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableIdleRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ftg, fenable);
        return;
    }
    errno = ENOSYS;
#else
    (void)ftg;
    (void)fenable;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_FEqualNames(void* lpname1, void* lpname2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FEqualNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname1, lpname2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname1;
    (void)lpname2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_FPropCompareProp(void* lpspropvalue1, uint32_t ulrelop, void* lpspropvalue2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropCompareProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpspropvalue1, ulrelop, lpspropvalue2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpspropvalue1;
    (void)ulrelop;
    (void)lpspropvalue2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_FPropContainsProp(void* lpspropvaluedst, void* lpspropvaluesrc, uint32_t ulfuzzylevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropContainsProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpspropvaluedst, lpspropvaluesrc, ulfuzzylevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpspropvaluedst;
    (void)lpspropvaluesrc;
    (void)ulfuzzylevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_FPropExists(void* lpmapiprop, uint32_t ulproptag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropExists");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmapiprop, ulproptag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmapiprop;
    (void)ulproptag;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_addressbook_FreePadrlist(void* lpadrlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePadrlist");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpadrlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpadrlist;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_addressbook_FreeProws(void* lprows) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeProws");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lprows);
        return;
    }
    errno = ENOSYS;
#else
    (void)lprows;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_addressbook_FtgRegisterIdleRoutine(void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int16_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtgRegisterIdleRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfnidle, lpvidleparam, priidle, csecidle, iroidle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfnidle;
    (void)lpvidleparam;
    (void)priidle;
    (void)csecidle;
    (void)iroidle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrAddColumns(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAddColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptbl, lpproptagcolumnsnew, lpallocatebuffer, lpfreebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptbl;
    (void)lpproptagcolumnsnew;
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrAddColumnsEx(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer, int64_t lpfnfiltercolumns) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAddColumnsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptbl, lpproptagcolumnsnew, lpallocatebuffer, lpfreebuffer, lpfnfiltercolumns);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptbl;
    (void)lpproptagcolumnsnew;
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    (void)lpfnfiltercolumns;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrAllocAdviseSink(void* lpfncallback, void* lpvcontext, void* lppadvisesink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAllocAdviseSink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfncallback, lpvcontext, lppadvisesink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfncallback;
    (void)lpvcontext;
    (void)lppadvisesink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrDispatchNotifications(uint32_t ulflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrDispatchNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrGetOneProp(void* lpmapiprop, uint32_t ulproptag, void* lppprop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrGetOneProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmapiprop, ulproptag, lppprop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmapiprop;
    (void)ulproptag;
    (void)lppprop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrIStorageFromStream(void* lpunkin, void* lpinterface, uint32_t ulflags, void* lppstorageout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrIStorageFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpunkin, lpinterface, ulflags, lppstorageout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpunkin;
    (void)lpinterface;
    (void)ulflags;
    (void)lppstorageout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrQueryAllRows(void* lptable, void* lpproptags, void* lprestriction, void* lpsortorderset, int32_t crowsmax, void* lpprows) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrQueryAllRows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptable, lpproptags, lprestriction, lpsortorderset, crowsmax, lpprows);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptable;
    (void)lpproptags;
    (void)lprestriction;
    (void)lpsortorderset;
    (void)crowsmax;
    (void)lpprows;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrSetOneProp(void* lpmapiprop, void* lpprop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrSetOneProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmapiprop, lpprop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmapiprop;
    (void)lpprop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_HrThisThreadAdviseSink(void* lpadvisesink, void* lppadvisesink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrThisThreadAdviseSink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpadvisesink, lppadvisesink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpadvisesink;
    (void)lppadvisesink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_LPropCompareProp(void* lpspropvaluea, void* lpspropvalueb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPropCompareProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpspropvaluea, lpspropvalueb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpspropvaluea;
    (void)lpspropvalueb;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_addressbook_LpValFindProp(uint32_t ulproptag, uint32_t cvalues, void* lpproparray) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LpValFindProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulproptag, cvalues, lpproparray);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ulproptag;
    (void)cvalues;
    (void)lpproparray;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_system_addressbook_MAPIDeinitIdle(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIDeinitIdle");
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

void* windowssys_windows_win32_system_addressbook_MAPIGetDefaultMalloc(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIGetDefaultMalloc");
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

int32_t windowssys_windows_win32_system_addressbook_MAPIInitIdle(void* lpvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIInitIdle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_OpenStreamOnFile(void* lpallocatebuffer, void* lpfreebuffer, uint32_t ulflags, void* lpszfilename, void* lpszprefix, void* lppstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenStreamOnFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpallocatebuffer, lpfreebuffer, ulflags, lpszfilename, lpszprefix, lppstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    (void)ulflags;
    (void)lpszfilename;
    (void)lpszprefix;
    (void)lppstream;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_addressbook_PpropFindProp(void* lpproparray, uint32_t cvalues, uint32_t ulproptag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PpropFindProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproparray, cvalues, ulproptag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpproparray;
    (void)cvalues;
    (void)ulproptag;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_PropCopyMore(void* lpspropvaluedest, void* lpspropvaluesrc, void* lpfallocmore, void* lpvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropCopyMore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpspropvaluedest, lpspropvaluesrc, lpfallocmore, lpvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpspropvaluedest;
    (void)lpspropvaluesrc;
    (void)lpfallocmore;
    (void)lpvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_RTFSync(void* lpmessage, uint32_t ulflags, void* lpfmessageupdated) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RTFSync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmessage, ulflags, lpfmessageupdated);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmessage;
    (void)ulflags;
    (void)lpfmessageupdated;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScCopyNotifications(int32_t cnotification, void* lpnotifications, void* lpvdst, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCopyNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnotification, lpnotifications, lpvdst, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnotification;
    (void)lpnotifications;
    (void)lpvdst;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScCopyProps(int32_t cvalues, void* lpproparray, void* lpvdst, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCopyProps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cvalues, lpproparray, lpvdst, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpvdst;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScCountNotifications(int32_t cnotifications, void* lpnotifications, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCountNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnotifications, lpnotifications, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnotifications;
    (void)lpnotifications;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScCountProps(int32_t cvalues, void* lpproparray, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCountProps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cvalues, lpproparray, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScCreateConversationIndex(uint32_t cbparent, void* lpbparent, void* lpcbconvindex, void* lppbconvindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCreateConversationIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbparent, lpbparent, lpcbconvindex, lppbconvindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cbparent;
    (void)lpbparent;
    (void)lpcbconvindex;
    (void)lppbconvindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScDupPropset(int32_t cvalues, void* lpproparray, void* lpallocatebuffer, void* lppproparray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScDupPropset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cvalues, lpproparray, lpallocatebuffer, lppproparray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpallocatebuffer;
    (void)lppproparray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScInitMapiUtil(uint32_t ulflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScInitMapiUtil");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScLocalPathFromUNC(void* lpszunc, void* lpszlocal, uint32_t cchlocal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScLocalPathFromUNC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszunc, lpszlocal, cchlocal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszunc;
    (void)lpszlocal;
    (void)cchlocal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScRelocNotifications(int32_t cnotification, void* lpnotifications, void* lpvbaseold, void* lpvbasenew, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScRelocNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnotification, lpnotifications, lpvbaseold, lpvbasenew, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnotification;
    (void)lpnotifications;
    (void)lpvbaseold;
    (void)lpvbasenew;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScRelocProps(int32_t cvalues, void* lpproparray, void* lpvbaseold, void* lpvbasenew, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScRelocProps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cvalues, lpproparray, lpvbaseold, lpvbasenew, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpvbaseold;
    (void)lpvbasenew;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_ScUNCFromLocalPath(void* lpszlocal, void* lpszunc, uint32_t cchunc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScUNCFromLocalPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlocal, lpszunc, cchunc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszlocal;
    (void)lpszunc;
    (void)cchunc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_addressbook_SzFindCh(void* lpsz, uint16_t ch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindCh");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, ch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    (void)ch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_addressbook_SzFindLastCh(void* lpsz, uint16_t ch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindLastCh");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, ch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    (void)ch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_addressbook_SzFindSz(void* lpsz, void* lpszkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindSz");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, lpszkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    (void)lpszkey;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_addressbook_UFromSz(void* lpsz) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UFromSz");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsz;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_addressbook_UlAddRef(void* lpunk) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlAddRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpunk);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpunk;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_addressbook_UlPropSize(void* lpspropvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlPropSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpspropvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpspropvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_addressbook_UlRelease(void* lpunk) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpunk);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpunk;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_WrapCompressedRTFStream(void* lpcompressedrtfstream, uint32_t ulflags, void* lpuncompressedrtfstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WrapCompressedRTFStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcompressedrtfstream, ulflags, lpuncompressedrtfstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcompressedrtfstream;
    (void)ulflags;
    (void)lpuncompressedrtfstream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_addressbook_WrapStoreEntryID(uint32_t ulflags, void* lpszdllname, uint32_t cborigentry, void* lporigentry, void* lpcbwrappedentry, void* lppwrappedentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WrapStoreEntryID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulflags, lpszdllname, cborigentry, lporigentry, lpcbwrappedentry, lppwrappedentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulflags;
    (void)lpszdllname;
    (void)cborigentry;
    (void)lporigentry;
    (void)lpcbwrappedentry;
    (void)lppwrappedentry;
    errno = ENOSYS;
    return -1;
#endif
}

