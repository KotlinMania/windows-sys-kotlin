#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_controls_wrapper.h"
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

int64_t windowssys_windows_win32_ui_controls_beginBufferedAnimation(void* hwnd, void* hdctarget, void* prctarget, int32_t dwformat, void* ppaintparams, void* panimationparams, void* phdcfrom, void* phdcto) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginBufferedAnimation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdctarget, prctarget, dwformat, ppaintparams, panimationparams, phdcfrom, phdcto);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)panimationparams;
    (void)phdcfrom;
    (void)phdcto;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_beginBufferedPaint(void* hdctarget, void* prctarget, int32_t dwformat, void* ppaintparams, void* phdc) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginBufferedPaint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdctarget, prctarget, dwformat, ppaintparams, phdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)phdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_beginPanningFeedback(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPanningFeedback");
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

int32_t windowssys_windows_win32_ui_controls_bufferedPaintClear(int64_t hbufferedpaint, void* prc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint, prc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_bufferedPaintInit(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintInit");
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

int32_t windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation(void* hwnd, void* hdctarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintRenderAnimation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdctarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdctarget;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha(int64_t hbufferedpaint, void* prc, uint8_t alpha) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintSetAlpha");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint, prc, alpha);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    (void)alpha;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintStopAllAnimations");
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

int32_t windowssys_windows_win32_ui_controls_bufferedPaintUnInit(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintUnInit");
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

int32_t windowssys_windows_win32_ui_controls_checkDlgButton(void* hdlg, int32_t nidbutton, uint32_t ucheck) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckDlgButton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, nidbutton, ucheck);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)nidbutton;
    (void)ucheck;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_checkRadioButton(void* hdlg, int32_t nidfirstbutton, int32_t nidlastbutton, int32_t nidcheckbutton) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckRadioButton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, nidfirstbutton, nidlastbutton, nidcheckbutton);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)nidfirstbutton;
    (void)nidlastbutton;
    (void)nidcheckbutton;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_closeThemeData(int64_t htheme) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThemeData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_controls_createMappedBitmap(void* hinstance, int64_t idbitmap, uint32_t wflags, void* lpcolormap, int32_t inummaps) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMappedBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, idbitmap, wflags, lpcolormap, inummaps);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)idbitmap;
    (void)wflags;
    (void)lpcolormap;
    (void)inummaps;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createPropertySheetPageA(void* constpropsheetpagepointer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePropertySheetPageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(constpropsheetpagepointer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)constpropsheetpagepointer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createPropertySheetPageW(void* constpropsheetpagepointer) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePropertySheetPageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(constpropsheetpagepointer);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)constpropsheetpagepointer;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createStatusWindowA(int32_t style, void* lpsztext, void* hwndparent, uint32_t wid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStatusWindowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(style, lpsztext, hwndparent, wid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createStatusWindowW(int32_t style, void* lpsztext, void* hwndparent, uint32_t wid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStatusWindowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(style, lpsztext, hwndparent, wid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createSyntheticPointerDevice(int32_t pointertype, uint32_t maxcount, int32_t mode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSyntheticPointerDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointertype, maxcount, mode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pointertype;
    (void)maxcount;
    (void)mode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createToolbarEx(void* hwnd, uint32_t ws, uint32_t wid, int32_t nbitmaps, void* hbminst, uint64_t wbmid, void* lpbuttons, int32_t inumbuttons, int32_t dxbutton, int32_t dybutton, int32_t dxbitmap, int32_t dybitmap, uint32_t ustructsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, uint64_t, void*, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateToolbarEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ws, wid, nbitmaps, hbminst, wbmid, lpbuttons, inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)ws;
    (void)wid;
    (void)nbitmaps;
    (void)hbminst;
    (void)wbmid;
    (void)lpbuttons;
    (void)inumbuttons;
    (void)dxbutton;
    (void)dybutton;
    (void)dxbitmap;
    (void)dybitmap;
    (void)ustructsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_createUpDownControl(uint32_t dwstyle, int32_t x, int32_t y, int32_t cx, int32_t cy, void* hparent, int32_t nid, void* hinst, void* hbuddy, int32_t nupper, int32_t nlower, int32_t npos) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUpDownControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwstyle, x, y, cx, cy, hparent, nid, hinst, hbuddy, nupper, nlower, npos);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)hparent;
    (void)nid;
    (void)hinst;
    (void)hbuddy;
    (void)nupper;
    (void)nlower;
    (void)npos;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_ui_controls_dpaClone(int64_t hdpa, int64_t hdpanew) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, hdpanew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)hdpanew;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_dpaCreate(int32_t citemgrow) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(citemgrow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)citemgrow;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_dpaCreateEx(int32_t cpgrow, void* hheap) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_CreateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cpgrow, hheap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cpgrow;
    (void)hheap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs(int64_t hdpa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_DeleteAllPtrs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_controls_dpaDeletePtr(int64_t hdpa, int32_t i) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_DeletePtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, i);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdpa;
    (void)i;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaDestroy(int64_t hdpa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_dpaDestroyCallback(int64_t hdpa, void* pfncb, void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_DestroyCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdpa, pfncb, pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_controls_dpaEnumCallback(int64_t hdpa, void* pfncb, void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_EnumCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdpa, pfncb, pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_ui_controls_dpaGetPtr(int64_t hdpa, int64_t i) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_GetPtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, i);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdpa;
    (void)i;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaGetPtrIndex(int64_t hdpa, void* p) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_GetPtrIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, p);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)p;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_ui_controls_dpaGetSize(int64_t hdpa) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_GetSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdpa;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaGrow(int64_t pdpa, int32_t cp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Grow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdpa, cp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdpa;
    (void)cp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaInsertPtr(int64_t hdpa, int32_t i, void* p) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_InsertPtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, i, p);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)i;
    (void)p;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaLoadStream(void* phdpa, void* pfn, void* pstream, void* pvinstdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_LoadStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phdpa, pfn, pstream, pvinstdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaMerge(int64_t hdpadest, int64_t hdpasrc, uint32_t dwflags, void* pfncompare, void* pfnmerge, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Merge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpadest, hdpasrc, dwflags, pfncompare, pfnmerge, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpadest;
    (void)hdpasrc;
    (void)dwflags;
    (void)pfncompare;
    (void)pfnmerge;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaSaveStream(int64_t hdpa, void* pfn, void* pstream, void* pvinstdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_SaveStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, pfn, pstream, pvinstdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaSearch(int64_t hdpa, void* pfind, int32_t istart, void* pfncompare, int64_t lparam, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Search");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, pfind, istart, pfncompare, lparam, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)pfind;
    (void)istart;
    (void)pfncompare;
    (void)lparam;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaSetPtr(int64_t hdpa, int32_t i, void* p) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_SetPtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, i, p);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)i;
    (void)p;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dpaSort(int64_t hdpa, void* pfncompare, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Sort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdpa, pfncompare, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdpa;
    (void)pfncompare;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_dsaClone(int64_t hdsa) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_dsaCreate(int32_t cbitem, int32_t citemgrow) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbitem, citemgrow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cbitem;
    (void)citemgrow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaDeleteAllItems(int64_t hdsa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_DeleteAllItems");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaDeleteItem(int64_t hdsa, int32_t i) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_DeleteItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa, i);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    (void)i;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaDestroy(int64_t hdsa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_dsaDestroyCallback(int64_t hdsa, void* pfncb, void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_DestroyCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdsa, pfncb, pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_controls_dsaEnumCallback(int64_t hdsa, void* pfncb, void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_EnumCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdsa, pfncb, pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaGetItem(int64_t hdsa, int32_t i, void* pitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_GetItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa, i, pitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_controls_dsaGetItemPtr(int64_t hdsa, int32_t i) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_GetItemPtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa, i);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdsa;
    (void)i;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_ui_controls_dsaGetSize(int64_t hdsa) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_GetSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdsa;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaInsertItem(int64_t hdsa, int32_t i, void* pitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_InsertItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa, i, pitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaSetItem(int64_t hdsa, int32_t i, void* pitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_SetItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdsa, i, pitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dsaSort(int64_t pdsa, void* pfncompare, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Sort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdsa, pfncompare, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdsa;
    (void)pfncompare;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_destroyPropertySheetPage(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPropertySheetPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice(void* device) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroySyntheticPointerDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(device);
        return;
    }
    errno = ENOSYS;
#else
    (void)device;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirListA(void* hdlg, void* lppathspec, int32_t nidlistbox, int32_t nidstaticpath, uint32_t ufiletype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirListComboBoxA(void* hdlg, void* lppathspec, int32_t nidcombobox, int32_t nidstaticpath, uint32_t ufiletype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListComboBoxA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirListComboBoxW(void* hdlg, void* lppathspec, int32_t nidcombobox, int32_t nidstaticpath, uint32_t ufiletype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListComboBoxW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirListW(void* hdlg, void* lppathspec, int32_t nidlistbox, int32_t nidstaticpath, uint32_t ufiletype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA(void* hwnddlg, void* lpstring, int32_t cchout, int32_t idcombobox) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectComboBoxExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnddlg, lpstring, cchout, idcombobox);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW(void* hwnddlg, void* lpstring, int32_t cchout, int32_t idcombobox) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectComboBoxExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnddlg, lpstring, cchout, idcombobox);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirSelectExA(void* hwnddlg, void* lpstring, int32_t chcount, int32_t idlistbox) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnddlg, lpstring, chcount, idlistbox);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_dlgDirSelectExW(void* hwnddlg, void* lpstring, int32_t chcount, int32_t idlistbox) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnddlg, lpstring, chcount, idlistbox);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_drawInsert(void* handparent, void* hlb, int32_t nitem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawInsert");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handparent, hlb, nitem);
        return;
    }
    errno = ENOSYS;
#else
    (void)handparent;
    (void)hlb;
    (void)nitem;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawShadowText(void* hdc, void* psztext, uint32_t cch, void* prc, uint32_t dwflags, uint32_t crtext, uint32_t crshadow, int32_t ixoffset, int32_t iyoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawShadowText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psztext, cch, prc, dwflags, crtext, crshadow, ixoffset, iyoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psztext;
    (void)cch;
    (void)prc;
    (void)dwflags;
    (void)crtext;
    (void)crshadow;
    (void)ixoffset;
    (void)iyoffset;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_drawStatusTextA(void* hdc, void* lprc, void* psztext, uint32_t uflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStatusTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdc, lprc, psztext, uflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_controls_drawStatusTextW(void* hdc, void* lprc, void* psztext, uint32_t uflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStatusTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdc, lprc, psztext, uflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeBackground(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* prect, void* pcliprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeBackground");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, prect, pcliprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pcliprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeBackgroundEx(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* prect, void* poptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeBackgroundEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, prect, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeEdge(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* pdestrect, uint32_t uedge, uint32_t uflags, void* pcontentrect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeEdge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, pdestrect, uedge, uflags, pcontentrect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pdestrect;
    (void)uedge;
    (void)uflags;
    (void)pcontentrect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeIcon(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* prect, int64_t himl, int32_t iimageindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, prect, himl, iimageindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)himl;
    (void)iimageindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeParentBackground(void* hwnd, void* hdc, void* prc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeParentBackground");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdc, prc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)prc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx(void* hwnd, void* hdc, uint32_t dwflags, void* prc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeParentBackgroundEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdc, dwflags, prc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)dwflags;
    (void)prc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeText(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* psztext, int32_t cchtext, uint32_t dwtextflags, uint32_t dwtextflags2, void* prect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags, dwtextflags2, prect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchtext;
    (void)dwtextflags;
    (void)dwtextflags2;
    (void)prect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_drawThemeTextEx(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* psztext, int32_t cchtext, uint32_t dwtextflags, void* prect, void* poptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeTextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags, prect, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchtext;
    (void)dwtextflags;
    (void)prect;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_enableScrollBar(void* hwnd, uint32_t wsbflags, uint32_t warrows) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableScrollBar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wsbflags, warrows);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wsbflags;
    (void)warrows;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_enableThemeDialogTexture(void* hwnd, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableThemeDialogTexture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_enableTheming(int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableTheming");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_endBufferedAnimation(int64_t hbpanimation, int32_t fupdatetarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndBufferedAnimation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbpanimation, fupdatetarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbpanimation;
    (void)fupdatetarget;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_endBufferedPaint(int64_t hbufferedpaint, int32_t fupdatetarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndBufferedPaint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint, fupdatetarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbufferedpaint;
    (void)fupdatetarget;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_endPanningFeedback(void* hwnd, int32_t fanimateback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPanningFeedback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, fanimateback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)fanimateback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_evaluateProximityToPolygon(uint32_t numvertices, void* controlpolygon, void* phittestinginput, void* pproximityeval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateProximityToPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numvertices, controlpolygon, phittestinginput, pproximityeval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numvertices;
    (void)controlpolygon;
    (void)phittestinginput;
    (void)pproximityeval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_evaluateProximityToRect(void* controlboundingbox, void* phittestinginput, void* pproximityeval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateProximityToRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controlboundingbox, phittestinginput, pproximityeval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)controlboundingbox;
    (void)phittestinginput;
    (void)pproximityeval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbEnableScrollBar(void* param0, int32_t param1, uint32_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_EnableScrollBar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbGetScrollInfo(void* param0, int32_t code, void* param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbGetScrollPos(void* param0, int32_t code) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbGetScrollProp(void* param0, int32_t propindex, void* param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, propindex, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)propindex;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbGetScrollRange(void* param0, int32_t code, void* param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbSetScrollInfo(void* param0, int32_t code, void* psi, int32_t fredraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code, psi, fredraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    (void)psi;
    (void)fredraw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbSetScrollPos(void* param0, int32_t code, int32_t pos, int32_t fredraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code, pos, fredraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    (void)pos;
    (void)fredraw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbSetScrollProp(void* param0, uint32_t arg_1_index, int64_t newvalue, int32_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollProp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, arg_1_index, newvalue, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)arg_1_index;
    (void)newvalue;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbSetScrollRange(void* param0, int32_t code, int32_t min, int32_t max, int32_t fredraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code, min, max, fredraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    (void)min;
    (void)max;
    (void)fredraw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_flatSbShowScrollBar(void* param0, int32_t code, int32_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_ShowScrollBar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, code, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getBufferedPaintBits(int64_t hbufferedpaint, void* ppbbuffer, void* pcxrow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint, ppbbuffer, pcxrow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbufferedpaint;
    (void)ppbbuffer;
    (void)pcxrow;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_controls_getBufferedPaintDC(int64_t hbufferedpaint) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hbufferedpaint;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC(int64_t hbufferedpaint) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintTargetDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hbufferedpaint;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect(int64_t hbufferedpaint, void* prc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintTargetRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbufferedpaint, prc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getComboBoxInfo(void* hwndcombo, void* pcbi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComboBoxInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndcombo, pcbi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndcombo;
    (void)pcbi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getCurrentThemeName(void* pszthemefilename, int32_t cchmaxnamechars, void* pszcolorbuff, int32_t cchmaxcolorchars, void* pszsizebuff, int32_t cchmaxsizechars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThemeName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszthemefilename, cchmaxnamechars, pszcolorbuff, cchmaxcolorchars, pszsizebuff, cchmaxsizechars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszthemefilename;
    (void)cchmaxnamechars;
    (void)pszcolorbuff;
    (void)cchmaxcolorchars;
    (void)pszsizebuff;
    (void)cchmaxsizechars;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_getEffectiveClientRect(void* hwnd, void* lprc, void* lpinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveClientRect");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwnd, lprc, lpinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwnd;
    (void)lprc;
    (void)lpinfo;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_ui_controls_getListBoxInfo(void* hwnd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetListBoxInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_controls_getMUILanguage(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMUILanguage");
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

int32_t windowssys_windows_win32_ui_controls_getThemeAnimationProperty(int64_t htheme, int32_t istoryboardid, int32_t itargetid, int32_t eproperty, void* pvproperty, uint32_t cbsize, void* pcbsizeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeAnimationProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, istoryboardid, itargetid, eproperty, pvproperty, cbsize, pcbsizeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)eproperty;
    (void)pvproperty;
    (void)cbsize;
    (void)pcbsizeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeAnimationTransform(int64_t htheme, int32_t istoryboardid, int32_t itargetid, uint32_t dwtransformindex, void* ptransform, uint32_t cbsize, void* pcbsizeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeAnimationTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, istoryboardid, itargetid, dwtransformindex, ptransform, cbsize, pcbsizeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)dwtransformindex;
    (void)ptransform;
    (void)cbsize;
    (void)pcbsizeout;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_controls_getThemeAppProperties(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeAppProperties");
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

int32_t windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* pboundingrect, void* pcontentrect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBackgroundContentRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, pboundingrect, pcontentrect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pboundingrect;
    (void)pcontentrect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeBackgroundExtent(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* pcontentrect, void* pextentrect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBackgroundExtent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, pcontentrect, pextentrect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pcontentrect;
    (void)pextentrect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeBackgroundRegion(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* prect, void* pregion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBackgroundRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, prect, pregion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pregion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeBitmap(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, uint32_t dwflags, void* phbitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, dwflags, phbitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)dwflags;
    (void)phbitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeBool(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pfval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pfval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeColor(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pcolor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pcolor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pcolor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeDocumentationProperty(void* pszthemename, void* pszpropertyname, void* pszvaluebuff, int32_t cchmaxvalchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeDocumentationProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszthemename, pszpropertyname, pszvaluebuff, cchmaxvalchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszthemename;
    (void)pszpropertyname;
    (void)pszvaluebuff;
    (void)cchmaxvalchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeEnumValue(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pival) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeEnumValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pival);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeFilename(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pszthemefilename, int32_t cchmaxbuffchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeFilename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pszthemefilename, cchmaxbuffchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszthemefilename;
    (void)cchmaxbuffchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeFont(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pfont) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, pfont);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfont;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeInt(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pival) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pival);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeIntList(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pintlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeIntList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pintlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pintlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeMargins(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, int32_t ipropid, void* prc, void* pmargins) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeMargins");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, prc, pmargins);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prc;
    (void)pmargins;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeMetric(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pival) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeMetric");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, pival);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemePartSize(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* prc, int32_t esize, void* psz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemePartSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, prc, esize, psz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prc;
    (void)esize;
    (void)psz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemePosition(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* ppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemePosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, ppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemePropertyOrigin(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* porigin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemePropertyOrigin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, porigin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)porigin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeRect(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* prect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, prect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeStream(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* ppvstream, void* pcbstream, void* hinst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, ppvstream, pcbstream, hinst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppvstream;
    (void)pcbstream;
    (void)hinst;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeString(int64_t htheme, int32_t ipartid, int32_t istateid, int32_t ipropid, void* pszbuff, int32_t cchmaxbuffchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid, ipropid, pszbuff, cchmaxbuffchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszbuff;
    (void)cchmaxbuffchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeSysBool(int64_t htheme, int32_t iboolid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, iboolid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)iboolid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_controls_getThemeSysColor(int64_t htheme, int32_t icolorid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, icolorid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htheme;
    (void)icolorid;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_controls_getThemeSysColorBrush(int64_t htheme, int32_t icolorid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysColorBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, icolorid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)htheme;
    (void)icolorid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeSysFont(int64_t htheme, int32_t ifontid, void* plf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ifontid, plf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ifontid;
    (void)plf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeSysInt(int64_t htheme, int32_t iintid, void* pivalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, iintid, pivalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)iintid;
    (void)pivalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeSysSize(int64_t htheme, int32_t isizeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, isizeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)isizeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeSysString(int64_t htheme, int32_t istringid, void* pszstringbuff, int32_t cchmaxstringchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, istringid, pszstringbuff, cchmaxstringchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)istringid;
    (void)pszstringbuff;
    (void)cchmaxstringchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeTextExtent(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* psztext, int32_t cchcharcount, uint32_t dwtextflags, void* pboundingrect, void* pextentrect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTextExtent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchcharcount, dwtextflags, pboundingrect, pextentrect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchcharcount;
    (void)dwtextflags;
    (void)pboundingrect;
    (void)pextentrect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeTextMetrics(int64_t htheme, void* hdc, int32_t ipartid, int32_t istateid, void* ptm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTextMetrics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, hdc, ipartid, istateid, ptm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ptm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeTimingFunction(int64_t htheme, int32_t itimingfunctionid, void* ptimingfunction, uint32_t cbsize, void* pcbsizeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTimingFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, itimingfunctionid, ptimingfunction, cbsize, pcbsizeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)itimingfunctionid;
    (void)ptimingfunction;
    (void)cbsize;
    (void)pcbsizeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getThemeTransitionDuration(int64_t htheme, int32_t ipartid, int32_t istateidfrom, int32_t istateidto, int32_t ipropid, void* pdwduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTransitionDuration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateidfrom;
    (void)istateidto;
    (void)ipropid;
    (void)pdwduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_getWindowFeedbackSetting(void* hwnd, int32_t feedback, uint32_t dwflags, void* psize, void* config) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowFeedbackSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, feedback, dwflags, psize, config);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)psize;
    (void)config;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_getWindowTheme(void* hwnd) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTheme");
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

int32_t windowssys_windows_win32_ui_controls_himagelistQueryInterface(int64_t himl, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HIMAGELIST_QueryInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListAdd(int64_t himl, void* hbmimage, void* hbmmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Add");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, hbmimage, hbmmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)hbmimage;
    (void)hbmmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListAddMasked(int64_t himl, void* hbmimage, uint32_t crmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_AddMasked");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, hbmimage, crmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)hbmimage;
    (void)crmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListBeginDrag(int64_t himltrack, int32_t itrack, int32_t dxhotspot, int32_t dyhotspot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_BeginDrag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himltrack, itrack, dxhotspot, dyhotspot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himltrack;
    (void)itrack;
    (void)dxhotspot;
    (void)dyhotspot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListCoCreateInstance(void* rclsid, void* punkouter, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_CoCreateInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, punkouter, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)punkouter;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListCopy(int64_t himldst, int32_t idst, int64_t himlsrc, int32_t isrc, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Copy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himldst, idst, himlsrc, isrc, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himldst;
    (void)idst;
    (void)himlsrc;
    (void)isrc;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListCreate(int32_t cx, int32_t cy, uint32_t flags, int32_t cinitial, int32_t cgrow) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cx, cy, flags, cinitial, cgrow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cx;
    (void)cy;
    (void)flags;
    (void)cinitial;
    (void)cgrow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDestroy(int64_t himl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDragEnter(void* hwndlock, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragEnter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndlock, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndlock;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDragLeave(void* hwndlock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragLeave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndlock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndlock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDragMove(int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragMove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDragShowNolock(int32_t fshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragShowNolock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDraw(int64_t himl, int32_t i, void* hdcdst, int32_t x, int32_t y, uint32_t fstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Draw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i, hdcdst, x, y, fstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)fstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDrawEx(int64_t himl, int32_t i, void* hdcdst, int32_t x, int32_t y, int32_t dx, int32_t dy, uint32_t rgbbk, uint32_t rgbfg, uint32_t fstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DrawEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i, hdcdst, x, y, dx, dy, rgbbk, rgbfg, fstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)dx;
    (void)dy;
    (void)rgbbk;
    (void)rgbfg;
    (void)fstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListDrawIndirect(void* pimldp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DrawIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimldp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pimldp;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListDuplicate(int64_t himl) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Duplicate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_imageListEndDrag(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_EndDrag");
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

uint32_t windowssys_windows_win32_ui_controls_imageListGetBkColor(int64_t himl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetBkColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)himl;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListGetDragImage(void* ppt, void* ppthotspot) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetDragImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppt, ppthotspot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppt;
    (void)ppthotspot;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_controls_imageListGetIcon(int64_t himl, int32_t i, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)himl;
    (void)i;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListGetIconSize(int64_t himl, void* cx, void* cy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetIconSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, cx, cy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListGetImageCount(int64_t himl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetImageCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListGetImageInfo(int64_t himl, int32_t i, void* pimageinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetImageInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i, pimageinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)i;
    (void)pimageinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListLoadImageA(void* hi, void* lpbmp, int32_t cx, int32_t cgrow, uint32_t crmask, uint32_t utype, uint32_t uflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_LoadImageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hi, lpbmp, cx, cgrow, crmask, utype, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListLoadImageW(void* hi, void* lpbmp, int32_t cx, int32_t cgrow, uint32_t crmask, uint32_t utype, uint32_t uflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_LoadImageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hi, lpbmp, cx, cgrow, crmask, utype, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListMerge(int64_t himl1, int32_t i1, int64_t himl2, int32_t i2, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t, int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Merge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl1, i1, himl2, i2, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl1;
    (void)i1;
    (void)himl2;
    (void)i2;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_imageListRead(void* pstm) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Read");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListReadEx(uint32_t dwflags, void* pstm, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_ReadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pstm, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pstm;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListRemove(int64_t himl, int32_t i) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Remove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)i;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListReplace(int64_t himl, int32_t i, void* hbmimage, void* hbmmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Replace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i, hbmimage, hbmmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)i;
    (void)hbmimage;
    (void)hbmmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListReplaceIcon(int64_t himl, int32_t i, void* hicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_ReplaceIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, i, hicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)i;
    (void)hicon;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_controls_imageListSetBkColor(int64_t himl, uint32_t clrbk) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetBkColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, clrbk);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)himl;
    (void)clrbk;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListSetDragCursorImage(int64_t himldrag, int32_t idrag, int32_t dxhotspot, int32_t dyhotspot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetDragCursorImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himldrag, idrag, dxhotspot, dyhotspot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himldrag;
    (void)idrag;
    (void)dxhotspot;
    (void)dyhotspot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListSetIconSize(int64_t himl, int32_t cx, int32_t cy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetIconSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, cx, cy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListSetImageCount(int64_t himl, uint32_t unewcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetImageCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, unewcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)unewcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListSetOverlayImage(int64_t himl, int32_t iimage, int32_t ioverlay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetOverlayImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, iimage, ioverlay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)iimage;
    (void)ioverlay;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListWrite(int64_t himl, void* pstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Write");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, pstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)pstm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_imageListWriteEx(int64_t himl, uint32_t dwflags, void* pstm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_WriteEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himl, dwflags, pstm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himl;
    (void)dwflags;
    (void)pstm;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_initCommonControls(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitCommonControls");
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

int32_t windowssys_windows_win32_ui_controls_initCommonControlsEx(void* picce) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitCommonControlsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(picce);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)picce;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_initMUILanguage(uint16_t uilang) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitMUILanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uilang);
        return;
    }
    errno = ENOSYS;
#else
    (void)uilang;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_controls_initializeFlatSB(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeFlatSB");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_isAppThemed(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAppThemed");
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

int32_t windowssys_windows_win32_ui_controls_isCharLowerW(uint16_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharLowerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_isCompositionActive(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCompositionActive");
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

uint32_t windowssys_windows_win32_ui_controls_isDlgButtonChecked(void* hdlg, int32_t nidbutton) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDlgButtonChecked");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, nidbutton);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdlg;
    (void)nidbutton;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_controls_isThemeActive(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemeActive");
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

int32_t windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent(int64_t htheme, int32_t ipartid, int32_t istateid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemeBackgroundPartiallyTransparent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemeDialogTextureEnabled");
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

int32_t windowssys_windows_win32_ui_controls_isThemePartDefined(int64_t htheme, int32_t ipartid, int32_t istateid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemePartDefined");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htheme, ipartid, istateid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_loadIconMetric(void* hinst, void* pszname, int32_t lims, void* phico) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconMetric");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, pszname, lims, phico);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinst;
    (void)pszname;
    (void)lims;
    (void)phico;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_loadIconWithScaleDown(void* hinst, void* pszname, int32_t cx, int32_t cy, void* phico) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconWithScaleDown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, pszname, cx, cy, phico);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinst;
    (void)pszname;
    (void)cx;
    (void)cy;
    (void)phico;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_makeDragList(void* hlb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeDragList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlb;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_menuHelp(uint32_t umsg, uint64_t wparam, int64_t lparam, void* hmainmenu, void* hinst, void* hwndstatus, void* lpwids) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MenuHelp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(umsg, wparam, lparam, hmainmenu, hinst, hwndstatus, lpwids);
        return;
    }
    errno = ENOSYS;
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    (void)hmainmenu;
    (void)hinst;
    (void)hwndstatus;
    (void)lpwids;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_ui_controls_openThemeData(void* hwnd, void* pszclasslist) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThemeData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszclasslist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_openThemeDataEx(void* hwnd, void* pszclasslist, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThemeDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszclasslist, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation(void* phittestinginput, void* pproximityeval) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackTouchHitTestingProximityEvaluation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phittestinginput, pproximityeval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phittestinginput;
    (void)pproximityeval;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_propertySheetA(void* param0) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertySheetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_controls_propertySheetW(void* param0) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertySheetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications(void* window, int32_t notifyrange) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPointerDeviceNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(window, notifyrange);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)window;
    (void)notifyrange;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow(void* hwnd, uint32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTouchHitTestingWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_setScrollInfo(void* hwnd, int32_t nbar, void* lpsi, int32_t redraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetScrollInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nbar, lpsi, redraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpsi;
    (void)redraw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_setScrollPos(void* hwnd, int32_t nbar, int32_t npos, int32_t bredraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetScrollPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nbar, npos, bredraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)npos;
    (void)bredraw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_setScrollRange(void* hwnd, int32_t nbar, int32_t nminpos, int32_t nmaxpos, int32_t bredraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetScrollRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nbar, nminpos, nmaxpos, bredraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)nminpos;
    (void)nmaxpos;
    (void)bredraw;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_controls_setThemeAppProperties(uint32_t dwflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThemeAppProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwflags;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_controls_setWindowFeedbackSetting(void* hwnd, int32_t feedback, uint32_t dwflags, uint32_t size, void* configuration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowFeedbackSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, feedback, dwflags, size, configuration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)size;
    (void)configuration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_setWindowTheme(void* hwnd, void* pszsubappname, void* pszsubidlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowTheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszsubappname, pszsubidlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszsubappname;
    (void)pszsubidlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_setWindowThemeAttribute(void* hwnd, int32_t eattribute, void* pvattribute, uint32_t cbattribute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowThemeAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, eattribute, pvattribute, cbattribute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)eattribute;
    (void)pvattribute;
    (void)cbattribute;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_showHideMenuCtl(void* hwnd, uint64_t uflags, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowHideMenuCtl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, uflags, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)uflags;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_showScrollBar(void* hwnd, int32_t wbar, int32_t bshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowScrollBar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wbar, bshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wbar;
    (void)bshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_strSetPtrW(void* ppsz, void* psz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Str_SetPtrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsz, psz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsz;
    (void)psz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_taskDialog(void* hwndowner, void* hinstance, void* pszwindowtitle, void* pszmaininstruction, void* pszcontent, int32_t dwcommonbuttons, void* pszicon, void* pnbutton) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TaskDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, hinstance, pszwindowtitle, pszmaininstruction, pszcontent, dwcommonbuttons, pszicon, pnbutton);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)hinstance;
    (void)pszwindowtitle;
    (void)pszmaininstruction;
    (void)pszcontent;
    (void)dwcommonbuttons;
    (void)pszicon;
    (void)pnbutton;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_taskDialogIndirect(void* ptaskconfig, void* pnbutton, void* pnradiobutton, void* pfverificationflagchecked) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TaskDialogIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptaskconfig, pnbutton, pnradiobutton, pfverificationflagchecked);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptaskconfig;
    (void)pnbutton;
    (void)pnradiobutton;
    (void)pfverificationflagchecked;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_uninitializeFlatSB(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninitializeFlatSB");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_controls_updatePanningFeedback(void* hwnd, int32_t ltotaloverpanoffsetx, int32_t ltotaloverpanoffsety, int32_t fininertia) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePanningFeedback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ltotaloverpanoffsetx;
    (void)ltotaloverpanoffsety;
    (void)fininertia;
    errno = ENOSYS;
    return -1;
#endif
}

