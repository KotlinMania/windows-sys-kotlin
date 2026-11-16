#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_isolation_wrapper.h"
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

int32_t windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(void* pszappcontainername, void* pszdisplayname, void* pszdescription, void* pcapabilities, uint32_t dwcapabilitycount, void* ppsidappcontainersid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAppContainerProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszappcontainername, pszdisplayname, pszdescription, pcapabilities, dwcapabilitycount, ppsidappcontainersid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszappcontainername;
    (void)pszdisplayname;
    (void)pszdescription;
    (void)pcapabilities;
    (void)dwcapabilitycount;
    (void)ppsidappcontainersid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(void* pszappcontainername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAppContainerProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszappcontainername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszappcontainername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(void* pszappcontainername, void* ppsidappcontainersid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveAppContainerSidFromAppContainerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszappcontainername, ppsidappcontainersid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszappcontainername;
    (void)ppsidappcontainersid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(void* psidappcontainersid, void* pszrestrictedappcontainername, void* ppsidrestrictedappcontainersid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psidappcontainersid, pszrestrictedappcontainername, ppsidrestrictedappcontainersid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psidappcontainersid;
    (void)pszrestrictedappcontainername;
    (void)ppsidrestrictedappcontainersid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(void* pszappcontainersid, void* ppszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerFolderPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszappcontainersid, ppszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszappcontainersid;
    (void)ppszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(void* token, void* appcontainersid, uint32_t objectpathlength, void* objectpath, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerNamedObjectPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, appcontainersid, objectpathlength, objectpath, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)appcontainersid;
    (void)objectpathlength;
    (void)objectpath;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(uint32_t desiredaccess, void* phappcontainerkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerRegistryLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredaccess, phappcontainerkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)desiredaccess;
    (void)phappcontainerkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(void* iscrossisolatedenvironmentclipboardcontent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("isolatedwindowsenvironmentutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCrossIsolatedEnvironmentClipboardContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iscrossisolatedenvironmentclipboardcontent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iscrossisolatedenvironmentclipboardcontent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(void* isprocessinisolatedcontainer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-isolatedcontainer-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInIsolatedContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isprocessinisolatedcontainer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isprocessinisolatedcontainer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(void* isprocessinisolatedwindowsenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("isolatedwindowsenvironmentutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInIsolatedWindowsEnvironment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isprocessinisolatedwindowsenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isprocessinisolatedwindowsenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(void* reserved, void* isprocessinwdagcontainer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-isolatedcontainer-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInWDAGContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, isprocessinwdagcontainer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)isprocessinwdagcontainer;
    errno = ENOSYS;
    return -1;
#endif
}

