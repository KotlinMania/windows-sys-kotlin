#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_qos_wrapper.h"
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

int32_t windowssys_windows_win32_networkmanagement_qos_QOSAddSocketToFlow(void* qoshandle, uint64_t arg_1_socket, void* destaddr, int32_t traffictype, uint32_t flags, void* flowid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSAddSocketToFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, arg_1_socket, destaddr, traffictype, flags, flowid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)arg_1_socket;
    (void)destaddr;
    (void)traffictype;
    (void)flags;
    (void)flowid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSCancel(void* qoshandle, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSCloseHandle(void* qoshandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSCreateHandle(void* version, void* qoshandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSCreateHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version, qoshandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)version;
    (void)qoshandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSEnumerateFlows(void* qoshandle, void* size, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSEnumerateFlows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, size, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)size;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSNotifyFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSNotifyFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, flowid, operation, size, buffer, flags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)flowid;
    (void)operation;
    (void)size;
    (void)buffer;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSQueryFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSQueryFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, flowid, operation, size, buffer, flags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)flowid;
    (void)operation;
    (void)size;
    (void)buffer;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSRemoveSocketFromFlow(void* qoshandle, uint64_t arg_1_socket, uint32_t flowid, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSRemoveSocketFromFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, arg_1_socket, flowid, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)arg_1_socket;
    (void)flowid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSSetFlow(void* qoshandle, uint32_t flowid, int32_t operation, uint32_t size, void* buffer, uint32_t flags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSSetFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, flowid, operation, size, buffer, flags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)flowid;
    (void)operation;
    (void)size;
    (void)buffer;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSStartTrackingClient(void* qoshandle, void* destaddr, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSStartTrackingClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, destaddr, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)destaddr;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_qos_QOSStopTrackingClient(void* qoshandle, void* destaddr, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSStopTrackingClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qoshandle, destaddr, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)qoshandle;
    (void)destaddr;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcAddFilter(void* flowhandle, void* pgenericfilter, void* pfilterhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcAddFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flowhandle, pgenericfilter, pfilterhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flowhandle;
    (void)pgenericfilter;
    (void)pfilterhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcAddFlow(void* ifchandle, void* clflowctx, uint32_t flags, void* pgenericflow, void* pflowhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcAddFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifchandle, clflowctx, flags, pgenericflow, pflowhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifchandle;
    (void)clflowctx;
    (void)flags;
    (void)pgenericflow;
    (void)pflowhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcCloseInterface(void* ifchandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcCloseInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifchandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifchandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcDeleteFilter(void* filterhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcDeleteFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filterhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcDeleteFlow(void* flowhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcDeleteFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flowhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flowhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcDeregisterClient(void* clienthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcDeregisterClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clienthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcEnumerateFlows(void* ifchandle, void* penumhandle, void* pflowcount, void* pbufsize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcEnumerateFlows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifchandle, penumhandle, pflowcount, pbufsize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifchandle;
    (void)penumhandle;
    (void)pflowcount;
    (void)pbufsize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcEnumerateInterfaces(void* clienthandle, void* pbuffersize, void* interfacebuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcEnumerateInterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienthandle, pbuffersize, interfacebuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clienthandle;
    (void)pbuffersize;
    (void)interfacebuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameA(void* flowhandle, uint32_t strsize, void* pflowname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcGetFlowNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flowhandle, strsize, pflowname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flowhandle;
    (void)strsize;
    (void)pflowname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameW(void* flowhandle, uint32_t strsize, void* pflowname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcGetFlowNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flowhandle, strsize, pflowname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flowhandle;
    (void)strsize;
    (void)pflowname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcModifyFlow(void* flowhandle, void* pgenericflow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcModifyFlow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flowhandle, pgenericflow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flowhandle;
    (void)pgenericflow;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceA(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcOpenInterfaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterfacename, clienthandle, clifcctx, pifchandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterfacename;
    (void)clienthandle;
    (void)clifcctx;
    (void)pifchandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceW(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcOpenInterfaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterfacename, clienthandle, clifcctx, pifchandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterfacename;
    (void)clienthandle;
    (void)clifcctx;
    (void)pifchandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcQueryFlowA(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcQueryFlowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflowname, pguidparam, pbuffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pflowname;
    (void)pguidparam;
    (void)pbuffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcQueryFlowW(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcQueryFlowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflowname, pguidparam, pbuffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pflowname;
    (void)pguidparam;
    (void)pbuffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcQueryInterface(void* ifchandle, void* pguidparam, bool notifychange, void* pbuffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcQueryInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifchandle, pguidparam, notifychange, pbuffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifchandle;
    (void)pguidparam;
    (void)notifychange;
    (void)pbuffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcRegisterClient(uint32_t tciversion, void* clregctx, void* clienthandlerlist, void* pclienthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcRegisterClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tciversion, clregctx, clienthandlerlist, pclienthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tciversion;
    (void)clregctx;
    (void)clienthandlerlist;
    (void)pclienthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcSetFlowA(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcSetFlowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflowname, pguidparam, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pflowname;
    (void)pguidparam;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcSetFlowW(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcSetFlowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflowname, pguidparam, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pflowname;
    (void)pguidparam;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_qos_TcSetInterface(void* ifchandle, void* pguidparam, uint32_t buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcSetInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifchandle, pguidparam, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ifchandle;
    (void)pguidparam;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

