#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_diagnostics_etw_wrapper.h"
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

uint32_t windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId(void* reghandle, void* instinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTraceInstanceId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, instinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reghandle;
    (void)instinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_etw_CveEventWrite(void* cveid, void* additionaldetails) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CveEventWrite");
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

uint32_t windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids(void* guidpropertiesarray, uint32_t propertyarraycount, void* guidcount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateTraceGuids");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guidpropertiesarray, propertyarraycount, guidcount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)guidpropertiesarray;
    (void)propertyarraycount;
    (void)guidcount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx(int32_t tracequeryinfoclass, void* inbuffer, uint32_t inbuffersize, void* outbuffer, uint32_t outbuffersize, void* returnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateTraceGuidsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracequeryinfoclass, inbuffer, inbuffersize, outbuffer, outbuffersize, returnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracequeryinfoclass;
    (void)inbuffer;
    (void)inbuffersize;
    (void)outbuffer;
    (void)outbuffersize;
    (void)returnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventAccessControl(void* guid, uint32_t operation, void* sid, uint32_t rights, bool allowordeny) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventAccessControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, operation, sid, rights, allowordeny);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)guid;
    (void)operation;
    (void)sid;
    (void)rights;
    (void)allowordeny;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery(void* guid, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventAccessQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)guid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove(void* guid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventAccessRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)guid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl(uint32_t controlcode, void* activityid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventActivityIdControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controlcode, activityid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)controlcode;
    (void)activityid;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_system_diagnostics_etw_EventEnabled(int64_t reghandle, void* eventdescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventEnabled");
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

bool windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled(int64_t reghandle, uint8_t level, uint64_t keyword) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventProviderEnabled");
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

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventRegister(void* providerid, void* enablecallback, void* callbackcontext, void* reghandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerid, enablecallback, callbackcontext, reghandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerid;
    (void)enablecallback;
    (void)callbackcontext;
    (void)reghandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventSetInformation(int64_t reghandle, int32_t informationclass, void* eventinformation, uint32_t informationlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventSetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, informationclass, eventinformation, informationlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reghandle;
    (void)informationclass;
    (void)eventinformation;
    (void)informationlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventUnregister(int64_t reghandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reghandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWrite(int64_t reghandle, void* eventdescriptor, uint32_t userdatacount, void* userdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor, userdatacount, userdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)userdatacount;
    (void)userdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWriteEx(int64_t reghandle, void* eventdescriptor, uint64_t filter, uint32_t flags, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWriteEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor, filter, flags, activityid, relatedactivityid, userdatacount, userdata);
    }
    errno = ENOSYS;
    return 0;
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
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWriteString(int64_t reghandle, uint8_t level, uint64_t keyword, void* string) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWriteString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, level, keyword, string);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    (void)string;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer(int64_t reghandle, void* eventdescriptor, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWriteTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount, userdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags(uint64_t tracehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTraceEnableFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel(uint64_t tracehandle) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTraceEnableLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle(void* buffer) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTraceLoggerHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream(void* options, void* buffercompletioncallback, void* buffercompletioncontext) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromBufferStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(options, buffercompletioncallback, buffercompletioncontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)options;
    (void)buffercompletioncallback;
    (void)buffercompletioncontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile(void* logfilename, void* options, void* logfileheader) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, options, logfileheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)logfilename;
    (void)options;
    (void)logfileheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger(void* loggername, void* options, void* logfileheader) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromRealTimeLogger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loggername, options, logfileheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)loggername;
    (void)options;
    (void)logfileheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions(void* loggername, void* options, uint64_t allocationsize, void* memorypartitionhandle, void* logfileheader) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromRealTimeLoggerWithAllocationOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loggername, options, allocationsize, memorypartitionhandle, logfileheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)loggername;
    (void)options;
    (void)allocationsize;
    (void)memorypartitionhandle;
    (void)logfileheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTrace(void* handlearray, uint32_t handlecount, void* starttime, void* endtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handlearray, handlecount, starttime, endtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handlearray;
    (void)handlecount;
    (void)starttime;
    (void)endtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream(uint64_t tracehandle, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTraceAddBufferToBufferStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference(void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTraceBufferDecrementReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference(uint64_t tracehandle, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTraceBufferIncrementReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA(void* propertyarray, uint32_t propertyarraycount, void* loggercount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAllTracesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propertyarray, propertyarraycount, loggercount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propertyarray;
    (void)propertyarraycount;
    (void)loggercount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW(void* propertyarray, uint32_t propertyarraycount, void* loggercount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAllTracesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propertyarray, propertyarraycount, loggercount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propertyarray;
    (void)propertyarraycount;
    (void)loggercount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTraceGuidsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestaddress, requestcontext, controlguid, guidcount, traceguidreg, mofimagepath, mofresourcename, registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestaddress;
    (void)requestcontext;
    (void)controlguid;
    (void)guidcount;
    (void)traceguidreg;
    (void)mofimagepath;
    (void)mofresourcename;
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTraceGuidsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestaddress, requestcontext, controlguid, guidcount, traceguidreg, mofimagepath, mofresourcename, registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestaddress;
    (void)requestcontext;
    (void)controlguid;
    (void)guidcount;
    (void)traceguidreg;
    (void)mofimagepath;
    (void)mofresourcename;
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback(void* pguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveTraceCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback(void* pguid, void* eventcallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTraceCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid, eventcallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pguid;
    (void)eventcallback;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_StartTraceA(void* tracehandle, void* instancename, void* properties) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartTraceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle, instancename, properties);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    (void)instancename;
    (void)properties;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_StartTraceW(void* tracehandle, void* instancename, void* properties) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartTraceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle, instancename, properties);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    (void)instancename;
    (void)properties;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters(uint32_t payloadfiltercount, void* payloadfilterptrs, void* eventmatchallflags, void* eventfilterdescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhAggregatePayloadFilters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(payloadfiltercount, payloadfilterptrs, eventmatchallflags, eventfilterdescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)payloadfiltercount;
    (void)payloadfilterptrs;
    (void)eventmatchallflags;
    (void)eventfilterdescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor(void* eventfilterdescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhCleanupPayloadEventFilterDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventfilterdescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)eventfilterdescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle(int64_t handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhCloseDecodingHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter(void* providerguid, void* eventdescriptor, bool eventmatchany, uint32_t payloadpredicatecount, void* payloadpredicates, void* payloadfilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhCreatePayloadFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerguid, eventdescriptor, eventmatchany, payloadpredicatecount, payloadpredicates, payloadfilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerguid;
    (void)eventdescriptor;
    (void)eventmatchany;
    (void)payloadpredicatecount;
    (void)payloadpredicates;
    (void)payloadfilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter(void* payloadfilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhDeletePayloadFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(payloadfilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)payloadfilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents(void* providerguid, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateManifestProviderEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation(void* pguid, int32_t eventfieldtype, void* pbuffer, void* pbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProviderFieldInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid, eventfieldtype, pbuffer, pbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pguid;
    (void)eventfieldtype;
    (void)pbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters(void* guid, uint32_t tdhcontextcount, void* tdhcontext, void* filtercount, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProviderFilters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, tdhcontextcount, tdhcontext, filtercount, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)guid;
    (void)tdhcontextcount;
    (void)tdhcontext;
    (void)filtercount;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders(void* pbuffer, void* pbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer, pbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource(int32_t filter, void* buffer, uint32_t buffersize, void* bufferrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProvidersForDecodingSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, buffer, buffersize, bufferrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filter;
    (void)buffer;
    (void)buffersize;
    (void)bufferrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty(void* eventinfo, void* mapinfo, uint32_t pointersize, uint16_t propertyintype, uint16_t propertyouttype, uint16_t propertylength, uint16_t userdatalength, void* userdata, void* buffersize, void* buffer, void* userdataconsumed) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint16_t, uint16_t, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhFormatProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventinfo, mapinfo, pointersize, propertyintype, propertyouttype, propertylength, userdatalength, userdata, buffersize, buffer, userdataconsumed);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)eventinfo;
    (void)mapinfo;
    (void)pointersize;
    (void)propertyintype;
    (void)propertyouttype;
    (void)propertylength;
    (void)userdatalength;
    (void)userdata;
    (void)buffersize;
    (void)buffer;
    (void)userdataconsumed;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter(int64_t handle, void* tdhcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetDecodingParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, tdhcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)tdhcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation(void* event, uint32_t tdhcontextcount, void* tdhcontext, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetEventInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event, tdhcontextcount, tdhcontext, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)event;
    (void)tdhcontextcount;
    (void)tdhcontext;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation(void* pevent, void* pmapname, void* pbuffer, void* pbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetEventMapInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pevent, pmapname, pbuffer, pbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pevent;
    (void)pmapname;
    (void)pbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation(void* providerguid, void* eventdescriptor, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetManifestEventInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerguid, eventdescriptor, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)providerguid;
    (void)eventdescriptor;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, uint32_t buffersize, void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pevent, tdhcontextcount, ptdhcontext, propertydatacount, ppropertydata, buffersize, pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pevent;
    (void)tdhcontextcount;
    (void)ptdhcontext;
    (void)propertydatacount;
    (void)ppropertydata;
    (void)buffersize;
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, void* ppropertysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetPropertySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pevent, tdhcontextcount, ptdhcontext, propertydatacount, ppropertydata, ppropertysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pevent;
    (void)tdhcontextcount;
    (void)ptdhcontext;
    (void)propertydatacount;
    (void)ppropertydata;
    (void)ppropertysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage(int64_t handle, void* eventrecord, void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetWppMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, eventrecord, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)eventrecord;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty(int64_t handle, void* eventrecord, void* propertyname, void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetWppProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, eventrecord, propertyname, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)eventrecord;
    (void)propertyname;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest(void* manifest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhLoadManifest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(manifest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)manifest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary(void* binarypath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhLoadManifestFromBinary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binarypath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)binarypath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory(void* pdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhLoadManifestFromMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle(void* handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhOpenDecodingHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation(void* pguid, uint64_t eventfieldvalue, int32_t eventfieldtype, void* pbuffer, void* pbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhQueryProviderFieldInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid, eventfieldvalue, eventfieldtype, pbuffer, pbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pguid;
    (void)eventfieldvalue;
    (void)eventfieldtype;
    (void)pbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter(int64_t handle, void* tdhcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhSetDecodingParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, tdhcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)tdhcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest(void* manifest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhUnloadManifest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(manifest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)manifest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory(void* pdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhUnloadManifestFromMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TraceEvent(uint64_t tracehandle, void* eventtrace) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle, eventtrace);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    (void)eventtrace;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance(uint64_t tracehandle, void* eventtrace, void* instinfo, void* parentinstinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceEventInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tracehandle, eventtrace, instinfo, parentinstinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)tracehandle;
    (void)eventtrace;
    (void)instinfo;
    (void)parentinstinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa(uint64_t loggerhandle, uint32_t messageflags, void* messageguid, uint16_t messagenumber, void* messagearglist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceMessageVa");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loggerhandle, messageflags, messageguid, messagenumber, messagearglist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)loggerhandle;
    (void)messageflags;
    (void)messageguid;
    (void)messagenumber;
    (void)messagearglist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids(uint64_t registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterTraceGuids");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

