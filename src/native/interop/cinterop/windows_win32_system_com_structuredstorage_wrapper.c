#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_com_structuredstorage_wrapper.h"
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

void windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(void* rgpropvar, uint32_t cvars) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearPropVariantArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(rgpropvar, cvars);
        return;
    }
    errno = ENOSYS;
#else
    (void)rgpropvar;
    (void)cvars;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, uint32_t grfmode, void* pwszname, uint32_t dwcount, void* presults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetInstanceFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pserverinfo, pclsid, punkouter, dwclsctx, grfmode, pwszname, dwcount, presults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)grfmode;
    (void)pwszname;
    (void)dwcount;
    (void)presults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(void* pserverinfo, void* pclsid, void* punkouter, uint32_t dwclsctx, void* pstg, uint32_t dwcount, void* presults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetInstanceFromIStorage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pserverinfo, pclsid, punkouter, dwclsctx, pstg, dwcount, presults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)pstg;
    (void)dwcount;
    (void)presults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(void* pstm, void* iid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetInterfaceAndReleaseStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, iid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)iid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* pplkbyt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateILockBytesOnHGlobal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hglobal, fdeleteonrelease, pplkbyt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)pplkbyt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(void* hglobal, int32_t fdeleteonrelease, void* ppstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStreamOnHGlobal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hglobal, fdeleteonrelease, ppstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)ppstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(void* pfmtid, void* oszname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FmtIdToPropStgName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfmtid, oszname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfmtid;
    (void)oszname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(uint32_t cvariants, void* rgvars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePropVariantArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cvariants, rgvars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cvariants;
    (void)rgvars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(void* pstg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConvertStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(void* plkbyt, void* phglobal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHGlobalFromILockBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plkbyt, phglobal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plkbyt;
    (void)phglobal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(void* pstm, void* phglobal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHGlobalFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, phglobal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)phglobal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(void* prgf, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromBooleanVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgf, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgf;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(void* pv, uint32_t cb, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pv, cb, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pv;
    (void)cb;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(void* clsid, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromCLSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromDoubleVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(void* pftin, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pftin, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pftin;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(void* prgft, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFileTimeVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgft, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgft;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(void* guid, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromGUIDAsString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guid, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guid;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromInt16Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromInt32Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromInt64Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(void* propvarin, uint32_t ielem, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromPropVariantVectorElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, ielem, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)ielem;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(void* hinst, uint32_t id, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, id, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinst;
    (void)id;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(void* psz, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromStringAsVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psz;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(void* prgsz, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromStringVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgsz, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgsz;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromUInt16Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromUInt32Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(void* prgn, uint32_t celems, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromUInt64Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgn, celems, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(void* propvarsingle, void* ppropvarvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantVectorFromPropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarsingle, ppropvarvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarsingle;
    (void)ppropvarvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(void* pstg, void* lpolestream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertIStorageToOLESTREAM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, lpolestream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)lpolestream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(void* pstg, uint16_t cfformat, int32_t lwidth, int32_t lheight, uint32_t dwsize, void* pmedium, void* polestm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertIStorageToOLESTREAMEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, cfformat, lwidth, lheight, dwsize, pmedium, polestm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)cfformat;
    (void)lwidth;
    (void)lheight;
    (void)dwsize;
    (void)pmedium;
    (void)polestm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(void* lpolestream, void* pstg, void* ptd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpolestream, pstg, ptd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpolestream;
    (void)pstg;
    (void)ptd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(void* polestm, void* pstg, void* pcfformat, void* plwwidth, void* plheight, void* pdwsize, void* pmedium) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)polestm;
    (void)pstg;
    (void)pcfformat;
    (void)plwwidth;
    (void)plheight;
    (void)pdwsize;
    (void)pmedium;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(void* oszname, void* pfmtid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropStgNameToFmtId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oszname, pfmtid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oszname;
    (void)pfmtid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(void* ppropvardest, void* propvarsrc, int32_t flags, uint16_t vt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantChangeType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropvardest, propvarsrc, flags, vt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppropvardest;
    (void)propvarsrc;
    (void)flags;
    (void)vt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(void* propvar1, void* propvar2, int32_t unit, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantCompareEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar1, propvar2, unit, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar1;
    (void)propvar2;
    (void)unit;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(void* pvardest, void* pvarsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvardest, pvarsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvardest;
    (void)pvarsrc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(void* propvar, uint32_t ielem, void* pfval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetBooleanElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pfval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pfval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetDoubleElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(void* propvar) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetElementCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propvar;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(void* propvar, uint32_t ielem, void* pftval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetFileTimeElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pftval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pftval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInt16Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInt32Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInt64Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(void* propvar, uint32_t ielem, void* ppszval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetStringElem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, ppszval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)ppszval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetUInt16Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetUInt32Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(void* propvar, uint32_t ielem, void* pnval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetUInt64Elem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ielem, pnval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(void* propvar, void* pbstrout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBSTR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pbstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pbstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(void* propvarin, void* pfret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBoolean");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, pfret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)pfret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(void* propvar, void* prgf, uint32_t crgf, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBooleanVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgf, crgf, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgf;
    (void)crgf;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(void* propvar, void* pprgf, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBooleanVectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgf, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgf;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(void* propvarin, int32_t fdefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBooleanWithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, fdefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)fdefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(void* propvar, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(void* propvarin, void* pdblret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, pdblret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)pdblret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDoubleVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDoubleVectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(void* propvarin, double dbldefault) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDoubleWithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, dbldefault);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)propvarin;
    (void)dbldefault;
    errno = ENOSYS;
    return 0.0;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(void* propvar, int32_t pstfout, void* pftout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pstfout, pftout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pstfout;
    (void)pftout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(void* propvar, void* prgft, uint32_t crgft, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToFileTimeVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgft, crgft, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgft;
    (void)crgft;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(void* propvar, void* pprgft, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToFileTimeVectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgft, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgft;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(void* propvar, void* pguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToGUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(void* propvarin, void* piret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, piret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)piret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16VectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(void* propvarin, int16_t idefault) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, idefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)idefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(void* propvarin, void* plret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, plret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)plret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32VectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(void* propvarin, int32_t ldefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, ldefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)ldefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(void* propvarin, void* pllret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, pllret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)pllret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64VectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(void* propvarin, int64_t lldefault) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, lldefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)lldefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(void* propvar, void* psz, uint32_t cch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, psz, cch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)psz;
    (void)cch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(void* propvar, void* ppszout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, ppszout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)ppszout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(void* propvar, void* prgsz, uint32_t crgsz, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgsz, crgsz, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgsz;
    (void)crgsz;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(void* propvar, void* pprgsz, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringVectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgsz, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgsz;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(void* propvarin, void* pszdefault) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringWithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, pszdefault);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)propvarin;
    (void)pszdefault;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(void* propvarin, void* puiret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, puiret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)puiret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16VectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(void* propvarin, uint16_t uidefault) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, uidefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propvarin;
    (void)uidefault;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(void* propvarin, void* pulret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, pulret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)pulret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32VectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(void* propvarin, uint32_t uldefault) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, uldefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propvarin;
    (void)uldefault;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(void* propvarin, void* pullret) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, pullret);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvarin;
    (void)pullret;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(void* propvar, void* prgn, uint32_t crgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64Vector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, prgn, crgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(void* propvar, void* pprgn, void* pcelem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64VectorAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, pprgn, pcelem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(void* propvarin, uint64_t ulldefault) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64WithDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvarin, ulldefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propvarin;
    (void)ulldefault;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(void* ppropvar, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropvar, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppropvar;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(void* propvar, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToWinRTPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvar, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvar;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageReadClassStg(void* pstg, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadClassStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageReadClassStm(void* pstm, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadClassStm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(void* pstg, void* pcf, void* lplpszusertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFmtUserTypeStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, pcf, lplpszusertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)pcf;
    (void)lplpszusertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(void* pstg, int32_t fconvert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConvertStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, fconvert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)fconvert;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(void* pprop, uint16_t codepage, void* pvar, void* pma) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgConvertPropertyToVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprop, codepage, pvar, pma);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pprop;
    (void)codepage;
    (void)pvar;
    (void)pma;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(void* pvar, uint16_t codepage, void* pprop, void* pcb, uint32_t pid, bool freserved, void* pcindirect) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgConvertVariantToProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvar, codepage, pprop, pcb, pid, freserved, pcindirect);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pvar;
    (void)codepage;
    (void)pprop;
    (void)pcb;
    (void)pid;
    (void)freserved;
    (void)pcindirect;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(void* pwcsname, uint32_t grfmode, uint32_t reserved, void* ppstgopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreateDocfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsname, grfmode, reserved, ppstgopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(void* plkbyt, uint32_t grfmode, uint32_t reserved, void* ppstgopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreateDocfileOnILockBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plkbyt, grfmode, reserved, ppstgopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plkbyt;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(void* pstorage, uint32_t dwreserved, void* pppropsetstg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreatePropSetStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstorage, dwreserved, pppropsetstg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstorage;
    (void)dwreserved;
    (void)pppropsetstg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(void* punk, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreatePropStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, fmtid, pclsid, grfflags, dwreserved, pppropstg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)fmtid;
    (void)pclsid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreateStorageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsname, grfmode, stgfmt, grfattrs, pstgoptions, psecuritydescriptor, riid, ppobjectopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(void* pprop, uint32_t cbmax, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgDeserializePropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprop, cbmax, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprop;
    (void)cbmax;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(void* pwcsname, void* ppflb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgGetIFillLockBytesOnFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsname, ppflb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsname;
    (void)ppflb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(void* pilb, void* ppflb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgGetIFillLockBytesOnILockBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pilb, ppflb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pilb;
    (void)ppflb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(void* pwcsname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgIsStorageFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(void* plkbyt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgIsStorageILockBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plkbyt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plkbyt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(void* pflb, uint32_t grfmode, uint32_t asyncflags, void* ppstgopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenAsyncDocfileOnIFillLockBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflb, grfmode, asyncflags, ppstgopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pflb;
    (void)grfmode;
    (void)asyncflags;
    (void)ppstgopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(void* pwcsdfname, uint32_t grfmode, uint32_t reserved, void* ppstgopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dflayout.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenLayoutDocfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsdfname, grfmode, reserved, ppstgopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsdfname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(void* punk, void* fmtid, uint32_t grfflags, uint32_t dwreserved, void* pppropstg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenPropStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, fmtid, grfflags, dwreserved, pppropstg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)fmtid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(void* pwcsname, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenStorage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsname, pstgpriority, grfmode, snbexclude, reserved, ppstgopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsname;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(void* pwcsname, uint32_t grfmode, uint32_t stgfmt, uint32_t grfattrs, void* pstgoptions, void* psecuritydescriptor, void* riid, void* ppobjectopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenStorageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcsname, grfmode, stgfmt, grfattrs, pstgoptions, psecuritydescriptor, riid, ppobjectopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(void* plkbyt, void* pstgpriority, uint32_t grfmode, void* snbexclude, uint32_t reserved, void* ppstgopen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenStorageOnILockBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plkbyt, pstgpriority, grfmode, snbexclude, reserved, ppstgopen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plkbyt;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(void* pprop, uint32_t cbprop, uint16_t codepage, uint8_t breserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgPropertyLengthAsVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprop, cbprop, codepage, breserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pprop;
    (void)cbprop;
    (void)codepage;
    (void)breserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(void* ppropvar, void* ppprop, void* pcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgSerializePropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropvar, ppprop, pcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppropvar;
    (void)ppprop;
    (void)pcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(void* lpszname, void* pctime, void* patime, void* pmtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgSetTimes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, pctime, patime, pmtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)pctime;
    (void)patime;
    (void)pmtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(void* pvar, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToPropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvar, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvar;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(void* punkpropertyvalue, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinRTPropertyValueToPropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkpropertyvalue, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkpropertyvalue;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(void* pstg, void* rclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteClassStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, rclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)rclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(void* pstm, void* rclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteClassStm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm, rclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    (void)rclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(void* pstg, uint16_t cf, void* lpszusertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFmtUserTypeStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstg, cf, lpszusertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstg;
    (void)cf;
    (void)lpszusertype;
    errno = ENOSYS;
    return -1;
#endif
}

