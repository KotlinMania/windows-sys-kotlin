#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_magnification_wrapper.h"
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

int32_t windowssys_windows_win32_ui_magnification_MagGetColorEffect(void* hwnd, void* peffect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetColorEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, peffect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)peffect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagGetFullscreenColorEffect(void* peffect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetFullscreenColorEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(peffect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)peffect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagGetFullscreenTransform(void* pmaglevel, void* pxoffset, void* pyoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetFullscreenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmaglevel, pxoffset, pyoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmaglevel;
    (void)pxoffset;
    (void)pyoffset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_magnification_MagGetImageScalingCallback(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetImageScalingCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagGetInputTransform(void* pfenabled, void* prectsource, void* prectdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetInputTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfenabled, prectsource, prectdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfenabled;
    (void)prectsource;
    (void)prectdest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagGetWindowFilterList(void* hwnd, void* pdwfiltermode, int32_t count, void* phwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetWindowFilterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pdwfiltermode, count, phwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pdwfiltermode;
    (void)count;
    (void)phwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagGetWindowSource(void* hwnd, void* prect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetWindowSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, prect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)prect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagGetWindowTransform(void* hwnd, void* ptransform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetWindowTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ptransform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ptransform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagInitialize(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagInitialize");
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

int32_t windowssys_windows_win32_ui_magnification_MagSetColorEffect(void* hwnd, void* peffect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetColorEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, peffect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)peffect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagSetFullscreenColorEffect(void* peffect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetFullscreenColorEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(peffect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)peffect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagSetFullscreenTransform(float maglevel, int32_t xoffset, int32_t yoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetFullscreenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maglevel, xoffset, yoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maglevel;
    (void)xoffset;
    (void)yoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagSetImageScalingCallback(void* hwnd, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetImageScalingCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagSetInputTransform(int32_t fenabled, void* prectsource, void* prectdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetInputTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fenabled, prectsource, prectdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fenabled;
    (void)prectsource;
    (void)prectdest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagSetWindowFilterList(void* hwnd, uint32_t dwfiltermode, int32_t count, void* phwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetWindowFilterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwfiltermode, count, phwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwfiltermode;
    (void)count;
    (void)phwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagSetWindowTransform(void* hwnd, void* ptransform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetWindowTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ptransform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ptransform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagShowSystemCursor(int32_t fshowcursor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagShowSystemCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fshowcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fshowcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_magnification_MagUninitialize(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagUninitialize");
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

