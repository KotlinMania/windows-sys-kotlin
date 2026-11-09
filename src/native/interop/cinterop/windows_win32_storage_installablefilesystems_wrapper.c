#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_installablefilesystems_wrapper.h"
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

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterAttach(void* lpfiltername, void* lpvolumename, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterAttach");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername, lpvolumename, lpinstancename, dwcreatedinstancenamelength, lpcreatedinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpinstancename;
    (void)dwcreatedinstancenamelength;
    (void)lpcreatedinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterAttachAtAltitude(void* lpfiltername, void* lpvolumename, void* lpaltitude, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterAttachAtAltitude");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername, lpvolumename, lpaltitude, lpinstancename, dwcreatedinstancenamelength, lpcreatedinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpaltitude;
    (void)lpinstancename;
    (void)dwcreatedinstancenamelength;
    (void)lpcreatedinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterClose(int64_t hfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterConnectCommunicationPort(void* lpportname, uint32_t dwoptions, void* lpcontext, uint16_t wsizeofcontext, void* lpsecurityattributes, void* hport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterConnectCommunicationPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpportname, dwoptions, lpcontext, wsizeofcontext, lpsecurityattributes, hport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpportname;
    (void)dwoptions;
    (void)lpcontext;
    (void)wsizeofcontext;
    (void)lpsecurityattributes;
    (void)hport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterCreate(void* lpfiltername, void* hfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername, hfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    (void)hfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterDetach(void* lpfiltername, void* lpvolumename, void* lpinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterDetach");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername, lpvolumename, lpinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterFindClose(void* hfilterfind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterFindClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfilterfind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfilterfind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterfind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterFindFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned, lpfilterfind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpfilterfind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterFindNext(void* hfilterfind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterFindNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfilterfind, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfilterfind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterGetDosName(void* lpvolumename, void* lpdosname, uint32_t dwdosnamebuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterGetDosName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpvolumename, lpdosname, dwdosnamebuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpvolumename;
    (void)lpdosname;
    (void)dwdosnamebuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterGetInformation(int64_t hfilter, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterGetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfilter, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfilter;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterGetMessage(void* hport, void* lpmessagebuffer, uint32_t dwmessagebuffersize, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterGetMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hport, lpmessagebuffer, dwmessagebuffersize, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hport;
    (void)lpmessagebuffer;
    (void)dwmessagebuffersize;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceClose(int64_t hinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceCreate(void* lpfiltername, void* lpvolumename, void* lpinstancename, void* hinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername, lpvolumename, lpinstancename, hinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpinstancename;
    (void)hinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindClose(void* hfilterinstancefind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceFindClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfilterinstancefind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfilterinstancefind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindFirst(void* lpfiltername, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterinstancefind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceFindFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned, lpfilterinstancefind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpfilterinstancefind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindNext(void* hfilterinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceFindNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfilterinstancefind, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfilterinstancefind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceGetInformation(int64_t hinstance, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceGetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterLoad(void* lpfiltername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterLoad");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterReplyMessage(void* hport, void* lpreplybuffer, uint32_t dwreplybuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterReplyMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hport, lpreplybuffer, dwreplybuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hport;
    (void)lpreplybuffer;
    (void)dwreplybuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterSendMessage(void* hport, void* lpinbuffer, uint32_t dwinbuffersize, void* lpoutbuffer, uint32_t dwoutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterSendMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hport, lpinbuffer, dwinbuffersize, lpoutbuffer, dwoutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hport;
    (void)lpinbuffer;
    (void)dwinbuffersize;
    (void)lpoutbuffer;
    (void)dwoutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterUnload(void* lpfiltername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterUnload");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiltername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiltername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindClose(void* hvolumefind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeFindClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hvolumefind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hvolumefind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumefind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeFindFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned, lpvolumefind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpvolumefind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindNext(void* hvolumefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeFindNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hvolumefind, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hvolumefind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindClose(void* hvolumeinstancefind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeInstanceFindClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hvolumeinstancefind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hvolumeinstancefind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindFirst(void* lpvolumename, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumeinstancefind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeInstanceFindFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpvolumename, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned, lpvolumeinstancefind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpvolumename;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpvolumeinstancefind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindNext(void* hvolumeinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeInstanceFindNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hvolumeinstancefind, dwinformationclass, lpbuffer, dwbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hvolumeinstancefind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

