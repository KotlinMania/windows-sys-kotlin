#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_storage_filesystem_minifilters_wrapper.h"
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp(int64_t filter, void* ecpcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcknowledgeEcp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, ecpcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive(void* pushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockExclusive");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockExclusiveEx");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared(void* pushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockShared");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockSharedEx");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquireResourceExclusive");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquireResourceShared");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry(int64_t filter, void* data, void* openreparseentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAddOpenReparseEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, data, openreparseentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection(int64_t sourceinstance, int64_t targetinstance, void* sourcedevicestacksizemodified) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAdjustDeviceStackSizeForIoRedirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceinstance, targetinstance, sourcedevicestacksizemodified);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)sourcedevicestacksizemodified;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData(int64_t instance, void* fileobject, void* retnewcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, retnewcallbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)retnewcallbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx(int64_t instance, void* fileobject, uint32_t flags, void* retnewcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateCallbackDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, flags, retnewcallbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)flags;
    (void)retnewcallbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext(int64_t filter, uint16_t contexttype, uint64_t contextsize, int32_t pooltype, void* returnedcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, contexttype, contextsize, pooltype, returnedcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)contexttype;
    (void)contextsize;
    (void)pooltype;
    (void)returnedcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateDeferredIoWorkItem");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList(int64_t filter, uint32_t flags, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, flags, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)flags;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateGenericWorkItem");
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

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag(int64_t instance, int32_t pooltype, uint64_t numberofbytes, uint32_t tag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocatePoolAlignedWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, pooltype, numberofbytes, tag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)instance;
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread(void* inputpriorityinfo, void* outputpriorityinfo, int64_t thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltApplyPriorityInfoThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inputpriorityinfo, outputpriorityinfo, thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume(int64_t filter, int64_t volume, void* instancename, void* retinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAttachVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volume, instancename, retinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude(int64_t filter, int64_t volume, void* altitude, void* instancename, void* retinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAttachVolumeAtAltitude");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volume, altitude, instancename, retinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volume;
    (void)altitude;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor(void* securitydescriptor, uint32_t desiredaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltBuildDefaultSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, desiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)desiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen(int64_t instance, void* fileobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancelFileOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(instance, fileobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo(void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancelIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects(uint32_t count, void* objectarray, int32_t waittype, void* timeout, void* waitblockarray, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancellableWaitForMultipleObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count, objectarray, waittype, timeout, waitblockarray, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject(void* object, void* timeout, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancellableWaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, timeout, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)timeout;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable(void* cbdq) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqDisable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cbdq);
        return;
    }
    errno = ENOSYS;
#else
    (void)cbdq;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable(void* cbdq) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cbdq);
        return;
    }
    errno = ENOSYS;
#else
    (void)cbdq;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize(int64_t instance, void* cbdq, void* cbdqinsertio, void* cbdqremoveio, void* cbdqpeeknextio, void* cbdqacquire, void* cbdqrelease, void* cbdqcompletecanceledio) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, cbdq, cbdqinsertio, cbdqremoveio, cbdqpeeknextio, cbdqacquire, cbdqrelease, cbdqcompletecanceledio);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)cbdq;
    (void)cbdqinsertio;
    (void)cbdqremoveio;
    (void)cbdqpeeknextio;
    (void)cbdqacquire;
    (void)cbdqrelease;
    (void)cbdqcompletecanceledio;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo(void* cbdq, void* cbd, void* context, void* insertcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqInsertIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbdq, cbd, context, insertcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cbdq;
    (void)cbd;
    (void)context;
    (void)insertcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo(void* cbdq, void* context) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqRemoveIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbdq, context);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cbdq;
    (void)context;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo(void* cbdq, void* peekcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqRemoveNextIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbdq, peekcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cbdq;
    (void)peekcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl(void* namectrl, uint16_t newsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckAndGrowNameControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namectrl, newsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namectrl;
    (void)newsize;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess(void* filelock, void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckLockForReadAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess(void* filelock, void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckLockForWriteAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock(void* oplock, void* callbackdata, void* context, void* waitcompletionroutine, void* prepostcallbackdataroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, context, waitcompletionroutine, prepostcallbackdataroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx(void* oplock, void* callbackdata, uint32_t flags, void* context, void* waitcompletionroutine, void* prepostcallbackdataroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckOplockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty(void* data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClearCallbackDataDirty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(data);
        return;
    }
    errno = ENOSYS;
#else
    (void)data;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion(void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClearCancelCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltClose(void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort(int64_t filter, void* clientport) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseClientPort");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, clientport);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)clientport;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort(int64_t serverport) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseCommunicationPort");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(serverport);
        return;
    }
    errno = ENOSYS;
#else
    (void)serverport;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan(void* sectioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseSectionForDataScan");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete(int64_t instance, void* transaction, void* transactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCommitComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete(int64_t instance, void* transaction, void* transactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCommitFinalizeComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes(int64_t instance1, int64_t instance2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompareInstanceAltitudes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance1, instance2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance1;
    (void)instance2;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation(void* callbackdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompletePendedPostOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation(void* callbackdata, int32_t callbackstatus, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompletePendedPreOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackdata, callbackstatus, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackdata;
    (void)callbackstatus;
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList(int64_t filter, void* data, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCopyOpenReparseList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, data, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)data;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort(int64_t filter, void* serverport, void* objectattributes, void* serverportcookie, void* connectnotifycallback, void* disconnectnotifycallback, void* messagenotifycallback, int32_t maxconnections) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateCommunicationPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, serverport, objectattributes, serverportcookie, connectnotifycallback, disconnectnotifycallback, messagenotifycallback, maxconnections);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)serverport;
    (void)objectattributes;
    (void)serverportcookie;
    (void)connectnotifycallback;
    (void)disconnectnotifycallback;
    (void)messagenotifycallback;
    (void)maxconnections;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile(int64_t filter, int64_t instance, void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t createdisposition, uint32_t createoptions, void* eabuffer, uint32_t ealength, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, instance, filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)instance;
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
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx(int64_t filter, int64_t instance, void* filehandle, void* fileobject, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t createdisposition, uint32_t createoptions, void* eabuffer, uint32_t ealength, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
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
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2(int64_t filter, int64_t instance, void* filehandle, void* fileobject, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t createdisposition, uint32_t createoptions, void* eabuffer, uint32_t ealength, uint32_t flags, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFileEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength, flags, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
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
    (void)flags;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile(int64_t filter, int64_t instance, void* filehandle, void* fileobject, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, uint32_t createoptions, uint32_t mailslotquota, uint32_t maximummessagesize, void* readtimeout, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateMailslotFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, createoptions, mailslotquota, maximummessagesize, readtimeout, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)createoptions;
    (void)mailslotquota;
    (void)maximummessagesize;
    (void)readtimeout;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile(int64_t filter, int64_t instance, void* filehandle, void* fileobject, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, uint32_t shareaccess, uint32_t createdisposition, uint32_t createoptions, uint32_t namedpipetype, uint32_t readmode, uint32_t completionmode, uint32_t maximuminstances, uint32_t inboundquota, uint32_t outboundquota, void* defaulttimeout, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateNamedPipeFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, instance, filehandle, fileobject, desiredaccess, objectattributes, iostatusblock, shareaccess, createdisposition, createoptions, namedpipetype, readmode, completionmode, maximuminstances, inboundquota, outboundquota, defaulttimeout, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)namedpipetype;
    (void)readmode;
    (void)completionmode;
    (void)maximuminstances;
    (void)inboundquota;
    (void)outboundquota;
    (void)defaulttimeout;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan(int64_t instance, void* fileobject, void* sectioncontext, uint32_t desiredaccess, void* objectattributes, void* maximumsize, uint32_t sectionpageprotection, uint32_t allocationattributes, uint32_t flags, void* sectionhandle, void* sectionobject, void* sectionfilesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateSectionForDataScan");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, sectioncontext, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, flags, sectionhandle, sectionobject, sectionfilesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)sectioncontext;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)flags;
    (void)sectionhandle;
    (void)sectionobject;
    (void)sectionfilesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder(int64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateSystemVolumeInformationFolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentBatchOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentOplockH");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters(void* callbackdata, void* mdladdresspointer, void* buffer, void* length, void* desiredaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDecodeParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, mdladdresspointer, buffer, length, desiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)mdladdresspointer;
    (void)buffer;
    (void)length;
    (void)desiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext(void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList(int64_t filter, void* lookaside, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteExtraCreateParameterLookasideList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, lookaside, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext(int64_t instance, void* fileobject, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteFileContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext(int64_t instance, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteInstanceContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock(void* pushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeletePushLock");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext(int64_t instance, void* fileobject, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteStreamContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext(int64_t instance, void* fileobject, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteStreamHandleContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext(int64_t instance, void* transaction, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteTransactionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext(int64_t filter, int64_t volume, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteVolumeContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volume, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volume;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume(int64_t filter, int64_t volume, void* instancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDetachVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volume, instancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile(int64_t instance, void* fileobject, uint32_t iocontrolcode, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeviceIoControlFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, iocontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)iocontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe(void* data, void* fltobjects, void* completioncontext, uint32_t flags, void* safepostcallback, void* retpostoperationstatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDoCompletionProcessingWhenSafe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fltobjects, completioncontext, flags, safepostcallback, retpostoperationstatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)data;
    (void)fltobjects;
    (void)completioncontext;
    (void)flags;
    (void)safepostcallback;
    (void)retpostoperationstatus;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction(int64_t instance, void* transaction, void* transactioncontext, uint32_t notificationmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnlistInTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext, notificationmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    (void)notificationmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation(uint32_t arg_0_index, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateFilterInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_index, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters(void* filterlist, uint32_t filterlistsize, void* numberfiltersreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateFilters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterlist, filterlistsize, numberfiltersreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filterlist;
    (void)filterlistsize;
    (void)numberfiltersreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject(void* deviceobject, uint32_t arg_1_index, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, arg_1_index, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter(int64_t filter, uint32_t arg_1_index, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, arg_1_index, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume(int64_t volume, uint32_t arg_1_index, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, arg_1_index, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName(void* volumename, uint32_t arg_1_index, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolumeName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, arg_1_index, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances(int64_t volume, int64_t filter, void* instancelist, uint32_t instancelistsize, void* numberinstancesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstances");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, filter, instancelist, instancelistsize, numberinstancesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)filter;
    (void)instancelist;
    (void)instancelistsize;
    (void)numberinstancesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation(int64_t filter, uint32_t arg_1_index, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateVolumeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, arg_1_index, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes(int64_t filter, void* volumelist, uint32_t volumelistsize, void* numbervolumesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateVolumes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volumelist, volumelistsize, numbervolumesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volumelist;
    (void)volumelistsize;
    (void)numbervolumesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead(int64_t initiatinginstance, void* fileobject, void* fileoffset, uint32_t length, uint32_t lockkey, void* mdlchain, void* iostatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, fileoffset, length, lockkey, mdlchain, iostatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete(int64_t initiatinginstance, void* fileobject, void* mdlchain) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlReadComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, mdlchain);
    }
    errno = ENOSYS;
    return false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete(int64_t initiatinginstance, void* fileobject, void* fileoffset, void* mdlchain) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlWriteComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, fileoffset, mdlchain);
    }
    errno = ENOSYS;
    return false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite(int64_t initiatinginstance, void* fileobject, void* fileoffset, uint32_t length, uint32_t lockkey, void* mdlchain, void* iostatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoPrepareMdlWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, fileoffset, length, lockkey, mdlchain, iostatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter(int64_t filter, void* ecplist, void* ecptype, void* ecpcontext, void* ecpcontextsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFindExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, ecplist, ecptype, ecpcontext, ecpcontextsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers(int64_t instance, void* fileobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFlushBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2(int64_t instance, void* fileobject, uint32_t flushtype, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFlushBuffers2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, flushtype, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)flushtype;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData(void* callbackdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem(int64_t fltworkitem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeDeferredIoWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fltworkitem);
        return;
    }
    errno = ENOSYS;
#else
    (void)fltworkitem;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter(int64_t filter, void* ecpcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, ecpcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList(int64_t filter, void* ecplist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeExtraCreateParameterList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, ecplist);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)ecplist;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock(void* filelock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filelock);
        return;
    }
    errno = ENOSYS;
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem(int64_t fltworkitem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeGenericWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fltworkitem);
        return;
    }
    errno = ENOSYS;
#else
    (void)fltworkitem;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList(int64_t filter, void* ecplist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeOpenReparseList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, ecplist);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)ecplist;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag(int64_t instance, void* buffer, uint32_t tag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreePoolAlignedWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(instance, buffer, tag);
        return;
    }
    errno = ENOSYS;
#else
    (void)instance;
    (void)buffer;
    (void)tag;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor(void* securitydescriptor) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(securitydescriptor);
        return;
    }
    errno = ENOSYS;
#else
    (void)securitydescriptor;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile(int64_t instance, void* fileobject, uint32_t fscontrolcode, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFsControlFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, fscontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData(void* callbackdata, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetActivityIdCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance(int64_t volume, void* instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetBottomInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts(void* fltobjects, uint16_t desiredcontexts, void* contexts) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetContexts");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fltobjects, desiredcontexts, contexts);
        return;
    }
    errno = ENOSYS;
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contexts;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx(void* fltobjects, uint16_t desiredcontexts, uint64_t contextssize, void* contexts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetContextsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltobjects, desiredcontexts, contextssize, contexts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contextssize;
    (void)contexts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation(int64_t instance, void* fileobject, void* rootdirectory, void* filename, uint32_t filenamelength, uint32_t nameoptions, void* retfilenameinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDestinationFileNameInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, rootdirectory, filename, filenamelength, nameoptions, retfilenameinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)rootdirectory;
    (void)filename;
    (void)filenamelength;
    (void)nameoptions;
    (void)retfilenameinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject(int64_t volume, void* deviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, deviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)deviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject(int64_t volume, void* diskdeviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDiskDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, diskdeviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)diskdeviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData(int64_t filter, void* callbackdata, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetEcpListFromCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, callbackdata, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext(int64_t instance, void* fileobject, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation(void* callbackdata, uint32_t nameoptions, void* filenameinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileNameInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, nameoptions, filenameinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)nameoptions;
    (void)filenameinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe(void* fileobject, int64_t instance, uint32_t nameoptions, void* filenameinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileNameInformationUnsafe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, instance, nameoptions, filenameinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)instance;
    (void)nameoptions;
    (void)filenameinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType(void* fltobject, void* filesystemtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileSystemType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltobject, filesystemtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltobject;
    (void)filesystemtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance(int64_t instance, void* retfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterFromInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, retfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)retfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName(void* filtername, void* retfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filtername, retfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filtername;
    (void)retfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation(int64_t filter, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset(void* data, void* zeroingoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFsZeroingOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, zeroingoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)zeroingoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext(int64_t instance, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetInstanceContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation(int64_t instance, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetInstanceInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData(void* data) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoAttributionHandleFromCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)data;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject(void* fileobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromFileObject");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread(int64_t thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromThread");
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

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName(uint8_t irpmajorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIrpName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irpmajorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)irpmajorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance(int64_t currentinstance, void* lowerinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetLowerInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentinstance, lowerinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currentinstance;
    (void)lowerinstance;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress(void* callbackdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetNewSystemBufferAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter(int64_t filter, void* ecplist, void* currentecpcontext, void* nextecptype, void* nextecpcontext, void* nextecpcontextsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetNextExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess(void* callbackdata) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId(void* callbackdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx(void* callbackdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcessIdEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId(void* callbackdata, void* sessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress(void* fltmgrroutinename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRoutineAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltmgrroutinename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fltmgrroutinename;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext(int64_t instance, void* fileobject, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetSectionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext(int64_t instance, void* fileobject, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetStreamContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext(int64_t instance, void* fileobject, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetStreamHandleContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress(void* callbackdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetSwappedBufferMdlAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance(int64_t volume, void* instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTopInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext(int64_t instance, void* transaction, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTransactionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName(void* callbackdata, void* filenameinformation, void* rettunneledfilenameinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTunneledName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, filenameinformation, rettunneledfilenameinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)filenameinformation;
    (void)rettunneledfilenameinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance(int64_t currentinstance, void* upperinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetUpperInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentinstance, upperinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currentinstance;
    (void)upperinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext(int64_t filter, int64_t volume, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volume, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volume;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject(int64_t filter, void* deviceobject, void* retvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, deviceobject, retvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)deviceobject;
    (void)retvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject(int64_t filter, void* fileobject, void* retvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromFileObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, fileobject, retvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)fileobject;
    (void)retvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance(int64_t instance, void* retvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, retvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)retvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName(int64_t filter, void* volumename, void* retvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volumename, retvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volumename;
    (void)retvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName(int64_t volume, void* volumeguidname, void* buffersizeneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeGuidName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, volumeguidname, buffersizeneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)volumeguidname;
    (void)buffersizeneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation(int64_t volume, int32_t informationclass, void* buffer, uint32_t buffersize, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, informationclass, buffer, buffersize, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName(int64_t filter, int64_t volume, void* instancename, void* retinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeInstanceFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, volume, instancename, retinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName(int64_t volume, void* volumename, void* buffersizeneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, volumename, buffersizeneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)volumename;
    (void)buffersizeneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties(int64_t volume, void* volumeproperties, uint32_t volumepropertieslength, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, volumeproperties, volumepropertieslength, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)volumeproperties;
    (void)volumepropertieslength;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList(int64_t filter, void* lookaside, uint32_t flags, uint64_t size, uint32_t tag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitExtraCreateParameterLookasideList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, lookaside, flags, size, tag);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock(void* filelock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializeFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filelock);
        return;
    }
    errno = ENOSYS;
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock(void* oplock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializeOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oplock);
        return;
    }
    errno = ENOSYS;
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock(void* pushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializePushLock");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter(int64_t filter, void* ecplist, void* ecpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInsertExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, ecplist, ecpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess(void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIs32bitProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty(void* data) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsCallbackDataDirty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return false;
#else
    (void)data;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory(void* fileobject, int64_t instance, void* isdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, instance, isdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)instance;
    (void)isdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged(int64_t filter, void* ecpcontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsEcpAcknowledged");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, ecpcontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode(int64_t filter, void* ecpcontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsEcpFromUserMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, ecpcontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject(void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsFltMgrVolumeDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled(void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoCanceled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed(int64_t sourceinstance, int64_t targetinstance, void* redirectionallowed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceinstance, targetinstance, redirectionallowed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)redirectionallowed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation(void* data, int64_t targetinstance, void* redirectionallowedthisio, void* redirectionallowedallio) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowedForOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, targetinstance, redirectionallowedthisio, redirectionallowedallio);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)targetinstance;
    (void)redirectionallowedthisio;
    (void)redirectionallowedallio;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous(void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsOperationSynchronous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot(void* fltobject, void* issnapshotvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsVolumeSnapshot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltobject, issnapshotvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltobject;
    (void)issnapshotvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable(void* fltobject, void* iswritable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsVolumeWritable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltobject, iswritable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltobject;
    (void)iswritable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter(void* filtername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltLoadFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filtername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filtername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer(void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltLockUserBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference(void* fltobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltObjectDereference");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fltobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)fltobject;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference(void* fltobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltObjectReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume(int64_t instance, void* volumehandle, void* volumefileobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOpenVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, volumehandle, volumefileobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)volumehandle;
    (void)volumefileobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH(void* oplock, void* callbackdata, uint32_t flags, void* context, void* waitcompletionroutine, void* prepostcallbackdataroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakH");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone(void* oplock, void* callbackdata, void* context, void* waitcompletionroutine, void* prepostcallbackdataroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakToNone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, context, waitcompletionroutine, prepostcallbackdataroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx(void* oplock, void* callbackdata, uint32_t flags, void* context, void* waitcompletionroutine, void* prepostcallbackdataroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakToNoneEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, flags, context, waitcompletionroutine, prepostcallbackdataroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl(void* oplock, void* callbackdata, uint32_t opencount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockFsctrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, opencount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx(void* oplock, void* callbackdata, uint32_t opencount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockFsctrlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, callbackdata, opencount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockIsFastIoPossible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest(void* callbackdata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockIsSharedRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)callbackdata;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual(void* fo1, void* fo2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockKeysEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fo1, fo2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fo1;
    (void)fo2;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName(void* filename, void* extension, void* stream, void* finalcomponent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltParseFileName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, extension, stream, finalcomponent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)extension;
    (void)stream;
    (void)finalcomponent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation(void* filenameinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltParseFileNameInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filenameinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filenameinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo(void* callbackdata, void* callbackroutine, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPerformAsynchronousIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, callbackroutine, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo(void* callbackdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPerformSynchronousIo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete(int64_t instance, void* transaction, void* transactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrePrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete(int64_t instance, void* transaction, void* transactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp(int64_t filter, void* ecpcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrepareToReuseEcp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, ecpcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock(void* filelock, void* callbackdata, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltProcessFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, callbackdata, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filelock;
    (void)callbackdata;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread(void* callbackdata, void* propagateid, void* originalid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPropagateActivityIdToThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, propagateid, originalid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)propagateid;
    (void)originalid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension(void* sourcedata, void* targetdata, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPropagateIrpExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcedata, targetdata, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcedata;
    (void)targetdata;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache(int64_t instance, void* fileobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPurgeFileNameInformationCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile(int64_t instance, void* fileobject, void* fileinformation, uint32_t length, int32_t fileinformationclass, bool returnsingleentry, void* filename, bool restartscan, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, bool, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryDirectoryFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, returnsingleentry, filename, restartscan, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)returnsingleentry;
    (void)filename;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx(int64_t instance, void* fileobject, void* fileinformation, uint32_t length, int32_t fileinformationclass, uint32_t queryflags, void* filename, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryDirectoryFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, queryflags, filename, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile(int64_t instance, void* fileobject, void* returnedeadata, uint32_t length, bool returnsingleentry, void* ealist, uint32_t ealistlength, void* eaindex, bool restartscan, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, returnedeadata, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)returnedeadata;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName(int64_t filter, int64_t instance, void* objectattributes, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass, void* drivercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryInformationByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, instance, objectattributes, iostatusblock, fileinformation, length, fileinformationclass, drivercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)instance;
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)drivercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile(int64_t instance, void* fileobject, void* fileinformation, uint32_t length, int32_t fileinformationclass, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile(int64_t instance, void* fileobject, void* iostatusblock, void* buffer, uint32_t length, bool returnsingleentry, void* sidlist, uint32_t sidlistlength, void* startsid, bool restartscan, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryQuotaInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject(int64_t instance, void* fileobject, uint32_t securityinformation, void* securitydescriptor, uint32_t length, void* lengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQuerySecurityObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, securityinformation, securitydescriptor, length, lengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation(int64_t instance, void* iosb, void* fsinformation, uint32_t length, int32_t fsinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryVolumeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, iosb, fsinformation, length, fsinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile(int64_t instance, void* fileobject, void* fsinformation, uint32_t length, int32_t fsinformationclass, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryVolumeInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, fsinformation, length, fsinformationclass, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem(int64_t fltworkitem, void* data, void* workerroutine, int32_t queuetype, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueueDeferredIoWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltworkitem, data, workerroutine, queuetype, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltworkitem;
    (void)data;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem(int64_t fltworkitem, void* fltobject, void* workerroutine, int32_t queuetype, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueueGenericWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltworkitem, fltobject, workerroutine, queuetype, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltworkitem;
    (void)fltobject;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile(int64_t initiatinginstance, void* fileobject, void* byteoffset, uint32_t length, void* buffer, uint32_t flags, void* bytesread, void* callbackroutine, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReadFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, bytesread, callbackroutine, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)bytesread;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx(int64_t initiatinginstance, void* fileobject, void* byteoffset, uint32_t length, void* buffer, uint32_t flags, void* bytesread, void* callbackroutine, void* callbackcontext, void* key, void* mdl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReadFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, bytesread, callbackroutine, callbackcontext, key, mdl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)bytesread;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)key;
    (void)mdl;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext(void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReferenceContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation(void* filenameinformation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReferenceFileNameInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filenameinformation);
        return;
    }
    errno = ENOSYS;
#else
    (void)filenameinformation;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter(void* driver, void* registration, void* retfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRegisterFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driver, registration, retfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driver;
    (void)registration;
    (void)retfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan(int64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRegisterForDataScan");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo(int64_t initiatinginstance, void* callbackdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReissueSynchronousIo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(initiatinginstance, callbackdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)initiatinginstance;
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext(void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts(void* contexts) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContexts");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(contexts);
        return;
    }
    errno = ENOSYS;
#else
    (void)contexts;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx(uint64_t contextssize, void* contexts) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContextsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(contextssize, contexts);
        return;
    }
    errno = ENOSYS;
#else
    (void)contextssize;
    (void)contexts;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation(void* filenameinformation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseFileNameInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filenameinformation);
        return;
    }
    errno = ENOSYS;
#else
    (void)filenameinformation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock(void* pushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleasePushLock");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx(void* pushlock, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleasePushLockEx");
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

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseResource");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter(int64_t filter, void* ecplist, void* ecptype, void* ecpcontext, void* ecpcontextsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRemoveExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, ecplist, ecptype, ecpcontext, ecpcontextsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry(int64_t filter, void* data, void* openreparseentry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRemoveOpenReparseEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter, data, openreparseentry);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion(int64_t filter, void* data, uint32_t infoclassflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRequestFileInfoOnCreateCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, data, infoclassflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)data;
    (void)infoclassflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback(void* data, void* callbackroutine, void* requestercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRequestOperationStatusCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, callbackroutine, requestercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)callbackroutine;
    (void)requestercontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress(void* callbackdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetainSwappedBufferMdlAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion(int64_t filter, void* data, uint32_t infoclass, void* size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, data, infoclass, size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx(int64_t filter, void* data, uint32_t infoclass, void* retinfosize, void* retinfobuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, data, infoclass, retinfosize, retinfobuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)retinfosize;
    (void)retinfobuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo(void* data, void* fileobject, int64_t thread, void* priorityinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveIoPriorityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fileobject, thread, priorityinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData(void* callbackdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReuseCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callbackdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete(int64_t instance, void* transaction, void* transactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRollbackComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment(int64_t instance, void* transaction, void* transactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRollbackEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, transactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage(int64_t filter, void* clientport, void* senderbuffer, uint32_t senderbufferlength, void* replybuffer, void* replylength, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSendMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, clientport, senderbuffer, senderbufferlength, replybuffer, replylength, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)clientport;
    (void)senderbuffer;
    (void)senderbufferlength;
    (void)replybuffer;
    (void)replylength;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData(void* callbackdata, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetActivityIdCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty(void* data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetCallbackDataDirty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(data);
        return;
    }
    errno = ENOSYS;
#else
    (void)data;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion(void* callbackdata, void* canceledcallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetCancelCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, canceledcallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)canceledcallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile(int64_t instance, void* fileobject, void* eabuffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, eabuffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData(int64_t filter, void* callbackdata, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetEcpListIntoCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, callbackdata, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext(int64_t instance, void* fileobject, int32_t operation, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFileContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset(void* data, uint32_t zeroingoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFsZeroingOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, zeroingoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)zeroingoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFsZeroingOffsetRequired");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile(int64_t instance, void* fileobject, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext(int64_t instance, int32_t operation, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetInstanceContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, operation, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData(void* data, int32_t priorityhint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoCallbackData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, priorityhint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)priorityhint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject(void* fileobject, int32_t priorityhint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoFileObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, priorityhint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)priorityhint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread(int64_t thread, int32_t priorityhint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, priorityhint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)priorityhint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile(int64_t instance, void* fileobject, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetQuotaInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, buffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject(int64_t instance, void* fileobject, uint32_t securityinformation, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetSecurityObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, securityinformation, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext(int64_t instance, void* fileobject, int32_t operation, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetStreamContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext(int64_t instance, void* fileobject, int32_t operation, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetStreamHandleContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, fileobject, operation, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext(int64_t instance, void* transaction, int32_t operation, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetTransactionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, transaction, operation, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)transaction;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext(int64_t volume, int32_t operation, void* newcontext, void* oldcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetVolumeContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, operation, newcontext, oldcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation(int64_t instance, void* iosb, void* fsinformation, uint32_t length, int32_t fsinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetVolumeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, iosb, fsinformation, length, fsinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering(int64_t filter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltStartFiltering");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts(void* fileobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsFileContexts");
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

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx(void* fileobject, int64_t instance) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsFileContextsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, instance);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)instance;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts(void* fileobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsStreamContexts");
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

bool windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts(void* fileobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsStreamHandleContexts");
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

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile(int64_t initiatinginstance, void* fileobject, uint32_t filetag, void* guid, void* databuffer, uint16_t databufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltTagFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, filetag, guid, databuffer, databufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx(int64_t initiatinginstance, void* fileobject, uint32_t filetag, void* guid, void* databuffer, uint16_t databufferlength, uint32_t existingfiletag, void* existingguid, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltTagFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, filetag, guid, databuffer, databufferlength, existingfiletag, existingguid, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    (void)existingfiletag;
    (void)existingguid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock(void* filelock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUninitializeFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filelock);
        return;
    }
    errno = ENOSYS;
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock(void* oplock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUninitializeOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oplock);
        return;
    }
    errno = ENOSYS;
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter(void* filtername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUnloadFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filtername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filtername;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter(int64_t filter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUnregisterFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filter);
        return;
    }
    errno = ENOSYS;
#else
    (void)filter;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile(int64_t initiatinginstance, void* fileobject, uint32_t filetag, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUntagFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, filetag, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo(void* callbackdata, void* fltobjects, int32_t operationstatus, void* failurereason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltVetoBypassIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackdata, fltobjects, operationstatus, failurereason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackdata;
    (void)fltobjects;
    (void)operationstatus;
    (void)failurereason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile(int64_t initiatinginstance, void* fileobject, void* byteoffset, uint32_t length, void* buffer, uint32_t flags, void* byteswritten, void* callbackroutine, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltWriteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, byteswritten, callbackroutine, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)byteswritten;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx(int64_t initiatinginstance, void* fileobject, void* byteoffset, uint32_t length, void* buffer, uint32_t flags, void* byteswritten, void* callbackroutine, void* callbackcontext, void* key, void* mdl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltWriteFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatinginstance, fileobject, byteoffset, length, buffer, flags, byteswritten, callbackroutine, callbackcontext, key, mdl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)byteswritten;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)key;
    (void)mdl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo(void* originatingfileobject, void* childcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltpTraceRedirectedFileIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(originatingfileobject, childcallbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)originatingfileobject;
    (void)childcallbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

