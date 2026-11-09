#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_snmp_wrapper.h"
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

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpCancelMsg(int64_t session, int32_t reqid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCancelMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, reqid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)reqid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpCleanup(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCleanup");
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

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpCleanupEx(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCleanupEx");
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

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpClose(int64_t session) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpContextToStr(int64_t context, void* string) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpContextToStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, string);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    (void)string;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpCountVbl(int64_t vbl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCountVbl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vbl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vbl;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpCreatePdu(int64_t session, uint32_t pdu_type, int32_t request_id, int32_t error_status, int32_t error_index, int64_t varbindlist) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, int32_t, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreatePdu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, pdu_type, request_id, error_status, error_index, varbindlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)pdu_type;
    (void)request_id;
    (void)error_status;
    (void)error_index;
    (void)varbindlist;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpCreateSession(void* hwnd, uint32_t wmsg, void* fcallback, void* lpclientdata) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreateSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, fcallback, lpclientdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wmsg;
    (void)fcallback;
    (void)lpclientdata;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpCreateVbl(int64_t session, void* name, void* value) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreateVbl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, name, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpDecodeMsg(int64_t session, void* srcentity, void* dstentity, void* context, void* pdu, void* msgbufdesc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDecodeMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, srcentity, dstentity, context, pdu, msgbufdesc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    (void)msgbufdesc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpDeleteVb(int64_t vbl, uint32_t arg_1_index) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDeleteVb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vbl, arg_1_index);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vbl;
    (void)arg_1_index;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicatePdu(int64_t session, int64_t pdu) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDuplicatePdu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, pdu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)pdu;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicateVbl(int64_t session, int64_t vbl) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDuplicateVbl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, vbl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)vbl;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpEncodeMsg(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, int64_t pdu, void* msgbufdesc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpEncodeMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, srcentity, dstentity, context, pdu, msgbufdesc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    (void)msgbufdesc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpEntityToStr(int64_t entity, uint32_t size, void* string) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpEntityToStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entity, size, string);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)entity;
    (void)size;
    (void)string;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpFreeContext(int64_t context) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpFreeDescriptor(uint32_t syntax, void* descriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syntax, descriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)syntax;
    (void)descriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpFreeEntity(int64_t entity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeEntity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)entity;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpFreePdu(int64_t pdu) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreePdu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdu);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdu;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpFreeVbl(int64_t vbl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeVbl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vbl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vbl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetLastError(int64_t session) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetPduData(int64_t pdu, void* pdu_type, void* request_id, void* error_status, void* error_index, void* varbindlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetPduData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdu, pdu_type, request_id, error_status, error_index, varbindlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdu;
    (void)pdu_type;
    (void)request_id;
    (void)error_status;
    (void)error_index;
    (void)varbindlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetransmitMode(void* nretransmitmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetRetransmitMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nretransmitmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nretransmitmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetry(int64_t hentity, void* npolicyretry, void* nactualretry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetRetry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, npolicyretry, nactualretry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)npolicyretry;
    (void)nactualretry;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetTimeout(int64_t hentity, void* npolicytimeout, void* nactualtimeout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, npolicytimeout, nactualtimeout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)npolicytimeout;
    (void)nactualtimeout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetTranslateMode(void* ntranslatemode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetTranslateMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntranslatemode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ntranslatemode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetVb(int64_t vbl, uint32_t arg_1_index, void* name, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetVb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vbl, arg_1_index, name, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vbl;
    (void)arg_1_index;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpGetVendorInfo(void* vendorinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetVendorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vendorinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vendorinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpListen(int64_t hentity, uint32_t lstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpListen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, lstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)lstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpListenEx(int64_t hentity, uint32_t lstatus, uint32_t nuseentityaddr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpListenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, lstatus, nuseentityaddr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)lstatus;
    (void)nuseentityaddr;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrClose(void* session) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrCtl(void* session, uint32_t dwctlcode, void* lpvinbuffer, uint32_t cbinbuffer, void* lpvoutbuffer, uint32_t cboutbuffer, void* lpcbbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrCtl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, dwctlcode, lpvinbuffer, cbinbuffer, lpvoutbuffer, cboutbuffer, lpcbbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)dwctlcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrap(void* enterprise, void* ipaddress, void* generictrap, void* specifictrap, void* timestamp, void* variablebindings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrGetTrap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enterprise, ipaddress, generictrap, specifictrap, timestamp, variablebindings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enterprise;
    (void)ipaddress;
    (void)generictrap;
    (void)specifictrap;
    (void)timestamp;
    (void)variablebindings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrapEx(void* enterprise, void* agentaddress, void* sourceaddress, void* generictrap, void* specifictrap, void* community, void* timestamp, void* variablebindings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrGetTrapEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enterprise, agentaddress, sourceaddress, generictrap, specifictrap, community, timestamp, variablebindings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enterprise;
    (void)agentaddress;
    (void)sourceaddress;
    (void)generictrap;
    (void)specifictrap;
    (void)community;
    (void)timestamp;
    (void)variablebindings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOidToStr(void* oid, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrOidToStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oid, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oid;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOpen(void* lpagentaddress, void* lpagentcommunity, int32_t ntimeout, int32_t nretries) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpagentaddress, lpagentcommunity, ntimeout, nretries);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpagentaddress;
    (void)lpagentcommunity;
    (void)ntimeout;
    (void)nretries;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrRequest(void* session, uint8_t requesttype, void* variablebindings, void* errorstatus, void* errorindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, requesttype, variablebindings, errorstatus, errorindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)requesttype;
    (void)variablebindings;
    (void)errorstatus;
    (void)errorindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrStrToOid(void* string, void* oid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrStrToOid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, oid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)oid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpMgrTrapListen(void* phtrapavailable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrTrapListen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phtrapavailable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phtrapavailable;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpOidCompare(void* xoid, void* yoid, uint32_t maxlen, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(xoid, yoid, maxlen, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)xoid;
    (void)yoid;
    (void)maxlen;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpOidCopy(void* srcoid, void* dstoid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(srcoid, dstoid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)srcoid;
    (void)dstoid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpOidToStr(void* srcoid, uint32_t size, void* string) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidToStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(srcoid, size, string);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)srcoid;
    (void)size;
    (void)string;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpOpen(void* hwnd, uint32_t wmsg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wmsg;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpRecvMsg(int64_t session, void* srcentity, void* dstentity, void* context, void* pdu) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpRecvMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, srcentity, dstentity, context, pdu);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpRegister(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, void* notification, uint32_t state) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, srcentity, dstentity, context, notification, state);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)notification;
    (void)state;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSendMsg(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, int64_t pdu) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSendMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, srcentity, dstentity, context, pdu);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetPduData(int64_t pdu, void* pdu_type, void* request_id, void* non_repeaters, void* max_repetitions, void* varbindlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetPduData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdu, pdu_type, request_id, non_repeaters, max_repetitions, varbindlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdu;
    (void)pdu_type;
    (void)request_id;
    (void)non_repeaters;
    (void)max_repetitions;
    (void)varbindlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetPort(int64_t hentity, uint32_t nport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, nport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)nport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetransmitMode(uint32_t nretransmitmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetRetransmitMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nretransmitmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nretransmitmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetry(int64_t hentity, uint32_t npolicyretry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetRetry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, npolicyretry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)npolicyretry;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetTimeout(int64_t hentity, uint32_t npolicytimeout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hentity, npolicytimeout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hentity;
    (void)npolicytimeout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetTranslateMode(uint32_t ntranslatemode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetTranslateMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntranslatemode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ntranslatemode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSetVb(int64_t vbl, uint32_t arg_1_index, void* name, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetVb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vbl, arg_1_index, name, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vbl;
    (void)arg_1_index;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpStartup(void* nmajorversion, void* nminorversion, void* nlevel, void* ntranslatemode, void* nretransmitmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nmajorversion, nminorversion, nlevel, ntranslatemode, nretransmitmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nmajorversion;
    (void)nminorversion;
    (void)nlevel;
    (void)ntranslatemode;
    (void)nretransmitmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpStartupEx(void* nmajorversion, void* nminorversion, void* nlevel, void* ntranslatemode, void* nretransmitmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStartupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nmajorversion, nminorversion, nlevel, ntranslatemode, nretransmitmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nmajorversion;
    (void)nminorversion;
    (void)nlevel;
    (void)ntranslatemode;
    (void)nretransmitmode;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpStrToContext(int64_t session, void* string) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networkmanagement_snmp_SnmpStrToEntity(int64_t session, void* string) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToEntity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpStrToOid(void* string, void* dstoid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToOid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, dstoid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)string;
    (void)dstoid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_snmp_SnmpSvcGetUptime(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcGetUptime");
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

void windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogLevel(int32_t nloglevel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcSetLogLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nloglevel);
        return;
    }
    errno = ENOSYS;
#else
    (void)nloglevel;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogType(int32_t nlogtype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcSetLogType");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nlogtype);
        return;
    }
    errno = ENOSYS;
#else
    (void)nlogtype;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyCpy(void* panydst, void* panysrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilAsnAnyCpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(panydst, panysrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)panydst;
    (void)panysrc;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyFree(void* pany) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilAsnAnyFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pany);
        return;
    }
    errno = ENOSYS;
#else
    (void)pany;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_networkmanagement_snmp_SnmpUtilIdsToA(void* ids, uint32_t idlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilIdsToA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ids, idlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ids;
    (void)idlength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemAlloc(uint32_t nbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemFree(void* pmem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmem);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmem;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemReAlloc(void* pmem, uint32_t nbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemReAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmem, nbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pmem;
    (void)nbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCmp(void* poctets1, void* poctets2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poctets1, poctets2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poctets1;
    (void)poctets2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCpy(void* poctetsdst, void* poctetssrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsCpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poctetsdst, poctetssrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poctetsdst;
    (void)poctetssrc;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsFree(void* poctets) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(poctets);
        return;
    }
    errno = ENOSYS;
#else
    (void)poctets;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsNCmp(void* poctets1, void* poctets2, uint32_t nchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsNCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poctets1, poctets2, nchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poctets1;
    (void)poctets2;
    (void)nchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidAppend(void* poiddst, void* poidsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidAppend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poiddst, poidsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poiddst;
    (void)poidsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCmp(void* poid1, void* poid2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poid1, poid2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poid1;
    (void)poid2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCpy(void* poiddst, void* poidsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidCpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poiddst, poidsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poiddst;
    (void)poidsrc;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidFree(void* poid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(poid);
        return;
    }
    errno = ENOSYS;
#else
    (void)poid;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidNCmp(void* poid1, void* poid2, uint32_t nsubids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidNCmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poid1, poid2, nsubids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poid1;
    (void)poid2;
    (void)nsubids;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidToA(void* oid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidToA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)oid;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintAsnAny(void* pany) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilPrintAsnAny");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pany);
        return;
    }
    errno = ENOSYS;
#else
    (void)pany;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintOid(void* oid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilPrintOid");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oid);
        return;
    }
    errno = ENOSYS;
#else
    (void)oid;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindCpy(void* pvbdst, void* pvbsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindCpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvbdst, pvbsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvbdst;
    (void)pvbsrc;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindFree(void* pvb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvb);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvb;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListCpy(void* pvbldst, void* pvblsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindListCpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvbldst, pvblsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvbldst;
    (void)pvblsrc;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListFree(void* pvbl) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindListFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvbl);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvbl;
    errno = ENOSYS;
#endif
}

