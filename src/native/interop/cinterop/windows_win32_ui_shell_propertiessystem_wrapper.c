#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_shell_propertiessystem_wrapper.h"
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

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCoerceToCanonicalValue(void* key, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCoerceToCanonicalValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateAdapterFromPropertyStore(void* pps, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateAdapterFromPropertyStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateDelayedMultiplexPropertyStore(int32_t flags, void* pdpsf, void* rgstoreids, uint32_t cstores, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateDelayedMultiplexPropertyStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, pdpsf, rgstoreids, cstores, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)pdpsf;
    (void)rgstoreids;
    (void)cstores;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMemoryPropertyStore(void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateMemoryPropertyStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMultiplexPropertyStore(void* prgpunkstores, uint32_t cstores, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateMultiplexPropertyStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prgpunkstores, cstores, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prgpunkstores;
    (void)cstores;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyChangeArray(void* rgpropkey, void* rgflags, void* rgpropvar, uint32_t cchanges, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreatePropertyChangeArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rgpropkey, rgflags, rgpropvar, cchanges, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rgpropkey;
    (void)rgflags;
    (void)rgpropvar;
    (void)cchanges;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromObject(void* punk, uint32_t grfmode, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreatePropertyStoreFromObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, grfmode, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)grfmode;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromPropertySetStorage(void* ppss, uint32_t grfmode, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreatePropertyStoreFromPropertySetStorage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppss, grfmode, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppss;
    (void)grfmode;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateSimplePropertyChange(int32_t flags, void* key, void* propvar, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateSimplePropertyChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, key, propvar, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)key;
    (void)propvar;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSEnumeratePropertyDescriptions(int32_t filteron, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSEnumeratePropertyDescriptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filteron, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filteron;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplay(void* propkey, void* propvar, int32_t pdfflags, void* pwsztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSFormatForDisplay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propkey, propvar, pdfflags, pwsztext, cchtext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propkey;
    (void)propvar;
    (void)pdfflags;
    (void)pwsztext;
    (void)cchtext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplayAlloc(void* key, void* propvar, int32_t pdff, void* ppszdisplay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSFormatForDisplayAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, propvar, pdff, ppszdisplay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    (void)propvar;
    (void)pdff;
    (void)ppszdisplay;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSFormatPropertyValue(void* pps, void* ppd, int32_t pdff, void* ppszdisplay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSFormatPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, ppd, pdff, ppszdisplay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)ppd;
    (void)pdff;
    (void)ppszdisplay;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetImageReferenceForValue(void* propkey, void* propvar, void* ppszimageres) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetImageReferenceForValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propkey, propvar, ppszimageres);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propkey;
    (void)propvar;
    (void)ppszimageres;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandler(void* punkitem, int32_t freadwrite, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetItemPropertyHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkitem, freadwrite, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkitem;
    (void)freadwrite;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandlerWithCreateObject(void* punkitem, int32_t freadwrite, void* punkcreateobject, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetItemPropertyHandlerWithCreateObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkitem, freadwrite, punkcreateobject, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkitem;
    (void)freadwrite;
    (void)punkcreateobject;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetNameFromPropertyKey(void* propkey, void* ppszcanonicalname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetNameFromPropertyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propkey, ppszcanonicalname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propkey;
    (void)ppszcanonicalname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetNamedPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* pszname, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetNamedPropertyFromPropertyStorage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psps, cb, pszname, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psps;
    (void)cb;
    (void)pszname;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescription(void* propkey, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propkey, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propkey;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionByName(void* pszcanonicalname, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyDescriptionByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcanonicalname, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcanonicalname;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionListFromString(void* pszproplist, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyDescriptionListFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszproplist, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszproplist;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* rpkey, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyFromPropertyStorage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psps, cb, rpkey, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psps;
    (void)cb;
    (void)rpkey;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyKeyFromName(void* pszname, void* ppropkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyKeyFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, ppropkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)ppropkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertySystem(void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertySystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyValue(void* pps, void* ppd, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, ppd, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)ppd;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSLookupPropertyHandlerCLSID(void* pszfilepath, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSLookupPropertyHandlerCLSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilepath, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfilepath;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_Delete(void* propbag, void* propname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_Delete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBOOL(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadBOOL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBSTR(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadBSTR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadDWORD(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadDWORD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadGUID(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadGUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadInt(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadLONG(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadLONG");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTL(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadPOINTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTS(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadPOINTS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPropertyKey(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadPropertyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadRECTL(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadRECTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadSHORT(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadSHORT");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStr(void* propbag, void* propname, void* value, int32_t charactercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value, charactercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    (void)charactercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStrAlloc(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadStrAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStream(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadType(void* propbag, void* propname, void* var, uint16_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, var, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)var;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadULONGLONG(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadULONGLONG");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadUnknown(void* propbag, void* propname, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadUnknown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBOOL(void* propbag, void* propname, int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteBOOL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBSTR(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteBSTR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteDWORD(void* propbag, void* propname, uint32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteDWORD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteGUID(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteGUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteInt(void* propbag, void* propname, int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteLONG(void* propbag, void* propname, int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteLONG");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTL(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WritePOINTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTS(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WritePOINTS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePropertyKey(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WritePropertyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteRECTL(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteRECTL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteSHORT(void* propbag, void* propname, int16_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteSHORT");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStr(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStream(void* propbag, void* propname, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteULONGLONG(void* propbag, void* propname, uint64_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteULONGLONG");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteUnknown(void* propbag, void* propname, void* punk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteUnknown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propbag, propname, punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propbag;
    (void)propname;
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyKeyFromString(void* pszstring, void* pkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyKeyFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszstring, pkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszstring;
    (void)pkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSRefreshPropertySchema(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSRefreshPropertySchema");
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

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSRegisterPropertySchema(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSRegisterPropertySchema");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSSetPropertyValue(void* pps, void* ppd, void* propvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSSetPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, ppd, propvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)ppd;
    (void)propvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSStringFromPropertyKey(void* pkey, void* psz, uint32_t cch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSStringFromPropertyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pkey, psz, cch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pkey;
    (void)psz;
    (void)cch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSUnregisterPropertySchema(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSUnregisterPropertySchema");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_CloseProperties(void* hprops, uint32_t flopt) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_CloseProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprops, flopt);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprops;
    (void)flopt;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_GetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_GetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprops, pszgroup, lpprops, cbprops, flopt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprops;
    (void)pszgroup;
    (void)lpprops;
    (void)cbprops;
    (void)flopt;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_OpenProperties(void* pszapp, void* pszpif, uint32_t hinf, uint32_t flopt) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_OpenProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszapp, pszpif, hinf, flopt);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszapp;
    (void)pszpif;
    (void)hinf;
    (void)flopt;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_SetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_SetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprops, pszgroup, lpprops, cbprops, flopt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprops;
    (void)pszgroup;
    (void)lpprops;
    (void)cbprops;
    (void)flopt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHAddDefaultPropertiesByExt(void* pszext, void* ppropstore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAddDefaultPropertiesByExt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszext, ppropstore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszext;
    (void)ppropstore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreForWindow(void* hwnd, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPropertyStoreForWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromIDList(void* pidl, int32_t flags, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPropertyStoreFromIDList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidl, flags, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidl;
    (void)flags;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromParsingName(void* pszpath, void* pbc, int32_t flags, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPropertyStoreFromParsingName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pbc, flags, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pbc;
    (void)flags;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgCreate(void* psstg, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t grfmode, uint32_t dwdisposition, void* ppstg, void* pucodepage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPropStgCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psstg, fmtid, pclsid, grfflags, grfmode, dwdisposition, ppstg, pucodepage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psstg;
    (void)fmtid;
    (void)pclsid;
    (void)grfflags;
    (void)grfmode;
    (void)dwdisposition;
    (void)ppstg;
    (void)pucodepage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgReadMultiple(void* pps, uint32_t ucodepage, uint32_t cpspec, void* rgpspec, void* rgvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPropStgReadMultiple");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, ucodepage, cpspec, rgpspec, rgvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)ucodepage;
    (void)cpspec;
    (void)rgpspec;
    (void)rgvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgWriteMultiple(void* pps, void* pucodepage, uint32_t cpspec, void* rgpspec, void* rgvar, uint32_t propidnamefirst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPropStgWriteMultiple");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pps, pucodepage, cpspec, rgpspec, rgvar, propidnamefirst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pps;
    (void)pucodepage;
    (void)cpspec;
    (void)rgpspec;
    (void)rgvar;
    (void)propidnamefirst;
    errno = ENOSYS;
    return -1;
#endif
}

