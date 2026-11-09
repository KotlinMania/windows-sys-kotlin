#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_dhcp_wrapper.h"
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

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4(void* serveripaddress, void* addfilterinfo, int32_t forceflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddFilterV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, addfilterinfo, forceflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)addfilterinfo;
    (void)forceflag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup(void* pserver) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSecurityGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pserver);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pserver;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer(uint32_t flags, void* idinfo, void* newserver, void* callbackfn, void* callbackdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, idinfo, newserver, callbackfn, callbackdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement(void* serveripaddress, uint32_t subnetaddress, void* addelementinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, addelementinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4(void* serveripaddress, uint32_t subnetaddress, void* addelementinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElementV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, addelementinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5(void* serveripaddress, uint32_t subnetaddress, void* addelementinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElementV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, addelementinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams(void* serveripaddress, uint32_t flags, void* auditlogdir, void* diskcheckinterval, void* maxlogfilessize, void* minspaceondisk) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAuditLogGetParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, auditlogdir, diskcheckinterval, maxlogfilessize, minspaceondisk);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams(void* serveripaddress, uint32_t flags, void* auditlogdir, uint32_t diskcheckinterval, uint32_t maxlogfilessize, uint32_t minspaceondisk) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAuditLogSetParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, auditlogdir, diskcheckinterval, maxlogfilessize, minspaceondisk);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCApiCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize(void* version) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCApiInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)version;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass(void* serveripaddress, uint32_t reservedmustbezero, void* classinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, classinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6(void* serveripaddress, uint32_t reservedmustbezero, void* classinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClassV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, classinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfoV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfoVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption(void* serveripaddress, uint32_t optionid, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOptionV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOptionV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet(void* serveripaddress, uint32_t subnetaddress, void* subnetinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateSubnet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, subnetinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ(void* serveripaddress, uint32_t subnetaddress, void* subnetinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateSubnetVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, subnetinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange(uint32_t flags, void* reserved, void* event) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeRegisterParamChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, reserved, event);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)reserved;
    (void)event;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass(void* serveripaddress, uint32_t reservedmustbezero, void* classname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, classname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6(void* serveripaddress, uint32_t reservedmustbezero, void* classname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClassV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, classname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClientInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4(void* serveripaddress, void* deletefilterinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteFilterV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, deletefilterinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)deletefilterinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer(uint32_t flags, void* idinfo, void* newserver, void* callbackfn, void* callbackdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, idinfo, newserver, callbackfn, callbackdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet(void* serveripaddress, uint32_t subnetaddress, int32_t forceflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteSubnet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, forceflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)forceflag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4(void* serveripaddress, void* superscopename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteSuperScopeV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, superscopename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)superscopename;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDsCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDsInit");
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

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses(void* serveripaddress, uint32_t reservedmustbezero, void* resumehandle, uint32_t preferredmaximum, void* classinfoarray, void* nread, void* ntotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumClasses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, resumehandle, preferredmaximum, classinfoarray, nread, ntotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6(void* serveripaddress, uint32_t reservedmustbezero, void* resumehandle, uint32_t preferredmaximum, void* classinfoarray, void* nread, void* ntotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumClassesV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, resumehandle, preferredmaximum, classinfoarray, nread, ntotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, int32_t listtype, void* enumfilterinfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumFilterV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, listtype, enumfilterinfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)listtype;
    (void)enumfilterinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues(void* serveripaddress, void* scopeinfo, void* resumehandle, uint32_t preferredmaximum, void* optionvalues, void* optionsread, void* optionstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeinfo, resumehandle, preferredmaximum, optionvalues, optionsread, optionstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5(void* serveripaddress, uint32_t flags, void* classname, void* vendorname, void* scopeinfo, void* resumehandle, uint32_t preferredmaximum, void* optionvalues, void* optionsread, void* optionstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, classname, vendorname, scopeinfo, resumehandle, preferredmaximum, optionvalues, optionsread, optionstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6(void* serveripaddress, uint32_t flags, void* classname, void* vendorname, void* scopeinfo, void* resumehandle, uint32_t preferredmaximum, void* optionvalues, void* optionsread, void* optionstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, classname, vendorname, scopeinfo, resumehandle, preferredmaximum, optionvalues, optionsread, optionstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, void* options, void* optionsread, void* optionstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, options, optionsread, optionstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5(void* serveripaddress, uint32_t flags, void* classname, void* vendorname, void* resumehandle, uint32_t preferredmaximum, void* options, void* optionsread, void* optionstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionsV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, classname, vendorname, resumehandle, preferredmaximum, options, optionsread, optionstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6(void* serveripaddress, uint32_t flags, void* classname, void* vendorname, void* resumehandle, uint32_t preferredmaximum, void* options, void* optionsread, void* optionstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionsV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, classname, vendorname, resumehandle, preferredmaximum, options, optionsread, optionstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers(uint32_t flags, void* idinfo, void* servers, void* callbackfn, void* callbackdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumServers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, idinfo, servers, callbackfn, callbackdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)idinfo;
    (void)servers;
    (void)callbackfn;
    (void)callbackdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClients");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsFilterStatusInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements(void* serveripaddress, uint32_t subnetaddress, int32_t enumelementtype, void* resumehandle, uint32_t preferredmaximum, void* enumelementinfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, enumelementtype, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4(void* serveripaddress, uint32_t subnetaddress, int32_t enumelementtype, void* resumehandle, uint32_t preferredmaximum, void* enumelementinfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, enumelementtype, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5(void* serveripaddress, uint32_t subnetaddress, int32_t enumelementtype, void* resumehandle, uint32_t preferredmaximum, void* enumelementinfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, enumelementtype, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, void* enuminfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, enuminfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, void* enuminfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetsV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, enuminfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues(void* serveripaddress, uint32_t flags, void* scopeinfo, void* values) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, scopeinfo, values);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6(void* serveripaddress, uint32_t flags, void* scopeinfo, void* values) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionValuesV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, scopeinfo, values);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions(void* serveripaddress, uint32_t flags, void* optionstruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionstruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6(void* serveripaddress, uint32_t flags, void* optionstruct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionsV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionstruct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo(void* serveripaddress, uint32_t reservedmustbezero, void* partialclassinfo, void* filledclassinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClassInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, partialclassinfo, filledclassinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)partialclassinfo;
    (void)filledclassinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions(void* serveripaddress, uint32_t clientipaddress, uint32_t clientsubnetmask, void* clientoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientipaddress, clientsubnetmask, clientoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientipaddress;
    (void)clientsubnetmask;
    (void)clientoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4(void* serveripaddress, void* globalfilterinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetFilterV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, globalfilterinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo(void* serveripaddress, void* mibinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, mibinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5(void* serveripaddress, void* mibinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfoV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, mibinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6(void* serveripaddress, void* mibinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, mibinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo(void* serveripaddress, uint32_t optionid, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfoV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue(void* serveripaddress, uint32_t optionid, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValueV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValueV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask(void* sadaptername, void* dwsubnetmask) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOriginalSubnetMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sadaptername, dwsubnetmask);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sadaptername;
    (void)dwsubnetmask;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo(void* serveripaddress, uint32_t flags, void* bindelementsinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerBindingInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, bindelementsinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6(void* serveripaddress, uint32_t flags, void* bindelementsinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerBindingInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, bindelementsinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings(void* serveripaddress, void* serverspecificstrings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerSpecificStrings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, serverspecificstrings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)serverspecificstrings;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer(void* serveripaddress, uint32_t subnetaddress, void* timedelayinmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetDelayOffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, timedelayinmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo(void* serveripaddress, uint32_t subnetaddress, void* subnetinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, subnetinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ(void* serveripaddress, uint32_t subnetaddress, void* subnetinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetInfoVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, subnetinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4(void* serveripaddress, void* superscopetable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSuperScopeInfoV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, superscopetable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)superscopetable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions(void* pflags, void* reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetThreadOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflags, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pflags;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion(void* serveripaddress, void* majorversion, void* minorversion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, majorversion, minorversion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)majorversion;
    (void)minorversion;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition(void* policy, uint32_t parentexpr, int32_t type, uint32_t optionid, uint32_t suboptionid, void* vendorname, int32_t arg_6_operator, void* value, uint32_t valuelength, void* conditionindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, uint32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyCondition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, parentexpr, type, optionid, suboptionid, vendorname, arg_6_operator, value, valuelength, conditionindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policy;
    (void)parentexpr;
    (void)type;
    (void)optionid;
    (void)suboptionid;
    (void)vendorname;
    (void)arg_6_operator;
    (void)value;
    (void)valuelength;
    (void)conditionindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr(void* policy, uint32_t parentexpr, int32_t arg_2_operator, void* exprindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyExpr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, parentexpr, arg_2_operator, exprindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policy;
    (void)parentexpr;
    (void)arg_2_operator;
    (void)exprindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange(void* policy, void* range) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, range);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policy;
    (void)range;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy(void* policyname, int32_t fglobalpolicy, uint32_t subnet, uint32_t processingorder, int32_t rootoperator, void* description, int32_t enabled, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprCreateV4Policy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyname, fglobalpolicy, subnet, processingorder, rootoperator, description, enabled, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx(void* policyname, int32_t fglobalpolicy, uint32_t subnet, uint32_t processingorder, int32_t rootoperator, void* description, int32_t enabled, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprCreateV4PolicyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyname, fglobalpolicy, subnet, processingorder, rootoperator, description, enabled, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty(void* propertyarray, int32_t id, int32_t type) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFindV4DhcpProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propertyarray, id, type);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)propertyarray;
    (void)id;
    (void)type;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty(void* property) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(property);
        return;
    }
    errno = ENOSYS;
#else
    (void)property;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray(void* propertyarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpPropertyArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(propertyarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)propertyarray;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy(void* policy) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4Policy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(policy);
        return;
    }
    errno = ENOSYS;
#else
    (void)policy;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray(void* policyarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(policyarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)policyarray;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx(void* policyex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(policyex);
        return;
    }
    errno = ENOSYS;
#else
    (void)policyex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray(void* policyexarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyExArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(policyexarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)policyexarray;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC(void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicySingleUC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid(void* ppolicy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppolicy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppolicy;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed(void* ppolicy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyWellFormed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppolicy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppolicy;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr(void* policy, int32_t arg_1_operator) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprModifyV4PolicyExpr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, arg_1_operator);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policy;
    (void)arg_1_operator;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr(void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprResetV4PolicyExpr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass(void* serveripaddress, uint32_t reservedmustbezero, void* classinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpModifyClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, classinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6(void* serveripaddress, uint32_t reservedmustbezero, void* classinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpModifyClassV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, reservedmustbezero, classinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveDNSRegistrations");
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

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption(void* serveripaddress, uint32_t optionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue(void* serveripaddress, uint32_t optionid, void* scopeinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid, scopeinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* scopeinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* scopeinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement(void* serveripaddress, uint32_t subnetaddress, void* removeelementinfo, int32_t forceflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, removeelementinfo, forceflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4(void* serveripaddress, uint32_t subnetaddress, void* removeelementinfo, int32_t forceflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, removeelementinfo, forceflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5(void* serveripaddress, uint32_t subnetaddress, void* removeelementinfo, int32_t forceflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, removeelementinfo, forceflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory(void* bufferpointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRpcFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bufferpointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)bufferpointer;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase(void* serveripaddress, uint32_t subnetaddress, uint32_t fixflag, void* scanlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpScanDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, fixflag, scanlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)fixflag;
    (void)scanlist;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree(void* configinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerAuditlogParamsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(configinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)configinfo;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase(void* serveripaddress, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerBackupDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig(void* serveripaddress, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4(void* serveripaddress, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6(void* serveripaddress, void* scopeinfo, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeinfo, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ(void* serveripaddress, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute(void* serveripaddr, uint32_t dwreserved, uint32_t dhcpattribid, void* pdhcpattrib) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddr, dwreserved, dhcpattribid, pdhcpattrib);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dhcpattribid;
    (void)pdhcpattrib;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes(void* serveripaddr, uint32_t dwreserved, uint32_t dwattribcount, void* pdhcpattribs, void* pdhcpattribarr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddr, dwreserved, dwattribcount, pdhcpattribs, pdhcpattribarr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dwattribcount;
    (void)pdhcpattribs;
    (void)pdhcpattribarr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials(void* serveripaddress, uint32_t unamesize, void* uname, uint32_t domainsize, void* domain) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryDnsRegCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, unamesize, uname, domainsize, domain);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)unamesize;
    (void)uname;
    (void)domainsize;
    (void)domain;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization(void* serveripaddr, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerRedoAuthorization");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddr, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase(void* serveripaddress, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerRestoreDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig(void* serveripaddress, uint32_t fieldstoset, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fieldstoset, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4(void* serveripaddress, uint32_t fieldstoset, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fieldstoset, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6(void* serveripaddress, void* scopeinfo, uint32_t fieldstoset, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeinfo, fieldstoset, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ(void* serveripaddress, uint32_t fieldstoset, void* configinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fieldstoset, configinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials(void* serveripaddress, void* uname, void* domain, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, uname, domain, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5(void* serveripaddress, void* uname, void* domain, void* passwd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentialsV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, uname, domain, passwd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4(void* serveripaddress, void* globalfilterinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetFilterV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, globalfilterinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo(void* serveripaddress, uint32_t optionid, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfoV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* optioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue(void* serveripaddress, uint32_t optionid, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, optionid, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValueV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6(void* serveripaddress, uint32_t flags, uint32_t optionid, void* classname, void* vendorname, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValueV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues(void* serveripaddress, void* scopeinfo, void* optionvalues) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeinfo, optionvalues);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)optionvalues;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5(void* serveripaddress, uint32_t flags, void* classname, void* vendorname, void* scopeinfo, void* optionvalues) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValuesV5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, classname, vendorname, scopeinfo, optionvalues);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo(void* serveripaddress, uint32_t flags, void* bindelementinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetServerBindingInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, bindelementinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6(void* serveripaddress, uint32_t flags, void* bindelementinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetServerBindingInfoV6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, bindelementinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer(void* serveripaddress, uint32_t subnetaddress, uint16_t timedelayinmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetDelayOffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, timedelayinmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo(void* serveripaddress, uint32_t subnetaddress, void* subnetinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, subnetinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ(void* serveripaddress, uint32_t subnetaddress, void* subnetinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetInfoVQ");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, subnetinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4(void* serveripaddress, uint32_t subnetaddress, void* superscopename, int32_t changeexisting) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSuperScopeV4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, superscopename, changeexisting);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)superscopename;
    (void)changeexisting;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions(uint32_t flags, void* reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetThreadOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams(uint32_t flags, void* reserved, void* adaptername, void* requestidstr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpUndoRequestParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, reserved, adaptername, requestidstr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)reserved;
    (void)adaptername;
    (void)requestidstr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange(void* serveripaddress, uint32_t subnetaddress, void* policyname, void* range) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4AddPolicyRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, policyname, range);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreateClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreateClientInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy(void* serveripaddress, void* ppolicy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreatePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, ppolicy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)ppolicy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx(void* serveripaddress, void* policyex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreatePolicyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, policyex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)policyex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy(void* serveripaddress, int32_t fglobalpolicy, uint32_t subnetaddress, void* policyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4DeletePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, policyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, int32_t fglobalpolicy, uint32_t subnetaddress, void* enuminfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumPolicies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, fglobalpolicy, subnetaddress, enuminfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, int32_t globalpolicy, uint32_t subnetaddress, void* enuminfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumPoliciesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, globalpolicy, subnetaddress, enuminfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClients");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* clientinfo, void* clientsread, void* clientstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClientsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations(void* serveripaddress, uint32_t subnetaddress, void* resumehandle, uint32_t preferredmaximum, void* enumelementinfo, void* elementsread, void* elementstotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetReservations");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship(void* serveripaddress, void* prelationship) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverAddScopeToRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, prelationship);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship(void* serveripaddress, void* prelationship) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverCreateRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, prelationship);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship(void* serveripaddress, void* prelationshipname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, prelationshipname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)prelationshipname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship(void* serveripaddress, void* prelationship) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteScopeFromRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, prelationship);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship(void* serveripaddress, void* resumehandle, uint32_t preferredmaximum, void* prelationship, void* relationshipread, void* relationshiptotal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverEnumRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, prelationship, relationshipread, relationshiptotal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)prelationship;
    (void)relationshipread;
    (void)relationshiptotal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus(void* serveripaddress, uint32_t subnetaddress, void* pstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetAddressStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, pstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)pstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship(void* serveripaddress, void* prelationshipname, void* prelationship) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, prelationshipname, prelationship);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)prelationshipname;
    (void)prelationship;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship(void* serveripaddress, uint32_t scopeid, void* prelationship) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeid, prelationship);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)prelationship;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics(void* serveripaddress, uint32_t scopeid, void* pstats) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeid, pstats);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)pstats;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime(void* serveripaddress, void* ptime, void* pmaxalloweddeltatime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, ptime, pmaxalloweddeltatime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)ptime;
    (void)pmaxalloweddeltatime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship(void* serveripaddress, uint32_t flags, void* prelationship) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverSetRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, prelationship);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)prelationship;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation(void* serveripaddress, void* pfailrelname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverTriggerAddrAllocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, pfailrelname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)pfailrelname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues(void* serveripaddress, uint32_t flags, void* scopeinfo, void* values) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetAllOptionValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, scopeinfo, values);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx(void* serveripaddress, void* searchinfo, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetClientInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, searchinfo, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress(void* serveripaddress, uint32_t scopeid, uint32_t startip, uint32_t endip, uint32_t numfreeaddrreq, void* ipaddrlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetFreeIPAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, scopeid, startip, endip, numfreeaddrreq, ipaddrlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)startip;
    (void)endip;
    (void)numfreeaddrreq;
    (void)ipaddrlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue(void* serveripaddress, uint32_t flags, uint32_t optionid, void* policyname, void* vendorname, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, policyname, vendorname, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy(void* serveripaddress, int32_t fglobalpolicy, uint32_t subnetaddress, void* policyname, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, policyname, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx(void* serveripaddress, int32_t globalpolicy, uint32_t subnetaddress, void* policyname, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetPolicyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, globalpolicy, subnetaddress, policyname, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement(void* serveripaddress, int32_t fglobalpolicy, uint32_t subnetaddress, void* enabled) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4QueryPolicyEnforcement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, enabled);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enabled;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue(void* serveripaddress, uint32_t flags, uint32_t optionid, void* policyname, void* vendorname, void* scopeinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4RemoveOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, policyname, vendorname, scopeinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange(void* serveripaddress, uint32_t subnetaddress, void* policyname, void* range) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4RemovePolicyRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, subnetaddress, policyname, range);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue(void* serveripaddress, uint32_t flags, uint32_t optionid, void* policyname, void* vendorname, void* scopeinfo, void* optionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, optionid, policyname, vendorname, scopeinfo, optionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues(void* serveripaddress, uint32_t flags, void* policyname, void* vendorname, void* scopeinfo, void* optionvalues) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetOptionValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, flags, policyname, vendorname, scopeinfo, optionvalues);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy(void* serveripaddress, uint32_t fieldsmodified, int32_t fglobalpolicy, uint32_t subnetaddress, void* policyname, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fieldsmodified, fglobalpolicy, subnetaddress, policyname, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement(void* serveripaddress, int32_t fglobalpolicy, uint32_t subnetaddress, int32_t enable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicyEnforcement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, enable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx(void* serveripaddress, uint32_t fieldsmodified, int32_t globalpolicy, uint32_t subnetaddress, void* policyname, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, fieldsmodified, globalpolicy, subnetaddress, policyname, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo(void* serveripaddress, void* clientinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV6CreateClientInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, clientinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics(void* serveripaddress, void* statelessstats) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV6GetStatelessStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serveripaddress, statelessstats);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serveripaddress;
    (void)statelessstats;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6CApiCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize(void* version) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6CApiInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(version);
        return;
    }
    errno = ENOSYS;
#else
    (void)version;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix(void* adaptername, void* classid, void* leaseinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6ReleasePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adaptername, classid, leaseinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adaptername;
    (void)classid;
    (void)leaseinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix(void* adaptername, void* pclassid, void* prefixleaseinfo, void* pdwtimetowait, uint32_t bvalidateprefix) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6RenewPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adaptername, pclassid, prefixleaseinfo, pdwtimetowait, bvalidateprefix);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    (void)bvalidateprefix;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix(void* adaptername, void* pclassid, void* prefixleaseinfo, void* pdwtimetowait) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6RequestPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adaptername, pclassid, prefixleaseinfo, pdwtimetowait);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    errno = ENOSYS;
    return 0;
#endif
}

