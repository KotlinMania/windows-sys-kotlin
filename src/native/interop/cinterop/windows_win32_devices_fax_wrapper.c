#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_fax_wrapper.h"
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

int32_t windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fxsutility.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanSendToFaxRecipient");
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

int32_t windowssysWindowsWin32DevicesFaxFaxAbort(void* faxhandle, uint32_t jobid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxAbort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxAccessCheck(void* faxhandle, uint32_t accessmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxAccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, accessmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)accessmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxClose(void* faxhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(void* jobparams, void* coverpageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxCompleteJobParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(jobparams, coverpageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)jobparams;
    (void)coverpageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(void* jobparams, void* coverpageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxCompleteJobParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(jobparams, coverpageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)jobparams;
    (void)coverpageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(void* machinename, void* faxhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxConnectFaxServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinename, faxhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)machinename;
    (void)faxhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(void* machinename, void* faxhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxConnectFaxServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinename, faxhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)machinename;
    (void)faxhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(void* faxporthandle, void* routingguid, int32_t enabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnableRoutingMethodA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingguid, enabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)enabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(void* faxporthandle, void* routingguid, int32_t enabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnableRoutingMethodW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingguid, enabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)enabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(void* faxhandle, void* routinginfo, void* methodsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumGlobalRoutingInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, routinginfo, methodsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    (void)methodsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(void* faxhandle, void* routinginfo, void* methodsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumGlobalRoutingInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, routinginfo, methodsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    (void)methodsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumJobsA(void* faxhandle, void* jobentry, void* jobsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumJobsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobentry, jobsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobentry;
    (void)jobsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumJobsW(void* faxhandle, void* jobentry, void* jobsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumJobsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobentry, jobsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobentry;
    (void)jobsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumPortsA(void* faxhandle, void* portinfo, void* portsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumPortsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, portinfo, portsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)portinfo;
    (void)portsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumPortsW(void* faxhandle, void* portinfo, void* portsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumPortsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, portinfo, portsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)portinfo;
    (void)portsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(void* faxporthandle, void* routingmethod, void* methodsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumRoutingMethodsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingmethod, methodsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingmethod;
    (void)methodsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(void* faxporthandle, void* routingmethod, void* methodsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumRoutingMethodsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingmethod, methodsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingmethod;
    (void)methodsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32DevicesFaxFaxFreeBuffer(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(void* faxhandle, void* faxconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetConfigurationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, faxconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(void* faxhandle, void* faxconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetConfigurationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, faxconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(void* faxporthandle, void* devicestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetDeviceStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, devicestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)devicestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(void* faxporthandle, void* devicestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetDeviceStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, devicestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)devicestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetJobA(void* faxhandle, uint32_t jobid, void* jobentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetJobA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobid, jobentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)jobentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetJobW(void* faxhandle, uint32_t jobid, void* jobentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetJobW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobid, jobentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)jobentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(void* faxhandle, void* categories, void* numbercategories) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetLoggingCategoriesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, categories, numbercategories);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(void* faxhandle, void* categories, void* numbercategories) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetLoggingCategoriesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, categories, numbercategories);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetPageData(void* faxhandle, uint32_t jobid, void* buffer, void* buffersize, void* imagewidth, void* imageheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPageData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobid, buffer, buffersize, imagewidth, imageheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)buffer;
    (void)buffersize;
    (void)imagewidth;
    (void)imageheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetPortA(void* faxporthandle, void* portinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPortA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, portinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetPortW(void* faxporthandle, void* portinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPortW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, portinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetRoutingInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, void* routinginfobuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetRoutingInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(void* faxhandle, void* completionport, uint64_t completionkey, void* hwnd, uint32_t messagestart) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxInitializeEventQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, completionport, completionkey, hwnd, messagestart);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)completionport;
    (void)completionkey;
    (void)hwnd;
    (void)messagestart;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxOpenPort(void* faxhandle, uint32_t deviceid, uint32_t flags, void* faxporthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxOpenPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, deviceid, flags, faxporthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)deviceid;
    (void)flags;
    (void)faxporthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(void* faxcontextinfo, void* coverpageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxPrintCoverPageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxcontextinfo, coverpageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxcontextinfo;
    (void)coverpageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(void* faxcontextinfo, void* coverpageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxPrintCoverPageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxcontextinfo, coverpageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxcontextinfo;
    (void)coverpageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(void* faxhandle, void* extensionname, void* friendlyname, void* imagename, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxRegisterRoutingExtensionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, extensionname, friendlyname, imagename, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)extensionname;
    (void)friendlyname;
    (void)imagename;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(void* deviceprovider, void* friendlyname, void* imagename, void* tspname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxRegisterServiceProviderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceprovider, friendlyname, imagename, tspname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceprovider;
    (void)friendlyname;
    (void)imagename;
    (void)tspname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentA(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, filename, jobparams, coverpageinfo, faxjobid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)jobparams;
    (void)coverpageinfo;
    (void)faxjobid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentForBroadcastA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, filename, faxjobid, faxrecipientcallback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)faxjobid;
    (void)faxrecipientcallback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(void* faxhandle, void* filename, void* faxjobid, void* faxrecipientcallback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentForBroadcastW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, filename, faxjobid, faxrecipientcallback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)faxjobid;
    (void)faxrecipientcallback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSendDocumentW(void* faxhandle, void* filename, void* jobparams, void* coverpageinfo, void* faxjobid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, filename, jobparams, coverpageinfo, faxjobid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)jobparams;
    (void)coverpageinfo;
    (void)faxjobid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(void* faxhandle, void* faxconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetConfigurationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, faxconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(void* faxhandle, void* faxconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetConfigurationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, faxconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(void* faxhandle, void* routinginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetGlobalRoutingInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, routinginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(void* faxhandle, void* routinginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetGlobalRoutingInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, routinginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetJobA(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetJobA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobid, command, jobentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)command;
    (void)jobentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetJobW(void* faxhandle, uint32_t jobid, uint32_t command, void* jobentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetJobW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, jobid, command, jobentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)command;
    (void)jobentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(void* faxhandle, void* categories, uint32_t numbercategories) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetLoggingCategoriesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, categories, numbercategories);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(void* faxhandle, void* categories, uint32_t numbercategories) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetLoggingCategoriesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxhandle, categories, numbercategories);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetPortA(void* faxporthandle, void* portinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetPortA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, portinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetPortW(void* faxporthandle, void* portinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetPortW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, portinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetRoutingInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(void* faxporthandle, void* routingguid, void* routinginfobuffer, uint32_t routinginfobuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetRoutingInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxStartPrintJobA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(printername, printinfo, faxjobid, faxcontextinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)printername;
    (void)printinfo;
    (void)faxjobid;
    (void)faxcontextinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(void* printername, void* printinfo, void* faxjobid, void* faxcontextinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxStartPrintJobW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(printername, printinfo, faxjobid, faxcontextinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)printername;
    (void)printinfo;
    (void)faxjobid;
    (void)faxcontextinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(void* deviceprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxUnregisterServiceProviderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceprovider;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesFaxSendToFaxRecipient(int32_t sndmode, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fxsutility.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendToFaxRecipient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sndmode, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sndmode;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesFaxStiCreateInstanceW(void* hinst, uint32_t dwver, void* ppsti, void* punkouter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sti.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StiCreateInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, dwver, ppsti, punkouter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinst;
    (void)dwver;
    (void)ppsti;
    (void)punkouter;
    errno = ENOSYS;
    return -1;
#endif
}

