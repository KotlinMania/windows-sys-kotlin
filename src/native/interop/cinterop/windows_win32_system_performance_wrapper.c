#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_performance_wrapper.h"
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

uint32_t windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(void* szfilename, void* szcommentstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupPerfRegistryToFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, szcommentstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilename;
    (void)szcommentstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceInstallPerfDllA(void* szcomputername, void* lpinifile, uint64_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPerfDllA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomputername, lpinifile, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomputername;
    (void)lpinifile;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceInstallPerfDllW(void* szcomputername, void* lpinifile, uint64_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPerfDllW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomputername, lpinifile, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomputername;
    (void)lpinifile;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPerfCounterTextStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcommandline, bquietmodearg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPerfCounterTextStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcommandline, bquietmodearg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhAddCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddCounterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, szfullcounterpath, dwuserdata, phcounter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhAddCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddCounterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, szfullcounterpath, dwuserdata, phcounter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddEnglishCounterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, szfullcounterpath, dwuserdata, phcounter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddEnglishCounterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, szfullcounterpath, dwuserdata, phcounter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(void* phdatasource, void* logfilenamelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBindInputDataSourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phdatasource, logfilenamelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phdatasource;
    (void)logfilenamelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(void* phdatasource, void* logfilenamelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBindInputDataSourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phdatasource, logfilenamelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phdatasource;
    (void)logfilenamelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(void* pbrowsedlgdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbrowsedlgdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(void* pbrowsedlgdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbrowsedlgdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(void* pbrowsedlgdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbrowsedlgdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(void* pbrowsedlgdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbrowsedlgdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(void* hcounter, uint32_t dwformat, void* rawvalue1, void* rawvalue2, void* fmtvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCalculateCounterFromRawValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, dwformat, rawvalue1, rawvalue2, fmtvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)rawvalue1;
    (void)rawvalue2;
    (void)fmtvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCloseLog(void* hlog, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCloseLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCloseQuery(void* hquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCloseQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCollectQueryData(void* hquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(void* hquery, uint32_t dwintervaltime, void* hnewdataevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, dwintervaltime, hnewdataevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)dwintervaltime;
    (void)hnewdataevent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(void* hquery, void* plltimestamp) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryDataWithTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, plltimestamp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)plltimestamp;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(void* hcounter, uint32_t dwformat, uint32_t dwfirstentry, uint32_t dwnumentries, void* lprawvaluearray, void* data) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhComputeCounterStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, dwformat, dwfirstentry, dwnumentries, lprawvaluearray, data);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)dwfirstentry;
    (void)dwnumentries;
    (void)lprawvaluearray;
    (void)data;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhConnectMachineA(void* szmachinename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhConnectMachineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachinename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachinename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhConnectMachineW(void* szmachinename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhConnectMachineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachinename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachinename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(void* szdatasource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCreateSQLTablesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(void* szdatasource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCreateSQLTablesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumLogSetNamesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, mszdatasetnamelist, pcchbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)mszdatasetnamelist;
    (void)pcchbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumLogSetNamesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, mszdatasetnamelist, pcchbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)mszdatasetnamelist;
    (void)pcchbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(void* szdatasource, void* mszmachinelist, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, mszmachinelist, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(void* hdatasource, void* mszmachinelist, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, mszmachinelist, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(void* hdatasource, void* mszmachinelist, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, mszmachinelist, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(void* szdatasource, void* mszmachinelist, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, mszmachinelist, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel, brefresh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel, brefresh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel, brefresh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel, brefresh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandCounterPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szwildcardpath, mszexpandedpathlist, pcchpathlistlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandCounterPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szwildcardpath, mszexpandedpathlist, pcchpathlistlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(uint32_t dwcountertype, uint32_t dwformat, void* ptimebase, void* prawvalue1, void* prawvalue2, void* pfmtvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhFormatFromRawValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcountertype, dwformat, ptimebase, prawvalue1, prawvalue2, pfmtvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwcountertype;
    (void)dwformat;
    (void)ptimebase;
    (void)prawvalue1;
    (void)prawvalue2;
    (void)pfmtvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, bretrieveexplaintext, pdwbuffersize, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)bretrieveexplaintext;
    (void)pdwbuffersize;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, bretrieveexplaintext, pdwbuffersize, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)bretrieveexplaintext;
    (void)pdwbuffersize;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(void* hcounter, void* ptimebase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterTimeBase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, ptimebase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)ptimebase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, pdwnumentries, pinfo, pdwbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(void* hdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeH");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, pdwnumentries, pinfo, pdwbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, pdwnumentries, pinfo, pdwbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, szdefaultobjectname, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectHA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, szdefaultobjectname, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectHW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szmachinename, szdefaultobjectname, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, szmachinename, szdefaultobjectname, pcchbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetDllVersion(void* lpdwversion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDllVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwversion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpdwversion;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterArrayA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, dwformat, lpdwbuffersize, lpdwitemcount, itembuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterArrayW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, dwformat, lpdwbuffersize, lpdwitemcount, itembuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(void* hcounter, uint32_t dwformat, void* lpdwtype, void* pvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, dwformat, lpdwtype, pvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwtype;
    (void)pvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(void* hlog, void* llsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetLogFileSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, llsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    (void)llsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(void* hlog, void* pguid, void* prunid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetLogSetGUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pguid, prunid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    (void)pguid;
    (void)prunid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterArrayA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, lpdwbuffersize, lpdwitemcount, itembuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterArrayW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, lpdwbuffersize, lpdwitemcount, itembuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(void* hcounter, void* lpdwtype, void* pvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, lpdwtype, pvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)lpdwtype;
    (void)pvalue;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(void* hquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhIsRealTimeQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hquery;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(void* szmachinename, void* sznamebuffer, void* pdwindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfIndexByNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachinename, sznamebuffer, pdwindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachinename;
    (void)sznamebuffer;
    (void)pdwindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(void* szmachinename, void* sznamebuffer, void* pdwindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfIndexByNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachinename, sznamebuffer, pdwindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachinename;
    (void)sznamebuffer;
    (void)pdwindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfNameByIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachinename, dwnameindex, sznamebuffer, pcchnamebuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachinename;
    (void)dwnameindex;
    (void)sznamebuffer;
    (void)pcchnamebuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfNameByIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachinename, dwnameindex, sznamebuffer, pcchnamebuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachinename;
    (void)dwnameindex;
    (void)sznamebuffer;
    (void)pcchnamebuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhMakeCounterPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcounterpathelements, szfullpathbuffer, pcchbuffersize, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcounterpathelements;
    (void)szfullpathbuffer;
    (void)pcchbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhMakeCounterPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcounterpathelements, szfullpathbuffer, pcchbuffersize, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcounterpathelements;
    (void)szfullpathbuffer;
    (void)pcchbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhOpenLogA(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szlogfilename, dwaccessflags, lpdwlogtype, hquery, dwmaxsize, szusercaption, phlog);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szlogfilename;
    (void)dwaccessflags;
    (void)lpdwlogtype;
    (void)hquery;
    (void)dwmaxsize;
    (void)szusercaption;
    (void)phlog;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhOpenLogW(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szlogfilename, dwaccessflags, lpdwlogtype, hquery, dwmaxsize, szusercaption, phlog);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szlogfilename;
    (void)dwaccessflags;
    (void)lpdwlogtype;
    (void)hquery;
    (void)dwmaxsize;
    (void)szusercaption;
    (void)phlog;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhOpenQueryA(void* szdatasource, uint64_t dwuserdata, void* phquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, dwuserdata, phquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)dwuserdata;
    (void)phquery;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhOpenQueryH(void* hdatasource, uint64_t dwuserdata, void* phquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryH");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, dwuserdata, phquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)dwuserdata;
    (void)phquery;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhOpenQueryW(void* szdatasource, uint64_t dwuserdata, void* phquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource, dwuserdata, phquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    (void)dwuserdata;
    (void)phquery;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseCounterPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfullpathbuffer, pcounterpathelements, pdwbuffersize, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfullpathbuffer;
    (void)pcounterpathelements;
    (void)pdwbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseCounterPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfullpathbuffer, pcounterpathelements, pdwbuffersize, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfullpathbuffer;
    (void)pcounterpathelements;
    (void)pdwbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseInstanceNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szinstancestring, szinstancename, pcchinstancenamelength, szparentname, pcchparentnamelength, lpindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szinstancestring;
    (void)szinstancename;
    (void)pcchinstancenamelength;
    (void)szparentname;
    (void)pcchparentnamelength;
    (void)lpindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseInstanceNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szinstancestring, szinstancename, pcchinstancenamelength, szparentname, pcchparentnamelength, lpindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szinstancestring;
    (void)szinstancename;
    (void)pcchinstancenamelength;
    (void)szparentname;
    (void)pcchparentnamelength;
    (void)lpindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhRemoveCounter(void* hcounter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhRemoveCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSelectDataSourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, dwflags, szdatasource, pcchbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)dwflags;
    (void)szdatasource;
    (void)pcchbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSelectDataSourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, dwflags, szdatasource, pcchbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndowner;
    (void)dwflags;
    (void)szdatasource;
    (void)pcchbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(void* hcounter, int32_t lfactor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetCounterScaleFactor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcounter, lfactor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcounter;
    (void)lfactor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(uint32_t dwdatasourceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetDefaultRealTimeDataSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdatasourceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwdatasourceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(void* hlog, int32_t runid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetLogSetRunID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, runid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    (void)runid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(void* hquery, void* pinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetQueryTimeRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, pinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)pinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhUpdateLogA(void* hlog, void* szuserstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, szuserstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    (void)szuserstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(void* hlog) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogFileCatalog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhUpdateLogW(void* hlog, void* szuserstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, szuserstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hlog;
    (void)szuserstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathA(void* szfullpathbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfullpathbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfullpathbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathExA(void* hdatasource, void* szfullpathbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szfullpathbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szfullpathbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathExW(void* hdatasource, void* szfullpathbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatasource, szfullpathbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatasource;
    (void)szfullpathbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathW(void* szfullpathbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfullpathbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfullpathbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(void* szdatasource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhVerifySQLDBA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(void* szdatasource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhVerifySQLDBW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatasource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatasource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfAddCounters(void* hquery, void* pcounters, uint32_t cbcounters) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfAddCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, pcounters, cbcounters);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(void* hquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfCloseQueryHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemPerformancePerfCreateInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfCreateInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerhandle, countersetguid, name, id);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)providerhandle;
    (void)countersetguid;
    (void)name;
    (void)id;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDecrementULongCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDecrementULongLongCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfDeleteCounters(void* hquery, void* pcounters, uint32_t cbcounters) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDeleteCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, pcounters, cbcounters);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfDeleteInstance(void* provider, void* instanceblock) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDeleteInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instanceblock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instanceblock;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(void* szmachine, void* pcountersetids, uint32_t ccountersetids, void* pccountersetidsactual) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfEnumerateCounterSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachine, pcountersetids, ccountersetids, pccountersetidsactual);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachine;
    (void)pcountersetids;
    (void)ccountersetids;
    (void)pccountersetidsactual;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(void* szmachine, void* pcountersetid, void* pinstances, uint32_t cbinstances, void* pcbinstancesactual) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfEnumerateCounterSetInstances");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachine, pcountersetid, pinstances, cbinstances, pcbinstancesactual);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachine;
    (void)pcountersetid;
    (void)pinstances;
    (void)cbinstances;
    (void)pcbinstancesactual;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfIncrementULongCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfIncrementULongLongCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(void* szmachine, void* phquery) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfOpenQueryHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachine, phquery);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachine;
    (void)phquery;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfQueryCounterData(void* hquery, void* pcounterblock, uint32_t cbcounterblock, void* pcbcounterblockactual) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, pcounterblock, cbcounterblock, pcbcounterblockactual);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)pcounterblock;
    (void)cbcounterblock;
    (void)pcbcounterblockactual;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(void* hquery, void* pcounters, uint32_t cbcounters, void* pcbcountersactual) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery, pcounters, cbcounters, pcbcountersactual);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    (void)pcbcountersactual;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(void* szmachine, void* pcountersetid, int32_t requestcode, uint32_t requestlangid, void* pbreginfo, uint32_t cbreginfo, void* pcbreginfoactual) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterSetRegistrationInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szmachine, pcountersetid, requestcode, requestlangid, pbreginfo, cbreginfo, pcbreginfoactual);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szmachine;
    (void)pcountersetid;
    (void)requestcode;
    (void)requestlangid;
    (void)pbreginfo;
    (void)cbreginfo;
    (void)pcbreginfoactual;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemPerformancePerfQueryInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerhandle, countersetguid, name, id);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)providerhandle;
    (void)countersetguid;
    (void)name;
    (void)id;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(void* provider, void* instance, uint32_t counterid, void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetCounterRefValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(void* providerhandle, void* arg1Template, uint32_t templatesize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetCounterSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerhandle, arg1Template, templatesize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerhandle;
    (void)arg1Template;
    (void)templatesize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetULongCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetULongLongCounterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, instance, counterid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfStartProvider(void* providerguid, void* controlcallback, void* phprovider) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStartProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerguid, controlcallback, phprovider);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerguid;
    (void)controlcallback;
    (void)phprovider;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfStartProviderEx(void* providerguid, void* providercontext, void* provider) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStartProviderEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerguid, providercontext, provider);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerguid;
    (void)providercontext;
    (void)provider;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformancePerfStopProvider(void* providerhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStopProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(void* lpperformancecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPerformanceCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpperformancecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpperformancecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(void* lpfrequency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPerformanceFrequency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfrequency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfrequency;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(void* szfilename, void* szlangid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestorePerfRegistryFromFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, szlangid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilename;
    (void)szlangid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(void* szreserved, void* szservicename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceAsTrustedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szreserved, szservicename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szreserved;
    (void)szservicename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(void* szreserved, void* szservicename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceAsTrustedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szreserved, szservicename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szreserved;
    (void)szservicename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadPerfCounterTextStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcommandline, bquietmodearg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadPerfCounterTextStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcommandline, bquietmodearg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePerfNameFilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sznewctrfilepath, sznewhlpfilepath, szlanguageid, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sznewctrfilepath;
    (void)sznewhlpfilepath;
    (void)szlanguageid;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePerfNameFilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sznewctrfilepath, sznewhlpfilepath, szlanguageid, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sznewctrfilepath;
    (void)sznewhlpfilepath;
    (void)szlanguageid;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

