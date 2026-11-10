#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_services_wrapper.h"
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

int32_t windowssys_windows_win32_system_services_changeServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfig2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwinfolevel, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_changeServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfig2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwinfolevel, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_changeServiceConfigA(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword, lpdisplayname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    (void)lpdisplayname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_changeServiceConfigW(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword, lpdisplayname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    (void)lpdisplayname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_closeServiceHandle(void* hscobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseServiceHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_controlService(void* hservice, uint32_t dwcontrol, void* lpservicestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwcontrol, lpservicestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwcontrol;
    (void)lpservicestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_controlServiceExA(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlServiceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwcontrol, dwinfolevel, pcontrolparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwcontrol;
    (void)dwinfolevel;
    (void)pcontrolparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_controlServiceExW(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlServiceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwcontrol, dwinfolevel, pcontrolparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwcontrol;
    (void)dwinfolevel;
    (void)pcontrolparams;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_services_createServiceA(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateServiceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpservicename, lpdisplayname, dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)dwdesiredaccess;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_createServiceW(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateServiceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpservicename, lpdisplayname, dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)dwdesiredaccess;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_services_deleteService(void* hservice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_enumDependentServicesA(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDependentServicesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwservicestate, lpservices, cbbufsize, pcbbytesneeded, lpservicesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_enumDependentServicesW(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDependentServicesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwservicestate, lpservices, cbbufsize, pcbbytesneeded, lpservicesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_enumServicesStatusA(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, dwservicetype, dwservicestate, lpservices, cbbufsize, pcbbytesneeded, lpservicesreturned, lpresumehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_enumServicesStatusExA(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, infolevel, dwservicetype, dwservicestate, lpservices, cbbufsize, pcbbytesneeded, lpservicesreturned, lpresumehandle, pszgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)infolevel;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    (void)pszgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_enumServicesStatusExW(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, infolevel, dwservicetype, dwservicestate, lpservices, cbbufsize, pcbbytesneeded, lpservicesreturned, lpresumehandle, pszgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)infolevel;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    (void)pszgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_enumServicesStatusW(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, dwservicetype, dwservicestate, lpservices, cbbufsize, pcbbytesneeded, lpservicesreturned, lpresumehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_services_getServiceDirectory(void* hservicestatus, int32_t edirectorytype, void* lppathbuffer, uint32_t cchpathbufferlength, void* lpcchrequiredbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservicestatus, edirectorytype, lppathbuffer, cchpathbufferlength, lpcchrequiredbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservicestatus;
    (void)edirectorytype;
    (void)lppathbuffer;
    (void)cchpathbufferlength;
    (void)lpcchrequiredbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_services_getServiceDisplayNameA(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDisplayNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpservicename, lpdisplayname, lpcchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)lpcchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_getServiceDisplayNameW(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDisplayNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpservicename, lpdisplayname, lpcchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)lpcchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_getServiceKeyNameA(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceKeyNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpdisplayname, lpservicename, lpcchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)lpdisplayname;
    (void)lpservicename;
    (void)lpcchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_getServiceKeyNameW(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceKeyNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpdisplayname, lpservicename, lpcchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)lpdisplayname;
    (void)lpservicename;
    (void)lpcchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_services_getServiceRegistryStateKey(void* servicestatushandle, int32_t statetype, uint32_t accessmask, void* servicestatekey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceRegistryStateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicestatushandle, statetype, accessmask, servicestatekey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicestatushandle;
    (void)statetype;
    (void)accessmask;
    (void)servicestatekey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_services_getSharedServiceDirectory(void* servicehandle, int32_t directorytype, void* pathbuffer, uint32_t pathbufferlength, void* requiredbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-5.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSharedServiceDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehandle, directorytype, pathbuffer, pathbufferlength, requiredbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicehandle;
    (void)directorytype;
    (void)pathbuffer;
    (void)pathbufferlength;
    (void)requiredbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey(void* servicehandle, int32_t statetype, uint32_t accessmask, void* servicestatekey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-5.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSharedServiceRegistryStateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehandle, statetype, accessmask, servicestatekey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicehandle;
    (void)statetype;
    (void)accessmask;
    (void)servicestatekey;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_services_lockServiceDatabase(void* hscmanager) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockServiceDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hscmanager;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_services_notifyBootConfigStatus(int32_t bootacceptable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyBootConfigStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bootacceptable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bootacceptable;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_services_notifyServiceStatusChangeA(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyServiceStatusChangeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwnotifymask, pnotifybuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservice;
    (void)dwnotifymask;
    (void)pnotifybuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_services_notifyServiceStatusChangeW(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyServiceStatusChangeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwnotifymask, pnotifybuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservice;
    (void)dwnotifymask;
    (void)pnotifybuffer;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_services_openSCManagerA(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSCManagerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpdatabasename, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmachinename;
    (void)lpdatabasename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_openSCManagerW(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSCManagerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpdatabasename, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmachinename;
    (void)lpdatabasename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_openServiceA(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenServiceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpservicename, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_openServiceW(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenServiceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lpservicename, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfig2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwinfolevel, lpbuffer, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfig2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwinfolevel, lpbuffer, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceConfigA(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, lpserviceconfig, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)lpserviceconfig;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceConfigW(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, lpserviceconfig, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)lpserviceconfig;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceDynamicInformation(void* hservicestatus, uint32_t dwinfolevel, void* ppdynamicinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceDynamicInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservicestatus, dwinfolevel, ppdynamicinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservicestatus;
    (void)dwinfolevel;
    (void)ppdynamicinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceLockStatusA(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceLockStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lplockstatus, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)lplockstatus;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceLockStatusW(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceLockStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hscmanager, lplockstatus, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hscmanager;
    (void)lplockstatus;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwsecurityinformation, lpsecuritydescriptor, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwsecurityinformation;
    (void)lpsecuritydescriptor;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceStatus(void* hservice, void* lpservicestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, lpservicestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)lpservicestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_queryServiceStatusEx(void* hservice, int32_t infolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceStatusEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, infolevel, lpbuffer, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)infolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerA(void* lpservicename, void* lphandlerproc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicename, lphandlerproc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA(void* lpservicename, void* lphandlerproc, void* lpcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicename, lphandlerproc, lpcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    (void)lpcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW(void* lpservicename, void* lphandlerproc, void* lpcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicename, lphandlerproc, lpcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    (void)lpcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerW(void* lpservicename, void* lphandlerproc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicename, lphandlerproc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_services_setServiceBits(void* hservicestatus, uint32_t dwservicebits, int32_t bsetbitson, int32_t bupdateimmediately) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservicestatus, dwservicebits, bsetbitson, bupdateimmediately);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservicestatus;
    (void)dwservicebits;
    (void)bsetbitson;
    (void)bupdateimmediately;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_setServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwsecurityinformation, lpsecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwsecurityinformation;
    (void)lpsecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_setServiceStatus(void* hservicestatus, void* lpservicestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservicestatus, lpservicestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservicestatus;
    (void)lpservicestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_startServiceA(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwnumserviceargs, lpserviceargvectors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwnumserviceargs;
    (void)lpserviceargvectors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_startServiceCtrlDispatcherA(void* lpservicestarttable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceCtrlDispatcherA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicestarttable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpservicestarttable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_startServiceCtrlDispatcherW(void* lpservicestarttable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceCtrlDispatcherW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicestarttable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpservicestarttable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_services_startServiceW(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwnumserviceargs, lpserviceargvectors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)dwnumserviceargs;
    (void)lpserviceargvectors;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_services_subscribeServiceChangeNotifications(void* hservice, int32_t eeventtype, void* pcallback, void* pcallbackcontext, void* psubscription) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sechost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubscribeServiceChangeNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, eeventtype, pcallback, pcallbackcontext, psubscription);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservice;
    (void)eeventtype;
    (void)pcallback;
    (void)pcallbackcontext;
    (void)psubscription;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_services_unlockServiceDatabase(void* sclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockServiceDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sclock;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(int64_t psubscription) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sechost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnsubscribeServiceChangeNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(psubscription);
        return;
    }
    errno = ENOSYS;
#else
    (void)psubscription;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_services_waitServiceState(void* hservice, uint32_t dwnotify, uint32_t dwtimeout, void* hcancelevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitServiceState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, dwnotify, dwtimeout, hcancelevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservice;
    (void)dwnotify;
    (void)dwtimeout;
    (void)hcancelevent;
    errno = ENOSYS;
    return 0;
#endif
}

