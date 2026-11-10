#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_dataexchange_wrapper.h"
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

uint16_t windowssys_windows_win32_system_dataexchange_addAtomA(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAtomA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_addAtomW(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAtomW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClipboardFormatListener");
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

int32_t windowssys_windows_win32_system_dataexchange_changeClipboardChain(void* hwndremove, void* hwndnewnext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClipboardChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndremove, hwndnewnext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndremove;
    (void)hwndnewnext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_closeClipboard(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClipboard");
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

int32_t windowssys_windows_win32_system_dataexchange_countClipboardFormats(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CountClipboardFormats");
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

int32_t windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(uint32_t idinst, void* hconv, uint32_t idtransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAbandonTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hconv, idtransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idinst;
    (void)hconv;
    (void)idtransaction;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeAccessData(void* hdata, void* pcbdatasize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAccessData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata, pcbdatasize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdata;
    (void)pcbdatasize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeAddData(void* hdata, void* psrc, uint32_t cb, uint32_t cboff) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAddData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata, psrc, cb, cboff);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdata;
    (void)psrc;
    (void)cb;
    (void)cboff;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeClientTransaction(void* pdata, uint32_t cbdata, void* hconv, void* hszitem, uint32_t wfmt, uint32_t wtype, uint32_t dwtimeout, void* pdwresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeClientTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata, cbdata, hconv, hszitem, wfmt, wtype, dwtimeout, pdwresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pdata;
    (void)cbdata;
    (void)hconv;
    (void)hszitem;
    (void)wfmt;
    (void)wtype;
    (void)dwtimeout;
    (void)pdwresult;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(void* hsz1, void* hsz2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCmpStringHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsz1, hsz2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsz1;
    (void)hsz2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeConnect(uint32_t idinst, void* hszservice, void* hsztopic, void* pcc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hszservice, hsztopic, pcc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idinst;
    (void)hszservice;
    (void)hsztopic;
    (void)pcc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeConnectList(uint32_t idinst, void* hszservice, void* hsztopic, void* hconvlist, void* pcc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeConnectList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hszservice, hsztopic, hconvlist, pcc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idinst;
    (void)hszservice;
    (void)hsztopic;
    (void)hconvlist;
    (void)pcc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(uint32_t idinst, void* psrc, uint32_t cb, uint32_t cboff, void* hszitem, uint32_t wfmt, uint32_t afcmd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateDataHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, psrc, cb, cboff, hszitem, wfmt, afcmd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idinst;
    (void)psrc;
    (void)cb;
    (void)cboff;
    (void)hszitem;
    (void)wfmt;
    (void)afcmd;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(uint32_t idinst, void* psz, int32_t icodepage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateStringHandleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, psz, icodepage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idinst;
    (void)psz;
    (void)icodepage;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(uint32_t idinst, void* psz, int32_t icodepage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateStringHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, psz, icodepage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idinst;
    (void)psz;
    (void)icodepage;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeDisconnect(void* hconv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeDisconnectList(void* hconvlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeDisconnectList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconvlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconvlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeEnableCallback(uint32_t idinst, void* hconv, uint32_t wcmd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeEnableCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hconv, wcmd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idinst;
    (void)hconv;
    (void)wcmd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(void* hdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeFreeDataHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(uint32_t idinst, void* hsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeFreeStringHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idinst;
    (void)hsz;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeGetData(void* hdata, void* pdst, uint32_t cbmax, uint32_t cboff) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeGetData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata, pdst, cbmax, cboff);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdata;
    (void)pdst;
    (void)cbmax;
    (void)cboff;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeGetLastError(uint32_t idinst) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeGetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)idinst;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(void* hconv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeImpersonateClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconv;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeInitializeA(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeInitializeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidinst, pfncallback, afcmd, ulres);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pidinst;
    (void)pfncallback;
    (void)afcmd;
    (void)ulres;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeInitializeW(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeInitializeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidinst, pfncallback, afcmd, ulres);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pidinst;
    (void)pfncallback;
    (void)afcmd;
    (void)ulres;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(uint32_t idinst, void* hsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeKeepStringHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idinst;
    (void)hsz;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeNameService(uint32_t idinst, void* hsz1, void* hsz2, uint32_t afcmd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeNameService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hsz1, hsz2, afcmd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idinst;
    (void)hsz1;
    (void)hsz2;
    (void)afcmd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddePostAdvise(uint32_t idinst, void* hsztopic, void* hszitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdePostAdvise");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hsztopic, hszitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idinst;
    (void)hsztopic;
    (void)hszitem;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(void* hconv, uint32_t idtransaction, void* pconvinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryConvInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconv, idtransaction, pconvinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hconv;
    (void)idtransaction;
    (void)pconvinfo;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(void* hconvlist, void* hconvprev) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryNextServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconvlist, hconvprev);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconvlist;
    (void)hconvprev;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeQueryStringA(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hsz, psz, cchmax, icodepage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)idinst;
    (void)hsz;
    (void)psz;
    (void)cchmax;
    (void)icodepage;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_ddeQueryStringW(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst, hsz, psz, cchmax, icodepage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)idinst;
    (void)hsz;
    (void)psz;
    (void)cchmax;
    (void)icodepage;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_dataexchange_ddeReconnect(void* hconv) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeReconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconv);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconv;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(void* hwndclient, void* pqosnew, void* pqosprev) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeSetQualityOfService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndclient, pqosnew, pqosprev);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndclient;
    (void)pqosnew;
    (void)pqosprev;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(void* hconv, uint32_t id, uint64_t huser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeSetUserHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconv, id, huser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconv;
    (void)id;
    (void)huser;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeUnaccessData(void* hdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeUnaccessData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_ddeUninitialize(uint32_t idinst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeUninitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idinst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idinst;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_deleteAtom(uint16_t natom) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAtom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(natom);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)natom;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_emptyClipboard(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EmptyClipboard");
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

uint32_t windowssys_windows_win32_system_dataexchange_enumClipboardFormats(uint32_t format) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumClipboardFormats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)format;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_findAtomA(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindAtomA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_findAtomW(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindAtomW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_freeDDElParam(uint32_t msg, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeDDElParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_getAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAtomNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(natom, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_getAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAtomNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(natom, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_dataexchange_getClipboardData(uint32_t uformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uformat;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(uint32_t format, void* lpszformatname, int32_t cchmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardFormatNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, lpszformatname, cchmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)lpszformatname;
    (void)cchmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(uint32_t format, void* lpszformatname, int32_t cchmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardFormatNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, lpszformatname, cchmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)lpszformatname;
    (void)cchmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_dataexchange_getClipboardOwner(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardOwner");
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

uint32_t windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardSequenceNumber");
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

void* windowssys_windows_win32_system_dataexchange_getClipboardViewer(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardViewer");
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

void* windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenClipboardWindow");
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

int32_t windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(void* paformatprioritylist, int32_t cformats) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPriorityClipboardFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paformatprioritylist, cformats);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)paformatprioritylist;
    (void)cformats;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(void* lpuiformats, uint32_t cformats, void* pcformatsout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdatedClipboardFormats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuiformats, cformats, pcformatsout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpuiformats;
    (void)cformats;
    (void)pcformatsout;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomA(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomExA(void* lpstring, uint32_t flags) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomExW(void* lpstring, uint32_t flags) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomW(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalDeleteAtom(uint16_t natom) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalDeleteAtom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(natom);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)natom;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalFindAtomA(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFindAtomA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_dataexchange_globalFindAtomW(void* lpstring) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFindAtomW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalGetAtomNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(natom, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalGetAtomNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(natom, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(void* hwndclient, void* hwndserver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateDdeClientWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndclient, hwndserver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndclient;
    (void)hwndserver;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_initAtomTable(uint32_t nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitAtomTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(uint32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsClipboardFormatAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_openClipboard(void* hwndnewowner) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndnewowner);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndnewowner;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_dataexchange_packDDElParam(uint32_t msg, uint64_t uilo, uint64_t uihi) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackDDElParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, uilo, uihi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    (void)uilo;
    (void)uihi;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(void* lpszformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClipboardFormatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszformat;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(void* lpszformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClipboardFormatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszformat;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClipboardFormatListener");
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

int64_t windowssys_windows_win32_system_dataexchange_reuseDDElParam(int64_t lparam, uint32_t msgin, uint32_t msgout, uint64_t uilo, uint64_t uihi) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReuseDDElParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lparam, msgin, msgout, uilo, uihi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lparam;
    (void)msgin;
    (void)msgout;
    (void)uilo;
    (void)uihi;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_dataexchange_setClipboardData(uint32_t uformat, void* hmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClipboardData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uformat, hmem);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uformat;
    (void)hmem;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_setClipboardViewer(void* hwndnewviewer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClipboardViewer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndnewviewer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndnewviewer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(uint32_t nsize, void* lpmeta16data, void* hdcref, void* lpmfp) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWinMetaFileBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nsize, lpmeta16data, hdcref, lpmfp);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nsize;
    (void)lpmeta16data;
    (void)hdcref;
    (void)lpmfp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_dataexchange_unpackDDElParam(uint32_t msg, int64_t lparam, void* puilo, void* puihi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnpackDDElParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, lparam, puilo, puihi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    (void)lparam;
    (void)puilo;
    (void)puihi;
    errno = ENOSYS;
    return -1;
#endif
}

