#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_wnet_wrapper.h"
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

uint32_t windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA(void* lpnetresource, void* lpnetconnectinfostruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultinetGetConnectionPerformanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpnetconnectinfostruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpnetconnectinfostruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW(void* lpnetresource, void* lpnetconnectinfostruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultinetGetConnectionPerformanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpnetconnectinfostruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpnetconnectinfostruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPAddConnection(void* lpnetresource, void* lppassword, void* lpusername) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPAddConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lppassword, lpusername);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPAddConnection3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, lppassword, lpusername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4(void* hwndowner, void* lpnetresource, void* lpauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPAddConnection4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, lpauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lpauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection(void* lpname, int32_t fforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPCancelConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, fforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)fforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2(void* lpname, int32_t fforce, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPCancelConnection2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, fforce, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)fforce;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum(void* henum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPEnumResource(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPEnumResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, lpccount, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName(void* lpremotename, void* lpformattedname, void* lpnlength, uint32_t dwflags, uint32_t dwavecharperline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPFormatNetworkName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpremotename, lpformattedname, lpnlength, dwflags, dwavecharperline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpremotename;
    (void)lpformattedname;
    (void)lpnlength;
    (void)dwflags;
    (void)dwavecharperline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetCaps(uint32_t ndex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ndex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetConnection(void* lplocalname, void* lpremotename, void* lpnbufferlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalname, lpremotename, lpnbufferlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnbufferlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3(void* lplocalname, uint32_t dwlevel, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetConnection3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalname, dwlevel, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalname;
    (void)dwlevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance(void* lpremotename, void* lpnetconnectinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetConnectionPerformance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpremotename, lpnetconnectinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpremotename;
    (void)lpnetconnectinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection(void* lpremotepath, void* lpreaduseoptions, uint32_t cbreaduseoptions, void* lpwriteuseoptions, void* lpsizewriteuseoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetPersistentUseOptionsForConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpremotepath, lpreaduseoptions, cbreaduseoptions, lpwriteuseoptions, lpsizewriteuseoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpremotepath;
    (void)lpreaduseoptions;
    (void)cbreaduseoptions;
    (void)lpwriteuseoptions;
    (void)lpsizewriteuseoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation(void* lpnetresource, void* lpbuffer, void* lpbuffersize, void* lplpsystem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetResourceInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpbuffer, lpbuffersize, lplpsystem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpbuffersize;
    (void)lplpsystem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent(void* lpnetresource, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetResourceParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetUniversalName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalpath, dwinfolevel, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetUser(void* lpname, void* lpusername, void* lpnbufferlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpusername, lpnbufferlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnbufferlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscope, dwtype, dwusage, lpnetresource, lphenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lppassword, lpusername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lppassword, lpusername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, lppassword, lpusername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, lppassword, lpusername, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection4A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection4W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA(void* lpremotename, void* lppassword, void* lplocalname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpremotename, lppassword, lplocalname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpremotename;
    (void)lppassword;
    (void)lplocalname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW(void* lpremotename, void* lppassword, void* lplocalname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpremotename, lppassword, lplocalname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpremotename;
    (void)lppassword;
    (void)lplocalname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A(void* lpname, uint32_t dwflags, int32_t fforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnection2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, dwflags, fforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)dwflags;
    (void)fforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W(void* lpname, uint32_t dwflags, int32_t fforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnection2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, dwflags, fforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)dwflags;
    (void)fforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA(void* lpname, int32_t fforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, fforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)fforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW(void* lpname, int32_t fforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, fforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)fforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum(void* henum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog(void* hwnd, uint32_t dwtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetConnectionDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)dwtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A(void* lpconndlgstruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetConnectionDialog1A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconndlgstruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconndlgstruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W(void* lpconndlgstruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetConnectionDialog1W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconndlgstruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconndlgstruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog(void* hwnd, uint32_t dwtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetDisconnectDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)dwtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A(void* lpconndlgstruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetDisconnectDialog1A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconndlgstruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconndlgstruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W(void* lpconndlgstruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetDisconnectDialog1W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconndlgstruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconndlgstruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetEnumResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, lpccount, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetEnumResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, lpccount, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA(void* lplocalname, void* lpremotename, void* lpnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalname, lpremotename, lpnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW(void* lplocalname, void* lpremotename, void* lpnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalname, lpremotename, lpnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetLastErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lperror, lperrorbuf, nerrorbufsize, lpnamebuf, nnamebufsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)nerrorbufsize;
    (void)lpnamebuf;
    (void)nnamebufsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetLastErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lperror, lperrorbuf, nerrorbufsize, lpnamebuf, nnamebufsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)nerrorbufsize;
    (void)lpnamebuf;
    (void)nnamebufsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA(void* lpprovider, void* lpnetinfostruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetNetworkInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprovider, lpnetinfostruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpprovider;
    (void)lpnetinfostruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW(void* lpprovider, void* lpnetinfostruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetNetworkInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprovider, lpnetinfostruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpprovider;
    (void)lpnetinfostruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetProviderNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnettype, lpprovidername, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwnettype;
    (void)lpprovidername;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetProviderNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnettype, lpprovidername, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwnettype;
    (void)lpprovidername;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    (void)lplpsystem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    (void)lplpsystem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceParentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceParentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnetresource, lpbuffer, lpcbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUniversalNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalpath, dwinfolevel, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUniversalNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalpath, dwinfolevel, lpbuffer, lpbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA(void* lpname, void* lpusername, void* lpnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUserA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpusername, lpnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW(void* lpname, void* lpusername, void* lpnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUserW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpusername, lpnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetOpenEnumA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscope, dwtype, dwusage, lpnetresource, lphenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetOpenEnumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscope, dwtype, dwusage, lpnetresource, lphenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA(uint32_t err, void* lperror, void* lpproviders) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetSetLastErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(err, lperror, lpproviders);
        return;
    }
    errno = ENOSYS;
#else
    (void)err;
    (void)lperror;
    (void)lpproviders;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW(uint32_t err, void* lperror, void* lpproviders) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetSetLastErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(err, lperror, lpproviders);
        return;
    }
    errno = ENOSYS;
#else
    (void)err;
    (void)lperror;
    (void)lpproviders;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnection4A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions, lpaccessname, lpbuffersize, lpresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnection4W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer, dwflags, lpuseoptions, cbuseoptions, lpaccessname, lpbuffersize, lpresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, lppassword, lpuserid, dwflags, lpaccessname, lpbuffersize, lpresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpuserid;
    (void)dwflags;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, lpnetresource, lppassword, lpuserid, dwflags, lpaccessname, lpbuffersize, lpresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpuserid;
    (void)dwflags;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    errno = ENOSYS;
    return 0;
#endif
}

