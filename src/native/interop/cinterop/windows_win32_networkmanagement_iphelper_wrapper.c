#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_iphelper_wrapper.h"
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

uint32_t windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress(uint32_t address, uint32_t ipmask, uint32_t ifindex, void* ntecontext, void* nteinstance) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIPAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, ipmask, ifindex, ntecontext, nteinstance);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    (void)ipmask;
    (void)ifindex;
    (void)ntecontext;
    (void)nteinstance;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify(void* notifyoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIPChangeNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange(void* notificationhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIfTimestampConfigChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notificationhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)notificationhandle;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2(void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelMibChangeNotify2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp(void* interfaceluid, void* crosstimestamp) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CaptureInterfaceHardwareCrossTimestamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, crosstimestamp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)crosstimestamp;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId(void* compartmentguid, void* compartmentid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertCompartmentGuidToId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compartmentguid, compartmentid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)compartmentguid;
    (void)compartmentid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid(uint32_t compartmentid, void* compartmentguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertCompartmentIdToGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compartmentid, compartmentguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)compartmentid;
    (void)compartmentguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid(void* interfacealias, void* interfaceluid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceAliasToLuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacealias, interfaceluid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfacealias;
    (void)interfaceluid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid(void* interfaceguid, void* interfaceluid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceGuidToLuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceguid, interfaceluid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceguid;
    (void)interfaceluid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid(uint32_t interfaceindex, void* interfaceluid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceIndexToLuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceindex, interfaceluid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceindex;
    (void)interfaceluid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias(void* interfaceluid, void* interfacealias, uint64_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToAlias");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, interfacealias, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)interfacealias;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid(void* interfaceluid, void* interfaceguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, interfaceguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)interfaceguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex(void* interfaceluid, void* interfaceindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, interfaceindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)interfaceindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA(void* interfaceluid, void* interfacename, uint64_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, interfacename, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)interfacename;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW(void* interfaceluid, void* interfacename, uint64_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, interfacename, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)interfacename;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA(void* interfacename, void* interfaceluid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceNameToLuidA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacename, interfaceluid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfacename;
    (void)interfaceluid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW(void* interfacename, void* interfaceluid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceNameToLuidW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacename, interfaceluid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfacename;
    (void)interfaceluid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength(uint32_t mask, void* masklength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertIpv4MaskToLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mask, masklength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mask;
    (void)masklength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask(uint32_t masklength, void* mask) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertLengthToIpv4Mask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(masklength, mask);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)masklength;
    (void)mask;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAnycastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry(void* proute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpForwardEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proute;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpForwardEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry(void* parpentry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpNetEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parpentry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)parpentry;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpNetEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation(uint16_t startport, uint16_t numberofports, void* token) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePersistentTcpPortReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startport, numberofports, token);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation(uint16_t startport, uint16_t numberofports, void* token) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePersistentUdpPortReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startport, numberofports, token);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry(uint32_t dwaddress, uint32_t dwmask, uint32_t dwifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProxyArpEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwaddress, dwmask, dwifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwaddress;
    (void)dwmask;
    (void)dwifindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs(void* sourceaddresslist, uint32_t sourceaddresscount, void* destinationaddresslist, uint32_t destinationaddresscount, uint32_t addresssortoptions, void* sortedaddresspairlist, void* sortedaddresspaircount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSortedAddressPairs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceaddresslist, sourceaddresscount, destinationaddresslist, destinationaddresscount, addresssortoptions, sortedaddresspairlist, sortedaddresspaircount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourceaddresslist;
    (void)sourceaddresscount;
    (void)destinationaddresslist;
    (void)destinationaddresscount;
    (void)addresssortoptions;
    (void)sortedaddresspairlist;
    (void)sortedaddresspaircount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUnicastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAnycastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress(uint32_t ntecontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIPAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntecontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ntecontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry(void* proute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpForwardEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proute;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpForwardEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry(void* parpentry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpNetEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parpentry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)parpentry;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpNetEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation(uint16_t startport, uint16_t numberofports) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePersistentTcpPortReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startport, numberofports);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startport;
    (void)numberofports;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation(uint16_t startport, uint16_t numberofports) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePersistentUdpPortReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startport, numberofports);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startport;
    (void)numberofports;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry(uint32_t dwaddress, uint32_t dwmask, uint32_t dwifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProxyArpEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwaddress, dwmask, dwifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwaddress;
    (void)dwmask;
    (void)dwifindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUnicastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense(void* phandle, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableMediaSense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phandle, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phandle;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_EnableRouter(void* phandle, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableRouter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phandle, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phandle;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable(uint32_t dwifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushIpNetTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwifindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2(uint16_t family, uint32_t interfaceindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushIpNetTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, interfaceindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)interfaceindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable(uint16_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushIpPathTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings(void* settings) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeDnsSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(settings);
        return;
    }
    errno = ENOSYS;
#else
    (void)settings;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings(void* settings) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInterfaceDnsSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(settings);
        return;
    }
    errno = ENOSYS;
#else
    (void)settings;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable(void* memory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeMibTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memory);
        return;
    }
    errno = ENOSYS;
#else
    (void)memory;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex(void* adaptername, void* ifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdapterIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adaptername, ifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adaptername;
    (void)ifindex;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdapterOrderMap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses(uint32_t family, uint32_t flags, void* reserved, void* adapteraddresses, void* sizepointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdaptersAddresses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, flags, reserved, adapteraddresses, sizepointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)flags;
    (void)reserved;
    (void)adapteraddresses;
    (void)sizepointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo(void* adapterinfo, void* sizepointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdaptersInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterinfo, sizepointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adapterinfo;
    (void)sizepointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAnycastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAnycastIpAddressTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface(uint32_t dwdestaddr, void* pdwbestifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdestaddr, pdwbestifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwdestaddr;
    (void)pdwbestifindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx(void* pdestaddr, void* pdwbestifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestInterfaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdestaddr, pdwbestifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdestaddr;
    (void)pdwbestifindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute(uint32_t dwdestaddr, uint32_t dwsourceaddr, void* pbestroute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestRoute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdestaddr, dwsourceaddr, pbestroute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwdestaddr;
    (void)dwsourceaddr;
    (void)pbestroute;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2(void* interfaceluid, uint32_t interfaceindex, void* sourceaddress, void* destinationaddress, uint32_t addresssortoptions, void* bestroute, void* bestsourceaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestRoute2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, interfaceindex, sourceaddress, destinationaddress, addresssortoptions, bestroute, bestsourceaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)interfaceindex;
    (void)sourceaddress;
    (void)destinationaddress;
    (void)addresssortoptions;
    (void)bestroute;
    (void)bestsourceaddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadCompartmentId");
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

void windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope(void* compartmentscope, void* compartmentid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadCompartmentScope");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(compartmentscope, compartmentid);
        return;
    }
    errno = ENOSYS;
#else
    (void)compartmentscope;
    (void)compartmentid;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultCompartmentId");
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

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings(void* settings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDnsSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(settings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)settings;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable(void* ptcptable, void* pdwsize, int32_t border, uint32_t ulaf, int32_t tableclass, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExtendedTcpTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptcptable, pdwsize, border, ulaf, tableclass, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ptcptable;
    (void)pdwsize;
    (void)border;
    (void)ulaf;
    (void)tableclass;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable(void* pudptable, void* pdwsize, int32_t border, uint32_t ulaf, int32_t tableclass, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExtendedUdpTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pudptable, pdwsize, border, ulaf, tableclass, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pudptable;
    (void)pdwsize;
    (void)border;
    (void)ulaf;
    (void)tableclass;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex(uint32_t ifindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFriendlyIfIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics(void* statistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIcmpStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIcmpStatisticsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry(void* pifrow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pifrow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pifrow;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex(int32_t level, void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfEntry2Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(level, row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)level;
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable(void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfStackTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfTable(void* piftable, void* pdwsize, int32_t border) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piftable, pdwsize, border);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)piftable;
    (void)pdwsize;
    (void)border;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2(void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex(int32_t level, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfTable2Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(level, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)level;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities(void* interfaceluid, void* timestampcapabilites) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceActiveTimestampCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, timestampcapabilites);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities(void* interfaceluid, void* timestampcapabilites) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceCurrentTimestampCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, timestampcapabilites);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities(void* interfaceluid, void* timestampcapabilites) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceHardwareTimestampCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, timestampcapabilites);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo(void* piftable, void* dwoutbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piftable, dwoutbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)piftable;
    (void)dwoutbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities(void* interfaceluid, void* timestampcapabilites) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceSupportedTimestampCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceluid, timestampcapabilites);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable(void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInvertedIfStackTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable(void* pipaddrtable, void* pdwsize, int32_t border) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpAddrTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pipaddrtable, pdwsize, border);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pipaddrtable;
    (void)pdwsize;
    (void)border;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString(uint32_t errorcode, void* buffer, void* size) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpErrorString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorcode, buffer, size);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)errorcode;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpForwardEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable(void* pipforwardtable, void* pdwsize, int32_t border) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpForwardTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pipforwardtable, pdwsize, border);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pipforwardtable;
    (void)pdwsize;
    (void)border;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpForwardTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpInterfaceEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpInterfaceTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable(void* ipnettable, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ipnettable, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ipnettable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates(uint32_t interfaceindex, uint16_t addressfamily, void* bandwidthestimates) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetworkConnectionBandwidthEstimates");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceindex, addressfamily, bandwidthestimates);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceindex;
    (void)addressfamily;
    (void)bandwidthestimates;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpPathEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpPathTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics(void* statistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpStatisticsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId(void* jobhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetJobCompartmentId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(jobhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)jobhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMulticastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMulticastIpAddressTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint(void* connectivityhint) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkConnectivityHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectivityhint);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connectivityhint;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface(uint32_t interfaceindex, void* connectivityhint) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkConnectivityHintForInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceindex, connectivityhint);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceindex;
    (void)connectivityhint;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation(void* networkguid, void* compartmentid, void* siteid, void* networkname, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkguid, compartmentid, siteid, networkname, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)networkguid;
    (void)compartmentid;
    (void)siteid;
    (void)networkname;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams(void* pfixedinfo, void* poutbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfixedinfo, poutbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfixedinfo;
    (void)poutbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces(void* pdwnumif) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfInterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwnumif);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdwnumif;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo(uint32_t ulpid, void* pinfo, int32_t arg_2_class, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromPidAndInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulpid, pinfo, arg_2_class, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulpid;
    (void)pinfo;
    (void)arg_2_class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry(void* ptcpentry, int32_t arg_1_class, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromTcp6Entry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptcpentry, arg_1_class, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ptcpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry(void* ptcpentry, int32_t arg_1_class, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromTcpEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptcpentry, arg_1_class, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ptcpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry(void* pudpentry, int32_t arg_1_class, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromUdp6Entry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pudpentry, arg_1_class, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pudpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry(void* pudpentry, int32_t arg_1_class, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromUdpEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pudpentry, arg_1_class, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pudpentry;
    (void)arg_1_class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo(uint32_t ifindex, void* pperadapterinfo, void* poutbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerAdapterInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifindex, pperadapterinfo, poutbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifindex;
    (void)pperadapterinfo;
    (void)poutbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats(void* row, int32_t estatstype, void* rw, uint32_t rwversion, uint32_t rwsize, void* ros, uint32_t rosversion, uint32_t rossize, void* rod, uint32_t rodversion, uint32_t rodsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerTcp6ConnectionEStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row, estatstype, rw, rwversion, rwsize, ros, rosversion, rossize, rod, rodversion, rodsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)ros;
    (void)rosversion;
    (void)rossize;
    (void)rod;
    (void)rodversion;
    (void)rodsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats(void* row, int32_t estatstype, void* rw, uint32_t rwversion, uint32_t rwsize, void* ros, uint32_t rosversion, uint32_t rossize, void* rod, uint32_t rodversion, uint32_t rodsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerTcpConnectionEStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row, estatstype, rw, rwversion, rwsize, ros, rosversion, rossize, rod, rodversion, rodsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)ros;
    (void)rosversion;
    (void)rossize;
    (void)rod;
    (void)rodversion;
    (void)rodsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount(uint32_t destipaddress, void* hopcount, uint32_t maxhops, void* rtt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRTTAndHopCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destipaddress, hopcount, maxhops, rtt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destipaddress;
    (void)hopcount;
    (void)maxhops;
    (void)rtt;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId(uint32_t sessionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSessionCompartmentId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table(void* tcptable, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcp6Table");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tcptable, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2(void* tcptable, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcp6Table2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tcptable, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics(void* statistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpStatisticsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpStatisticsEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable(void* tcptable, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tcptable, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2(void* tcptable, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tcptable, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort(void* port) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTeredoPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(port);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)port;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table(void* udp6table, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdp6Table");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udp6table, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udp6table;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics(void* stats) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stats);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)stats;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpStatisticsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpStatisticsEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable(void* udptable, void* sizepointer, int32_t order) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udptable, sizepointer, order);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo(void* pipifinfo, void* dwoutbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUniDirectionalAdapterInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pipifinfo, dwoutbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pipifinfo;
    (void)dwoutbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnicastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable(uint16_t family, void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnicastIpAddressTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Icmp6CreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies(void* replybuffer, uint32_t replysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Icmp6ParseReplies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(replybuffer, replysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)replybuffer;
    (void)replysize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle(void* icmphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icmphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)icmphandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpCreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies(void* replybuffer, uint32_t replysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpParseReplies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(replybuffer, replysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)replybuffer;
    (void)replysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho(void* icmphandle, uint32_t destinationaddress, void* requestdata, uint16_t requestsize, void* requestoptions, void* replybuffer, uint32_t replysize, uint32_t timeout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpSendEcho");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icmphandle, destinationaddress, requestdata, requestsize, requestoptions, replybuffer, replysize, timeout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)icmphandle;
    (void)destinationaddress;
    (void)requestdata;
    (void)requestsize;
    (void)requestoptions;
    (void)replybuffer;
    (void)replysize;
    (void)timeout;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry(void* row) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeIpForwardEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(row);
        return;
    }
    errno = ENOSYS;
#else
    (void)row;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry(void* row) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeIpInterfaceEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(row);
        return;
    }
    errno = ENOSYS;
#else
    (void)row;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeUnicastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(row);
        return;
    }
    errno = ENOSYS;
#else
    (void)row;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress(void* adapterinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IpReleaseAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adapterinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress(void* adapterinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IpRenewAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adapterinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation(uint16_t startport, uint16_t numberofports, void* token) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPersistentTcpPortReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startport, numberofports, token);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation(uint16_t startport, uint16_t numberofports, void* token) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPersistentUdpPortReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startport, numberofports, token);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack(void* pptable, void* pdwcount, int32_t border, void* hheap, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NhpAllocateAndGetInterfaceInfoFromStack");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pptable, pdwcount, border, hheap, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pptable;
    (void)pdwcount;
    (void)border;
    (void)hheap;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange(void* handle, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyAddrChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange(void* callercontext, void* callback, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyIfTimestampConfigChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callercontext, callback, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callercontext;
    (void)callback;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange(uint16_t family, void* callback, void* callercontext, bool initialnotification, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyIpInterfaceChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, callback, callercontext, initialnotification, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange(void* callback, void* callercontext, bool initialnotification, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyNetworkConnectivityHintChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, callercontext, initialnotification, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange(void* handle, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyRouteChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2(uint16_t addressfamily, void* callback, void* callercontext, bool initialnotification, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyRouteChange2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressfamily, callback, callercontext, initialnotification, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)addressfamily;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable(uint16_t family, void* table, void* callercallback, void* callercontext, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyStableUnicastIpAddressTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, table, callercallback, callercontext, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)table;
    (void)callercallback;
    (void)callercontext;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange(void* callback, void* callercontext, bool initialnotification, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyTeredoPortChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, callercontext, initialnotification, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange(uint16_t family, void* callback, void* callercontext, bool initialnotification, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyUnicastIpAddressChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, callback, callercontext, initialnotification, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)family;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString(void* networkstring, uint32_t types, void* addressinfo, void* portnumber, void* prefixlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseNetworkString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkstring, types, addressinfo, portnumber, prefixlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)networkstring;
    (void)types;
    (void)addressinfo;
    (void)portnumber;
    (void)prefixlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface(void* ih, uint32_t cinfilters, void* pfiltin, uint32_t coutfilters, void* pfiltout, void* pfhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfAddFiltersToInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ih, cinfilters, pfiltin, coutfilters, pfiltout, pfhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ih;
    (void)cinfilters;
    (void)pfiltin;
    (void)coutfilters;
    (void)pfiltout;
    (void)pfhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface(void* pinterface, int32_t gffilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfAddGlobalFilterToInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, gffilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)gffilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress(void* pinterface, int32_t pfattype, void* ipaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfBindInterfaceToIPAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, pfattype, ipaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)pfattype;
    (void)ipaddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex(void* pinterface, uint32_t dwindex, int32_t pfatlinktype, void* linkipaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfBindInterfaceToIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, dwindex, pfatlinktype, linkipaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)dwindex;
    (void)pfatlinktype;
    (void)linkipaddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface(uint32_t dwname, int32_t inaction, int32_t outaction, int32_t buselog, int32_t bmustbeunique, void* ppinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfCreateInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwname, inaction, outaction, buselog, bmustbeunique, ppinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwname;
    (void)inaction;
    (void)outaction;
    (void)buselog;
    (void)bmustbeunique;
    (void)ppinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface(void* pinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfDeleteInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfDeleteLog");
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

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics(void* pinterface, void* ppfstats, void* pdwbuffersize, int32_t fresetcounters) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfGetInterfaceStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, ppfstats, pdwbuffersize, fresetcounters);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)ppfstats;
    (void)pdwbuffersize;
    (void)fresetcounters;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog(void* hevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfMakeLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hevent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters(void* pinterface, void* platebindinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRebindFilters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, platebindinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)platebindinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles(void* pinterface, uint32_t cfilters, void* pvhandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRemoveFilterHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, cfilters, pvhandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)cfilters;
    (void)pvhandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface(void* ih, uint32_t cinfilters, void* pfiltin, uint32_t coutfilters, void* pfiltout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRemoveFiltersFromInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ih, cinfilters, pfiltin, coutfilters, pfiltout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ih;
    (void)cinfilters;
    (void)pfiltin;
    (void)coutfilters;
    (void)pfiltout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface(void* pinterface, int32_t gffilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRemoveGlobalFilterFromInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, gffilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)gffilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer(void* pbbuffer, uint32_t dwsize, uint32_t dwthreshold, uint32_t dwentries, void* pdwloggedentries, void* pdwlostentries, void* pdwsizeused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfSetLogBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbbuffer, dwsize, dwthreshold, dwentries, pdwloggedentries, pdwlostentries, pdwsizeused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbbuffer;
    (void)dwsize;
    (void)dwthreshold;
    (void)dwentries;
    (void)pdwloggedentries;
    (void)pdwlostentries;
    (void)pdwsizeused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket(void* pininterface, void* poutinterface, uint32_t cbytes, void* pbpacket, void* ppaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfTestPacket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pininterface, poutinterface, cbytes, pbpacket, ppaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pininterface;
    (void)poutinterface;
    (void)cbytes;
    (void)pbpacket;
    (void)ppaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface(void* pinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfUnBindInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange(void* callback, void* callercontext, void* notificationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterInterfaceTimestampConfigChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, callercontext, notificationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callback;
    (void)callercontext;
    (void)notificationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2(void* row, void* sourceaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveIpNetEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row, sourceaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    (void)sourceaddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor(void* networkaddress, void* physicaladdress, void* physicaladdresslength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveNeighbor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkaddress, physicaladdress, physicaladdresslength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)networkaddress;
    (void)physicaladdress;
    (void)physicaladdresslength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense(void* poverlapped, void* lpdwenablecount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreMediaSense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poverlapped, lpdwenablecount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)poverlapped;
    (void)lpdwenablecount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SendARP(uint32_t destip, uint32_t srcip, void* pmacaddr, void* phyaddrlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendARP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destip, srcip, pmacaddr, phyaddrlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)destip;
    (void)srcip;
    (void)pmacaddr;
    (void)phyaddrlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId(uint32_t compartmentid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentThreadCompartmentId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compartmentid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)compartmentid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope(uint32_t compartmentscope) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentThreadCompartmentScope");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compartmentscope);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)compartmentscope;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings(void* settings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDnsSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(settings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)settings;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry(void* pifrow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIfEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pifrow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pifrow;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry(void* proute) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpForwardEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proute);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proute;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2(void* route) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpForwardEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(route);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)route;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpInterfaceEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry(void* parpentry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpNetEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parpentry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)parpentry;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpNetEntry2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics(void* pipstats) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pipstats);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pipstats;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx(void* statistics, uint32_t family) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpStatisticsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statistics, family);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL(uint32_t nttl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpTTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nttl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nttl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId(void* jobhandle, uint32_t compartmentid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetJobCompartmentId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(jobhandle, compartmentid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)jobhandle;
    (void)compartmentid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation(void* networkguid, uint32_t compartmentid, void* networkname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNetworkInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkguid, compartmentid, networkname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)networkguid;
    (void)compartmentid;
    (void)networkname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats(void* row, int32_t estatstype, void* rw, uint32_t rwversion, uint32_t rwsize, uint32_t offset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerTcp6ConnectionEStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row, estatstype, rw, rwversion, rwsize, offset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)offset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats(void* row, int32_t estatstype, void* rw, uint32_t rwversion, uint32_t rwsize, uint32_t offset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerTcpConnectionEStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row, estatstype, rw, rwversion, rwsize, offset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)offset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId(uint32_t sessionid, uint32_t compartmentid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSessionCompartmentId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionid, compartmentid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionid;
    (void)compartmentid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry(void* ptcprow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTcpEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptcprow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ptcprow;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry(void* row) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUnicastIpAddressEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(row);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)row;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter(void* poverlapped, void* lpdwenablecount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnenableRouter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poverlapped, lpdwenablecount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)poverlapped;
    (void)lpdwenablecount;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange(void* notificationhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterInterfaceTimestampConfigChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notificationhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)notificationhandle;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_networkmanagement_iphelper_if_indextoname(uint32_t interfaceindex, void* interfacename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "if_indextoname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceindex, interfacename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)interfaceindex;
    (void)interfacename;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex(void* interfacename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "if_nametoindex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfacename;
    errno = ENOSYS;
    return 0;
#endif
}

