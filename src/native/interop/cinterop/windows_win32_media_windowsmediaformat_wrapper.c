#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_media_windowsmediaformat_wrapper.h"
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

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer(void* pcallback, void* ppbackup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateBackupRestorer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcallback, ppbackup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcallback;
    (void)ppbackup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor(void* ppeditor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateEditor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppeditor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppeditor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer(void* ppindexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateIndexer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppindexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppindexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager(void* ppprofilemanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateProfileManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppprofilemanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppprofilemanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateReader(void* punkcert, uint32_t dwrights, void* ppreader) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateReader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkcert, dwrights, ppreader);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkcert;
    (void)dwrights;
    (void)ppreader;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader(void* punkcert, uint32_t dwrights, void* ppsyncreader) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateSyncReader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkcert, dwrights, ppsyncreader);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkcert;
    (void)dwrights;
    (void)ppsyncreader;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter(void* punkcert, void* ppwriter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkcert, ppwriter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkcert;
    (void)ppwriter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink(void* ppsink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriterFileSink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink(void* ppsink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriterNetworkSink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink(void* ppsink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriterPushSink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected(void* pwszfilename, void* pfisprotected) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMIsContentProtected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszfilename, pfisprotected);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszfilename;
    (void)pfisprotected;
    errno = ENOSYS;
    return -1;
#endif
}

