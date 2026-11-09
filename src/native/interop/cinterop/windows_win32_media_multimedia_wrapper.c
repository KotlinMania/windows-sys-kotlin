#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_media_multimedia_wrapper.h"
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

int32_t windowssys_windows_win32_media_multimedia_AVIBuildFilterA(void* lpszfilter, int32_t cbfilter, int32_t fsaving) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIBuildFilterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilter, cbfilter, fsaving);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilter;
    (void)cbfilter;
    (void)fsaving;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIBuildFilterW(void* lpszfilter, int32_t cbfilter, int32_t fsaving) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIBuildFilterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilter, cbfilter, fsaving);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilter;
    (void)cbfilter;
    (void)fsaving;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIClearClipboard(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIClearClipboard");
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

uint32_t windowssys_windows_win32_media_multimedia_AVIFileAddRef(void* pfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileAddRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfile;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileCreateStreamA(void* pfile, void* ppavi, void* psi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileCreateStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, ppavi, psi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)ppavi;
    (void)psi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileCreateStreamW(void* pfile, void* ppavi, void* psi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileCreateStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, ppavi, psi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)ppavi;
    (void)psi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileEndRecord(void* pfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileEndRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_media_multimedia_AVIFileExit(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileExit");
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

int32_t windowssys_windows_win32_media_multimedia_AVIFileGetStream(void* pfile, void* ppavi, uint32_t fcctype, int32_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileGetStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, ppavi, fcctype, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)ppavi;
    (void)fcctype;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileInfoA(void* pfile, void* pfi, int32_t lsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, pfi, lsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)pfi;
    (void)lsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileInfoW(void* pfile, void* pfi, int32_t lsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, pfi, lsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)pfi;
    (void)lsize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_media_multimedia_AVIFileInit(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileInit");
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

int32_t windowssys_windows_win32_media_multimedia_AVIFileOpenA(void* ppfile, void* szfile, uint32_t umode, void* lphandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileOpenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppfile, szfile, umode, lphandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppfile;
    (void)szfile;
    (void)umode;
    (void)lphandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileOpenW(void* ppfile, void* szfile, uint32_t umode, void* lphandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileOpenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppfile, szfile, umode, lphandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppfile;
    (void)szfile;
    (void)umode;
    (void)lphandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileReadData(void* pfile, uint32_t ckid, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileReadData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, ckid, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)ckid;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_AVIFileRelease(void* pfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfile;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIFileWriteData(void* pfile, uint32_t ckid, void* lpdata, int32_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileWriteData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfile, ckid, lpdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfile;
    (void)ckid;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIGetFromClipboard(void* lppf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIGetFromClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIMakeCompressedStream(void* ppscompressed, void* ppssource, void* lpoptions, void* pclsidhandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIMakeCompressedStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppscompressed, ppssource, lpoptions, pclsidhandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppscompressed;
    (void)ppssource;
    (void)lpoptions;
    (void)pclsidhandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIMakeFileFromStreams(void* ppfile, int32_t nstreams, void* papstreams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIMakeFileFromStreams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppfile, nstreams, papstreams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppfile;
    (void)nstreams;
    (void)papstreams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIMakeStreamFromClipboard(uint32_t cfformat, void* hglobal, void* ppstream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIMakeStreamFromClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cfformat, hglobal, ppstream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cfformat;
    (void)hglobal;
    (void)ppstream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIPutFileOnClipboard(void* pf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIPutFileOnClipboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pf;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_AVISaveOptions(void* hwnd, uint32_t uiflags, int32_t nstreams, void* ppavi, void* plpoptions) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, uiflags, nstreams, ppavi, plpoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)uiflags;
    (void)nstreams;
    (void)ppavi;
    (void)plpoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVISaveOptionsFree(int32_t nstreams, void* plpoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveOptionsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nstreams, plpoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nstreams;
    (void)plpoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVISaveVA(void* szfile, void* pclsidhandler, void* lpfncallback, int32_t nstreams, void* ppavi, void* plpoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveVA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfile, pclsidhandler, lpfncallback, nstreams, ppavi, plpoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfile;
    (void)pclsidhandler;
    (void)lpfncallback;
    (void)nstreams;
    (void)ppavi;
    (void)plpoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVISaveVW(void* szfile, void* pclsidhandler, void* lpfncallback, int32_t nstreams, void* ppavi, void* plpoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveVW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfile, pclsidhandler, lpfncallback, nstreams, ppavi, plpoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfile;
    (void)pclsidhandler;
    (void)lpfncallback;
    (void)nstreams;
    (void)ppavi;
    (void)plpoptions;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_AVIStreamAddRef(void* pavi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamAddRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pavi;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamBeginStreaming(void* pavi, int32_t lstart, int32_t lend, int32_t lrate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamBeginStreaming");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lstart, lend, lrate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lstart;
    (void)lend;
    (void)lrate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamCreate(void* ppavi, int32_t lparam1, int32_t lparam2, void* pclsidhandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppavi, lparam1, lparam2, pclsidhandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppavi;
    (void)lparam1;
    (void)lparam2;
    (void)pclsidhandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamEndStreaming(void* pavi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamEndStreaming");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamFindSample(void* pavi, int32_t lpos, int32_t lflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamFindSample");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpos, lflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpos;
    (void)lflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_AVIStreamGetFrame(void* pg, int32_t lpos) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamGetFrame");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pg, lpos);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pg;
    (void)lpos;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamGetFrameClose(void* pg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamGetFrameClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pg;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_AVIStreamGetFrameOpen(void* pavi, void* lpbiwanted) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamGetFrameOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpbiwanted);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pavi;
    (void)lpbiwanted;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamInfoA(void* pavi, void* psi, int32_t lsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, psi, lsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)psi;
    (void)lsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamInfoW(void* pavi, void* psi, int32_t lsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, psi, lsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)psi;
    (void)lsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamLength(void* pavi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileA(void* ppavi, void* szfile, uint32_t fcctype, int32_t lparam, uint32_t mode, void* pclsidhandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamOpenFromFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppavi, szfile, fcctype, lparam, mode, pclsidhandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppavi;
    (void)szfile;
    (void)fcctype;
    (void)lparam;
    (void)mode;
    (void)pclsidhandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileW(void* ppavi, void* szfile, uint32_t fcctype, int32_t lparam, uint32_t mode, void* pclsidhandler) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamOpenFromFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppavi, szfile, fcctype, lparam, mode, pclsidhandler);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppavi;
    (void)szfile;
    (void)fcctype;
    (void)lparam;
    (void)mode;
    (void)pclsidhandler;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamRead(void* pavi, int32_t lstart, int32_t lsamples, void* lpbuffer, int32_t cbbuffer, void* plbytes, void* plsamples) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lstart, lsamples, lpbuffer, cbbuffer, plbytes, plsamples);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lstart;
    (void)lsamples;
    (void)lpbuffer;
    (void)cbbuffer;
    (void)plbytes;
    (void)plsamples;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamReadData(void* pavi, uint32_t fcc, void* lp, void* lpcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamReadData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, fcc, lp, lpcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)fcc;
    (void)lp;
    (void)lpcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamReadFormat(void* pavi, int32_t lpos, void* lpformat, void* lpcbformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamReadFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpos, lpformat, lpcbformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpos;
    (void)lpformat;
    (void)lpcbformat;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_AVIStreamRelease(void* pavi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pavi;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamSampleToTime(void* pavi, int32_t lsample) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamSampleToTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lsample);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lsample;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamSetFormat(void* pavi, int32_t lpos, void* lpformat, int32_t cbformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamSetFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpos, lpformat, cbformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpos;
    (void)lpformat;
    (void)cbformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamStart(void* pavi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamTimeToSample(void* pavi, int32_t ltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamTimeToSample");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, ltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)ltime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamWrite(void* pavi, int32_t lstart, int32_t lsamples, void* lpbuffer, int32_t cbbuffer, uint32_t dwflags, void* plsampwritten, void* plbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lstart, lsamples, lpbuffer, cbbuffer, dwflags, plsampwritten, plbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lstart;
    (void)lsamples;
    (void)lpbuffer;
    (void)cbbuffer;
    (void)dwflags;
    (void)plsampwritten;
    (void)plbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_AVIStreamWriteData(void* pavi, uint32_t fcc, void* lp, int32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamWriteData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, fcc, lp, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)fcc;
    (void)lp;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_CloseDriver(void* hdriver, int64_t lparam1, int64_t lparam2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdriver, lparam1, lparam2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdriver;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_CreateEditableStream(void* ppseditable, void* pssource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEditableStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppseditable, pssource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppseditable;
    (void)pssource;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_DefDriverProc(uint64_t dwdriveridentifier, void* hdrvr, uint32_t umsg, int64_t lparam1, int64_t lparam2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefDriverProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdriveridentifier, hdrvr, umsg, lparam1, lparam2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdriveridentifier;
    (void)hdrvr;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibBegin(int64_t hdd, void* hdc, int32_t dxdst, int32_t dydst, void* lpbi, int32_t dxsrc, int32_t dysrc, uint32_t wflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, hdc, dxdst, dydst, lpbi, dxsrc, dysrc, wflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    (void)hdc;
    (void)dxdst;
    (void)dydst;
    (void)lpbi;
    (void)dxsrc;
    (void)dysrc;
    (void)wflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibChangePalette(int64_t hdd, int32_t istart, int32_t ilen, void* lppe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibChangePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, istart, ilen, lppe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    (void)istart;
    (void)ilen;
    (void)lppe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibClose(int64_t hdd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibDraw(int64_t hdd, void* hdc, int32_t xdst, int32_t ydst, int32_t dxdst, int32_t dydst, void* lpbi, void* lpbits, int32_t xsrc, int32_t ysrc, int32_t dxsrc, int32_t dysrc, uint32_t wflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, int32_t, void*, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibDraw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, hdc, xdst, ydst, dxdst, dydst, lpbi, lpbits, xsrc, ysrc, dxsrc, dysrc, wflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    (void)hdc;
    (void)xdst;
    (void)ydst;
    (void)dxdst;
    (void)dydst;
    (void)lpbi;
    (void)lpbits;
    (void)xsrc;
    (void)ysrc;
    (void)dxsrc;
    (void)dysrc;
    (void)wflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibEnd(int64_t hdd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_DrawDibGetBuffer(int64_t hdd, void* lpbi, uint32_t dwsize, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibGetBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, lpbi, dwsize, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdd;
    (void)lpbi;
    (void)dwsize;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_DrawDibGetPalette(int64_t hdd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibGetPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdd;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_DrawDibOpen(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibOpen");
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

int64_t windowssys_windows_win32_media_multimedia_DrawDibProfileDisplay(void* lpbi) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibProfileDisplay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbi;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_DrawDibRealize(int64_t hdd, void* hdc, int32_t fbackground) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibRealize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, hdc, fbackground);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdd;
    (void)hdc;
    (void)fbackground;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibSetPalette(int64_t hdd, void* hpal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibSetPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, hpal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    (void)hpal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibStart(int64_t hdd, uint32_t rate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, rate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    (void)rate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibStop(int64_t hdd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibStop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DrawDibTime(int64_t hdd, void* lpddtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdd, lpddtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdd;
    (void)lpddtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_DriverCallback(uint64_t dwcallback, uint32_t dwflags, void* hdevice, uint32_t dwmsg, uint64_t dwuser, uint64_t dwparam1, uint64_t dwparam2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DriverCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcallback, dwflags, hdevice, dwmsg, dwuser, dwparam1, dwparam2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcallback;
    (void)dwflags;
    (void)hdevice;
    (void)dwmsg;
    (void)dwuser;
    (void)dwparam1;
    (void)dwparam2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_DrvGetModuleHandle(void* hdriver) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrvGetModuleHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdriver);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdriver;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamClone(void* pavi, void* ppresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamClone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, ppresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)ppresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamCopy(void* pavi, void* plstart, void* pllength, void* ppresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, plstart, pllength, ppresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)plstart;
    (void)pllength;
    (void)ppresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamCut(void* pavi, void* plstart, void* pllength, void* ppresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamCut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, plstart, pllength, ppresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)plstart;
    (void)pllength;
    (void)ppresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamPaste(void* pavi, void* plpos, void* pllength, void* pstream, int32_t lstart, int32_t lend) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamPaste");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, plpos, pllength, pstream, lstart, lend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)plpos;
    (void)pllength;
    (void)pstream;
    (void)lstart;
    (void)lend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamSetInfoA(void* pavi, void* lpinfo, int32_t cbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpinfo, cbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpinfo;
    (void)cbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamSetInfoW(void* pavi, void* lpinfo, int32_t cbinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpinfo, cbinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpinfo;
    (void)cbinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamSetNameA(void* pavi, void* lpszname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpszname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpszname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_EditStreamSetNameW(void* pavi, void* lpszname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pavi, lpszname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pavi;
    (void)lpszname;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_GetDriverModuleHandle(void* hdriver) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDriverModuleHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdriver);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdriver;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewA(void* lpofn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenFileNamePreviewA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpofn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpofn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewW(void* lpofn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenFileNamePreviewW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpofn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpofn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewA(void* lpofn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSaveFileNamePreviewA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpofn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpofn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewW(void* lpofn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSaveFileNamePreviewW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpofn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpofn;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_ICClose(void* hic) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hic;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_ICCompress(void* hic, uint32_t dwflags, void* lpbioutput, void* lpdata, void* lpbiinput, void* lpbits, void* lpckid, void* lpdwflags, int32_t lframenum, uint32_t dwframesize, uint32_t dwquality, void* lpbiprev, void* lpprev) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICCompress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, dwflags, lpbioutput, lpdata, lpbiinput, lpbits, lpckid, lpdwflags, lframenum, dwframesize, dwquality, lpbiprev, lpprev);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hic;
    (void)dwflags;
    (void)lpbioutput;
    (void)lpdata;
    (void)lpbiinput;
    (void)lpbits;
    (void)lpckid;
    (void)lpdwflags;
    (void)lframenum;
    (void)dwframesize;
    (void)dwquality;
    (void)lpbiprev;
    (void)lpprev;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_ICCompressorChoose(void* hwnd, uint32_t uiflags, void* pvin, void* lpdata, void* pc, void* lpsztitle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICCompressorChoose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, uiflags, pvin, lpdata, pc, lpsztitle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)uiflags;
    (void)pvin;
    (void)lpdata;
    (void)pc;
    (void)lpsztitle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_media_multimedia_ICCompressorFree(void* pc) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICCompressorFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pc);
        return;
    }
    errno = ENOSYS;
#else
    (void)pc;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_ICDecompress(void* hic, uint32_t dwflags, void* lpbiformat, void* lpdata, void* lpbi, void* lpbits) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICDecompress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, dwflags, lpbiformat, lpdata, lpbi, lpbits);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hic;
    (void)dwflags;
    (void)lpbiformat;
    (void)lpdata;
    (void)lpbi;
    (void)lpbits;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_ICDraw(void* hic, uint32_t dwflags, void* lpformat, void* lpdata, uint32_t cbdata, int32_t ltime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICDraw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, dwflags, lpformat, lpdata, cbdata, ltime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hic;
    (void)dwflags;
    (void)lpformat;
    (void)lpdata;
    (void)cbdata;
    (void)ltime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_ICDrawBegin(void* hic, uint32_t dwflags, void* hpal, void* hwnd, void* hdc, int32_t xdst, int32_t ydst, int32_t dxdst, int32_t dydst, void* lpbi, int32_t xsrc, int32_t ysrc, int32_t dxsrc, int32_t dysrc, uint32_t dwrate, uint32_t dwscale) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICDrawBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, dwflags, hpal, hwnd, hdc, xdst, ydst, dxdst, dydst, lpbi, xsrc, ysrc, dxsrc, dysrc, dwrate, dwscale);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hic;
    (void)dwflags;
    (void)hpal;
    (void)hwnd;
    (void)hdc;
    (void)xdst;
    (void)ydst;
    (void)dxdst;
    (void)dydst;
    (void)lpbi;
    (void)xsrc;
    (void)ysrc;
    (void)dxsrc;
    (void)dysrc;
    (void)dwrate;
    (void)dwscale;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_media_multimedia_ICGetDisplayFormat(void* hic, void* lpbiin, void* lpbiout, int32_t bitdepth, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICGetDisplayFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, lpbiin, lpbiout, bitdepth, dx, dy);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hic;
    (void)lpbiin;
    (void)lpbiout;
    (void)bitdepth;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_ICGetInfo(void* hic, void* picinfo, uint32_t cb) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, picinfo, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hic;
    (void)picinfo;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_ICImageCompress(void* hic, uint32_t uiflags, void* lpbiin, void* lpbits, void* lpbiout, int32_t lquality, void* plsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICImageCompress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, uiflags, lpbiin, lpbits, lpbiout, lquality, plsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hic;
    (void)uiflags;
    (void)lpbiin;
    (void)lpbits;
    (void)lpbiout;
    (void)lquality;
    (void)plsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_ICImageDecompress(void* hic, uint32_t uiflags, void* lpbiin, void* lpbits, void* lpbiout) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICImageDecompress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, uiflags, lpbiin, lpbits, lpbiout);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hic;
    (void)uiflags;
    (void)lpbiin;
    (void)lpbits;
    (void)lpbiout;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_ICInfo(uint32_t fcctype, uint32_t fcchandler, void* lpicinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcctype, fcchandler, lpicinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)lpicinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_ICInstall(uint32_t fcctype, uint32_t fcchandler, int64_t lparam, void* szdesc, uint32_t wflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICInstall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcctype, fcchandler, lparam, szdesc, wflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)lparam;
    (void)szdesc;
    (void)wflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_ICLocate(uint32_t fcctype, uint32_t fcchandler, void* lpbiin, void* lpbiout, uint16_t wflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICLocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcctype, fcchandler, lpbiin, lpbiout, wflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)lpbiin;
    (void)lpbiout;
    (void)wflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_ICOpen(uint32_t fcctype, uint32_t fcchandler, uint32_t wmode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcctype, fcchandler, wmode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)wmode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_ICRemove(uint32_t fcctype, uint32_t fcchandler, uint32_t wflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fcctype, fcchandler, wflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)wflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_ICSendMessage(void* hic, uint32_t msg, uint64_t dw1, uint64_t dw2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSendMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hic, msg, dw1, dw2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hic;
    (void)msg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_ICSeqCompressFrame(void* pc, uint32_t uiflags, void* lpbits, void* pfkey, void* plsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSeqCompressFrame");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pc, uiflags, lpbits, pfkey, plsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pc;
    (void)uiflags;
    (void)lpbits;
    (void)pfkey;
    (void)plsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_media_multimedia_ICSeqCompressFrameEnd(void* pc) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSeqCompressFrameEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pc);
        return;
    }
    errno = ENOSYS;
#else
    (void)pc;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_ICSeqCompressFrameStart(void* pc, void* lpbiin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSeqCompressFrameStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pc, lpbiin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pc;
    (void)lpbiin;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_MCIWndCreateA(void* hwndparent, void* hinstance, uint32_t dwstyle, void* szfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MCIWndCreateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hinstance, dwstyle, szfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndparent;
    (void)hinstance;
    (void)dwstyle;
    (void)szfile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_MCIWndCreateW(void* hwndparent, void* hinstance, uint32_t dwstyle, void* szfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MCIWndCreateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hinstance, dwstyle, szfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndparent;
    (void)hinstance;
    (void)dwstyle;
    (void)szfile;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_MCIWndRegisterClass(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MCIWndRegisterClass");
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

void* windowssys_windows_win32_media_multimedia_OpenDriver(void* szdrivername, void* szsectionname, int64_t lparam2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdrivername, szsectionname, lparam2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)szdrivername;
    (void)szsectionname;
    (void)lparam2;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_SendDriverMessage(void* hdriver, uint32_t message, int64_t lparam1, int64_t lparam2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendDriverMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdriver, message, lparam1, lparam2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdriver;
    (void)message;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_VideoForWindowsVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VideoForWindowsVersion");
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

void* windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(void* lpszwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, int32_t nid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capCreateCaptureWindowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszwindowname, dwstyle, x, y, nwidth, nheight, hwndparent, nid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)nid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(void* lpszwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, int32_t nid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capCreateCaptureWindowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszwindowname, dwstyle, x, y, nwidth, nheight, hwndparent, nid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)nid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(uint32_t wdriverindex, void* lpszname, int32_t cbname, void* lpszver, int32_t cbver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capGetDriverDescriptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wdriverindex, lpszname, cbname, lpszver, cbver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wdriverindex;
    (void)lpszname;
    (void)cbname;
    (void)lpszver;
    (void)cbver;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(uint32_t wdriverindex, void* lpszname, int32_t cbname, void* lpszver, int32_t cbver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capGetDriverDescriptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wdriverindex, lpszname, cbname, lpszver, cbver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wdriverindex;
    (void)lpszname;
    (void)cbname;
    (void)lpszver;
    (void)cbver;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joyGetDevCapsA(uint64_t ujoyid, void* pjc, uint32_t cbjc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid, pjc, cbjc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    (void)pjc;
    (void)cbjc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joyGetDevCapsW(uint64_t ujoyid, void* pjc, uint32_t cbjc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid, pjc, cbjc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    (void)pjc;
    (void)cbjc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joyGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetNumDevs");
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

uint32_t windowssys_windows_win32_media_multimedia_joyGetPos(uint32_t ujoyid, void* pji) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid, pji);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    (void)pji;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joyGetPosEx(uint32_t ujoyid, void* pji) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetPosEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid, pji);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    (void)pji;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joyGetThreshold(uint32_t ujoyid, void* puthreshold) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetThreshold");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid, puthreshold);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    (void)puthreshold;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joyReleaseCapture(uint32_t ujoyid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyReleaseCapture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joySetCapture(void* hwnd, uint32_t ujoyid, uint32_t uperiod, int32_t fchanged) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joySetCapture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ujoyid, uperiod, fchanged);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)ujoyid;
    (void)uperiod;
    (void)fchanged;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_joySetThreshold(uint32_t ujoyid, uint32_t uthreshold) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joySetThreshold");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ujoyid, uthreshold);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ujoyid;
    (void)uthreshold;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mciDriverNotify(void* hwndcallback, uint32_t wdeviceid, uint32_t ustatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciDriverNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndcallback, wdeviceid, ustatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndcallback;
    (void)wdeviceid;
    (void)ustatus;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciDriverYield(uint32_t wdeviceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciDriverYield");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wdeviceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wdeviceid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mciFreeCommandResource(uint32_t wtable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciFreeCommandResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wtable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wtable;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_mciGetCreatorTask(uint32_t mciid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetCreatorTask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mciid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)mciid;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(void* pszdevice) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdevice);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdevice;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(uint32_t dwelementid, void* lpstrtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDFromElementIDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwelementid, lpstrtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwelementid;
    (void)lpstrtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(uint32_t dwelementid, void* lpstrtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDFromElementIDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwelementid, lpstrtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwelementid;
    (void)lpstrtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(void* pszdevice) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdevice);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdevice;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_media_multimedia_mciGetDriverData(uint32_t wdeviceid) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDriverData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wdeviceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wdeviceid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mciGetErrorStringA(uint32_t mcierr, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetErrorStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcierr, psztext, cchtext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mcierr;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mciGetErrorStringW(uint32_t mcierr, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetErrorStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mcierr, psztext, cchtext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mcierr;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_media_multimedia_mciGetYieldProc(uint32_t mciid, void* pdwyielddata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetYieldProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mciid, pdwyielddata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)mciid;
    (void)pdwyielddata;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciLoadCommandResource(void* hinstance, void* lpresname, uint32_t wtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciLoadCommandResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpresname, wtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinstance;
    (void)lpresname;
    (void)wtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciSendCommandA(uint32_t mciid, uint32_t umsg, uint64_t dwparam1, uint64_t dwparam2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendCommandA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mciid, umsg, dwparam1, dwparam2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mciid;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciSendCommandW(uint32_t mciid, uint32_t umsg, uint64_t dwparam1, uint64_t dwparam2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendCommandW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mciid, umsg, dwparam1, dwparam2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mciid;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciSendStringA(void* lpstrcommand, void* lpstrreturnstring, uint32_t ureturnlength, void* hwndcallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstrcommand, lpstrreturnstring, ureturnlength, hwndcallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstrcommand;
    (void)lpstrreturnstring;
    (void)ureturnlength;
    (void)hwndcallback;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mciSendStringW(void* lpstrcommand, void* lpstrreturnstring, uint32_t ureturnlength, void* hwndcallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstrcommand, lpstrreturnstring, ureturnlength, hwndcallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstrcommand;
    (void)lpstrreturnstring;
    (void)ureturnlength;
    (void)hwndcallback;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mciSetDriverData(uint32_t wdeviceid, uint64_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSetDriverData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wdeviceid, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wdeviceid;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mciSetYieldProc(uint32_t mciid, void* fpyieldproc, uint32_t dwyielddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSetYieldProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mciid, fpyieldproc, dwyielddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mciid;
    (void)fpyieldproc;
    (void)dwyielddata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmDrvInstall(void* hdriver, void* wszdrventry, void* drvmessage, uint32_t wflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmDrvInstall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdriver, wszdrventry, drvmessage, wflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdriver;
    (void)wszdrventry;
    (void)drvmessage;
    (void)wflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmGetCurrentTask(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmGetCurrentTask");
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

void windowssys_windows_win32_media_multimedia_mmTaskBlock(uint32_t h) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(h);
        return;
    }
    errno = ENOSYS;
#else
    (void)h;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmTaskCreate(void* lpfn, void* lph, uint64_t dwinst) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfn, lph, dwinst);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfn;
    (void)lph;
    (void)dwinst;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mmTaskSignal(uint32_t h) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskSignal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)h;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_media_multimedia_mmTaskYield(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskYield");
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

uint32_t windowssys_windows_win32_media_multimedia_mmioAdvance(void* hmmio, void* pmmioinfo, uint32_t fuadvance) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioAdvance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pmmioinfo, fuadvance);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pmmioinfo;
    (void)fuadvance;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioAscend(void* hmmio, void* pmmcki, uint32_t fuascend) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioAscend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pmmcki, fuascend);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pmmcki;
    (void)fuascend;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioClose(void* hmmio, uint32_t fuclose) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, fuclose);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)fuclose;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioCreateChunk(void* hmmio, void* pmmcki, uint32_t fucreate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioCreateChunk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pmmcki, fucreate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pmmcki;
    (void)fucreate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioDescend(void* hmmio, void* pmmcki, void* pmmckiparent, uint32_t fudescend) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioDescend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pmmcki, pmmckiparent, fudescend);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pmmcki;
    (void)pmmckiparent;
    (void)fudescend;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioFlush(void* hmmio, uint32_t fuflush) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioFlush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, fuflush);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)fuflush;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioGetInfo(void* hmmio, void* pmmioinfo, uint32_t fuinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pmmioinfo, fuinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pmmioinfo;
    (void)fuinfo;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(uint32_t fccioproc, void* pioproc, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioInstallIOProcA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fccioproc, pioproc, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fccioproc;
    (void)pioproc;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(uint32_t fccioproc, void* pioproc, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioInstallIOProcW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fccioproc, pioproc, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fccioproc;
    (void)pioproc;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_mmioOpenA(void* pszfilename, void* pmmioinfo, uint32_t fdwopen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioOpenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, pmmioinfo, fdwopen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfilename;
    (void)pmmioinfo;
    (void)fdwopen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_media_multimedia_mmioOpenW(void* pszfilename, void* pmmioinfo, uint32_t fdwopen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioOpenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, pmmioinfo, fdwopen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfilename;
    (void)pmmioinfo;
    (void)fdwopen;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mmioRead(void* hmmio, void* pch, int32_t cch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pch, cch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmmio;
    (void)pch;
    (void)cch;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioRenameA(void* pszfilename, void* psznewfilename, void* pmmioinfo, uint32_t fdwrename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioRenameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, psznewfilename, pmmioinfo, fdwrename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszfilename;
    (void)psznewfilename;
    (void)pmmioinfo;
    (void)fdwrename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioRenameW(void* pszfilename, void* psznewfilename, void* pmmioinfo, uint32_t fdwrename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioRenameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilename, psznewfilename, pmmioinfo, fdwrename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszfilename;
    (void)psznewfilename;
    (void)pmmioinfo;
    (void)fdwrename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mmioSeek(void* hmmio, int32_t loffset, int32_t iorigin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSeek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, loffset, iorigin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmmio;
    (void)loffset;
    (void)iorigin;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_media_multimedia_mmioSendMessage(void* hmmio, uint32_t umsg, int64_t lparam1, int64_t lparam2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSendMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, umsg, lparam1, lparam2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmmio;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioSetBuffer(void* hmmio, void* pchbuffer, int32_t cchbuffer, uint32_t fubuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSetBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pchbuffer, cchbuffer, fubuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pchbuffer;
    (void)cchbuffer;
    (void)fubuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioSetInfo(void* hmmio, void* pmmioinfo, uint32_t fuinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pmmioinfo, fuinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmmio;
    (void)pmmioinfo;
    (void)fuinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(void* sz, uint32_t uflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioStringToFOURCCA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sz, uflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sz;
    (void)uflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(void* sz, uint32_t uflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioStringToFOURCCW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sz, uflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sz;
    (void)uflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_mmioWrite(void* hmmio, void* pch, int32_t cch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmmio, pch, cch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmmio;
    (void)pch;
    (void)cch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_multimedia_sndOpenSound(void* eventname, void* appname, int32_t flags, void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-mm-misc-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndOpenSound");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventname, appname, flags, filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventname;
    (void)appname;
    (void)flags;
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

