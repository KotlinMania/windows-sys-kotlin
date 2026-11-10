#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_tpmbaseservices_wrapper.h"
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

int32_t windowssys_windows_win32_system_tpmbaseservices_getDeviceID(void* pbwindowsaik, uint32_t cbwindowsaik, void* pcbresult, void* pfprotectedbytpm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbwindowsaik, cbwindowsaik, pcbresult, pfprotectedbytpm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbwindowsaik;
    (void)cbwindowsaik;
    (void)pcbresult;
    (void)pfprotectedbytpm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString(void* pszwindowsaik, uint32_t cchwindowsaik, void* pcchresult, void* pfprotectedbytpm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceIDString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszwindowsaik, cchwindowsaik, pcchresult, pfprotectedbytpm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszwindowsaik;
    (void)cchwindowsaik;
    (void)pcchresult;
    (void)pfprotectedbytpm;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate(void* pcontextparams, void* phcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Context_Create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontextparams, phcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcontextparams;
    (void)phcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(uint32_t keyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Create_Windows_Key");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)keyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(uint32_t size, void* info) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_GetDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size, info);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)size;
    (void)info;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth(void* hcontext, uint32_t ownerauthtype, void* poutputbuf, void* poutputbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Get_OwnerAuth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, ownerauthtype, poutputbuf, poutputbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcontext;
    (void)ownerauthtype;
    (void)poutputbuf;
    (void)poutputbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog(void* hcontext, void* poutputbuf, void* poutputbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Get_TCG_Log");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, poutputbuf, poutputbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcontext;
    (void)poutputbuf;
    (void)poutputbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(uint32_t logtype, void* pboutput, void* pcboutput) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Get_TCG_Log_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logtype, pboutput, pcboutput);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)logtype;
    (void)pboutput;
    (void)pcboutput;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Is_Tpm_Present");
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

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand(void* hcontext, void* pabinput, uint32_t cbinput, void* paboutput, void* pcboutput) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Physical_Presence_Command");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, pabinput, cbinput, paboutput, pcboutput);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcontext;
    (void)pabinput;
    (void)cbinput;
    (void)paboutput;
    (void)pcboutput;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Revoke_Attestation");
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

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands(void* hcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsip_Cancel_Commands");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose(void* hcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsip_Context_Close");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand(void* hcontext, uint32_t locality, uint32_t priority, void* pabcommand, uint32_t cbcommand, void* pabresult, void* pcbresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsip_Submit_Command");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, locality, priority, pabcommand, cbcommand, pabresult, pcbresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcontext;
    (void)locality;
    (void)priority;
    (void)pabcommand;
    (void)cbcommand;
    (void)pabresult;
    (void)pcbresult;
    errno = ENOSYS;
    return 0;
#endif
}

