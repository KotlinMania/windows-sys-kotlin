#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_eventlog_wrapper.h"
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

int32_t windowssys_windows_win32_system_eventlog_BackupEventLogA(void* heventlog, void* lpbackupfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupEventLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, lpbackupfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_BackupEventLogW(void* heventlog, void* lpbackupfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupEventLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, lpbackupfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_ClearEventLogA(void* heventlog, void* lpbackupfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearEventLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, lpbackupfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_ClearEventLogW(void* heventlog, void* lpbackupfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearEventLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, lpbackupfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_CloseEventLog(void* heventlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEventLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_DeregisterEventSource(void* heventlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterEventSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog(int64_t session, void* logfilepath, uint32_t locale, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtArchiveExportedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, logfilepath, locale, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)logfilepath;
    (void)locale;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtCancel(int64_t object) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtCancel");
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

int32_t windowssys_windows_win32_system_eventlog_EvtClearLog(int64_t session, void* channelpath, void* targetfilepath, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtClearLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, channelpath, targetfilepath, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)channelpath;
    (void)targetfilepath;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtClose(int64_t object) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtClose");
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

int64_t windowssys_windows_win32_system_eventlog_EvtCreateBookmark(void* bookmarkxml) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtCreateBookmark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bookmarkxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bookmarkxml;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtCreateRenderContext(uint32_t valuepathscount, void* valuepaths, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtCreateRenderContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(valuepathscount, valuepaths, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)valuepathscount;
    (void)valuepaths;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtExportLog(int64_t session, void* path, void* query, void* targetfilepath, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtExportLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, path, query, targetfilepath, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)path;
    (void)query;
    (void)targetfilepath;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtFormatMessage(int64_t publishermetadata, int64_t event, uint32_t messageid, uint32_t valuecount, void* values, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtFormatMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(publishermetadata, event, messageid, valuecount, values, flags, buffersize, buffer, bufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)publishermetadata;
    (void)event;
    (void)messageid;
    (void)valuecount;
    (void)values;
    (void)flags;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetChannelConfigProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channelconfig, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channelconfig;
    (void)propertyid;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetEventInfo(int64_t event, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetEventInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)event;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty(int64_t eventmetadata, int32_t propertyid, uint32_t flags, uint32_t eventmetadatapropertybuffersize, void* eventmetadatapropertybuffer, void* eventmetadatapropertybufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetEventMetadataProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventmetadata, propertyid, flags, eventmetadatapropertybuffersize, eventmetadatapropertybuffer, eventmetadatapropertybufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventmetadata;
    (void)propertyid;
    (void)flags;
    (void)eventmetadatapropertybuffersize;
    (void)eventmetadatapropertybuffer;
    (void)eventmetadatapropertybufferused;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus(uint32_t buffersize, void* buffer, void* bufferused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetExtendedStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, buffer, bufferused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetLogInfo(int64_t arg_0_log, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetLogInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_log, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_log;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty(int64_t objectarray, uint32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetObjectArrayProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize(int64_t objectarray, void* objectarraysize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetObjectArraySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectarray, objectarraysize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectarray;
    (void)objectarraysize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty(int64_t publishermetadata, int32_t propertyid, uint32_t flags, uint32_t publishermetadatapropertybuffersize, void* publishermetadatapropertybuffer, void* publishermetadatapropertybufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetPublisherMetadataProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(publishermetadata, propertyid, flags, publishermetadatapropertybuffersize, publishermetadatapropertybuffer, publishermetadatapropertybufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)publishermetadata;
    (void)propertyid;
    (void)flags;
    (void)publishermetadatapropertybuffersize;
    (void)publishermetadatapropertybuffer;
    (void)publishermetadatapropertybufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtGetQueryInfo(int64_t queryorsubscription, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetQueryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queryorsubscription, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queryorsubscription;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtNext(int64_t resultset, uint32_t eventssize, void* events, uint32_t timeout, uint32_t flags, void* returned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resultset, eventssize, events, timeout, flags, returned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resultset;
    (void)eventssize;
    (void)events;
    (void)timeout;
    (void)flags;
    (void)returned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtNextChannelPath(int64_t channelenum, uint32_t channelpathbuffersize, void* channelpathbuffer, void* channelpathbufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNextChannelPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channelenum, channelpathbuffersize, channelpathbuffer, channelpathbufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channelenum;
    (void)channelpathbuffersize;
    (void)channelpathbuffer;
    (void)channelpathbufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtNextEventMetadata(int64_t eventmetadataenum, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNextEventMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventmetadataenum, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventmetadataenum;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtNextPublisherId(int64_t publisherenum, uint32_t publisheridbuffersize, void* publisheridbuffer, void* publisheridbufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNextPublisherId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(publisherenum, publisheridbuffersize, publisheridbuffer, publisheridbufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)publisherenum;
    (void)publisheridbuffersize;
    (void)publisheridbuffer;
    (void)publisheridbufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig(int64_t session, void* channelpath, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenChannelConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, channelpath, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)channelpath;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum(int64_t session, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenChannelEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum(int64_t publishermetadata, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenEventMetadataEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(publishermetadata, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)publishermetadata;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenLog(int64_t session, void* path, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, path, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)path;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum(int64_t session, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenPublisherEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata(int64_t session, void* publisherid, void* logfilepath, uint32_t locale, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenPublisherMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, publisherid, logfilepath, locale, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)publisherid;
    (void)logfilepath;
    (void)locale;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtOpenSession(int32_t loginclass, void* login, uint32_t timeout, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loginclass, login, timeout, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loginclass;
    (void)login;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtQuery(int64_t session, void* path, void* query, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, path, query, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)path;
    (void)query;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtRender(int64_t context, int64_t fragment, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused, void* propertycount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtRender");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fragment, flags, buffersize, buffer, bufferused, propertycount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fragment;
    (void)flags;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    (void)propertycount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig(int64_t channelconfig, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSaveChannelConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channelconfig, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channelconfig;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtSeek(int64_t resultset, int64_t position, int64_t bookmark, uint32_t timeout, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSeek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resultset, position, bookmark, timeout, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resultset;
    (void)position;
    (void)bookmark;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, void* propertyvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSetChannelConfigProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channelconfig, propertyid, flags, propertyvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channelconfig;
    (void)propertyid;
    (void)flags;
    (void)propertyvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_eventlog_EvtSubscribe(int64_t session, void* signalevent, void* channelpath, void* query, int64_t bookmark, void* context, void* callback, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSubscribe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, signalevent, channelpath, query, bookmark, context, callback, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)session;
    (void)signalevent;
    (void)channelpath;
    (void)query;
    (void)bookmark;
    (void)context;
    (void)callback;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_EvtUpdateBookmark(int64_t bookmark, int64_t event) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtUpdateBookmark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bookmark, event);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bookmark;
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_GetEventLogInformation(void* heventlog, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEventLogInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, dwinfolevel, lpbuffer, cbbufsize, pcbbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords(void* heventlog, void* numberofrecords) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfEventLogRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, numberofrecords);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)numberofrecords;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord(void* heventlog, void* oldestrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOldestEventLogRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, oldestrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)oldestrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_NotifyChangeEventLog(void* heventlog, void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyChangeEventLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_eventlog_OpenBackupEventLogA(void* lpuncservername, void* lpfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenBackupEventLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuncservername, lpfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpuncservername;
    (void)lpfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_eventlog_OpenBackupEventLogW(void* lpuncservername, void* lpfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenBackupEventLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuncservername, lpfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpuncservername;
    (void)lpfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_eventlog_OpenEventLogA(void* lpuncservername, void* lpsourcename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuncservername, lpsourcename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_eventlog_OpenEventLogW(void* lpuncservername, void* lpsourcename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuncservername, lpsourcename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_ReadEventLogA(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadEventLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, dwreadflags, dwrecordoffset, lpbuffer, nnumberofbytestoread, pnbytesread, pnminnumberofbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)dwreadflags;
    (void)dwrecordoffset;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)pnbytesread;
    (void)pnminnumberofbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_ReadEventLogW(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadEventLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, dwreadflags, dwrecordoffset, lpbuffer, nnumberofbytestoread, pnbytesread, pnminnumberofbytesneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)dwreadflags;
    (void)dwrecordoffset;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)pnbytesread;
    (void)pnminnumberofbytesneeded;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_eventlog_RegisterEventSourceA(void* lpuncservername, void* lpsourcename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterEventSourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuncservername, lpsourcename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_eventlog_RegisterEventSourceW(void* lpuncservername, void* lpsourcename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterEventSourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuncservername, lpsourcename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_ReportEventA(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportEventA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, wtype, wcategory, dweventid, lpusersid, wnumstrings, dwdatasize, lpstrings, lprawdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)wtype;
    (void)wcategory;
    (void)dweventid;
    (void)lpusersid;
    (void)wnumstrings;
    (void)dwdatasize;
    (void)lpstrings;
    (void)lprawdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventlog_ReportEventW(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportEventW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heventlog, wtype, wcategory, dweventid, lpusersid, wnumstrings, dwdatasize, lpstrings, lprawdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heventlog;
    (void)wtype;
    (void)wcategory;
    (void)dweventid;
    (void)lpusersid;
    (void)wnumstrings;
    (void)dwdatasize;
    (void)lpstrings;
    (void)lprawdata;
    errno = ENOSYS;
    return -1;
#endif
}

