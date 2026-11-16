#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_media_kernelstreaming_wrapper.h"
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

uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator(void* connectionhandle, void* allocatorframing, void* allocatorhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateAllocator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, allocatorframing, allocatorhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connectionhandle;
    (void)allocatorframing;
    (void)allocatorhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2(void* connectionhandle, void* allocatorframing, void* allocatorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateAllocator2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, allocatorframing, allocatorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)allocatorframing;
    (void)allocatorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreateClock(void* connectionhandle, void* clockcreate, void* clockhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateClock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, clockcreate, clockhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connectionhandle;
    (void)clockcreate;
    (void)clockhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsCreateClock2(void* connectionhandle, void* clockcreate, void* clockhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateClock2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, clockcreate, clockhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)clockcreate;
    (void)clockhandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreatePin(void* filterhandle, void* arg1Connect, uint32_t desiredaccess, void* connectionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreatePin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterhandle, arg1Connect, desiredaccess, connectionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filterhandle;
    (void)arg1Connect;
    (void)desiredaccess;
    (void)connectionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsCreatePin2(void* filterhandle, void* arg1Connect, uint32_t desiredaccess, void* connectionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreatePin2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterhandle, arg1Connect, desiredaccess, connectionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filterhandle;
    (void)arg1Connect;
    (void)desiredaccess;
    (void)connectionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode(void* parenthandle, void* nodecreate, uint32_t desiredaccess, void* nodehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateTopologyNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parenthandle, nodecreate, desiredaccess, nodehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)parenthandle;
    (void)nodecreate;
    (void)desiredaccess;
    (void)nodehandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2(void* parenthandle, void* nodecreate, uint32_t desiredaccess, void* nodehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksuser.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsCreateTopologyNode2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parenthandle, nodecreate, desiredaccess, nodehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parenthandle;
    (void)nodecreate;
    (void)desiredaccess;
    (void)nodehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount(void* filterhandle, uint32_t pinfactoryid, void* mediatypecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsGetMediaTypeCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterhandle, pinfactoryid, mediatypecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filterhandle;
    (void)pinfactoryid;
    (void)mediatypecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems(void* filterhandle, uint32_t pinfactoryid, uint32_t propertyid, void* items) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsGetMultiplePinFactoryItems");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterhandle, pinfactoryid, propertyid, items);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filterhandle;
    (void)pinfactoryid;
    (void)propertyid;
    (void)items;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice(void* category, uint32_t access, void* devicehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsOpenDefaultDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, access, devicehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)access;
    (void)devicehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes(void* datarange, void* attributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsResolveRequiredAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datarange, attributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datarange;
    (void)attributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl(void* handle, uint32_t iocontrol, void* inbuffer, uint32_t inlength, void* outbuffer, uint32_t outlength, void* bytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksproxy.ax");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KsSynchronousDeviceControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, iocontrol, inbuffer, inlength, outbuffer, outlength, bytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)iocontrol;
    (void)inbuffer;
    (void)inlength;
    (void)outbuffer;
    (void)outlength;
    (void)bytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

