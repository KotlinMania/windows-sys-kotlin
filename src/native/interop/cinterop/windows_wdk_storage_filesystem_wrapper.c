#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_storage_filesystem_wrapper.h"
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

int32_t windowssys_windows_wdk_storage_filesystem_ApplyControlToken(void* phcontext, void* pinput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyControlToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, pinput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)pinput;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead(void* fileobject, void* fileoffset, uint32_t length, bool wait, void* buffer, void* iostatus, int64_t ioissuerthread, void* asyncreadcontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcAsyncCopyRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, buffer, iostatus, ioissuerthread, asyncreadcontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    (void)asyncreadcontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcCanIWrite(void* fileobject, uint32_t bytestowrite, bool wait, uint8_t retrying) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, bool, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCanIWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, bytestowrite, wait, retrying);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)bytestowrite;
    (void)wait;
    (void)retrying;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache(void* sectionobjectpointer, void* fileoffset, uint32_t length, void* iostatus, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCoherencyFlushAndPurgeCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sectionobjectpointer, fileoffset, length, iostatus, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
    (void)flags;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcCopyRead(void* fileobject, void* fileoffset, uint32_t length, bool wait, void* buffer, void* iostatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, buffer, iostatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcCopyReadEx(void* fileobject, void* fileoffset, uint32_t length, bool wait, void* buffer, void* iostatus, int64_t ioissuerthread) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyReadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, buffer, iostatus, ioissuerthread);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcCopyWrite(void* fileobject, void* fileoffset, uint32_t length, bool wait, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx(void* fileobject, void* fileoffset, uint32_t length, bool wait, void* buffer, int64_t ioissuerthread) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWriteEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, buffer, ioissuerthread);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)ioissuerthread;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush(void* fileobject, void* fileoffset, uint32_t length) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWriteWontFlush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcDeferWrite(void* fileobject, void* postroutine, void* context1, void* context2, uint32_t bytestowrite, bool retrying) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcDeferWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, postroutine, context1, context2, bytestowrite, retrying);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)postroutine;
    (void)context1;
    (void)context2;
    (void)bytestowrite;
    (void)retrying;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine(void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcErrorCallbackRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcFastCopyRead(void* fileobject, uint32_t fileoffset, uint32_t length, uint32_t pagecount, void* buffer, void* iostatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFastCopyRead");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, length, pagecount, buffer, iostatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)pagecount;
    (void)buffer;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite(void* fileobject, uint32_t fileoffset, uint32_t length, void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFastCopyWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, length, buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)buffer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcFlushCache(void* sectionobjectpointer, void* fileoffset, uint32_t length, void* iostatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFlushCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sectionobjectpointer, fileoffset, length, iostatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages(void* loghandle, void* dirtypageroutine, void* context1, void* context2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetDirtyPages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loghandle, dirtypageroutine, context1, context2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loghandle;
    (void)dirtypageroutine;
    (void)context1;
    (void)context2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb(void* bcb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromBcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bcb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bcb;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs(void* sectionobjectpointer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sectionobjectpointer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef(void* sectionobjectpointer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrsRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sectionobjectpointer;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData(void* sectionobjectpointer, bool bcblistheld) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFlushedValidData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer, bcblistheld);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionobjectpointer;
    (void)bcblistheld;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap(void* fileobject, void* filesizes, bool pinaccess, void* callbacks, void* lazywritecontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcInitializeCacheMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, filesizes, pinaccess, callbacks, lazywritecontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx(void* fileobject, void* filesizes, bool pinaccess, void* callbacks, void* lazywritecontext, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcInitializeCacheMapEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, filesizes, pinaccess, callbacks, lazywritecontext, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
    (void)flags;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded(int32_t status) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsCacheManagerCallbackNeeded");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return false;
#else
    (void)status;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData(void* vpb) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsThereDirtyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vpb);
    }
    errno = ENOSYS;
    return false;
#else
    (void)vpb;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx(void* vpb, void* numberofdirtypages) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsThereDirtyDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vpb, numberofdirtypages);
    }
    errno = ENOSYS;
    return false;
#else
    (void)vpb;
    (void)numberofdirtypages;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcMapData(void* fileobject, void* fileoffset, uint32_t length, uint32_t flags, void* bcb, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMapData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, flags, bcb, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcMdlRead(void* fileobject, void* fileoffset, uint32_t length, void* mdlchain, void* iostatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlRead");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, length, mdlchain, iostatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete(void* fileobject, void* mdlchain) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlReadComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, mdlchain);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort(void* fileobject, void* mdlchain) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlWriteAbort");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, mdlchain);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete(void* fileobject, void* fileoffset, void* mdlchain) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlWriteComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, mdlchain);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcPinMappedData(void* fileobject, void* fileoffset, uint32_t length, uint32_t flags, void* bcb) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPinMappedData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, flags, bcb);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcPinRead(void* fileobject, void* fileoffset, uint32_t length, uint32_t flags, void* bcb, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPinRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, flags, bcb, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite(void* fileobject, void* fileoffset, uint32_t length, void* mdlchain, void* iostatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPrepareMdlWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, length, mdlchain, iostatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite(void* fileobject, void* fileoffset, uint32_t length, bool zero, uint32_t flags, void* bcb, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPreparePinWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, zero, flags, bcb, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)zero;
    (void)flags;
    (void)bcb;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection(void* sectionobjectpointer, void* fileoffset, uint32_t length, uint32_t flags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPurgeCacheSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer, fileoffset, length, flags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)flags;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_CcRemapBcb(void* bcb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcRemapBcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bcb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bcb;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcRepinBcb(void* bcb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcRepinBcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bcb);
        return;
    }
    errno = ENOSYS;
#else
    (void)bcb;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead(void* fileobject, void* fileoffset, uint32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcScheduleReadAhead");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx(void* fileobject, void* fileoffset, uint32_t length, int64_t ioissuerthread) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcScheduleReadAheadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, fileoffset, length, ioissuerthread);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)ioissuerthread;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes(void* fileobject, bool disablereadahead, bool disablewritebehind) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, disablereadahead, disablewritebehind);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)disablereadahead;
    (void)disablewritebehind;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx(void* fileobject, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer(void* bcb, void* ownerpointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetBcbOwnerPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bcb, ownerpointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)bcb;
    (void)ownerpointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold(void* fileobject, uint32_t dirtypagethreshold) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetDirtyPageThreshold");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, dirtypagethreshold);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)dirtypagethreshold;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData(void* bcbvoid, void* lsn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetDirtyPinnedData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bcbvoid, lsn);
        return;
    }
    errno = ENOSYS;
#else
    (void)bcbvoid;
    (void)lsn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetFileSizes(void* fileobject, void* filesizes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetFileSizes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, filesizes);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)filesizes;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx(void* fileobject, void* filesizes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetFileSizesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, filesizes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)filesizes;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile(void* fileobject, void* loghandle, void* flushtolsnroutine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetLogHandleForFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, loghandle, flushtolsnroutine);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)loghandle;
    (void)flushtolsnroutine;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile(void* fileobject, bool enableparallelflush) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetParallelFlushFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, enableparallelflush);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)enableparallelflush;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity(void* fileobject, uint32_t granularity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetReadAheadGranularity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject, granularity);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    (void)granularity;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap(void* fileobject, void* truncatesize, void* uninitializeevent) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUninitializeCacheMap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, truncatesize, uninitializeevent);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)truncatesize;
    (void)uninitializeevent;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcUnpinData(void* bcb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bcb);
        return;
    }
    errno = ENOSYS;
#else
    (void)bcb;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread(void* bcb, uint64_t resourcethreadid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinDataForThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bcb, resourcethreadid);
        return;
    }
    errno = ENOSYS;
#else
    (void)bcb;
    (void)resourcethreadid;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb(void* bcb, bool writethrough, void* iostatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinRepinnedBcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bcb, writethrough, iostatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)bcb;
    (void)writethrough;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcWaitForCurrentLazyWriterActivity");
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

bool windowssys_windows_wdk_storage_filesystem_CcZeroData(void* fileobject, void* startoffset, void* endoffset, bool wait) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcZeroData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, startoffset, endoffset, wait);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)startoffset;
    (void)endoffset;
    (void)wait;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_CompleteAuthToken(void* phcontext, void* ptoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteAuthToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ptoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ptoken;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite(void* resource) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExDisableResourceBoostLite");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resource);
        return;
    }
    errno = ENOSYS;
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize(void* poolblock, void* quotacharged) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExQueryPoolBlockSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poolblock, quotacharged);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)poolblock;
    (void)quotacharged;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ExportSecurityContext(void* phcontext, uint32_t fflags, void* ppackedcontext, void* ptoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, fflags, ppackedcontext, ptoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp(void* ecpcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAcknowledgeEcp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ecpcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive(void* fileobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAcquireFileExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry(void* mcb, int64_t vbn, int64_t lbn, int64_t sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx(void* mcb, int64_t vbn, int64_t lbn, int64_t sectorcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry(void* mcb, int64_t vbn, int64_t lbn, int64_t sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddLargeMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry(void* mcb, uint32_t vbn, uint32_t lbn, uint32_t sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache(void* cache, uint64_t directorykey, void* shortname, void* longname, bool keybyshortname, uint32_t datalength, void* data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddToTunnelCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cache, directorykey, shortname, longname, keybyshortname, datalength, data);
        return;
    }
    errno = ENOSYS;
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)keybyshortname;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx(void* cache, uint64_t directorykey, void* shortname, void* longname, uint32_t flags, uint32_t datalength, void* data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddToTunnelCacheEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cache, directorykey, shortname, longname, flags, datalength, data);
        return;
    }
    errno = ENOSYS;
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock(int32_t pooltype, uint32_t tag) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateAePushLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pooltype, tag);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pooltype;
    (void)tag;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter(void* ecptype, uint32_t sizeofcontext, uint32_t flags, void* cleanupcallback, uint32_t pooltag, void* ecpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecptype, sizeofcontext, flags, cleanupcallback, pooltag, ecpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)pooltag;
    (void)ecpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList(void* ecptype, uint32_t sizeofcontext, uint32_t flags, void* cleanupcallback, void* lookasidelist, void* ecpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterFromLookasideList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecptype, sizeofcontext, flags, cleanupcallback, lookasidelist, ecpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)lookasidelist;
    (void)ecpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList(uint32_t flags, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock(void* completelockirproutine, void* unlockroutine) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completelockirproutine, unlockroutine);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)completelockirproutine;
    (void)unlockroutine;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual(void* constantnamea, void* constantnameb, bool ignorecase, void* upcasetable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreNamesEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(constantnamea, constantnameb, ignorecase, upcasetable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)constantnamea;
    (void)constantnameb;
    (void)ignorecase;
    (void)upcasetable;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks(void* filelock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreThereCurrentOrInProgressFileLocks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks(void* filelock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreThereWaitingFileLocks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreVolumeStartupApplicationsComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads(void* targetdevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlBalanceReads");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetdevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetdevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects(uint32_t count, void* objectarray, int32_t waittype, void* timeout, void* waitblockarray, void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCancellableWaitForMultipleObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count, objectarray, waittype, timeout, waitblockarray, irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject(void* object, void* timeout, void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCancellableWaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, timeout, irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)timeout;
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject(void* currentfileobject, void* newfileobject, int32_t changebackingtype, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlChangeBackingFileObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentfileobject, newfileobject, changebackingtype, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currentfileobject;
    (void)newfileobject;
    (void)changebackingtype;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest(void* filelock, void* allocationsize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForOplockRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, allocationsize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)allocationsize;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess(void* filelock, void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForReadAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess(void* filelock, void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForWriteAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock(void* oplock, void* irp, void* context, void* completionroutine, void* postirproutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, context, completionroutine, postirproutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx(void* oplock, void* irp, uint32_t flags, void* context, void* completionroutine, void* postirproutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2(void* oplock, void* irp, uint32_t flags, uint32_t flagsex2, void* completionroutinecontext, void* completionroutine, void* postirproutine, uint64_t timeout, void* notifycontext, void* notifyroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplockEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, flags, flagsex2, completionroutinecontext, completionroutine, postirproutine, timeout, notifycontext, notifyroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)flagsex2;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)postirproutine;
    (void)timeout;
    (void)notifycontext;
    (void)notifyroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock(void* oplock, uint32_t newloweroplockstate, void* completionroutinecontext, void* completionroutine, void* prependroutine, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckUpperOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, newloweroplockstate, completionroutinecontext, completionroutine, prependroutine, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)newloweroplockstate;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)prependroutine;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead(void* fileobject, void* fileoffset, uint32_t length, bool wait, uint32_t lockkey, void* buffer, void* iostatus, void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCopyRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, lockkey, buffer, iostatus, deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite(void* fileobject, void* fileoffset, uint32_t length, bool wait, uint32_t lockkey, void* buffer, void* iostatus, void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCopyWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, wait, lockkey, buffer, iostatus, deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan(void* sectionhandle, void* sectionobject, void* sectionfilesize, void* fileobject, uint32_t desiredaccess, void* objectattributes, void* maximumsize, uint32_t sectionpageprotection, uint32_t allocationattributes, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCreateSectionForDataScan");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, sectionobject, sectionfilesize, fileobject, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)sectionobject;
    (void)sectionfilesize;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentBatchOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentOplockH");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList(void* lookaside, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteExtraCreateParameterLookasideList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lookaside, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)lookaside;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache(void* cache, uint64_t directorykey) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteKeyFromTunnelCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cache, directorykey);
        return;
    }
    errno = ENOSYS;
#else
    (void)cache;
    (void)directorykey;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache(void* cache) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteTunnelCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cache);
        return;
    }
    errno = ENOSYS;
#else
    (void)cache;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeregisterUncProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete(void* deviceobject, int32_t dismountstatus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDismountComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject, dismountstatus);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    (void)dismountstatus;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards(void* name) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDoesDbcsContainWildCards");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return false;
#else
    (void)name;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards(void* name) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDoesNameContainWildCards");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return false;
#else
    (void)name;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead(void* filelock, void* startingbyte, void* length, uint32_t key, void* fileobject, void* processid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastCheckLockForRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, startingbyte, length, key, fileobject, processid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite(void* filelock, void* startingbyte, void* length, uint32_t key, void* fileobject, void* processid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastCheckLockForWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, startingbyte, length, key, fileobject, processid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll(void* filelock, void* fileobject, int64_t processid, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, fileobject, processid, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey(void* filelock, void* fileobject, int64_t processid, uint32_t key, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockAllByKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, fileobject, processid, key, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)key;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle(void* filelock, void* fileobject, void* fileoffset, void* length, int64_t processid, uint32_t key, void* context, bool alreadysynchronized) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockSingle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, fileobject, fileoffset, length, processid, key, context, alreadysynchronized);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)context;
    (void)alreadysynchronized;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter(void* ecplist, void* ecptype, void* ecpcontext, void* ecpcontextsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecplist, ecptype, ecpcontext, ecpcontextsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache(void* cache, uint64_t directorykey, void* name, void* shortname, void* longname, void* datalength, void* data) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindInTunnelCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cache, directorykey, name, shortname, longname, datalength, data);
    }
    errno = ENOSYS;
    return false;
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx(void* cache, uint64_t directorykey, void* name, void* shortname, void* longname, uint32_t flags, void* datalength, void* data) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindInTunnelCacheEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cache, directorykey, name, shortname, longname, flags, datalength, data);
    }
    errno = ENOSYS;
    return false;
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock(void* aepushlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeAePushLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(aepushlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)aepushlock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter(void* ecpcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ecpcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList(void* ecplist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameterList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ecplist);
        return;
    }
    errno = ENOSYS;
#else
    (void)ecplist;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock(void* filelock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filelock);
        return;
    }
    errno = ENOSYS;
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetCurrentProcessLoaderList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp(void* irp, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetEcpListFromIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize(void* fileobject, void* filesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetFileSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, filesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)filesize;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry(void* mcb, uint32_t runindex, void* vbn, void* lbn, void* sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextBaseMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, runindex, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter(void* ecplist, void* currentecpcontext, void* nextecptype, void* nextecpcontext, void* nextecpcontextsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock(void* filelock, bool restart) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, restart);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filelock;
    (void)restart;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry(void* mcb, uint32_t runindex, void* vbn, void* lbn, void* sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextLargeMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, runindex, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry(void* mcb, uint32_t runindex, void* vbn, void* lbn, void* sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, runindex, vbn, lbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation(void* deviceobject, void* sectorsizeinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetSectorSizeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, sectorsizeinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)sectorsizeinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures(void* deviceobject, void* supportedfeatures) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetSupportedFeatures");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, supportedfeatures);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)supportedfeatures;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel(void* deviceobject, void* nestinglevel, void* nestingflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetVirtualDiskNestingLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, nestinglevel, nestingflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)nestinglevel;
    (void)nestingflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastMdlReadWait");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNoWait");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNotPossible");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadResourceMiss");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadWait");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList(void* lookaside, uint32_t flags, uint64_t size, uint32_t tag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitExtraCreateParameterLookasideList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lookaside, flags, size, tag);
        return;
    }
    errno = ENOSYS;
#else
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb(void* mcb, int32_t pooltype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, pooltype);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)pooltype;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx(void* mcb, int32_t pooltype, uint16_t flags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcbEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, pooltype, flags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)pooltype;
    (void)flags;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter(void* ecp, uint32_t ecpflags, void* cleanupcallback, uint32_t totalsize, void* ecptype, void* listallocatedfrom) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ecp, ecpflags, cleanupcallback, totalsize, ecptype, listallocatedfrom);
        return;
    }
    errno = ENOSYS;
#else
    (void)ecp;
    (void)ecpflags;
    (void)cleanupcallback;
    (void)totalsize;
    (void)ecptype;
    (void)listallocatedfrom;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList(void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock(void* filelock, void* completelockirproutine, void* unlockroutine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filelock, completelockirproutine, unlockroutine);
        return;
    }
    errno = ENOSYS;
#else
    (void)filelock;
    (void)completelockirproutine;
    (void)unlockroutine;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb(void* mcb, int32_t pooltype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeLargeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, pooltype);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)pooltype;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb(void* mcb, int32_t pooltype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, pooltype);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)pooltype;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock(void* oplock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oplock);
        return;
    }
    errno = ENOSYS;
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache(void* cache) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeTunnelCache");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cache);
        return;
    }
    errno = ENOSYS;
#else
    (void)cache;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter(void* ecplist, void* ecpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecplist, ecpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecplist;
    (void)ecpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext(void* perfilecontextpointer, void* ptr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerFileContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perfilecontextpointer, ptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)perfilecontextpointer;
    (void)ptr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext(void* fileobject, void* ptr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerFileObjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, ptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)ptr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext(void* perstreamcontext, void* ptr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerStreamContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perstreamcontext, ptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)perstreamcontext;
    (void)ptr;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess(int64_t process) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIs32BitProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return false;
#else
    (void)process;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume(void* fileobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsDaxVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression(void* expression, void* name) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsDbcsInExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(expression, name);
    }
    errno = ENOSYS;
    return false;
#else
    (void)expression;
    (void)name;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged(void* ecpcontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsEcpAcknowledged");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecpcontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)ecpcontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode(void* ecpcontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsEcpFromUserMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecpcontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)ecpcontext;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling(uint32_t startpage, uint32_t numberofpages, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsExtentDangling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(startpage, numberofpages, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)startpage;
    (void)numberofpages;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsMobileOS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression(void* expression, void* name, bool ignorecase, void* upcasetable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNameInExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(expression, name, ignorecase, upcasetable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression(void* expression, void* name, bool ignorecase, void* upcasetable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNameInUnUpcasedExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(expression, name, ignorecase, upcasetable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed(uint32_t reparsetag) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNonEmptyDirectoryReparsePointAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reparsetag);
    }
    errno = ENOSYS;
    return false;
#else
    (void)reparsetag;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected(int32_t exception) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNtstatusExpected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exception);
    }
    errno = ENOSYS;
    return false;
#else
    (void)exception;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile(void* fileobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsPagingFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fileobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile(void* fileobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsSystemPagingFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fileobject;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl(void* deviceobject, uint32_t ioctl, uint8_t flags, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength, void* iosbinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIssueDeviceIoControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, ioctl, flags, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, iosbinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)ioctl;
    (void)flags;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)iosbinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile(void* fileobject, uint32_t fscontrolcode, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength, void* retoutputbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlKernelFsControlFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fscontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, retoutputbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)retoutputbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError(void* filename, void* deviceobject, void* sectionobjectpointer, int32_t flusherror, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLogCcFlushError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, deviceobject, sectionobjectpointer, flusherror, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)deviceobject;
    (void)sectionobjectpointer;
    (void)flusherror;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry(void* mcb, int64_t vbn, void* lbn, void* sectorcountfromlbn, void* startinglbn, void* sectorcountfromstartinglbn, void* arg_6_index) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupBaseMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, arg_6_index);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg_6_index;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry(void* mcb, int64_t vbn, void* lbn, void* sectorcountfromlbn, void* startinglbn, void* sectorcountfromstartinglbn, void* arg_6_index) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLargeMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, arg_6_index);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg_6_index;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry(void* mcb, void* vbn, void* lbn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex(void* opaquemcb, void* largevbn, void* largelbn, void* arg_3_index) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntryAndIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opaquemcb, largevbn, largelbn, arg_3_index);
    }
    errno = ENOSYS;
    return false;
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg_3_index;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry(void* mcb, void* vbn, void* lbn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex(void* opaquemcb, void* largevbn, void* largelbn, void* arg_3_index) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntryAndIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opaquemcb, largevbn, largelbn, arg_3_index);
    }
    errno = ENOSYS;
    return false;
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg_3_index;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry(void* mcb, void* vbn, void* lbn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry(void* mcb, uint32_t vbn, void* lbn, void* sectorcount, void* arg_4_index) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, lbn, sectorcount, arg_4_index);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    (void)arg_4_index;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext(void* perfilecontextpointer, void* ownerid, void* instanceid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerFileContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perfilecontextpointer, ownerid, instanceid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext(void* fileobject, void* ownerid, void* instanceid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerFileObjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, ownerid, instanceid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal(void* streamcontext, void* ownerid, void* instanceid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerStreamContextInternal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(streamcontext, ownerid, instanceid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev(void* fileobject, void* mdlchain, void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadCompleteDev");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, mdlchain, deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)mdlchain;
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev(void* fileobject, void* fileoffset, uint32_t length, uint32_t lockkey, void* mdlchain, void* iostatus, void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadDev");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus, deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx(void* fileobject, void* fileoffset, uint32_t length, uint32_t lockkey, void* mdlchain, void* iostatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev(void* fileobject, void* fileoffset, void* mdlchain, void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlWriteCompleteDev");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, mdlchain, deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName(void* pprovidername, void* pproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMupGetProviderIdFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovidername, pproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovidername;
    (void)pproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject(void* pfileobject, uint32_t level, void* pbuffer, void* pbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMupGetProviderInfoFromFileObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfileobject, level, pbuffer, pbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfileobject;
    (void)level;
    (void)pbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus(int32_t exception, int32_t genericexception) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNormalizeNtstatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exception, genericexception);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exception;
    (void)genericexception;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup(int64_t notifysync, void* notifylist, void* fscontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync, notifylist, fscontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll(int64_t notifysync, void* notifylist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyCleanupAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync, notifylist);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    (void)notifylist;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory(int64_t notifysync, void* notifylist, void* fscontext, void* fulldirectoryname, bool watchtree, bool ignorebuffer, uint32_t completionfilter, void* notifyirp, void* traversecallback, void* subjectcontext, void* filtercallback) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFilterChangeDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync, notifylist, fscontext, fulldirectoryname, watchtree, ignorebuffer, completionfilter, notifyirp, traversecallback, subjectcontext, filtercallback);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    (void)fulldirectoryname;
    (void)watchtree;
    (void)ignorebuffer;
    (void)completionfilter;
    (void)notifyirp;
    (void)traversecallback;
    (void)subjectcontext;
    (void)filtercallback;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange(int64_t notifysync, void* notifylist, void* fulltargetname, uint16_t targetnameoffset, void* streamname, void* normalizedparentname, uint32_t filtermatch, uint32_t action, void* targetcontext, void* filtercontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFilterReportChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync, notifylist, fulltargetname, targetnameoffset, streamname, normalizedparentname, filtermatch, action, targetcontext, filtercontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    (void)notifylist;
    (void)fulltargetname;
    (void)targetnameoffset;
    (void)streamname;
    (void)normalizedparentname;
    (void)filtermatch;
    (void)action;
    (void)targetcontext;
    (void)filtercontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory(int64_t notifysync, void* notifylist, void* fscontext, void* fulldirectoryname, bool watchtree, bool ignorebuffer, uint32_t completionfilter, void* notifyirp, void* traversecallback, void* subjectcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFullChangeDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync, notifylist, fscontext, fulldirectoryname, watchtree, ignorebuffer, completionfilter, notifyirp, traversecallback, subjectcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    (void)fulldirectoryname;
    (void)watchtree;
    (void)ignorebuffer;
    (void)completionfilter;
    (void)notifyirp;
    (void)traversecallback;
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange(int64_t notifysync, void* notifylist, void* fulltargetname, uint16_t targetnameoffset, void* streamname, void* normalizedparentname, uint32_t filtermatch, uint32_t action, void* targetcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFullReportChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync, notifylist, fulltargetname, targetnameoffset, streamname, normalizedparentname, filtermatch, action, targetcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    (void)notifylist;
    (void)fulltargetname;
    (void)targetnameoffset;
    (void)streamname;
    (void)normalizedparentname;
    (void)filtermatch;
    (void)action;
    (void)targetcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync(void* notifysync) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyInitializeSync");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync(void* notifysync) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyUninitializeSync");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(notifysync);
        return;
    }
    errno = ENOSYS;
#else
    (void)notifysync;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent(void* fileobject, uint32_t eventcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, eventcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)eventcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx(void* fileobject, uint32_t eventcode, void* event) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEventEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, eventcode, event);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)eventcode;
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb(void* mcb) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInBaseMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mcb;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb(void* mcb) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInLargeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mcb;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb(void* mcb) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mcb;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH(void* oplock, void* irp, uint32_t flags, void* context, void* completionroutine, void* postirproutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakH");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2(void* oplock, void* irp, uint32_t flags, void* context, void* completionroutine, void* postirproutine, void* grantedaccess, void* shareaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakH2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine, grantedaccess, shareaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    (void)grantedaccess;
    (void)shareaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone(void* oplock, void* irpsp, void* irp, void* context, void* completionroutine, void* postirproutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakToNone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irpsp, irp, context, completionroutine, postirproutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irpsp;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx(void* oplock, void* irp, uint32_t flags, void* context, void* completionroutine, void* postirproutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakToNoneEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl(void* oplock, void* irp, uint32_t opencount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockFsctrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, opencount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx(void* oplock, void* irp, uint32_t opencount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockFsctrlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, opencount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess(void* oplock) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockGetAnyBreakOwnerProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible(void* oplock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockIsFastIoPossible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)oplock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockIsSharedRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual(void* fo1, void* fo2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockKeysEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fo1, fo2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fo1;
    (void)fo2;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow(void* context, void* event, void* stackoverflowroutine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPostPagingFileStackOverflow");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, event, stackoverflowroutine);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow(void* context, void* event, void* stackoverflowroutine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPostStackOverflow");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, event, stackoverflowroutine);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev(void* fileobject, void* fileoffset, uint32_t length, uint32_t lockkey, void* mdlchain, void* iostatus, void* deviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteDev");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus, deviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx(void* fileobject, void* fileoffset, uint32_t length, uint32_t lockkey, void* mdlchain, void* iostatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp(void* ecpcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareToReuseEcp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ecpcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock(void* filelock, void* fileobject, void* fileoffset, void* length, int64_t processid, uint32_t key, bool failimmediately, bool exclusivelock, void* iosb, void* irp, void* context, bool alreadysynchronized) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, bool, bool, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrivateLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, fileobject, fileoffset, length, processid, key, failimmediately, exclusivelock, iosb, irp, context, alreadysynchronized);
    }
    errno = ENOSYS;
    return false;
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)failimmediately;
    (void)exclusivelock;
    (void)iosb;
    (void)irp;
    (void)context;
    (void)alreadysynchronized;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock(void* filelock, void* irp, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlProcessFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filelock, irp, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filelock;
    (void)irp;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl(void* fileobject, void* vdl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryCachedVdl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, vdl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)vdl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile(void* fileobject, void* fileinformation, uint32_t length, int32_t fileinformationclass, void* retfileinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileinformation, length, fileinformationclass, retfileinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)retfileinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile(void* fileobject, void* returnedeadata, uint32_t length, bool returnsingleentry, void* ealist, uint32_t ealistlength, void* eaindex, bool restartscan, void* lengthreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryKernelEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, returnedeadata, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan, lengthreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)returnedeadata;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryMaximumVirtualDiskNestingLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks(void* filterdriverobject, void* callbacks) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterFileSystemFilterCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filterdriverobject, callbacks);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filterdriverobject;
    (void)callbacks;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider(void* muphandle, void* redirectordevicename, bool mailslotssupported) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(muphandle, redirectordevicename, mailslotssupported);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)muphandle;
    (void)redirectordevicename;
    (void)mailslotssupported;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx(void* muphandle, void* redirdevname, void* deviceobject, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(muphandle, redirdevname, deviceobject, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)muphandle;
    (void)redirdevname;
    (void)deviceobject;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2(void* redirdevname, void* deviceobject, void* registration, void* muphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(redirdevname, deviceobject, registration, muphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)redirdevname;
    (void)deviceobject;
    (void)registration;
    (void)muphandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile(void* fileobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlReleaseFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fileobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)fileobject;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry(void* mcb, int64_t vbn, int64_t sectorcount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveBaseMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, sectorcount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath(void* originalstring, uint16_t pathlength, void* newlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveDotsFromPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(originalstring, pathlength, newlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)originalstring;
    (void)pathlength;
    (void)newlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter(void* ecplist, void* ecptype, void* ecpcontext, void* ecpcontextsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveExtraCreateParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecplist, ecptype, ecpcontext, ecpcontextsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry(void* mcb, int64_t vbn, int64_t sectorcount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveLargeMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, vbn, sectorcount);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry(void* mcb, uint32_t vbn, uint32_t sectorcount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveMcbEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, vbn, sectorcount);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext(void* perfilecontextpointer, void* ownerid, void* instanceid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerFileContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perfilecontextpointer, ownerid, instanceid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext(void* fileobject, void* ownerid, void* instanceid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerFileObjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, ownerid, instanceid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext(void* streamcontext, void* ownerid, void* instanceid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerStreamContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(streamcontext, ownerid, instanceid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb(void* mcb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlResetBaseMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb(void* mcb, bool selfsynchronized) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlResetLargeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, selfsynchronized);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)selfsynchronized;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking(void* driverobj, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetDriverBacking");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobj, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobj;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp(void* irp, void* ecplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetEcpListIntoIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, ecplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)ecplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile(void* fileobject, void* eabuffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetKernelEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, eabuffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb(void* mcb, int64_t vbn, int64_t amount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSplitBaseMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, amount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb(void* mcb, int64_t vbn, int64_t amount) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSplitLargeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcb, vbn, amount);
    }
    errno = ENOSYS;
    return false;
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts(void* perfilecontextpointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTeardownPerFileContexts");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(perfilecontextpointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)perfilecontextpointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts(void* advancedheader) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTeardownPerStreamContexts");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(advancedheader);
        return;
    }
    errno = ENOSYS;
#else
    (void)advancedheader;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb(void* mcb, int64_t vbn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateBaseMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, vbn);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)vbn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb(void* mcb, int64_t vbn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateLargeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, vbn);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)vbn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb(void* mcb, uint32_t vbn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb, vbn);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    (void)vbn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb(void* mcb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeBaseMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock(void* filelock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeFileLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filelock);
        return;
    }
    errno = ENOSYS;
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb(void* mcb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeLargeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb(void* mcb) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeMcb");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mcb);
        return;
    }
    errno = ENOSYS;
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock(void* oplock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeOplock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oplock);
        return;
    }
    errno = ENOSYS;
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters(uint64_t bytesread, uint64_t byteswritten) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUpdateDiskCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bytesread, byteswritten);
        return;
    }
    errno = ENOSYS;
#else
    (void)bytesread;
    (void)byteswritten;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl(void* oplock, void* irp, uint32_t opencount, uint32_t loweroplockstate, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUpperOplockFsctrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oplock, irp, opencount, loweroplockstate, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)loweroplockstate;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer(uint32_t bufferlength, void* reparsebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlValidateReparsePointBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferlength, reparsebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferlength;
    (void)reparsebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId(void* volumedeviceobject, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlVolumeDeviceToCorrelationId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumedeviceobject, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumedeviceobject;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo(void* logonid, uint32_t flags, void* userinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityUserInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid, flags, userinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    (void)flags;
    (void)userinformation;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock(void* irql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireVpbSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irql);
        return;
    }
    errno = ENOSYS;
#else
    (void)irql;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread(void* inputpriorityinfo, void* outputpriorityinfo, int64_t thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoApplyPriorityInfoThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inputpriorityinfo, outputpriorityinfo, thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess(void* desiredaccess, uint32_t grantedaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckDesiredAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredaccess, grantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)desiredaccess;
    (void)grantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity(void* eabuffer, uint32_t ealength, void* erroroffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckEaBufferValidity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eabuffer, ealength, erroroffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eabuffer;
    (void)ealength;
    (void)erroroffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess(uint32_t grantedaccess, uint8_t majorfunction, uint8_t minorfunction, uint32_t iocontrolcode, void* arg1, void* arg2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckFunctionAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grantedaccess, majorfunction, minorfunction, iocontrolcode, arg1, arg2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grantedaccess;
    (void)majorfunction;
    (void)minorfunction;
    (void)iocontrolcode;
    (void)arg1;
    (void)arg2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation(int32_t fileinformationclass, uint32_t length, bool setoperation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuerySetFileInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileinformationclass, length, setoperation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileinformationclass;
    (void)length;
    (void)setoperation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation(int32_t fsinformationclass, uint32_t length, bool setoperation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuerySetVolumeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fsinformationclass, length, setoperation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fsinformationclass;
    (void)length;
    (void)setoperation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity(void* quotabuffer, uint32_t quotalength, void* erroroffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuotaBufferValidity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(quotabuffer, quotalength, erroroffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)quotabuffer;
    (void)quotalength;
    (void)erroroffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState(void* irp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoClearFsTrackOffsetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject(void* fileobject, void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx(void* fileobject, void* deviceobject, void* filehandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, deviceobject, filehandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    (void)filehandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2(void* createoptions, void* fileobject, void* deviceobject, void* streamfileobject, void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(createoptions, fileobject, deviceobject, streamfileobject, filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)createoptions;
    (void)fileobject;
    (void)deviceobject;
    (void)streamfileobject;
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite(void* fileobject, void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectLite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList(void* driverobject, void* deviceobjectlist, uint32_t deviceobjectlistsize, void* actualnumberdeviceobjects) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateDeviceObjectList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobject, deviceobjectlist, deviceobjectlistsize, actualnumberdeviceobjects);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobject;
    (void)deviceobjectlist;
    (void)deviceobjectlistsize;
    (void)actualnumberdeviceobjects;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList(void* driverobjectlist, uint32_t driverobjectlistsize, void* actualnumberdriverobjects) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateRegisteredFiltersList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverobjectlist, driverobjectlistsize, actualnumberdriverobjects);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverobjectlist;
    (void)driverobjectlistsize;
    (void)actualnumberdriverobjects;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes(void* objectattributes, uint32_t desiredaccess, uint32_t openoptions, void* iostatus, void* buffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFastQueryNetworkAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes, desiredaccess, openoptions, iostatus, buffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)objectattributes;
    (void)desiredaccess;
    (void)openoptions;
    (void)iostatus;
    (void)buffer;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice(void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetAttachedDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject(void* fileobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetBaseFileSystemDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef(void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceAttachmentBaseRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify(int64_t thread) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceToVerify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)thread;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject(void* filesystemdeviceobject, void* diskdeviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDiskDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filesystemdeviceobject, diskdeviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filesystemdeviceobject;
    (void)diskdeviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState(void* irp, void* retfstrackoffsetblob, void* rettrackedoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetFsTrackOffsetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, retfstrackoffsetblob, rettrackedoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)retfstrackoffsetblob;
    (void)rettrackedoffset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject(void* deviceobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetLowerDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext(void* fileobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetOplockKeyContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx(void* fileobject) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetOplockKeyContextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fileobject;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess(void* irp) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId(void* irp) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)irp;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId(void* irp, void* psessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, psessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)psessionid;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIrpHasFsTrackOffsetExtensionType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous(void* irp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsOperationSynchronous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_IoIsSystemThread(int64_t thread) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsSystemThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return false;
#else
    (void)thread;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer(void* irp, void* reparsebuffer) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsValidNameGraftingBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, reparsebuffer);
    }
    errno = ENOSYS;
    return false;
#else
    (void)irp;
    (void)reparsebuffer;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoPageRead(void* fileobject, void* memorydescriptorlist, void* startingoffset, void* event, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoPageRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName(void* fileobject, void* objectnameinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFileDosDeviceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, objectnameinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)objectnameinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation(void* fileobject, int32_t fileinformationclass, uint32_t length, void* fileinformation, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFileInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileinformationclass, length, fileinformation, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation(void* fileobject, int32_t fsinformationclass, uint32_t length, void* fsinformation, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryVolumeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fsinformationclass, length, fsinformation, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fsinformationclass;
    (void)length;
    (void)fsinformation;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp(void* irp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueueThreadIrp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irp);
        return;
    }
    errno = ENOSYS;
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterFileSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock(uint8_t irql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReleaseVpbSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(irql);
        return;
    }
    errno = ENOSYS;
#else
    (void)irql;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName(void* fileobject, void* newfilename, uint16_t filenamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReplaceFileObjectName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, newfilename, filenamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)newfilename;
    (void)filenamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset(void* physicaldeviceobject, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRequestDeviceRemovalForReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(physicaldeviceobject, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)physicaldeviceobject;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo(void* irp, void* fileobject, int64_t thread, void* priorityinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRetrievePriorityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, fileobject, thread, priorityinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify(int64_t thread, void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetDeviceToVerify");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(thread, deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)thread;
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState(void* irp, void* fstrackoffsetblob, int64_t trackedoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFsTrackOffsetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(irp, fstrackoffsetblob, trackedoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)irp;
    (void)fstrackoffsetblob;
    (void)trackedoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoSetInformation(void* fileobject, int32_t fileinformationclass, uint32_t length, void* fileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, fileinformationclass, length, fileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite(void* fileobject, void* memorydescriptorlist, void* startingoffset, void* event, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSynchronousPageWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_IoThreadToProcess(int64_t thread) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoThreadToProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem(void* deviceobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterFileSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(deviceobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_IoVerifyVolume(void* deviceobject, bool allowrawmount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVerifyVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, allowrawmount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)allowrawmount;
    errno = ENOSYS;
    return -1;
#endif
}

uint8_t windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock(int32_t number) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireQueuedSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(number);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)number;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch(void* spinlock) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireSpinLockRaiseToSynch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spinlock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spinlock;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeAttachProcess(int64_t process) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAttachProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(process);
        return;
    }
    errno = ENOSYS;
#else
    (void)process;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeDetachProcess(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDetachProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeInitializeMutant(void* mutant, bool initialowner) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeMutant");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutant, initialowner);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutant;
    (void)initialowner;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeInitializeQueue(void* queue, uint32_t count) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(queue, count);
        return;
    }
    errno = ENOSYS;
#else
    (void)queue;
    (void)count;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue(void* queue, void* entry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertHeadQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queue, entry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queue;
    (void)entry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_KeInsertQueue(void* queue, void* entry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queue, entry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queue;
    (void)entry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_KeReadStateMutant(void* mutant) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateMutant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mutant);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mutant;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_KeReadStateQueue(void* queue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_KeReleaseMutant(void* mutant, int32_t increment, bool abandoned, bool wait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseMutant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mutant, increment, abandoned, wait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mutant;
    (void)increment;
    (void)abandoned;
    (void)wait;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock(int32_t number, uint8_t oldirql) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseQueuedSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(number, oldirql);
        return;
    }
    errno = ENOSYS;
#else
    (void)number;
    (void)oldirql;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_KeRemoveQueue(void* queue, int8_t waitmode, void* timeout) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queue, waitmode, timeout);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)queue;
    (void)waitmode;
    (void)timeout;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx(void* queue, int8_t waitmode, bool alertable, void* timeout, void* entryarray, uint32_t count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int8_t, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueueEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queue, waitmode, alertable, timeout, entryarray, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)queue;
    (void)waitmode;
    (void)alertable;
    (void)timeout;
    (void)entryarray;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_KeRundownQueue(void* queue) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRundownQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queue);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)queue;
    errno = ENOSYS;
    return NULL;
#endif
}

uint8_t windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread(int64_t thread, uint8_t processor) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetIdealProcessorThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, processor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)thread;
    (void)processor;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable(bool enable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetKernelStackSwapEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)enable;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess(int64_t process, void* apcstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeStackAttachProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(process, apcstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)process;
    (void)apcstate;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock(int32_t number, void* oldirql) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeTryToAcquireQueuedSpinLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(number, oldirql);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)number;
    (void)oldirql;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess(void* apcstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeUnstackDetachProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(apcstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)apcstate;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_MakeSignature(void* phcontext, uint32_t fqop, void* pmessage, uint32_t messageseqno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, fqop, pmessage, messageseqno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_MapSecurityError(int32_t secstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapSecurityError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(secstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)secstatus;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated(void* sectionpointer, void* newfilesize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmCanFileBeTruncated");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionpointer, newfilesize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sectionpointer;
    (void)newfilesize;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences(void* sectionpointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmDoesFileHaveUserWritableReferences");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionpointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sectionpointer;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_MmFlushImageSection(void* sectionobjectpointer, int32_t flushtype) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFlushImageSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer, flushtype);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sectionobjectpointer;
    (void)flushtype;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed(void* sectionobjectpointer, bool delayclose) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmForceSectionClosed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer, delayclose);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sectionobjectpointer;
    (void)delayclose;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx(void* sectionobjectpointer, uint32_t forcecloseflags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmForceSectionClosedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionobjectpointer, forcecloseflags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sectionobjectpointer;
    (void)forcecloseflags;
    errno = ENOSYS;
    return false;
#endif
}

uint64_t windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetMaximumFileSectionSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive(void* fssectionpointer, uint32_t flags, void* sectionisactive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsFileSectionActive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fssectionpointer, flags, sectionisactive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fssectionpointer;
    (void)flags;
    (void)sectionisactive;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsRecursiveIoFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero(void* mdl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMdlPagesAreZero");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mdl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mdl;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_MmPrefetchPages(uint32_t numberoflists, void* readlists) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmPrefetchPages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberoflists, readlists);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numberoflists;
    (void)readlists;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified(void* address, uint64_t length) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSetAddressRangeModified");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, length);
    }
    errno = ENOSYS;
    return false;
#else
    (void)address;
    (void)length;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckAndAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeAndAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarmByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken(void* tokenhandle, bool resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAdjustGroupsToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, resettodefault, newstate, bufferlength, previousstate, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken(void* tokenhandle, bool disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAdjustPrivilegesToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, disableallprivileges, newstate, bufferlength, previousstate, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory(void* processhandle, void* baseaddress, uint64_t zerobits, void* regionsize, uint32_t allocationtype, uint32_t protect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, zerobits, regionsize, allocationtype, protect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx(void* processhandle, void* baseaddress, void* regionsize, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t extendedparametercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateVirtualMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, regionsize, allocationtype, pageprotection, extendedparameters, extendedparametercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx(void* filehandle, void* iorequesttocancel, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCancelIoFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iorequesttocancel, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm(void* subsystemname, void* handleid, bool generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCloseObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject(void* directoryhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateDirectoryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCreateEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes, int32_t eventtype, bool initialstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, desiredaccess, objectattributes, eventtype, initialstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCreateFile(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, void* allocationsize, uint32_t fileattributes, uint32_t shareaccess, uint32_t createdisposition, uint32_t createoptions, void* eabuffer, uint32_t ealength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCreateSection(void* sectionhandle, uint32_t desiredaccess, void* objectattributes, void* maximumsize, uint32_t sectionpageprotection, uint32_t allocationattributes, void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx(void* sectionhandle, uint32_t desiredaccess, void* objectattributes, void* maximumsize, uint32_t sectionpageprotection, uint32_t allocationattributes, void* filehandle, void* extendedparameters, uint32_t extendedparametercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateSectionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle, extendedparameters, extendedparametercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtDeleteFile(void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm(void* subsystemname, void* handleid, bool generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtDuplicateObject(void* sourceprocesshandle, void* sourcehandle, void* targetprocesshandle, void* targethandle, uint32_t desiredaccess, uint32_t handleattributes, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDuplicateObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess, handleattributes, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtDuplicateToken(void* existingtokenhandle, uint32_t desiredaccess, void* objectattributes, bool effectiveonly, int32_t tokentype, void* newtokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDuplicateToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtokenhandle, desiredaccess, objectattributes, effectiveonly, tokentype, newtokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtFilterToken(void* existingtokenhandle, uint32_t flags, void* sidstodisable, void* privilegestodelete, void* restrictedsids, void* newtokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFilterToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtokenhandle, flags, sidstodisable, privilegestodelete, restrictedsids, newtokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile(void* filehandle, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushBuffersFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx(void* filehandle, uint32_t flags, void* parameters, uint32_t parameterssize, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushBuffersFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, flags, parameters, parameterssize, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory(void* processhandle, void* baseaddress, void* regionsize, void* iostatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, regionsize, iostatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory(void* processhandle, void* baseaddress, void* regionsize, uint32_t freetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFreeVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, regionsize, freetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken(void* threadhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtImpersonateAnonymousToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject(void* directoryhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenDirectoryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenFile(void* filehandle, uint32_t desiredaccess, void* objectattributes, void* iostatusblock, uint32_t shareaccess, uint32_t openoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, shareaccess, openoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)openoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, bool objectcreation, bool accessgranted, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken(void* processhandle, uint32_t desiredaccess, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcessToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx(void* processhandle, uint32_t desiredaccess, uint32_t handleattributes, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcessTokenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, handleattributes, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject(void* linkhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenSymbolicLinkObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(linkhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)linkhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken(void* threadhandle, uint32_t desiredaccess, bool openasself, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenThreadToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx(void* threadhandle, uint32_t desiredaccess, bool openasself, uint32_t handleattributes, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenThreadTokenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, desiredaccess, openasself, handleattributes, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck(void* clienttoken, void* requiredprivileges, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegeCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienttoken, requiredprivileges, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, bool accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegeObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm(void* subsystemname, void* servicename, void* clienttoken, void* privileges, bool accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegedServiceAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject(void* directoryhandle, void* buffer, uint32_t length, bool returnsingleentry, bool restartscan, void* context, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryhandle, buffer, length, returnsingleentry, restartscan, context, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryEaFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length, bool returnsingleentry, void* ealist, uint32_t ealistlength, void* eaindex, bool restartscan) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile(void* objectattributes, void* fileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryFullAttributesFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes, fileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    (void)fileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName(void* objectattributes, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes, iostatusblock, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile(void* filehandle, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length, bool returnsingleentry, void* sidlist, uint32_t sidlistlength, void* startsid, bool restartscan) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryQuotaInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject(void* handle, uint32_t securityinformation, void* securitydescriptor, uint32_t length, void* lengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySecurityObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, securitydescriptor, length, lengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject(void* linkhandle, void* linktarget, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySymbolicLinkObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(linkhandle, linktarget, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)linkhandle;
    (void)linktarget;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory(void* processhandle, void* baseaddress, int32_t memoryinformationclass, void* memoryinformation, uint64_t memoryinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, memoryinformationclass, memoryinformation, memoryinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile(void* filehandle, void* iostatusblock, void* fsinformation, uint32_t length, int32_t fsinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryVolumeInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetEaFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetEvent(void* eventhandle, void* previousstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, previousstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)previousstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetInformationFile(void* filehandle, void* iostatusblock, void* fileinformation, uint32_t length, int32_t fileinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fileinformation, length, fileinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetInformationToken(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory(void* processhandle, int32_t vminformationclass, uint64_t numberofentries, void* virtualaddresses, void* vminformation, uint32_t vminformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, vminformationclass, numberofentries, virtualaddresses, vminformation, vminformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetQuotaInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject(void* handle, uint32_t securityinformation, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetSecurityObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile(void* filehandle, void* iostatusblock, void* fsinformation, uint32_t length, int32_t fsinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetVolumeInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_NtUnlockFile(void* filehandle, void* iostatusblock, void* byteoffset, void* length, uint32_t key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtUnlockFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, byteoffset, length, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ObInsertObject(void* object, void* passedaccessstate, uint32_t desiredaccess, uint32_t objectpointerbias, void* newobject, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObInsertObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, passedaccessstate, desiredaccess, objectpointerbias, newobject, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objectpointerbias;
    (void)newobject;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle(void* handle) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObIsKernelHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return false;
#else
    (void)handle;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject(void* object) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObMakeTemporaryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(object);
        return;
    }
    errno = ENOSYS;
#else
    (void)object;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer(void* object, uint32_t handleattributes, void* passedaccessstate, uint32_t desiredaccess, int64_t objecttype, int8_t accessmode, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObOpenObjectByPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, handleattributes, passedaccessstate, desiredaccess, objecttype, accessmode, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag(void* object, uint32_t handleattributes, void* passedaccessstate, uint32_t desiredaccess, int64_t objecttype, int8_t accessmode, uint32_t tag, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObOpenObjectByPointerWithTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, handleattributes, passedaccessstate, desiredaccess, objecttype, accessmode, tag, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)tag;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ObQueryNameString(void* object, void* objectnameinfo, uint32_t length, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObQueryNameString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, objectnameinfo, length, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)objectnameinfo;
    (void)length;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle(void* handle, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObQueryObjectAuditingByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_PfxFindPrefix(void* prefixtable, void* fullname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxFindPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefixtable, fullname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)prefixtable;
    (void)fullname;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PfxInitialize(void* prefixtable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prefixtable);
        return;
    }
    errno = ENOSYS;
#else
    (void)prefixtable;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix(void* prefixtable, void* prefix, void* prefixtableentry) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxInsertPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefixtable, prefix, prefixtableentry);
    }
    errno = ENOSYS;
    return false;
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix(void* prefixtable, void* prefixtableentry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxRemovePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prefixtable, prefixtableentry);
        return;
    }
    errno = ENOSYS;
#else
    (void)prefixtable;
    (void)prefixtableentry;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem(void* workitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoQueueShutdownWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken(int64_t thread, void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAssignImpersonationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota(int64_t process, int32_t pooltype, uint64_t amount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsChargePoolQuota");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(process, pooltype, amount);
        return;
    }
    errno = ENOSYS;
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota(int64_t process, int32_t pooltype, uint64_t amount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsChargeProcessPoolQuota");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, pooltype, amount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken(void* impersonationtoken) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferenceImpersonationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(impersonationtoken);
        return;
    }
    errno = ENOSYS;
#else
    (void)impersonationtoken;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken(void* primarytoken) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferencePrimaryToken");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(primarytoken);
        return;
    }
    errno = ENOSYS;
#else
    (void)primarytoken;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation(int64_t thread, void* impersonationstate) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDisableImpersonation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, impersonationstate);
    }
    errno = ENOSYS;
    return false;
#else
    (void)thread;
    (void)impersonationstate;
    errno = ENOSYS;
    return false;
#endif
}

int64_t windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessExitTime");
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

int64_t windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess(int64_t thread) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_PsImpersonateClient(int64_t thread, void* token, bool copyonopen, bool effectiveonly, int32_t impersonationlevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, bool, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsImpersonateClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, token, copyonopen, effectiveonly, impersonationlevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)token;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsDiskCountersEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_PsIsSystemThread(int64_t thread) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsSystemThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return false;
#else
    (void)thread;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating(int64_t thread) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsThreadTerminating");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return false;
#else
    (void)thread;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId(void* processid, void* process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsLookupProcessByProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processid, process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processid;
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId(void* threadid, void* thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsLookupThreadByThreadId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadid, thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadid;
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken(int64_t thread, void* copyonopen, void* effectiveonly, void* impersonationlevel) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferenceImpersonationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, copyonopen, effectiveonly, impersonationlevel);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)thread;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken(int64_t process) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferencePrimaryToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)process;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation(int64_t thread, void* impersonationstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRestoreImpersonation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(thread, impersonationstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)thread;
    (void)impersonationstate;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota(int64_t process, int32_t pooltype, uint64_t amount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReturnPoolQuota");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(process, pooltype, amount);
        return;
    }
    errno = ENOSYS;
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsRevertToSelf(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRevertToSelf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters(int64_t process, uint64_t bytesread, uint64_t byteswritten, uint32_t readoperationcount, uint32_t writeoperationcount, uint32_t flushoperationcount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsUpdateDiskCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(process, bytesread, byteswritten, readoperationcount, writeoperationcount, flushoperationcount);
        return;
    }
    errno = ENOSYS;
#else
    (void)process;
    (void)bytesread;
    (void)byteswritten;
    (void)readoperationcount;
    (void)writeoperationcount;
    (void)flushoperationcount;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken(void* phcontext, void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityContextToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD(void* absolutesecuritydescriptor, void* selfrelativesecuritydescriptor, void* bufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAbsoluteToSelfRelativeSD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(absolutesecuritydescriptor, selfrelativesecuritydescriptor, bufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)absolutesecuritydescriptor;
    (void)selfrelativesecuritydescriptor;
    (void)bufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce(void* acl, uint32_t acerevision, uint32_t accessmask, void* sid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAccessAllowedAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, acerevision, accessmask, sid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)acerevision;
    (void)accessmask;
    (void)sid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx(void* acl, uint32_t acerevision, uint32_t aceflags, uint32_t accessmask, void* sid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAccessAllowedAceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, acerevision, aceflags, accessmask, sid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)acerevision;
    (void)aceflags;
    (void)accessmask;
    (void)sid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAddAce(void* acl, uint32_t acerevision, uint32_t startingaceindex, void* acelist, uint32_t acelistlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, acerevision, startingaceindex, acelist, acelistlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)acerevision;
    (void)startingaceindex;
    (void)acelist;
    (void)acelistlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid(void* identifierauthority, uint8_t subauthoritycount, uint32_t subauthority0, uint32_t subauthority1, uint32_t subauthority2, uint32_t subauthority3, uint32_t subauthority4, uint32_t subauthority5, uint32_t subauthority6, uint32_t subauthority7, void* sid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(identifierauthority, subauthoritycount, subauthority0, subauthority1, subauthority2, subauthority3, subauthority4, subauthority5, subauthority6, subauthority7, sid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthority0;
    (void)subauthority1;
    (void)subauthority2;
    (void)subauthority3;
    (void)subauthority4;
    (void)subauthority5;
    (void)subauthority6;
    (void)subauthority7;
    (void)sid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx(void* identifierauthority, uint8_t subauthoritycount, void* subauthorities, void* sid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSidEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(identifierauthority, subauthoritycount, subauthorities, sid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthorities;
    (void)sid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap(void* heaphandle, uint32_t flags, uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heaphandle, flags, size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)heaphandle;
    (void)flags;
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString(void* destination, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAppendStringToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destination, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes(void* altitude1, void* altitude2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareAltitudes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(altitude1, altitude2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)altitude1;
    (void)altitude2;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong(void* source, uint64_t length, uint32_t pattern) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareMemoryUlong");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, length, pattern);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)source;
    (void)length;
    (void)pattern;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer(uint16_t compressionformatandengine, void* uncompressedbuffer, uint32_t uncompressedbuffersize, void* compressedbuffer, uint32_t compressedbuffersize, uint32_t uncompressedchunksize, void* finalcompressedsize, void* workspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompressBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformatandengine, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, uncompressedchunksize, finalcompressedsize, workspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformatandengine;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finalcompressedsize;
    (void)workspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCompressChunks(void* uncompressedbuffer, uint32_t uncompressedbuffersize, void* compressedbuffer, uint32_t compressedbuffersize, void* compresseddatainfo, uint32_t compresseddatainfolength, void* workspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompressChunks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, compresseddatainfo, compresseddatainfolength, workspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compresseddatainfo;
    (void)compresseddatainfolength;
    (void)workspace;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_RtlCopyLuid(void* destinationluid, void* sourceluid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopyLuid");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationluid, sourceluid);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationluid;
    (void)sourceluid;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCopySid(uint32_t destinationsidlength, void* destinationsid, void* sourcesid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopySid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationsidlength, destinationsid, sourcesid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationsidlength;
    (void)destinationsid;
    (void)sourcesid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCreateAcl(void* acl, uint32_t acllength, uint32_t aclrevision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateAcl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, acllength, aclrevision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)acllength;
    (void)aclrevision;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlCreateHeap(uint32_t flags, void* heapbase, uint64_t reservesize, uint64_t commitsize, void* lock, void* parameters) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, heapbase, reservesize, commitsize, lock, parameters);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)flags;
    (void)heapbase;
    (void)reservesize;
    (void)commitsize;
    (void)lock;
    (void)parameters;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid(void* servicename, void* servicesid, void* servicesidlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateServiceSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicename, servicesid, servicesidlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servicename;
    (void)servicesid;
    (void)servicesidlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder(void* volumerootpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateSystemVolumeInformationFolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumerootpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumerootpath;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring);
    }
    errno = ENOSYS;
    return false;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid(void* name, uint32_t basesubauthority, void* sid, void* sidlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateVirtualAccountSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, basesubauthority, sid, sidlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)basesubauthority;
    (void)sid;
    (void)sidlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN(void* customcp, void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* customcpstring, uint32_t bytesincustomcpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCustomCPToUnicodeN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcp, unicodestring, maxbytesinunicodestring, bytesinunicodestring, customcpstring, bytesincustomcpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcp;
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)customcpstring;
    (void)bytesincustomcpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer(uint16_t compressionformat, void* uncompressedbuffer, uint32_t uncompressedbuffersize, void* compressedbuffer, uint32_t compressedbuffersize, void* finaluncompressedsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, finaluncompressedsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx(uint16_t compressionformat, void* uncompressedbuffer, uint32_t uncompressedbuffersize, void* compressedbuffer, uint32_t compressedbuffersize, void* finaluncompressedsize, void* workspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBufferEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, finaluncompressedsize, workspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2(uint16_t compressionformat, void* uncompressedbuffer, uint32_t uncompressedbuffersize, void* compressedbuffer, uint32_t compressedbuffersize, uint32_t uncompressedchunksize, void* finaluncompressedsize, void* workspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBufferEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, uncompressedchunksize, finaluncompressedsize, workspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks(void* uncompressedbuffer, uint32_t uncompressedbuffersize, void* compressedbuffer, uint32_t compressedbuffersize, void* compressedtail, uint32_t compressedtailsize, void* compresseddatainfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressChunks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, compressedtail, compressedtailsize, compresseddatainfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compressedtail;
    (void)compressedtailsize;
    (void)compresseddatainfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment(uint16_t compressionformat, void* uncompressedfragment, uint32_t uncompressedfragmentsize, void* compressedbuffer, uint32_t compressedbuffersize, uint32_t fragmentoffset, void* finaluncompressedsize, void* workspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressFragment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, uncompressedfragment, uncompressedfragmentsize, compressedbuffer, compressedbuffersize, fragmentoffset, finaluncompressedsize, workspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx(uint16_t compressionformat, void* uncompressedfragment, uint32_t uncompressedfragmentsize, void* compressedbuffer, uint32_t compressedbuffersize, uint32_t fragmentoffset, uint32_t uncompressedchunksize, void* finaluncompressedsize, void* workspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressFragmentEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, uncompressedfragment, uncompressedfragmentsize, compressedbuffer, compressedbuffersize, fragmentoffset, uncompressedchunksize, finaluncompressedsize, workspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDeleteAce(void* acl, uint32_t aceindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, aceindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)aceindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk(uint16_t compressionformat, void* compressedbuffer, void* endofcompressedbufferplus1, void* chunkbuffer, void* chunksize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDescribeChunk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap(void* heaphandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDestroyHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heaphandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)heaphandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus(void* dosfilename, void* ntfilename, void* filepart, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDosPathNameToNtPathName_U_WithStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dosfilename, ntfilename, filepart, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dosfilename;
    (void)ntfilename;
    (void)filepart;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDowncaseUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString(uint32_t flags, void* stringin, void* stringout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDuplicateUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, stringin, stringout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)stringin;
    (void)stringout;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid(void* sid1, void* sid2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualPrefixSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid1, sid2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sid1;
    (void)sid2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlEqualSid(void* sid1, void* sid2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid1, sid2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sid1;
    (void)sid2;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix(void* prefixtable, void* fullname, uint32_t caseinsensitiveindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindUnicodePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefixtable, fullname, caseinsensitiveindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)prefixtable;
    (void)fullname;
    (void)caseinsensitiveindex;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlFreeHeap(void* heaphandle, uint32_t flags, void* baseaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heaphandle, flags, baseaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)heaphandle;
    (void)flags;
    (void)baseaddress;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlFreeSid(void* sid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name(void* name, bool allowextendedcharacters, void* context, void* name8dot3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGenerate8dot3Name");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, allowextendedcharacters, context, name8dot3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)allowextendedcharacters;
    (void)context;
    (void)name8dot3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGetAce(void* acl, uint32_t aceindex, void* ace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, aceindex, ace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)aceindex;
    (void)ace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize(uint16_t compressionformatandengine, void* compressbufferworkspacesize, void* compressfragmentworkspacesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetCompressionWorkSpaceSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformatandengine, compressbufferworkspacesize, compressfragmentworkspacesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformatandengine;
    (void)compressbufferworkspacesize;
    (void)compressfragmentworkspacesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor(void* securitydescriptor, void* daclpresent, void* dacl, void* dacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetDaclSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, daclpresent, dacl, dacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)daclpresent;
    (void)dacl;
    (void)dacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor(void* securitydescriptor, void* group, void* groupdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetGroupSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, group, groupdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor(void* securitydescriptor, void* owner, void* ownerdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetOwnerSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, owner, ownerdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor(void* securitydescriptor, void* saclpresent, void* sacl, void* sacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSaclSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, saclpresent, sacl, sacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)saclpresent;
    (void)sacl;
    (void)sacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid(void* sid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdentifierAuthoritySid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii(uint32_t flags, void* sourcestring, int32_t sourcestringlength, void* destinationstring, void* destinationstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToAscii");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcestring, sourcestringlength, destinationstring, destinationstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode(uint32_t flags, void* sourcestring, int32_t sourcestringlength, void* destinationstring, void* destinationstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToNameprepUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcestring, sourcestringlength, destinationstring, destinationstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode(uint32_t flags, void* sourcestring, int32_t sourcestringlength, void* destinationstring, void* destinationstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcestring, sourcestringlength, destinationstring, destinationstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable(void* tablebase, void* codepagetable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitCodePageTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tablebase, codepagetable);
        return;
    }
    errno = ENOSYS;
#else
    (void)tablebase;
    (void)codepagetable;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUnicodeStringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlInitializeSid(void* sid, void* identifierauthority, uint8_t subauthoritycount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid, identifierauthority, subauthoritycount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sid;
    (void)identifierauthority;
    (void)subauthoritycount;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix(void* prefixtable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeUnicodePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prefixtable);
        return;
    }
    errno = ENOSYS;
#else
    (void)prefixtable;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix(void* prefixtable, void* prefix, void* prefixtableentry) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertUnicodePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefixtable, prefix, prefixtableentry);
    }
    errno = ENOSYS;
    return false;
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder(uint32_t fileattributes, uint32_t reparsetag) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsCloudFilesPlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileattributes, reparsetag);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileattributes;
    (void)reparsetag;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U(void* dosfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsDosDeviceName_U");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dosfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dosfilename;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed(uint32_t reparsetag) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNonEmptyDirectoryReparsePointAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reparsetag);
    }
    errno = ENOSYS;
    return false;
#else
    (void)reparsetag;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString(uint32_t normform, void* sourcestring, int32_t sourcestringlength, void* normalized) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNormalizedString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(normform, sourcestring, sourcestringlength, normalized);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)normalized;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder(uint32_t fileattributes, uint32_t reparsetag) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileattributes, reparsetag);
    }
    errno = ENOSYS;
    return false;
#else
    (void)fileattributes;
    (void)reparsetag;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle(void* filehandle, void* ispartialplaceholder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, ispartialplaceholder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)ispartialplaceholder;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo(void* infobuffer, int32_t infoclass, void* ispartialplaceholder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infobuffer, infoclass, ispartialplaceholder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infobuffer;
    (void)infoclass;
    (void)ispartialplaceholder;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken(void* context, int8_t previousmode) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsSandboxedToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, previousmode);
    }
    errno = ENOSYS;
    return false;
#else
    (void)context;
    (void)previousmode;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter(void* arg_0_char) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsValidOemCharacter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_char);
    }
    errno = ENOSYS;
    return false;
#else
    (void)arg_0_char;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid(uint32_t subauthoritycount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthRequiredSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subauthoritycount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)subauthoritycount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlLengthSid(void* sid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN(void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* multibytestring, uint32_t bytesinmultibytestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unicodestring, maxbytesinunicodestring, bytesinunicodestring, multibytestring, bytesinmultibytestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize(void* bytesinunicodestring, void* multibytestring, uint32_t bytesinmultibytestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bytesinunicodestring, multibytestring, bytesinmultibytestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix(void* prefixtable, bool restart) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNextUnicodePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prefixtable, restart);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)prefixtable;
    (void)restart;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlNormalizeString(uint32_t normform, void* sourcestring, int32_t sourcestringlength, void* destinationstring, void* destinationstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(normform, sourcestring, sourcestringlength, destinationstring, destinationstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb(int32_t status) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNtStatusToDosErrorNoTeb");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemStringToCountedUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemStringToUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN(void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* oemstring, uint32_t bytesinoemstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemToUnicodeN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unicodestring, maxbytesinunicodestring, bytesinunicodestring, oemstring, bytesinoemstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)oemstring;
    (void)bytesinoemstring;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlPrefixString(void* string1, void* string2, bool caseinsensitive) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPrefixString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, caseinsensitive);
    }
    errno = ENOSYS;
    return false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity(void* tokenobject, void* packagefullname, void* packagesize, void* appid, void* appidsize, void* packaged) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryPackageIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenobject, packagefullname, packagesize, appid, appidsize, packaged);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)packaged;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx(void* tokenobject, void* packagefullname, void* packagesize, void* appid, void* appidsize, void* dynamicid, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryPackageIdentityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenobject, packagefullname, packagesize, appid, appidsize, dynamicid, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)dynamicid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode(void) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryProcessPlaceholderCompatibilityMode");
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

int8_t windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode(void) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryThreadPlaceholderCompatibilityMode");
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

uint32_t windowssys_windows_wdk_storage_filesystem_RtlRandom(void* seed) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRandom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(seed);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)seed;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlRandomEx(void* seed) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRandomEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(seed);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)seed;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix(void* prefixtable, void* prefixtableentry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRemoveUnicodePrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prefixtable, prefixtableentry);
        return;
    }
    errno = ENOSYS;
#else
    (void)prefixtable;
    (void)prefixtableentry;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd(void* securitydescriptor, void* oldsid, void* newsid, void* numchanges) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlReplaceSidInSd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, oldsid, newsid, numchanges);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)oldsid;
    (void)newsid;
    (void)numchanges;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlReserveChunk(uint16_t compressionformat, void* compressedbuffer, void* endofcompressedbufferplus1, void* chunkbuffer, uint32_t chunksize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlReserveChunk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressionformat, compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime(uint32_t elapsedseconds, void* arg_1_time) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSecondsSince1970ToTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elapsedseconds, arg_1_time);
        return;
    }
    errno = ENOSYS;
#else
    (void)elapsedseconds;
    (void)arg_1_time;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime(uint32_t elapsedseconds, void* arg_1_time) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSecondsSince1980ToTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elapsedseconds, arg_1_time);
        return;
    }
    errno = ENOSYS;
#else
    (void)elapsedseconds;
    (void)arg_1_time;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD(void* selfrelativesecuritydescriptor, void* absolutesecuritydescriptor, void* absolutesecuritydescriptorsize, void* dacl, void* daclsize, void* sacl, void* saclsize, void* owner, void* ownersize, void* primarygroup, void* primarygroupsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSelfRelativeToAbsoluteSD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(selfrelativesecuritydescriptor, absolutesecuritydescriptor, absolutesecuritydescriptorsize, dacl, daclsize, sacl, saclsize, owner, ownersize, primarygroup, primarygroupsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)selfrelativesecuritydescriptor;
    (void)absolutesecuritydescriptor;
    (void)absolutesecuritydescriptorsize;
    (void)dacl;
    (void)daclsize;
    (void)sacl;
    (void)saclsize;
    (void)owner;
    (void)ownersize;
    (void)primarygroup;
    (void)primarygroupsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor(void* securitydescriptor, void* group, bool groupdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetGroupSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, group, groupdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor(void* securitydescriptor, void* owner, bool ownerdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetOwnerSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, owner, ownerdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode(int8_t mode) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetProcessPlaceholderCompatibilityMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode(int8_t mode) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetThreadPlaceholderCompatibilityMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid(void* sid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubAuthorityCountSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid(void* sid, uint32_t subauthority) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubAuthoritySid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid, subauthority);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sid;
    (void)subauthority;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980(void* arg_0_time, void* elapsedseconds) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeToSecondsSince1980");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_time, elapsedseconds);
    }
    errno = ENOSYS;
    return false;
#else
    (void)arg_0_time;
    (void)elapsedseconds;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToCountedOemString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN(void* customcp, void* customcpstring, uint32_t maxbytesincustomcpstring, void* bytesincustomcpstring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToCustomCPN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcp, customcpstring, maxbytesincustomcpstring, bytesincustomcpstring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN(void* multibytestring, uint32_t maxbytesinmultibytestring, void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToMultiByteN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(multibytestring, maxbytesinmultibytestring, bytesinmultibytestring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN(void* oemstring, uint32_t maxbytesinoemstring, void* bytesinoemstring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToOemN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oemstring, maxbytesinoemstring, bytesinoemstring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToCountedOemString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToOemString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN(void* customcp, void* customcpstring, uint32_t maxbytesincustomcpstring, void* bytesincustomcpstring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToCustomCPN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcp, customcpstring, maxbytesincustomcpstring, bytesincustomcpstring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN(void* multibytestring, uint32_t maxbytesinmultibytestring, void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToMultiByteN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(multibytestring, maxbytesinmultibytestring, bytesinmultibytestring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN(void* oemstring, uint32_t maxbytesinoemstring, void* bytesinoemstring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToOemN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oemstring, maxbytesinoemstring, bytesinoemstring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_RtlValidSid(void* sid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)sid;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString(uint32_t flags, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidateUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize(void* oemstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxOemStringToUnicodeSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oemstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)oemstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize(void* unicodestring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxUnicodeStringToOemSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unicodestring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)unicodestring;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState(void* securitydescriptor, void* primarytokeninformation, void* clienttokeninformation, uint32_t desiredaccess, uint32_t previouslygrantedaccess, void* privileges, void* genericmapping, int8_t accessmode, void* grantedaccess, void* accessstatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheckFromState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, primarytokeninformation, clienttokeninformation, desiredaccess, previouslygrantedaccess, privileges, genericmapping, accessmode, grantedaccess, accessstatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)primarytokeninformation;
    (void)clienttokeninformation;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx(void* securitydescriptor, void* primarytoken, void* clienttoken, uint32_t desiredaccess, uint32_t previouslygrantedaccess, void* privileges, void* genericmapping, int8_t accessmode, void* grantedaccess, void* accessstatus) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheckFromStateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, primarytoken, clienttoken, desiredaccess, previouslygrantedaccess, privileges, genericmapping, accessmode, grantedaccess, accessstatus);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)primarytoken;
    (void)clienttoken;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints(void* objecttype, void* securitydescriptor, void* accessstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustAccessStateForAccessConstraints");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objecttype, securitydescriptor, accessstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel(void* objecttype, void* securitydescriptor, void* accessstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustAccessStateForTrustLabel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objecttype, securitydescriptor, accessstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity(void* objectname, void* originaldescriptor, void* proposeddescriptor, void* subjectsecuritycontext, void* adjusteddescriptor, void* applyadjusteddescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectname, originaldescriptor, proposeddescriptor, subjectsecuritycontext, adjusteddescriptor, applyadjusteddescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectname;
    (void)originaldescriptor;
    (void)proposeddescriptor;
    (void)subjectsecuritycontext;
    (void)adjusteddescriptor;
    (void)applyadjusteddescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges(void* accessstate, void* privileges) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAppendPrivileges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessstate, privileges);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)accessstate;
    (void)privileges;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests(bool bsuccess, uint32_t selftestcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(bool, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditFipsCryptoSelftests");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bsuccess, selftestcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)bsuccess;
    (void)selftestcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation(void* filename, void* linkname, bool bsuccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditHardLinkCreation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filename, linkname, bsuccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction(void* filename, void* linkname, bool bsuccess, void* transactionid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditHardLinkCreationWithTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(filename, linkname, bsuccess, transactionid);
        return;
    }
    errno = ENOSYS;
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
    (void)transactionid;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange(void* transactionid, void* resourcemanagerid, uint32_t newtransactionstate) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditTransactionStateChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(transactionid, resourcemanagerid, newtransactionstate);
        return;
    }
    errno = ENOSYS;
#else
    (void)transactionid;
    (void)resourcemanagerid;
    (void)newtransactionstate;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext(void* securitydescriptor, void* subjectsecuritycontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, subjectsecuritycontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx(void* securitydescriptor, void* subjectsecuritycontext, void* stagingenabled) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, subjectsecuritycontext, stagingenabled);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents(bool accessgranted, void* securitydescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessgranted, securitydescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext(bool accessgranted, void* securitydescriptor, void* subjectsecuritycontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx(bool accessgranted, void* securitydescriptor, void* subjectsecuritycontext, void* stagingenabled) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext, stagingenabled);
    }
    errno = ENOSYS;
    return false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents(bool accessgranted, void* securitydescriptor, void* subjectsecuritycontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileOrGlobalEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents(bool accessgranted, void* securitydescriptor) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingHardLinkEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessgranted, securitydescriptor);
    }
    errno = ENOSYS;
    return false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext(bool accessgranted, void* securitydescriptor, void* subjectsecuritycontext) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingHardLinkEventsWithContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext);
    }
    errno = ENOSYS;
    return false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx(int64_t thread, int64_t process, void* subjectcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCaptureSubjectContextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(thread, process, subjectcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)thread;
    (void)process;
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval(void* currentdescriptor, void* newdescriptor, void* subjectsecuritycontext, void* aceremoved) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCheckForCriticalAceRemoval");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(currentdescriptor, newdescriptor, subjectsecuritycontext, aceremoved);
        return;
    }
    errno = ENOSYS;
#else
    (void)currentdescriptor;
    (void)newdescriptor;
    (void)subjectsecuritycontext;
    (void)aceremoved;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity(int64_t clientthread, void* clientsecurityqos, bool remotesession, void* clientcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCreateClientSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientthread, clientsecurityqos, remotesession, clientcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientthread;
    (void)clientsecurityqos;
    (void)remotesession;
    (void)clientcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext(void* subjectcontext, void* clientsecurityqos, bool serverisremote, void* clientcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCreateClientSecurityFromSubjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subjectcontext, clientsecurityqos, serverisremote, clientcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subjectcontext;
    (void)clientsecurityqos;
    (void)serverisremote;
    (void)clientcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity(void* clientcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteClientSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(clientcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)clientcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm(void* object, void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(object, handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)object;
    (void)handle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction(void* object, void* handle, void* transactionid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarmWithTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(object, handle, transactionid);
        return;
    }
    errno = ENOSYS;
#else
    (void)object;
    (void)handle;
    (void)transactionid;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeExamineSacl(void* sacl, void* resourcesacl, void* token, uint32_t desiredaccess, bool accessgranted, void* generateaudit, void* generatealarm) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeExamineSacl");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sacl, resourcesacl, token, desiredaccess, accessgranted, generateaudit, generatealarm);
        return;
    }
    errno = ENOSYS;
#else
    (void)sacl;
    (void)resourcesacl;
    (void)token;
    (void)desiredaccess;
    (void)accessgranted;
    (void)generateaudit;
    (void)generatealarm;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeFilterToken(void* existingtoken, uint32_t flags, void* sidstodisable, void* privilegestodelete, void* restrictedsids, void* filteredtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeFilterToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtoken, flags, sidstodisable, privilegestodelete, restrictedsids, filteredtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)existingtoken;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)filteredtoken;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeFreePrivileges(void* privileges) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeFreePrivileges");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(privileges);
        return;
    }
    errno = ENOSYS;
#else
    (void)privileges;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeImpersonateClient(void* clientcontext, int64_t serverthread) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeImpersonateClient");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(clientcontext, serverthread);
        return;
    }
    errno = ENOSYS;
#else
    (void)clientcontext;
    (void)serverthread;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx(void* clientcontext, int64_t serverthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeImpersonateClientEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientcontext, serverthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientcontext;
    (void)serverthread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName(int64_t process, void* pimagefilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeLocateProcessImageName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, pimagefilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)pimagefilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification(void* logonid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx(void* logonid, int64_t pserversilo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotificationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid, pserversilo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    (void)pserversilo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm(void* objecttypename, void* object, void* absoluteobjectname, void* securitydescriptor, void* accessstate, bool objectcreated, bool accessgranted, int8_t accessmode, void* generateonclose) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, generateonclose);
        return;
    }
    errno = ENOSYS;
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction(void* objecttypename, void* object, void* absoluteobjectname, void* securitydescriptor, void* accessstate, bool objectcreated, bool accessgranted, int8_t accessmode, void* transactionid, void* generateonclose) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarmWithTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, transactionid, generateonclose);
        return;
    }
    errno = ENOSYS;
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)transactionid;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm(void* objecttypename, void* object, void* absoluteobjectname, void* securitydescriptor, void* accessstate, bool objectcreated, bool accessgranted, int8_t accessmode, void* generateonclose) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, generateonclose);
        return;
    }
    errno = ENOSYS;
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction(void* objecttypename, void* object, void* absoluteobjectname, void* securitydescriptor, void* accessstate, bool objectcreated, bool accessgranted, int8_t accessmode, void* transactionid, void* generateonclose) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarmWithTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, transactionid, generateonclose);
        return;
    }
    errno = ENOSYS;
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)transactionid;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck(void* requiredprivileges, void* subjectsecuritycontext, int8_t accessmode) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SePrivilegeCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requiredprivileges, subjectsecuritycontext, accessmode);
    }
    errno = ENOSYS;
    return false;
#else
    (void)requiredprivileges;
    (void)subjectsecuritycontext;
    (void)accessmode;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken(void* token, void* authenticationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryAuthenticationIdToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, authenticationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)authenticationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken(void* token, int32_t tokeninformationclass, void* tokeninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryInformationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, tokeninformationclass, tokeninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)tokeninformationclass;
    (void)tokeninformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo(void* securityinformation, void* securitydescriptor, void* length, void* objectssecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySecurityDescriptorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securityinformation, securitydescriptor, length, objectssecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)objectssecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken(void* token, void* pserversilo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryServerSiloToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, pserversilo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)pserversilo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken(void* token, void* sessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySessionIdToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx(void* token, void* sessionid, void* isservicesession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySessionIdTokenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, sessionid, isservicesession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)sessionid;
    (void)isservicesession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine(void* callbackroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx(void* callbackroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory(uint32_t flags, void* sourcename, void* usersid, void* auditparameters, uint32_t auditsubcategoryid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeReportSecurityEventWithSubCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcename, usersid, auditparameters, auditsubcategoryid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcename;
    (void)usersid;
    (void)auditparameters;
    (void)auditsubcategoryid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping(void* accessstate, void* genericmapping) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetAccessStateGenericMapping");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(accessstate, genericmapping);
        return;
    }
    errno = ENOSYS;
#else
    (void)accessstate;
    (void)genericmapping;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo(void* object, void* securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, int32_t pooltype, void* genericmapping) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, securityinformation, modificationdescriptor, objectssecuritydescriptor, pooltype, genericmapping);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)pooltype;
    (void)genericmapping;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx(void* object, void* securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, uint32_t autoinheritflags, int32_t pooltype, void* genericmapping) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, securityinformation, modificationdescriptor, objectssecuritydescriptor, autoinheritflags, pooltype, genericmapping);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)pooltype;
    (void)genericmapping;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent(void* objecttype, void* childdescriptor, void* accessstate) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeShouldCheckForAccessRightsFromParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecttype, childdescriptor, accessstate);
    }
    errno = ENOSYS;
    return false;
#else
    (void)objecttype;
    (void)childdescriptor;
    (void)accessstate;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation(void* accessinformation, void* token, uint32_t length, void* requiredlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenFromAccessInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessinformation, token, length, requiredlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)accessinformation;
    (void)token;
    (void)length;
    (void)requiredlength;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin(void* token) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsAdmin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token);
    }
    errno = ENOSYS;
    return false;
#else
    (void)token;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted(void* token) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsRestricted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token);
    }
    errno = ENOSYS;
    return false;
#else
    (void)token;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted(void* token) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsWriteRestricted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token);
    }
    errno = ENOSYS;
    return false;
#else
    (void)token;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeTokenType(void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine(void* callbackroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx(void* callbackroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutineEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SecLookupAccountName(void* name, void* sidsize, void* sid, void* nameuse, void* domainsize, void* referenceddomain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupAccountName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, sidsize, sid, nameuse, domainsize, referenceddomain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)sidsize;
    (void)sid;
    (void)nameuse;
    (void)domainsize;
    (void)referenceddomain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid(void* sid, void* namesize, void* namebuffer, void* domainsize, void* domainbuffer, void* nameuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupAccountSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid, namesize, namebuffer, domainsize, domainbuffer, nameuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sid;
    (void)namesize;
    (void)namebuffer;
    (void)domainsize;
    (void)domainbuffer;
    (void)nameuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid(int32_t sidtype, void* sid, uint32_t sidbuffersize, void* sidsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupWellKnownSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sidtype, sid, sidbuffersize, sidsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sidtype;
    (void)sid;
    (void)sidbuffersize;
    (void)sidsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SecMakeSPN(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* spn, void* length, bool allocate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPN");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, spn, length, allocate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)spn;
    (void)length;
    (void)allocate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* targetinfo, void* spn, void* length, bool allocate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPNEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, targetinfo, spn, length, allocate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)targetinfo;
    (void)spn;
    (void)length;
    (void)allocate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* intargetinfo, void* spn, void* totalsize, bool allocate, bool istargetinfomarshaled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPNEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, intargetinfo, spn, totalsize, allocate, istargetinfomarshaled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)intargetinfo;
    (void)spn;
    (void)totalsize;
    (void)allocate;
    (void)istargetinfomarshaled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SetContextAttributesW(void* phcontext, uint32_t ulattribute, void* pbuffer, uint32_t cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync(void* asynccontext, void* phcredential, void* phcontext, void* pinput, uint32_t fcontextreq, uint32_t targetdatarep, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiAcceptSecurityContextAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(asynccontext, phcredential, phcontext, pinput, fcontextreq, targetdatarep, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCreateAsyncContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync(void* asynccontext, void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDeleteSecurityContextAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(asynccontext, phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)asynccontext;
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext(void* handle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeAsyncContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync(void* asynccontext, void* phcredential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeCredentialsHandleAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(asynccontext, phcredential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)asynccontext;
    (void)phcredential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiGetAsyncCallStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA(void* asynccontext, void* phcredential, void* phcontext, void* psztargetname, uint32_t fcontextreq, uint32_t reserved1, uint32_t targetdatarep, void* pinput, uint32_t reserved2, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(asynccontext, phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW(void* asynccontext, void* phcredential, void* phcontext, void* psztargetname, uint32_t fcontextreq, uint32_t reserved1, uint32_t targetdatarep, void* pinput, uint32_t reserved2, void* phnewcontext, void* poutput, void* pfcontextattr, void* ptsexpiry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(asynccontext, phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiReinitAsyncContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback(void* context, void* callback, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiSetAsyncNotifyCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, callback, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_VerifySignature(void* phcontext, void* pmessage, uint32_t messageseqno, void* pfqop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifySignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phcontext, pmessage, messageseqno, pfqop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckAndAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeAndAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, bool objectcreation, void* grantedaccess, void* accessstatus, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarmByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken(void* tokenhandle, bool resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAdjustGroupsToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, resettodefault, newstate, bufferlength, previousstate, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken(void* tokenhandle, bool disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAdjustPrivilegesToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, disableallprivileges, newstate, bufferlength, previousstate, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory(void* processhandle, void* baseaddress, uint64_t zerobits, void* regionsize, uint32_t allocationtype, uint32_t protect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, zerobits, regionsize, allocationtype, protect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx(void* processhandle, void* baseaddress, void* regionsize, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t extendedparametercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateVirtualMemoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, regionsize, allocationtype, pageprotection, extendedparameters, extendedparametercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx(void* filehandle, void* iorequesttocancel, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCancelIoFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iorequesttocancel, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm(void* subsystemname, void* handleid, bool generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCloseObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject(void* directoryhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateDirectoryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwCreateEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes, int32_t eventtype, bool initialstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, desiredaccess, objectattributes, eventtype, initialstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx(void* sectionhandle, uint32_t desiredaccess, void* objectattributes, void* maximumsize, uint32_t sectionpageprotection, uint32_t allocationattributes, void* filehandle, void* extendedparameters, uint32_t extendedparametercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateSectionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle, extendedparameters, extendedparametercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwDeleteFile(void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm(void* subsystemname, void* handleid, bool generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject(void* sourceprocesshandle, void* sourcehandle, void* targetprocesshandle, void* targethandle, uint32_t desiredaccess, uint32_t handleattributes, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDuplicateObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess, handleattributes, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken(void* existingtokenhandle, uint32_t desiredaccess, void* objectattributes, bool effectiveonly, int32_t tokentype, void* newtokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDuplicateToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtokenhandle, desiredaccess, objectattributes, effectiveonly, tokentype, newtokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwFilterToken(void* existingtokenhandle, uint32_t flags, void* sidstodisable, void* privilegestodelete, void* restrictedsids, void* newtokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFilterToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtokenhandle, flags, sidstodisable, privilegestodelete, restrictedsids, newtokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile(void* filehandle, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushBuffersFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx(void* filehandle, uint32_t flags, void* parameters, uint32_t parameterssize, void* iostatusblock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushBuffersFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, flags, parameters, parameterssize, iostatusblock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory(void* processhandle, void* baseaddress, void* regionsize, void* iostatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, regionsize, iostatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory(void* processhandle, void* baseaddress, void* regionsize, uint32_t freetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFreeVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, regionsize, freetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken(void* threadhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwImpersonateAnonymousToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject(void* directoryhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenDirectoryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, bool objectcreation, bool accessgranted, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken(void* processhandle, uint32_t desiredaccess, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcessToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx(void* processhandle, uint32_t desiredaccess, uint32_t handleattributes, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcessTokenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, handleattributes, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken(void* threadhandle, uint32_t desiredaccess, bool openasself, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenThreadToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx(void* threadhandle, uint32_t desiredaccess, bool openasself, uint32_t handleattributes, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenThreadTokenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, desiredaccess, openasself, handleattributes, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck(void* clienttoken, void* requiredprivileges, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegeCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienttoken, requiredprivileges, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, bool accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegeObjectAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm(void* subsystemname, void* servicename, void* clienttoken, void* privileges, bool accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegedServiceAuditAlarm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject(void* directoryhandle, void* buffer, uint32_t length, bool returnsingleentry, bool restartscan, void* context, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryhandle, buffer, length, returnsingleentry, restartscan, context, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length, bool returnsingleentry, void* ealist, uint32_t ealistlength, void* eaindex, bool restartscan) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile(void* objectattributes, void* fileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryFullAttributesFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectattributes, fileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectattributes;
    (void)fileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryObject(void* handle, int32_t objectinformationclass, void* objectinformation, uint32_t objectinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, objectinformationclass, objectinformation, objectinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)objectinformationclass;
    (void)objectinformation;
    (void)objectinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length, bool returnsingleentry, void* sidlist, uint32_t sidlistlength, void* startsid, bool restartscan) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryQuotaInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject(void* handle, uint32_t securityinformation, void* securitydescriptor, uint32_t length, void* lengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySecurityObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, securitydescriptor, length, lengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory(void* processhandle, void* baseaddress, int32_t memoryinformationclass, void* memoryinformation, uint64_t memoryinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress, memoryinformationclass, memoryinformation, memoryinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile(void* filehandle, void* iostatusblock, void* fsinformation, uint32_t length, int32_t fsinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryVolumeInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetEaFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetEaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetEvent(void* eventhandle, void* previousstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, previousstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)previousstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory(void* processhandle, int32_t vminformationclass, uint64_t numberofentries, void* virtualaddresses, void* vminformation, uint32_t vminformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, vminformationclass, numberofentries, virtualaddresses, vminformation, vminformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile(void* filehandle, void* iostatusblock, void* buffer, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetQuotaInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, buffer, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject(void* handle, uint32_t securityinformation, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetSecurityObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile(void* filehandle, void* iostatusblock, void* fsinformation, uint32_t length, int32_t fsinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetVolumeInformationFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_storage_filesystem_ZwUnlockFile(void* filehandle, void* iostatusblock, void* byteoffset, void* length, uint32_t key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwUnlockFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, iostatusblock, byteoffset, length, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

