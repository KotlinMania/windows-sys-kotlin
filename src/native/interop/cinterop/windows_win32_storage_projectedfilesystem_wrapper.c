#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_projectedfilesystem_wrapper.h"
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

void* windowssys_windows_win32_storage_projectedfilesystem_prjAllocateAlignedBuffer(void* namespacevirtualizationcontext, uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjAllocateAlignedBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)namespacevirtualizationcontext;
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjClearNegativePathCache(void* namespacevirtualizationcontext, void* totalentrynumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjClearNegativePathCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, totalentrynumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)totalentrynumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjCompleteCommand(void* namespacevirtualizationcontext, int32_t commandid, int32_t completionresult, void* extendedparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjCompleteCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, commandid, completionresult, extendedparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)commandid;
    (void)completionresult;
    (void)extendedparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjDeleteFile(void* namespacevirtualizationcontext, void* destinationfilename, int32_t updateflags, void* failurereason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjDeleteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, destinationfilename, updateflags, failurereason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)updateflags;
    (void)failurereason;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_storage_projectedfilesystem_prjDoesNameContainWildCards(void* filename) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjDoesNameContainWildCards");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filename;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjFileNameCompare(void* filename1, void* filename2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFileNameCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename1, filename2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename1;
    (void)filename2;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_storage_projectedfilesystem_prjFileNameMatch(void* filenametocheck, void* pattern) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFileNameMatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filenametocheck, pattern);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filenametocheck;
    (void)pattern;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer(void* filename, void* filebasicinfo, void* direntrybufferhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFillDirEntryBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, filebasicinfo, direntrybufferhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)filebasicinfo;
    (void)direntrybufferhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjFillDirEntryBuffer2(void* direntrybufferhandle, void* filename, void* filebasicinfo, void* extendedinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFillDirEntryBuffer2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(direntrybufferhandle, filename, filebasicinfo, extendedinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)direntrybufferhandle;
    (void)filename;
    (void)filebasicinfo;
    (void)extendedinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_projectedfilesystem_prjFreeAlignedBuffer(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFreeAlignedBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjGetOnDiskFileState(void* destinationfilename, void* filestate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjGetOnDiskFileState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationfilename, filestate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationfilename;
    (void)filestate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjGetVirtualizationInstanceInfo(void* namespacevirtualizationcontext, void* virtualizationinstanceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjGetVirtualizationInstanceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, virtualizationinstanceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)virtualizationinstanceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjMarkDirectoryAsPlaceholder(void* rootpathname, void* targetpathname, void* versioninfo, void* virtualizationinstanceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjMarkDirectoryAsPlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpathname, targetpathname, versioninfo, virtualizationinstanceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootpathname;
    (void)targetpathname;
    (void)versioninfo;
    (void)virtualizationinstanceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjStartVirtualizing(void* virtualizationrootpath, void* callbacks, void* instancecontext, void* options, void* namespacevirtualizationcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjStartVirtualizing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualizationrootpath, callbacks, instancecontext, options, namespacevirtualizationcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)virtualizationrootpath;
    (void)callbacks;
    (void)instancecontext;
    (void)options;
    (void)namespacevirtualizationcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_projectedfilesystem_prjStopVirtualizing(void* namespacevirtualizationcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjStopVirtualizing");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(namespacevirtualizationcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)namespacevirtualizationcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjUpdateFileIfNeeded(void* namespacevirtualizationcontext, void* destinationfilename, void* placeholderinfo, uint32_t placeholderinfosize, int32_t updateflags, void* failurereason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjUpdateFileIfNeeded");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize, updateflags, failurereason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    (void)updateflags;
    (void)failurereason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjWriteFileData(void* namespacevirtualizationcontext, void* datastreamid, void* buffer, uint64_t byteoffset, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjWriteFileData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, datastreamid, buffer, byteoffset, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)datastreamid;
    (void)buffer;
    (void)byteoffset;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo(void* namespacevirtualizationcontext, void* destinationfilename, void* placeholderinfo, uint32_t placeholderinfosize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjWritePlaceholderInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_projectedfilesystem_prjWritePlaceholderInfo2(void* namespacevirtualizationcontext, void* destinationfilename, void* placeholderinfo, uint32_t placeholderinfosize, void* extendedinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjWritePlaceholderInfo2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize, extendedinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    (void)extendedinfo;
    errno = ENOSYS;
    return -1;
#endif
}

