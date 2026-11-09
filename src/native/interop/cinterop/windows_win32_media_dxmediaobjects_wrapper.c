#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_media_dxmediaobjects_wrapper.h"
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

int32_t windowssys_windows_win32_media_dxmediaobjects_DMOEnum(void* guidcategory, uint32_t dwflags, uint32_t cintypes, void* pintypes, uint32_t couttypes, void* pouttypes, void* ppenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guidcategory, dwflags, cintypes, pintypes, couttypes, pouttypes, ppenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guidcategory;
    (void)dwflags;
    (void)cintypes;
    (void)pintypes;
    (void)couttypes;
    (void)pouttypes;
    (void)ppenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_DMOGetName(void* clsiddmo, void* szname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOGetName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsiddmo, szname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsiddmo;
    (void)szname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_DMOGetTypes(void* clsiddmo, uint32_t ulinputtypesrequested, void* pulinputtypessupplied, void* pinputtypes, uint32_t uloutputtypesrequested, void* puloutputtypessupplied, void* poutputtypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOGetTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsiddmo, ulinputtypesrequested, pulinputtypessupplied, pinputtypes, uloutputtypesrequested, puloutputtypessupplied, poutputtypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsiddmo;
    (void)ulinputtypesrequested;
    (void)pulinputtypessupplied;
    (void)pinputtypes;
    (void)uloutputtypesrequested;
    (void)puloutputtypessupplied;
    (void)poutputtypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_DMORegister(void* szname, void* clsiddmo, void* guidcategory, uint32_t dwflags, uint32_t cintypes, void* pintypes, uint32_t couttypes, void* pouttypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMORegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szname, clsiddmo, guidcategory, dwflags, cintypes, pintypes, couttypes, pouttypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szname;
    (void)clsiddmo;
    (void)guidcategory;
    (void)dwflags;
    (void)cintypes;
    (void)pintypes;
    (void)couttypes;
    (void)pouttypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_DMOUnregister(void* clsiddmo, void* guidcategory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsiddmo, guidcategory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsiddmo;
    (void)guidcategory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_MoCopyMediaType(void* pmtdest, void* pmtsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoCopyMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmtdest, pmtsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmtdest;
    (void)pmtsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_MoCreateMediaType(void* ppmt, uint32_t cbformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoCreateMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppmt, cbformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppmt;
    (void)cbformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_MoDeleteMediaType(void* pmt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoDeleteMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_MoDuplicateMediaType(void* ppmtdest, void* pmtsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoDuplicateMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppmtdest, pmtsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppmtdest;
    (void)pmtsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_MoFreeMediaType(void* pmt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoFreeMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_dxmediaobjects_MoInitMediaType(void* pmt, uint32_t cbformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoInitMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmt, cbformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmt;
    (void)cbformat;
    errno = ENOSYS;
    return -1;
#endif
}

