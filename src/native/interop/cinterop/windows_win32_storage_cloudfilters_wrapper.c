#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_cloudfilters_wrapper.h"
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

void windowssys_windows_win32_storage_cloudfilters_CfCloseHandle(void* filehandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filehandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot(void* syncrootpath, void* callbacktable, void* callbackcontext, int32_t connectflags, void* connectionkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfConnectSyncRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syncrootpath, callbacktable, callbackcontext, connectflags, connectionkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syncrootpath;
    (void)callbacktable;
    (void)callbackcontext;
    (void)connectflags;
    (void)connectionkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder(void* filehandle, void* fileidentity, uint32_t fileidentitylength, int32_t convertflags, void* convertusn, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfConvertToPlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, fileidentity, fileidentitylength, convertflags, convertusn, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)convertflags;
    (void)convertusn;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders(void* basedirectorypath, void* placeholderarray, uint32_t placeholdercount, int32_t createflags, void* entriesprocessed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfCreatePlaceholders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(basedirectorypath, placeholderarray, placeholdercount, createflags, entriesprocessed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)basedirectorypath;
    (void)placeholderarray;
    (void)placeholdercount;
    (void)createflags;
    (void)entriesprocessed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t dehydrateflags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfDehydratePlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, startingoffset, length, dehydrateflags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)dehydrateflags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot(int64_t connectionkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfDisconnectSyncRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfExecute(void* opinfo, void* opparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfExecute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opinfo, opparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)opinfo;
    (void)opparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector(void* filehandle, void* correlationvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetCorrelationVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, correlationvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)correlationvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, infoclass, infobuffer, infobufferlength, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo(void* filehandle, int32_t infoclass, int64_t startingoffset, int64_t length, void* infobuffer, uint32_t infobufferlength, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, infoclass, startingoffset, length, infobuffer, infobufferlength, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)startingoffset;
    (void)length;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration(int64_t connectionkey, int64_t transferkey, int64_t fileid, int32_t infoclass, int64_t startingoffset, int64_t rangelength, void* infobuffer, uint32_t infobuffersize, void* infobufferwritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfoForHydration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer, infobuffersize, infobufferwritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)fileid;
    (void)infoclass;
    (void)startingoffset;
    (void)rangelength;
    (void)infobuffer;
    (void)infobuffersize;
    (void)infobufferwritten;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag(uint32_t fileattributes, uint32_t reparsetag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromAttributeTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileattributes, reparsetag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fileattributes;
    (void)reparsetag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo(void* infobuffer, int32_t infoclass) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFileInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infobuffer, infoclass);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)infobuffer;
    (void)infoclass;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData(void* finddata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFindData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(finddata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)finddata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo(void* platformversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlatformInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(platformversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)platformversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetSyncRootInfoByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, infoclass, infobuffer, infobufferlength, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath(void* filepath, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetSyncRootInfoByPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filepath, infoclass, infobuffer, infobufferlength, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filepath;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey(void* filehandle, void* transferkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetTransferKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, transferkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)transferkey;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle(void* protectedhandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetWin32HandleFromProtectedHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protectedhandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)protectedhandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t hydrateflags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfHydratePlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, startingoffset, length, hydrateflags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)hydrateflags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock(void* filepath, int32_t flags, void* protectedhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfOpenFileWithOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filepath, flags, protectedhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filepath;
    (void)flags;
    (void)protectedhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus(int64_t connectionkey, void* providerstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfQuerySyncProviderStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionkey, providerstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionkey;
    (void)providerstatus;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle(void* protectedhandle) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReferenceProtectedHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protectedhandle);
    }
    errno = ENOSYS;
    return false;
#else
    (void)protectedhandle;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot(void* syncrootpath, void* registration, void* policies, int32_t registerflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfRegisterSyncRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syncrootpath, registration, policies, registerflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syncrootpath;
    (void)registration;
    (void)policies;
    (void)registerflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle(void* protectedhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReleaseProtectedHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(protectedhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)protectedhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey(void* filehandle, void* transferkey) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReleaseTransferKey");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filehandle, transferkey);
        return;
    }
    errno = ENOSYS;
#else
    (void)filehandle;
    (void)transferkey;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress(int64_t connectionkey, int64_t transferkey, int64_t providerprogresstotal, int64_t providerprogresscompleted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportProviderProgress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2(int64_t connectionkey, int64_t transferkey, int64_t requestkey, int64_t providerprogresstotal, int64_t providerprogresscompleted, uint32_t targetsessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportProviderProgress2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)requestkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    (void)targetsessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus(void* syncrootpath, void* syncstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportSyncStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syncrootpath, syncstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syncrootpath;
    (void)syncstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder(void* filehandle, int32_t revertflags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfRevertPlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, revertflags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)revertflags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector(void* filehandle, void* correlationvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetCorrelationVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, correlationvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)correlationvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState(void* filehandle, int32_t insyncstate, int32_t insyncflags, void* insyncusn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetInSyncState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, insyncstate, insyncflags, insyncusn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)insyncstate;
    (void)insyncflags;
    (void)insyncusn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfSetPinState(void* filehandle, int32_t pinstate, int32_t pinflags, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetPinState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, pinstate, pinflags, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)pinstate;
    (void)pinflags;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot(void* syncrootpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUnregisterSyncRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syncrootpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syncrootpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder(void* filehandle, void* fsmetadata, void* fileidentity, uint32_t fileidentitylength, void* dehydraterangearray, uint32_t dehydraterangecount, int32_t updateflags, void* updateusn, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUpdatePlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, fsmetadata, fileidentity, fileidentitylength, dehydraterangearray, dehydraterangecount, updateflags, updateusn, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)fsmetadata;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)dehydraterangearray;
    (void)dehydraterangecount;
    (void)updateflags;
    (void)updateusn;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus(int64_t connectionkey, uint32_t providerstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUpdateSyncProviderStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionkey, providerstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionkey;
    (void)providerstatus;
    errno = ENOSYS;
    return -1;
#endif
}

