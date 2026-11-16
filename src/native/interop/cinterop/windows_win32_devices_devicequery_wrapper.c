#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_devicequery_wrapper.h"
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

void windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(void* hdevquery) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCloseObjectQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdevquery);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdevquery;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, pcallback, pcontext, phdevquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, cextendedparametercount, pextendedparameters, pcallback, pcontext, phdevquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, pszobjectid, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, pcallback, pcontext, phdevquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromIdEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, pszobjectid, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, cextendedparametercount, pextendedparameters, pcallback, pcontext, phdevquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(int32_t objecttype, void* pszzobjectids, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, pszzobjectids, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, pcallback, pcontext, phdevquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)pszzobjectids;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(int32_t objecttype, void* pszzobjectids, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromIdsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, pszzobjectids, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, cextendedparametercount, pextendedparameters, pcallback, pcontext, phdevquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)pszzobjectids;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32DevicesDevicequeryDevFindProperty(void* pkey, int32_t store, void* pszlocalename, uint32_t cproperties, void* pproperties) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevFindProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pkey, store, pszlocalename, cproperties, pproperties);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pkey;
    (void)store;
    (void)pszlocalename;
    (void)cproperties;
    (void)pproperties;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(uint32_t cpropertycount, void* pproperties) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevFreeObjectProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cpropertycount, pproperties);
        return;
    }
    errno = ENOSYS;
#else
    (void)cpropertycount;
    (void)pproperties;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(uint32_t cobjectcount, void* pobjects) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevFreeObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cobjectcount, pobjects);
        return;
    }
    errno = ENOSYS;
#else
    (void)cobjectcount;
    (void)pobjects;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, void* pcpropertycount, void* ppproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjectProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, pszobjectid, queryflags, crequestedproperties, prequestedproperties, pcpropertycount, ppproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)pcpropertycount;
    (void)ppproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cextendedparametercount, void* pextendedparameters, void* pcpropertycount, void* ppproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjectPropertiesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, pszobjectid, queryflags, crequestedproperties, prequestedproperties, cextendedparametercount, pextendedparameters, pcpropertycount, ppproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcpropertycount;
    (void)ppproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjects(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcobjectcount, void* ppobjects) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, pcobjectcount, ppobjects);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcobjectcount;
    (void)ppobjects;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcobjectcount, void* ppobjects) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjectsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, queryflags, crequestedproperties, prequestedproperties, cfilterexpressioncount, pfilter, cextendedparametercount, pextendedparameters, pcobjectcount, ppobjects);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcobjectcount;
    (void)ppobjects;
    errno = ENOSYS;
    return -1;
#endif
}

