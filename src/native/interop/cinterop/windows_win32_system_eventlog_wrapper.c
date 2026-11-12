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

int32_t windowssysWindowsWin32SystemEventlogBackupEventLogA(void* heventlog, void* lpbackupfilename) {
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

int32_t windowssysWindowsWin32SystemEventlogBackupEventLogW(void* heventlog, void* lpbackupfilename) {
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

int32_t windowssysWindowsWin32SystemEventlogClearEventLogA(void* heventlog, void* lpbackupfilename) {
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

int32_t windowssysWindowsWin32SystemEventlogClearEventLogW(void* heventlog, void* lpbackupfilename) {
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

int32_t windowssysWindowsWin32SystemEventlogCloseEventLog(void* heventlog) {
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

int32_t windowssysWindowsWin32SystemEventlogDeregisterEventSource(void* heventlog) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(int64_t session, void* logfilepath, uint32_t locale, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtCancel(int64_t object) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtClearLog(int64_t session, void* channelpath, void* targetfilepath, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtClose(int64_t object) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtCreateBookmark(void* bookmarkxml) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(uint32_t valuepathscount, void* valuepaths, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtExportLog(int64_t session, void* path, void* query, void* targetfilepath, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtFormatMessage(int64_t publishermetadata, int64_t event, uint32_t messageid, uint32_t valuecount, void* values, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetEventInfo(int64_t event, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(int64_t eventmetadata, int32_t propertyid, uint32_t flags, uint32_t eventmetadatapropertybuffersize, void* eventmetadatapropertybuffer, void* eventmetadatapropertybufferused) {
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

uint32_t windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(uint32_t buffersize, void* buffer, void* bufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetLogInfo(int64_t arg0Log, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
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
        return km_fn_ptr(arg0Log, propertyid, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Log;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(int64_t objectarray, uint32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(int64_t objectarray, void* objectarraysize) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(int64_t publishermetadata, int32_t propertyid, uint32_t flags, uint32_t publishermetadatapropertybuffersize, void* publishermetadatapropertybuffer, void* publishermetadatapropertybufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(int64_t queryorsubscription, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtNext(int64_t resultset, uint32_t eventssize, void* events, uint32_t timeout, uint32_t flags, void* returned) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtNextChannelPath(int64_t channelenum, uint32_t channelpathbuffersize, void* channelpathbuffer, void* channelpathbufferused) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(int64_t eventmetadataenum, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtNextPublisherId(int64_t publisherenum, uint32_t publisheridbuffersize, void* publisheridbuffer, void* publisheridbufferused) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(int64_t session, void* channelpath, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(int64_t session, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(int64_t publishermetadata, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenLog(int64_t session, void* path, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(int64_t session, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(int64_t session, void* publisherid, void* logfilepath, uint32_t locale, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtOpenSession(int32_t loginclass, void* login, uint32_t timeout, uint32_t flags) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtQuery(int64_t session, void* path, void* query, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtRender(int64_t context, int64_t fragment, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused, void* propertycount) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(int64_t channelconfig, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtSeek(int64_t resultset, int64_t position, int64_t bookmark, uint32_t timeout, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, void* propertyvalue) {
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

int64_t windowssysWindowsWin32SystemEventlogEvtSubscribe(int64_t session, void* signalevent, void* channelpath, void* query, int64_t bookmark, void* context, void* callback, uint32_t flags) {
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

int32_t windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(int64_t bookmark, int64_t event) {
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

int32_t windowssysWindowsWin32SystemEventlogGetEventLogInformation(void* heventlog, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded) {
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

int32_t windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(void* heventlog, void* numberofrecords) {
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

int32_t windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(void* heventlog, void* oldestrecord) {
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

int32_t windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(void* heventlog, void* hevent) {
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

void* windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(void* lpuncservername, void* lpfilename) {
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

void* windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(void* lpuncservername, void* lpfilename) {
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

void* windowssysWindowsWin32SystemEventlogOpenEventLogA(void* lpuncservername, void* lpsourcename) {
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

void* windowssysWindowsWin32SystemEventlogOpenEventLogW(void* lpuncservername, void* lpsourcename) {
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

int32_t windowssysWindowsWin32SystemEventlogReadEventLogA(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded) {
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

int32_t windowssysWindowsWin32SystemEventlogReadEventLogW(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded) {
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

void* windowssysWindowsWin32SystemEventlogRegisterEventSourceA(void* lpuncservername, void* lpsourcename) {
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

void* windowssysWindowsWin32SystemEventlogRegisterEventSourceW(void* lpuncservername, void* lpsourcename) {
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

int32_t windowssysWindowsWin32SystemEventlogReportEventA(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata) {
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

int32_t windowssysWindowsWin32SystemEventlogReportEventW(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata) {
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

