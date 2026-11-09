#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_messagequeuing_wrapper.h"
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

int32_t windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName(void* lpwcsadspath, void* lpwcsformatname, void* lpdwformatnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQADsPathToFormatName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsadspath, lpwcsformatname, lpdwformatnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsadspath;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQBeginTransaction(void* pptransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQBeginTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pptransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pptransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQCloseCursor(void* hcursor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCloseCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQCloseQueue(int64_t hqueue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCloseQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQCreateCursor(int64_t hqueue, void* phcursor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCreateCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueue, phcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueue;
    (void)phcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQCreateQueue(void* psecuritydescriptor, void* pqueueprops, void* lpwcsformatname, void* lpdwformatnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCreateQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, pqueueprops, lpwcsformatname, lpdwformatnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)pqueueprops;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQDeleteQueue(void* lpwcsformatname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQDeleteQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsformatname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsformatname;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_messagequeuing_MQFreeMemory(void* pvmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvmemory;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext(void* hsecuritycontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQFreeSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hsecuritycontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)hsecuritycontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties(void* lpwcsmachinename, void* pguidmachineid, void* pqmprops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetMachineProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsmachinename, pguidmachineid, pqmprops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsmachinename;
    (void)pguidmachineid;
    (void)pqmprops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult(void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetOverlappedResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation(void* lpwcscomputername, void* pprivateprops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetPrivateComputerInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcscomputername, pprivateprops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcscomputername;
    (void)pprivateprops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties(void* lpwcsformatname, void* pqueueprops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetQueueProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsformatname, pqueueprops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsformatname;
    (void)pqueueprops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity(void* lpwcsformatname, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetQueueSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsformatname, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsformatname;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcertbuffer, dwcertbufferlength, phsecuritycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    (void)phsecuritycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetSecurityContextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcertbuffer, dwcertbufferlength, phsecuritycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    (void)phsecuritycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName(int64_t hqueue, void* lpwcsformatname, void* lpdwformatnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQHandleToFormatName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueue, lpwcsformatname, lpdwformatnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueue;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName(void* pguid, void* lpwcsformatname, void* lpdwformatnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQInstanceToFormatName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid, lpwcsformatname, lpdwformatnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pguid;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQLocateBegin(void* lpwcscontext, void* prestriction, void* pcolumns, void* psort, void* phenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQLocateBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcscontext, prestriction, pcolumns, psort, phenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcscontext;
    (void)prestriction;
    (void)pcolumns;
    (void)psort;
    (void)phenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQLocateEnd(void* henum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQLocateEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQLocateNext(void* henum, void* pcprops, void* apropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQLocateNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, pcprops, apropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henum;
    (void)pcprops;
    (void)apropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected(void* hqueue, uint64_t ulllookupid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMarkMessageRejected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueue, ulllookupid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueue;
    (void)ulllookupid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQMgmtAction(void* pcomputername, void* pobjectname, void* paction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMgmtAction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcomputername, pobjectname, paction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcomputername;
    (void)pobjectname;
    (void)paction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo(void* pcomputername, void* pobjectname, void* pmgmtprops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMgmtGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcomputername, pobjectname, pmgmtprops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcomputername;
    (void)pobjectname;
    (void)pmgmtprops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQMoveMessage(int64_t hsourcequeue, int64_t hdestinationqueue, uint64_t ulllookupid, void* ptransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMoveMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsourcequeue, hdestinationqueue, ulllookupid, ptransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsourcequeue;
    (void)hdestinationqueue;
    (void)ulllookupid;
    (void)ptransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQOpenQueue(void* lpwcsformatname, uint32_t dwaccess, uint32_t dwsharemode, void* phqueue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQOpenQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsformatname, dwaccess, dwsharemode, phqueue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsformatname;
    (void)dwaccess;
    (void)dwsharemode;
    (void)phqueue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName(void* lpwcspathname, void* lpwcsformatname, void* lpdwformatnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQPathNameToFormatName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcspathname, lpwcsformatname, lpdwformatnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcspathname;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQPurgeQueue(int64_t hqueue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQPurgeQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQReceiveMessage(int64_t hsource, uint32_t dwtimeout, uint32_t dwaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* hcursor, void* ptransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQReceiveMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsource, dwtimeout, dwaction, pmessageprops, lpoverlapped, fnreceivecallback, hcursor, ptransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsource;
    (void)dwtimeout;
    (void)dwaction;
    (void)pmessageprops;
    (void)lpoverlapped;
    (void)fnreceivecallback;
    (void)hcursor;
    (void)ptransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId(int64_t hsource, uint64_t ulllookupid, uint32_t dwlookupaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* ptransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQReceiveMessageByLookupId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsource, ulllookupid, dwlookupaction, pmessageprops, lpoverlapped, fnreceivecallback, ptransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsource;
    (void)ulllookupid;
    (void)dwlookupaction;
    (void)pmessageprops;
    (void)lpoverlapped;
    (void)fnreceivecallback;
    (void)ptransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate(uint32_t dwflags, void* lpcertbuffer, uint32_t dwcertbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQRegisterCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpcertbuffer, dwcertbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQSendMessage(int64_t hdestinationqueue, void* pmessageprops, void* ptransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQSendMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdestinationqueue, pmessageprops, ptransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdestinationqueue;
    (void)pmessageprops;
    (void)ptransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties(void* lpwcsformatname, void* pqueueprops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQSetQueueProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsformatname, pqueueprops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsformatname;
    (void)pqueueprops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity(void* lpwcsformatname, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQSetQueueSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwcsformatname, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwcsformatname;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

