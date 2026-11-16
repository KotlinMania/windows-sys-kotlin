#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_eventcollector_wrapper.h"
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

int32_t windowssysWindowsWin32SystemEventcollectorEcClose(int64_t object) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcClose");
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

int32_t windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(void* subscriptionname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcDeleteSubscription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscriptionname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscriptionname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(int64_t subscriptionenum, uint32_t subscriptionnamebuffersize, void* subscriptionnamebuffer, void* subscriptionnamebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcEnumNextSubscription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscriptionenum, subscriptionnamebuffersize, subscriptionnamebuffer, subscriptionnamebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscriptionenum;
    (void)subscriptionnamebuffersize;
    (void)subscriptionnamebuffer;
    (void)subscriptionnamebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(int64_t objectarray, int32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetObjectArrayProperty");
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

int32_t windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(int64_t objectarray, void* objectarraysize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetObjectArraySize");
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

int32_t windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(int64_t subscription, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetSubscriptionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscription, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscription;
    (void)propertyid;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(void* subscriptionname, int32_t statusinfoid, void* eventsourcename, uint32_t flags, uint32_t statusvaluebuffersize, void* statusvaluebuffer, void* statusvaluebufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetSubscriptionRunTimeStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscriptionname, statusinfoid, eventsourcename, flags, statusvaluebuffersize, statusvaluebuffer, statusvaluebufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscriptionname;
    (void)statusinfoid;
    (void)eventsourcename;
    (void)flags;
    (void)statusvaluebuffersize;
    (void)statusvaluebuffer;
    (void)statusvaluebufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(int64_t objectarray, uint32_t arrayindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcInsertObjectArrayElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectarray, arrayindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectarray;
    (void)arrayindex;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(void* subscriptionname, uint32_t accessmask, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcOpenSubscription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscriptionname, accessmask, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscriptionname;
    (void)accessmask;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcOpenSubscriptionEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(int64_t objectarray, uint32_t arrayindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcRemoveObjectArrayElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectarray, arrayindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectarray;
    (void)arrayindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(void* subscriptionname, void* eventsourcename, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcRetrySubscription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscriptionname, eventsourcename, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscriptionname;
    (void)eventsourcename;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(int64_t subscription, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcSaveSubscription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscription, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscription;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(int64_t objectarray, int32_t propertyid, uint32_t arrayindex, uint32_t flags, void* propertyvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcSetObjectArrayProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectarray, propertyid, arrayindex, flags, propertyvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(int64_t subscription, int32_t propertyid, uint32_t flags, void* propertyvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcSetSubscriptionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscription, propertyid, flags, propertyvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subscription;
    (void)propertyid;
    (void)flags;
    (void)propertyvalue;
    errno = ENOSYS;
    return -1;
#endif
}

