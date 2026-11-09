#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_tapi_wrapper.h"
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

int32_t windowssys_windows_win32_devices_tapi_GetTnefStreamCodepage(void* lpstream, void* lpulcodepage, void* lpulsubcodepage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTnefStreamCodepage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstream, lpulcodepage, lpulsubcodepage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstream;
    (void)lpulcodepage;
    (void)lpulsubcodepage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_OpenTnefStream(void* lpvsupport, void* lpstream, void* lpszstreamname, uint32_t ulflags, void* lpmessage, uint16_t wkeyval, void* lpptnef) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTnefStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpvsupport, lpstream, lpszstreamname, ulflags, lpmessage, wkeyval, lpptnef);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpvsupport;
    (void)lpstream;
    (void)lpszstreamname;
    (void)ulflags;
    (void)lpmessage;
    (void)wkeyval;
    (void)lpptnef;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_OpenTnefStreamEx(void* lpvsupport, void* lpstream, void* lpszstreamname, uint32_t ulflags, void* lpmessage, uint16_t wkeyval, void* lpadressbook, void* lpptnef) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTnefStreamEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpvsupport, lpstream, lpszstreamname, ulflags, lpmessage, wkeyval, lpadressbook, lpptnef);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpvsupport;
    (void)lpstream;
    (void)lpszstreamname;
    (void)ulflags;
    (void)lpmessage;
    (void)wkeyval;
    (void)lpadressbook;
    (void)lpptnef;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAccept(uint32_t hcall, void* lpsuseruserinfo, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAccept");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpsuseruserinfo, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAddProvider(void* lpszproviderfilename, void* hwndowner, void* lpdwpermanentproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszproviderfilename, hwndowner, lpdwpermanentproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAddProviderA(void* lpszproviderfilename, void* hwndowner, void* lpdwpermanentproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProviderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszproviderfilename, hwndowner, lpdwpermanentproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAddProviderW(void* lpszproviderfilename, void* hwndowner, void* lpdwpermanentproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProviderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszproviderfilename, hwndowner, lpdwpermanentproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAddToConference(uint32_t hconfcall, uint32_t hconsultcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddToConference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconfcall, hconsultcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconfcall;
    (void)hconsultcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAgentSpecific(uint32_t hline, uint32_t dwaddressid, uint32_t dwagentextensionidindex, void* lpparams, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAgentSpecific");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, dwagentextensionidindex, lpparams, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwagentextensionidindex;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineAnswer(uint32_t hcall, void* lpsuseruserinfo, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAnswer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpsuseruserinfo, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineBlindTransfer(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineBlindTransferA(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransferA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineBlindTransferW(uint32_t hcall, void* lpszdestaddressw, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransferW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddressw, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddressw;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineClose(uint32_t hline) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineCompleteCall(uint32_t hcall, void* lpdwcompletionid, uint32_t dwcompletionmode, uint32_t dwmessageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCompleteCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpdwcompletionid, dwcompletionmode, dwmessageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpdwcompletionid;
    (void)dwcompletionmode;
    (void)dwmessageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineCompleteTransfer(uint32_t hcall, uint32_t hconsultcall, void* lphconfcall, uint32_t dwtransfermode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCompleteTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, hconsultcall, lphconfcall, dwtransfermode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)hconsultcall;
    (void)lphconfcall;
    (void)dwtransfermode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigDialog(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigDialogA(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass, void* lpdeviceconfigin, uint32_t dwsize, void* lpdeviceconfigout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEdit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize, lpdeviceconfigout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass, void* lpdeviceconfigin, uint32_t dwsize, void* lpdeviceconfigout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEditA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize, lpdeviceconfigout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass, void* lpdeviceconfigin, uint32_t dwsize, void* lpdeviceconfigout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEditW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass, lpdeviceconfigin, dwsize, lpdeviceconfigout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigDialogW(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineConfigProvider(void* hwndowner, uint32_t dwpermanentproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, dwpermanentproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)dwpermanentproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineCreateAgentA(uint32_t hline, void* lpszagentid, void* lpszagentpin, void* lphagent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpszagentid, lpszagentpin, lphagent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpszagentid;
    (void)lpszagentpin;
    (void)lphagent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(uint32_t hline, uint32_t hagent, void* lpszagentpin, uint32_t dwworkingaddressid, void* lpgroupid, void* lphagentsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentSessionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagent, lpszagentpin, dwworkingaddressid, lpgroupid, lphagentsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpszagentpin;
    (void)dwworkingaddressid;
    (void)lpgroupid;
    (void)lphagentsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(uint32_t hline, uint32_t hagent, void* lpszagentpin, uint32_t dwworkingaddressid, void* lpgroupid, void* lphagentsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentSessionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagent, lpszagentpin, dwworkingaddressid, lpgroupid, lphagentsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpszagentpin;
    (void)dwworkingaddressid;
    (void)lpgroupid;
    (void)lphagentsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineCreateAgentW(uint32_t hline, void* lpszagentid, void* lpszagentpin, void* lphagent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpszagentid, lpszagentpin, lphagent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpszagentid;
    (void)lpszagentpin;
    (void)lphagent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDeallocateCall(uint32_t hcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDeallocateCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDevSpecific(uint32_t hline, uint32_t dwaddressid, uint32_t hcall, void* lpparams, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDevSpecific");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, hcall, lpparams, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(uint32_t hline, uint32_t dwfeature, void* lpparams, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDevSpecificFeature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwfeature, lpparams, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwfeature;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDial(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDialA(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDialW(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineDrop(uint32_t hcall, void* lpsuseruserinfo, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDrop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpsuseruserinfo, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineForward(uint32_t hline, uint32_t balladdresses, uint32_t dwaddressid, void* lpforwardlist, uint32_t dwnumringsnoanswer, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForward");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, balladdresses, dwaddressid, lpforwardlist, dwnumringsnoanswer, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineForwardA(uint32_t hline, uint32_t balladdresses, uint32_t dwaddressid, void* lpforwardlist, uint32_t dwnumringsnoanswer, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForwardA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, balladdresses, dwaddressid, lpforwardlist, dwnumringsnoanswer, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineForwardW(uint32_t hline, uint32_t balladdresses, uint32_t dwaddressid, void* lpforwardlist, uint32_t dwnumringsnoanswer, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForwardW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, balladdresses, dwaddressid, lpforwardlist, dwnumringsnoanswer, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGatherDigits(uint32_t hcall, uint32_t dwdigitmodes, void* lpsdigits, uint32_t dwnumdigits, void* lpszterminationdigits, uint32_t dwfirstdigittimeout, uint32_t dwinterdigittimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmodes, lpsdigits, dwnumdigits, lpszterminationdigits, dwfirstdigittimeout, dwinterdigittimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGatherDigitsA(uint32_t hcall, uint32_t dwdigitmodes, void* lpsdigits, uint32_t dwnumdigits, void* lpszterminationdigits, uint32_t dwfirstdigittimeout, uint32_t dwinterdigittimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigitsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmodes, lpsdigits, dwnumdigits, lpszterminationdigits, dwfirstdigittimeout, dwinterdigittimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGatherDigitsW(uint32_t hcall, uint32_t dwdigitmodes, void* lpsdigits, uint32_t dwnumdigits, void* lpszterminationdigits, uint32_t dwfirstdigittimeout, uint32_t dwinterdigittimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigitsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmodes, lpsdigits, dwnumdigits, lpszterminationdigits, dwfirstdigittimeout, dwinterdigittimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGenerateDigits(uint32_t hcall, uint32_t dwdigitmode, void* lpszdigits, uint32_t dwduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmode, lpszdigits, dwduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(uint32_t hcall, uint32_t dwdigitmode, void* lpszdigits, uint32_t dwduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigitsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmode, lpszdigits, dwduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(uint32_t hcall, uint32_t dwdigitmode, void* lpszdigits, uint32_t dwduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigitsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmode, lpszdigits, dwduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGenerateTone(uint32_t hcall, uint32_t dwtonemode, uint32_t dwduration, uint32_t dwnumtones, void* lptones) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateTone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwtonemode, dwduration, dwnumtones, lptones);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwtonemode;
    (void)dwduration;
    (void)dwnumtones;
    (void)lptones;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressCaps(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwaddressid, uint32_t dwapiversion, uint32_t dwextversion, void* lpaddresscaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwaddressid, uint32_t dwapiversion, uint32_t dwextversion, void* lpaddresscaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwaddressid, uint32_t dwapiversion, uint32_t dwextversion, void* lpaddresscaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressID(uint32_t hline, void* lpdwaddressid, uint32_t dwaddressmode, void* lpsaddress, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpdwaddressid, dwaddressmode, lpsaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressIDA(uint32_t hline, void* lpdwaddressid, uint32_t dwaddressmode, void* lpsaddress, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressIDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpdwaddressid, dwaddressmode, lpsaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressIDW(uint32_t hline, void* lpdwaddressid, uint32_t dwaddressmode, void* lpsaddress, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressIDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpdwaddressid, dwaddressmode, lpsaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressStatus(uint32_t hline, uint32_t dwaddressid, void* lpaddressstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpaddressstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(uint32_t hline, uint32_t dwaddressid, void* lpaddressstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpaddressstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(uint32_t hline, uint32_t dwaddressid, void* lpaddressstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpaddressstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(uint32_t hline, uint32_t dwaddressid, void* lpagentactivitylist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentActivityListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentactivitylist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentactivitylist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(uint32_t hline, uint32_t dwaddressid, void* lpagentactivitylist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentActivityListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentactivitylist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentactivitylist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwaddressid, uint32_t dwappapiversion, void* lpagentcaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwaddressid, dwappapiversion, lpagentcaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwappapiversion;
    (void)lpagentcaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwaddressid, uint32_t dwappapiversion, void* lpagentcaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwaddressid, dwappapiversion, lpagentcaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwappapiversion;
    (void)lpagentcaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(uint32_t hline, uint32_t dwaddressid, void* lpagentgrouplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentGroupListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentgrouplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(uint32_t hline, uint32_t dwaddressid, void* lpagentgrouplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentGroupListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentgrouplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentInfo(uint32_t hline, uint32_t hagent, void* lpagentinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagent, lpagentinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpagentinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(uint32_t hline, uint32_t hagentsession, void* lpagentsessioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentSessionInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagentsession, lpagentsessioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagentsession;
    (void)lpagentsessioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(uint32_t hline, uint32_t hagent, void* lpagentsessionlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentSessionList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagent, lpagentsessionlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpagentsessionlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(uint32_t hline, uint32_t dwaddressid, void* lpagentstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(uint32_t hline, uint32_t dwaddressid, void* lpagentstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAppPriority(void* lpszappfilename, uint32_t dwmediamode, void* lpextensionid, uint32_t dwrequestmode, void* lpextensionname, void* lpdwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszappfilename, dwmediamode, lpextensionid, dwrequestmode, lpextensionname, lpdwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAppPriorityA(void* lpszappfilename, uint32_t dwmediamode, void* lpextensionid, uint32_t dwrequestmode, void* lpextensionname, void* lpdwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriorityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszappfilename, dwmediamode, lpextensionid, dwrequestmode, lpextensionname, lpdwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetAppPriorityW(void* lpszappfilename, uint32_t dwmediamode, void* lpextensionid, uint32_t dwrequestmode, void* lpextensionname, void* lpdwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriorityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszappfilename, dwmediamode, lpextensionid, dwrequestmode, lpextensionname, lpdwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCallInfo(uint32_t hcall, void* lpcallinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpcallinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpcallinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCallInfoA(uint32_t hcall, void* lpcallinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpcallinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpcallinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCallInfoW(uint32_t hcall, void* lpcallinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpcallinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpcallinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCallStatus(uint32_t hcall, void* lpcallstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpcallstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpcallstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(uint32_t hcall, void* lpcalllist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetConfRelatedCalls");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpcalllist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpcalllist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCountry(uint32_t dwcountryid, uint32_t dwapiversion, void* lplinecountrylist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcountryid, dwapiversion, lplinecountrylist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCountryA(uint32_t dwcountryid, uint32_t dwapiversion, void* lplinecountrylist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcountryid, dwapiversion, lplinecountrylist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetCountryW(uint32_t dwcountryid, uint32_t dwapiversion, void* lplinecountrylist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcountryid, dwapiversion, lplinecountrylist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetDevCaps(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextversion, void* lplinedevcaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetDevCapsA(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextversion, void* lplinedevcaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetDevCapsW(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextversion, void* lplinedevcaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetDevConfig(uint32_t dwdeviceid, void* lpdeviceconfig, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpdeviceconfig, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetDevConfigA(uint32_t dwdeviceid, void* lpdeviceconfig, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpdeviceconfig, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetDevConfigW(uint32_t dwdeviceid, void* lpdeviceconfig, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpdeviceconfig, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetGroupListA(uint32_t hline, void* lpgrouplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetGroupListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpgrouplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpgrouplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetGroupListW(uint32_t hline, void* lpgrouplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetGroupListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpgrouplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpgrouplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetID(uint32_t hline, uint32_t dwaddressid, uint32_t hcall, uint32_t dwselect, void* lpdeviceid, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, hcall, dwselect, lpdeviceid, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetIDA(uint32_t hline, uint32_t dwaddressid, uint32_t hcall, uint32_t dwselect, void* lpdeviceid, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, hcall, dwselect, lpdeviceid, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetIDW(uint32_t hline, uint32_t dwaddressid, uint32_t hcall, uint32_t dwselect, void* lpdeviceid, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, hcall, dwselect, lpdeviceid, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetIcon(uint32_t dwdeviceid, void* lpszdeviceclass, void* lphicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpszdeviceclass, lphicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetIconA(uint32_t dwdeviceid, void* lpszdeviceclass, void* lphicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpszdeviceclass, lphicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetIconW(uint32_t dwdeviceid, void* lpszdeviceclass, void* lphicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpszdeviceclass, lphicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(uint32_t hline, void* lplinedevstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lplinedevstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lplinedevstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(uint32_t hline, void* lplinedevstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lplinedevstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lplinedevstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(uint32_t hline, void* lplinedevstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lplinedevstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lplinedevstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetMessage(uint32_t hlineapp, void* lpmessage, uint32_t dwtimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, lpmessage, dwtimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)lpmessage;
    (void)dwtimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetNewCalls(uint32_t hline, uint32_t dwaddressid, uint32_t dwselect, void* lpcalllist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetNewCalls");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, dwselect, lpcalllist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwselect;
    (void)lpcalllist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetNumRings(uint32_t hline, uint32_t dwaddressid, void* lpdwnumrings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetNumRings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpdwnumrings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpdwnumrings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetProviderList(uint32_t dwapiversion, void* lpproviderlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwapiversion, lpproviderlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetProviderListA(uint32_t dwapiversion, void* lpproviderlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwapiversion, lpproviderlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetProviderListW(uint32_t dwapiversion, void* lpproviderlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwapiversion, lpproviderlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetProxyStatus(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwappapiversion, void* lplineproxyreqestlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProxyStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwappapiversion, lplineproxyreqestlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwappapiversion;
    (void)lplineproxyreqestlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetQueueInfo(uint32_t hline, uint32_t dwqueueid, void* lplinequeueinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwqueueid, lplinequeueinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwqueueid;
    (void)lplinequeueinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetQueueListA(uint32_t hline, void* lpgroupid, void* lpqueuelist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpgroupid, lpqueuelist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpgroupid;
    (void)lpqueuelist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetQueueListW(uint32_t hline, void* lpgroupid, void* lpqueuelist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpgroupid, lpqueuelist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpgroupid;
    (void)lpqueuelist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetRequest(uint32_t hlineapp, uint32_t dwrequestmode, void* lprequestbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwrequestmode, lprequestbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetRequestA(uint32_t hlineapp, uint32_t dwrequestmode, void* lprequestbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequestA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwrequestmode, lprequestbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetRequestW(uint32_t hlineapp, uint32_t dwrequestmode, void* lprequestbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequestW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwrequestmode, lprequestbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetStatusMessages(uint32_t hline, void* lpdwlinestates, void* lpdwaddressstates) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetStatusMessages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpdwlinestates, lpdwaddressstates);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpdwlinestates;
    (void)lpdwaddressstates;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(uint32_t hlineapp, uint32_t dwapiversion, void* lptranslatecaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwapiversion, lptranslatecaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(uint32_t hlineapp, uint32_t dwapiversion, void* lptranslatecaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwapiversion, lptranslatecaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(uint32_t hlineapp, uint32_t dwapiversion, void* lptranslatecaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwapiversion, lptranslatecaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineHandoff(uint32_t hcall, void* lpszfilename, uint32_t dwmediamode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoff");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszfilename, dwmediamode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineHandoffA(uint32_t hcall, void* lpszfilename, uint32_t dwmediamode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoffA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszfilename, dwmediamode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineHandoffW(uint32_t hcall, void* lpszfilename, uint32_t dwmediamode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoffW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszfilename, dwmediamode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineHold(uint32_t hcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHold");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineInitialize(void* lphlineapp, void* hinstance, void* lpfncallback, void* lpszappname, void* lpdwnumdevs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphlineapp, hinstance, lpfncallback, lpszappname, lpdwnumdevs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszappname;
    (void)lpdwnumdevs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineInitializeExA(void* lphlineapp, void* hinstance, void* lpfncallback, void* lpszfriendlyappname, void* lpdwnumdevs, void* lpdwapiversion, void* lplineinitializeexparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitializeExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphlineapp, hinstance, lpfncallback, lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lplineinitializeexparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lplineinitializeexparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineInitializeExW(void* lphlineapp, void* hinstance, void* lpfncallback, void* lpszfriendlyappname, void* lpdwnumdevs, void* lpdwapiversion, void* lplineinitializeexparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitializeExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphlineapp, hinstance, lpfncallback, lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lplineinitializeexparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lplineinitializeexparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineMakeCall(uint32_t hline, void* lphcall, void* lpszdestaddress, uint32_t dwcountrycode, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lphcall, lpszdestaddress, dwcountrycode, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineMakeCallA(uint32_t hline, void* lphcall, void* lpszdestaddress, uint32_t dwcountrycode, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCallA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lphcall, lpszdestaddress, dwcountrycode, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineMakeCallW(uint32_t hline, void* lphcall, void* lpszdestaddress, uint32_t dwcountrycode, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCallW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lphcall, lpszdestaddress, dwcountrycode, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineMonitorDigits(uint32_t hcall, uint32_t dwdigitmodes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorDigits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwdigitmodes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineMonitorMedia(uint32_t hcall, uint32_t dwmediamodes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorMedia");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwmediamodes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwmediamodes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineMonitorTones(uint32_t hcall, void* lptonelist, uint32_t dwnumentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorTones");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lptonelist, dwnumentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lptonelist;
    (void)dwnumentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapilowversion, uint32_t dwapihighversion, void* lpdwapiversion, void* lpextensionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineNegotiateAPIVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapilowversion, dwapihighversion, lpdwapiversion, lpextensionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapilowversion;
    (void)dwapihighversion;
    (void)lpdwapiversion;
    (void)lpextensionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextlowversion, uint32_t dwexthighversion, void* lpdwextversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineNegotiateExtVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, dwextlowversion, dwexthighversion, lpdwextversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextlowversion;
    (void)dwexthighversion;
    (void)lpdwextversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineOpen(uint32_t hlineapp, uint32_t dwdeviceid, void* lphline, uint32_t dwapiversion, uint32_t dwextversion, uint64_t dwcallbackinstance, uint32_t dwprivileges, uint32_t dwmediamodes, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, lphline, dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lphline;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivileges;
    (void)dwmediamodes;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineOpenA(uint32_t hlineapp, uint32_t dwdeviceid, void* lphline, uint32_t dwapiversion, uint32_t dwextversion, uint64_t dwcallbackinstance, uint32_t dwprivileges, uint32_t dwmediamodes, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, lphline, dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lphline;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivileges;
    (void)dwmediamodes;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineOpenW(uint32_t hlineapp, uint32_t dwdeviceid, void* lphline, uint32_t dwapiversion, uint32_t dwextversion, uint64_t dwcallbackinstance, uint32_t dwprivileges, uint32_t dwmediamodes, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, lphline, dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lphline;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivileges;
    (void)dwmediamodes;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePark(uint32_t hcall, uint32_t dwparkmode, void* lpszdiraddress, void* lpnondiraddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwparkmode, lpszdiraddress, lpnondiraddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineParkA(uint32_t hcall, uint32_t dwparkmode, void* lpszdiraddress, void* lpnondiraddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineParkA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwparkmode, lpszdiraddress, lpnondiraddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineParkW(uint32_t hcall, uint32_t dwparkmode, void* lpszdiraddress, void* lpnondiraddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineParkW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwparkmode, lpszdiraddress, lpnondiraddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePickup(uint32_t hline, uint32_t dwaddressid, void* lphcall, void* lpszdestaddress, void* lpszgroupid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lphcall, lpszdestaddress, lpszgroupid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePickupA(uint32_t hline, uint32_t dwaddressid, void* lphcall, void* lpszdestaddress, void* lpszgroupid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lphcall, lpszdestaddress, lpszgroupid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePickupW(uint32_t hline, uint32_t dwaddressid, void* lphcall, void* lpszdestaddress, void* lpszgroupid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lphcall, lpszdestaddress, lpszgroupid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePrepareAddToConference(uint32_t hconfcall, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconfcall, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(uint32_t hconfcall, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConferenceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconfcall, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(uint32_t hconfcall, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConferenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconfcall, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineProxyMessage(uint32_t hline, uint32_t hcall, uint32_t dwmsg, uint32_t dwparam1, uint32_t dwparam2, uint32_t dwparam3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineProxyMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hcall, dwmsg, dwparam1, dwparam2, dwparam3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hcall;
    (void)dwmsg;
    (void)dwparam1;
    (void)dwparam2;
    (void)dwparam3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineProxyResponse(uint32_t hline, void* lpproxyrequest, uint32_t dwresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineProxyResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, lpproxyrequest, dwresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)lpproxyrequest;
    (void)dwresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineRedirect(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineRedirectA(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineRedirectW(uint32_t hcall, void* lpszdestaddress, uint32_t dwcountrycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpszdestaddress, dwcountrycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(uint32_t hlineapp, uint32_t dwregistrationinstance, uint32_t dwrequestmode, uint32_t benable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRegisterRequestRecipient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwregistrationinstance, dwrequestmode, benable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwregistrationinstance;
    (void)dwrequestmode;
    (void)benable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(uint32_t hcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineReleaseUserUserInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineRemoveFromConference(uint32_t hcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRemoveFromConference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineRemoveProvider(uint32_t dwpermanentproviderid, void* hwndowner) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRemoveProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwpermanentproviderid, hwndowner);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwpermanentproviderid;
    (void)hwndowner;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSecureCall(uint32_t hcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSecureCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(uint32_t hcall, void* lpsuseruserinfo, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSendUserUserInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpsuseruserinfo, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAgentActivity(uint32_t hline, uint32_t dwaddressid, uint32_t dwactivityid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentActivity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, dwactivityid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwactivityid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAgentGroup(uint32_t hline, uint32_t dwaddressid, void* lpagentgrouplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lpagentgrouplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(uint32_t hline, uint32_t hagent, uint32_t dwmeasurementperiod) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentMeasurementPeriod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagent, dwmeasurementperiod);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagent;
    (void)dwmeasurementperiod;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(uint32_t hline, uint32_t hagentsession, uint32_t dwagentsessionstate, uint32_t dwnextagentsessionstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentSessionState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagentsession, dwagentsessionstate, dwnextagentsessionstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagentsession;
    (void)dwagentsessionstate;
    (void)dwnextagentsessionstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAgentState(uint32_t hline, uint32_t dwaddressid, uint32_t dwagentstate, uint32_t dwnextagentstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, dwagentstate, dwnextagentstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwagentstate;
    (void)dwnextagentstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(uint32_t hline, uint32_t hagent, uint32_t dwagentstate, uint32_t dwnextagentstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentStateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, hagent, dwagentstate, dwnextagentstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)hagent;
    (void)dwagentstate;
    (void)dwnextagentstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAppPriority(void* lpszappfilename, uint32_t dwmediamode, void* lpextensionid, uint32_t dwrequestmode, void* lpszextensionname, uint32_t dwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszappfilename, dwmediamode, lpextensionid, dwrequestmode, lpszextensionname, dwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAppPriorityA(void* lpszappfilename, uint32_t dwmediamode, void* lpextensionid, uint32_t dwrequestmode, void* lpszextensionname, uint32_t dwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriorityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszappfilename, dwmediamode, lpextensionid, dwrequestmode, lpszextensionname, dwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAppPriorityW(void* lpszappfilename, uint32_t dwmediamode, void* lpextensionid, uint32_t dwrequestmode, void* lpszextensionname, uint32_t dwpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriorityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszappfilename, dwmediamode, lpextensionid, dwrequestmode, lpszextensionname, dwpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetAppSpecific(uint32_t hcall, uint32_t dwappspecific) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppSpecific");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwappspecific);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwappspecific;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetCallData(uint32_t hcall, void* lpcalldata, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpcalldata, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpcalldata;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetCallParams(uint32_t hcall, uint32_t dwbearermode, uint32_t dwminrate, uint32_t dwmaxrate, void* lpdialparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwbearermode, dwminrate, dwmaxrate, lpdialparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwbearermode;
    (void)dwminrate;
    (void)dwmaxrate;
    (void)lpdialparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(uint32_t hcall, uint32_t dwcallprivilege) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallPrivilege");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwcallprivilege);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwcallprivilege;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(uint32_t hcall, void* lpsendingflowspec, uint32_t dwsendingflowspecsize, void* lpreceivingflowspec, uint32_t dwreceivingflowspecsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallQualityOfService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lpsendingflowspec, dwsendingflowspecsize, lpreceivingflowspec, dwreceivingflowspecsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lpsendingflowspec;
    (void)dwsendingflowspecsize;
    (void)lpreceivingflowspec;
    (void)dwreceivingflowspecsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetCallTreatment(uint32_t hcall, uint32_t dwtreatment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallTreatment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwtreatment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwtreatment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(uint32_t hlineapp, uint32_t dwlocation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCurrentLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwlocation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwlocation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetDevConfig(uint32_t dwdeviceid, void* lpdeviceconfig, uint32_t dwsize, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpdeviceconfig, dwsize, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetDevConfigA(uint32_t dwdeviceid, void* lpdeviceconfig, uint32_t dwsize, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpdeviceconfig, dwsize, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetDevConfigW(uint32_t dwdeviceid, void* lpdeviceconfig, uint32_t dwsize, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpdeviceconfig, dwsize, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(uint32_t hline, uint32_t dwstatustochange, uint32_t fstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetLineDevStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwstatustochange, fstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwstatustochange;
    (void)fstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetMediaControl(uint32_t hline, uint32_t dwaddressid, uint32_t hcall, uint32_t dwselect, void* lpdigitlist, uint32_t dwdigitnumentries, void* lpmedialist, uint32_t dwmedianumentries, void* lptonelist, uint32_t dwtonenumentries, void* lpcallstatelist, uint32_t dwcallstatenumentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetMediaControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, hcall, dwselect, lpdigitlist, dwdigitnumentries, lpmedialist, dwmedianumentries, lptonelist, dwtonenumentries, lpcallstatelist, dwcallstatenumentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdigitlist;
    (void)dwdigitnumentries;
    (void)lpmedialist;
    (void)dwmedianumentries;
    (void)lptonelist;
    (void)dwtonenumentries;
    (void)lpcallstatelist;
    (void)dwcallstatenumentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetMediaMode(uint32_t hcall, uint32_t dwmediamodes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetMediaMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, dwmediamodes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)dwmediamodes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetNumRings(uint32_t hline, uint32_t dwaddressid, uint32_t dwnumrings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetNumRings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, dwnumrings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwnumrings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetQueueMeasurementPeriod(uint32_t hline, uint32_t dwqueueid, uint32_t dwmeasurementperiod) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetQueueMeasurementPeriod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwqueueid, dwmeasurementperiod);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwqueueid;
    (void)dwmeasurementperiod;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetStatusMessages(uint32_t hline, uint32_t dwlinestates, uint32_t dwaddressstates) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetStatusMessages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwlinestates, dwaddressstates);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwlinestates;
    (void)dwaddressstates;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetTerminal(uint32_t hline, uint32_t dwaddressid, uint32_t hcall, uint32_t dwselect, uint32_t dwterminalmodes, uint32_t dwterminalid, uint32_t benable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTerminal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, hcall, dwselect, dwterminalmodes, dwterminalid, benable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)dwterminalmodes;
    (void)dwterminalid;
    (void)benable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetTollList(uint32_t hlineapp, uint32_t dwdeviceid, void* lpszaddressin, uint32_t dwtolllistoption) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, lpszaddressin, dwtolllistoption);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressin;
    (void)dwtolllistoption;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetTollListA(uint32_t hlineapp, uint32_t dwdeviceid, void* lpszaddressin, uint32_t dwtolllistoption) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, lpszaddressin, dwtolllistoption);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressin;
    (void)dwtolllistoption;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetTollListW(uint32_t hlineapp, uint32_t dwdeviceid, void* lpszaddressinw, uint32_t dwtolllistoption) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, lpszaddressinw, dwtolllistoption);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressinw;
    (void)dwtolllistoption;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetupConference(uint32_t hcall, uint32_t hline, void* lphconfcall, void* lphconsultcall, uint32_t dwnumparties, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, hline, lphconfcall, lphconsultcall, dwnumparties, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetupConferenceA(uint32_t hcall, uint32_t hline, void* lphconfcall, void* lphconsultcall, uint32_t dwnumparties, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConferenceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, hline, lphconfcall, lphconsultcall, dwnumparties, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetupConferenceW(uint32_t hcall, uint32_t hline, void* lphconfcall, void* lphconsultcall, uint32_t dwnumparties, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConferenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, hline, lphconfcall, lphconsultcall, dwnumparties, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetupTransfer(uint32_t hcall, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetupTransferA(uint32_t hcall, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransferA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSetupTransferW(uint32_t hcall, void* lphconsultcall, void* lpcallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransferW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall, lphconsultcall, lpcallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineShutdown(uint32_t hlineapp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineSwapHold(uint32_t hactivecall, uint32_t hheldcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSwapHold");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hactivecall, hheldcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hactivecall;
    (void)hheldcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineTranslateAddress(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, void* lpszaddressin, uint32_t dwcard, uint32_t dwtranslateoptions, void* lptranslateoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, lpszaddressin, dwcard, dwtranslateoptions, lptranslateoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineTranslateAddressA(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, void* lpszaddressin, uint32_t dwcard, uint32_t dwtranslateoptions, void* lptranslateoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, lpszaddressin, dwcard, dwtranslateoptions, lptranslateoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineTranslateAddressW(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, void* lpszaddressin, uint32_t dwcard, uint32_t dwtranslateoptions, void* lptranslateoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, lpszaddressin, dwcard, dwtranslateoptions, lptranslateoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineTranslateDialog(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, void* hwndowner, void* lpszaddressin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, hwndowner, lpszaddressin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineTranslateDialogA(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, void* hwndowner, void* lpszaddressin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, hwndowner, lpszaddressin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineTranslateDialogW(uint32_t hlineapp, uint32_t dwdeviceid, uint32_t dwapiversion, void* hwndowner, void* lpszaddressin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlineapp, dwdeviceid, dwapiversion, hwndowner, lpszaddressin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineUncompleteCall(uint32_t hline, uint32_t dwcompletionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUncompleteCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwcompletionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwcompletionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineUnhold(uint32_t hcall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnhold");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcall;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineUnpark(uint32_t hline, uint32_t dwaddressid, void* lphcall, void* lpszdestaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnpark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lphcall, lpszdestaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineUnparkA(uint32_t hline, uint32_t dwaddressid, void* lphcall, void* lpszdestaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnparkA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lphcall, lpszdestaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_lineUnparkW(uint32_t hline, uint32_t dwaddressid, void* lphcall, void* lpszdestaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnparkW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hline, dwaddressid, lphcall, lpszdestaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneClose(uint32_t hphone) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneConfigDialog(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneConfigDialogA(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneConfigDialogW(uint32_t dwdeviceid, void* hwndowner, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, hwndowner, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneDevSpecific(uint32_t hphone, void* lpparams, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneDevSpecific");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpparams, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(uint32_t hphone, uint32_t dwbuttonlampid, void* lpbuttoninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpbuttoninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(uint32_t hphone, uint32_t dwbuttonlampid, void* lpbuttoninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpbuttoninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(uint32_t hphone, uint32_t dwbuttonlampid, void* lpbuttoninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpbuttoninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetData(uint32_t hphone, uint32_t dwdataid, void* lpdata, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwdataid, lpdata, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwdataid;
    (void)lpdata;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetDevCaps(uint32_t hphoneapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextversion, void* lpphonecaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(uint32_t hphoneapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextversion, void* lpphonecaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(uint32_t hphoneapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextversion, void* lpphonecaps) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetDisplay(uint32_t hphone, void* lpdisplay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDisplay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdisplay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdisplay;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetGain(uint32_t hphone, uint32_t dwhookswitchdev, void* lpdwgain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetGain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwhookswitchdev, lpdwgain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)lpdwgain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(uint32_t hphone, void* lpdwhookswitchdevs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetHookSwitch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdwhookswitchdevs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdwhookswitchdevs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetID(uint32_t hphone, void* lpdeviceid, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdeviceid, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetIDA(uint32_t hphone, void* lpdeviceid, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdeviceid, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetIDW(uint32_t hphone, void* lpdeviceid, void* lpszdeviceclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdeviceid, lpszdeviceclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetIcon(uint32_t dwdeviceid, void* lpszdeviceclass, void* lphicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpszdeviceclass, lphicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetIconA(uint32_t dwdeviceid, void* lpszdeviceclass, void* lphicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpszdeviceclass, lphicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetIconW(uint32_t dwdeviceid, void* lpszdeviceclass, void* lphicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdeviceid, lpszdeviceclass, lphicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetLamp(uint32_t hphone, uint32_t dwbuttonlampid, void* lpdwlampmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetLamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpdwlampmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpdwlampmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetMessage(uint32_t hphoneapp, void* lpmessage, uint32_t dwtimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, lpmessage, dwtimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)lpmessage;
    (void)dwtimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetRing(uint32_t hphone, void* lpdwringmode, void* lpdwvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetRing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdwringmode, lpdwvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdwringmode;
    (void)lpdwvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetStatus(uint32_t hphone, void* lpphonestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpphonestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpphonestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetStatusA(uint32_t hphone, void* lpphonestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpphonestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpphonestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(uint32_t hphone, void* lpdwphonestates, void* lpdwbuttonmodes, void* lpdwbuttonstates) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusMessages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpdwphonestates, lpdwbuttonmodes, lpdwbuttonstates);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpdwphonestates;
    (void)lpdwbuttonmodes;
    (void)lpdwbuttonstates;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetStatusW(uint32_t hphone, void* lpphonestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, lpphonestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)lpphonestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneGetVolume(uint32_t hphone, uint32_t dwhookswitchdev, void* lpdwvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwhookswitchdev, lpdwvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)lpdwvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneInitialize(void* lphphoneapp, void* hinstance, void* lpfncallback, void* lpszappname, void* lpdwnumdevs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphphoneapp, hinstance, lpfncallback, lpszappname, lpdwnumdevs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszappname;
    (void)lpdwnumdevs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneInitializeExA(void* lphphoneapp, void* hinstance, void* lpfncallback, void* lpszfriendlyappname, void* lpdwnumdevs, void* lpdwapiversion, void* lpphoneinitializeexparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitializeExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphphoneapp, hinstance, lpfncallback, lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lpphoneinitializeexparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lpphoneinitializeexparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneInitializeExW(void* lphphoneapp, void* hinstance, void* lpfncallback, void* lpszfriendlyappname, void* lpdwnumdevs, void* lpdwapiversion, void* lpphoneinitializeexparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitializeExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphphoneapp, hinstance, lpfncallback, lpszfriendlyappname, lpdwnumdevs, lpdwapiversion, lpphoneinitializeexparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lpphoneinitializeexparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(uint32_t hphoneapp, uint32_t dwdeviceid, uint32_t dwapilowversion, uint32_t dwapihighversion, void* lpdwapiversion, void* lpextensionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneNegotiateAPIVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, dwdeviceid, dwapilowversion, dwapihighversion, lpdwapiversion, lpextensionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapilowversion;
    (void)dwapihighversion;
    (void)lpdwapiversion;
    (void)lpextensionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(uint32_t hphoneapp, uint32_t dwdeviceid, uint32_t dwapiversion, uint32_t dwextlowversion, uint32_t dwexthighversion, void* lpdwextversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneNegotiateExtVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, dwdeviceid, dwapiversion, dwextlowversion, dwexthighversion, lpdwextversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextlowversion;
    (void)dwexthighversion;
    (void)lpdwextversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneOpen(uint32_t hphoneapp, uint32_t dwdeviceid, void* lphphone, uint32_t dwapiversion, uint32_t dwextversion, uint64_t dwcallbackinstance, uint32_t dwprivilege) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp, dwdeviceid, lphphone, dwapiversion, dwextversion, dwcallbackinstance, dwprivilege);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)lphphone;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivilege;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(uint32_t hphone, uint32_t dwbuttonlampid, void* lpbuttoninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpbuttoninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(uint32_t hphone, uint32_t dwbuttonlampid, void* lpbuttoninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpbuttoninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(uint32_t hphone, uint32_t dwbuttonlampid, void* lpbuttoninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, lpbuttoninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetData(uint32_t hphone, uint32_t dwdataid, void* lpdata, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwdataid, lpdata, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwdataid;
    (void)lpdata;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetDisplay(uint32_t hphone, uint32_t dwrow, uint32_t dwcolumn, void* lpsdisplay, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetDisplay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwrow, dwcolumn, lpsdisplay, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwrow;
    (void)dwcolumn;
    (void)lpsdisplay;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetGain(uint32_t hphone, uint32_t dwhookswitchdev, uint32_t dwgain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetGain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwhookswitchdev, dwgain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)dwgain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetHookSwitch(uint32_t hphone, uint32_t dwhookswitchdevs, uint32_t dwhookswitchmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetHookSwitch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwhookswitchdevs, dwhookswitchmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwhookswitchdevs;
    (void)dwhookswitchmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetLamp(uint32_t hphone, uint32_t dwbuttonlampid, uint32_t dwlampmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetLamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwbuttonlampid, dwlampmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)dwlampmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetRing(uint32_t hphone, uint32_t dwringmode, uint32_t dwvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetRing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwringmode, dwvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwringmode;
    (void)dwvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetStatusMessages(uint32_t hphone, uint32_t dwphonestates, uint32_t dwbuttonmodes, uint32_t dwbuttonstates) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetStatusMessages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwphonestates, dwbuttonmodes, dwbuttonstates);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwphonestates;
    (void)dwbuttonmodes;
    (void)dwbuttonstates;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneSetVolume(uint32_t hphone, uint32_t dwhookswitchdev, uint32_t dwvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphone, dwhookswitchdev, dwvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)dwvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_phoneShutdown(uint32_t hphoneapp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hphoneapp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hphoneapp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiGetLocationInfo(void* lpszcountrycode, void* lpszcitycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcountrycode, lpszcitycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszcountrycode;
    (void)lpszcitycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA(void* lpszcountrycode, void* lpszcitycode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcountrycode, lpszcitycode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszcountrycode;
    (void)lpszcitycode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW(void* lpszcountrycodew, void* lpszcitycodew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcountrycodew, lpszcitycodew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszcountrycodew;
    (void)lpszcitycodew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestDrop(void* hwnd, uint64_t wrequestid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestDrop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wrequestid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wrequestid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestMakeCall(void* lpszdestaddress, void* lpszappname, void* lpszcalledparty, void* lpszcomment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA(void* lpszdestaddress, void* lpszappname, void* lpszcalledparty, void* lpszcomment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCallA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW(void* lpszdestaddress, void* lpszappname, void* lpszcalledparty, void* lpszcomment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCallW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestMediaCall(void* hwnd, uint64_t wrequestid, void* lpszdeviceclass, void* lpdeviceid, uint32_t dwsize, uint32_t dwsecure, void* lpszdestaddress, void* lpszappname, void* lpszcalledparty, void* lpszcomment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wrequestid, lpszdeviceclass, lpdeviceid, dwsize, dwsecure, lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wrequestid;
    (void)lpszdeviceclass;
    (void)lpdeviceid;
    (void)dwsize;
    (void)dwsecure;
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA(void* hwnd, uint64_t wrequestid, void* lpszdeviceclass, void* lpdeviceid, uint32_t dwsize, uint32_t dwsecure, void* lpszdestaddress, void* lpszappname, void* lpszcalledparty, void* lpszcomment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCallA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wrequestid, lpszdeviceclass, lpdeviceid, dwsize, dwsecure, lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wrequestid;
    (void)lpszdeviceclass;
    (void)lpdeviceid;
    (void)dwsize;
    (void)dwsecure;
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW(void* hwnd, uint64_t wrequestid, void* lpszdeviceclass, void* lpdeviceid, uint32_t dwsize, uint32_t dwsecure, void* lpszdestaddress, void* lpszappname, void* lpszcalledparty, void* lpszcomment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCallW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wrequestid, lpszdeviceclass, lpdeviceid, dwsize, dwsecure, lpszdestaddress, lpszappname, lpszcalledparty, lpszcomment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wrequestid;
    (void)lpszdeviceclass;
    (void)lpdeviceid;
    (void)dwsize;
    (void)dwsecure;
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    return -1;
#endif
}

