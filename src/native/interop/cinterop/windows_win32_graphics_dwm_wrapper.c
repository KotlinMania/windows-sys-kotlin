#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_graphics_dwm_wrapper.h"
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

int32_t windowssys_windows_win32_graphics_dwm_dwmAttachMilContent(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmAttachMilContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmDefWindowProc(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* plresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmDefWindowProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam, plresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)plresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmDetachMilContent(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmDetachMilContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow(void* hwnd, void* pblurbehind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableBlurBehindWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pblurbehind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pblurbehind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmEnableComposition(uint32_t ucompositionaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableComposition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucompositionaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucompositionaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(int32_t fenablemmcss) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableMMCSS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fenablemmcss);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fenablemmcss;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea(void* hwnd, void* pmarinset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmExtendFrameIntoClientArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pmarinset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pmarinset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmFlush(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmFlush");
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

int32_t windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor(void* pcrcolorization, void* pfopaqueblend) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetColorizationColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcrcolorization, pfopaqueblend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcrcolorization;
    (void)pfopaqueblend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo(void* hwnd, void* ptiminginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetCompositionTimingInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ptiminginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ptiminginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uint32_t uindex, void* pclientuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetGraphicsStreamClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uindex, pclientuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uindex;
    (void)pclientuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uint32_t uindex, void* ptransform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetGraphicsStreamTransformHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uindex, ptransform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uindex;
    (void)ptransform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes(void* pfisremoting, void* pfisconnected, void* pdwgeneration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetTransportAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfisremoting, pfisconnected, pdwgeneration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfisremoting;
    (void)pfisconnected;
    (void)pdwgeneration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements(void* appwindow, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetUnmetTabRequirements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appwindow, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)appwindow;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetWindowAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwattribute, pvattribute, cbattribute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwattribute;
    (void)pvattribute;
    (void)cbattribute;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmInvalidateIconicBitmaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled(void* pfenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmIsCompositionEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration(void* hwnd, int32_t crefreshes, int32_t frelative) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmModifyPreviousDxFrameDuration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, crefreshes, frelative);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)crefreshes;
    (void)frelative;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(int64_t hthumbnail, void* psize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmQueryThumbnailSourceSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthumbnail, psize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthumbnail;
    (void)psize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail(void* hwnddestination, void* hwndsource, void* phthumbnailid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmRegisterThumbnail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnddestination, hwndsource, phthumbnailid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnddestination;
    (void)hwndsource;
    (void)phthumbnailid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmRenderGesture(int32_t gt, uint32_t ccontacts, void* pdwpointerid, void* ppoints) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmRenderGesture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gt, ccontacts, pdwpointerid, ppoints);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gt;
    (void)ccontacts;
    (void)pdwpointerid;
    (void)ppoints;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration(void* hwnd, int32_t crefreshes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetDxFrameDuration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, crefreshes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)crefreshes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap(void* hwnd, void* hbmp, void* pptclient, uint32_t dwsitflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetIconicLivePreviewBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hbmp, pptclient, dwsitflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hbmp;
    (void)pptclient;
    (void)dwsitflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail(void* hwnd, void* hbmp, uint32_t dwsitflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetIconicThumbnail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hbmp, dwsitflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hbmp;
    (void)dwsitflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters(void* hwnd, void* ppresentparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetPresentParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ppresentparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ppresentparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetWindowAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwattribute, pvattribute, cbattribute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwattribute;
    (void)pvattribute;
    (void)cbattribute;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmShowContact(uint32_t dwpointerid, uint32_t eshowcontact) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmShowContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwpointerid, eshowcontact);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwpointerid;
    (void)eshowcontact;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow(void* hwnd, int32_t target) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmTransitionOwnedWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, target);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)target;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(int64_t hthumbnailid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmUnregisterThumbnail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthumbnailid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthumbnailid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(int64_t hthumbnailid, void* ptnproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmUpdateThumbnailProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthumbnailid, ptnproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthumbnailid;
    (void)ptnproperties;
    errno = ENOSYS;
    return -1;
#endif
}

