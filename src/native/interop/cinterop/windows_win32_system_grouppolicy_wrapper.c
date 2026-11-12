#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_grouppolicy_wrapper.h"
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

int32_t windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(void* lpbrowseinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BrowseForGPO");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbrowseinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbrowseinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(void* descriptor, void* commandline, void* commandlinelength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommandLineFromMsiDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptor, commandline, commandlinelength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)descriptor;
    (void)commandline;
    (void)commandlinelength;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(void* lpgpo, void* lpcontainer, int32_t fhighpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateGPOLink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpgpo, lpcontainer, fhighpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpgpo;
    (void)lpcontainer;
    (void)fhighpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(void* lpcontainer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAllGPOLinks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcontainer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcontainer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(void* lpgpo, void* lpcontainer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteGPOLink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpgpo, lpcontainer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpgpo;
    (void)lpcontainer;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(int32_t bmachine) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterCriticalPolicySection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bmachine);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bmachine;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyExportRSoPData(void* lpnamespace, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportRSoPData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnamespace, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnamespace;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(void* pgpolist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeGPOListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgpolist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgpolist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(void* pgpolist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeGPOListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgpolist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgpolist;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(int32_t bmachine, void* lpwszmgmtproduct, uint32_t dwmgmtproductoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateGPNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bmachine, lpwszmgmtproduct, dwmgmtproductoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bmachine;
    (void)lpwszmgmtproduct;
    (void)dwmgmtproductoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppliedGPOListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pmachinename, psiduser, pguidextension, ppgpolist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)pmachinename;
    (void)psiduser;
    (void)pguidextension;
    (void)ppgpolist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppliedGPOListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pmachinename, psiduser, pguidextension, ppgpolist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)pmachinename;
    (void)psiduser;
    (void)pguidextension;
    (void)ppgpolist;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyGetGPOListA(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGPOListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpname, lphostname, lpcomputername, dwflags, pgpolist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpname;
    (void)lphostname;
    (void)lpcomputername;
    (void)dwflags;
    (void)pgpolist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyGetGPOListW(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGPOListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpname, lphostname, lpcomputername, dwflags, pgpolist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpname;
    (void)lphostname;
    (void)lpcomputername;
    (void)dwflags;
    (void)pgpolist;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(void* productcode, void* displayname, void* supporturl) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalManagedApplicationData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(productcode, displayname, supporturl);
        return;
    }
    errno = ENOSYS;
#else
    (void)productcode;
    (void)displayname;
    (void)supporturl;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(int32_t buserapps, void* pdwapps, void* prglocalapps) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalManagedApplications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buserapps, pdwapps, prglocalapps);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buserapps;
    (void)pdwapps;
    (void)prglocalapps;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(uint32_t dwreserved, void* pappcategory) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagedApplicationCategories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved, pappcategory);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwreserved;
    (void)pappcategory;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(void* pcategory, uint32_t dwqueryflags, uint32_t dwinfolevel, void* pdwapps, void* prgmanagedapps) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagedApplications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcategory, dwqueryflags, dwinfolevel, pdwapps, prgmanagedapps);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcategory;
    (void)dwqueryflags;
    (void)dwinfolevel;
    (void)pdwapps;
    (void)prgmanagedapps;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyImportRSoPData(void* lpnamespace, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportRSoPData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnamespace, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnamespace;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyInstallApplication(void* pinstallinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstallinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinstallinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(void* hsection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LeaveCriticalPolicySection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsection;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessGroupPolicyCompleted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(extensionid, pasynchandle, dwstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)extensionid;
    (void)pasynchandle;
    (void)dwstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus, int32_t rsopstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessGroupPolicyCompletedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(extensionid, pasynchandle, dwstatus, rsopstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)extensionid;
    (void)pasynchandle;
    (void)dwstatus;
    (void)rsopstatus;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(int32_t bmachine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bmachine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bmachine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(int32_t bmachine, uint32_t dwoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshPolicyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bmachine, dwoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bmachine;
    (void)dwoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(void* hevent, int32_t bmachine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterGPNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, bmachine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)bmachine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(void* psecuritydescriptor, void* pprincipalselfsid, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pobjecttypelist, uint32_t objecttypelistlength, void* pgenericmapping, void* pprivilegeset, void* pdwprivilegesetlength, void* pdwgrantedaccessmask, void* pbaccessstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopAccessCheckByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, pprincipalselfsid, prsoptoken, dwdesiredaccessmask, pobjecttypelist, objecttypelistlength, pgenericmapping, pprivilegeset, pdwprivilegesetlength, pdwgrantedaccessmask, pbaccessstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)pprincipalselfsid;
    (void)prsoptoken;
    (void)dwdesiredaccessmask;
    (void)pobjecttypelist;
    (void)objecttypelistlength;
    (void)pgenericmapping;
    (void)pprivilegeset;
    (void)pdwprivilegesetlength;
    (void)pdwgrantedaccessmask;
    (void)pbaccessstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(void* pszfilename, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pdwgrantedaccessmask, void* pbaccessstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopFileAccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, prsoptoken, dwdesiredaccessmask, pdwgrantedaccessmask, pbaccessstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfilename;
    (void)prsoptoken;
    (void)dwdesiredaccessmask;
    (void)pdwgrantedaccessmask;
    (void)pbaccessstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopResetPolicySettingStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pservices, psettinginstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pservices;
    (void)psettinginstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance, uint32_t ninfo, void* pstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopSetPolicySettingStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pservices, psettinginstance, ninfo, pstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pservices;
    (void)psettinginstance;
    (void)ninfo;
    (void)pstatus;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemGrouppolicyUninstallApplication(void* productcode, uint32_t dwstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninstallApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(productcode, dwstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)productcode;
    (void)dwstatus;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterGPNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

