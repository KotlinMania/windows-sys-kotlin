#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_distributedfilesystem_wrapper.h"
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

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd(void* dfsentrypath, void* servername, void* sharename, void* comment, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, servername, sharename, comment, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)comment;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot(void* servername, void* rootshare, void* ftdfsname, void* comment, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddFtRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, rootshare, ftdfsname, comment, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)comment;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget(void* pdfspath, void* ptargetpath, uint32_t majorversion, void* pcomment, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddRootTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdfspath, ptargetpath, majorversion, pcomment, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdfspath;
    (void)ptargetpath;
    (void)majorversion;
    (void)pcomment;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot(void* servername, void* rootshare, void* comment, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddStdRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, rootshare, comment, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)rootshare;
    (void)comment;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum(void* dfsname, uint32_t level, uint32_t prefmaxlen, void* buffer, void* entriesread, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsname, level, prefmaxlen, buffer, entriesread, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsname;
    (void)level;
    (void)prefmaxlen;
    (void)buffer;
    (void)entriesread;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, servername, sharename, level, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetFtContainerSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domainname, securityinformation, ppsecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domainname;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, servername, sharename, level, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity(void* dfsentrypath, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, securityinformation, ppsecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetStdContainerSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinename, securityinformation, ppsecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)machinename;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(int32_t origin, void* pname, void* ppversioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetSupportedNamespaceVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(origin, pname, ppversioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)origin;
    (void)pname;
    (void)ppversioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsMove(void* olddfsentrypath, void* newdfsentrypath, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsMove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(olddfsentrypath, newdfsentrypath, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)olddfsentrypath;
    (void)newdfsentrypath;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove(void* dfsentrypath, void* servername, void* sharename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, servername, sharename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot(void* servername, void* rootshare, void* ftdfsname, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveFtRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, rootshare, ftdfsname, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced(void* domainname, void* servername, void* rootshare, void* ftdfsname, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveFtRootForced");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domainname, servername, rootshare, ftdfsname, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domainname;
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget(void* pdfspath, void* ptargetpath, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveRootTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdfspath, ptargetpath, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdfspath;
    (void)ptargetpath;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot(void* servername, void* rootshare, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveStdRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, rootshare, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)rootshare;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, servername, sharename, level, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetFtContainerSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domainname, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domainname;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, servername, sharename, level, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity(void* dfsentrypath, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dfsentrypath, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dfsentrypath;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetStdContainerSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinename, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)machinename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

