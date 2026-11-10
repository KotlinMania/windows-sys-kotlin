#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_applicationinstallationandservicing_wrapper.h"
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

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_activateActCtx(void* hactctx, void* lpcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateActCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hactctx, lpcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hactctx;
    (void)lpcookie;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_applicationinstallationandservicing_addRefActCtx(void* hactctx) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddRefActCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hactctx);
        return;
    }
    errno = ENOSYS;
#else
    (void)hactctx;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaA(int64_t applyflags, void* lpsourcename, void* lpdeltaname, void* lptargetname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyDeltaA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applyflags, lpsourcename, lpdeltaname, lptargetname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)applyflags;
    (void)lpsourcename;
    (void)lpdeltaname;
    (void)lptargetname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaW(int64_t applyflags, void* lpsourcename, void* lpdeltaname, void* lptargetname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyDeltaW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applyflags, lpsourcename, lpdeltaname, lptargetname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)applyflags;
    (void)lpsourcename;
    (void)lpdeltaname;
    (void)lptargetname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileA(void* patchfilename, void* oldfilename, void* newfilename, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByBuffers(void* patchfilemapped, uint32_t patchfilesize, void* oldfilemapped, uint32_t oldfilesize, void* newfilebuffer, uint32_t newfilebuffersize, void* newfileactualsize, void* newfiletime, uint32_t applyoptionflags, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileByBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilemapped, patchfilesize, oldfilemapped, oldfilesize, newfilebuffer, newfilebuffersize, newfileactualsize, newfiletime, applyoptionflags, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilemapped;
    (void)patchfilesize;
    (void)oldfilemapped;
    (void)oldfilesize;
    (void)newfilebuffer;
    (void)newfilebuffersize;
    (void)newfileactualsize;
    (void)newfiletime;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandles(void* patchfilehandle, void* oldfilehandle, void* newfilehandle, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileByHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandlesEx(void* patchfilehandle, void* oldfilehandle, void* newfilehandle, uint32_t applyoptionflags, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileByHandlesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExA(void* patchfilename, void* oldfilename, void* newfilename, uint32_t applyoptionflags, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExW(void* patchfilename, void* oldfilename, void* newfilename, uint32_t applyoptionflags, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileW(void* patchfilename, void* oldfilename, void* newfilename, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, oldfilename, newfilename, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxA(void* pactctx) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateActCtxA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pactctx);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pactctx;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxW(void* pactctx) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateActCtxW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pactctx);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pactctx;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileA(void* oldfilename, void* newfilename, void* patchfilename, uint32_t optionflags, void* optiondata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldfilename, newfilename, patchfilename, optionflags, optiondata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldfilename;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandles(void* oldfilehandle, void* newfilehandle, void* patchfilehandle, uint32_t optionflags, void* optiondata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileByHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldfilehandle, newfilehandle, patchfilehandle, optionflags, optiondata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)patchfilehandle;
    (void)optionflags;
    (void)optiondata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandlesEx(uint32_t oldfilecount, void* oldfileinfoarray, void* newfilehandle, void* patchfilehandle, uint32_t optionflags, void* optiondata, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileByHandlesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldfilecount, oldfileinfoarray, newfilehandle, patchfilehandle, optionflags, optiondata, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilehandle;
    (void)patchfilehandle;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExA(uint32_t oldfilecount, void* oldfileinfoarray, void* newfilename, void* patchfilename, uint32_t optionflags, void* optiondata, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldfilecount, oldfileinfoarray, newfilename, patchfilename, optionflags, optiondata, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExW(uint32_t oldfilecount, void* oldfileinfoarray, void* newfilename, void* patchfilename, uint32_t optionflags, void* optiondata, void* progresscallback, void* callbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldfilecount, oldfileinfoarray, newfilename, patchfilename, optionflags, optiondata, progresscallback, callbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileW(void* oldfilename, void* newfilename, void* patchfilename, uint32_t optionflags, void* optiondata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldfilename, newfilename, patchfilename, optionflags, optiondata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldfilename;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_deactivateActCtx(uint32_t dwflags, uint64_t ulcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeactivateActCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, ulcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)ulcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_deltaFree(void* lpmemory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeltaFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmemory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmemory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileA(void* patchfilename, void* patchheaderfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, patchheaderfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)patchheaderfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileByHandles(void* patchfilehandle, void* patchheaderfilehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileByHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilehandle, patchheaderfilehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilehandle;
    (void)patchheaderfilehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileW(void* patchfilename, void* patchheaderfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, patchheaderfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)patchheaderfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionGuid(uint32_t dwflags, void* lpextensionguid, uint32_t ulsectionid, void* lpguidtofind, void* returneddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindActCtxSectionGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpextensionguid, ulsectionid, lpguidtofind, returneddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpguidtofind;
    (void)returneddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringA(uint32_t dwflags, void* lpextensionguid, uint32_t ulsectionid, void* lpstringtofind, void* returneddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindActCtxSectionStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpextensionguid, ulsectionid, lpstringtofind, returneddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpstringtofind;
    (void)returneddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringW(uint32_t dwflags, void* lpextensionguid, uint32_t ulsectionid, void* lpstringtofind, void* returneddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindActCtxSectionStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpextensionguid, ulsectionid, lpstringtofind, returneddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpstringtofind;
    (void)returneddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getCurrentActCtx(void* lphactctx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentActCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphactctx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphactctx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoA(void* lpdeltaname, void* lpheaderinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdeltaname, lpheaderinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdeltaname;
    (void)lpheaderinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoW(void* lpdeltaname, void* lpheaderinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdeltaname, lpheaderinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdeltaname;
    (void)lpheaderinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureA(int64_t filetypeset, uint32_t hashalgid, void* lpsourcename, void* lphash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaSignatureA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filetypeset, hashalgid, lpsourcename, lphash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filetypeset;
    (void)hashalgid;
    (void)lpsourcename;
    (void)lphash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureW(int64_t filetypeset, uint32_t hashalgid, void* lpsourcename, void* lphash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaSignatureW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filetypeset, hashalgid, lpsourcename, lphash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filetypeset;
    (void)hashalgid;
    (void)lpsourcename;
    (void)lphash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureA(void* filename, uint32_t optionflags, void* optiondata, uint32_t ignorerangecount, void* ignorerangearray, uint32_t retainrangecount, void* retainrangearray, uint32_t signaturebuffersize, void* signaturebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByBuffer(void* filebufferwritable, uint32_t filesize, uint32_t optionflags, void* optiondata, uint32_t ignorerangecount, void* ignorerangearray, uint32_t retainrangecount, void* retainrangearray, uint32_t signaturebuffersize, void* signaturebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureByBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filebufferwritable, filesize, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filebufferwritable;
    (void)filesize;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByHandle(void* filehandle, uint32_t optionflags, void* optiondata, uint32_t ignorerangecount, void* ignorerangearray, uint32_t retainrangecount, void* retainrangearray, uint32_t signaturebuffersize, void* signaturebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureW(void* filename, uint32_t optionflags, void* optiondata, uint32_t ignorerangecount, void* ignorerangearray, uint32_t retainrangecount, void* retainrangearray, uint32_t signaturebuffersize, void* signaturebuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, optionflags, optiondata, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray, signaturebuffersize, signaturebuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductA(void* szpackagepath, void* szscriptfilepath, void* sztransforms, uint16_t lgidlanguage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExA(void* szpackagepath, void* szscriptfilepath, void* sztransforms, uint16_t lgidlanguage, uint32_t dwplatform, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage, dwplatform, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    (void)dwplatform;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExW(void* szpackagepath, void* szscriptfilepath, void* sztransforms, uint16_t lgidlanguage, uint32_t dwplatform, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage, dwplatform, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    (void)dwplatform;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductW(void* szpackagepath, void* szscriptfilepath, void* sztransforms, uint16_t lgidlanguage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptA(void* szscriptfile, uint32_t dwflags, void* phregdata, int32_t fremoveitems) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseScriptA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szscriptfile, dwflags, phregdata, fremoveitems);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szscriptfile;
    (void)dwflags;
    (void)phregdata;
    (void)fremoveitems;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptW(void* szscriptfile, uint32_t dwflags, void* phregdata, int32_t fremoveitems) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseScriptW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szscriptfile, dwflags, phregdata, fremoveitems);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szscriptfile;
    (void)dwflags;
    (void)phregdata;
    (void)fremoveitems;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesA(void* szpatchpackages, void* szproductcode, void* szpropertieslist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyMultiplePatchesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchpackages, szproductcode, szpropertieslist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchpackages;
    (void)szproductcode;
    (void)szpropertieslist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesW(void* szpatchpackages, void* szproductcode, void* szpropertieslist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyMultiplePatchesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchpackages, szproductcode, szpropertieslist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchpackages;
    (void)szproductcode;
    (void)szpropertieslist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchA(void* szpatchpackage, void* szinstallpackage, int32_t einstalltype, void* szcommandline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyPatchA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchpackage, szinstallpackage, einstalltype, szcommandline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchpackage;
    (void)szinstallpackage;
    (void)einstalltype;
    (void)szcommandline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchW(void* szpatchpackage, void* szinstallpackage, int32_t einstalltype, void* szcommandline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyPatchW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchpackage, szinstallpackage, einstalltype, szcommandline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchpackage;
    (void)szinstallpackage;
    (void)einstalltype;
    (void)szcommandline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionA(void* szname, uint32_t dwtransactionattributes, void* phtransactionhandle, void* phchangeofownerevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiBeginTransactionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szname, dwtransactionattributes, phtransactionhandle, phchangeofownerevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szname;
    (void)dwtransactionattributes;
    (void)phtransactionhandle;
    (void)phchangeofownerevent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionW(void* szname, uint32_t dwtransactionattributes, void* phtransactionhandle, void* phchangeofownerevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiBeginTransactionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szname, dwtransactionattributes, phtransactionhandle, phchangeofownerevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szname;
    (void)dwtransactionattributes;
    (void)phtransactionhandle;
    (void)phchangeofownerevent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseAllHandles(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCloseAllHandles");
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

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseHandle(uint32_t hany) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hany);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hany;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoA(void* szproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCollectUserInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoW(void* szproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCollectUserInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureA(void* szproduct, void* szfeature, int32_t einstallstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureFeatureA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, einstallstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)einstallstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureW(void* szproduct, void* szfeature, int32_t einstallstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureFeatureW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, einstallstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)einstallstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductA(void* szproduct, int32_t iinstalllevel, int32_t einstallstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, iinstalllevel, einstallstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExA(void* szproduct, int32_t iinstalllevel, int32_t einstallstate, void* szcommandline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, iinstalllevel, einstallstate, szcommandline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    (void)szcommandline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExW(void* szproduct, int32_t iinstalllevel, int32_t einstallstate, void* szcommandline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, iinstalllevel, einstallstate, szcommandline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    (void)szcommandline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductW(void* szproduct, int32_t iinstalllevel, int32_t einstallstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, iinstalllevel, einstallstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateRecord(uint32_t cparams) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCreateRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cparams);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cparams;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoA(uint32_t hdatabase, uint32_t hdatabasereference, void* sztransformfile, int32_t ierrorconditions, int32_t ivalidation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCreateTransformSummaryInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ierrorconditions, ivalidation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ierrorconditions;
    (void)ivalidation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoW(uint32_t hdatabase, uint32_t hdatabasereference, void* sztransformfile, int32_t ierrorconditions, int32_t ivalidation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCreateTransformSummaryInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ierrorconditions, ivalidation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ierrorconditions;
    (void)ivalidation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformA(uint32_t hdatabase, void* sztransformfile, int32_t ierrorconditions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseApplyTransformA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztransformfile, ierrorconditions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)sztransformfile;
    (void)ierrorconditions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformW(uint32_t hdatabase, void* sztransformfile, int32_t ierrorconditions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseApplyTransformW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztransformfile, ierrorconditions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)sztransformfile;
    (void)ierrorconditions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseCommit(uint32_t hdatabase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseCommit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportA(uint32_t hdatabase, void* sztablename, void* szfolderpath, void* szfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseExportA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztablename, szfolderpath, szfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)szfolderpath;
    (void)szfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportW(uint32_t hdatabase, void* sztablename, void* szfolderpath, void* szfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseExportW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztablename, szfolderpath, szfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)szfolderpath;
    (void)szfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformA(uint32_t hdatabase, uint32_t hdatabasereference, void* sztransformfile, int32_t ireserved1, int32_t ireserved2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGenerateTransformA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ireserved1, ireserved2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ireserved1;
    (void)ireserved2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformW(uint32_t hdatabase, uint32_t hdatabasereference, void* sztransformfile, int32_t ireserved1, int32_t ireserved2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGenerateTransformW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, hdatabasereference, sztransformfile, ireserved1, ireserved2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ireserved1;
    (void)ireserved2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysA(uint32_t hdatabase, void* sztablename, void* phrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGetPrimaryKeysA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztablename, phrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)phrecord;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysW(uint32_t hdatabase, void* sztablename, void* phrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGetPrimaryKeysW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztablename, phrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)phrecord;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportA(uint32_t hdatabase, void* szfolderpath, void* szfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseImportA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, szfolderpath, szfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)szfolderpath;
    (void)szfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportW(uint32_t hdatabase, void* szfolderpath, void* szfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseImportW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, szfolderpath, szfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)szfolderpath;
    (void)szfilename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentA(uint32_t hdatabase, void* sztablename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseIsTablePersistentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdatabase;
    (void)sztablename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentW(uint32_t hdatabase, void* sztablename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseIsTablePersistentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, sztablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdatabase;
    (void)sztablename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeA(uint32_t hdatabase, uint32_t hdatabasemerge, void* sztablename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseMergeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, hdatabasemerge, sztablename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)hdatabasemerge;
    (void)sztablename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeW(uint32_t hdatabase, uint32_t hdatabasemerge, void* sztablename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseMergeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, hdatabasemerge, sztablename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)hdatabasemerge;
    (void)sztablename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewA(uint32_t hdatabase, void* szquery, void* phview) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseOpenViewA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, szquery, phview);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)szquery;
    (void)phview;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewW(uint32_t hdatabase, void* szquery, void* phview) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseOpenViewW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, szquery, phview);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)szquery;
    (void)phview;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesA(void* szproductpackagepath, uint32_t cpatchinfo, void* ppatchinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDetermineApplicablePatchesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductpackagepath, cpatchinfo, ppatchinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductpackagepath;
    (void)cpatchinfo;
    (void)ppatchinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesW(void* szproductpackagepath, uint32_t cpatchinfo, void* ppatchinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDetermineApplicablePatchesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductpackagepath, cpatchinfo, ppatchinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductpackagepath;
    (void)cpatchinfo;
    (void)ppatchinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceA(void* szproductcode, void* szusersid, int32_t dwcontext, uint32_t cpatchinfo, void* ppatchinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDeterminePatchSequenceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, cpatchinfo, ppatchinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)cpatchinfo;
    (void)ppatchinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceW(void* szproductcode, void* szusersid, int32_t dwcontext, uint32_t cpatchinfo, void* ppatchinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDeterminePatchSequenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, cpatchinfo, ppatchinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)cpatchinfo;
    (void)ppatchinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionA(uint32_t hinstall, void* szaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDoActionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionW(uint32_t hinstall, void* szaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDoActionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogA(uint32_t dwlogmode, void* szlogfile, uint32_t dwlogattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnableLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwlogmode, szlogfile, dwlogattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwlogmode;
    (void)szlogfile;
    (void)dwlogattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogW(uint32_t dwlogmode, void* szlogfile, uint32_t dwlogattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnableLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwlogmode, szlogfile, dwlogattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwlogmode;
    (void)szlogfile;
    (void)dwlogattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableUIPreview(uint32_t hdatabase, void* phpreview) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnableUIPreview");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, phpreview);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)phpreview;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEndTransaction(uint32_t dwtransactionstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEndTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtransactionstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtransactionstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsA(void* szcomponent, uint32_t iproductindex, void* lpproductbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, iproductindex, lpproductbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)iproductindex;
    (void)lpproductbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExA(void* szcomponent, void* szusersid, uint32_t dwcontext, uint32_t dwproductindex, void* szproductbuf, void* pdwinstalledcontext, void* szsid, void* pcchsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, szusersid, dwcontext, dwproductindex, szproductbuf, pdwinstalledcontext, szsid, pcchsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)szusersid;
    (void)dwcontext;
    (void)dwproductindex;
    (void)szproductbuf;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExW(void* szcomponent, void* szusersid, uint32_t dwcontext, uint32_t dwproductindex, void* szproductbuf, void* pdwinstalledcontext, void* szsid, void* pcchsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, szusersid, dwcontext, dwproductindex, szproductbuf, pdwinstalledcontext, szsid, pcchsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)szusersid;
    (void)dwcontext;
    (void)dwproductindex;
    (void)szproductbuf;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsW(void* szcomponent, uint32_t iproductindex, void* lpproductbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, iproductindex, lpproductbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)iproductindex;
    (void)lpproductbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsA(uint32_t hinstall, void* szcomponent, uint32_t dwindex, int32_t istate, void* szdrivebuf, void* pcchdrivebuf, void* picost, void* pitempcost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentCostsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcomponent, dwindex, istate, szdrivebuf, pcchdrivebuf, picost, pitempcost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)dwindex;
    (void)istate;
    (void)szdrivebuf;
    (void)pcchdrivebuf;
    (void)picost;
    (void)pitempcost;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsW(uint32_t hinstall, void* szcomponent, uint32_t dwindex, int32_t istate, void* szdrivebuf, void* pcchdrivebuf, void* picost, void* pitempcost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentCostsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcomponent, dwindex, istate, szdrivebuf, pcchdrivebuf, picost, pitempcost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)dwindex;
    (void)istate;
    (void)szdrivebuf;
    (void)pcchdrivebuf;
    (void)picost;
    (void)pitempcost;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersA(void* szcomponent, uint32_t iindex, void* lpqualifierbuf, void* pcchqualifierbuf, void* lpapplicationdatabuf, void* pcchapplicationdatabuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentQualifiersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, iindex, lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)iindex;
    (void)lpqualifierbuf;
    (void)pcchqualifierbuf;
    (void)lpapplicationdatabuf;
    (void)pcchapplicationdatabuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersW(void* szcomponent, uint32_t iindex, void* lpqualifierbuf, void* pcchqualifierbuf, void* lpapplicationdatabuf, void* pcchapplicationdatabuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentQualifiersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, iindex, lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)iindex;
    (void)lpqualifierbuf;
    (void)pcchqualifierbuf;
    (void)lpapplicationdatabuf;
    (void)pcchapplicationdatabuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsA(uint32_t icomponentindex, void* lpcomponentbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icomponentindex, lpcomponentbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)icomponentindex;
    (void)lpcomponentbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExA(void* szusersid, uint32_t dwcontext, uint32_t dwindex, void* szinstalledcomponentcode, void* pdwinstalledcontext, void* szsid, void* pcchsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szusersid, dwcontext, dwindex, szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledcomponentcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExW(void* szusersid, uint32_t dwcontext, uint32_t dwindex, void* szinstalledcomponentcode, void* pdwinstalledcontext, void* szsid, void* pcchsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szusersid, dwcontext, dwindex, szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledcomponentcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsW(uint32_t icomponentindex, void* lpcomponentbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icomponentindex, lpcomponentbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)icomponentindex;
    (void)lpcomponentbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesA(void* szproduct, uint32_t ifeatureindex, void* lpfeaturebuf, void* lpparentbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumFeaturesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, ifeatureindex, lpfeaturebuf, lpparentbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)ifeatureindex;
    (void)lpfeaturebuf;
    (void)lpparentbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesW(void* szproduct, uint32_t ifeatureindex, void* lpfeaturebuf, void* lpparentbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumFeaturesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, ifeatureindex, lpfeaturebuf, lpparentbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)ifeatureindex;
    (void)lpfeaturebuf;
    (void)lpparentbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesA(void* szproduct, uint32_t ipatchindex, void* lppatchbuf, void* lptransformsbuf, void* pcchtransformsbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, ipatchindex, lppatchbuf, lptransformsbuf, pcchtransformsbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)ipatchindex;
    (void)lppatchbuf;
    (void)lptransformsbuf;
    (void)pcchtransformsbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExA(void* szproductcode, void* szusersid, uint32_t dwcontext, uint32_t dwfilter, uint32_t dwindex, void* szpatchcode, void* sztargetproductcode, void* pdwtargetproductcontext, void* sztargetusersid, void* pcchtargetusersid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, dwfilter, dwindex, szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwfilter;
    (void)dwindex;
    (void)szpatchcode;
    (void)sztargetproductcode;
    (void)pdwtargetproductcontext;
    (void)sztargetusersid;
    (void)pcchtargetusersid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExW(void* szproductcode, void* szusersid, uint32_t dwcontext, uint32_t dwfilter, uint32_t dwindex, void* szpatchcode, void* sztargetproductcode, void* pdwtargetproductcontext, void* sztargetusersid, void* pcchtargetusersid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, dwfilter, dwindex, szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwfilter;
    (void)dwindex;
    (void)szpatchcode;
    (void)sztargetproductcode;
    (void)pdwtargetproductcontext;
    (void)sztargetusersid;
    (void)pcchtargetusersid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesW(void* szproduct, uint32_t ipatchindex, void* lppatchbuf, void* lptransformsbuf, void* pcchtransformsbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, ipatchindex, lppatchbuf, lptransformsbuf, pcchtransformsbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)ipatchindex;
    (void)lppatchbuf;
    (void)lptransformsbuf;
    (void)pcchtransformsbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsA(uint32_t iproductindex, void* lpproductbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iproductindex, lpproductbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iproductindex;
    (void)lpproductbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExA(void* szproductcode, void* szusersid, uint32_t dwcontext, uint32_t dwindex, void* szinstalledproductcode, void* pdwinstalledcontext, void* szsid, void* pcchsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, dwindex, szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledproductcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExW(void* szproductcode, void* szusersid, uint32_t dwcontext, uint32_t dwindex, void* szinstalledproductcode, void* pdwinstalledcontext, void* szsid, void* pcchsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, dwindex, szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledproductcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsW(uint32_t iproductindex, void* lpproductbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iproductindex, lpproductbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iproductindex;
    (void)lpproductbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsA(void* lpupgradecode, uint32_t dwreserved, uint32_t iproductindex, void* lpproductbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumRelatedProductsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpupgradecode, dwreserved, iproductindex, lpproductbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpupgradecode;
    (void)dwreserved;
    (void)iproductindex;
    (void)lpproductbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsW(void* lpupgradecode, uint32_t dwreserved, uint32_t iproductindex, void* lpproductbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumRelatedProductsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpupgradecode, dwreserved, iproductindex, lpproductbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpupgradecode;
    (void)dwreserved;
    (void)iproductindex;
    (void)lpproductbuf;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionA(uint32_t hinstall, void* szcondition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEvaluateConditionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcondition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstall;
    (void)szcondition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionW(uint32_t hinstall, void* szcondition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEvaluateConditionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcondition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstall;
    (void)szcondition;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataA(void* szpatchpath, uint32_t dwreserved, void* szxmldata, void* pcchxmldata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiExtractPatchXMLDataA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchpath, dwreserved, szxmldata, pcchxmldata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchpath;
    (void)dwreserved;
    (void)szxmldata;
    (void)pcchxmldata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataW(void* szpatchpath, uint32_t dwreserved, void* szxmldata, void* pcchxmldata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiExtractPatchXMLDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchpath, dwreserved, szxmldata, pcchxmldata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchpath;
    (void)dwreserved;
    (void)szxmldata;
    (void)pcchxmldata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordA(uint32_t hinstall, uint32_t hrecord, void* szresultbuf, void* pcchresultbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiFormatRecordA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, hrecord, szresultbuf, pcchresultbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)hrecord;
    (void)szresultbuf;
    (void)pcchresultbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordW(uint32_t hinstall, uint32_t hrecord, void* szresultbuf, void* pcchresultbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiFormatRecordW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, hrecord, szresultbuf, pcchresultbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)hrecord;
    (void)szresultbuf;
    (void)pcchresultbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetActiveDatabase(uint32_t hinstall) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetActiveDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathA(void* szproduct, void* szcomponent, void* lppathbuf, void* pcchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szcomponent, lppathbuf, pcchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExA(void* szproductcode, void* szcomponentcode, void* szusersid, int32_t dwcontext, void* lpoutpathbuffer, void* pcchoutpathbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szcomponentcode, szusersid, dwcontext, lpoutpathbuffer, pcchoutpathbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproductcode;
    (void)szcomponentcode;
    (void)szusersid;
    (void)dwcontext;
    (void)lpoutpathbuffer;
    (void)pcchoutpathbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExW(void* szproductcode, void* szcomponentcode, void* szusersid, int32_t dwcontext, void* lpoutpathbuffer, void* pcchoutpathbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szcomponentcode, szusersid, dwcontext, lpoutpathbuffer, pcchoutpathbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproductcode;
    (void)szcomponentcode;
    (void)szusersid;
    (void)dwcontext;
    (void)lpoutpathbuffer;
    (void)pcchoutpathbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathW(void* szproduct, void* szcomponent, void* lppathbuf, void* pcchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szcomponent, lppathbuf, pcchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateA(uint32_t hinstall, void* szcomponent, void* piinstalled, void* piaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcomponent, piinstalled, piaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)piinstalled;
    (void)piaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateW(uint32_t hinstall, void* szcomponent, void* piinstalled, void* piaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcomponent, piinstalled, piaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)piinstalled;
    (void)piaction;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetDatabaseState(uint32_t hdatabase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetDatabaseState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdatabase;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostA(uint32_t hinstall, void* szfeature, int32_t icosttree, int32_t istate, void* picost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureCostA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, icosttree, istate, picost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)icosttree;
    (void)istate;
    (void)picost;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostW(uint32_t hinstall, void* szfeature, int32_t icosttree, int32_t istate, void* picost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureCostW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, icosttree, istate, picost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)icosttree;
    (void)istate;
    (void)picost;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoA(uint32_t hproduct, void* szfeature, void* lpattributes, void* lptitlebuf, void* pcchtitlebuf, void* lphelpbuf, void* pcchhelpbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproduct, szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hproduct;
    (void)szfeature;
    (void)lpattributes;
    (void)lptitlebuf;
    (void)pcchtitlebuf;
    (void)lphelpbuf;
    (void)pcchhelpbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoW(uint32_t hproduct, void* szfeature, void* lpattributes, void* lptitlebuf, void* pcchtitlebuf, void* lphelpbuf, void* pcchhelpbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproduct, szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hproduct;
    (void)szfeature;
    (void)lpattributes;
    (void)lptitlebuf;
    (void)pcchtitlebuf;
    (void)lphelpbuf;
    (void)pcchhelpbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateA(uint32_t hinstall, void* szfeature, void* piinstalled, void* piaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, piinstalled, piaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)piinstalled;
    (void)piaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateW(uint32_t hinstall, void* szfeature, void* piinstalled, void* piaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, piinstalled, piaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)piinstalled;
    (void)piaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageA(void* szproduct, void* szfeature, void* pdwusecount, void* pwdateused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureUsageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, pdwusecount, pwdateused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)pdwusecount;
    (void)pwdateused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageW(void* szproduct, void* szfeature, void* pdwusecount, void* pwdateused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureUsageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, pdwusecount, pwdateused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)pdwusecount;
    (void)pwdateused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesA(uint32_t hinstall, void* szfeature, void* lpinstallstates) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureValidStatesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, lpinstallstates);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)lpinstallstates;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesW(uint32_t hinstall, void* szfeature, void* lpinstallstates) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureValidStatesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, lpinstallstates);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)lpinstallstates;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashA(void* szfilepath, uint32_t dwoptions, void* phash) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileHashA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilepath, dwoptions, phash);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilepath;
    (void)dwoptions;
    (void)phash;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashW(void* szfilepath, uint32_t dwoptions, void* phash) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileHashW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilepath, dwoptions, phash);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilepath;
    (void)dwoptions;
    (void)phash;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationA(void* szsignedobjectpath, uint32_t dwflags, void* ppccertcontext, void* pbhashdata, void* pcbhashdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileSignatureInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szsignedobjectpath, dwflags, ppccertcontext, pbhashdata, pcbhashdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szsignedobjectpath;
    (void)dwflags;
    (void)ppccertcontext;
    (void)pbhashdata;
    (void)pcbhashdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationW(void* szsignedobjectpath, uint32_t dwflags, void* ppccertcontext, void* pbhashdata, void* pcbhashdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileSignatureInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szsignedobjectpath, dwflags, ppccertcontext, pbhashdata, pcbhashdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szsignedobjectpath;
    (void)dwflags;
    (void)ppccertcontext;
    (void)pbhashdata;
    (void)pcbhashdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionA(void* szfilepath, void* lpversionbuf, void* pcchversionbuf, void* lplangbuf, void* pcchlangbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileVersionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilepath;
    (void)lpversionbuf;
    (void)pcchversionbuf;
    (void)lplangbuf;
    (void)pcchlangbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionW(void* szfilepath, void* lpversionbuf, void* pcchversionbuf, void* lplangbuf, void* pcchlangbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileVersionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilepath;
    (void)lpversionbuf;
    (void)pcchversionbuf;
    (void)lplangbuf;
    (void)pcchlangbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLanguage(uint32_t hinstall) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetLanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLastErrorRecord(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetLastErrorRecord");
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

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetMode(uint32_t hinstall, int32_t erunmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, erunmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstall;
    (void)erunmode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListA(void* szproductcode, void* szpatchpackages, void* pcfiles, void* pphfilerecords) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchFileListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szpatchpackages, pcfiles, pphfilerecords);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szpatchpackages;
    (void)pcfiles;
    (void)pphfilerecords;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListW(void* szproductcode, void* szpatchpackages, void* pcfiles, void* pphfilerecords) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchFileListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szpatchpackages, pcfiles, pphfilerecords);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szpatchpackages;
    (void)pcfiles;
    (void)pphfilerecords;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoA(void* szpatch, void* szattribute, void* lpvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatch, szattribute, lpvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatch;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExA(void* szpatchcode, void* szproductcode, void* szusersid, int32_t dwcontext, void* szproperty, void* lpvalue, void* pcchvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchcode, szproductcode, szusersid, dwcontext, szproperty, lpvalue, pcchvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchcode;
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)lpvalue;
    (void)pcchvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExW(void* szpatchcode, void* szproductcode, void* szusersid, int32_t dwcontext, void* szproperty, void* lpvalue, void* pcchvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchcode, szproductcode, szusersid, dwcontext, szproperty, lpvalue, pcchvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchcode;
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)lpvalue;
    (void)pcchvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoW(void* szpatch, void* szattribute, void* lpvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatch, szattribute, lpvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatch;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeA(void* szcomponent, void* lpbuf39) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductCodeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, lpbuf39);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)lpbuf39;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeW(void* szcomponent, void* lpbuf39) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductCodeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, lpbuf39);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcomponent;
    (void)lpbuf39;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoA(void* szproduct, void* szattribute, void* lpvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szattribute, lpvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExA(void* szproductcode, void* szusersid, int32_t dwcontext, void* szproperty, void* szvalue, void* pcchvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, szproperty, szvalue, pcchvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExW(void* szproductcode, void* szusersid, int32_t dwcontext, void* szproperty, void* szvalue, void* pcchvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, szproperty, szvalue, pcchvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptA(void* szscriptfile, void* lpproductbuf39, void* plgidlanguage, void* pdwversion, void* lpnamebuf, void* pcchnamebuf, void* lppackagebuf, void* pcchpackagebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoFromScriptA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szscriptfile;
    (void)lpproductbuf39;
    (void)plgidlanguage;
    (void)pdwversion;
    (void)lpnamebuf;
    (void)pcchnamebuf;
    (void)lppackagebuf;
    (void)pcchpackagebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptW(void* szscriptfile, void* lpproductbuf39, void* plgidlanguage, void* pdwversion, void* lpnamebuf, void* pcchnamebuf, void* lppackagebuf, void* pcchpackagebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoFromScriptW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szscriptfile;
    (void)lpproductbuf39;
    (void)plgidlanguage;
    (void)pdwversion;
    (void)lpnamebuf;
    (void)pcchnamebuf;
    (void)lppackagebuf;
    (void)pcchpackagebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoW(void* szproduct, void* szattribute, void* lpvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szattribute, lpvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyA(uint32_t hproduct, void* szproperty, void* lpvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproduct, szproperty, lpvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hproduct;
    (void)szproperty;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyW(uint32_t hproduct, void* szproperty, void* lpvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproduct, szproperty, lpvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hproduct;
    (void)szproperty;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyA(uint32_t hinstall, void* szname, void* szvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szname, szvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyW(uint32_t hinstall, void* szname, void* szvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szname, szvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetA(void* szshortcutpath, void* szproductcode, void* szfeatureid, void* szcomponentcode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetShortcutTargetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szshortcutpath, szproductcode, szfeatureid, szcomponentcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szshortcutpath;
    (void)szproductcode;
    (void)szfeatureid;
    (void)szcomponentcode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetW(void* szshortcutpath, void* szproductcode, void* szfeatureid, void* szcomponentcode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetShortcutTargetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szshortcutpath, szproductcode, szfeatureid, szcomponentcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szshortcutpath;
    (void)szproductcode;
    (void)szfeatureid;
    (void)szcomponentcode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathA(uint32_t hinstall, void* szfolder, void* szpathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSourcePathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathW(uint32_t hinstall, void* szfolder, void* szpathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSourcePathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationA(uint32_t hdatabase, void* szdatabasepath, uint32_t uiupdatecount, void* phsummaryinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSummaryInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, szdatabasepath, uiupdatecount, phsummaryinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)szdatabasepath;
    (void)uiupdatecount;
    (void)phsummaryinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationW(uint32_t hdatabase, void* szdatabasepath, uint32_t uiupdatecount, void* phsummaryinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSummaryInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdatabase, szdatabasepath, uiupdatecount, phsummaryinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdatabase;
    (void)szdatabasepath;
    (void)uiupdatecount;
    (void)phsummaryinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathA(uint32_t hinstall, void* szfolder, void* szpathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetTargetPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathW(uint32_t hinstall, void* szfolder, void* szpathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetTargetPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfolder, szpathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoA(void* szproduct, void* lpusernamebuf, void* pcchusernamebuf, void* lporgnamebuf, void* pcchorgnamebuf, void* lpserialbuf, void* pcchserialbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetUserInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)lpusernamebuf;
    (void)pcchusernamebuf;
    (void)lporgnamebuf;
    (void)pcchorgnamebuf;
    (void)lpserialbuf;
    (void)pcchserialbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoW(void* szproduct, void* lpusernamebuf, void* pcchusernamebuf, void* lporgnamebuf, void* pcchorgnamebuf, void* lpserialbuf, void* pcchserialbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetUserInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)lpusernamebuf;
    (void)pcchusernamebuf;
    (void)lporgnamebuf;
    (void)pcchorgnamebuf;
    (void)lpserialbuf;
    (void)pcchserialbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentA(void* szproduct, void* szcomponent, int32_t einstallstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingComponentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szcomponent, einstallstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)einstallstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentW(void* szproduct, void* szcomponent, int32_t einstallstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingComponentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szcomponent, einstallstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)einstallstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileA(void* szproduct, void* szfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileW(void* szproduct, void* szfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductA(void* szpackagepath, void* szcommandline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallProductA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, szcommandline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)szcommandline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductW(void* szpackagepath, void* szcommandline) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallProductW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, szcommandline);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)szcommandline;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedA(void* szproduct, void* pfelevated) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiIsProductElevatedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, pfelevated);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)pfelevated;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedW(void* szproduct, void* pfelevated) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiIsProductElevatedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, pfelevated);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)pfelevated;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiJoinTransaction(uint32_t htransactionhandle, uint32_t dwtransactionattributes, void* phchangeofownerevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiJoinTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htransactionhandle, dwtransactionattributes, phchangeofownerevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htransactionhandle;
    (void)dwtransactionattributes;
    (void)phchangeofownerevent;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentA(void* szcomponent, void* lppathbuf, void* pcchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiLocateComponentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, lppathbuf, pcchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentW(void* szcomponent, void* lppathbuf, void* pcchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiLocateComponentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcomponent, lppathbuf, pcchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeA(void* poldsid, void* pnewsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiNotifySidChangeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poldsid, pnewsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)poldsid;
    (void)pnewsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeW(void* poldsid, void* pnewsid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiNotifySidChangeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poldsid, pnewsid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)poldsid;
    (void)pnewsid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseA(void* szdatabasepath, void* szpersist, void* phdatabase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenDatabaseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatabasepath, szpersist, phdatabase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatabasepath;
    (void)szpersist;
    (void)phdatabase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseW(void* szdatabasepath, void* szpersist, void* phdatabase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenDatabaseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatabasepath, szpersist, phdatabase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szdatabasepath;
    (void)szpersist;
    (void)phdatabase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageA(void* szpackagepath, void* hproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, hproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)hproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExA(void* szpackagepath, uint32_t dwoptions, void* hproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, dwoptions, hproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)dwoptions;
    (void)hproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExW(void* szpackagepath, uint32_t dwoptions, void* hproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, dwoptions, hproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)dwoptions;
    (void)hproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageW(void* szpackagepath, void* hproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath, hproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    (void)hproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductA(void* szproduct, void* hproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenProductA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, hproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)hproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductW(void* szproduct, void* hproduct) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenProductW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, hproduct);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)hproduct;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardA(uint32_t hpreview, void* szcontrolname, void* szbillboard) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewBillboardA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpreview, szcontrolname, szbillboard);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpreview;
    (void)szcontrolname;
    (void)szbillboard;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardW(uint32_t hpreview, void* szcontrolname, void* szbillboard) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewBillboardW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpreview, szcontrolname, szbillboard);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpreview;
    (void)szcontrolname;
    (void)szbillboard;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogA(uint32_t hpreview, void* szdialogname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewDialogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpreview, szdialogname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpreview;
    (void)szdialogname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogW(uint32_t hpreview, void* szdialogname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpreview, szdialogname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpreview;
    (void)szdialogname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptA(void* szscriptfile, void* sziconfolder, void* hregdata, int32_t fshortcuts, int32_t fremoveitems) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProcessAdvertiseScriptA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szscriptfile, sziconfolder, hregdata, fshortcuts, fremoveitems);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szscriptfile;
    (void)sziconfolder;
    (void)hregdata;
    (void)fshortcuts;
    (void)fremoveitems;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptW(void* szscriptfile, void* sziconfolder, void* hregdata, int32_t fshortcuts, int32_t fremoveitems) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProcessAdvertiseScriptW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szscriptfile, sziconfolder, hregdata, fshortcuts, fremoveitems);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szscriptfile;
    (void)sziconfolder;
    (void)hregdata;
    (void)fshortcuts;
    (void)fremoveitems;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessMessage(uint32_t hinstall, int32_t emessagetype, uint32_t hrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProcessMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, emessagetype, hrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstall;
    (void)emessagetype;
    (void)hrecord;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyA(void* szassemblyname, void* szappcontext, uint32_t dwinstallmode, uint32_t dwassemblyinfo, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideAssemblyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szassemblyname, szappcontext, dwinstallmode, dwassemblyinfo, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szassemblyname;
    (void)szappcontext;
    (void)dwinstallmode;
    (void)dwassemblyinfo;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyW(void* szassemblyname, void* szappcontext, uint32_t dwinstallmode, uint32_t dwassemblyinfo, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideAssemblyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szassemblyname, szappcontext, dwinstallmode, dwassemblyinfo, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szassemblyname;
    (void)szappcontext;
    (void)dwinstallmode;
    (void)dwassemblyinfo;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentA(void* szproduct, void* szfeature, void* szcomponent, uint32_t dwinstallmode, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideComponentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, szcomponent, dwinstallmode, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)szcomponent;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentW(void* szproduct, void* szfeature, void* szcomponent, uint32_t dwinstallmode, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideComponentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, szcomponent, dwinstallmode, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)szcomponent;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentA(void* szcategory, void* szqualifier, uint32_t dwinstallmode, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcategory, szqualifier, dwinstallmode, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExA(void* szcategory, void* szqualifier, uint32_t dwinstallmode, void* szproduct, uint32_t dwunused1, uint32_t dwunused2, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcategory, szqualifier, dwinstallmode, szproduct, dwunused1, dwunused2, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)szproduct;
    (void)dwunused1;
    (void)dwunused2;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExW(void* szcategory, void* szqualifier, uint32_t dwinstallmode, void* szproduct, uint32_t dwunused1, uint32_t dwunused2, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcategory, szqualifier, dwinstallmode, szproduct, dwunused1, dwunused2, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)szproduct;
    (void)dwunused1;
    (void)dwunused2;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentW(void* szcategory, void* szqualifier, uint32_t dwinstallmode, void* lppathbuf, void* pcchpathbuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcategory, szqualifier, dwinstallmode, lppathbuf, pcchpathbuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateA(void* szproductcode, void* szusersid, int32_t dwcontext, void* szcomponentcode, void* pdwstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryComponentStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, szcomponentcode, pdwstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szcomponentcode;
    (void)pdwstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateW(void* szproductcode, void* szusersid, int32_t dwcontext, void* szcomponentcode, void* pdwstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryComponentStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, szcomponentcode, pdwstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szcomponentcode;
    (void)pdwstate;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateA(void* szproduct, void* szfeature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szfeature;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExA(void* szproductcode, void* szusersid, int32_t dwcontext, void* szfeature, void* pdwstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, szfeature, pdwstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szfeature;
    (void)pdwstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExW(void* szproductcode, void* szusersid, int32_t dwcontext, void* szfeature, void* pdwstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcode, szusersid, dwcontext, szfeature, pdwstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szfeature;
    (void)pdwstate;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateW(void* szproduct, void* szfeature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szfeature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateA(void* szproduct) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryProductStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateW(void* szproduct) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryProductStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordClearData(uint32_t hrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordClearData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordDataSize(uint32_t hrecord, uint32_t ifield) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordDataSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetFieldCount(uint32_t hrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetFieldCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetInteger(uint32_t hrecord, uint32_t ifield) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetInteger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecord;
    (void)ifield;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringA(uint32_t hrecord, uint32_t ifield, void* szvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringW(uint32_t hrecord, uint32_t ifield, void* szvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordIsNull(uint32_t hrecord, uint32_t ifield) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordIsNull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecord;
    (void)ifield;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordReadStream(uint32_t hrecord, uint32_t ifield, void* szdatabuf, void* pcbdatabuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordReadStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szdatabuf, pcbdatabuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szdatabuf;
    (void)pcbdatabuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetInteger(uint32_t hrecord, uint32_t ifield, int32_t ivalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetInteger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, ivalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)ivalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamA(uint32_t hrecord, uint32_t ifield, void* szfilepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szfilepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szfilepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamW(uint32_t hrecord, uint32_t ifield, void* szfilepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szfilepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szfilepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringA(uint32_t hrecord, uint32_t ifield, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringW(uint32_t hrecord, uint32_t ifield, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, ifield, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureA(void* szproduct, void* szfeature, uint32_t dwreinstallmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallFeatureA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, dwreinstallmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwreinstallmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureW(void* szproduct, void* szfeature, uint32_t dwreinstallmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallFeatureW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, dwreinstallmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwreinstallmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductA(void* szproduct, uint32_t szreinstallmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallProductA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szreinstallmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szreinstallmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductW(void* szproduct, uint32_t szreinstallmode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallProductW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szreinstallmode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szreinstallmode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesA(void* szpatchlist, void* szproductcode, int32_t euninstalltype, void* szpropertylist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRemovePatchesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchlist, szproductcode, euninstalltype, szpropertylist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchlist;
    (void)szproductcode;
    (void)euninstalltype;
    (void)szpropertylist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesW(void* szpatchlist, void* szproductcode, int32_t euninstalltype, void* szpropertylist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRemovePatchesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpatchlist, szproductcode, euninstalltype, szpropertylist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpatchlist;
    (void)szproductcode;
    (void)euninstalltype;
    (void)szpropertylist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceA(uint32_t hinstall, void* sztable, int32_t isequencemode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSequenceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, sztable, isequencemode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)sztable;
    (void)isequencemode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceW(uint32_t hinstall, void* sztable, int32_t isequencemode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSequenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, sztable, isequencemode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)sztable;
    (void)isequencemode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateA(uint32_t hinstall, void* szcomponent, int32_t istate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetComponentStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcomponent, istate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)istate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateW(uint32_t hinstall, void* szcomponent, int32_t istate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetComponentStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szcomponent, istate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)istate;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIA(void* puihandler, uint32_t dwmessagefilter, void* pvcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetExternalUIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puihandler, dwmessagefilter, pvcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIRecord(void* puihandler, uint32_t dwmessagefilter, void* pvcontext, void* ppuiprevhandler) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetExternalUIRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puihandler, dwmessagefilter, pvcontext, ppuiprevhandler);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    (void)ppuiprevhandler;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIW(void* puihandler, uint32_t dwmessagefilter, void* pvcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetExternalUIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puihandler, dwmessagefilter, pvcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesA(uint32_t hinstall, void* szfeature, uint32_t dwattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, dwattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)dwattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesW(uint32_t hinstall, void* szfeature, uint32_t dwattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, dwattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)dwattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateA(uint32_t hinstall, void* szfeature, int32_t istate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, istate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)istate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateW(uint32_t hinstall, void* szfeature, int32_t istate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfeature, istate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)istate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInstallLevel(uint32_t hinstall, int32_t iinstalllevel) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetInstallLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, iinstalllevel);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)iinstalllevel;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInternalUI(int32_t dwuilevel, void* phwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetInternalUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuilevel, phwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwuilevel;
    (void)phwnd;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetMode(uint32_t hinstall, int32_t erunmode, int32_t fstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, erunmode, fstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)erunmode;
    (void)fstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyA(uint32_t hinstall, void* szname, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szname, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyW(uint32_t hinstall, void* szname, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szname, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathA(uint32_t hinstall, void* szfolder, void* szfolderpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetTargetPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfolder, szfolderpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szfolderpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathW(uint32_t hinstall, void* szfolder, void* szfolderpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetTargetPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall, szfolder, szfolderpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szfolderpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwdiskid, void* szvolumelabel, void* szdiskprompt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddMediaDiskA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid, szvolumelabel, szdiskprompt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    (void)szvolumelabel;
    (void)szdiskprompt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwdiskid, void* szvolumelabel, void* szdiskprompt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddMediaDiskW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid, szvolumelabel, szdiskprompt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    (void)szvolumelabel;
    (void)szdiskprompt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceA(void* szproduct, void* szusername, uint32_t dwreserved, void* szsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szusername, dwreserved, szsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    (void)szsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szsource, uint32_t dwindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource, dwindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    (void)dwindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szsource, uint32_t dwindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource, dwindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    (void)dwindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceW(void* szproduct, void* szusername, uint32_t dwreserved, void* szsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szusername, dwreserved, szsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    (void)szsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllA(void* szproduct, void* szusername, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szusername, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllW(void* szproduct, void* szusername, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szusername, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwdiskid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearMediaDiskA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwdiskid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearMediaDiskW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwdiskid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearSourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearSourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwindex, void* pdwdiskid, void* szvolumelabel, void* pcchvolumelabel, void* szdiskprompt, void* pcchdiskprompt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumMediaDisksA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)pdwdiskid;
    (void)szvolumelabel;
    (void)pcchvolumelabel;
    (void)szdiskprompt;
    (void)pcchdiskprompt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwindex, void* pdwdiskid, void* szvolumelabel, void* pcchvolumelabel, void* szdiskprompt, void* pcchdiskprompt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumMediaDisksW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)pdwdiskid;
    (void)szvolumelabel;
    (void)pcchvolumelabel;
    (void)szdiskprompt;
    (void)pcchdiskprompt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwindex, void* szsource, void* pcchsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumSourcesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, szsource, pcchsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)szsource;
    (void)pcchsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, uint32_t dwindex, void* szsource, void* pcchsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumSourcesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, dwindex, szsource, pcchsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)szsource;
    (void)pcchsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionA(void* szproduct, void* szusername, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szusername, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionW(void* szproduct, void* szusername, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szusername, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szproperty, void* szvalue, void* pcchvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListGetInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue, pcchvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szproperty, void* szvalue, void* pcchvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListGetInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue, pcchvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoA(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szproperty, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListSetInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoW(void* szproductcodeorpatchcode, void* szusersid, int32_t dwcontext, uint32_t dwoptions, void* szproperty, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListSetInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions, szproperty, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyA(uint32_t hsummaryinfo, uint32_t uiproperty, void* puidatatype, void* pivalue, void* pftvalue, void* szvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsummaryinfo, uiproperty, puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)puidatatype;
    (void)pivalue;
    (void)pftvalue;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyCount(uint32_t hsummaryinfo, void* puipropertycount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsummaryinfo, puipropertycount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsummaryinfo;
    (void)puipropertycount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyW(uint32_t hsummaryinfo, uint32_t uiproperty, void* puidatatype, void* pivalue, void* pftvalue, void* szvaluebuf, void* pcchvaluebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsummaryinfo, uiproperty, puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)puidatatype;
    (void)pivalue;
    (void)pftvalue;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoPersist(uint32_t hsummaryinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoPersist");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsummaryinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsummaryinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyA(uint32_t hsummaryinfo, uint32_t uiproperty, uint32_t uidatatype, int32_t ivalue, void* pftvalue, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoSetPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsummaryinfo, uiproperty, uidatatype, ivalue, pftvalue, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)uidatatype;
    (void)ivalue;
    (void)pftvalue;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyW(uint32_t hsummaryinfo, uint32_t uiproperty, uint32_t uidatatype, int32_t ivalue, void* pftvalue, void* szvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoSetPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsummaryinfo, uiproperty, uidatatype, ivalue, pftvalue, szvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)uidatatype;
    (void)ivalue;
    (void)pftvalue;
    (void)szvalue;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureA(void* szproduct, void* szfeature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szfeature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExA(void* szproduct, void* szfeature, uint32_t dwinstallmode, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, dwinstallmode, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwinstallmode;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExW(void* szproduct, void* szfeature, uint32_t dwinstallmode, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature, dwinstallmode, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwinstallmode;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureW(void* szproduct, void* szfeature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szproduct, szfeature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szproduct;
    (void)szfeature;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyDiskSpace(uint32_t hinstall) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiVerifyDiskSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstall);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstall;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageA(void* szpackagepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiVerifyPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageW(void* szpackagepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiVerifyPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szpackagepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szpackagepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewClose(uint32_t hview) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hview;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewExecute(uint32_t hview, uint32_t hrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewExecute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview, hrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hview;
    (void)hrecord;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewFetch(uint32_t hview, void* phrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewFetch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview, phrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hview;
    (void)phrecord;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetColumnInfo(uint32_t hview, int32_t ecolumninfo, void* phrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewGetColumnInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview, ecolumninfo, phrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hview;
    (void)ecolumninfo;
    (void)phrecord;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorA(uint32_t hview, void* szcolumnnamebuffer, void* pcchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewGetErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview, szcolumnnamebuffer, pcchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hview;
    (void)szcolumnnamebuffer;
    (void)pcchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorW(uint32_t hview, void* szcolumnnamebuffer, void* pcchbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewGetErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview, szcolumnnamebuffer, pcchbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hview;
    (void)szcolumnnamebuffer;
    (void)pcchbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_applicationinstallationandservicing_msiViewModify(uint32_t hview, int32_t emodifymode, uint32_t hrecord) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewModify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hview, emodifymode, hrecord);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hview;
    (void)emodifymode;
    (void)hrecord;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_normalizeFileForPatchSignature(void* filebuffer, uint32_t filesize, uint32_t optionflags, void* optiondata, uint32_t newfilecoffbase, uint32_t newfilecofftime, uint32_t ignorerangecount, void* ignorerangearray, uint32_t retainrangecount, void* retainrangearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NormalizeFileForPatchSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filebuffer, filesize, optionflags, optiondata, newfilecoffbase, newfilecofftime, ignorerangecount, ignorerangearray, retainrangecount, retainrangearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filebuffer;
    (void)filesize;
    (void)optionflags;
    (void)optiondata;
    (void)newfilecoffbase;
    (void)newfilecofftime;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxSettingsW(uint32_t dwflags, void* hactctx, void* settingsnamespace, void* settingname, void* pvbuffer, uint64_t dwbuffer, void* pdwwrittenorrequired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryActCtxSettingsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, hactctx, settingsnamespace, settingname, pvbuffer, dwbuffer, pdwwrittenorrequired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)hactctx;
    (void)settingsnamespace;
    (void)settingname;
    (void)pvbuffer;
    (void)dwbuffer;
    (void)pdwwrittenorrequired;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxW(uint32_t dwflags, void* hactctx, void* pvsubinstance, uint32_t ulinfoclass, void* pvbuffer, uint64_t cbbuffer, void* pcbwrittenorrequired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryActCtxW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, hactctx, pvsubinstance, ulinfoclass, pvbuffer, cbbuffer, pcbwrittenorrequired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)hactctx;
    (void)pvsubinstance;
    (void)ulinfoclass;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbwrittenorrequired;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_applicationinstallationandservicing_releaseActCtx(void* hactctx) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseActCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hactctx);
        return;
    }
    errno = ENOSYS;
#else
    (void)hactctx;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_sfcGetNextProtectedFile(void* rpchandle, void* protfiledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfcGetNextProtectedFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rpchandle, protfiledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rpchandle;
    (void)protfiledata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsFileProtected(void* rpchandle, void* protfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfcIsFileProtected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rpchandle, protfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rpchandle;
    (void)protfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsKeyProtected(void* keyhandle, void* subkeyname, uint32_t keysam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfcIsKeyProtected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, subkeyname, keysam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)subkeyname;
    (void)keysam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_sfpVerifyFile(void* pszfilename, void* pszerror, uint32_t dwerrsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfpVerifyFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, pszerror, dwerrsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfilename;
    (void)pszerror;
    (void)dwerrsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileA(void* patchfilename, void* oldfilename, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, oldfilename, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByBuffers(void* patchfilebuffer, uint32_t patchfilesize, void* oldfilebuffer, uint32_t oldfilesize, void* newfilesize, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileByBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilebuffer, patchfilesize, oldfilebuffer, oldfilesize, newfilesize, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilebuffer;
    (void)patchfilesize;
    (void)oldfilebuffer;
    (void)oldfilesize;
    (void)newfilesize;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByHandles(void* patchfilehandle, void* oldfilehandle, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileByHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilehandle, oldfilehandle, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileW(void* patchfilename, void* oldfilename, uint32_t applyoptionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(patchfilename, oldfilename, applyoptionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)applyoptionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_applicationinstallationandservicing_zombifyActCtx(void* hactctx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZombifyActCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hactctx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hactctx;
    errno = ENOSYS;
    return -1;
#endif
}

