#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_networkdiagnosticsframework_wrapper.h"
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

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCancelIncident(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCancelIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCloseIncident(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCloseIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateConnectivityIncident(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateConnectivityIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateDNSIncident(void* hostname, uint16_t querytype, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateDNSIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, querytype, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hostname;
    (void)querytype;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateGroupingIncident(void* cloudname, void* groupname, void* identity, void* invitation, void* addresses, void* appid, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateGroupingIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cloudname, groupname, identity, invitation, addresses, appid, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cloudname;
    (void)groupname;
    (void)identity;
    (void)invitation;
    (void)addresses;
    (void)appid;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateIncident(void* helperclassname, uint32_t celt, void* attributes, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(helperclassname, celt, attributes, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)helperclassname;
    (void)celt;
    (void)attributes;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreatePnrpIncident(void* cloudname, void* peername, int32_t diagnosepublish, void* appid, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreatePnrpIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cloudname, peername, diagnosepublish, appid, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cloudname;
    (void)peername;
    (void)diagnosepublish;
    (void)appid;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateSharingIncident(void* uncpath, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateSharingIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncpath, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uncpath;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncident(void* url, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateWebIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(url, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)url;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncidentEx(void* url, int32_t usewinhttp, void* modulename, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateWebIncidentEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(url, usewinhttp, modulename, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)url;
    (void)usewinhttp;
    (void)modulename;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWinSockIncident(uint64_t sock, void* host, uint16_t port, void* appid, void* userid, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateWinSockIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sock, host, port, appid, userid, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sock;
    (void)host;
    (void)port;
    (void)appid;
    (void)userid;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfDiagnoseIncident(void* handle, void* rootcausecount, void* rootcauses, uint32_t dwwait, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfDiagnoseIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, rootcausecount, rootcauses, dwwait, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)rootcausecount;
    (void)rootcauses;
    (void)dwwait;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfExecuteDiagnosis(void* handle, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfExecuteDiagnosis");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfGetTraceFile(void* handle, void* tracefilelocation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfGetTraceFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, tracefilelocation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)tracefilelocation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfRepairIncident(void* handle, void* repairex, uint32_t dwwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfRepairIncident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, repairex, dwwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)repairex;
    (void)dwwait;
    errno = ENOSYS;
    return -1;
#endif
}

