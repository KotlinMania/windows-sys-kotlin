#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_system_systemservices_wrapper.h"
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

int32_t windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(void* plfolog, void* pcbcontainer, void* puszcontainerpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsAddLogContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, pcbcontainer, puszcontainerpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)pcbcontainer;
    (void)puszcontainerpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(void* plfolog, uint16_t ccontainers, void* pcbcontainer, void* rguszcontainerpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsAddLogContainerSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, ccontainers, pcbcontainer, rguszcontainerpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)ccontainers;
    (void)pcbcontainer;
    (void)rguszcontainerpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(void* pvmarshalcontext, void* plsnbase, uint32_t fflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsAdvanceLogBase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, plsnbase, fflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)plsnbase;
    (void)fflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(void* pvmarshalcontext, uint32_t crecords, void* rgcbreservation, void* pcbalignreservation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsAlignReservedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, crecords, rgcbreservation, pcbalignreservation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)crecords;
    (void)rgcbreservation;
    (void)pcbalignreservation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(void* pvmarshalcontext, uint32_t crecords, void* pcbadjustment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsAllocReservedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, crecords, pcbadjustment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)crecords;
    (void)pcbadjustment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(void* plfolog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsCloseAndResetLogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(void* plfolog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsCloseLogFileObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(void* pplfolog, void* puszlogfilename, uint32_t fdesiredaccess, uint32_t dwsharemode, void* psdlogfile, uint32_t fcreatedisposition, uint32_t fcreateoptions, uint32_t fflagsandattributes, uint32_t flogoptionflag, void* pvcontext, uint32_t cbcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsCreateLogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pplfolog, puszlogfilename, fdesiredaccess, dwsharemode, psdlogfile, fcreatedisposition, fcreateoptions, fflagsandattributes, flogoptionflag, pvcontext, cbcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pplfolog;
    (void)puszlogfilename;
    (void)fdesiredaccess;
    (void)dwsharemode;
    (void)psdlogfile;
    (void)fcreatedisposition;
    (void)fcreateoptions;
    (void)fflagsandattributes;
    (void)flogoptionflag;
    (void)pvcontext;
    (void)cbcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(void* plfolog, uint32_t cfromcontainer, uint32_t ccontainers, uint8_t escanmode, void* pcxscan) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsCreateScanContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, cfromcontainer, ccontainers, escanmode, pcxscan);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)cfromcontainer;
    (void)ccontainers;
    (void)escanmode;
    (void)pcxscan;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(void* plfolog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsDeleteLogByPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(void* puszlogfilename, void* pvreserved, uint32_t flogoptionflag, void* pvcontext, uint32_t cbcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsDeleteLogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puszlogfilename, pvreserved, flogoptionflag, pvcontext, cbcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)puszlogfilename;
    (void)pvreserved;
    (void)flogoptionflag;
    (void)pvcontext;
    (void)cbcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(void* pvmarshalcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsDeleteMarshallingArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesClfsFinalize(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsFinalize");
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

int32_t windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(void* pvmarshalcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsFlushBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(void* pvmarshalcontext, void* plsnflush, void* plsnlastflushed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsFlushToLsn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, plsnflush, plsnlastflushed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)plsnflush;
    (void)plsnlastflushed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(void* pvmarshalcontext, uint32_t crecords, void* pcbadjustment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsFreeReservedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, crecords, pcbadjustment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)crecords;
    (void)pcbadjustment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsGetContainerName(void* plfolog, uint32_t cidlogicalcontainer, void* puszcontainername, void* pcactuallencontainername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsGetContainerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, cidlogicalcontainer, puszcontainername, pcactuallencontainername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)cidlogicalcontainer;
    (void)puszcontainername;
    (void)pcactuallencontainername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(void* plfolog, void* pvstatsbuffer, uint32_t cbstatsbuffer, int32_t estatsclass, void* pcbstatswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsGetIoStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, pvstatsbuffer, cbstatsbuffer, estatsclass, pcbstatswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)pvstatsbuffer;
    (void)cbstatsbuffer;
    (void)estatsclass;
    (void)pcbstatswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(void* plfolog, void* pinfobuffer, void* pcbinfobuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsGetLogFileInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, pinfobuffer, pcbinfobuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)pinfobuffer;
    (void)pcbinfobuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsInitialize(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsInitialize");
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

uint32_t windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(void* plsn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnBlockOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plsn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesClfsLsnContainer(void* plsn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plsn;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsLsnDifference(void* plsnstart, void* plsnfinish, uint32_t cbcontainer, uint32_t cbmaxblock, void* pcbdifference) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnDifference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsnstart, plsnfinish, cbcontainer, cbmaxblock, pcbdifference);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plsnstart;
    (void)plsnfinish;
    (void)cbcontainer;
    (void)cbmaxblock;
    (void)pcbdifference;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesClfsLsnEqual(void* plsn1, void* plsn2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn1, plsn2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn1;
    (void)plsn2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesClfsLsnGreater(void* plsn1, void* plsn2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnGreater");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn1, plsn2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn1;
    (void)plsn2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(void* plsn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnInvalid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesClfsLsnLess(void* plsn1, void* plsn2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnLess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn1, plsn2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn1;
    (void)plsn2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesClfsLsnNull(void* plsn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnNull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(void* plsn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsLsnRecordSequence");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plsn;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(void* clientcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtDeregisterManagedClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(void* client) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtHandleLogFileFull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(client);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)client;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(void* logfile, void* policy, uint32_t policylength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtInstallPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfile, policy, policylength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfile;
    (void)policy;
    (void)policylength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(void* logfile, int32_t policytype, void* policy, void* policylength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtQueryPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfile, policytype, policy, policylength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfile;
    (void)policytype;
    (void)policy;
    (void)policylength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(void* logfile, void* registrationdata, void* clientcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtRegisterManagedClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfile, registrationdata, clientcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfile;
    (void)registrationdata;
    (void)clientcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(void* logfile, int32_t policytype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtRemovePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfile, policytype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfile;
    (void)policytype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(void* logfile, void* newsizeincontainers, void* resultingsizeincontainers, void* completionroutine, void* completionroutinedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtSetLogFileSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfile, newsizeincontainers, resultingsizeincontainers, completionroutine, completionroutinedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfile;
    (void)newsizeincontainers;
    (void)resultingsizeincontainers;
    (void)completionroutine;
    (void)completionroutinedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(void* logfile, void* clientcookie, void* newsizeincontainers, void* resultingsizeincontainers, void* completionroutine, void* completionroutinedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtSetLogFileSizeAsClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfile, clientcookie, newsizeincontainers, resultingsizeincontainers, completionroutine, completionroutinedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfile;
    (void)clientcookie;
    (void)newsizeincontainers;
    (void)resultingsizeincontainers;
    (void)completionroutine;
    (void)completionroutinedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(void* client, int32_t reason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsMgmtTailAdvanceFailure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(client, reason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)client;
    (void)reason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(void* plfolog, int32_t einformationclass, void* pinfoinputbuffer, uint32_t cbinfoinputbuffer, void* pinfobuffer, void* pcbinfobuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsQueryLogFileInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, einformationclass, pinfoinputbuffer, cbinfoinputbuffer, pinfobuffer, pcbinfobuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)einformationclass;
    (void)pinfoinputbuffer;
    (void)cbinfoinputbuffer;
    (void)pinfobuffer;
    (void)pcbinfobuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(void* pvmarshalcontext, void* plsnfirst, int32_t pecontextmode, void* ppvreadbuffer, void* pcbreadbuffer, void* perecordtype, void* plsnundonext, void* plsnprevious, void* ppvreadcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsReadLogRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, plsnfirst, pecontextmode, ppvreadbuffer, pcbreadbuffer, perecordtype, plsnundonext, plsnprevious, ppvreadcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)plsnfirst;
    (void)pecontextmode;
    (void)ppvreadbuffer;
    (void)pcbreadbuffer;
    (void)perecordtype;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)ppvreadcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(void* pvreadcontext, void* ppvbuffer, void* pcbbuffer, void* perecordtype, void* plsnuser, void* plsnundonext, void* plsnprevious, void* plsnrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsReadNextLogRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreadcontext, ppvbuffer, pcbbuffer, perecordtype, plsnuser, plsnundonext, plsnprevious, plsnrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreadcontext;
    (void)ppvbuffer;
    (void)pcbbuffer;
    (void)perecordtype;
    (void)plsnuser;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)plsnrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(void* pvreadcontext, void* ppvrestartbuffer, void* pcbrestartbuffer, void* plsnrestart) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsReadPreviousRestartArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreadcontext, ppvrestartbuffer, pcbrestartbuffer, plsnrestart);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreadcontext;
    (void)ppvrestartbuffer;
    (void)pcbrestartbuffer;
    (void)plsnrestart;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(void* pvmarshalcontext, void* ppvrestartbuffer, void* pcbrestartbuffer, void* plsn, void* ppvreadcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsReadRestartArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, ppvrestartbuffer, pcbrestartbuffer, plsn, ppvreadcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)ppvrestartbuffer;
    (void)pcbrestartbuffer;
    (void)plsn;
    (void)ppvreadcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(void* plfolog, void* puszcontainerpath, bool fforce) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsRemoveLogContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, puszcontainerpath, fforce);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)puszcontainerpath;
    (void)fforce;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(void* plfolog, uint16_t ccontainers, void* rgwszcontainerpath, bool fforce) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsRemoveLogContainerSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, ccontainers, rgwszcontainerpath, fforce);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)ccontainers;
    (void)rgwszcontainerpath;
    (void)fforce;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(void* pvmarshalcontext, void* rgwriteentries, uint32_t cwriteentries, void* plsnundonext, void* plsnprevious, uint32_t creserverecords, void* rgcbreservation, uint32_t fflags, void* plsn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsReserveAndAppendLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, rgwriteentries, cwriteentries, plsnundonext, plsnprevious, creserverecords, rgcbreservation, fflags, plsn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)rgwriteentries;
    (void)cwriteentries;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)creserverecords;
    (void)rgcbreservation;
    (void)fflags;
    (void)plsn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(void* pvmarshalcontext, void* rgwriteentries, uint32_t cwriteentries, uint32_t cbentryalignment, void* plsnundonext, void* plsnprevious, uint32_t creserverecords, void* rgcbreservation, uint32_t fflags, void* plsn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsReserveAndAppendLogAligned");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, rgwriteentries, cwriteentries, cbentryalignment, plsnundonext, plsnprevious, creserverecords, rgcbreservation, fflags, plsn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)rgwriteentries;
    (void)cwriteentries;
    (void)cbentryalignment;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)creserverecords;
    (void)rgcbreservation;
    (void)fflags;
    (void)plsn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(void* pcxscan, uint8_t escanmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsScanLogContainers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcxscan, escanmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcxscan;
    (void)escanmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(void* plfolog, void* plsnarchivetail) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsSetArchiveTail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, plsnarchivetail);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)plsnarchivetail;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(void* plfolog, void* plsnend) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsSetEndOfLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, plsnend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)plsnend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(void* plfolog, int32_t einformationclass, void* pinfobuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsSetLogFileInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plfolog, einformationclass, pinfobuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plfolog;
    (void)einformationclass;
    (void)pinfobuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(void* pvcursorcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsTerminateReadLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvcursorcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvcursorcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(void* pvmarshalcontext, void* pvrestartbuffer, uint32_t cbrestartbuffer, void* plsnbase, uint32_t fflags, void* pcbwritten, void* plsnnext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfs.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClfsWriteRestartArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, pvrestartbuffer, cbrestartbuffer, plsnbase, fflags, pcbwritten, plsnnext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)pvrestartbuffer;
    (void)cbrestartbuffer;
    (void)plsnbase;
    (void)fflags;
    (void)pcbwritten;
    (void)plsnnext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(void* cookie, void* object, void* objectid, void* objectname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmCallbackGetKeyObjectID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie, object, objectid, objectname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cookie;
    (void)object;
    (void)objectid;
    (void)objectname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(void* cookie, void* object, void* objectid, void* objectname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmCallbackGetKeyObjectIDEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie, object, objectid, objectname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cookie;
    (void)object;
    (void)objectid;
    (void)objectname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(void* objectname) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmCallbackReleaseKeyObjectIDEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objectname);
        return;
    }
    errno = ENOSYS;
#else
    (void)objectname;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(void* cookie, void* object) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmGetBoundTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie, object);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cookie;
    (void)object;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(void* major, void* minor) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmGetCallbackVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(major, minor);
        return;
    }
    errno = ENOSYS;
#else
    (void)major;
    (void)minor;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesCmRegisterCallback(void* function, void* context, void* cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, context, cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)function;
    (void)context;
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(void* function, void* altitude, void* driver, void* context, void* cookie, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmRegisterCallbackEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, altitude, driver, context, cookie, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)function;
    (void)altitude;
    (void)driver;
    (void)context;
    (void)cookie;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(void* object, void* cookie, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmSetCallbackObjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, cookie, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)cookie;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(int64_t cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CmUnRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(uint32_t status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgBreakPointWithStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesDbgPrint(void* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgPrint");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(format);
            case 1: return km_fn_ptr(format, (intptr_t)km_va0);
            case 2: return km_fn_ptr(format, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(format, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(format, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)format;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesDbgPrintEx(uint32_t componentid, uint32_t level, void* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgPrintEx");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(componentid, level, format);
            case 1: return km_fn_ptr(componentid, level, format, (intptr_t)km_va0);
            case 2: return km_fn_ptr(componentid, level, format, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(componentid, level, format, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(componentid, level, format, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)componentid;
    (void)level;
    (void)format;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(void* format, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgPrintReturnControlC");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(format);
            case 1: return km_fn_ptr(format, (intptr_t)km_va0);
            case 2: return km_fn_ptr(format, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(format, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(format, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)format;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesDbgPrompt(void* prompt, void* response, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgPrompt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prompt, response, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prompt;
    (void)response;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(uint32_t componentid, uint32_t level) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgQueryDebugFilterState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(componentid, level);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)componentid;
    (void)level;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(uint32_t componentid, uint32_t level, bool state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgSetDebugFilterState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(componentid, level, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)componentid;
    (void)level;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(void* debugprintcallback, bool enable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgSetDebugPrintCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(debugprintcallback, enable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)debugprintcallback;
    (void)enable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(uint32_t controlcode, void* activityid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwActivityIdControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controlcode, activityid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)controlcode;
    (void)activityid;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesEtwEventEnabled(int64_t reghandle, void* eventdescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwEventEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)reghandle;
    (void)eventdescriptor;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(int64_t reghandle, uint8_t level, uint64_t keyword) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwProviderEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, level, keyword);
    }
    errno = ENOSYS;
    return false;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwRegister(void* providerid, void* enablecallback, void* callbackcontext, void* reghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerid, enablecallback, callbackcontext, reghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)providerid;
    (void)enablecallback;
    (void)callbackcontext;
    (void)reghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwSetInformation(int64_t reghandle, int32_t informationclass, void* eventinformation, uint32_t informationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwSetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, informationclass, eventinformation, informationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reghandle;
    (void)informationclass;
    (void)eventinformation;
    (void)informationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwUnregister(int64_t reghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwWrite(int64_t reghandle, void* eventdescriptor, void* activityid, uint32_t userdatacount, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor, activityid, userdatacount, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)activityid;
    (void)userdatacount;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwWriteEx(int64_t reghandle, void* eventdescriptor, uint64_t filter, uint32_t flags, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwWriteEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor, filter, flags, activityid, relatedactivityid, userdatacount, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)filter;
    (void)flags;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwWriteString(int64_t reghandle, uint8_t level, uint64_t keyword, void* activityid, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwWriteString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, level, keyword, activityid, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    (void)activityid;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(int64_t reghandle, void* eventdescriptor, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EtwWriteTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(void* fastmutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireFastMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fastmutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)fastmutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(void* fastmutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireFastMutexUnsafe");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fastmutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)fastmutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquirePushLockExclusiveEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pushlock, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquirePushLockSharedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pushlock, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(void* resource, bool wait) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireResourceExclusiveLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource, wait);
    }
    errno = ENOSYS;
    return false;
#else
    (void)resource;
    (void)wait;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(void* resource, bool wait) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireResourceSharedLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource, wait);
    }
    errno = ENOSYS;
    return false;
#else
    (void)resource;
    (void)wait;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(void* runref) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireRundownProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runref);
    }
    errno = ENOSYS;
    return false;
#else
    (void)runref;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(int64_t runrefcacheaware) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireRundownProtectionCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runrefcacheaware);
    }
    errno = ENOSYS;
    return false;
#else
    (void)runrefcacheaware;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(int64_t runrefcacheaware, uint32_t count) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireRundownProtectionCacheAwareEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runrefcacheaware, count);
    }
    errno = ENOSYS;
    return false;
#else
    (void)runrefcacheaware;
    (void)count;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(void* runref, uint32_t count) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireRundownProtectionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runref, count);
    }
    errno = ENOSYS;
    return false;
#else
    (void)runref;
    (void)count;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(void* resource, bool wait) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireSharedStarveExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource, wait);
    }
    errno = ENOSYS;
    return false;
#else
    (void)resource;
    (void)wait;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(void* resource, bool wait) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireSharedWaitForExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource, wait);
    }
    errno = ENOSYS;
    return false;
#else
    (void)resource;
    (void)wait;
    errno = ENOSYS;
    return false;
#endif
}

uint8_t windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(void* spinlock) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireSpinLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireSpinLockExclusiveAtDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    errno = ENOSYS;
#endif
}

uint8_t windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(void* spinlock) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireSpinLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAcquireSpinLockSharedAtDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    errno = ENOSYS;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(int32_t pooltype, uint32_t pooltag) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocateCacheAwareRundownProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, pooltag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pooltype;
    (void)pooltag;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePool(int32_t pooltype, uint64_t numberofbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, numberofbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pooltype;
    (void)numberofbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePool2(uint64_t flags, uint64_t numberofbytes, uint32_t tag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePool2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, numberofbytes, tag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)flags;
    (void)numberofbytes;
    (void)tag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePool3(uint64_t flags, uint64_t numberofbytes, uint32_t tag, void* extendedparameters, uint32_t extendedparameterscount) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePool3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, numberofbytes, tag, extendedparameters, extendedparameterscount);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)flags;
    (void)numberofbytes;
    (void)tag;
    (void)extendedparameters;
    (void)extendedparameterscount;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(int32_t pooltype, uint64_t numberofbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePoolWithQuota");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, numberofbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pooltype;
    (void)numberofbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(int32_t pooltype, uint64_t numberofbytes, uint32_t tag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePoolWithQuotaTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, numberofbytes, tag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(int32_t pooltype, uint64_t numberofbytes, uint32_t tag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePoolWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, numberofbytes, tag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(int32_t pooltype, uint64_t numberofbytes, uint32_t tag, int32_t priority) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocatePoolWithTagPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, numberofbytes, tag, priority);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    (void)priority;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesExAllocateTimer(void* callback, void* callbackcontext, uint32_t attributes) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExAllocateTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, callbackcontext, attributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)callbackcontext;
    (void)attributes;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExCancelTimer(int64_t timer, void* parameters) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExCancelTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer, parameters);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    (void)parameters;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(int64_t runrefcacheaware) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExCleanupRundownProtectionCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExConvertExclusiveToSharedLite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExCreateCallback(void* callbackobject, void* objectattributes, bool create, bool allowmultiplecallbacks) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExCreateCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackobject, objectattributes, create, allowmultiplecallbacks);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackobject;
    (void)objectattributes;
    (void)create;
    (void)allowmultiplecallbacks;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExCreatePool(uint32_t flags, uint64_t tag, void* params, void* poolhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExCreatePool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, tag, params, poolhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)tag;
    (void)params;
    (void)poolhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(void* resource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExDeleteResourceLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resource;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExDeleteTimer(int64_t timer, bool cancel, bool wait, void* parameters) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExDeleteTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer, cancel, wait, parameters);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    (void)cancel;
    (void)wait;
    (void)parameters;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExDestroyPool(void* poolhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExDestroyPool");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(poolhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)poolhandle;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(void* resource) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExEnterCriticalRegionAndAcquireResourceExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resource;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(void* resource) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExEnterCriticalRegionAndAcquireResourceShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resource;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(void* resource) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExEnterCriticalRegionAndAcquireSharedWaitForExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resource;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(uint32_t firmwaretableprovidersignature, void* firmwaretablebuffer, uint32_t bufferlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExEnumerateSystemFirmwareTables");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firmwaretableprovidersignature, firmwaretablebuffer, bufferlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)firmwaretableprovidersignature;
    (void)firmwaretablebuffer;
    (void)bufferlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExExtendZone(void* zone, void* segment, uint32_t segmentsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExExtendZone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(zone, segment, segmentsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)zone;
    (void)segment;
    (void)segmentsize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(int64_t runrefcacheaware) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExFreeCacheAwareRundownProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExFreePool(void* p) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExFreePool");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(p);
        return;
    }
    errno = ENOSYS;
#else
    (void)p;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExFreePool2(void* p, uint32_t tag, void* extendedparameters, uint32_t extendedparameterscount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExFreePool2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(p, tag, extendedparameters, extendedparameterscount);
        return;
    }
    errno = ENOSYS;
#else
    (void)p;
    (void)tag;
    (void)extendedparameters;
    (void)extendedparameterscount;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(void* p, uint32_t tag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExFreePoolWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(p, tag);
        return;
    }
    errno = ENOSYS;
#else
    (void)p;
    (void)tag;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(void* resource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExGetExclusiveWaiterCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)resource;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(void* variablename, void* vendorguid, void* value, void* valuelength, void* attributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExGetFirmwareEnvironmentVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(variablename, vendorguid, value, valuelength, attributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)variablename;
    (void)vendorguid;
    (void)value;
    (void)valuelength;
    (void)attributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExGetFirmwareType(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExGetFirmwareType");
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

int8_t windowssysWindowsWdkSystemSystemservicesExGetPreviousMode(void) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExGetPreviousMode");
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

uint32_t windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(void* resource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExGetSharedWaiterCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)resource;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(uint32_t firmwaretableprovidersignature, uint32_t firmwaretableid, void* firmwaretablebuffer, uint32_t bufferlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExGetSystemFirmwareTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firmwaretableprovidersignature, firmwaretableid, firmwaretablebuffer, bufferlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)firmwaretableprovidersignature;
    (void)firmwaretableid;
    (void)firmwaretablebuffer;
    (void)bufferlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExInitializePushLock(void* pushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInitializePushLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pushlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(void* resource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInitializeResourceLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resource;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(void* runref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInitializeRundownProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(int64_t runrefcacheaware, uint64_t runrefsize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInitializeRundownProtectionCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware, runrefsize);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    (void)runrefsize;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(int64_t runrefcacheaware, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInitializeRundownProtectionCacheAwareEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    (void)flags;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExInitializeZone(void* zone, uint32_t blocksize, void* initialsegment, uint32_t initialsegmentsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInitializeZone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(zone, blocksize, initialsegment, initialsegmentsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)zone;
    (void)blocksize;
    (void)initialsegment;
    (void)initialsegmentsize;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(void* addend, int64_t increment, void* lock) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInterlockedAddLargeInteger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addend, increment, lock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addend;
    (void)increment;
    (void)lock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(void* zone, void* segment, uint32_t segmentsize, void* lock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExInterlockedExtendZone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(zone, segment, segmentsize, lock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)zone;
    (void)segment;
    (void)segmentsize;
    (void)lock;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExIsManufacturingModeEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(uint32_t processorfeature) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExIsProcessorFeaturePresent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processorfeature);
    }
    errno = ENOSYS;
    return false;
#else
    (void)processorfeature;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(void* resource) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExIsResourceAcquiredExclusiveLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return false;
#else
    (void)resource;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(void* resource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExIsResourceAcquiredSharedLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)resource;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExIsSoftBoot(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExIsSoftBoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(void* localtime, void* systemtime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExLocalTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(localtime, systemtime);
        return;
    }
    errno = ENOSYS;
#else
    (void)localtime;
    (void)systemtime;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExNotifyCallback(void* callbackobject, void* argument1, void* argument2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExNotifyCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackobject, argument1, argument2);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackobject;
    (void)argument1;
    (void)argument2;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExQueryTimerResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(maximumtime, minimumtime, currenttime);
        return;
    }
    errno = ENOSYS;
#else
    (void)maximumtime;
    (void)minimumtime;
    (void)currenttime;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExQueueWorkItem(void* workitem, int32_t queuetype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExQueueWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(workitem, queuetype);
        return;
    }
    errno = ENOSYS;
#else
    (void)workitem;
    (void)queuetype;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExRaiseAccessViolation");
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

void windowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExRaiseDatatypeMisalignment");
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

void windowssysWindowsWdkSystemSystemservicesExRaiseStatus(int32_t status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExRaiseStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(void* runref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReInitializeRundownProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(int64_t runrefcacheaware) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReInitializeRundownProtectionCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesExRegisterCallback(int64_t callbackobject, void* callbackfunction, void* callbackcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackobject, callbackfunction, callbackcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackobject;
    (void)callbackfunction;
    (void)callbackcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(void* resource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReinitializeResourceLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resource;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(void* fastmutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseFastMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fastmutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)fastmutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(void* fastmutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseFastMutexUnsafe");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fastmutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)fastmutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleasePushLockExclusiveEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pushlock, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleasePushLockSharedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pushlock, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseResourceAndLeaveCriticalRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(void* resource, uint64_t resourcethreadid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseResourceForThreadLite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource, resourcethreadid);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    (void)resourcethreadid;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseResourceLite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(void* runref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseRundownProtection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(int64_t runrefcacheaware) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseRundownProtectionCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(int64_t runref, uint32_t count) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseRundownProtectionCacheAwareEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref, count);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    (void)count;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(void* runref, uint32_t count) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseRundownProtectionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref, count);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    (void)count;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(void* spinlock, uint8_t oldirql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseSpinLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock, oldirql);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    (void)oldirql;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseSpinLockExclusiveFromDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(void* spinlock, uint8_t oldirql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseSpinLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock, oldirql);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    (void)oldirql;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExReleaseSpinLockSharedFromDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExRundownCompleted(void* runref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExRundownCompleted");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(int64_t runrefcacheaware) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExRundownCompletedCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runrefcacheaware);
        return;
    }
    errno = ENOSYS;
#else
    (void)runrefcacheaware;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(void* securepoolhandle, uint32_t tag, void* allocation, uint64_t cookie, uint64_t offset, uint64_t size, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSecurePoolUpdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securepoolhandle, tag, allocation, cookie, offset, size, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securepoolhandle;
    (void)tag;
    (void)allocation;
    (void)cookie;
    (void)offset;
    (void)size;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(void* securepoolhandle, uint32_t tag, void* allocation, uint64_t cookie) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSecurePoolValidate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securepoolhandle, tag, allocation, cookie);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)securepoolhandle;
    (void)tag;
    (void)allocation;
    (void)cookie;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(void* variablename, void* vendorguid, void* value, uint32_t valuelength, uint32_t attributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSetFirmwareEnvironmentVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(variablename, vendorguid, value, valuelength, attributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)variablename;
    (void)vendorguid;
    (void)value;
    (void)valuelength;
    (void)attributes;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(void* resource, void* ownerpointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSetResourceOwnerPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource, ownerpointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    (void)ownerpointer;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(void* resource, void* ownerpointer, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSetResourceOwnerPointerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource, ownerpointer, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    (void)ownerpointer;
    (void)flags;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExSetTimer(int64_t timer, int64_t duetime, int64_t period, void* parameters) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSetTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer, duetime, period, parameters);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    (void)duetime;
    (void)period;
    (void)parameters;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExSetTimerResolution(uint32_t desiredtime, bool setresolution) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSetTimerResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredtime, setresolution);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)desiredtime;
    (void)setresolution;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSizeOfRundownProtectionCacheAware");
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

void windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(void* systemtime, void* localtime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExSystemTimeToLocalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(systemtime, localtime);
        return;
    }
    errno = ENOSYS;
#else
    (void)systemtime;
    (void)localtime;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExTryAcquireSpinLockExclusiveAtDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExTryAcquireSpinLockSharedAtDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(void* spinlock) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExTryConvertSharedSpinLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(void* fastmutex) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExTryToAcquireFastMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fastmutex);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fastmutex;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExUnregisterCallback(void* callbackregistration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExUnregisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackregistration);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackregistration;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesExUuidCreate(void* uuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExUuidCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesExVerifySuite(int32_t suitetype) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExVerifySuite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(suitetype);
    }
    errno = ENOSYS;
    return false;
#else
    (void)suitetype;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(void* runref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExWaitForRundownProtectionRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(int64_t runref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExWaitForRundownProtectionReleaseCacheAware");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runref);
        return;
    }
    errno = ENOSYS;
#else
    (void)runref;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(int32_t status) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsTotalDeviceFailure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return false;
#else
    (void)status;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(void* resetdisplayparameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalAcquireDisplayOwnership");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resetdisplayparameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)resetdisplayparameters;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(void* adapterobject, uint32_t length, void* logicaladdress, bool cacheenabled) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalAllocateCommonBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterobject, length, logicaladdress, cacheenabled);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)adapterobject;
    (void)length;
    (void)logicaladdress;
    (void)cacheenabled;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(void* adapterobject, void* numberofmapregisters) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalAllocateCrashDumpRegisters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterobject, numberofmapregisters);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)adapterobject;
    (void)numberofmapregisters;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(void* groupaffinty, uint32_t groupcount, void* resourcelist, void* countersethandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalAllocateHardwareCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupaffinty, groupcount, resourcelist, countersethandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupaffinty;
    (void)groupcount;
    (void)resourcelist;
    (void)countersethandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(void* registrypath, void* driverclassname, void* driverobject, void* deviceobject, int32_t bustype, uint32_t busnumber, uint32_t slotnumber, void* allocatedresources) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalAssignSlotResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrypath, driverclassname, driverobject, deviceobject, bustype, busnumber, slotnumber, allocatedresources);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registrypath;
    (void)driverclassname;
    (void)driverobject;
    (void)deviceobject;
    (void)bustype;
    (void)busnumber;
    (void)slotnumber;
    (void)allocatedresources;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(void* errorsource, void* errorrecord) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalBugCheckSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(errorsource, errorrecord);
        return;
    }
    errno = ENOSYS;
#else
    (void)errorsource;
    (void)errorrecord;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(void* adapter, uint32_t numberofmapregisters, int32_t type, void* mapregisterbase, void* mapregistersavailable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalDmaAllocateCrashDumpRegistersEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapter, numberofmapregisters, type, mapregisterbase, mapregistersavailable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)adapter;
    (void)numberofmapregisters;
    (void)type;
    (void)mapregisterbase;
    (void)mapregistersavailable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(void* adapter, int32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalDmaFreeCrashDumpRegistersEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapter, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)adapter;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesHalExamineMBR(void* deviceobject, uint32_t sectorsize, uint32_t mbrtypeidentifier, void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalExamineMBR");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, sectorsize, mbrtypeidentifier, buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)sectorsize;
    (void)mbrtypeidentifier;
    (void)buffer;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(void* adapterobject, uint32_t length, int64_t logicaladdress, void* virtualaddress, bool cacheenabled) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalFreeCommonBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(adapterobject, length, logicaladdress, virtualaddress, cacheenabled);
        return;
    }
    errno = ENOSYS;
#else
    (void)adapterobject;
    (void)length;
    (void)logicaladdress;
    (void)virtualaddress;
    (void)cacheenabled;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(void* countersethandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalFreeHardwareCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(countersethandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)countersethandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesHalGetAdapter(void* devicedescription, void* numberofmapregisters) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalGetAdapter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicedescription, numberofmapregisters);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)devicedescription;
    (void)numberofmapregisters;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesHalGetBusData(int32_t busdatatype, uint32_t busnumber, uint32_t slotnumber, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalGetBusData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(busdatatype, busnumber, slotnumber, buffer, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)busdatatype;
    (void)busnumber;
    (void)slotnumber;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(int32_t busdatatype, uint32_t busnumber, uint32_t slotnumber, void* buffer, uint32_t offset, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalGetBusDataByOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(busdatatype, busnumber, slotnumber, buffer, offset, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)busdatatype;
    (void)busnumber;
    (void)slotnumber;
    (void)buffer;
    (void)offset;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(int32_t interfacetype, uint32_t busnumber, uint32_t businterruptlevel, uint32_t businterruptvector, void* irql, void* affinity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalGetInterruptVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacetype, busnumber, businterruptlevel, businterruptvector, irql, affinity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfacetype;
    (void)busnumber;
    (void)businterruptlevel;
    (void)businterruptvector;
    (void)irql;
    (void)affinity;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesHalMakeBeep(uint32_t frequency) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalMakeBeep");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(frequency);
    }
    errno = ENOSYS;
    return false;
#else
    (void)frequency;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(void* adapterobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalReadDmaCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)adapterobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesHalSetBusData(int32_t busdatatype, uint32_t busnumber, uint32_t slotnumber, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalSetBusData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(busdatatype, busnumber, slotnumber, buffer, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)busdatatype;
    (void)busnumber;
    (void)slotnumber;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(int32_t busdatatype, uint32_t busnumber, uint32_t slotnumber, void* buffer, uint32_t offset, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalSetBusDataByOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(busdatatype, busnumber, slotnumber, buffer, offset, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)busdatatype;
    (void)busnumber;
    (void)slotnumber;
    (void)buffer;
    (void)offset;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(int32_t interfacetype, uint32_t busnumber, int64_t busaddress, void* addressspace, void* translatedaddress) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HalTranslateBusAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacetype, busnumber, busaddress, addressspace, translatedaddress);
    }
    errno = ENOSYS;
    return false;
#else
    (void)interfacetype;
    (void)busnumber;
    (void)busaddress;
    (void)addressspace;
    (void)translatedaddress;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HvlRegisterWheaErrorNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HvlUnregisterWheaErrorNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(void* irql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireCancelSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irql);
        return;
    }
    errno = ENOSYS;
#else
    (void)irql;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(void* driverobject, void* physicaldeviceobject, void* buffer, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireKsrPersistentMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(void* driverobject, void* physicaldeviceobject, void* physicaldeviceid, void* datatag, void* dataversion, void* buffer, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireKsrPersistentMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)physicaldeviceid;
    (void)datatag;
    (void)dataversion;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(void* removelock, void* tag, void* file, uint32_t line, uint32_t remlocksize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireRemoveLockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(removelock, tag, file, line, remlocksize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)removelock;
    (void)tag;
    (void)file;
    (void)line;
    (void)remlocksize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(void* driverobject, void* clientidentificationaddress, uint32_t driverobjectextensionsize, void* driverobjectextension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateDriverObjectExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, clientidentificationaddress, driverobjectextensionsize, driverobjectextension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)clientidentificationaddress;
    (void)driverobjectextensionsize;
    (void)driverobjectextension;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(void* ioobject, uint8_t entrysize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateErrorLogEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioobject, entrysize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ioobject;
    (void)entrysize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoAllocateIrp(int8_t stacksize, bool chargequota) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int8_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stacksize, chargequota);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)stacksize;
    (void)chargequota;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(void* deviceobject, int8_t stacksize, bool chargequota) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateIrpEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, stacksize, chargequota);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceobject;
    (void)stacksize;
    (void)chargequota;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoAllocateMdl(void* virtualaddress, uint32_t length, bool secondarybuffer, bool chargequota, void* irp) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, length, secondarybuffer, chargequota, irp);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)virtualaddress;
    (void)length;
    (void)secondarybuffer;
    (void)chargequota;
    (void)irp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(void* fileobject, uint32_t length, void* signature, void* streamidentifier) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateSfioStreamIdentifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, length, signature, streamidentifier);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)length;
    (void)signature;
    (void)streamidentifier;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(void* deviceobject) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAllocateWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAssignResources(void* registrypath, void* driverclassname, void* driverobject, void* deviceobject, void* requestedresources, void* allocatedresources) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAssignResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrypath, driverclassname, driverobject, deviceobject, requestedresources, allocatedresources);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registrypath;
    (void)driverclassname;
    (void)driverobject;
    (void)deviceobject;
    (void)requestedresources;
    (void)allocatedresources;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAttachDevice(void* sourcedevice, void* targetdevice, void* attacheddevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAttachDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcedevice, targetdevice, attacheddevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcedevice;
    (void)targetdevice;
    (void)attacheddevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(void* sourcedevice, void* targetdevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAttachDeviceByPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcedevice, targetdevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcedevice;
    (void)targetdevice;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(void* sourcedevice, void* targetdevice) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAttachDeviceToDeviceStack");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcedevice, targetdevice);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sourcedevice;
    (void)targetdevice;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(void* sourcedevice, void* targetdevice, void* attachedtodeviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAttachDeviceToDeviceStackSafe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcedevice, targetdevice, attachedtodeviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcedevice;
    (void)targetdevice;
    (void)attachedtodeviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(uint32_t majorfunction, void* deviceobject, void* buffer, uint32_t length, void* startingoffset, void* iostatusblock) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoBuildAsynchronousFsdRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(majorfunction, deviceobject, buffer, length, startingoffset, iostatusblock);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)majorfunction;
    (void)deviceobject;
    (void)buffer;
    (void)length;
    (void)startingoffset;
    (void)iostatusblock;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(uint32_t iocontrolcode, void* deviceobject, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength, bool internaldeviceiocontrol, void* event, void* iostatusblock) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoBuildDeviceIoControlRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iocontrolcode, deviceobject, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, internaldeviceiocontrol, event, iostatusblock);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)iocontrolcode;
    (void)deviceobject;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)internaldeviceiocontrol;
    (void)event;
    (void)iostatusblock;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(void* sourcemdl, void* targetmdl, void* virtualaddress, uint32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoBuildPartialMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sourcemdl, targetmdl, virtualaddress, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)sourcemdl;
    (void)targetmdl;
    (void)virtualaddress;
    (void)length;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(uint32_t majorfunction, void* deviceobject, void* buffer, uint32_t length, void* startingoffset, void* event, void* iostatusblock) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoBuildSynchronousFsdRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(majorfunction, deviceobject, buffer, length, startingoffset, event, iostatusblock);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)majorfunction;
    (void)deviceobject;
    (void)buffer;
    (void)length;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(void* deviceobject, void* fileobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCancelFileOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, fileobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)fileobject;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoCancelIrp(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCancelIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(uint32_t desiredaccess, uint32_t desiredshareaccess, void* fileobject, void* shareaccess, void* linkshareaccess, uint32_t ioshareaccessflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckLinkShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredaccess, desiredshareaccess, fileobject, shareaccess, linkshareaccess, ioshareaccessflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)desiredaccess;
    (void)desiredshareaccess;
    (void)fileobject;
    (void)shareaccess;
    (void)linkshareaccess;
    (void)ioshareaccessflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(uint32_t desiredaccess, uint32_t desiredshareaccess, void* fileobject, void* shareaccess, bool update) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredaccess, desiredshareaccess, fileobject, shareaccess, update);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)desiredaccess;
    (void)desiredshareaccess;
    (void)fileobject;
    (void)shareaccess;
    (void)update;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(uint32_t desiredaccess, uint32_t desiredshareaccess, void* fileobject, void* shareaccess, bool update, void* writepermission) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckShareAccessEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredaccess, desiredshareaccess, fileobject, shareaccess, update, writepermission);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)desiredaccess;
    (void)desiredshareaccess;
    (void)fileobject;
    (void)shareaccess;
    (void)update;
    (void)writepermission;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoCleanupIrp(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCleanupIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(void* originalid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoClearActivityIdThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(originalid);
        return;
    }
    errno = ENOSYS;
#else
    (void)originalid;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoClearIrpExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(void* interruptobject, void* serviceroutine, void* servicecontext, void* spinlock, uint32_t vector, uint8_t irql, uint8_t synchronizeirql, int32_t interruptmode, bool sharevector, uint64_t processorenablemask, bool floatingsave) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint8_t, uint8_t, int32_t, bool, uint64_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoConnectInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interruptobject, serviceroutine, servicecontext, spinlock, vector, irql, synchronizeirql, interruptmode, sharevector, processorenablemask, floatingsave);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interruptobject;
    (void)serviceroutine;
    (void)servicecontext;
    (void)spinlock;
    (void)vector;
    (void)irql;
    (void)synchronizeirql;
    (void)interruptmode;
    (void)sharevector;
    (void)processorenablemask;
    (void)floatingsave;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(void* parameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoConnectInterruptEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parameters;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoCreateController(uint32_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateController");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateDevice(void* driverobject, uint32_t deviceextensionsize, void* devicename, uint32_t devicetype, uint32_t devicecharacteristics, bool exclusive, void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, deviceextensionsize, devicename, devicetype, devicecharacteristics, exclusive, deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)deviceextensionsize;
    (void)devicename;
    (void)devicetype;
    (void)devicecharacteristics;
    (void)exclusive;
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateDisk(void* deviceobject, void* disk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, disk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)disk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateFile(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t disposition, uint32_t createoptions, void* eabuffer, uint32_t ealength, int32_t createfiletype, void* internalparameters, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, disposition, createoptions, eabuffer, ealength, createfiletype, internalparameters, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)disposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)createfiletype;
    (void)internalparameters;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateFileEx(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t disposition, uint32_t createoptions, void* eabuffer, uint32_t ealength, int32_t createfiletype, void* internalparameters, uint32_t options, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, disposition, createoptions, eabuffer, ealength, createfiletype, internalparameters, options, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)disposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)createfiletype;
    (void)internalparameters;
    (void)options;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t disposition, uint32_t createoptions, void* eabuffer, uint32_t ealength, int32_t createfiletype, void* internalparameters, uint32_t options, void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateFileSpecifyDeviceObjectHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, disposition, createoptions, eabuffer, ealength, createfiletype, internalparameters, options, deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)disposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)createfiletype;
    (void)internalparameters;
    (void)options;
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(void* eventname, void* eventhandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateNotificationEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventname, eventhandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)eventname;
    (void)eventhandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(void* symboliclinkname, void* devicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateSymbolicLink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, devicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)devicename;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(void* eventname, void* eventhandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateSynchronizationEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventname, eventhandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)eventname;
    (void)eventhandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(void* ioobject, void* threadhandle, uint32_t desiredaccess, void* objectattributes, void* processhandle, void* clientid, void* startroutine, void* startcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateSystemThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioobject, threadhandle, desiredaccess, objectattributes, processhandle, clientid, startroutine, startcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioobject;
    (void)threadhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)processhandle;
    (void)clientid;
    (void)startroutine;
    (void)startcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(void* symboliclinkname, void* devicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateUnprotectedSymbolicLink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, devicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)devicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCsqInitialize(void* csq, void* csqinsertirp, void* csqremoveirp, void* csqpeeknextirp, void* csqacquirelock, void* csqreleaselock, void* csqcompletecanceledirp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCsqInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csq, csqinsertirp, csqremoveirp, csqpeeknextirp, csqacquirelock, csqreleaselock, csqcompletecanceledirp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csq;
    (void)csqinsertirp;
    (void)csqremoveirp;
    (void)csqpeeknextirp;
    (void)csqacquirelock;
    (void)csqreleaselock;
    (void)csqcompletecanceledirp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(void* csq, void* csqinsertirp, void* csqremoveirp, void* csqpeeknextirp, void* csqacquirelock, void* csqreleaselock, void* csqcompletecanceledirp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCsqInitializeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csq, csqinsertirp, csqremoveirp, csqpeeknextirp, csqacquirelock, csqreleaselock, csqcompletecanceledirp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csq;
    (void)csqinsertirp;
    (void)csqremoveirp;
    (void)csqpeeknextirp;
    (void)csqacquirelock;
    (void)csqreleaselock;
    (void)csqcompletecanceledirp;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(void* csq, void* irp, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCsqInsertIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(csq, irp, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)csq;
    (void)irp;
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(void* csq, void* irp, void* context, void* insertcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCsqInsertIrpEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csq, irp, context, insertcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csq;
    (void)irp;
    (void)context;
    (void)insertcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(void* csq, void* context) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCsqRemoveIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csq, context);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)csq;
    (void)context;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(void* csq, void* peekcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCsqRemoveNextIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csq, peekcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)csq;
    (void)peekcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(void* fileobject, int64_t process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDecrementKeepAliveCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoDeleteController(void* controllerobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDeleteController");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(controllerobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)controllerobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoDeleteDevice(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDeleteDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(void* symboliclinkname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDeleteSymbolicLink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoDetachDevice(void* targetdevice) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDetachDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(targetdevice);
        return;
    }
    errno = ENOSYS;
#else
    (void)targetdevice;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(int64_t interruptobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDisconnectInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(interruptobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)interruptobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(void* parameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoDisconnectInterruptEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(parameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)parameters;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(void* driverobject, void* physicaldeviceobject, void* physicaldeviceid, void* callback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateKsrPersistentMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, physicaldeviceid, callback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)physicaldeviceid;
    (void)callback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(void* adapterobject, void* mdl, void* mapregisterbase, void* currentva, uint32_t length, bool writetodevice) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFlushAdapterBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterobject, mdl, mapregisterbase, currentva, length, writetodevice);
    }
    errno = ENOSYS;
    return false;
#else
    (void)adapterobject;
    (void)mdl;
    (void)mapregisterbase;
    (void)currentva;
    (void)length;
    (void)writetodevice;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(void* deviceobject, void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoForwardIrpSynchronously");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)deviceobject;
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(void* adapterobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeAdapterChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(adapterobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)adapterobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeController(void* controllerobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeController");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(controllerobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)controllerobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(void* elentry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeErrorLogEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elentry);
        return;
    }
    errno = ENOSYS;
#else
    (void)elentry;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeIrp(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(void* datahandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeKsrPersistentMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datahandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datahandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(void* adapterobject, void* mapregisterbase, uint32_t numberofmapregisters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeMapRegisters");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(adapterobject, mapregisterbase, numberofmapregisters);
        return;
    }
    errno = ENOSYS;
#else
    (void)adapterobject;
    (void)mapregisterbase;
    (void)numberofmapregisters;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeMdl(void* mdl) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mdl);
        return;
    }
    errno = ENOSYS;
#else
    (void)mdl;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(void* fileobject, void* signature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeSfioStreamIdentifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, signature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)signature;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(int64_t ioworkitem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFreeWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ioworkitem);
        return;
    }
    errno = ENOSYS;
#else
    (void)ioworkitem;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(void* irp, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetActivityIdIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetActivityIdThread");
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

int32_t windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(int64_t interruptobject, void* groupaffinity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetAffinityInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interruptobject, groupaffinity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interruptobject;
    (void)groupaffinity;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetAttachedDeviceReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(void* bootdiskinformation, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetBootDiskInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bootdiskinformation, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bootdiskinformation;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(void* bootdiskinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetBootDiskInformationLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bootdiskinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bootdiskinformation;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetConfigurationInformation");
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

int32_t windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(int32_t informationclass, void* containerobject, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetContainerInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationclass, containerobject, buffer, bufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationclass;
    (void)containerobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetCurrentProcess");
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

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(void* physicaldeviceobject, int32_t directorytype, uint32_t flags, void* reserved, void* devicedirectoryhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, directorytype, flags, reserved, devicedirectoryhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)directorytype;
    (void)flags;
    (void)reserved;
    (void)devicedirectoryhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(void* symboliclinkname, void* aliasinterfaceclassguid, void* aliassymboliclinkname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceInterfaceAlias");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, aliasinterfaceclassguid, aliassymboliclinkname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)aliasinterfaceclassguid;
    (void)aliassymboliclinkname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(void* symboliclinkname, void* propertykey, uint32_t lcid, uint32_t flags, uint32_t size, void* data, void* requiredsize, void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceInterfacePropertyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, propertykey, lcid, flags, size, data, requiredsize, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)propertykey;
    (void)lcid;
    (void)flags;
    (void)size;
    (void)data;
    (void)requiredsize;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(void* interfaceclassguid, void* physicaldeviceobject, uint32_t flags, void* symboliclinklist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceInterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceclassguid, physicaldeviceobject, flags, symboliclinklist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaceclassguid;
    (void)physicaldeviceobject;
    (void)flags;
    (void)symboliclinklist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(void* pdo, void* nodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceNumaNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, nodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdo;
    (void)nodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(void* objectname, uint32_t desiredaccess, void* fileobject, void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceObjectPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectname, desiredaccess, fileobject, deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectname;
    (void)desiredaccess;
    (void)fileobject;
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(void* deviceobject, int32_t deviceproperty, uint32_t bufferlength, void* propertybuffer, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, deviceproperty, bufferlength, propertybuffer, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)deviceproperty;
    (void)bufferlength;
    (void)propertybuffer;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(void* pdo, void* propertykey, uint32_t lcid, uint32_t flags, uint32_t size, void* data, void* requiredsize, void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDevicePropertyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, propertykey, lcid, flags, size, data, requiredsize, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdo;
    (void)propertykey;
    (void)lcid;
    (void)flags;
    (void)size;
    (void)data;
    (void)requiredsize;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(void* physicaldeviceobject, void* devicedescription, void* numberofmapregisters) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDmaAdapter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, devicedescription, numberofmapregisters);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)physicaldeviceobject;
    (void)devicedescription;
    (void)numberofmapregisters;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(void* driverobject, int32_t directorytype, uint32_t flags, void* driverdirectoryhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDriverDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, directorytype, flags, driverdirectoryhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)directorytype;
    (void)flags;
    (void)driverdirectoryhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(void* driverobject, void* clientidentificationaddress) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDriverObjectExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, clientidentificationaddress);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)driverobject;
    (void)clientidentificationaddress;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetFileObjectGenericMapping");
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

int32_t windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(void* irp, void* zeroingoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetFsZeroingOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, zeroingoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)zeroingoffset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetInitialStack(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetInitialStack");
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

int64_t windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(void* fileobject) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetInitiatorProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(void* irp, void* ioattributionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetIoAttributionHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, ioattributionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)ioattributionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetIoPriorityHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(uint32_t version, void* interfaceout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetIommuInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version, interfaceout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)version;
    (void)interfaceout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(uint32_t version, uint64_t flags, void* interfaceout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetIommuInterfaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version, flags, interfaceout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)version;
    (void)flags;
    (void)interfaceout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(void* irp, void* extracreateparameter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetIrpExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, extracreateparameter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)extracreateparameter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetPagingIoPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(void* fileobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRelatedDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(void* fileobject, void* signature) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetSfioStreamIdentifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, signature);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    (void)signature;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesIoGetSilo(void* fileobject) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(void* fileobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetSiloParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoGetStackLimits(void* lowlimit, void* highlimit) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetStackLimits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lowlimit, highlimit);
        return;
    }
    errno = ENOSYS;
#else
    (void)lowlimit;
    (void)highlimit;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetTopLevelIrp");
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

void* windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(void* fileobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetTransactionParameterBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(void* fileobject, int64_t process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIncrementKeepAliveCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoInitializeIrp(void* irp, uint16_t packetsize, int8_t stacksize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint16_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInitializeIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp, packetsize, stacksize);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    (void)packetsize;
    (void)stacksize;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(void* irp, void* deviceobject, uint16_t packetsize, int8_t stacksize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint16_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInitializeIrpEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp, deviceobject, packetsize, stacksize);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    (void)deviceobject;
    (void)packetsize;
    (void)stacksize;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(void* lock, uint32_t allocatetag, uint32_t maxlockedminutes, uint32_t highwatermark, uint32_t remlocksize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInitializeRemoveLockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lock, allocatetag, maxlockedminutes, highwatermark, remlocksize);
        return;
    }
    errno = ENOSYS;
#else
    (void)lock;
    (void)allocatetag;
    (void)maxlockedminutes;
    (void)highwatermark;
    (void)remlocksize;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoInitializeTimer(void* deviceobject, void* timerroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInitializeTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, timerroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)timerroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(void* ioobject, int64_t ioworkitem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInitializeWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ioobject, ioworkitem);
        return;
    }
    errno = ENOSYS;
#else
    (void)ioobject;
    (void)ioworkitem;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(void* deviceobject, int32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInvalidateDeviceRelations");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)type;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(void* physicaldeviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoInvalidateDeviceState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(physicaldeviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)physicaldeviceobject;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIs32bitProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(void* fileobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsFileObjectIgnoringSharing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(void* fileobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsFileOriginRemote");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsInitiator32bitProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(int32_t status) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsValidIrpStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(uint8_t majorversion, uint8_t minorversion) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsWdmVersionAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(majorversion, minorversion);
    }
    errno = ENOSYS;
    return false;
#else
    (void)majorversion;
    (void)minorversion;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(void* irp, int8_t stacksize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoMakeAssociatedIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, stacksize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)irp;
    (void)stacksize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(void* irp, void* deviceobject, int8_t stacksize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoMakeAssociatedIrpEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, deviceobject, stacksize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)irp;
    (void)deviceobject;
    (void)stacksize;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesIoMapTransfer(void* adapterobject, void* mdl, void* mapregisterbase, void* currentva, void* length, bool writetodevice) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoMapTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(adapterobject, mdl, mapregisterbase, currentva, length, writetodevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)adapterobject;
    (void)mdl;
    (void)mapregisterbase;
    (void)currentva;
    (void)length;
    (void)writetodevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(void* symboliclinkname, uint32_t desiredaccess, void* deviceinterfaceregkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoOpenDeviceInterfaceRegistryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, desiredaccess, deviceinterfaceregkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)desiredaccess;
    (void)deviceinterfaceregkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(void* deviceobject, uint32_t devinstkeytype, uint32_t desiredaccess, void* deviceregkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoOpenDeviceRegistryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, devinstkeytype, desiredaccess, deviceregkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)devinstkeytype;
    (void)desiredaccess;
    (void)deviceregkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(void* driverobject, int32_t regkeytype, uint32_t desiredaccess, uint32_t flags, void* driverregkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoOpenDriverRegistryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, regkeytype, desiredaccess, flags, driverregkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)regkeytype;
    (void)desiredaccess;
    (void)flags;
    (void)driverregkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(void* irp, void* propagatedid, void* originalid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoPropagateActivityIdToThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, propagatedid, originalid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)propagatedid;
    (void)originalid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(void* bustype, void* busnumber, void* controllertype, void* controllernumber, void* peripheraltype, void* peripheralnumber, void* calloutroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryDeviceDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bustype, busnumber, controllertype, controllernumber, peripheraltype, peripheralnumber, calloutroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bustype;
    (void)busnumber;
    (void)controllertype;
    (void)controllernumber;
    (void)peripheraltype;
    (void)peripheralnumber;
    (void)calloutroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(void* driverobject, void* fullpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFullDriverPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, fullpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)fullpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(void* objectattributes, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass, uint32_t options, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryInformationByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes, iostatusblock, fileinformation, length, fileinformationclass, options, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)options;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(void* driverobject, void* physicaldeviceobject, void* buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryKsrPersistentMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(void* driverobject, void* physicaldeviceobject, void* physicaldeviceid, void* datatag, void* dataversion, void* buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryKsrPersistentMemorySizeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)physicaldeviceid;
    (void)datatag;
    (void)dataversion;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(int64_t ioworkitem, void* workerroutine, int32_t queuetype, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueueWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ioworkitem, workerroutine, queuetype, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)ioworkitem;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(int64_t ioworkitem, void* workerroutine, int32_t queuetype, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueueWorkItemEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ioworkitem, workerroutine, queuetype, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)ioworkitem;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoRaiseHardError(void* irp, void* vpb, void* realdeviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRaiseHardError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp, vpb, realdeviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    (void)vpb;
    (void)realdeviceobject;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(int32_t errorstatus, void* string, int64_t thread) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRaiseInformationalHardError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorstatus, string, thread);
    }
    errno = ENOSYS;
    return false;
#else
    (void)errorstatus;
    (void)string;
    (void)thread;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(void* deviceobject, uint32_t bytespersector, void* signature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReadDiskSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, bytespersector, signature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)bytespersector;
    (void)signature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(void* deviceobject, uint32_t sectorsize, bool returnrecognizedpartitions, void* partitionbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReadPartitionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, sectorsize, returnrecognizedpartitions, partitionbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)sectorsize;
    (void)returnrecognizedpartitions;
    (void)partitionbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(void* deviceobject, void* drivelayout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReadPartitionTableEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, drivelayout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)drivelayout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(void* opaquehandle, void* attributioninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRecordIoAttribution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opaquehandle, attributioninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)opaquehandle;
    (void)attributioninformation;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(void* callbackfunction, void* callbackcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterBootDriverCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackfunction, callbackcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackfunction;
    (void)callbackcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(int32_t notificationclass, void* callbackfunction, void* notificationinformation, uint32_t notificationinformationlength, void* callbackregistration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterContainerNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notificationclass, callbackfunction, notificationinformation, notificationinformationlength, callbackregistration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notificationclass;
    (void)callbackfunction;
    (void)notificationinformation;
    (void)notificationinformationlength;
    (void)callbackregistration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(void* physicaldeviceobject, void* interfaceclassguid, void* referencestring, void* symboliclinkname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterDeviceInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, interfaceclassguid, referencestring, symboliclinkname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)symboliclinkname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterLastChanceShutdownNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(int32_t eventcategory, uint32_t eventcategoryflags, void* eventcategorydata, void* driverobject, void* callbackroutine, void* context, void* notificationentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterPlugPlayNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventcategory, eventcategoryflags, eventcategorydata, driverobject, callbackroutine, context, notificationentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventcategory;
    (void)eventcategoryflags;
    (void)eventcategorydata;
    (void)driverobject;
    (void)callbackroutine;
    (void)context;
    (void)notificationentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterShutdownNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(uint8_t irql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReleaseCancelSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irql);
        return;
    }
    errno = ENOSYS;
#else
    (void)irql;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(void* removelock, void* tag, uint32_t remlocksize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReleaseRemoveLockAndWaitEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(removelock, tag, remlocksize);
        return;
    }
    errno = ENOSYS;
#else
    (void)removelock;
    (void)tag;
    (void)remlocksize;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(void* removelock, void* tag, uint32_t remlocksize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReleaseRemoveLockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(removelock, tag, remlocksize);
        return;
    }
    errno = ENOSYS;
#else
    (void)removelock;
    (void)tag;
    (void)remlocksize;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(void* fileobject, void* shareaccess, void* linkshareaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRemoveLinkShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, shareaccess, linkshareaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)shareaccess;
    (void)linkshareaccess;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(void* fileobject, void* shareaccess, void* linkshareaccess, uint32_t ioshareaccessflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRemoveLinkShareAccessEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, shareaccess, linkshareaccess, ioshareaccessflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)shareaccess;
    (void)linkshareaccess;
    (void)ioshareaccessflags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(void* fileobject, void* shareaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRemoveShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, shareaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)shareaccess;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(void* targetpdo, void* sparepdo, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReplacePartitionUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetpdo, sparepdo, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetpdo;
    (void)sparepdo;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(void* driverobject, int32_t legacybustype, uint32_t busnumber, uint32_t slotnumber, void* resourcelist, void* resourcerequirements, bool resourceassigned, void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportDetectedDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, legacybustype, busnumber, slotnumber, resourcelist, resourcerequirements, resourceassigned, deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)legacybustype;
    (void)busnumber;
    (void)slotnumber;
    (void)resourcelist;
    (void)resourcerequirements;
    (void)resourceassigned;
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(void* parameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportInterruptActive");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(parameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)parameters;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(void* parameters) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportInterruptInactive");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(parameters);
        return;
    }
    errno = ENOSYS;
#else
    (void)parameters;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(void* driverobject, void* driverlist, uint32_t driverlistsize, void* deviceobject, void* devicelist, uint32_t devicelistsize, void* conflictdetected) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportResourceForDetection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, driverlist, driverlistsize, deviceobject, devicelist, devicelistsize, conflictdetected);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)driverlist;
    (void)driverlistsize;
    (void)deviceobject;
    (void)devicelist;
    (void)devicelistsize;
    (void)conflictdetected;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(void* driverclassname, void* driverobject, void* driverlist, uint32_t driverlistsize, void* deviceobject, void* devicelist, uint32_t devicelistsize, bool overrideconflict, void* conflictdetected) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportResourceUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverclassname, driverobject, driverlist, driverlistsize, deviceobject, devicelist, devicelistsize, overrideconflict, conflictdetected);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverclassname;
    (void)driverobject;
    (void)driverlist;
    (void)driverlistsize;
    (void)deviceobject;
    (void)devicelist;
    (void)devicelistsize;
    (void)overrideconflict;
    (void)conflictdetected;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReportRootDevice(void* driverobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportRootDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(void* physicaldeviceobject, void* notificationstructure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportTargetDeviceChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, notificationstructure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)notificationstructure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(void* physicaldeviceobject, void* notificationstructure, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReportTargetDeviceChangeAsynchronous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, notificationstructure, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)notificationstructure;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(void* physicaldeviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRequestDeviceEject");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(physicaldeviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)physicaldeviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(void* physicaldeviceobject, void* callback, void* context, void* driverobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRequestDeviceEjectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, callback, context, driverobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)callback;
    (void)context;
    (void)driverobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(void* driverobject, void* physicaldeviceobject, uint64_t size, uint32_t flags, void* datahandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReserveKsrPersistentMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, size, flags, datahandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)size;
    (void)flags;
    (void)datahandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(void* driverobject, void* physicaldeviceobject, void* physicaldeviceid, void* datatag, uint32_t dataversion, uint64_t size, uint32_t flags, void* datahandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReserveKsrPersistentMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, size, flags, datahandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)physicaldeviceobject;
    (void)physicaldeviceid;
    (void)datatag;
    (void)dataversion;
    (void)size;
    (void)flags;
    (void)datahandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoReuseIrp(void* irp, int32_t iostatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReuseIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp, iostatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(void* irp, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetActivityIdIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(void* activityid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetActivityIdThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(activityid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)activityid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(void* deviceobject, void* irp, void* completionroutine, void* context, bool invokeonsuccess, bool invokeonerror, bool invokeoncancel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetCompletionRoutineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, irp, completionroutine, context, invokeonsuccess, invokeonerror, invokeoncancel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)irp;
    (void)completionroutine;
    (void)context;
    (void)invokeonsuccess;
    (void)invokeonerror;
    (void)invokeoncancel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(void* symboliclinkname, void* propertykey, uint32_t lcid, uint32_t flags, uint32_t type, uint32_t size, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetDeviceInterfacePropertyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, propertykey, lcid, flags, type, size, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)propertykey;
    (void)lcid;
    (void)flags;
    (void)type;
    (void)size;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(void* symboliclinkname, bool enable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetDeviceInterfaceState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symboliclinkname, enable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)symboliclinkname;
    (void)enable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(void* pdo, void* propertykey, uint32_t lcid, uint32_t flags, uint32_t type, uint32_t size, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetDevicePropertyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, propertykey, lcid, flags, type, size, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdo;
    (void)propertykey;
    (void)lcid;
    (void)flags;
    (void)type;
    (void)size;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(void* fileobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFileObjectIgnoreSharing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(void* fileobject, bool remote) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFileOrigin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, remote);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)remote;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(void* irp, uint32_t zeroingoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFsZeroingOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, zeroingoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)zeroingoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFsZeroingOffsetRequired");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(void* irp, void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetHardErrorOrVerifyDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp, deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(void* irp, void* attributionsource, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetIoAttributionIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, attributionsource, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)attributionsource;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(void* irp, int32_t priorityhint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetIoPriorityHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, priorityhint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)priorityhint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(void* irp, void* extracreateparameter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetIrpExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, extracreateparameter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)extracreateparameter;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(uint32_t desiredaccess, uint32_t desiredshareaccess, void* fileobject, void* shareaccess, void* linkshareaccess, uint32_t ioshareaccessflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetLinkShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(desiredaccess, desiredshareaccess, fileobject, shareaccess, linkshareaccess, ioshareaccessflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)desiredaccess;
    (void)desiredshareaccess;
    (void)fileobject;
    (void)shareaccess;
    (void)linkshareaccess;
    (void)ioshareaccessflags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(void* masterirp, int32_t status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetMasterIrpStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(masterirp, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)masterirp;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(void* deviceobject, uint32_t sectorsize, uint32_t partitionnumber, uint32_t partitiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetPartitionInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, sectorsize, partitionnumber, partitiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)sectorsize;
    (void)partitionnumber;
    (void)partitiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(void* deviceobject, uint32_t partitionnumber, void* partitioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetPartitionInformationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, partitionnumber, partitioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)partitionnumber;
    (void)partitioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetShareAccess(uint32_t desiredaccess, uint32_t desiredshareaccess, void* fileobject, void* shareaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(desiredaccess, desiredshareaccess, fileobject, shareaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)desiredaccess;
    (void)desiredshareaccess;
    (void)fileobject;
    (void)shareaccess;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(uint32_t desiredaccess, uint32_t desiredshareaccess, void* fileobject, void* shareaccess, void* writepermission) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetShareAccessEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(desiredaccess, desiredshareaccess, fileobject, shareaccess, writepermission);
        return;
    }
    errno = ENOSYS;
#else
    (void)desiredaccess;
    (void)desiredshareaccess;
    (void)fileobject;
    (void)shareaccess;
    (void)writepermission;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(void* deviceobject, bool deferredstartio, bool noncancelable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetStartIoAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, deferredstartio, noncancelable);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)deferredstartio;
    (void)noncancelable;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(void* volumenamestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetSystemPartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumenamestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumenamestring;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(bool enableharderrors) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetThreadHardErrorMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enableharderrors);
    }
    errno = ENOSYS;
    return false;
#else
    (void)enableharderrors;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetTopLevelIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(void* deviceobject, int8_t stacksize) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSizeOfIrpEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, stacksize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)deviceobject;
    (void)stacksize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSizeofWorkItem");
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

void windowssysWindowsWdkSystemSystemservicesIoStartNextPacket(void* deviceobject, bool cancelable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoStartNextPacket");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, cancelable);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)cancelable;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(void* deviceobject, bool cancelable, uint32_t key) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoStartNextPacketByKey");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, cancelable, key);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)cancelable;
    (void)key;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoStartTimer(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoStartTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoStopTimer(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoStopTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(void* deviceobject, void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSynchronousCallDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoTransferActivityId(void* activityid, void* relatedactivityid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoTransferActivityId");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(activityid, relatedactivityid);
        return;
    }
    errno = ENOSYS;
#else
    (void)activityid;
    (void)relatedactivityid;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(int32_t interfacetype, uint32_t busnumber, int64_t busaddress, void* addressspace, void* translatedaddress) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoTranslateBusAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacetype, busnumber, busaddress, addressspace, translatedaddress);
    }
    errno = ENOSYS;
    return false;
#else
    (void)interfacetype;
    (void)busnumber;
    (void)busaddress;
    (void)addressspace;
    (void)translatedaddress;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(int64_t ioworkitem, void* workerroutine, int32_t queuetype, void* context) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoTryQueueWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioworkitem, workerroutine, queuetype, context);
    }
    errno = ENOSYS;
    return false;
#else
    (void)ioworkitem;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(int64_t ioworkitem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUninitializeWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ioworkitem);
        return;
    }
    errno = ENOSYS;
#else
    (void)ioworkitem;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(void* callbackhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterBootDriverCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(void* callbackregistration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterContainerNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackregistration);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackregistration;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(void* notificationentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterPlugPlayNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notificationentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notificationentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(void* notificationentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterPlugPlayNotificationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notificationentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notificationentry;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterShutdownNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(void* fileobject, void* shareaccess, void* linkshareaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUpdateLinkShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, shareaccess, linkshareaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)shareaccess;
    (void)linkshareaccess;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(void* fileobject, void* shareaccess, void* linkshareaccess, uint32_t ioshareaccessflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUpdateLinkShareAccessEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, shareaccess, linkshareaccess, ioshareaccessflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)shareaccess;
    (void)linkshareaccess;
    (void)ioshareaccessflags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(void* fileobject, void* shareaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUpdateShareAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, shareaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)shareaccess;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(void* irp, uint32_t requiredaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoValidateDeviceIoControlAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, requiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)requiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(void* deviceobject, bool fixerrors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVerifyPartitionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, fixerrors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)fixerrors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(void* volumedevicename, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVolumeDeviceNameToGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedevicename, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedevicename;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(void* volumedevicename, void* guidpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVolumeDeviceNameToGuidPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedevicename, guidpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedevicename;
    (void)guidpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(void* volumedeviceobject, void* dosname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVolumeDeviceToDosName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedeviceobject, dosname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedeviceobject;
    (void)dosname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(void* volumedeviceobject, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVolumeDeviceToGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedeviceobject, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedeviceobject;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(void* volumedeviceobject, void* guidpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVolumeDeviceToGuidPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedeviceobject, guidpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedeviceobject;
    (void)guidpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(void* guid, uint32_t instancecount, void* firstinstanceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIAllocateInstanceIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, instancecount, firstinstanceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guid;
    (void)instancecount;
    (void)firstinstanceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(void* datablockobject, void* deviceobject, void* instancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIDeviceObjectToInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, deviceobject, instancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)deviceobject;
    (void)instancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(void* datablockobject, void* instancename, uint32_t methodid, uint32_t inbuffersize, void* outbuffersize, void* inoutbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIExecuteMethod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, instancename, methodid, inbuffersize, outbuffersize, inoutbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)instancename;
    (void)methodid;
    (void)inbuffersize;
    (void)outbuffersize;
    (void)inoutbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(void* datablockobject, void* filehandle, void* instancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIHandleToInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, filehandle, instancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)filehandle;
    (void)instancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(void* guid, uint32_t desiredaccess, void* datablockobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIOpenBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, desiredaccess, datablockobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guid;
    (void)desiredaccess;
    (void)datablockobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(void* datablockobject, void* inoutbuffersize, void* outbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIQueryAllData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, inoutbuffersize, outbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)inoutbuffersize;
    (void)outbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(void* datablockobjectlist, uint32_t objectcount, void* inoutbuffersize, void* outbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIQueryAllDataMultiple");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobjectlist, objectcount, inoutbuffersize, outbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobjectlist;
    (void)objectcount;
    (void)inoutbuffersize;
    (void)outbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(void* datablockobject, void* instancename, void* inoutbuffersize, void* outbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIQuerySingleInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, instancename, inoutbuffersize, outbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)instancename;
    (void)inoutbuffersize;
    (void)outbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(void* datablockobjectlist, void* instancenames, uint32_t objectcount, void* inoutbuffersize, void* outbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIQuerySingleInstanceMultiple");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobjectlist, instancenames, objectcount, inoutbuffersize, outbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobjectlist;
    (void)instancenames;
    (void)objectcount;
    (void)inoutbuffersize;
    (void)outbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(void* deviceobject, uint32_t action) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIRegistrationControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, action);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)action;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(void* object, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMISetNotificationCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(void* datablockobject, void* instancename, uint32_t version, uint32_t valuebuffersize, void* valuebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMISetSingleInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, instancename, version, valuebuffersize, valuebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)instancename;
    (void)version;
    (void)valuebuffersize;
    (void)valuebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(void* datablockobject, void* instancename, uint32_t dataitemid, uint32_t version, uint32_t valuebuffersize, void* valuebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMISetSingleItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datablockobject, instancename, dataitemid, version, valuebuffersize, valuebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datablockobject;
    (void)instancename;
    (void)dataitemid;
    (void)version;
    (void)valuebuffersize;
    (void)valuebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(void* physicaldeviceobject, void* symboliclinkname, bool combinenames, void* suggestedinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMISuggestInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, symboliclinkname, combinenames, suggestedinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)symboliclinkname;
    (void)combinenames;
    (void)suggestedinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(void* wnodeeventitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWMIWriteEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wnodeeventitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wnodeeventitem;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(uint64_t regionstart, uint64_t regionsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWithinStackLimits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regionstart, regionsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)regionstart;
    (void)regionsize;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(void* elentry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWriteErrorLogEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elentry);
        return;
    }
    errno = ENOSYS;
#else
    (void)elentry;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(void* datahandle, void* buffer, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWriteKsrPersistentMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datahandle, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datahandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(void* deviceobject, uint32_t sectorsize, uint32_t sectorspertrack, uint32_t numberofheads, void* partitionbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWritePartitionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, sectorsize, sectorspertrack, numberofheads, partitionbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)sectorsize;
    (void)sectorspertrack;
    (void)numberofheads;
    (void)partitionbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(void* deviceobject, void* drivelayout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoWritePartitionTableEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, drivelayout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)drivelayout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesIofCallDriver(void* deviceobject, void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IofCallDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesIofCompleteRequest(void* irp, int8_t priorityboost) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IofCompleteRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp, priorityboost);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    (void)priorityboost;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKdChangeOption(int32_t option, uint32_t inbufferbytes, void* inbuffer, uint32_t outbufferbytes, void* outbuffer, void* outbufferneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KdChangeOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(option, inbufferbytes, inbuffer, outbufferbytes, outbuffer, outbufferneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)option;
    (void)inbufferbytes;
    (void)inbuffer;
    (void)outbufferbytes;
    (void)outbuffer;
    (void)outbufferneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKdDisableDebugger(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KdDisableDebugger");
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

int32_t windowssysWindowsWdkSystemSystemservicesKdEnableDebugger(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KdEnableDebugger");
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

bool windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KdRefreshDebuggerNotPresent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(void* mutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireGuardedMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(void* fastmutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireGuardedMutexUnsafe");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fastmutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)fastmutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(void* spinlock, void* lockhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireInStackQueuedSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock, lockhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    (void)lockhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(void* spinlock, void* lockhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireInStackQueuedSpinLockAtDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock, lockhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    (void)lockhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(void* spinlock, void* lockhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireInStackQueuedSpinLockForDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock, lockhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    (void)lockhandle;
    errno = ENOSYS;
#endif
}

uint8_t windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(int64_t interrupt) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireInterruptSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interrupt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interrupt;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(void* spinlock) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireSpinLockForDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(void* ktriagedumpdataarray, void* address, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAddTriageDumpDataBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ktriagedumpdataarray, address, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ktriagedumpdataarray;
    (void)address;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAreAllApcsDisabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAreApcsDisabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeBugCheck(uint32_t bugcheckcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeBugCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bugcheckcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)bugcheckcode;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeBugCheckEx(uint32_t bugcheckcode, uint64_t bugcheckparameter1, uint64_t bugcheckparameter2, uint64_t bugcheckparameter3, uint64_t bugcheckparameter4) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeBugCheckEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bugcheckcode, bugcheckparameter1, bugcheckparameter2, bugcheckparameter3, bugcheckparameter4);
        return;
    }
    errno = ENOSYS;
#else
    (void)bugcheckcode;
    (void)bugcheckparameter1;
    (void)bugcheckparameter2;
    (void)bugcheckparameter3;
    (void)bugcheckparameter4;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeCancelTimer(void* param0) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeCancelTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return false;
#else
    (void)param0;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeClearEvent(void* event) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeClearEvent");
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

int32_t windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(uint64_t auxiliarycountervalue, void* performancecountervalue, void* conversionerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeConvertAuxiliaryCounterToPerformanceCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(auxiliarycountervalue, performancecountervalue, conversionerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)auxiliarycountervalue;
    (void)performancecountervalue;
    (void)conversionerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(uint64_t performancecountervalue, void* auxiliarycountervalue, void* conversionerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeConvertPerformanceCounterToAuxiliaryCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(performancecountervalue, auxiliarycountervalue, conversionerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)performancecountervalue;
    (void)auxiliarycountervalue;
    (void)conversionerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(int8_t waitmode, bool alertable, void* interval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDelayExecutionThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(waitmode, alertable, interval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)waitmode;
    (void)alertable;
    (void)interval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDeregisterBoundCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(void* callbackrecord) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDeregisterBugCheckCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackrecord);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackrecord;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(void* callbackrecord) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDeregisterBugCheckReasonCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackrecord);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackrecord;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDeregisterNmiCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(void* callbackhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDeregisterProcessorChangeCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeEnterCriticalRegion");
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

void windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeEnterGuardedRegion");
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

int32_t windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(void* callout, void* parameter, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeExpandKernelStackAndCallout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callout, parameter, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callout;
    (void)parameter;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(void* callout, void* parameter, uint64_t size, bool wait, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeExpandKernelStackAndCalloutEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callout, parameter, size, wait, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callout;
    (void)parameter;
    (void)size;
    (void)wait;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(void* mdl, bool readoperation, bool dmaoperation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeFlushIoBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mdl, readoperation, dmaoperation);
        return;
    }
    errno = ENOSYS;
#else
    (void)mdl;
    (void)readoperation;
    (void)dmaoperation;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeFlushQueuedDpcs");
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

void windowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeFlushWriteBuffer");
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

uint8_t windowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql(void) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeGetCurrentIrql");
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

uint16_t windowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeGetCurrentNodeNumber");
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

uint32_t windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(void* procnumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeGetCurrentProcessorNumberEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(procnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)procnumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(void* procnumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeGetProcessorIndexFromNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(procnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)procnumber;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(uint32_t procindex, void* procnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeGetProcessorNumberFromIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(procindex, procnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)procindex;
    (void)procnumber;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeGetRecommendedSharedDataAlignment");
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

int32_t windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(uint32_t dumptype, uint32_t flags, void* buffer, uint32_t buffersize, void* bufferneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeCrashDumpHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dumptype, flags, buffer, buffersize, bufferneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dumptype;
    (void)flags;
    (void)buffer;
    (void)buffersize;
    (void)bufferneeded;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(void* devicequeue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeDeviceQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(devicequeue);
        return;
    }
    errno = ENOSYS;
#else
    (void)devicequeue;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeDpc(void* dpc, void* deferredroutine, void* deferredcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dpc, deferredroutine, deferredcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)dpc;
    (void)deferredroutine;
    (void)deferredcontext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeEvent(void* event, int32_t type, bool state) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(event, type, state);
        return;
    }
    errno = ENOSYS;
#else
    (void)event;
    (void)type;
    (void)state;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(void* mutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeGuardedMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeMutex(void* mutex, uint32_t level) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex, level);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    (void)level;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(void* semaphore, int32_t count, int32_t limit) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(semaphore, count, limit);
        return;
    }
    errno = ENOSYS;
#else
    (void)semaphore;
    (void)count;
    (void)limit;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(void* spinlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(void* dpc, void* deferredroutine, void* deferredcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeThreadedDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dpc, deferredroutine, deferredcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)dpc;
    (void)deferredroutine;
    (void)deferredcontext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeTimer(void* timer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(void* timer, int32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(timer, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)timer;
    (void)type;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(void* ktriagedumpdataarray, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeTriageDumpDataArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ktriagedumpdataarray, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ktriagedumpdataarray;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(void* devicequeue, void* devicequeueentry, uint32_t sortkey) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertByKeyDeviceQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicequeue, devicequeueentry, sortkey);
    }
    errno = ENOSYS;
    return false;
#else
    (void)devicequeue;
    (void)devicequeueentry;
    (void)sortkey;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(void* devicequeue, void* devicequeueentry) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertDeviceQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicequeue, devicequeueentry);
    }
    errno = ENOSYS;
    return false;
#else
    (void)devicequeue;
    (void)devicequeueentry;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(void* dpc, void* systemargument1, void* systemargument2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertQueueDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dpc, systemargument1, systemargument2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)dpc;
    (void)systemargument1;
    (void)systemargument2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInvalidateAllCaches");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(void* baseaddress, uint32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInvalidateRangeAllCaches");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)length;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(void* broadcastfunction, uint64_t context) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeIpiGenericCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(broadcastfunction, context);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)broadcastfunction;
    (void)context;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeIsExecutingDpc");
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

void windowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeLeaveCriticalRegion");
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

void windowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeLeaveGuardedRegion");
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

int32_t windowssysWindowsWdkSystemSystemservicesKePulseEvent(void* event, int32_t increment, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KePulseEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event, increment, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)event;
    (void)increment;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryActiveGroupCount");
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

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(void* activeprocessors) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryActiveProcessorCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(activeprocessors);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)activeprocessors;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(uint16_t groupnumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryActiveProcessorCountEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)groupnumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryActiveProcessors");
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

int32_t windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(void* auxiliarycounterfrequency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryAuxiliaryCounterFrequency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(auxiliarycounterfrequency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)auxiliarycounterfrequency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(void* watchdoginformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryDpcWatchdogInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(watchdoginformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)watchdoginformation;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(uint16_t groupnumber) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryGroupAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)groupnumber;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(void* counterarray, uint32_t maximumcount, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryHardwareCounterConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(counterarray, maximumcount, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)counterarray;
    (void)maximumcount;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryHighestNodeNumber");
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

uint64_t windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(void* qpctimestamp) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryInterruptTimePrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qpctimestamp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)qpctimestamp;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(void* processornumber, int32_t relationshiptype, void* information, void* length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryLogicalProcessorRelationship");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processornumber, relationshiptype, information, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processornumber;
    (void)relationshiptype;
    (void)information;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryMaximumGroupCount");
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

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryMaximumProcessorCount");
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

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(uint16_t groupnumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryMaximumProcessorCountEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)groupnumber;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(uint16_t nodenumber, void* affinity, void* count) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryNodeActiveAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nodenumber, affinity, count);
        return;
    }
    errno = ENOSYS;
#else
    (void)nodenumber;
    (void)affinity;
    (void)count;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(uint16_t nodenumber, void* groupaffinities, uint16_t groupaffinitiescount, void* groupaffinitiesrequired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryNodeActiveAffinity2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nodenumber, groupaffinities, groupaffinitiescount, groupaffinitiesrequired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nodenumber;
    (void)groupaffinities;
    (void)groupaffinitiescount;
    (void)groupaffinitiesrequired;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(uint16_t nodenumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryNodeActiveProcessorCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nodenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nodenumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(uint16_t nodenumber) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryNodeMaximumProcessorCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nodenumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nodenumber;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(void* performancefrequency) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryPerformanceCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(performancefrequency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)performancefrequency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(int64_t thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryPriorityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(int64_t thread, void* usertime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryRuntimeThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, usertime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)thread;
    (void)usertime;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(void* currenttime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQuerySystemTimePrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(currenttime);
        return;
    }
    errno = ENOSYS;
#else
    (void)currenttime;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryTimeIncrement");
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

uint64_t windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(int64_t thread, void* cycletimestamp) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryTotalCycleTimeThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, cycletimestamp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)thread;
    (void)cycletimestamp;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryUnbiasedInterruptTime");
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

uint64_t windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(void* qpctimestamp) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeQueryUnbiasedInterruptTimePrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(qpctimestamp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)qpctimestamp;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeReadStateEvent(void* event) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeReadStateMutex(void* mutex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mutex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mutex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(void* semaphore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(semaphore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)semaphore;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeReadStateTimer(void* timer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(void* callbackroutine) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRegisterBoundCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackroutine);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackroutine;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(void* callbackrecord, void* callbackroutine, void* buffer, uint32_t length, void* component) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRegisterBugCheckCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackrecord, callbackroutine, buffer, length, component);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackrecord;
    (void)callbackroutine;
    (void)buffer;
    (void)length;
    (void)component;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(void* callbackrecord, void* callbackroutine, int32_t reason, void* component) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRegisterBugCheckReasonCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackrecord, callbackroutine, reason, component);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackrecord;
    (void)callbackroutine;
    (void)reason;
    (void)component;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(void* callbackroutine, void* context) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRegisterNmiCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackroutine, context);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackroutine;
    (void)context;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(void* callbackfunction, void* callbackcontext, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRegisterProcessorChangeCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackfunction, callbackcontext, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackfunction;
    (void)callbackcontext;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(void* mutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseGuardedMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(void* fastmutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseGuardedMutexUnsafe");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fastmutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)fastmutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(void* lockhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseInStackQueuedSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lockhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)lockhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(void* lockhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseInStackQueuedSpinLockForDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lockhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)lockhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(void* lockhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseInStackQueuedSpinLockFromDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lockhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)lockhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(int64_t interrupt, uint8_t oldirql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseInterruptSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(interrupt, oldirql);
        return;
    }
    errno = ENOSYS;
#else
    (void)interrupt;
    (void)oldirql;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeReleaseMutex(void* mutex, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mutex, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mutex;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(void* semaphore, int32_t increment, int32_t adjustment, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(semaphore, increment, adjustment, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)semaphore;
    (void)increment;
    (void)adjustment;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(void* spinlock, uint8_t oldirql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseSpinLockForDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(spinlock, oldirql);
        return;
    }
    errno = ENOSYS;
#else
    (void)spinlock;
    (void)oldirql;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(void* devicequeue, uint32_t sortkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveByKeyDeviceQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicequeue, sortkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)devicequeue;
    (void)sortkey;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(void* devicequeue, uint32_t sortkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveByKeyDeviceQueueIfBusy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicequeue, sortkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)devicequeue;
    (void)sortkey;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(void* devicequeue) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveDeviceQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicequeue);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)devicequeue;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(void* devicequeue, void* devicequeueentry) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveEntryDeviceQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicequeue, devicequeueentry);
    }
    errno = ENOSYS;
    return false;
#else
    (void)devicequeue;
    (void)devicequeueentry;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(void* dpc) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueueDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dpc);
    }
    errno = ENOSYS;
    return false;
#else
    (void)dpc;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(void* dpc, bool waitifactive) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueueDpcEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dpc, waitifactive);
    }
    errno = ENOSYS;
    return false;
#else
    (void)dpc;
    (void)waitifactive;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeResetEvent(void* event) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeResetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(void* xstatesave) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRestoreExtendedProcessorState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(xstatesave);
        return;
    }
    errno = ENOSYS;
#else
    (void)xstatesave;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRevertToUserAffinityThread");
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

void windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(uint64_t affinity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRevertToUserAffinityThreadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(affinity);
        return;
    }
    errno = ENOSYS;
#else
    (void)affinity;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(void* previousaffinity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRevertToUserGroupAffinityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(previousaffinity);
        return;
    }
    errno = ENOSYS;
#else
    (void)previousaffinity;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(uint64_t mask, void* xstatesave) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSaveExtendedProcessorState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mask, xstatesave);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mask;
    (void)xstatesave;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(int64_t thread, int32_t increment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetBasePriorityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, increment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)increment;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(void* timer, int64_t duetime, uint32_t period, uint32_t tolerabledelay, void* dpc) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetCoalescableTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer, duetime, period, tolerabledelay, dpc);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    (void)duetime;
    (void)period;
    (void)tolerabledelay;
    (void)dpc;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeSetEvent(void* event, int32_t increment, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event, increment, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)event;
    (void)increment;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(void* counterarray, uint32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetHardwareCounterConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(counterarray, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)counterarray;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(void* dpc, int32_t importance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetImportanceDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dpc, importance);
        return;
    }
    errno = ENOSYS;
#else
    (void)dpc;
    (void)importance;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(int64_t thread, int32_t priority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetPriorityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, priority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)priority;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(uint64_t affinity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetSystemAffinityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(affinity);
        return;
    }
    errno = ENOSYS;
#else
    (void)affinity;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(uint64_t affinity) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetSystemAffinityThreadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(affinity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)affinity;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(void* affinity, void* previousaffinity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetSystemGroupAffinityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(affinity, previousaffinity);
        return;
    }
    errno = ENOSYS;
#else
    (void)affinity;
    (void)previousaffinity;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(void* dpc, int8_t number) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetTargetProcessorDpc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dpc, number);
        return;
    }
    errno = ENOSYS;
#else
    (void)dpc;
    (void)number;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(void* dpc, void* procnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetTargetProcessorDpcEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dpc, procnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dpc;
    (void)procnumber;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeSetTimer(void* timer, int64_t duetime, void* dpc) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer, duetime, dpc);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    (void)duetime;
    (void)dpc;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeSetTimerEx(void* timer, int64_t duetime, int32_t period, void* dpc) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timer, duetime, period, dpc);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timer;
    (void)duetime;
    (void)period;
    (void)dpc;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeShouldYieldProcessor");
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

void windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(uint32_t microseconds) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hal.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeStallExecutionProcessor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(microseconds);
        return;
    }
    errno = ENOSYS;
#else
    (void)microseconds;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(int64_t interrupt, void* synchronizeroutine, void* synchronizecontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSynchronizeExecution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interrupt, synchronizeroutine, synchronizecontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)interrupt;
    (void)synchronizeroutine;
    (void)synchronizecontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeTestSpinLock(void* spinlock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeTestSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)spinlock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(void* mutex) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeTryToAcquireGuardedMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mutex);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mutex;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(void* spinlock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeTryToAcquireSpinLockAtDpcLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)spinlock;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(uint32_t count, void* object, int32_t waittype, int32_t waitreason, int8_t waitmode, bool alertable, void* timeout, void* waitblockarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, int8_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeWaitForMultipleObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count, object, waittype, waitreason, waitmode, alertable, timeout, waitblockarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)count;
    (void)object;
    (void)waittype;
    (void)waitreason;
    (void)waitmode;
    (void)alertable;
    (void)timeout;
    (void)waitblockarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(void* object, int32_t waitreason, int8_t waitmode, bool alertable, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int8_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeWaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, waitreason, waitmode, alertable, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)waitreason;
    (void)waitmode;
    (void)alertable;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

uint8_t windowssysWindowsWdkSystemSystemservicesKfRaiseIrql(uint8_t newirql) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KfRaiseIrql");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newirql);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)newirql;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(void* startaddress, void* numberofbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAddPhysicalMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startaddress, numberofbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)startaddress;
    (void)numberofbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(uint64_t entryroutine, void* thunkbuffer, uint32_t thunkbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAddVerifierSpecialThunks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entryroutine, thunkbuffer, thunkbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entryroutine;
    (void)thunkbuffer;
    (void)thunkbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(void* thunkbuffer, uint32_t thunkbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAddVerifierThunks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thunkbuffer, thunkbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thunkbuffer;
    (void)thunkbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(void* mdl, uint32_t numberofbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAdvanceMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mdl, numberofbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mdl;
    (void)numberofbytes;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(uint64_t numberofbytes, int64_t highestacceptableaddress) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateContiguousMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, highestacceptableaddress);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    (void)highestacceptableaddress;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(void* numberofbytes, int64_t lowestacceptableaddress, int64_t highestacceptableaddress, int64_t boundaryaddressmultiple, uint32_t preferrednode, uint32_t protect, void* partitionobject, uint32_t tag, uint32_t flags, void* baseaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateContiguousMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode, protect, partitionobject, tag, flags, baseaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numberofbytes;
    (void)lowestacceptableaddress;
    (void)highestacceptableaddress;
    (void)boundaryaddressmultiple;
    (void)preferrednode;
    (void)protect;
    (void)partitionobject;
    (void)tag;
    (void)flags;
    (void)baseaddress;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(uint64_t numberofbytes, int64_t lowestacceptableaddress, int64_t highestacceptableaddress, int64_t boundaryaddressmultiple, int32_t cachetype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, int64_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateContiguousMemorySpecifyCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    (void)lowestacceptableaddress;
    (void)highestacceptableaddress;
    (void)boundaryaddressmultiple;
    (void)cachetype;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(uint64_t numberofbytes, int64_t lowestacceptableaddress, int64_t highestacceptableaddress, int64_t boundaryaddressmultiple, int32_t cachetype, uint32_t preferrednode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, int64_t, int64_t, int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateContiguousMemorySpecifyCacheNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    (void)lowestacceptableaddress;
    (void)highestacceptableaddress;
    (void)boundaryaddressmultiple;
    (void)cachetype;
    (void)preferrednode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(uint64_t numberofbytes, int64_t lowestacceptableaddress, int64_t highestacceptableaddress, int64_t boundaryaddressmultiple, uint32_t protect, uint32_t preferrednode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, int64_t, int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateContiguousNodeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect, preferrednode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    (void)lowestacceptableaddress;
    (void)highestacceptableaddress;
    (void)boundaryaddressmultiple;
    (void)protect;
    (void)preferrednode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(uint64_t numberofbytes, uint32_t pooltag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateMappingAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, pooltag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    (void)pooltag;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(uint64_t numberofbytes, uint32_t pooltag, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateMappingAddressEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes, pooltag, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    (void)pooltag;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(void* physicaladdresslist, uint64_t numberofentries, void* newmdl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateMdlForIoSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdresslist, numberofentries, newmdl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaladdresslist;
    (void)numberofentries;
    (void)newmdl;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(int64_t lowaddress, int64_t highaddress, int64_t skipbytes, uint64_t totalbytes, int32_t cachetype, uint32_t idealnode, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateNodePagesForMdlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lowaddress, highaddress, skipbytes, totalbytes, cachetype, idealnode, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lowaddress;
    (void)highaddress;
    (void)skipbytes;
    (void)totalbytes;
    (void)cachetype;
    (void)idealnode;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(uint64_t numberofbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocateNonCachedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(int64_t lowaddress, int64_t highaddress, int64_t skipbytes, uint64_t totalbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocatePagesForMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lowaddress, highaddress, skipbytes, totalbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lowaddress;
    (void)highaddress;
    (void)skipbytes;
    (void)totalbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(int64_t lowaddress, int64_t highaddress, int64_t skipbytes, uint64_t totalbytes, int32_t cachetype, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocatePagesForMdlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lowaddress, highaddress, skipbytes, totalbytes, cachetype, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lowaddress;
    (void)highaddress;
    (void)skipbytes;
    (void)totalbytes;
    (void)cachetype;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(int64_t lowaddress, int64_t highaddress, int64_t skipbytes, uint64_t totalbytes, int32_t cachetype, uint32_t idealnode, uint32_t flags, void* partitionobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAllocatePartitionNodePagesForMdlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lowaddress, highaddress, skipbytes, totalbytes, cachetype, idealnode, flags, partitionobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lowaddress;
    (void)highaddress;
    (void)skipbytes;
    (void)totalbytes;
    (void)cachetype;
    (void)idealnode;
    (void)flags;
    (void)partitionobject;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(void* memorydescriptorlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmAreMdlPagesCached");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)memorydescriptorlist;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(void* memorydescriptorlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmBuildMdlForNonPagedPool");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmCreateMdl(void* memorydescriptorlist, void* base, uint64_t length) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmCreateMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist, base, length);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)memorydescriptorlist;
    (void)base;
    (void)length;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmCreateMirror(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmCreateMirror");
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

void windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(void* baseaddress) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFreeContiguousMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(void* baseaddress, uint64_t numberofbytes, int32_t cachetype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFreeContiguousMemorySpecifyCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, numberofbytes, cachetype);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)numberofbytes;
    (void)cachetype;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(void* baseaddress, uint32_t pooltag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFreeMappingAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, pooltag);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)pooltag;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(void* baseaddress, uint64_t numberofbytes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFreeNonCachedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, numberofbytes);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)numberofbytes;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(void* memorydescriptorlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFreePagesFromMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(void* memorydescriptorlist, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFreePagesFromMdlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    (void)flags;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(int64_t physicaladdress, void* cachetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetCacheAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdress, cachetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaladdress;
    (void)cachetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(int64_t physicaladdress, uint32_t flags, void* cachetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetCacheAttributeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdress, flags, cachetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaladdress;
    (void)flags;
    (void)cachetype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(void* baseaddress) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetPhysicalAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(baseaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)baseaddress;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetPhysicalMemoryRanges");
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

void* windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(void* partitionobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetPhysicalMemoryRangesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partitionobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)partitionobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(void* partitionobject, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetPhysicalMemoryRangesEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partitionobject, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)partitionobject;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(void* systemroutinename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetSystemRoutineAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systemroutinename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)systemroutinename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(int64_t physicaladdress) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetVirtualForPhysical");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdress);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)physicaladdress;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesMmIsAddressValid(void* virtualaddress) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsAddressValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress);
    }
    errno = ENOSYS;
    return false;
#else
    (void)virtualaddress;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(void* driverobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsDriverSuspectForVerifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)driverobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(void* driverobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsDriverVerifying");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)driverobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(void* addresswithinsection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsDriverVerifyingByAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addresswithinsection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)addresswithinsection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(int64_t startaddress, uint64_t numberofbytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsIoSpaceActive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startaddress, numberofbytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startaddress;
    (void)numberofbytes;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(void* virtualaddress) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsNonPagedSystemAddressValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress);
    }
    errno = ENOSYS;
    return false;
#else
    (void)virtualaddress;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsThisAnNtAsSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(void* verifierflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsVerifierEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(verifierflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)verifierflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(void* addresswithinsection) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmLockPagableDataSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addresswithinsection);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addresswithinsection;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(void* imagesectionhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmLockPagableSectionByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(imagesectionhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)imagesectionhandle;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmMapIoSpace(int64_t physicaladdress, uint64_t numberofbytes, int32_t cachetype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapIoSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdress, numberofbytes, cachetype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)physicaladdress;
    (void)numberofbytes;
    (void)cachetype;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(int64_t physicaladdress, uint64_t numberofbytes, uint32_t protect) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapIoSpaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdress, numberofbytes, protect);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)physicaladdress;
    (void)numberofbytes;
    (void)protect;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmMapLockedPages(void* memorydescriptorlist, int8_t accessmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapLockedPages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist, accessmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)memorydescriptorlist;
    (void)accessmode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(void* memorydescriptorlist, int8_t accessmode, int32_t cachetype, void* requestedaddress, uint32_t bugcheckonfailure, uint32_t priority) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapLockedPagesSpecifyCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist, accessmode, cachetype, requestedaddress, bugcheckonfailure, priority);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)memorydescriptorlist;
    (void)accessmode;
    (void)cachetype;
    (void)requestedaddress;
    (void)bugcheckonfailure;
    (void)priority;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(void* mappingaddress, uint32_t pooltag, void* memorydescriptorlist, int32_t cachetype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapLockedPagesWithReservedMapping");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mappingaddress, pooltag, memorydescriptorlist, cachetype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)mappingaddress;
    (void)pooltag;
    (void)memorydescriptorlist;
    (void)cachetype;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapMdl(void* memorydescriptorlist, uint32_t protection, void* driverroutine, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist, protection, driverroutine, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)memorydescriptorlist;
    (void)protection;
    (void)driverroutine;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(void* va, uint32_t pagetotal, void* memorydumpmdl, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapMemoryDumpMdlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(va, pagetotal, memorydumpmdl, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)va;
    (void)pagetotal;
    (void)memorydumpmdl;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(void* baseaddress, uint64_t numberofbytes, void* pageaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapUserAddressesToPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(baseaddress, numberofbytes, pageaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)baseaddress;
    (void)numberofbytes;
    (void)pageaddress;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(int64_t physicaladdress, uint64_t numberofbytes, int32_t cachetype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapVideoDisplay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaladdress, numberofbytes, cachetype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)physicaladdress;
    (void)numberofbytes;
    (void)cachetype;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(void* section, void* mappedbase, void* viewsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapViewInSessionSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(section, mappedbase, viewsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)section;
    (void)mappedbase;
    (void)viewsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(void* section, void* mappedbase, void* viewsize, void* sectionoffset, uint64_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapViewInSessionSpaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(section, mappedbase, viewsize, sectionoffset, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)section;
    (void)mappedbase;
    (void)viewsize;
    (void)sectionoffset;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(void* section, void* mappedbase, void* viewsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapViewInSystemSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(section, mappedbase, viewsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)section;
    (void)mappedbase;
    (void)viewsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(void* section, void* mappedbase, void* viewsize, void* sectionoffset, uint64_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMapViewInSystemSpaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(section, mappedbase, viewsize, sectionoffset, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)section;
    (void)mappedbase;
    (void)viewsize;
    (void)sectionoffset;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(void* memorydescriptorlist, int32_t state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMdlPageContentsState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)memorydescriptorlist;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(void* addresswithinsection) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmPageEntireDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addresswithinsection);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addresswithinsection;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(void* memorydescriptorlist, int8_t accessmode, int32_t operation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmProbeAndLockPages");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist, accessmode, operation);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    (void)accessmode;
    (void)operation;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(void* memorydescriptorlist, int64_t process, int8_t accessmode, int32_t operation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int8_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmProbeAndLockProcessPages");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist, process, accessmode, operation);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    (void)process;
    (void)accessmode;
    (void)operation;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(void* memorydescriptorlist, void* segmentarray, int8_t accessmode, int32_t operation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int8_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmProbeAndLockSelectedPages");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist, segmentarray, accessmode, operation);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    (void)segmentarray;
    (void)accessmode;
    (void)operation;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(void* addresswithinsection, uint64_t size, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmProtectDriverSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addresswithinsection, size, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addresswithinsection;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(void* memorydescriptorlist, uint32_t newprotect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmProtectMdlSystemAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(memorydescriptorlist, newprotect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)memorydescriptorlist;
    (void)newprotect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmQuerySystemSize");
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

int32_t windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(void* startaddress, void* numberofbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmRemovePhysicalMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startaddress, numberofbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)startaddress;
    (void)numberofbytes;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(void* addresswithinsection) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmResetDriverPaging");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(addresswithinsection);
        return;
    }
    errno = ENOSYS;
#else
    (void)addresswithinsection;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(void* virtualaddress, void* numberofbytes, void* newmdl, int32_t direction, void* copyfunction, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmRotatePhysicalView");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, numberofbytes, newmdl, direction, copyfunction, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)virtualaddress;
    (void)numberofbytes;
    (void)newmdl;
    (void)direction;
    (void)copyfunction;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(void* address, uint64_t size, uint32_t probemode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSecureVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, size, probemode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)address;
    (void)size;
    (void)probemode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(void* address, uint64_t size, uint32_t probemode, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSecureVirtualMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, size, probemode, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)address;
    (void)size;
    (void)probemode;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(int64_t startaddress, int64_t numberofbytes, int32_t cachetype, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSetPermanentCacheAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startaddress, numberofbytes, cachetype, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)startaddress;
    (void)numberofbytes;
    (void)cachetype;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(void* base, uint64_t length) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSizeOfMdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(base, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)base;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(void* imagesectionhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnlockPagableImageSection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(imagesectionhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)imagesectionhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnlockPages(void* memorydescriptorlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnlockPages");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorydescriptorlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorydescriptorlist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(void* baseaddress, uint64_t numberofbytes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnmapIoSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, numberofbytes);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)numberofbytes;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(void* baseaddress, void* memorydescriptorlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnmapLockedPages");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, memorydescriptorlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)memorydescriptorlist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(void* baseaddress, uint32_t pooltag, void* memorydescriptorlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnmapReservedMapping");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, pooltag, memorydescriptorlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)pooltag;
    (void)memorydescriptorlist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(void* baseaddress, uint64_t numberofbytes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnmapVideoDisplay");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(baseaddress, numberofbytes);
        return;
    }
    errno = ENOSYS;
#else
    (void)baseaddress;
    (void)numberofbytes;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(void* mappedbase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnmapViewInSessionSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mappedbase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mappedbase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(void* mappedbase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnmapViewInSystemSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mappedbase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mappedbase;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(void* securehandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmUnsecureVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(securehandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)securehandle;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(void* luid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateLocallyUniqueId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(luid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)luid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCommitComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCommitComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCommitEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCommitTransaction(void* transactionhandle, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCommitTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(void* enlistmenthandle, uint32_t desiredaccess, void* resourcemanagerhandle, void* transactionhandle, void* objectattributes, uint32_t createoptions, uint32_t notificationmask, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, desiredaccess, resourcemanagerhandle, transactionhandle, objectattributes, createoptions, notificationmask, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)desiredaccess;
    (void)resourcemanagerhandle;
    (void)transactionhandle;
    (void)objectattributes;
    (void)createoptions;
    (void)notificationmask;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(void* resourcemanagerhandle, uint32_t desiredaccess, void* tmhandle, void* rmguid, void* objectattributes, uint32_t createoptions, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, desiredaccess, tmhandle, rmguid, objectattributes, createoptions, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)desiredaccess;
    (void)tmhandle;
    (void)rmguid;
    (void)objectattributes;
    (void)createoptions;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCreateTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, void* uow, void* tmhandle, uint32_t createoptions, uint32_t isolationlevel, uint32_t isolationflags, void* timeout, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes, uow, tmhandle, createoptions, isolationlevel, isolationflags, timeout, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)uow;
    (void)tmhandle;
    (void)createoptions;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(void* tmhandle, uint32_t desiredaccess, void* objectattributes, void* logfilename, uint32_t createoptions, uint32_t commitstrength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tmhandle, desiredaccess, objectattributes, logfilename, createoptions, commitstrength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tmhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)logfilename;
    (void)createoptions;
    (void)commitstrength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtDisplayString(void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDisplayString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(void* rootobjecthandle, int32_t querytype, void* objectcursor, uint32_t objectcursorlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtEnumerateTransactionObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootobjecthandle, querytype, objectcursor, objectcursorlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootobjecthandle;
    (void)querytype;
    (void)objectcursor;
    (void)objectcursorlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(void* resourcemanagerhandle, void* transactionnotification, uint32_t notificationlength, void* timeout, void* returnlength, uint32_t asynchronous, uint64_t asynchronouscontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtGetNotificationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, transactionnotification, notificationlength, timeout, returnlength, asynchronous, asynchronouscontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)transactionnotification;
    (void)notificationlength;
    (void)timeout;
    (void)returnlength;
    (void)asynchronous;
    (void)asynchronouscontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtLoadDriver(void* driverservicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtLoadDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverservicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverservicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtMakeTemporaryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtManagePartition(void* targethandle, void* sourcehandle, int32_t partitioninformationclass, void* partitioninformation, uint32_t partitioninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtManagePartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targethandle, sourcehandle, partitioninformationclass, partitioninformation, partitioninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targethandle;
    (void)sourcehandle;
    (void)partitioninformationclass;
    (void)partitioninformation;
    (void)partitioninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(void* enlistmenthandle, uint32_t desiredaccess, void* resourcemanagerhandle, void* enlistmentguid, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, desiredaccess, resourcemanagerhandle, enlistmentguid, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)desiredaccess;
    (void)resourcemanagerhandle;
    (void)enlistmentguid;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(void* resourcemanagerhandle, uint32_t desiredaccess, void* tmhandle, void* resourcemanagerguid, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, desiredaccess, tmhandle, resourcemanagerguid, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)desiredaccess;
    (void)tmhandle;
    (void)resourcemanagerguid;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtOpenTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, void* uow, void* tmhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes, uow, tmhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)uow;
    (void)tmhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(void* tmhandle, uint32_t desiredaccess, void* objectattributes, void* logfilename, void* tmidentity, uint32_t openoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tmhandle, desiredaccess, objectattributes, logfilename, tmidentity, openoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tmhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)logfilename;
    (void)tmidentity;
    (void)openoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPowerInformation(int32_t informationlevel, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPowerInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationlevel, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationlevel;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrePrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrePrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPrepareComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPropagationComplete(void* resourcemanagerhandle, uint32_t requestcookie, uint32_t bufferlength, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPropagationComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, requestcookie, bufferlength, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)requestcookie;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtPropagationFailed(void* resourcemanagerhandle, uint32_t requestcookie, int32_t propstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPropagationFailed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, requestcookie, propstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)requestcookie;
    (void)propstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(void* enlistmenthandle, int32_t enlistmentinformationclass, void* enlistmentinformation, uint32_t enlistmentinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentinformationclass;
    (void)enlistmentinformation;
    (void)enlistmentinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(void* resourcemanagerhandle, int32_t resourcemanagerinformationclass, void* resourcemanagerinformation, uint32_t resourcemanagerinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)resourcemanagerinformationclass;
    (void)resourcemanagerinformation;
    (void)resourcemanagerinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(void* transactionhandle, int32_t transactioninformationclass, void* transactioninformation, uint32_t transactioninformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)transactioninformationclass;
    (void)transactioninformation;
    (void)transactioninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(void* transactionmanagerhandle, int32_t transactionmanagerinformationclass, void* transactionmanagerinformation, uint32_t transactionmanagerinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)transactionmanagerinformationclass;
    (void)transactionmanagerinformation;
    (void)transactionmanagerinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtReadOnlyEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(void* enlistmenthandle, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRecoverEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(void* resourcemanagerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRecoverResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(void* transactionmanagerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRecoverTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(void* resourcemanager, void* protocolid, uint32_t protocolinformationsize, void* protocolinformation, uint32_t createoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRegisterProtocolAddressInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanager, protocolid, protocolinformationsize, protocolinformation, createoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanager;
    (void)protocolid;
    (void)protocolinformationsize;
    (void)protocolinformation;
    (void)createoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(void* logfilename, void* existingtransactionmanagerguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRenameTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, existingtransactionmanagerguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfilename;
    (void)existingtransactionmanagerguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRollbackComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRollbackComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRollbackEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(void* transactionhandle, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRollbackTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(void* transactionmanagerhandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRollforwardTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(void* enlistmenthandle, int32_t enlistmentinformationclass, void* enlistmentinformation, uint32_t enlistmentinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentinformationclass;
    (void)enlistmentinformation;
    (void)enlistmentinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(void* resourcemanagerhandle, int32_t resourcemanagerinformationclass, void* resourcemanagerinformation, uint32_t resourcemanagerinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)resourcemanagerinformationclass;
    (void)resourcemanagerinformation;
    (void)resourcemanagerinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(void* transactionhandle, int32_t transactioninformationclass, void* transactioninformation, uint32_t transactioninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)transactioninformationclass;
    (void)transactioninformation;
    (void)transactioninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(void* tmhandle, int32_t transactionmanagerinformationclass, void* transactionmanagerinformation, uint32_t transactionmanagerinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tmhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tmhandle;
    (void)transactionmanagerinformationclass;
    (void)transactionmanagerinformation;
    (void)transactionmanagerinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSinglePhaseReject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesNtUnloadDriver(void* driverservicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtUnloadDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverservicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverservicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesObCloseHandle(void* handle, int8_t previousmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, previousmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)previousmode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(void* object) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObDereferenceObjectDeferDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(object);
        return;
    }
    errno = ENOSYS;
#else
    (void)object;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(void* object, uint32_t tag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObDereferenceObjectDeferDeleteWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(object, tag);
        return;
    }
    errno = ENOSYS;
#else
    (void)object;
    (void)tag;
    errno = ENOSYS;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesObGetFilterVersion(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObGetFilterVersion");
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

int32_t windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(void* object, void* securitydescriptor, void* memoryallocated) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObGetObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, securitydescriptor, memoryallocated);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)securitydescriptor;
    (void)memoryallocated;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(void* handle, uint32_t desiredaccess, int64_t objecttype, int8_t accessmode, void* object, void* handleinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReferenceObjectByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, desiredaccess, objecttype, accessmode, object, handleinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)object;
    (void)handleinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(void* handle, uint32_t desiredaccess, int64_t objecttype, int8_t accessmode, uint32_t tag, void* object, void* handleinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReferenceObjectByHandleWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, desiredaccess, objecttype, accessmode, tag, object, handleinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)tag;
    (void)object;
    (void)handleinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(void* object, uint32_t desiredaccess, int64_t objecttype, int8_t accessmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReferenceObjectByPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, desiredaccess, objecttype, accessmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(void* object, uint32_t desiredaccess, int64_t objecttype, int8_t accessmode, uint32_t tag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReferenceObjectByPointerWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, desiredaccess, objecttype, accessmode, tag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)tag;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(void* object) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReferenceObjectSafe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object);
    }
    errno = ENOSYS;
    return false;
#else
    (void)object;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(void* object, uint32_t tag) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReferenceObjectSafeWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, tag);
    }
    errno = ENOSYS;
    return false;
#else
    (void)object;
    (void)tag;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(void* callbackregistration, void* registrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObRegisterCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackregistration, registrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackregistration;
    (void)registrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(void* securitydescriptor, bool memoryallocated) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObReleaseObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(securitydescriptor, memoryallocated);
        return;
    }
    errno = ENOSYS;
#else
    (void)securitydescriptor;
    (void)memoryallocated;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(void* registrationhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObUnRegisterCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(registrationhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)registrationhandle;
    errno = ENOSYS;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesObfDereferenceObject(void* object) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObfDereferenceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(void* object, uint32_t tag) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObfDereferenceObjectWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, tag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)tag;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesObfReferenceObject(void* object) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObfReferenceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(void* object, uint32_t tag) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObfReferenceObjectWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, tag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)tag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPcwAddInstance(int64_t buffer, void* name, uint32_t id, uint32_t count, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PcwAddInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, name, id, count, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    (void)name;
    (void)id;
    (void)count;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPcwCloseInstance(int64_t instance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PcwCloseInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(instance);
        return;
    }
    errno = ENOSYS;
#else
    (void)instance;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPcwCreateInstance(void* instance, int64_t registration, void* name, uint32_t count, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PcwCreateInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, registration, name, count, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)registration;
    (void)name;
    (void)count;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPcwRegister(void* registration, void* info) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PcwRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registration, info);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registration;
    (void)info;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPcwUnregister(int64_t registration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PcwUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(registration);
        return;
    }
    errno = ENOSYS;
#else
    (void)registration;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoCallDriver(void* deviceobject, void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoCallDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(void* powerrequest, int32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoClearPowerRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powerrequest, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)powerrequest;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(void* powerrequest, void* deviceobject, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoCreatePowerRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powerrequest, deviceobject, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)powerrequest;
    (void)deviceobject;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(void* thermalrequest, void* targetdeviceobject, void* policydeviceobject, void* context, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoCreateThermalRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thermalrequest, targetdeviceobject, policydeviceobject, context, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thermalrequest;
    (void)targetdeviceobject;
    (void)policydeviceobject;
    (void)context;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(void* powerrequest) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoDeletePowerRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(powerrequest);
        return;
    }
    errno = ENOSYS;
#else
    (void)powerrequest;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(void* thermalrequest) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoDeleteThermalRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(thermalrequest);
        return;
    }
    errno = ENOSYS;
#else
    (void)thermalrequest;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(void* idlepointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoEndDeviceBusy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(idlepointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)idlepointer;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(void* handle, uint32_t component, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxActivateComponent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxCompleteDevicePowerNotRequired");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxCompleteDirectedPowerDown");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(void* handle, uint32_t component) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxCompleteIdleCondition");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(void* handle, uint32_t component) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxCompleteIdleState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(void* handle, uint32_t component, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxIdleComponent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(void* handle, uint32_t flags, uint32_t component, void* perfchange, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxIssueComponentPerfStateChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, flags, component, perfchange, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)flags;
    (void)component;
    (void)perfchange;
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(void* handle, uint32_t flags, uint32_t component, uint32_t perfchangescount, void* perfchanges, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxIssueComponentPerfStateChangeMultiple");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, flags, component, perfchangescount, perfchanges, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)flags;
    (void)component;
    (void)perfchangescount;
    (void)perfchanges;
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(void* pdo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxNotifySurprisePowerOn");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdo);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdo;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxPowerControl(void* handle, void* powercontrolcode, void* inbuffer, uint64_t inbuffersize, void* outbuffer, uint64_t outbuffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxPowerControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, powercontrolcode, inbuffer, inbuffersize, outbuffer, outbuffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)powercontrolcode;
    (void)inbuffer;
    (void)inbuffersize;
    (void)outbuffer;
    (void)outbuffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(void* handle, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxPowerOnCrashdumpDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(void* handle, uint32_t flags, uint32_t component, uint32_t setindex, void* currentperf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxQueryCurrentComponentPerfState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, flags, component, setindex, currentperf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)flags;
    (void)component;
    (void)setindex;
    (void)currentperf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(void* handle, uint32_t component, uint64_t flags, void* componentperfstatecallback, void* inputstateinfo, void* outputstateinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxRegisterComponentPerfStates");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, component, flags, componentperfstatecallback, inputstateinfo, outputstateinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)component;
    (void)flags;
    (void)componentperfstatecallback;
    (void)inputstateinfo;
    (void)outputstateinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxRegisterCrashdumpDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(void* pdo, void* device, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxRegisterDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, device, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdo;
    (void)device;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(void* handle, void* callback, bool includechilddevices, void* matchingdriverobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxRegisterDripsWatchdogCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, callback, includechilddevices, matchingdriverobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)callback;
    (void)includechilddevices;
    (void)matchingdriverobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxReportDevicePoweredOn");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(void* handle, uint32_t component, uint64_t latency) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxSetComponentLatency");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component, latency);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    (void)latency;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(void* handle, uint32_t component, uint64_t residency) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxSetComponentResidency");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component, residency);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    (void)residency;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(void* handle, uint32_t component, bool wakehint) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxSetComponentWake");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, component, wakehint);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)component;
    (void)wakehint;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(void* handle, uint64_t idletimeout) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxSetDeviceIdleTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, idletimeout);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)idletimeout;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(void* handle, int32_t targetstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxSetTargetDripsDevicePowerState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, targetstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)targetstate;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxStartDevicePowerManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoFxUnregisterDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPoGetSystemWake(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoGetSystemWake");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(void* thermalrequest, int32_t type) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoGetThermalRequestSupport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thermalrequest, type);
    }
    errno = ENOSYS;
    return false;
#else
    (void)thermalrequest;
    (void)type;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(void* pdo, void* secondsremaining) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoQueryWatchdogTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdo, secondsremaining);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pdo;
    (void)secondsremaining;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(void* deviceobject, uint32_t conservationidletime, uint32_t performanceidletime, int32_t state) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoRegisterDeviceForIdleDetection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, conservationidletime, performanceidletime, state);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceobject;
    (void)conservationidletime;
    (void)performanceidletime;
    (void)state;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(void* deviceobject, void* settingguid, void* callback, void* context, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoRegisterPowerSettingCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, settingguid, callback, context, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)settingguid;
    (void)callback;
    (void)context;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(void* statehandle, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoRegisterSystemState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statehandle, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)statehandle;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(void* idlepointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetDeviceBusyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(idlepointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)idlepointer;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoSetHiberRange(void* memorymap, uint32_t flags, void* address, uint64_t length, uint32_t tag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetHiberRange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(memorymap, flags, address, length, tag);
        return;
    }
    errno = ENOSYS;
#else
    (void)memorymap;
    (void)flags;
    (void)address;
    (void)length;
    (void)tag;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(void* powerrequest, int32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetPowerRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powerrequest, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)powerrequest;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoSetSystemState(uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetSystemState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoSetSystemWake(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetSystemWake");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetSystemWakeDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(void* thermalrequest, bool engaged) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetThermalActiveCooling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thermalrequest, engaged);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thermalrequest;
    (void)engaged;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(void* thermalrequest, uint8_t throttle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoSetThermalPassiveCooling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thermalrequest, throttle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thermalrequest;
    (void)throttle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(void* idlepointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoStartDeviceBusy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(idlepointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)idlepointer;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoStartNextPowerIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoUnregisterPowerSettingCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(void* statehandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoUnregisterSystemState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(statehandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)statehandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesProbeForRead(void* address, uint64_t length, uint32_t alignment) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProbeForRead");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(address, length, alignment);
        return;
    }
    errno = ENOSYS;
#else
    (void)address;
    (void)length;
    (void)alignment;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesProbeForWrite(void* address, uint64_t length, uint32_t alignment) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProbeForWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(address, length, alignment);
        return;
    }
    errno = ENOSYS;
#else
    (void)address;
    (void)length;
    (void)alignment;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(int64_t silo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAcquireSiloHardReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(uint64_t reserved, void* returnedcontextslot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAllocSiloContextSlot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, returnedcontextslot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)returnedcontextslot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(void* affinitytoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAllocateAffinityToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(affinitytoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)affinitytoken;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(int64_t silo) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAttachSiloToCurrentThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(int64_t silo, uint32_t size, int32_t pooltype, void* contextcleanupcallback, void* returnedsilocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsCreateSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, size, pooltype, contextcleanupcallback, returnedsilocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)size;
    (void)pooltype;
    (void)contextcleanupcallback;
    (void)returnedsilocontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(void* threadhandle, uint32_t desiredaccess, void* objectattributes, void* processhandle, void* clientid, void* startroutine, void* startcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsCreateSystemThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, desiredaccess, objectattributes, processhandle, clientid, startroutine, startcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)processhandle;
    (void)clientid;
    (void)startroutine;
    (void)startcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(void* silocontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferenceSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(silocontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)silocontext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(int64_t previoussilo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDetachSiloFromCurrentThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(previoussilo);
        return;
    }
    errno = ENOSYS;
#else
    (void)previoussilo;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(int64_t affinitytoken) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsFreeAffinityToken");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(affinitytoken);
        return;
    }
    errno = ENOSYS;
#else
    (void)affinitytoken;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(uint32_t contextslot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsFreeSiloContextSlot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contextslot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contextslot;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetCurrentProcessId");
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

int64_t windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetCurrentServerSilo");
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

void* windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetCurrentServerSiloName");
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

int64_t windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetCurrentSilo");
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

void* windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetCurrentThreadId");
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

void* windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetCurrentThreadTeb");
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

int64_t windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(int64_t silo) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetEffectiveServerSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesPsGetHostSilo(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetHostSilo");
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

int32_t windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(int64_t job, void* serversilo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetJobServerSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(job, serversilo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)job;
    (void)serversilo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsGetJobSilo(int64_t job, void* silo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetJobSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(job, silo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)job;
    (void)silo;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesPsGetParentSilo(int64_t job) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetParentSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(job);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)job;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(int64_t silo, uint32_t contextslot, void* returnedsilocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetPermanentSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot, returnedsilocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    (void)returnedsilocontext;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(int64_t process) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessCreateTimeQuadPart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(int64_t process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessExitStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPsGetProcessId(int64_t process) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)process;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(int64_t process) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessStartKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)process;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(int64_t silo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetServerSiloServiceSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)silo;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(int64_t silo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetSiloContainerId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)silo;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsGetSiloContext(int64_t silo, uint32_t contextslot, void* returnedsilocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot, returnedsilocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    (void)returnedsilocontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(int64_t monitor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetSiloMonitorContextSlot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(monitor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)monitor;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(int64_t thread) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadCreateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(int64_t thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadExitStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPsGetThreadId(int64_t thread) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)thread;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(int64_t thread) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)thread;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(int64_t thread, uint64_t key, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, key, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)thread;
    (void)key;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(int64_t thread) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadServerSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPsGetVersion(void* majorversion, void* minorversion, void* buildnumber, void* csdversion) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(majorversion, minorversion, buildnumber, csdversion);
    }
    errno = ENOSYS;
    return false;
#else
    (void)majorversion;
    (void)minorversion;
    (void)buildnumber;
    (void)csdversion;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(int64_t silo, uint32_t contextslot, void* silocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsInsertPermanentSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot, silocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    (void)silocontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(int64_t silo, uint32_t contextslot, void* silocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsInsertSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot, silocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    (void)silocontext;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsCurrentThreadInServerSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsCurrentThreadPrefetching");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPsIsHostSilo(int64_t silo) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsHostSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo);
    }
    errno = ENOSYS;
    return false;
#else
    (void)silo;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(int64_t silo, uint32_t contextslot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsMakeSiloContextPermanent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(int64_t process, void* cycletimestamp) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsQueryTotalCycleTimeProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, cycletimestamp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)process;
    (void)cycletimestamp;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(void* silocontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferenceSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(silocontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)silocontext;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(void* registration, void* returnedmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRegisterSiloMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registration, returnedmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registration;
    (void)returnedmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(int64_t silo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReleaseSiloHardReference");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(silo);
        return;
    }
    errno = ENOSYS;
#else
    (void)silo;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(void* notifyroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRemoveCreateThreadNotifyRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(void* notifyroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRemoveLoadImageNotifyRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(int64_t silo, uint32_t contextslot, void* removedsilocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRemoveSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot, removedsilocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    (void)removedsilocontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(int64_t silo, uint32_t contextslot, void* newsilocontext, void* oldsilocontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReplaceSiloContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(silo, contextslot, newsilocontext, oldsilocontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)silo;
    (void)contextslot;
    (void)newsilocontext;
    (void)oldsilocontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(int64_t affinitytoken) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRevertToUserMultipleGroupAffinityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(affinitytoken);
        return;
    }
    errno = ENOSYS;
#else
    (void)affinitytoken;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(void* notifyroutine, bool arg1Remove) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetCreateProcessNotifyRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine, arg1Remove);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    (void)arg1Remove;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(void* notifyroutine, bool arg1Remove) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetCreateProcessNotifyRoutineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine, arg1Remove);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    (void)arg1Remove;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(int32_t notifytype, void* notifyinformation, bool arg2Remove) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetCreateProcessNotifyRoutineEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifytype, notifyinformation, arg2Remove);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifytype;
    (void)notifyinformation;
    (void)arg2Remove;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(void* notifyroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetCreateThreadNotifyRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(int32_t notifytype, void* notifyinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetCreateThreadNotifyRoutineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifytype, notifyinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifytype;
    (void)notifyinformation;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(bool prefetching) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetCurrentThreadPrefetching");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefetching);
    }
    errno = ENOSYS;
    return false;
#else
    (void)prefetching;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(void* notifyroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetLoadImageNotifyRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(void* notifyroutine, uint64_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetLoadImageNotifyRoutineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifyroutine, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notifyroutine;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(void* groupaffinities, uint16_t groupcount, int64_t affinitytoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsSetSystemMultipleGroupAffinityThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupaffinities, groupcount, affinitytoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupaffinities;
    (void)groupcount;
    (void)affinitytoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(int64_t monitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsStartSiloMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(monitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)monitor;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(int64_t serversilo, int32_t exitstatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsTerminateServerSilo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(serversilo, exitstatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)serversilo;
    (void)exitstatus;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(int32_t exitstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsTerminateSystemThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exitstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exitstatus;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(int64_t monitor) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsUnregisterSiloMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(monitor);
        return;
    }
    errno = ENOSYS;
#else
    (void)monitor;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(void* apccontext, void* apcroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsWrapApcWow64Thread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(apccontext, apcroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)apccontext;
    (void)apcroutine;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(uint32_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pshed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PshedAllocateMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPshedFreeMemory(void* address) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pshed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PshedFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(address);
        return;
    }
    errno = ENOSYS;
#else
    (void)address;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pshed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PshedIsSystemWheaEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(void* packet) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pshed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PshedRegisterPlugin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packet);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packet;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(void* errorsource, void* synchronizeroutine, void* synchronizecontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pshed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PshedSynchronizeExecution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorsource, synchronizeroutine, synchronizecontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)errorsource;
    (void)synchronizeroutine;
    (void)synchronizecontext;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(void* pluginhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pshed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PshedUnregisterPlugin");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pluginhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)pluginhandle;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(void* destination, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAppendUnicodeStringToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destination, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(void* destination, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAppendUnicodeToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destination, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(void* bitmapheader, uint32_t startingindex, uint32_t length) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAreBitsClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, startingindex, length);
    }
    errno = ENOSYS;
    return false;
#else
    (void)bitmapheader;
    (void)startingindex;
    (void)length;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(void* bitmapheader, uint32_t startingindex, uint32_t length) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAreBitsSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, startingindex, length);
    }
    errno = ENOSYS;
    return false;
#else
    (void)bitmapheader;
    (void)startingindex;
    (void)length;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlAssert(void* voidfailedassertion, void* voidfilename, uint32_t linenumber, void* mutablemessage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAssert");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(voidfailedassertion, voidfilename, linenumber, mutablemessage);
        return;
    }
    errno = ENOSYS;
#else
    (void)voidfailedassertion;
    (void)voidfilename;
    (void)linenumber;
    (void)mutablemessage;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(uint32_t relativeto, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCheckRegistryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(relativeto, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)relativeto;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlClearAllBits(void* bitmapheader) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlClearAllBits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlClearBit(void* bitmapheader, uint32_t bitnumber) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlClearBit");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader, bitnumber);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    (void)bitnumber;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlClearBits(void* bitmapheader, uint32_t startingindex, uint32_t numbertoclear) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlClearBits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader, startingindex, numbertoclear);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    (void)startingindex;
    (void)numbertoclear;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(void* descriptor, void* start) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCmDecodeMemIoResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptor, start);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)descriptor;
    (void)start;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(void* descriptor, uint8_t type, uint64_t length, uint64_t start) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCmEncodeMemIoResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptor, type, length, start);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)descriptor;
    (void)type;
    (void)length;
    (void)start;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCompareString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(void* string1, uint64_t string1length, void* string2, uint64_t string2length, bool caseinsensitive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareUnicodeStrings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string1length, string2, string2length, caseinsensitive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string1length;
    (void)string2;
    (void)string2length;
    (void)caseinsensitive;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlContractHashTable(void* hashtable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlContractHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(void* source, void* destination, uint32_t targetbit) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopyBitMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(source, destination, targetbit);
        return;
    }
    errno = ENOSYS;
#else
    (void)source;
    (void)destination;
    (void)targetbit;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlCopyString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopyString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopyUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(void* hashtable, uint32_t shift, uint32_t flags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, shift, flags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)shift;
    (void)flags;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(void* hashtable, uint32_t initialsize, uint32_t shift, uint32_t flags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateHashTableEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, initialsize, shift, flags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)initialsize;
    (void)shift;
    (void)flags;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(uint32_t relativeto, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateRegistryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(relativeto, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)relativeto;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(void* securitydescriptor, uint32_t revision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, revision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)revision;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlDelete(void* links) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(links);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)links;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(void* table, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteElementGenericTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)table;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(void* table, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteElementGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)table;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(void* table, void* nodeorparent) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteElementGenericTableAvlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(table, nodeorparent);
        return;
    }
    errno = ENOSYS;
#else
    (void)table;
    (void)nodeorparent;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(void* hashtable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hashtable);
        return;
    }
    errno = ENOSYS;
#else
    (void)hashtable;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(void* links, void* root) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteNoSplay");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(links, root);
        return;
    }
    errno = ENOSYS;
#else
    (void)links;
    (void)root;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(uint32_t relativeto, void* path, void* valuename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteRegistryValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(relativeto, path, valuename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)relativeto;
    (void)path;
    (void)valuename;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(uint16_t sourcecharacter) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDowncaseUnicodeChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcecharacter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcecharacter;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEndEnumerationHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hashtable, enumerator);
        return;
    }
    errno = ENOSYS;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEndStrongEnumerationHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hashtable, enumerator);
        return;
    }
    errno = ENOSYS;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEndWeakEnumerationHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hashtable, enumerator);
        return;
    }
    errno = ENOSYS;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEnumerateEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, enumerator);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(void* table, bool restart) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEnumerateGenericTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, restart);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)restart;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(void* table, bool restart) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEnumerateGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, restart);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)restart;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(void* table, void* matchfunction, void* matchdata, uint32_t nextflag, void* restartkey, void* deletecount, void* buffer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEnumerateGenericTableLikeADirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, matchfunction, matchdata, nextflag, restartkey, deletecount, buffer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)matchfunction;
    (void)matchdata;
    (void)nextflag;
    (void)restartkey;
    (void)deletecount;
    (void)buffer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(void* table, void* restartkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEnumerateGenericTableWithoutSplaying");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, restartkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)restartkey;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(void* table, void* restartkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEnumerateGenericTableWithoutSplayingAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, restartkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)restartkey;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlEqualString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(void* hashtable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlExpandHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(void* source, void* destination, uint32_t targetbit, uint32_t numberofbits) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlExtractBitMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(source, destination, targetbit, numberofbits);
        return;
    }
    errno = ENOSYS;
#else
    (void)source;
    (void)destination;
    (void)targetbit;
    (void)numberofbits;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindClearBits(void* bitmapheader, uint32_t numbertofind, uint32_t hintindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindClearBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, numbertofind, hintindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)numbertofind;
    (void)hintindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(void* bitmapheader, uint32_t numbertofind, uint32_t hintindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindClearBitsAndSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, numbertofind, hintindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)numbertofind;
    (void)hintindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(void* bitmapheader, void* runarray, uint32_t sizeofrunarray, bool locatelongestruns) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindClearRuns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, runarray, sizeofrunarray, locatelongestruns);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)runarray;
    (void)sizeofrunarray;
    (void)locatelongestruns;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(uint64_t sourcelength, void* targetlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindClosestEncodableLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcelength, targetlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcelength;
    (void)targetlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(void* bitmapheader, void* startingindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindFirstRunClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, startingindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)startingindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(void* bitmapheader, uint32_t fromindex, void* startingrunindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindLastBackwardRunClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, fromindex, startingrunindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)fromindex;
    (void)startingrunindex;
    errno = ENOSYS;
    return 0;
#endif
}

int8_t windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(uint64_t set) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindLeastSignificantBit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(void* bitmapheader, void* startingindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindLongestRunClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, startingindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)startingindex;
    errno = ENOSYS;
    return 0;
#endif
}

int8_t windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(uint64_t set) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindMostSignificantBit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(void* bitmapheader, uint32_t fromindex, void* startingrunindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindNextForwardRunClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, fromindex, startingrunindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)fromindex;
    (void)startingrunindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindSetBits(void* bitmapheader, uint32_t numbertofind, uint32_t hintindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindSetBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, numbertofind, hintindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)numbertofind;
    (void)hintindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(void* bitmapheader, uint32_t numbertofind, uint32_t hintindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindSetBitsAndClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, numbertofind, hintindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)numbertofind;
    (void)hintindex;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(void* utf8string) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeUTF8String");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(utf8string);
        return;
    }
    errno = ENOSYS;
#else
    (void)utf8string;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(void* guidstring, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGUIDFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guidstring, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guidstring;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(void* namespaceguid, void* buffer, uint32_t buffersize, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGenerateClass5Guid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespaceguid, buffer, buffersize, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespaceguid;
    (void)buffer;
    (void)buffersize;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetActiveConsoleId");
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

void windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(void* callersaddress, void* callerscaller) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetCallersAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callersaddress, callerscaller);
        return;
    }
    errno = ENOSYS;
#else
    (void)callersaddress;
    (void)callerscaller;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetConsoleSessionForegroundProcessId");
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

void* windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(void* table, uint32_t i) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetElementGenericTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, i);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)i;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(void* table, uint32_t i) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetElementGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, i);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)i;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(uint64_t featuremask) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetEnabledExtendedFeatures");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featuremask);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)featuremask;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(void* hashtable, void* context) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetNextEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, context);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hashtable;
    (void)context;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(void* ntproducttype) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetNtProductType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntproducttype);
    }
    errno = ENOSYS;
    return false;
#else
    (void)ntproducttype;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetNtSystemRoot");
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

int32_t windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(void* sourceid, void* customvalue, void* defaultpath, int32_t statelocationtype, void* targetpath, uint32_t bufferlengthin, void* bufferlengthout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetPersistedStateLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceid, customvalue, defaultpath, statelocationtype, targetpath, bufferlengthin, bufferlengthout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceid;
    (void)customvalue;
    (void)defaultpath;
    (void)statelocationtype;
    (void)targetpath;
    (void)bufferlengthin;
    (void)bufferlengthout;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSuiteMask");
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

int32_t windowssysWindowsWdkSystemSystemservicesRtlGetVersion(void* lpversioninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpversioninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpversioninformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(void* string, bool caseinsensitive, uint32_t hashalgorithm, void* hashvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlHashUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, caseinsensitive, hashalgorithm, hashvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)caseinsensitive;
    (void)hashalgorithm;
    (void)hashvalue;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitEnumerationHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, enumerator);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitStrongEnumerationHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, enumerator);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUTF8String");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUTF8StringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitWeakEnumerationHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, enumerator);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(void* bitmapheader, void* bitmapbuffer, uint32_t sizeofbitmap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeBitMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader, bitmapbuffer, sizeofbitmap);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    (void)bitmapbuffer;
    (void)sizeofbitmap;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(void* table, void* compareroutine, void* allocateroutine, void* freeroutine, void* tablecontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeGenericTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(table, compareroutine, allocateroutine, freeroutine, tablecontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)table;
    (void)compareroutine;
    (void)allocateroutine;
    (void)freeroutine;
    (void)tablecontext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(void* table, void* compareroutine, void* allocateroutine, void* freeroutine, void* tablecontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(table, compareroutine, allocateroutine, freeroutine, tablecontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)table;
    (void)compareroutine;
    (void)allocateroutine;
    (void)freeroutine;
    (void)tablecontext;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(void* table, void* buffer, uint32_t buffersize, void* newelement) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertElementGenericTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, buffersize, newelement);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)buffersize;
    (void)newelement;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(void* table, void* buffer, uint32_t buffersize, void* newelement) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertElementGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, buffersize, newelement);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)buffersize;
    (void)newelement;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(void* table, void* buffer, uint32_t buffersize, void* newelement, void* nodeorparent, int32_t searchresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertElementGenericTableFull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, buffersize, newelement, nodeorparent, searchresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)buffersize;
    (void)newelement;
    (void)nodeorparent;
    (void)searchresult;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(void* table, void* buffer, uint32_t buffersize, void* newelement, void* nodeorparent, int32_t searchresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertElementGenericTableFullAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, buffersize, newelement, nodeorparent, searchresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)buffersize;
    (void)newelement;
    (void)nodeorparent;
    (void)searchresult;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(void* hashtable, void* entry, uint64_t signature, void* context) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, entry, signature, context);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)entry;
    (void)signature;
    (void)context;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(uint64_t value, uint32_t base, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInt64ToUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, base, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    (void)base;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(uint32_t value, uint32_t base, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIntegerToUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, base, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    (void)base;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(void* descriptor, void* alignment, void* minimumaddress, void* maximumaddress) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIoDecodeMemIoResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptor, alignment, minimumaddress, maximumaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)descriptor;
    (void)alignment;
    (void)minimumaddress;
    (void)maximumaddress;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(void* descriptor, uint8_t type, uint64_t length, uint64_t alignment, uint64_t minimumaddress, uint64_t maximumaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint64_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIoEncodeMemIoResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptor, type, length, alignment, minimumaddress, maximumaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)descriptor;
    (void)type;
    (void)length;
    (void)alignment;
    (void)minimumaddress;
    (void)maximumaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(void* apisetname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsApiSetImplemented");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(apisetname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)apisetname;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(void* table) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsGenericTableEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table);
    }
    errno = ENOSYS;
    return false;
#else
    (void)table;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(void* table) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsGenericTableEmptyAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table);
    }
    errno = ENOSYS;
    return false;
#else
    (void)table;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsMultiSessionSku");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsMultiUsersInSessionSku");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(uint32_t version) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNtDdiVersionAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version);
    }
    errno = ENOSYS;
    return false;
#else
    (void)version;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(uint32_t version) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsServicePackVersionInstalled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version);
    }
    errno = ENOSYS;
    return false;
#else
    (void)version;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsStateSeparationEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(void* handle, void* object, void* untrustedobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsUntrustedObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, object, untrustedobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)object;
    (void)untrustedobject;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(void* table, void* buffer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupElementGenericTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(void* table, void* buffer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupElementGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(void* table, void* buffer, void* nodeorparent, void* searchresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupElementGenericTableFull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, nodeorparent, searchresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)nodeorparent;
    (void)searchresult;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(void* table, void* buffer, void* nodeorparent, void* searchresult) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupElementGenericTableFullAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, nodeorparent, searchresult);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)nodeorparent;
    (void)searchresult;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(void* hashtable, uint64_t signature, void* context) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, signature, context);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hashtable;
    (void)signature;
    (void)context;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(void* table, void* buffer, void* restartkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupFirstMatchingElementGenericTableAvl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(table, buffer, restartkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)table;
    (void)buffer;
    (void)restartkey;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(void* accessmask, void* genericmapping) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMapGenericMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(accessmask, genericmapping);
        return;
    }
    errno = ENOSYS;
#else
    (void)accessmask;
    (void)genericmapping;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(void* securitydescriptor, uint32_t securitydescriptorlength, void* newsecuritydescriptor, void* newsecuritydescriptorlength, bool checkonly) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, securitydescriptorlength, newsecuritydescriptor, newsecuritydescriptorlength, checkonly);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)securitydescriptorlength;
    (void)newsecuritydescriptor;
    (void)newsecuritydescriptorlength;
    (void)checkonly;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberGenericTableElements");
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

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(void* table) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberGenericTableElementsAvl");
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

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(void* bitmapheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberOfClearBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(void* bitmapheader, uint32_t startingindex, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberOfClearBitsInRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, startingindex, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)startingindex;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(void* bitmapheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberOfSetBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(void* bitmapheader, uint32_t startingindex, uint32_t length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberOfSetBitsInRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, startingindex, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bitmapheader;
    (void)startingindex;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(uint64_t target) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNumberOfSetBitsUlongPtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)target;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(void* source, uint64_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPrefetchMemoryNonTemporal");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(source, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)source;
    (void)length;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPrefixUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(void* primaryhandle, void* fallbackhandle, void* valuename, uint32_t valuelength, void* valuetype, void* valuedata, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryRegistryValueWithFallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(primaryhandle, fallbackhandle, valuename, valuelength, valuetype, valuedata, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)primaryhandle;
    (void)fallbackhandle;
    (void)valuename;
    (void)valuelength;
    (void)valuetype;
    (void)valuedata;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(uint32_t relativeto, void* path, void* querytable, void* context, void* environment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryRegistryValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(relativeto, path, querytable, context, environment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)relativeto;
    (void)path;
    (void)querytable;
    (void)context;
    (void)environment;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(void* componentname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryValidationRunlevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(componentname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)componentname;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(void* links) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRealPredecessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(links);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)links;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(void* links) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRealSuccessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(links);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)links;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(void* hashtable, void* entry, void* context) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRemoveEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, entry, context);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hashtable;
    (void)entry;
    (void)context;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(void* runonce, uint32_t flags, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRunOnceBeginInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runonce, flags, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)runonce;
    (void)flags;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(void* runonce, uint32_t flags, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRunOnceComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runonce, flags, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)runonce;
    (void)flags;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(void* runonce, void* initfn, void* parameter, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRunOnceExecuteOnce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runonce, initfn, parameter, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)runonce;
    (void)initfn;
    (void)parameter;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(void* runonce) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRunOnceInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(runonce);
        return;
    }
    errno = ENOSYS;
#else
    (void)runonce;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlSetAllBits(void* bitmapheader) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetAllBits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlSetBit(void* bitmapheader, uint32_t bitnumber) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetBit");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader, bitnumber);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    (void)bitnumber;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlSetBits(void* bitmapheader, uint32_t startingindex, uint32_t numbertoset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetBits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bitmapheader, startingindex, numbertoset);
        return;
    }
    errno = ENOSYS;
#else
    (void)bitmapheader;
    (void)startingindex;
    (void)numbertoset;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(void* securitydescriptor, bool daclpresent, void* dacl, bool dacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetDaclSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, daclpresent, dacl, dacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)daclpresent;
    (void)dacl;
    (void)dacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(int32_t dataid, void* buffer, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetSystemGlobalData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dataid, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dataid;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlSplay(void* links) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSplay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(links);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)links;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(void* guid, void* guidstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlStringFromGUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, guidstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guid;
    (void)guidstring;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlStronglyEnumerateEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, enumerator);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(void* links) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubtreePredecessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(links);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)links;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(void* links) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubtreeSuccessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(links);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)links;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSuffixUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlTestBit(void* bitmapheader, uint32_t bitnumber) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTestBit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmapheader, bitnumber);
    }
    errno = ENOSYS;
    return false;
#else
    (void)bitmapheader;
    (void)bitnumber;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(void* timefields, void* arg1Time) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeFieldsToTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timefields, arg1Time);
    }
    errno = ENOSYS;
    return false;
#else
    (void)timefields;
    (void)arg1Time;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(void* arg0Time, void* timefields) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeToTimeFields");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(arg0Time, timefields);
        return;
    }
    errno = ENOSYS;
#else
    (void)arg0Time;
    (void)timefields;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUTF8StringToUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(void* unicodestringdestination, uint32_t unicodestringmaxbytecount, void* unicodestringactualbytecount, void* utf8stringsource, uint32_t utf8stringbytecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUTF8ToUnicodeN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unicodestringdestination, unicodestringmaxbytecount, unicodestringactualbytecount, utf8stringsource, utf8stringbytecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unicodestringdestination;
    (void)unicodestringmaxbytecount;
    (void)unicodestringactualbytecount;
    (void)utf8stringsource;
    (void)utf8stringbytecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(void* string, uint32_t base, void* number, void* endpointer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, base, number, endpointer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)base;
    (void)number;
    (void)endpointer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(void* string, uint32_t base, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToInteger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, base, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)base;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToUTF8String");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(void* utf8stringdestination, uint32_t utf8stringmaxbytecount, void* utf8stringactualbytecount, void* unicodestringsource, uint32_t unicodestringbytecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToUTF8N");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(utf8stringdestination, utf8stringmaxbytecount, utf8stringactualbytecount, unicodestringsource, unicodestringbytecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)utf8stringdestination;
    (void)utf8stringmaxbytecount;
    (void)utf8stringactualbytecount;
    (void)unicodestringsource;
    (void)unicodestringbytecount;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(uint16_t sourcecharacter) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcecharacter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcecharacter;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssysWindowsWdkSystemSystemservicesRtlUpperChar(int8_t character) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpperChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(character);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)character;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesRtlUpperString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpperString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(void* securitydescriptorinput, uint32_t securitydescriptorlength, uint32_t requiredinformation) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidRelativeSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptorinput, securitydescriptorlength, requiredinformation);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptorinput;
    (void)securitydescriptorlength;
    (void)requiredinformation;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(void* securitydescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(void* versioninfo, uint32_t typemask, uint64_t conditionmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlVerifyVersionInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(versioninfo, typemask, conditionmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)versioninfo;
    (void)typemask;
    (void)conditionmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(void* volumedeviceobject, void* dosname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlVolumeDeviceToDosName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedeviceobject, dosname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedeviceobject;
    (void)dosname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(void* callers, uint32_t count, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlWalkFrameChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callers, count, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callers;
    (void)count;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(void* hashtable, void* enumerator) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlWeaklyEnumerateEntryHashTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hashtable, enumerator);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hashtable;
    (void)enumerator;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(uint32_t relativeto, void* path, void* valuename, uint32_t valuetype, void* valuedata, uint32_t valuelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlWriteRegistryValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(relativeto, path, valuename, valuetype, valuedata, valuelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)relativeto;
    (void)path;
    (void)valuename;
    (void)valuetype;
    (void)valuedata;
    (void)valuelength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(void* ansistring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxAnsiStringToUnicodeSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ansistring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ansistring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(void* unicodestring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxUnicodeStringToAnsiSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unicodestring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)unicodestring;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesSeAccessCheck(void* securitydescriptor, void* subjectsecuritycontext, bool subjectcontextlocked, uint32_t desiredaccess, uint32_t previouslygrantedaccess, void* privileges, void* genericmapping, int8_t accessmode, void* grantedaccess, void* accessstatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, subjectsecuritycontext, subjectcontextlocked, desiredaccess, previouslygrantedaccess, privileges, genericmapping, accessmode, grantedaccess, accessstatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)subjectcontextlocked;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeAssignSecurity(void* parentdescriptor, void* explicitdescriptor, void* newdescriptor, bool isdirectoryobject, void* subjectcontext, void* genericmapping, int32_t pooltype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, bool, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAssignSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parentdescriptor, explicitdescriptor, newdescriptor, isdirectoryobject, subjectcontext, genericmapping, pooltype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parentdescriptor;
    (void)explicitdescriptor;
    (void)newdescriptor;
    (void)isdirectoryobject;
    (void)subjectcontext;
    (void)genericmapping;
    (void)pooltype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(void* parentdescriptor, void* explicitdescriptor, void* newdescriptor, void* objecttype, bool isdirectoryobject, uint32_t autoinheritflags, void* subjectcontext, void* genericmapping, int32_t pooltype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAssignSecurityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parentdescriptor, explicitdescriptor, newdescriptor, objecttype, isdirectoryobject, autoinheritflags, subjectcontext, genericmapping, pooltype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parentdescriptor;
    (void)explicitdescriptor;
    (void)newdescriptor;
    (void)objecttype;
    (void)isdirectoryobject;
    (void)autoinheritflags;
    (void)subjectcontext;
    (void)genericmapping;
    (void)pooltype;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(void* subjectcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCaptureSubjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(subjectcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(void* objecttype, void* securitydescriptor, void* parentsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeComputeAutoInheritByObjectType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, securitydescriptor, parentsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)parentsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeassignSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(void* cveid, void* additionaldetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeEtwWriteKMCveEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cveid, additionaldetails);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cveid;
    (void)additionaldetails;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(void* subjectcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeLockSubjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(subjectcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(int32_t imagetype, int32_t callbacktype, void* callbackfunction, void* callbackcontext, void* token, void* callbackhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterImageVerificationCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagetype, callbacktype, callbackfunction, callbackcontext, token, callbackhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imagetype;
    (void)callbacktype;
    (void)callbackfunction;
    (void)callbackcontext;
    (void)token;
    (void)callbackhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(void* subjectcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeReleaseSubjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(subjectcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(uint32_t flags, void* sourcename, void* usersid, void* auditparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeReportSecurityEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcename, usersid, auditparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcename;
    (void)usersid;
    (void)auditparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(void* auditparameters, int32_t type, uint32_t arg2Index, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetAuditParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(auditparameters, type, arg2Index, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)auditparameters;
    (void)type;
    (void)arg2Index;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(void* subjectcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnlockSubjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(subjectcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(void* callbackhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterImageVerificationCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackhandle;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(uint32_t length, void* securitydescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeValidSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(length, securitydescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)length;
    (void)securitydescriptor;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmCommitComplete(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmCommitComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmCommitEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmCommitTransaction(void* transaction, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmCommitTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transaction, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transaction;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(void* enlistmenthandle, int8_t previousmode, uint32_t desiredaccess, void* objectattributes, void* resourcemanager, void* transaction, uint32_t createoptions, uint32_t notificationmask, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t, uint32_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmCreateEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, previousmode, desiredaccess, objectattributes, resourcemanager, transaction, createoptions, notificationmask, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)previousmode;
    (void)desiredaccess;
    (void)objectattributes;
    (void)resourcemanager;
    (void)transaction;
    (void)createoptions;
    (void)notificationmask;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(void* enlistment, void* lastreference) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmDereferenceEnlistmentKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, lastreference);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)lastreference;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(void* resourcemanager, void* callbackroutine, void* rmkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmEnableCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanager, callbackroutine, rmkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanager;
    (void)callbackroutine;
    (void)rmkey;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesTmGetTransactionId(void* transaction, void* transactionid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmGetTransactionId");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(transaction, transactionid);
        return;
    }
    errno = ENOSYS;
#else
    (void)transaction;
    (void)transactionid;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(void* transactionmanager, void* logfilename, void* tmid, uint32_t createoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmInitializeTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanager, logfilename, tmid, createoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanager;
    (void)logfilename;
    (void)tmid;
    (void)createoptions;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(void* transaction) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmIsTransactionActive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transaction);
    }
    errno = ENOSYS;
    return false;
#else
    (void)transaction;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmPrePrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmPrePrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmPrepareComplete(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmPrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmPrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmPropagationComplete(void* resourcemanager, uint32_t requestcookie, uint32_t bufferlength, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmPropagationComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanager, requestcookie, bufferlength, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanager;
    (void)requestcookie;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmPropagationFailed(void* resourcemanager, uint32_t requestcookie, int32_t status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmPropagationFailed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanager, requestcookie, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanager;
    (void)requestcookie;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmReadOnlyEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(void* enlistment, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRecoverEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(void* resourcemanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRecoverResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(void* tm, void* targetvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRecoverTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tm, targetvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tm;
    (void)targetvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(void* enlistment, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmReferenceEnlistmentKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(void* logfilename, void* existingtransactionmanagerguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRenameTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, existingtransactionmanagerguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfilename;
    (void)existingtransactionmanagerguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRequestOutcomeEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRollbackComplete(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRollbackComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRollbackEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(void* transaction, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmRollbackTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transaction, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transaction;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(void* enlistment, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TmSinglePhaseReject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistment, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistment;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(void* handle, int64_t targetprocess, void* mdl, uint32_t devicepageprotection, uint32_t attributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VslCreateSecureSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, targetprocess, mdl, devicepageprotection, attributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)targetprocess;
    (void)mdl;
    (void)devicepageprotection;
    (void)attributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(void* globalhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VslDeleteSecureSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(globalhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)globalhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(void* errorsource, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaAddErrorSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorsource, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorsource;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(void* context, void* configuration, uint32_t numberpreallocatederrorreports) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaAddErrorSourceDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, configuration, numberpreallocatederrorreports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)configuration;
    (void)numberpreallocatederrorreports;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(void* context, void* configuration, uint32_t numbufferstopreallocate, uint32_t maxdatalength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaAddErrorSourceDeviceDriverV1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, configuration, numbufferstopreallocate, maxdatalength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)configuration;
    (void)numbufferstopreallocate;
    (void)maxdatalength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(void* errorhandle, uint32_t sectiondatalength, void* bufferset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaAddHwErrorReportSectionDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorhandle, sectiondatalength, bufferset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorhandle;
    (void)sectiondatalength;
    (void)bufferset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(int32_t sourcetype, void* configuration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaConfigureErrorSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcetype, configuration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcetype;
    (void)configuration;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(uint32_t errorsourceid, void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaCreateHwErrorReportDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorsourceid, deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)errorsourceid;
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(uint32_t errorsourceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaErrorSourceGetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorsourceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorsourceid;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaGetNotifyAllOfflinesPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(void* handler, void* context) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaHighIrqlLogSelEventHandlerRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handler, context);
    }
    errno = ENOSYS;
    return false;
#else
    (void)handler;
    (void)context;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaHighIrqlLogSelEventHandlerUnregister");
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

int32_t windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(void* errorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaHwErrorReportAbandonDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(void* bufferset, uint32_t namelength, void* name) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaHwErrorReportSetSectionNameDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferset, namelength, name);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferset;
    (void)namelength;
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(void* errorhandle, int32_t errorseverity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaHwErrorReportSetSeverityDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorhandle, errorseverity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorhandle;
    (void)errorseverity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(void* errorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaHwErrorReportSubmitDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(void* header) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaInitializeRecordHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(header);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)header;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaIsCriticalState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(void* entry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaLogInternalEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(entry);
        return;
    }
    errno = ENOSYS;
#else
    (void)entry;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaRegisterInUsePageOfflineNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(uint32_t errorsourceid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaRemoveErrorSource");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(errorsourceid);
        return;
    }
    errno = ENOSYS;
#else
    (void)errorsourceid;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(uint32_t errorsourceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaRemoveErrorSourceDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorsourceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorsourceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaReportHwError(void* errorpacket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaReportHwError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorpacket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorpacket;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(uint32_t errorsourceid, void* deviceobject, void* errordata, uint32_t errordatalength, void* sectiontypeguid, int32_t errorseverity, void* devicefriendlyname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaReportHwErrorDeviceDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorsourceid, deviceobject, errordata, errordatalength, sectiontypeguid, errorseverity, devicefriendlyname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorsourceid;
    (void)deviceobject;
    (void)errordata;
    (void)errordatalength;
    (void)sectiontypeguid;
    (void)errorseverity;
    (void)devicefriendlyname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(int32_t sourcetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaUnconfigureErrorSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WheaUnregisterInUsePageOfflineNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(int32_t traceinformationclass, void* traceinformation, uint32_t traceinformationlength, void* requiredlength, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WmiQueryTraceInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(traceinformationclass, traceinformation, traceinformationlength, requiredlength, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)traceinformationclass;
    (void)traceinformation;
    (void)traceinformationlength;
    (void)requiredlength;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(void* luid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateLocallyUniqueId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(luid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)luid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwClose(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCommitComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCommitComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCommitEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCommitTransaction(void* transactionhandle, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCommitTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(void* enlistmenthandle, uint32_t desiredaccess, void* resourcemanagerhandle, void* transactionhandle, void* objectattributes, uint32_t createoptions, uint32_t notificationmask, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, desiredaccess, resourcemanagerhandle, transactionhandle, objectattributes, createoptions, notificationmask, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)desiredaccess;
    (void)resourcemanagerhandle;
    (void)transactionhandle;
    (void)objectattributes;
    (void)createoptions;
    (void)notificationmask;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCreateFile(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t createdisposition, uint32_t createoptions, void* eabuffer, uint32_t ealength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(void* resourcemanagerhandle, uint32_t desiredaccess, void* tmhandle, void* resourcemanagerguid, void* objectattributes, uint32_t createoptions, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, desiredaccess, tmhandle, resourcemanagerguid, objectattributes, createoptions, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)desiredaccess;
    (void)tmhandle;
    (void)resourcemanagerguid;
    (void)objectattributes;
    (void)createoptions;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCreateSection(void* sectionhandle, uint32_t desiredaccess, void* objectattributes, void* maximumsize, uint32_t sectionpageprotection, uint32_t allocationattributes, void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCreateTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, void* uow, void* tmhandle, uint32_t createoptions, uint32_t isolationlevel, uint32_t isolationflags, void* timeout, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes, uow, tmhandle, createoptions, isolationlevel, isolationflags, timeout, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)uow;
    (void)tmhandle;
    (void)createoptions;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(void* tmhandle, uint32_t desiredaccess, void* objectattributes, void* logfilename, uint32_t createoptions, uint32_t commitstrength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tmhandle, desiredaccess, objectattributes, logfilename, createoptions, commitstrength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tmhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)logfilename;
    (void)createoptions;
    (void)commitstrength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(void* filehandle, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t iocontrolcode, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeviceIoControlFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, event, apcroutine, apccontext, iostatusblock, iocontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)iocontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwDisplayString(void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDisplayString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(void* rootobjecthandle, int32_t querytype, void* objectcursor, uint32_t objectcursorlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwEnumerateTransactionObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootobjecthandle, querytype, objectcursor, objectcursorlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootobjecthandle;
    (void)querytype;
    (void)objectcursor;
    (void)objectcursorlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(void* resourcemanagerhandle, void* transactionnotification, uint32_t notificationlength, void* timeout, void* returnlength, uint32_t asynchronous, uint64_t asynchronouscontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwGetNotificationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, transactionnotification, notificationlength, timeout, returnlength, asynchronous, asynchronouscontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)transactionnotification;
    (void)notificationlength;
    (void)timeout;
    (void)returnlength;
    (void)asynchronous;
    (void)asynchronouscontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwLoadDriver(void* driverservicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwLoadDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverservicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverservicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwMakeTemporaryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwManagePartition(void* targethandle, void* sourcehandle, int32_t partitioninformationclass, void* partitioninformation, uint32_t partitioninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwManagePartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targethandle, sourcehandle, partitioninformationclass, partitioninformation, partitioninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targethandle;
    (void)sourcehandle;
    (void)partitioninformationclass;
    (void)partitioninformation;
    (void)partitioninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(void* enlistmenthandle, uint32_t desiredaccess, void* rmhandle, void* enlistmentguid, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, desiredaccess, rmhandle, enlistmentguid, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)desiredaccess;
    (void)rmhandle;
    (void)enlistmentguid;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwOpenFile(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, uint32_t shareaccess, uint32_t openoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, shareaccess, openoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)openoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(void* resourcemanagerhandle, uint32_t desiredaccess, void* tmhandle, void* resourcemanagerguid, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, desiredaccess, tmhandle, resourcemanagerguid, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)desiredaccess;
    (void)tmhandle;
    (void)resourcemanagerguid;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(void* linkhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenSymbolicLinkObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(linkhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)linkhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwOpenTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, void* uow, void* tmhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes, uow, tmhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)uow;
    (void)tmhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(void* tmhandle, uint32_t desiredaccess, void* objectattributes, void* logfilename, void* tmidentity, uint32_t openoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tmhandle, desiredaccess, objectattributes, logfilename, tmidentity, openoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tmhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)logfilename;
    (void)tmidentity;
    (void)openoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPowerInformation(int32_t informationlevel, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPowerInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationlevel, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationlevel;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrePrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrePrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPrepareComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPropagationComplete(void* resourcemanagerhandle, uint32_t requestcookie, uint32_t bufferlength, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPropagationComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, requestcookie, bufferlength, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)requestcookie;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwPropagationFailed(void* resourcemanagerhandle, uint32_t requestcookie, int32_t propstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPropagationFailed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, requestcookie, propstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)requestcookie;
    (void)propstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(void* objectattributes, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes, iostatusblock, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(void* enlistmenthandle, int32_t enlistmentinformationclass, void* enlistmentinformation, uint32_t enlistmentinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentinformationclass;
    (void)enlistmentinformation;
    (void)enlistmentinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(void* filehandle, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(void* resourcemanagerhandle, int32_t resourcemanagerinformationclass, void* resourcemanagerinformation, uint32_t resourcemanagerinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)resourcemanagerinformationclass;
    (void)resourcemanagerinformation;
    (void)resourcemanagerinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(void* transactionhandle, int32_t transactioninformationclass, void* transactioninformation, uint32_t transactioninformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)transactioninformationclass;
    (void)transactioninformation;
    (void)transactioninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(void* transactionmanagerhandle, int32_t transactionmanagerinformationclass, void* transactionmanagerinformation, uint32_t transactionmanagerinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)transactionmanagerinformationclass;
    (void)transactionmanagerinformation;
    (void)transactionmanagerinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(void* linkhandle, void* linktarget, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySymbolicLinkObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(linkhandle, linktarget, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)linkhandle;
    (void)linktarget;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwReadFile(void* filehandle, void* event, void* apcroutine, void* apccontext, void* iostatusblock, void* buffer, uint32_t length, void* byteoffset, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwReadFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, event, apcroutine, apccontext, iostatusblock, buffer, length, byteoffset, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)byteoffset;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwReadOnlyEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(void* enlistmenthandle, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRecoverEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(void* resourcemanagerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRecoverResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(void* transactionmanagerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRecoverTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(void* resourcemanager, void* protocolid, uint32_t protocolinformationsize, void* protocolinformation, uint32_t createoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRegisterProtocolAddressInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanager, protocolid, protocolinformationsize, protocolinformation, createoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanager;
    (void)protocolid;
    (void)protocolinformationsize;
    (void)protocolinformation;
    (void)createoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(void* logfilename, void* existingtransactionmanagerguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRenameTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, existingtransactionmanagerguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfilename;
    (void)existingtransactionmanagerguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRollbackComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRollbackComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRollbackEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(void* transactionhandle, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRollbackTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(void* transactionmanagerhandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRollforwardTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(void* enlistmenthandle, int32_t enlistmentinformationclass, void* enlistmentinformation, uint32_t enlistmentinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentinformationclass;
    (void)enlistmentinformation;
    (void)enlistmentinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwSetInformationFile(void* filehandle, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(void* resourcemanagerhandle, int32_t resourcemanagerinformationclass, void* resourcemanagerinformation, uint32_t resourcemanagerinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)resourcemanagerinformationclass;
    (void)resourcemanagerinformation;
    (void)resourcemanagerinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(void* transactionhandle, int32_t transactioninformationclass, void* transactioninformation, uint32_t transactioninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)transactioninformationclass;
    (void)transactioninformation;
    (void)transactioninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(void* tmhandle, int32_t transactionmanagerinformationclass, void* transactionmanagerinformation, uint32_t transactionmanagerinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tmhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tmhandle;
    (void)transactionmanagerinformationclass;
    (void)transactionmanagerinformation;
    (void)transactionmanagerinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSinglePhaseReject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwUnloadDriver(void* driverservicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwUnloadDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverservicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverservicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSystemservicesZwWriteFile(void* filehandle, void* event, void* apcroutine, void* apccontext, void* iostatusblock, void* buffer, uint32_t length, void* byteoffset, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwWriteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, event, apcroutine, apccontext, iostatusblock, buffer, length, byteoffset, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)byteoffset;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesVDbgPrintEx(uint32_t componentid, uint32_t level, void* format, void* arglist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "vDbgPrintEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(componentid, level, format, arglist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)componentid;
    (void)level;
    (void)format;
    (void)arglist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(void* prefix, uint32_t componentid, uint32_t level, void* format, void* arglist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "vDbgPrintExWithPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefix, componentid, level, format, arglist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prefix;
    (void)componentid;
    (void)level;
    (void)format;
    (void)arglist;
    errno = ENOSYS;
    return 0;
#endif
}

