#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_networkmanagement_ndis_wrapper.h"
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

void windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock(void* lock, bool fwrite, void* lockstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisAcquireReadWriteLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lock, fwrite, lockstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)lock;
    (void)fwrite;
    (void)lockstate;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag(void* virtualaddress, uint32_t length, uint32_t tag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisAllocateMemoryWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, length, tag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)virtualaddress;
    (void)length;
    (void)tag;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer(void* timer, void* timercancelled) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCancelTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, timercancelled);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)timercancelled;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty(void* ndisvchandle, void* protocolpartycontext, void* callparameters, void* ndispartyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClAddParty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, protocolpartycontext, callparameters, ndispartyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)protocolpartycontext;
    (void)callparameters;
    (void)ndispartyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily(void* ndisafhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClCloseAddressFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisafhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisafhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall(void* ndisvchandle, void* ndispartyhandle, void* buffer, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClCloseCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, ndispartyhandle, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap(void* ndissaphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClDeregisterSap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndissaphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndissaphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty(void* ndispartyhandle, void* buffer, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClDropParty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndispartyhandle, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete(int32_t status, void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClIncomingCallComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisvchandle, callparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall(void* ndisvchandle, void* callparameters, void* protocolpartycontext, void* ndispartyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClMakeCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, callparameters, protocolpartycontext, ndispartyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    (void)protocolpartycontext;
    (void)ndispartyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS(void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClModifyCallQoS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, callparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap(void* ndisafhandle, void* protocolsapcontext, void* sap, void* ndissaphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClRegisterSap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisafhandle, protocolsapcontext, sap, ndissaphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisafhandle;
    (void)protocolsapcontext;
    (void)sap;
    (void)ndissaphandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration(void* configurationhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCloseConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(configurationhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)configurationhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile(void* filehandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCloseFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filehandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc(void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmActivateVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, callparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete(int32_t status, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmAddPartyComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndispartyhandle, callmgrpartycontext, callparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete(int32_t status, void* ndisafhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmCloseAddressFamilyComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisafhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisafhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmCloseCallComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisvchandle, ndispartyhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc(void* ndisvchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDeactivateVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete(int32_t status, void* ndissaphandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDeregisterSapComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndissaphandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndissaphandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected(void* ndisvchandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchCallConnected");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ndisvchandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)ndisvchandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall(void* ndissaphandle, void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndissaphandle, ndisvchandle, callparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndissaphandle;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange(void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCallQoSChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ndisvchandle, callparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall(int32_t closestatus, void* ndisvchandle, void* buffer, uint32_t size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCloseCall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(closestatus, ndisvchandle, buffer, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)closestatus;
    (void)ndisvchandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty(int32_t dropstatus, void* ndispartyhandle, void* buffer, uint32_t size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingDropParty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dropstatus, ndispartyhandle, buffer, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)dropstatus;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete(int32_t status, void* ndispartyhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDropPartyComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndispartyhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndispartyhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmMakeCallComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisvchandle, ndispartyhandle, callmgrpartycontext, callparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete(int32_t status, void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmModifyCallQoSComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisvchandle, callparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete(int32_t status, void* ndisafhandle, void* callmgrafcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmOpenAddressFamilyComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisafhandle, callmgrafcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisafhandle;
    (void)callmgrafcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete(int32_t status, void* ndissaphandle, void* callmgrsapcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmRegisterSapComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndissaphandle, callmgrsapcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndissaphandle;
    (void)callmgrsapcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName(void* ndisvchandle, void* baseinstancename, void* vcinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoAssignInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, baseinstancename, vcinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)baseinstancename;
    (void)vcinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc(void* ndisbindinghandle, void* ndisafhandle, void* protocolvccontext, void* ndisvchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoCreateVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisbindinghandle, ndisafhandle, protocolvccontext, ndisvchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisbindinghandle;
    (void)ndisafhandle;
    (void)protocolvccontext;
    (void)ndisvchandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc(void* ndisvchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoDeleteVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId(void* ndisvchandle, void* tapicallid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoGetTapiCallId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, tapicallid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)tapicallid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCompleteDmaTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisdmahandle, buffer, offset, length, writetodevice);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer(void* status, void* buffer, void* poolhandle, void* memorydescriptor, uint32_t offset, uint32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCopyBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, buffer, poolhandle, memorydescriptor, offset, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)buffer;
    (void)poolhandle;
    (void)memorydescriptor;
    (void)offset;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisDeregisterTdiCallBack");
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

void windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory(void* virtualaddress, uint32_t length, uint32_t memoryflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(virtualaddress, length, memoryflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)virtualaddress;
    (void)length;
    (void)memoryflags;
    errno = ENOSYS;
#endif
}

uint8_t windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId(void) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGeneratePartialCancelId");
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

void windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts(void* pidlecount, void* pkernelanduser, void* pindex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCounts");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pidlecount, pkernelanduser, pindex);
        return;
    }
    errno = ENOSYS;
#else
    (void)pidlecount;
    (void)pkernelanduser;
    (void)pindex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage(void* pcpuusage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCpuUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcpuusage);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcpuusage;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress(void* ndisroutinename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetRoutineAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisroutinename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ndisroutinename;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetSharedDataAlignment");
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

uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetVersion");
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

void windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport(void* driverhandle, void* protocolhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMAssociateMiniport");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(driverhandle, protocolhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)driverhandle;
    (void)protocolhandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance(void* driverhandle, void* deviceinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMCancelInitializeDeviceInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverhandle, deviceinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverhandle;
    (void)deviceinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance(void* ndisminiporthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMDeInitializeDeviceInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisminiporthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisminiporthandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext(void* ndisbindinghandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMGetBindingContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisbindinghandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ndisbindinghandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx(void* driverhandle, void* driverinstance, void* devicecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMInitializeDeviceInstanceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverhandle, driverinstance, devicecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverhandle;
    (void)driverinstance;
    (void)devicecontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent(void* event) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(event);
        return;
    }
    errno = ENOSYS;
#else
    (void)event;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock(void* lock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeReadWriteLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lock);
        return;
    }
    errno = ENOSYS;
#else
    (void)lock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString(void* destination, void* source) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destination, source);
        return;
    }
    errno = ENOSYS;
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer(void* timer, void* timerfunction, void* functioncontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, timerfunction, functioncontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)timerfunction;
    (void)functioncontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, void* physicaladdress) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMAllocateSharedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniportadapterhandle, length, cached, virtualaddress, physicaladdress);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync(void* miniportadapterhandle, uint32_t length, bool cached, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMAllocateSharedMemoryAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportadapterhandle, length, cached, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer(void* timer, void* timercancelled) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCancelTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, timercancelled);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)timercancelled;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog(void* loghandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCloseLog");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(loghandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)loghandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc(void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmActivateVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle, callparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc(void* miniportadapterhandle, void* ndisafhandle, void* miniportvccontext, void* ndisvchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmCreateVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportadapterhandle, ndisafhandle, miniportvccontext, ndisvchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)miniportadapterhandle;
    (void)ndisafhandle;
    (void)miniportvccontext;
    (void)ndisvchandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc(void* ndisvchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmDeactivateVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc(void* ndisvchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmDeleteVc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndisvchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily(void* miniportadapterhandle, void* addressfamily, void* cmcharacteristics, uint32_t sizeofcmcharacteristics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmRegisterAddressFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportadapterhandle, addressfamily, cmcharacteristics, sizeofcmcharacteristics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)miniportadapterhandle;
    (void)addressfamily;
    (void)cmcharacteristics;
    (void)sizeofcmcharacteristics;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete(int32_t status, void* ndisvchandle, void* callparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCoActivateVcComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisvchandle, callparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete(int32_t status, void* ndisvchandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCoDeactivateVcComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisvchandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisvchandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog(void* miniportadapterhandle, uint32_t size, void* loghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCreateLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportadapterhandle, size, loghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)miniportadapterhandle;
    (void)size;
    (void)loghandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel(void* miniportdmahandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMDeregisterDmaChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniportdmahandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniportdmahandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange(void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports, void* portoffset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMDeregisterIoPortRange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniportadapterhandle, initialport, numberofports, portoffset);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    (void)portoffset;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog(void* loghandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMFlushLog");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(loghandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)loghandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, int64_t physicaladdress) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMFreeSharedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniportadapterhandle, length, cached, virtualaddress, physicaladdress);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty(void* miniportadapterhandle, void* physicaldeviceobject, void* functionaldeviceobject, void* nextdeviceobject, void* allocatedresources, void* allocatedresourcestranslated) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMGetDeviceProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniportadapterhandle, physicaldeviceobject, functionaldeviceobject, nextdeviceobject, allocatedresources, allocatedresourcestranslated);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniportadapterhandle;
    (void)physicaldeviceobject;
    (void)functionaldeviceobject;
    (void)nextdeviceobject;
    (void)allocatedresources;
    (void)allocatedresourcestranslated;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment(void* miniportadapterhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMGetDmaAlignment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportadapterhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)miniportadapterhandle;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer(void* timer, void* miniportadapterhandle, void* timerfunction, void* functioncontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMInitializeTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, miniportadapterhandle, timerfunction, functioncontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)miniportadapterhandle;
    (void)timerfunction;
    (void)functioncontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace(void* virtualaddress, void* miniportadapterhandle, int64_t physicaladdress, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMMapIoSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, miniportadapterhandle, physicaladdress, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)virtualaddress;
    (void)miniportadapterhandle;
    (void)physicaladdress;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName(void* padapterinstancename, void* miniporthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMQueryAdapterInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(padapterinstancename, miniporthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)padapterinstancename;
    (void)miniporthandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter(void* miniportdmahandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMReadDmaCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportdmahandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)miniportdmahandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel(void* miniportdmahandle, void* miniportadapterhandle, uint32_t dmachannel, bool dma32bitaddresses, void* dmadescription, uint32_t maximumlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRegisterDmaChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniportdmahandle, miniportadapterhandle, dmachannel, dma32bitaddresses, dmadescription, maximumlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)miniportdmahandle;
    (void)miniportadapterhandle;
    (void)dmachannel;
    (void)dma32bitaddresses;
    (void)dmadescription;
    (void)maximumlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange(void* portoffset, void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRegisterIoPortRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(portoffset, miniportadapterhandle, initialport, numberofports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)portoffset;
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport(void* miniporthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRemoveMiniport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(miniporthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)miniporthandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer(void* timer, uint32_t millisecondperiod) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMSetPeriodicTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, millisecondperiod);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)millisecondperiod;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep(uint32_t microsecondstosleep) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMSleep");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(microsecondstosleep);
        return;
    }
    errno = ENOSYS;
#else
    (void)microsecondstosleep;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace(void* miniportadapterhandle, void* virtualaddress, uint32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMUnmapIoSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniportadapterhandle, virtualaddress, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniportadapterhandle;
    (void)virtualaddress;
    (void)length;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData(void* loghandle, void* logbuffer, uint32_t logbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMWriteLogData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loghandle, logbuffer, logbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loghandle;
    (void)logbuffer;
    (void)logbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile(void* status, void* mappedbuffer, void* filehandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMapFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, mappedbuffer, filehandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)mappedbuffer;
    (void)filehandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex(void* status, void* configurationhandle, uint32_t arg_2_index, void* keyname, void* keyhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, configurationhandle, arg_2_index, keyname, keyhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)configurationhandle;
    (void)arg_2_index;
    (void)keyname;
    (void)keyhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName(void* status, void* configurationhandle, void* subkeyname, void* subkeyhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByName");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, configurationhandle, subkeyname, subkeyhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)configurationhandle;
    (void)subkeyname;
    (void)subkeyhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile(void* status, void* filehandle, void* filelength, void* filename, int64_t highestacceptableaddress) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, filehandle, filelength, filename, highestacceptableaddress);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)filehandle;
    (void)filelength;
    (void)filename;
    (void)highestacceptableaddress;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName(void* padapterinstancename, void* ndisbindinghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisQueryAdapterInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(padapterinstancename, ndisbindinghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)padapterinstancename;
    (void)ndisbindinghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName(void* padapterinstancename, void* bindingcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisQueryBindInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(padapterinstancename, bindingcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)padapterinstancename;
    (void)bindingcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings(void* ndisprotocolhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReEnumerateProtocolBindings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ndisprotocolhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)ndisprotocolhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration(void* status, void* parametervalue, void* configurationhandle, void* keyword, int32_t parametertype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReadConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, parametervalue, configurationhandle, keyword, parametertype);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)parametervalue;
    (void)configurationhandle;
    (void)keyword;
    (void)parametertype;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress(void* status, void* networkaddress, void* networkaddresslength, void* configurationhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReadNetworkAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, networkaddress, networkaddresslength, configurationhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)networkaddress;
    (void)networkaddresslength;
    (void)configurationhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack(void* registercallback, void* pnphandler) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisRegisterTdiCallBack");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(registercallback, pnphandler);
        return;
    }
    errno = ENOSYS;
#else
    (void)registercallback;
    (void)pnphandler;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock(void* lock, void* lockstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReleaseReadWriteLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lock, lockstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)lock;
    (void)lockstate;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent(void* event) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisResetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(event);
        return;
    }
    errno = ENOSYS;
#else
    (void)event;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent(void* event) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(event);
        return;
    }
    errno = ENOSYS;
#else
    (void)event;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer(void* ndistimer, uint32_t millisecondsperiod) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetPeriodicTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ndistimer, millisecondsperiod);
        return;
    }
    errno = ENOSYS;
#else
    (void)ndistimer;
    (void)millisecondsperiod;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer(void* timer, uint32_t millisecondstodelay) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, millisecondstodelay);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)millisecondstodelay;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx(void* ndistimer, uint32_t millisecondstodelay, void* functioncontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ndistimer, millisecondstodelay, functioncontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)ndistimer;
    (void)millisecondstodelay;
    (void)functioncontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetupDmaTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, ndisdmahandle, buffer, offset, length, writetodevice);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount(void) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSystemProcessorCount");
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

void windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile(void* filehandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisUnmapFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filehandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory(void* ndisadapterhandle, uint32_t length, void* virtualaddress, int64_t physicaladdress) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisUpdateSharedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ndisadapterhandle, length, virtualaddress, physicaladdress);
        return;
    }
    errno = ENOSYS;
#else
    (void)ndisadapterhandle;
    (void)length;
    (void)virtualaddress;
    (void)physicaladdress;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent(void* event, uint32_t mstowait) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWaitEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event, mstowait);
    }
    errno = ENOSYS;
    return false;
#else
    (void)event;
    (void)mstowait;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration(void* status, void* configurationhandle, void* keyword, void* parametervalue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status, configurationhandle, keyword, parametervalue);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    (void)configurationhandle;
    (void)keyword;
    (void)parametervalue;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry(void* loghandle, int32_t eventcode, uint32_t uniqueeventvalue, uint16_t numstrings, void* stringslist, uint32_t datasize, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteEventLogEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loghandle, eventcode, uniqueeventvalue, numstrings, stringslist, datasize, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loghandle;
    (void)eventcode;
    (void)uniqueeventvalue;
    (void)numstrings;
    (void)stringslist;
    (void)datasize;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

