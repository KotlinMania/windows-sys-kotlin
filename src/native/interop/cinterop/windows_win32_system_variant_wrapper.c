#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_variant_wrapper.h"
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

void windowssys_windows_win32_system_variant_ClearVariantArray(void* pvars, uint32_t cvars) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearVariantArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvars, cvars);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvars;
    (void)cvars;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_variant_DosDateTimeToVariantTime(uint16_t wdosdate, uint16_t wdostime, void* pvtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DosDateTimeToVariantTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wdosdate, wdostime, pvtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wdosdate;
    (void)wdostime;
    (void)pvtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromBooleanArray(void* prgf, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromBooleanArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgf, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgf;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromBuffer(void* pv, uint32_t cb, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pv, cb, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pv;
    (void)cb;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromDoubleArray(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromDoubleArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromFileTime(void* pft, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pft, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pft;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromFileTimeArray(void* prgft, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromFileTimeArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgft, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgft;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromGUIDAsString(void* guid, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromGUIDAsString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guid;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromInt16Array(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromInt16Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromInt32Array(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromInt32Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromInt64Array(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromInt64Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromResource(void* hinst, uint32_t id, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, id, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinst;
    (void)id;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromStringArray(void* prgsz, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromStringArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgsz, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgsz;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromUInt16Array(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromUInt16Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromUInt32Array(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromUInt32Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromUInt64Array(void* prgn, uint32_t celems, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromUInt64Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_InitVariantFromVariantArrayElem(void* varin, uint32_t ielem, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromVariantArrayElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, ielem, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)ielem;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_SystemTimeToVariantTime(void* lpsystemtime, void* pvtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToVariantTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemtime, pvtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemtime;
    (void)pvtime;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_variant_VARIANT_UserFree(void* param0, void* param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(param0, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_variant_VARIANT_UserFree64(void* param0, void* param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserFree64");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(param0, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_variant_VARIANT_UserMarshal(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserMarshal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_variant_VARIANT_UserMarshal64(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserMarshal64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_variant_VARIANT_UserSize(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_variant_VARIANT_UserSize64(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserSize64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserUnmarshal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal64(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserUnmarshal64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantChangeType(void* pvargdest, void* pvarsrc, uint16_t wflags, uint16_t vt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantChangeType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvargdest, pvarsrc, wflags, vt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvargdest;
    (void)pvarsrc;
    (void)wflags;
    (void)vt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantChangeTypeEx(void* pvargdest, void* pvarsrc, uint32_t lcid, uint16_t wflags, uint16_t vt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantChangeTypeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvargdest, pvarsrc, lcid, wflags, vt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvargdest;
    (void)pvarsrc;
    (void)lcid;
    (void)wflags;
    (void)vt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantClear(void* pvarg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantCompare(void* var1, void* var2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var1, var2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var1;
    (void)var2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantCopy(void* pvargdest, void* pvargsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvargdest, pvargsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvargdest;
    (void)pvargsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantCopyInd(void* pvardest, void* pvargsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantCopyInd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvardest, pvargsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvardest;
    (void)pvargsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetBooleanElem(void* var, uint32_t ielem, void* pfval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetBooleanElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pfval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pfval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetDoubleElem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetDoubleElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_variant_VariantGetElementCount(void* varin) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetElementCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)varin;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetInt16Elem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetInt16Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetInt32Elem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetInt32Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetInt64Elem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetInt64Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetStringElem(void* var, uint32_t ielem, void* ppszval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetStringElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, ppszval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)ppszval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetUInt16Elem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetUInt16Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetUInt32Elem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetUInt32Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantGetUInt64Elem(void* var, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetUInt64Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_variant_VariantInit(void* pvarg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantInit");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvarg);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvarg;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantTimeToDosDateTime(double vtime, void* pwdosdate, void* pwdostime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantTimeToDosDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vtime, pwdosdate, pwdostime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vtime;
    (void)pwdosdate;
    (void)pwdostime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantTimeToSystemTime(double vtime, void* lpsystemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vtime, lpsystemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vtime;
    (void)lpsystemtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToBoolean(void* varin, void* pfret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBoolean");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pfret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pfret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToBooleanArray(void* var, void* prgf, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBooleanArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgf, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgf;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToBooleanArrayAlloc(void* var, void* pprgf, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBooleanArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgf, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgf;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToBooleanWithDefault(void* varin, int32_t fdefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBooleanWithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, fdefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)fdefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToBuffer(void* varin, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToDosDateTime(void* varin, void* pwdate, void* pwtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDosDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pwdate, pwtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pwdate;
    (void)pwtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToDouble(void* varin, void* pdblret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pdblret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pdblret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToDoubleArray(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDoubleArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToDoubleArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDoubleArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_system_variant_VariantToDoubleWithDefault(void* varin, double dbldefault) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDoubleWithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, dbldefault);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)varin;
    (void)dbldefault;
    errno = ENOSYS;
    return 0.0;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToFileTime(void* varin, int32_t stfout, void* pftout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, stfout, pftout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)stfout;
    (void)pftout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToGUID(void* varin, void* pguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToGUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt16(void* varin, void* piret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, piret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)piret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt16ArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16ArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssys_windows_win32_system_variant_VariantToInt16WithDefault(void* varin, int16_t idefault) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, idefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)idefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt32(void* varin, void* plret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, plret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)plret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt32ArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32ArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt32WithDefault(void* varin, int32_t ldefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, ldefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)ldefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt64(void* varin, void* pllret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pllret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pllret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToInt64ArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64ArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_variant_VariantToInt64WithDefault(void* varin, int64_t lldefault) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, lldefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)lldefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToString(void* varin, void* pszbuf, uint32_t cchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pszbuf, cchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToStringAlloc(void* varin, void* ppszbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, ppszbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)ppszbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToStringArray(void* var, void* prgsz, uint32_t crgsz, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgsz, crgsz, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgsz;
    (void)crgsz;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToStringArrayAlloc(void* var, void* pprgsz, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgsz, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgsz;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_variant_VariantToStringWithDefault(void* varin, void* pszdefault) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringWithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pszdefault);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)varin;
    (void)pszdefault;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt16(void* varin, void* puiret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, puiret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)puiret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt16ArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16ArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_system_variant_VariantToUInt16WithDefault(void* varin, uint16_t uidefault) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, uidefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)varin;
    (void)uidefault;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt32(void* varin, void* pulret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pulret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pulret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt32ArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32ArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_variant_VariantToUInt32WithDefault(void* varin, uint32_t uldefault) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, uldefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)varin;
    (void)uldefault;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt64(void* varin, void* pullret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, pullret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)varin;
    (void)pullret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64Array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_variant_VariantToUInt64ArrayAlloc(void* var, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64ArrayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(var, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_variant_VariantToUInt64WithDefault(void* varin, uint64_t ulldefault) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(varin, ulldefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)varin;
    (void)ulldefault;
    errno = ENOSYS;
    return 0;
#endif
}

