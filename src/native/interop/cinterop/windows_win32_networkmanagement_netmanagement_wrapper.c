#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_netmanagement_wrapper.h"
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

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(void* pwszservername, uint32_t ccaccount, void* wszaccount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mstask.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetScheduleAccountInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszservername, ccaccount, wszaccount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszservername;
    (void)ccaccount;
    (void)wszaccount;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(void* servername, uint32_t functioncode, uint32_t querylevel, void* data, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_NetLogonControl2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, functioncode, querylevel, data, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)functioncode;
    (void)querylevel;
    (void)data;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(uint32_t dwmessageid, uint32_t cnumberofsubstrings, void* plpwssubstrings, uint32_t dwerrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwmessageid, cnumberofsubstrings, plpwssubstrings, dwerrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(uint32_t dwmessageid, uint32_t cnumberofsubstrings, void* plpwssubstrings, uint32_t dwerrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwmessageid, cnumberofsubstrings, plpwssubstrings, dwerrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(uint32_t weventtype, uint32_t dwmessageid, uint32_t cnumberofsubstrings, void* plpwssubstrings) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogEventA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(weventtype, dwmessageid, cnumberofsubstrings, plpwssubstrings);
        return;
    }
    errno = ENOSYS;
#else
    (void)weventtype;
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(uint32_t weventtype, uint32_t dwmessageid, uint32_t cnumberofsubstrings, void* plpwssubstrings) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogEventW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(weventtype, dwmessageid, cnumberofsubstrings, plpwssubstrings);
        return;
    }
    errno = ENOSYS;
#else
    (void)weventtype;
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(uint32_t dwtransportid, void* lplpbuffer, void* lpdwentriesread) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprSetupProtocolEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtransportid, lplpbuffer, lpdwentriesread);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtransportid;
    (void)lplpbuffer;
    (void)lpdwentriesread;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprSetupProtocolFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(void* servername, void* resource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, resource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)resource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(void* servername, void* basepath, uint32_t recursive, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, basepath, recursive, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)basepath;
    (void)recursive;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(void* servername, void* resource, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, resource, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)resource;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(void* servername, void* ugname, void* resource, void* perms) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessGetUserPerms");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, ugname, resource, perms);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)ugname;
    (void)resource;
    (void)perms;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(void* servername, void* resource, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, resource, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)resource;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(void* server, void* alternatename, void* domainaccount, void* domainaccountpassword, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAddAlternateComputerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, alternatename, domainaccount, domainaccountpassword, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)alternatename;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(void* servername, void* accountname, void* password, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAddServiceAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, accountname, password, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)accountname;
    (void)password;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(void* alerttype, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAlertRaise");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alerttype, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)alerttype;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(void* alerttype, void* variableinfo, uint32_t variableinfosize, void* servicename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAlertRaiseEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alerttype, variableinfo, variableinfosize, servicename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)alerttype;
    (void)variableinfo;
    (void)variableinfosize;
    (void)servicename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(uint32_t bytecount, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bytecount, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(void* oldbuffer, uint32_t newbytecount, void* newbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferReallocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldbuffer, newbytecount, newbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)oldbuffer;
    (void)newbytecount;
    (void)newbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(void* buffer, void* bytecount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, bytecount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffer;
    (void)bytecount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(void* server, void* backupfile, void* service) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, backupfile, service);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)backupfile;
    (void)service;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(void* server, void* service, void* auditloghandle, uint32_t offset, void* reserved1, uint32_t reserved2, uint32_t offsetflag, void* bufptr, uint32_t prefmaxlen, void* bytesread, void* totalavailable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, service, auditloghandle, offset, reserved1, reserved2, offsetflag, bufptr, prefmaxlen, bytesread, totalavailable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)service;
    (void)auditloghandle;
    (void)offset;
    (void)reserved1;
    (void)reserved2;
    (void)offsetflag;
    (void)bufptr;
    (void)prefmaxlen;
    (void)bytesread;
    (void)totalavailable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(uint32_t type, void* buf, uint32_t numbytes, void* service, void* reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, buf, numbytes, service, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)type;
    (void)buf;
    (void)numbytes;
    (void)service;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(void* server, void* component, void* parameter, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigGet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, component, parameter, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)component;
    (void)parameter;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(void* server, void* component, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigGetAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, component, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)component;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(void* server, void* reserved1, void* component, uint32_t level, uint32_t reserved2, void* buf, uint32_t reserved3) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, reserved1, component, level, reserved2, buf, reserved3);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)reserved1;
    (void)component;
    (void)level;
    (void)reserved2;
    (void)buf;
    (void)reserved3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(void* pprovisioningparams, void* pppackagebindata, void* pdwpackagebindatasize, void* pppackagetextdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetCreateProvisioningPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovisioningparams, pppackagebindata, pdwpackagebindatasize, pppackagetextdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pprovisioningparams;
    (void)pppackagebindata;
    (void)pdwpackagebindatasize;
    (void)pppackagetextdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(void* server, int32_t nametype, uint32_t reserved, void* entrycount, void* computernames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetEnumerateComputerNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, nametype, reserved, entrycount, computernames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)nametype;
    (void)reserved;
    (void)entrycount;
    (void)computernames;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(void* servername, uint32_t flags, void* accountscount, void* accounts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetEnumerateServiceAccounts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, flags, accountscount, accounts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)flags;
    (void)accountscount;
    (void)accounts;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(void* uncservername, void* backupfile, void* reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, backupfile, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)backupfile;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(void* uncservername, void* reserved1, void* errorloghandle, uint32_t offset, void* reserved2, uint32_t reserved3, uint32_t offsetflag, void* bufptr, uint32_t prefmaxsize, void* bytesread, void* totalavailable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, reserved1, errorloghandle, offset, reserved2, reserved3, offsetflag, bufptr, prefmaxsize, bytesread, totalavailable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)reserved1;
    (void)errorloghandle;
    (void)offset;
    (void)reserved2;
    (void)reserved3;
    (void)offsetflag;
    (void)bufptr;
    (void)prefmaxsize;
    (void)bytesread;
    (void)totalavailable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(void* reserved1, uint32_t code, void* component, void* buffer, uint32_t numbytes, void* msgbuf, uint32_t strcount, void* reserved2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved1, code, component, buffer, numbytes, msgbuf, strcount, reserved2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reserved1;
    (void)code;
    (void)component;
    (void)buffer;
    (void)numbytes;
    (void)msgbuf;
    (void)strcount;
    (void)reserved2;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(void* pjoininfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFreeAadJoinInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pjoininfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)pjoininfo;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(void* pcsztenantid, void* ppjoininfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetAadJoinInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcsztenantid, ppjoininfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcsztenantid;
    (void)ppjoininfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(void* servername, void* domainname, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetAnyDCName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, domainname, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)domainname;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(void* servername, void* domainname, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetDCName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, domainname, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)domainname;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(void* servername, uint32_t level, void* prefix, void* arg3Index) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetDisplayInformationIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, prefix, arg3Index);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)prefix;
    (void)arg3Index;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(void* lpserver, void* lpnamebuffer, void* buffertype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetJoinInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, lpnamebuffer, buffertype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)lpnamebuffer;
    (void)buffertype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(void* lpserver, void* lpdomain, void* lpaccount, void* lppassword, void* oucount, void* ous) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetJoinableOUs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, lpdomain, lpaccount, lppassword, oucount, ous);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)lpdomain;
    (void)lpaccount;
    (void)lppassword;
    (void)oucount;
    (void)ous;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(void* servername, void* groupname, void* username) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupAddUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, username);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)username;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(void* servername, void* groupname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(void* servername, void* groupname, void* username) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupDelUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, username);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)username;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(void* servername, void* groupname, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(void* servername, void* groupname, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupGetUsers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(void* servername, void* groupname, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(void* servername, void* groupname, uint32_t level, void* buf, uint32_t totalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupSetUsers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, buf, totalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(void* servername, void* accountname, void* isservice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetIsServiceAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, accountname, isservice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)accountname;
    (void)isservice;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(void* lpserver, void* lpdomain, void* lpmachineaccountou, void* lpaccount, void* lppassword, uint32_t fjoinoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetJoinDomain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, lpdomain, lpmachineaccountou, lpaccount, lppassword, fjoinoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)lpdomain;
    (void)lpmachineaccountou;
    (void)lpaccount;
    (void)lppassword;
    (void)fjoinoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(void* servername, void* groupname, void* membersid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAddMember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, membersid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)membersid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(void* servername, void* groupname, uint32_t level, void* buf, uint32_t totalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAddMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, buf, totalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(void* servername, void* groupname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(void* servername, void* groupname, void* membersid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDelMember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, membersid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)membersid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(void* servername, void* groupname, uint32_t level, void* buf, uint32_t totalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDelMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, buf, totalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(void* servername, void* groupname, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(void* servername, void* localgroupname, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupGetMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, localgroupname, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)localgroupname;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(void* servername, void* groupname, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(void* servername, void* groupname, uint32_t level, void* buf, uint32_t totalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupSetMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, groupname, level, buf, totalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(void* servername, void* msgname, void* fromname, void* buf, uint32_t buflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageBufferSend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, msgname, fromname, buf, buflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)msgname;
    (void)fromname;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(void* servername, void* msgname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, msgname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)msgname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(void* servername, void* msgname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, msgname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)msgname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(void* servername, void* msgname, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, msgname, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)msgname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(void* lpdomain, void* lpmachinename, void* lpmachineaccountou, void* lpdcname, uint32_t dwoptions, void* pprovisionbindata, void* pdwprovisionbindatasize, void* pprovisiontextdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetProvisionComputerAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdomain, lpmachinename, lpmachineaccountou, lpdcname, dwoptions, pprovisionbindata, pdwprovisionbindatasize, pprovisiontextdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpdomain;
    (void)lpmachinename;
    (void)lpmachineaccountou;
    (void)lpdcname;
    (void)dwoptions;
    (void)pprovisionbindata;
    (void)pdwprovisionbindatasize;
    (void)pprovisiontextdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(void* servername, uint32_t level, uint32_t arg2Index, uint32_t entriesrequested, uint32_t preferredmaximumlength, void* returnedentrycount, void* sortedbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetQueryDisplayInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, arg2Index, entriesrequested, preferredmaximumlength, returnedentrycount, sortedbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)arg2Index;
    (void)entriesrequested;
    (void)preferredmaximumlength;
    (void)returnedentrycount;
    (void)sortedbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(void* servername, void* accountname, uint32_t infolevel, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetQueryServiceAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, accountname, infolevel, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)accountname;
    (void)infolevel;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(void* uncservername, uint32_t optionswanted, void* optionssupported) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoteComputerSupports");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, optionswanted, optionssupported);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)optionswanted;
    (void)optionssupported;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(void* uncservername, void* bufferptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoteTOD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, bufferptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)bufferptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(void* server, void* alternatename, void* domainaccount, void* domainaccountpassword, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoveAlternateComputerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, alternatename, domainaccount, domainaccountpassword, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)alternatename;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(void* servername, void* accountname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoveServiceAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, accountname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)accountname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(void* lpserver, void* lpnewmachinename, void* lpaccount, void* lppassword, uint32_t frenameoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRenameMachineInDomain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, lpnewmachinename, lpaccount, lppassword, frenameoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)lpnewmachinename;
    (void)lpaccount;
    (void)lppassword;
    (void)frenameoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(void* servername, void* dirname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(void* servername, void* dirname, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(void* servername, void* dirname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(void* servername, void* dirname, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(void* servername, void* dirname, uint32_t unlockforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirUnlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname, unlockforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    (void)unlockforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(void* servername, void* dirname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(void* servername, void* dirname, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(void* servername, void* dirname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(void* servername, void* dirname, uint32_t unlockforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirUnlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dirname, unlockforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dirname;
    (void)unlockforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(void* pprovisionbindata, uint32_t cbprovisionbindatasize, uint32_t dwoptions, void* lpwindowspath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRequestOfflineDomainJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovisionbindata, cbprovisionbindatasize, dwoptions, lpwindowspath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pprovisionbindata;
    (void)cbprovisionbindatasize;
    (void)dwoptions;
    (void)lpwindowspath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(void* ppackagebindata, uint32_t dwpackagebindatasize, uint32_t dwprovisionoptions, void* lpwindowspath, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRequestProvisioningPackageInstall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppackagebindata, dwpackagebindatasize, dwprovisionoptions, lpwindowspath, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppackagebindata;
    (void)dwpackagebindatasize;
    (void)dwprovisionoptions;
    (void)lpwindowspath;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(void* servername, void* buffer, void* jobid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, buffer, jobid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)buffer;
    (void)jobid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(void* servername, uint32_t minjobid, uint32_t maxjobid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, minjobid, maxjobid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)minjobid;
    (void)maxjobid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(void* servername, void* pointertobuffer, uint32_t prefferedmaximumlength, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, pointertobuffer, prefferedmaximumlength, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)pointertobuffer;
    (void)prefferedmaximumlength;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(void* servername, uint32_t jobid, void* pointertobuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, jobid, pointertobuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)jobid;
    (void)pointertobuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(void* servername, void* emulateddomainname, void* emulatedservername) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerComputerNameAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, emulateddomainname, emulatedservername);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)emulateddomainname;
    (void)emulatedservername;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(void* servername, void* emulatedservername) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerComputerNameDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, emulatedservername);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)emulatedservername;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerDiskEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, uint32_t servertype, void* domain, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, servertype, domain, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)servertype;
    (void)domain;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(void* servername, uint32_t level, void* buf, void* parmerror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmerror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmerror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportAddEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(void* servername, void* service, uint32_t opcode, uint32_t arg, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, service, opcode, arg, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)service;
    (void)opcode;
    (void)arg;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(void* servername, void* service, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, service, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)service;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(void* servername, void* service, uint32_t argc, void* argv, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceInstall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, service, argc, argv, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)service;
    (void)argc;
    (void)argv;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(void* server, void* primaryname, void* domainaccount, void* domainaccountpassword, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSetPrimaryComputerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(server, primaryname, domainaccount, domainaccountpassword, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)server;
    (void)primaryname;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(void* lpserver, void* lpaccount, void* lppassword, uint32_t funjoinoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUnjoinDomain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, lpaccount, lppassword, funjoinoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)lpaccount;
    (void)lppassword;
    (void)funjoinoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(void* servername, uint32_t levelflags, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, levelflags, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)levelflags;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(void* uncservername, void* usename, uint32_t forcelevelflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, usename, forcelevelflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)usename;
    (void)forcelevelflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(void* uncservername, uint32_t levelflags, void* bufptr, uint32_t preferedmaximumsize, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, levelflags, bufptr, preferedmaximumsize, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)levelflags;
    (void)bufptr;
    (void)preferedmaximumsize;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(void* uncservername, void* usename, uint32_t levelflags, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, usename, levelflags, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)usename;
    (void)levelflags;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(void* domainname, void* username, void* oldpassword, void* newpassword) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserChangePassword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domainname, username, oldpassword, newpassword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domainname;
    (void)username;
    (void)oldpassword;
    (void)newpassword;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(void* servername, void* username) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(void* servername, uint32_t level, uint32_t filter, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, filter, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)filter;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(void* servername, void* username, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetGroups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, level, bufptr, prefmaxlen, entriesread, totalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(void* servername, void* username, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(void* servername, void* username, uint32_t level, uint32_t flags, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetLocalGroups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, level, flags, bufptr, prefmaxlen, entriesread, totalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)flags;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserModalsGet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserModalsSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(void* servername, void* username, uint32_t level, void* buf, uint32_t numEntries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserSetGroups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, level, buf, numEntries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)buf;
    (void)numEntries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(void* servername, void* username, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, username, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(void* lpserver, void* lpname, void* lpaccount, void* lppassword, int32_t nametype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidateName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, lpname, lpaccount, lppassword, nametype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)lpname;
    (void)lpaccount;
    (void)lppassword;
    (void)nametype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(void* servername, void* qualifier, int32_t validationtype, void* inputarg, void* outputarg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidatePasswordPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, qualifier, validationtype, inputarg, outputarg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)qualifier;
    (void)validationtype;
    (void)inputarg;
    (void)outputarg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(void* outputarg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidatePasswordPolicyFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(outputarg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)outputarg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(void* servername, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(void* servername, uint32_t level, void* buffer, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buffer, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buffer;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(void* servername, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(void* servername, void* transportname, uint32_t ucond) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, transportname, ucond);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)transportname;
    (void)ucond;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumeHandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumeHandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(void* reserved, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reserved;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(void* reserved, uint32_t level, void* buf, void* parmErr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, level, buf, parmErr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reserved;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(void* pszfailedassertion, void* pszfilename, uint32_t dwlinenumber, void* pszmessage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAssert");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pszfailedassertion, pszfilename, dwlinenumber, pszmessage);
        return;
    }
    errno = ENOSYS;
#else
    (void)pszfailedassertion;
    (void)pszfilename;
    (void)dwlinenumber;
    (void)pszmessage;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(uint32_t dwerrorcode, void* lplpszerrorstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterGetErrorStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwerrorcode, lplpszerrorstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwerrorcode;
    (void)lplpszerrorstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(uint32_t dwerrorcode, void* lplpwszerrorstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterGetErrorStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwerrorcode, lplpwszerrorstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwerrorcode;
    (void)lplpwszerrorstring;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(void* hloghandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogDeregisterA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(void* hloghandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogDeregisterW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(void* hloghandle, uint32_t dweventtype, uint32_t dwmessageid, uint32_t dwsubstringcount, void* plpszsubstringarray, uint32_t dwerrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray, dwerrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(void* hloghandle, uint32_t dweventtype, uint32_t dwmessageid, uint32_t dwsubstringcount, void* plpszsubstringarray, uint32_t dwdatabytes, void* lpdatabytes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventDataA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray, dwdatabytes, lpdatabytes);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwdatabytes;
    (void)lpdatabytes;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(void* hloghandle, uint32_t dweventtype, uint32_t dwmessageid, uint32_t dwsubstringcount, void* plpszsubstringarray, uint32_t dwdatabytes, void* lpdatabytes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray, dwdatabytes, lpdatabytes);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwdatabytes;
    (void)lpdatabytes;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(void* hloghandle, uint32_t dweventtype, uint32_t dwerrorcode, uint32_t dwmessageid, void* ptszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventExA");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat); break;
            case 1: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0); break;
            case 2: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(void* hloghandle, uint32_t dweventtype, uint32_t dwerrorcode, uint32_t dwmessageid, void* ptszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventExW");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat); break;
            case 1: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0); break;
            case 2: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(void* hloghandle, uint32_t dweventtype, uint32_t dwmessageid, uint32_t dwsubstringcount, void* plpszsubstringarray, uint32_t dwerrorcode, uint32_t dwerrorindex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray, dwerrorcode, dwerrorindex);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    (void)dwerrorindex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(void* hloghandle, uint32_t dweventtype, uint32_t dwmessageid, uint32_t dwsubstringcount, void* plpszsubstringarray, uint32_t dwerrorcode, uint32_t dwerrorindex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray, dwerrorcode, dwerrorindex);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    (void)dwerrorindex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(void* hloghandle, uint32_t dweventtype, uint32_t dwerrorcode, uint32_t dwmessageid, void* ptszformat, void* arglist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventValistExA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, arglist);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)arglist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(void* hloghandle, uint32_t dweventtype, uint32_t dwerrorcode, uint32_t dwmessageid, void* ptszformat, void* arglist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventValistExW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwerrorcode, dwmessageid, ptszformat, arglist);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)arglist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(void* hloghandle, uint32_t dweventtype, uint32_t dwmessageid, uint32_t dwsubstringcount, void* plpszsubstringarray, uint32_t dwerrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hloghandle, dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray, dwerrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(void* lpszsource) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogRegisterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsource);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszsource;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(void* lpszsource) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogRegisterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsource);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszsource;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(void* pwszservername, void* pwszaccount, void* pwszpassword) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mstask.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNetScheduleAccountInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszservername, pwszaccount, pwszpassword);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszservername;
    (void)pwszaccount;
    (void)pwszpassword;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(uint32_t dwtraceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(uint32_t dwtraceid, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(uint32_t dwtraceid, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(uint32_t dwtraceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(uint32_t dwtraceid, uint32_t dwflags, void* lpbbytes, uint32_t dwbytecount, uint32_t dwgroupsize, int32_t baddressprefix, void* lpszprefix) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDumpExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags, lpbbytes, dwbytecount, dwgroupsize, baddressprefix, lpszprefix);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpbbytes;
    (void)dwbytecount;
    (void)dwgroupsize;
    (void)baddressprefix;
    (void)lpszprefix;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(uint32_t dwtraceid, uint32_t dwflags, void* lpbbytes, uint32_t dwbytecount, uint32_t dwgroupsize, int32_t baddressprefix, void* lpszprefix) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDumpExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags, lpbbytes, dwbytecount, dwgroupsize, baddressprefix, lpszprefix);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpbbytes;
    (void)dwbytecount;
    (void)dwgroupsize;
    (void)baddressprefix;
    (void)lpszprefix;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(uint32_t dwtraceid, void* lphconsole) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceGetConsoleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, lphconsole);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)lphconsole;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(uint32_t dwtraceid, void* lphconsole) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceGetConsoleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, lphconsole);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)lphconsole;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(uint32_t dwtraceid, void* lpszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfA");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(dwtraceid, lpszformat);
            case 1: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)lpszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(uint32_t dwtraceid, uint32_t dwflags, void* lpszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfExA");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(dwtraceid, dwflags, lpszformat);
            case 1: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(uint32_t dwtraceid, uint32_t dwflags, void* lpszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfExW");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(dwtraceid, dwflags, lpszformat);
            case 1: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(dwtraceid, dwflags, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(uint32_t dwtraceid, void* lpszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfW");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(dwtraceid, lpszformat);
            case 1: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(dwtraceid, lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)lpszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(uint32_t dwtraceid, uint32_t dwflags, void* lpszstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePutsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags, lpszstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(uint32_t dwtraceid, uint32_t dwflags, void* lpszstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePutsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags, lpszstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(void* lpszcallername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceRegisterExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcallername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszcallername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(void* lpszcallername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceRegisterExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcallername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszcallername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(uint32_t dwtraceid, uint32_t dwflags, void* lpszformat, void* arglist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceVprintfExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags, lpszformat, arglist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)arglist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(uint32_t dwtraceid, uint32_t dwflags, void* lpszformat, void* arglist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceVprintfExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtraceid, dwflags, lpszformat, arglist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)arglist;
    errno = ENOSYS;
    return 0;
#endif
}

